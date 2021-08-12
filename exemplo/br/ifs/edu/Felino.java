package br.ifs.edu;

public class Felino extends Animal {
  
  public Felino(){
    super();
  }

  public void vaguear(){
    System.out.println("Felino vagando...");
  }

  public void vaguear(String som){
    System.out.println("Felino vagando com som ..." + som);
  }

}
