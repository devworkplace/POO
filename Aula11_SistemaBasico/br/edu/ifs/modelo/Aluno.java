package br.edu.ifs.modelo;

public class Aluno extends Pessoa {
  
  private int matricula;

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }
 
  public void cpf(){
   System.out.println("imprimindo cpf..."); 
  }

}
