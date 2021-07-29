package br.edu.ifs.polimorfismo;

public class Felino extends Animal {
  
  public Felino(){
    super();
  }

  // exemplo de sobreposicao
  public void vaguear(){
    System.out.println("felino vagueando...");
  }

  // exemplo de sobrecarga
  public void vaguear(String rosnado){
    System.out.println("felino vagueando e rosnando " + rosnado);
  }

}
