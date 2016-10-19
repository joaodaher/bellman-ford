package entradaSaida;

import bellmanford.CicloNegativo;
import grafo.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Implementa metodos para gerar um arquvo de saida da forma
 * especificada pelo enunciado do trabalho
 * @author Joao Daher
 */
public class Saida {
    /**
     * Gera o arquivo de saida
     */
    PrintWriter writer;
    /**
     * Nome do arquivo de saida
     */
    String FileName;
    /**
     * Mensagem de saida
     */
    String message;

    /**
     * Construtor da classe
     * @param FileName Nome do arquivo de saida
     */
    public Saida(String FileName) {
        this.FileName = FileName;
    }


    /**
     * Cria o arquivo de saida
     * @param message String a ser gravada no arquivo
     * @return
     * @throws java.io.IOException
     */
    public boolean Write(int origem, Graph g) throws IOException{
        writer = new PrintWriter(new FileWriter(FileName)); //cria o arquivo de saida
        Float[][] saida = g.geraSaida();
        message = "";
        writer.println("Origem: " + ++origem);
        message = "Origem: " + origem + "\n";
        for(int i=0; i< saida.length; i++){
            int v = i + 1;
            if(v != origem){
                writer.print(v + ": ");
                message = message + v + ": ";
                for(int j = 0; j < saida.length; j++){
                    if(saida[j][i] != null){
                        int w = j + 1;
                        writer.print( " (Vertice: " + w + " Peso: " + saida[j][i] + ") ");
                        message = message +  " (Vertice: " + w + " Peso: " + saida[j][i] + ") ";
                    }
                }
            message = message + "\n";
            writer.println();
            }
        }
        writer.close();
        return true;
    }

    /**
     * Cria um arquivo de saida quando a execucao do algoritmo de Bellman-Ford
     * achar ciclos negativos no grafo
     * @param origem Vertice de origem
     * @param ciclosNegativos Lista de CicloNegativo
     * @return boolena True se gerou o arquivo com sucesso, false em caso contrario
     * @throws java.io.IOException
     */
    public boolean Write(int origem, ArrayList<CicloNegativo> ciclosNegativos) throws IOException {
        writer = new PrintWriter(new FileWriter(FileName)); //cria o arquivo de saida
        message = "";
        writer.println("Origem: " + origem);
        message = "Origem: " + origem + "\n";
        for(CicloNegativo ciclo : ciclosNegativos){
            writer.println("Ciclo de peso negativo: <" + ciclo.getV() + " , " +
                            ciclo.getW() + "> <Peso: " + ciclo.getPesoCiclo() + ">" );
            message = message + "Ciclo de peso negativo: <" + ciclo.getV() + " , " +
                            ciclo.getW() + "> <Peso: " + ciclo.getPesoCiclo() + ">\n";
        }
        writer.close();
        return true;
    }
    
    public String getMessage(){
        return message;
    }

}
