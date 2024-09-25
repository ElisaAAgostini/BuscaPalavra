import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Main extends LeitorArquivos {
  public static void main(String[] args) {
        char letras[][] = new char[4][3];
        letras[0][0] = 'e';
        letras[0][1] = 'l';
        letras[0][2] = 'i';
        letras[1][0] = 'j';
        letras[1][1] = 'e';
        letras[1][2] = 'p';
        letras[2][0] = 'a';
        letras[2][1] = 'f';
        letras[2][2] = 'e';
        letras[3][0] = 'o';
        letras[3][1] = 'n';
        letras[3][2] = 't';

        String caminhoArquivo = "./br-sem-acentos.txt";
        String palavraDigitada; 

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        palavraDigitada = leitor.nextLine();

        leitor.close();

        buscaPalavra(caminhoArquivo, palavraDigitada);
        try{
        Scanner leitor2 = new Scanner(caminhoArquivo);
        List<String> brsemacentos = new ArrayList<>();
        while (leitor2.hasNext()) {
            brsemacentos.add(leitor.next());
        }
        leitor2.close();

        if (brsemacentos.stream().filter(palavra -> palavra.startsWith(palavraDigitada)).findFirst().isPresent()) {
            System.out.println("Achou a palavra digitada" + palavraDigitada);
        }else {
            System.out.println("Não achou a palavra digitada");
        }
    }catch (Exception e) {
        System.out.println("Não foi possível ler o arquivo");
        System.out.println(e.getMessage());
    }
    }
  }