package br.edu.ifs.polimorfismo;

public class Cachorro extends Canino {
  public void fazerBarulho(){
    System.out.println("Cachorro fazendo barulho...");
  }

  public void fazerBarulho(String latindo){
    System.out.println("Cachorro fazendo barulho..." + latindo);
  }

  public void comer(){
    System.out.println("Cachorro comendo...");
  }
}
