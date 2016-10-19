package lista;

import grafo.*;

/**
 * Implementa a lista de adjacentes de um grafo
 * @author Roberto
 */
public class ListaAdjacencia implements InterfaceListaAdjacencia{

    private int v; //Vertice do qual se obtem a lista de adjacencia
    private NodoList t; //No da lista de adjacencia do vertice

    /**
     * Construtor da classe
     * @param v Vertice
     */
    public ListaAdjacencia(int v){
        this.v = v;
        this.t = null;
    }

    /**
     * Obtem o primeiro elemento da lista
     * @param g GraphAbstract
     * @return int Vertice
     */
    public int getInicio(GraphAbstract g) {
        Graph grafo = (Graph) g;
        this.t = grafo.getAdj()[v];
        return this.t == null ? -1 : t.v;
    }

    /**
     * Retorna o primeiro no da lista
     * @param g GraphAbstract
     * @return NodoList
     */
    public NodoList getNodoInicio(GraphAbstract g) {
        Graph grafo = (Graph) g;
        this.t = grafo.getAdj()[v];
        return this.t;
    }

    /**
     * Retorna o proximo elemento da lista
     * @param g GraphAbstract
     * @return int Vertice
     */
    public int getProximo(GraphAbstract g) {
        if(t != null)
            t = t.prox;
        return this.t == null ? -1 : t.v;
    }

    /**
     * Retorna o proximo no da lista
     * @param g GraphAbstract
     * @return NodoList
     */
    public NodoList getNodoProximo(GraphAbstract g) {
        if(t != null)
            t = t.prox;
        return this.t;
    }

    /**
     * Verifica se a lista tem um proximo elemento
     * @param g
     * @return
     */
    public boolean hasProximo(GraphAbstract g) {
        return t == null;
    }
}
