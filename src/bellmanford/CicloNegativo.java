package bellmanford;

/**
 * Abstrai um objeto ciclo negatico composto por 2 vertices
 * @author Roberto
 */
public class CicloNegativo {

    /**
     * Vertice que compoe o ciclo
     */
    private int v;
    /**
     * Vertice que compoe o ciclo
     */
    private int w;
    /**
     * Peso do ciclo
     */
    private float pesoCiclo;

    /**rtice
     * Construtor da classe
     * @param v Vertice
     * @param w Vertice
     * @param pesoCiclo Peso do ciclo
     */
    public CicloNegativo(int v, int w, float pesoCiclo){
        this.v = v;
        this.w = w;
        this.pesoCiclo = pesoCiclo;
    }

    /**
     * Retona o vertice v
     * @return v Vertice v
     */
    public int getV() {
        return v;
    }

    /**
     * Configura o vertice v
     * @param v Vertice
     */
    public void setV(int v) {
        this.v = v;
    }

    /**
     * Retorna o vertice w
     * @return w Vertice
     */
    public int getW() {
        return w;
    }

    /**
     * Configura o vertice w
     * @param w Vertice
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * Retorna o peso do ciclo
     * @return pesoCiclo Peso do ciclo
     */
    public float getPesoCiclo() {
        return pesoCiclo;
    }

    /**
     * Configura o peso do ciclo
     * @param pesoCiclo Peso do ciclo
     */
    public void setPesoCiclo(float pesoCiclo) {
        this.pesoCiclo = pesoCiclo;
    }
}
