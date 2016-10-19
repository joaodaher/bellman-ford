import bellmanford.CicloNegativo;
import bellmanford.BellmanFord;
import entradaSaida.Entrada;
import grafo.Graph;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roberto
 */
public class MainTeste {

    public static void main(String args[]){
        try {
            Entrada in = new Entrada("./in.txt");
            Graph g = in.buildGraph();
//            g.imprimir();
            BellmanFord bmf = new BellmanFord(g, 1);
            ArrayList<CicloNegativo> arestas = bmf.bellmanFord();
//        for(Aresta a : arestas){
//            System.out.println("Ciclo negativo em: V: " + a.v + " -> W: " + a.w + " Peso: " + bmf.getDistancia()[a.v]);
//        }
            Integer[] pais = bmf.getPais();
            float[] dist = bmf.getDistancia();
            Graph grafo = bmf.getShortestWay();
            System.out.println("Origem " + bmf.origem);
            grafo.imprimir();

            System.out.println();
            Float[][] saida = grafo.geraSaida();
            System.out.println();
            String message = "";
            for(int i=0; i< saida.length; i++){
                int v = i + 1;
                message = message + v + ": ";
                for(int j = 0; j < saida.length; j++){
                    if(saida[i][j] != null){
                        int w = j + 1;
                        message = message +  " (Vetice: " + w + " Peso: " + saida[i][j] + ") ";
                    }
                }
                message = message + "\n";
            }
            System.out.println(message);
//            System.out.println(arestas.size());
//            if(arestas.size() != 0){
//                for (int j = 0; j < pais.length; j++) {
//                    System.out.print(j + ":");
//                    for (int i = 0; i < pais.length; i++) {
//                        boolean ja = false;
//                        for (Aresta aresta : arestas) {
//                            if (pais[i] != null && pais[i] == j && !ja) {
//                                System.out.print("-->(Vertice: " + i + " Distancia: " + dist[i] + " )");
//                                ja = true;
//                            } else if (aresta.getV() == i && aresta.getW() == j) {
//                                System.out.print("-->(Ciclo negativo < " + aresta.getV() + " --> " + aresta.getW() + " > Distancia: " + dist[j] + ") ");
//                            }
//                        }
//                    }
//                    System.out.println();
//                }
//            }else{
//                for (int j = 0; j < pais.length; j++) {
//                    System.out.print(j + ":");
//                    for (int i = 0; i < pais.length; i++)
//                        if (pais[i] != null && pais[i] == j && dist[i] < 10000)
//                            System.out.print("-->(Vertice: " + i + " Distancia: " + dist[i] + " )");
//
//                    System.out.println();
//                }
//            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainTeste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainTeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
