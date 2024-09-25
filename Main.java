import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    char[][] letras = new char[4][3];
    boolean[][] visitado = new boolean[4][3];
    int i = 0;
    //String palavraDigitada;

    //System.out.println(++i);
    //System.out.println(i);

    //Scanner leitor = new Scanner(System.in);
    //palavraDigitada = leitor.nextLine();


    //if(palavraDigitada == )

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

System.out.println(letras.length);
System.out.println(letras[0].length);    
    
    imprime(0,0,letras, visitado);
  }

  private static void imprime(int linha, int col, char[][] letras, boolean[][] visit) {
    if (linha > 0) {    
      //aqui imprime a letra na posição enviada
      if (col > 0) {
        System.out.print(letras[linha][col]);
        System.out.println(letras[linha-1][col-1]);
        if (!visit[linha-1][col-1]){
          visit[linha-1][col-1] = true;
          imprime(linha-1, col-1, letras, visit);
        }
      }
      System.out.print(letras[linha][col]);
      System.out.println(letras[linha-1][col]);
        //imprime(linha-1, col, letras);
        imprime(linha - 1, col, letras, visit);
      if (col+1 < letras[linha].length) {
        System.out.print(letras[linha][col]);
        System.out.println(letras[linha-1][col+1]);
        imprime(linha - 1, col + 1, letras, visit);
      }
    }
    if (col > 0) {
    System.out.print(letras[linha][col]);
    System.out.println(letras[linha][col-1]);
      imprime(linha, col - 1, letras, visit);
    }
     if (col + 1 < letras[linha].length) {
      System.out.print(letras[linha][col]);
      System.out.println(letras[linha][col+1]);
      imprime(linha, col + 1, letras, visit);
       
     }
    if (linha + 1 < letras.length){
    if (col > 0){
      System.out.print(letras[linha][col]);
    System.out.println(letras[linha+1][col-1]);
      imprime(linha + 1, col - 1, letras, visit);
    }
    System.out.print(letras[linha][col]);
    System.out.println(letras[linha + 1][col]);
      imprime(linha + 1, col, letras, visit);
    if (col + 1 < letras[linha].length) {
      System.out.print(letras[linha][col]);
      System.out.println(letras[linha+1][col+1]);
      imprime(linha + 1, col + 1, letras, visit);
    }
    }

}
  
  
  public static void listaArr(int[] arr) {
    for(int i = 0; i < arr.length; i++){
      System.out.println("["+i+"]"+arr[i]);
    }
  }
  public static void populate(int[] arr) {
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100);
    }
  }

  public static void buscar(int[] arr, int valorBuscar) {
    int count = 0;
    for (int i = 0; i< arr.length; i++){
      if (arr[i] == valorBuscar) {
        count++;
      }
    }
    System.out.println("O valor " + valorBuscar + " aparece " + count + " vezes");
  }
}
