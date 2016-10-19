package lista;

/**
 * Implementa um no da lista de adjacencia de um grafo
 * @author Arkhan
 */
public class NodoList {
    /**
     * Vertice destino
     */
    public int v;
    /**
     * Peso da aresta
     */
    public float peso;
    /**
     * Proximo no da lista
     */
    NodoList prox;

    /**
     * Construtor da classe
     * @param v
     * @param peso
     * @param proximo
     */
    public NodoList(int v, float peso, NodoList proximo){
        this.v = v;
        this.peso = peso;
        this.prox = proximo;
    }
}
