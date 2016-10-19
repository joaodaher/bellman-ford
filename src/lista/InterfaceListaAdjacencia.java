package lista;

import grafo.*;

/**
 * Interface de uma lista de Ajacencia
 * @author Roberto
 */
public interface InterfaceListaAdjacencia {

    /**
     * Retorna o primeiro vertice da lista
     * @param g Grafo
     * @return
     */
    public int getInicio(GraphAbstract g);

    /**
     * Retorna o proximo elemento da lista
     * @param g Grafo
     * @return
     */
    public int getProximo(GraphAbstract g);

    /**
     * Verifica se tem um proximo elemento. Caso tenha retorna false caso
     * contrario true
     * @param g Grafo
     * @return
     */
    public boolean hasProximo(GraphAbstract g);
}
