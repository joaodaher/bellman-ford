package grafo;

import lista.InterfaceListaAdjacencia;

/**
 * Classe abstrata para implementacao de um grafo
 * @author Arkhan
 */
public abstract class GraphAbstract {
    /**
     * Numero de vertices
     */
    protected int numeroVertices;
    /**
     * Numero de arestas
     */
    protected int numeroArestas;
    /**
     * Indica se o grafo e direcionado ou nao
     */
    protected boolean direcionado;

    /**
     * Construtor da classe
     * @param numeroVertices
     * @param direcionado
     */
    public GraphAbstract(int numeroVertices, boolean direcionado){
        this.numeroVertices = numeroVertices;
        this.direcionado = direcionado;
        this.numeroArestas = 0;
    }

    /**
     * Retorna o numero de vertices do grafo
     * @return numeroVertices
     */
    public int getNumVertices(){
        return this.numeroVertices;
    }

    /**
     * Retorna o numero de arestas do grafo
     * @return numeroArestas
     */
    public int getNumArestas(){
        return this.numeroArestas;
    }

    /**
     * Configura o numero de Arestas
     * @param numArestas
     */
    public void setNumArestas(int numArestas){
        this.numeroArestas = numArestas;
    }

    /**
     * Configura se um grafo e direcionado ou nao
     * @return direcionado
     */
    public boolean isDirecionado(){
        return this.direcionado;
    }

    /**
     * Metodo abstrado para imprimir o grafo
     */
    public abstract void imprimir();

    /**
     * Metodo abstrato para gerar uma matriz de adjacencia utilizada
     * na saida para arquivo.
     * @return Float[][] Matriz de Adjacencia
     */
    public abstract Float[][] geraSaida();
    
    /**
     * Metodo abstrato para inserir arestas
     * @param a Aresta a ser inserida
     */
    public abstract void insereAresta(Aresta a);

    /**
     * Metodo abstrato para remover arestas
     * @param a Aresta a ser removida
     * @return Aresta Aresta removida
     */
    public abstract Aresta removeAresta(Aresta a);

    /**
     * Metodo abstrado para verificar a existencia de uma aresta
     * @param a Aresta que se deseja verificar a existencia
     * @return 
     */
    public abstract boolean existAresta(Aresta a);

    /**
     * Metodo abstrato que retorna a lista de adjacentes de um vertice
     * @param vertice Vertice que se deseja obter sua lista de adjacentes
     * @return
     */
    public abstract InterfaceListaAdjacencia getListaAdjacencia(int vertice);
}
