package br.com.i9ti.view;

import java.util.Scanner;

public class Programa{

  public static void main(String[] args) {
      
    exibirMenu();
  }

  public static void exibirMenu(){

    Boolean sair = false;
    do {
      Cabecalho();
      System.out.println("         MENU DE OPÇÕES         ");
      System.out.println("\n");   
      System.out.println("       1. CADASTRAR ALUNO       "); 
      System.out.println("       2. CONSULTAR ALUNOS      ");
      System.out.println("       3. CADASTRAR PROFESSOR   ");    
      System.out.println("       4. CONSULTAR PROFESSORES ");   
      System.out.println("       5. SAIR DO SISTEMA       ");   
      System.out.println("\n");   
      System.out.println("    Digite a opcao desejada:    "); 
      
      Scanner leia = new Scanner(System.in);
      int opcao = leia.nextInt();
  
      switch(opcao){
        case 1:
          TelaCadastroDeAluno();
          break;
        case 2:
          TelaConsultaAlunos();
          break;
        case 3:
          Tela("CADASTRO DE PROFESSOR");
          break;  
        case 4:
          Tela("LISTA DE PROFESSORES");
          break;                  
        default:
          sair = true;
          System.out.println("SAINDO DO SISTEMA...");
          break;
      }
    } while (sair == false);
 
  }

  public static void TelaCadastroDeAluno(){
    Cabecalho(); 
    System.out.println("         CADASTRO DE ALUNO      ");
    System.out.println("\n"); 


    try {
       // tratamento de exceções
      int[] nota = new int[4];
      nota[0] = 7;
      nota[1] = 5;
      nota[2] = 3;
      nota[3] = 10;
      //nota[4] = 8;
      for(int i=0; i< nota.length; i++){
        System.out.println(nota[i]/0);
      }
    } catch (Exception e) {
      System.out.println("Aconteceu um erro. " + e.getMessage());
    }
   




  }
  
  public static void TelaConsultaAlunos(){
    Cabecalho();
    System.out.println("        CONSULTAR ALUNOS        ");
    System.out.println("\n");       
  }

  public static void Tela(String nome){
    Cabecalho(); 
    System.out.println("        "+ nome +"        ");
    System.out.println("\n");       
  }

  public static void Cabecalho() {
    System.out.println("--------------------------------");
    System.out.println("    S I S T E M A   I F S       ");
    System.out.println("--------------------------------");    
  }

  

}