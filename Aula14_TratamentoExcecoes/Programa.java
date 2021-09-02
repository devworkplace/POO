import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Programa{

  public static void main(String[] param){

    // exceções genericas
    //Excecao1();
    //Excecao2();
    //Excecao3();
    // exceções específicas
    //Excecao4();
    Excecao5();
    
  }

  public static void Excecao1(){
    try {
      int[] vetor =  new int[5];
      vetor[0] = 1;
      vetor[1] = 2;
      vetor[2] = 3;
      vetor[3] = 4;
      vetor[4] = 5;
      vetor[5] = 6; // provocando erro
    } catch (Exception e) {
      // capturando a mensagem da exceção
      System.out.println(e.getMessage()); 
    }
  }

  public static void Excecao2(){
    try {
      int[] vetor =  new int[3];
      vetor[0] = 1;
      vetor[1] = 2;
      vetor[2] = 3;
      // provocando o erro
      float divzero = ( vetor[0] +  vetor[1] +  vetor[2] ) / 0;
    } catch (Exception e) {
      // capturando a mensagem da exceção
      System.out.println(e.getMessage()); 
    }
  }

  public static void Excecao3(){
    try {
      // entrada de usuario com texto
      Scanner leia = new Scanner(System.in);
      int opcao = leia.nextInt();

    } catch (Exception e) {
      // capturando a mensagem da exceção
      System.out.println(e.getMessage()); 
    }
  }


  public static void Excecao4(){
    try {
      
      // Programa

    } catch (ArrayIndexOutOfBoundsException aibe) {
      System.out.println(aibe.getMessage()); 
    } catch (ArithmeticException ae) {
      System.out.println(ae.getMessage()); 
    } catch (Exception e) {
      System.out.println(e.getMessage()); 
    }
  }

  public static void Excecao5(){

    String senha= "123456.";
    try {
      
      if ( !senha.equals("123456")) 
        throw new Exception("Senha incorreta.");
      
      System.out.println("Ok, bem-vindo.");

    } catch (Exception e) {
      System.out.println(e.getMessage()); 
    }
  }

}