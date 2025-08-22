
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensao .txt): ");
        String fileName = scanner.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            System.out.println("Digite linhas de texto. Para encerrar, digite sair.");
            while (true) {
                String linha = scanner.nextLine();
                if (linha.equalsIgnoreCase("sair")) {
                    break;
                }
                writer.write(linha);
                writer.newLine();
            }

            writer.close();
            System.out.println("Arquivo  + fileName +  criado e conteudo salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}

