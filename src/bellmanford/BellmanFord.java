package bellmanford;

import lista.ListaAdjacencia;
import lista.NodoList;
import grafo.*;
import java.util.ArrayList;

/**
 * Implementa o algoritmo de Bellman-Ford.
 * @author Roberto
 */
public class BellmanFord {

    private float[] distancia; // Vetor das distancias
    private Integer[] pai; // Vetor de predecessores
    public int origem;  //Vertice de origem
    private ArrayList<CicloNegativo> cicloNegativo = null; //Lista de ciclos com pesos negativos
    private GraphAbstract g; //Grafo sobre o qual sera aplicado o algoritmo

    /**
     * Construtor da classe
     * @param g Grafo a ser analizado pelo algoritmo
     * @param origem Vertice de origem
     */
    public BellmanFord(GraphAbstract g, int origem){
        this.g = g;
        this.origem = origem;
        this.distancia = new float[g.getNumVertices()];
        this.pai = new Integer[g.getNumVertices()];
        for(int i = 0; i < g.getNumVertices(); i++){
            this.distancia[i] = 10000;
            this.pai[i] = null;
        }
        this.distancia[origem] = 0;
        this.pai[origem] = null;
    }

    /**
     * Executa o relaxamento das arestas
     * @param v Vertice 1
     * @param w Vertice 2
     * @param peso Peso da aresta
     */
    private void relaxar(int v, int w, float peso){
        if(this.distancia[w] >  this.distancia[v] + peso){
            this.distancia[w] = this.distancia[v] + peso;
            this.pai[w] = v;
        }
    }

    /**
     * Executa o algoritmo de Bellman-Ford
     * @return CicloNegativo O conjundo de ciclos que possuem peso negativo
     */
    public ArrayList<CicloNegativo> bellmanFord(){
        Graph grafo = (Graph) g;
        this.cicloNegativo = new ArrayList<CicloNegativo>();
        for(int i = 0; i < g.getNumVertices(); i++)
            for(Aresta aresta : grafo.getArestas())
                this.relaxar(aresta.getV(), aresta.getW(), aresta.getPeso());
            
        for(Aresta aresta : grafo.getArestas()){
            if(this.distancia[aresta.getW()] > this.distancia[aresta.getV()] + aresta.getPeso()){
                CicloNegativo ciclo = new CicloNegativo(aresta.getV(), aresta.getW(), this.calculaPesoCiclo(aresta));
                if(!this.cicloNegativo.isEmpty()){
                    if(!this.contemCiclo(ciclo)){
                        this.cicloNegativo.add(ciclo);
                    }
                }else{
                    this.cicloNegativo.add(ciclo);
                }
            }
        }

        return this.cicloNegativo;
    }

    /**
     * Retorna o vetor de predecessores
     * @return Integer[]
     */
    public Integer[] getPais(){
        return this.pai;
    }

    /**
     * Retorna o vetor das distancias
     * @return float[]
     */
    public float[] getDistancia(){
        return this.distancia;
    }

    /**
     * Verifica se uma determinada aresta já está na lista dos ciclos negativos
     * @param a
     * @return boolean
     */
    private boolean contemCiclo(CicloNegativo ciclo){
        for(CicloNegativo cicloAdded : this.cicloNegativo){
            if((cicloAdded.getV() == ciclo.getV() && cicloAdded.getW() == ciclo.getW()) || (cicloAdded.getV() == ciclo.getW() && cicloAdded.getW() == ciclo.getV())){
                return true;
            }
        }
        return false;
    }
    /**
     * Retorna o grafo resultante da execucao do algoritmo de Bellman-Ford
     * @return Graph
     */
    public Graph getShortestWay(){
        Graph grafo = new Graph(this.g.getNumVertices(), true);
        Graph grafoOriginal = (Graph) g;
        for (int j = 0; j < this.pai.length; j++) {
            for (int i = 0; i < pai.length; i++){
                if (pai[i] != null && pai[i] == j){
                    Aresta aresta = grafoOriginal.getArestas().get(i);
                    grafo.insereAresta(new Aresta(j, i, distancia[i]));
                }
            }
        }
        return grafo;
    }

    /**
     * Calcula o peso de ciclo negativo achado pelo algoritmo
     * @param aresta Aresta que compoe o ciclo
     * @return float Peso do ciclo
     */
    private float calculaPesoCiclo(Aresta aresta) {
        ListaAdjacencia listaDeW = (ListaAdjacencia) g.getListaAdjacencia(aresta.getW());
        System.out.println(listaDeW);
        float pesoCiclo = 0;
        for(NodoList nodo = listaDeW.getNodoInicio(g); !listaDeW.hasProximo(g); nodo = listaDeW.getNodoProximo(g)){
            if(nodo.v == aresta.getV()){
                pesoCiclo = aresta.getPeso() + nodo.peso;
            }
        }
        return pesoCiclo;
    }
}
