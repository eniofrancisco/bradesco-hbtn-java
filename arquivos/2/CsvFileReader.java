import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String linha;
            boolean primeiraLinha = true;

            while ((linha = reader.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue; // ignora linha em branco
                }

                String[] dados = linha.split(",");

                if (primeiraLinha) {
                    System.out.println("Funcionario: " + dados[0]);
                    System.out.println("Idade: " + dados[1]);
                    System.out.println("Departamento: " + dados[2]);
                    System.out.println("Salarial: " + dados[3]);
                    System.out.println("------------------------");
                    primeiraLinha = false;
                    continue;
                }

                System.out.println("Funcionario: " + dados[0]);
                System.out.println("Idade: " + dados[1]);
                System.out.println("Departamento: " + dados[2]);
                System.out.println("Salarial: " + dados[3]);
                System.out.println("------------------------");
            }

            reader.close();
            System.out.println("Leitura do arquivo concluida.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
