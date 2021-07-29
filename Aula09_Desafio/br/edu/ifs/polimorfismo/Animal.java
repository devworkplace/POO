package br.edu.ifs.polimorfismo;

public class Animal{
  private int tamanho;
  private float peso;
  private String idade;

  public Animal(){
    System.out.println("animal construido..");
  }


  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public String getIdade() {
    return idade;
  }

  public void setIdade(String idade) {
    this.idade = idade;
  }

  public void fazerBarulho(){
    System.out.println("animal fazendo barulho...");
  }

  public void comer(){
    System.out.println("animal comendo...");
  }

  public void dormir(){
    System.out.println("animal dormindo...");
  }

  public void vaguear(){
    System.out.println("vagueando animal...");
  }

}