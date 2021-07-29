package br.edu.ifs.polimorfismo;

public class Canino extends Animal{
  
  public Canino(){
    super();
  }

  // exemplo de sobreposicao
  public void vaguear(){
    System.out.println("canino vagueando...");
  }

  // exemplo de sobrecarga
  public void vaguear(String rosnado){
    System.out.println("canino vagueando e rosnando " + rosnado);
  }

}
