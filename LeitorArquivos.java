import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class LeitorArquivos {


    public static void buscaPalavra(String caminhoArquivo, String palavraDigitada){
        try (BufferedReader buffReader = new BufferedReader(new FileReader(caminhoArquivo))) {
            boolean palavraEncontrada = false;
            int linhaArquivo = 0;
            String linha;

            // Lê cada linha do arquivo até o final
            while ((linha = buffReader.readLine()) != null) {
                linhaArquivo++;
                if (linha.contains(palavraDigitada)) {
                    System.out.println("Palavra encontrada no arquivo: " + linha + "\nNa linha " + linhaArquivo);
                    palavraEncontrada = true;
                }
            }

            if (!palavraEncontrada) {
                System.out.println("Palavra não encontrada no arquivo.");
            }
        } catch (IOException e) {
            // Tratamento de exceções de leitura
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
