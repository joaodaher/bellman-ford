package grafo;

/**
 * Implementa as arestas de um grafo
 * @author Roberto
 */
public class Aresta {
    /**
     * Vertice predecessor
     */
    private int v;
    /**
     * Vertice destino
     */
    private int w;
    /**
     * Peso da aresta
     */
    private float peso;
    
    /**
     * Construtor da classe
     * @param v Vertice precessor
     * @param w Vertice destino
     * @param peso Peso da aresta
     */
    public Aresta(int v, int w, float peso){
        this.v = v;
        this.w = w;
        this.peso = peso;
    }

    /**
     * Retorna o peso da aresta
     * @return peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Configura o peso da aresta
     * @param peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Retorna o vertice predecessor
     * @return v
     */
    public int getV() {
        return v;
    }

    /**
     * Configura o vertice predecessor
     * @param v
     */
    public void setV(int v) {
        this.v = v;
    }

    /**
     * Retorna o vertice destino
     * @return w
     */
    public int getW() {
        return w;
    }

    /**
     * Configura o vertice destino
     * @param w
     */
    public void setW(int w) {
        this.w = w;
    }

}
