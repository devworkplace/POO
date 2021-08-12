package br.edu.ifs.polimorfismo;

abstract public class Animal{
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

  abstract public void fazerBarulho();
  abstract public void comer();
  abstract public void dormir();
  abstract public void vaguear();

}