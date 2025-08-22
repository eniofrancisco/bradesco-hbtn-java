
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura

        // efetue a leitura do arquivo
        System.out.println("Conteudo do arquivo exemplo.txt:\n");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("\nLeitura do arquivo concluida.");
    }
}

