package br.edu.ifs.polimorfismo;

public class Gato extends Felino {

  public void fazerBarulho(){
    System.out.println("Gato fazendo barulho...");
  }

  public void fazerBarulho(String miando){
    System.out.println("Gato fazendo barulho..." + miando);
  }

  public void comer(){
    System.out.println("Gato comendo...");
  }
}
