package br.edu.ifs.modelo;

abstract public class Pessoa{
  
  private String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  abstract public void cpf();
 
}