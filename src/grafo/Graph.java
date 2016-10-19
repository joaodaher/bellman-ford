package grafo;

import lista.InterfaceListaAdjacencia;
import lista.NodoList;
import lista.ListaAdjacencia;
import java.util.ArrayList;

/**
 * Implementa um grafo com lista de adjacencia
 * @author Roberto
 */
public class Graph extends GraphAbstract {
    
    /**
     * Vetor que possui os nos do grafo
     */
    protected NodoList adj[]; 

    /**
     * Construtor da classe
     * @param numVertices 
     * @param direcionado
     */
    public Graph(int numVertices, boolean direcionado){
        super(numVertices, direcionado);
        adj = new NodoList[numVertices];
    }

    /**
     * Implementação do método abstrato da classe mae GraphAbstract
     * Insere uma aresta no grafo
     * @param a Aresta a ser inserida
     */
    @Override
    public void insereAresta(Aresta a) {
        int v = a.getV();
        int w = a.getW();
        adj[v] = new NodoList(w, a.getPeso(), adj[v]);

        if(!super.isDirecionado()){
            adj[w] = new NodoList(v, a.getPeso(), adj[w]);
        }

        super.setNumArestas(super.getNumArestas() + 1);
    }


    /**
     * Retorna todas as arestas do grafo
     * @return ArrayList<Aresta>
     */
    public ArrayList<Aresta> getArestas(){
        int e = 0;

        ArrayList<Aresta> arestas = new ArrayList<Aresta>(numeroArestas);

        for(int vertice = 0; vertice < getNumVertices(); vertice++){
            ListaAdjacencia lista = (ListaAdjacencia)getListaAdjacencia(vertice);

            for(NodoList nodo = lista.getNodoInicio(this); !lista.hasProximo(this); nodo = lista.getNodoProximo(this)){
                if(nodo.peso != 0){
                    arestas.add(new Aresta(vertice, nodo.v, nodo.peso));
                }if(isDirecionado() || vertice < nodo.v){
                    arestas.add(new Aresta(vertice, nodo.v, nodo.peso));
                }
            }
        }
        return arestas;
    }

    /**
     * Imprime o grafo em forma de listas de adjacencia
     */
    public void imprimir(){
        for(int s = 0; s < this.getNumVertices(); s++){
            System.out.print(s + ":");
            ListaAdjacencia A = (ListaAdjacencia) getListaAdjacencia(s);
            for(NodoList t = A.getNodoInicio(this); !A.hasProximo(this); t = A.getNodoProximo(this)){
                System.out.print(" ->( Vertice: "+t.v + " Peso: " + t.peso + " )");
            }
            System.out.println();
        }
    }

    /**
     * Cria uma matriz de adjacencia cujos valores associados são os pesos das arestas
     * Estes método e utilizado para criar um arquivo de saida
     * @return Float[][] Matriz de adjacencia
     */
    public Float[][] geraSaida(){
        Float[][] saida = new Float[this.getNumVertices()][this.getNumVertices()];
        for(int s = 0; s < this.getNumVertices(); s++){
            ListaAdjacencia A = (ListaAdjacencia) getListaAdjacencia(s);
            for(NodoList t = A.getNodoInicio(this); !A.hasProximo(this); t = A.getNodoProximo(this)){
                saida[s][t.v] = t.peso;
            }
        }
        for(int s = 0; s < this.getNumVertices(); s++){
            System.out.print(s + ":");
            ListaAdjacencia A = (ListaAdjacencia) getListaAdjacencia(s);
            for(NodoList t = A.getNodoInicio(this); !A.hasProximo(this); t = A.getNodoProximo(this)){
                System.out.print(" ->( Vertice: "+t.v + " Peso: " + t.peso + " )");
            }
            System.out.println();
        }
        return saida;
    }


    //Metodos abstratos herdados e nao implementados
    /**
     * Método herdado da classe GraphAbstract
     * Retorna a lista de adjacencia de um determinado grafo
     * @param vertice
     * @return InterfaceListaAdjacencia
     */
    @Override
    public InterfaceListaAdjacencia getListaAdjacencia(int vertice) {
        return new ListaAdjacencia(vertice);
    }

    /**
     * Metodo herdado da classe GraphAbstract
     * Este metodo nao foi implementado
     * @param a Aresta a ser removida
     */
    @Override
    public Aresta removeAresta(Aresta a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Metodo herdado da classe GraphAbstract
     * Este metodo nao foi implementado
     * @param a Aresta que se deseja verificar a existencia
     */
    @Override
    public boolean existAresta(Aresta a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retorna a lista dos nos do grafo
     * @return
     */
    public NodoList[] getAdj() {
        return adj;
    }
}
