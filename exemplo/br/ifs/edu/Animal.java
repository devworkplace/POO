package br.ifs.edu;

public class Animal{
  private float tamanho;
  private float peso;
  private int idade;

  public float getTamanho() {
    return tamanho;
  }
  public void setTamanho(float tamanho) {
    this.tamanho = tamanho;
  }
  public float getPeso() {
    return peso;
  }
  public void setPeso(float peso) {
    this.peso = peso;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public void fazerBarulho(){
    System.out.println("Animal fazendo barulho...");
  }

  public void dormir(){
    System.out.println("Animal dormindo...");
  }

  public void comer(){
    System.out.println("Animal comendo...");
  }

  public void vaguear(){
    System.out.println("Animal vagando...");
  }

  public Animal(){
    System.out.println("Animal instanciado...");
  }
  
}