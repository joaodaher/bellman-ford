
package entradaSaida;

import java.util.StringTokenizer;
import java.io.*;
import grafo.*;

/**
 * Implementa metodos para construir um grafo a
 * partir de um arquivo de entrada
 * @author Joao Daher
 */
public class Entrada{
    private BufferedReader reader; //Objeto que fara a leitura do arquivo
    private final String FileName; //Persiste o caminho do arquivo de entrada

    /**
     * Construtor da classe
     * @param FileName Caminho do arquivo de entrada
     */
    public Entrada(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Metodo privado que verifica a existencia do arquivo de entrada
     * Retorna um valor boleano true caso o arquivo seja passivel de edicao,
     * Retorna um valor boleano false caso o arquivo nao seja passivel de edicao
     * @return
     */
    private boolean checkFile(){
        File file = new File(FileName);
        return file.canRead();
    }

    /**
     * Constroi uma matriz a partir do arquivo de entrada
     * retorna uma matriz de pontos flutuantes contendo o peso das arestas
     * entre os vertices do grafo que encontra-se no arquivo de entrada
     * @return
     */
    public float[][] buildMatrix(){
        if(!checkFile()){
            return null;
        }
        try{

            reader = new BufferedReader(new FileReader(FileName)); //abrir o arquivo

            int size = Integer.parseInt((reader.readLine()).trim()); //ler a primeira linha, contem numero de vertices

            float matrix[][] = new float[size][size]; // instancializa a matrix do tamanho correto

            StringTokenizer message;
            String aux;
            int line = -1;
            int collum = -1;

            while(reader.ready()){
                message = new StringTokenizer(reader.readLine()); //transforma a linha em tokens
                message.nextToken(); //descarta o indicador de vertice
                
                line++; //prepara a proxima linha
                while(message.hasMoreTokens()){
                    collum++; //prepara a proxima coluna

                    aux = message.nextToken();
                    matrix[line][collum] = Float.parseFloat(aux); //insere o elemento
                }
                collum = -1; //renova a coluna para comecar uma proxima linha
            }

            reader.close(); //fechar o arquivo

            return matrix;
        }
        catch(FileNotFoundException e){
            System.out.println("Arquivo não localizado.");
            return null;
        }
        catch(IOException e){
            System.out.println("Erro ao ler o arquivo.");
            return null;
        }
        catch(NumberFormatException e){
            System.out.println("Erro ao converter um numero.");
            return null;
        }
    }

    /**
     * Constroi um grafo com listas de adjacencia
     * @return
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     * @throws java.lang.NumberFormatException
     * @throws java.lang.ArrayIndexOutOfBoundsException
     */
    public Graph buildGraph() throws FileNotFoundException, IOException, NumberFormatException, ArrayIndexOutOfBoundsException{
        if(!checkFile()){
            return null;
        }
        reader = new BufferedReader(new FileReader(FileName)); //abrir o arquivo

        int size = Integer.parseInt((reader.readLine()).trim()); //ler a primeira linha, contem numero de vertices

        Graph g = new Graph(size, true);

        StringTokenizer message;
        int line = -1;
        int collum = -1;

        while(reader.ready()){
            message = new StringTokenizer(reader.readLine()); //transforma a linha em tokens
            message.nextToken(); //descarta o indicador de vertice

            line++; //prepara a proxima linha
            while(message.hasMoreTokens()){
                collum++; //prepara a proxima coluna
                float peso = Float.parseFloat(message.nextToken());
                if(peso != 0)
                    g.insereAresta(new Aresta(line, collum, peso)); //insere o elemento
            }
            collum = -1; //renova a coluna para comecar uma proxima linha
        }

        reader.close(); //fechar o arquivo
        return g;
    }
    
}
