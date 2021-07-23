package br.ifs;

public class Pessoa{
  private String nome;
  private String endereco;
  private char sexo;

  public Pessoa(){

  }  

  public Pessoa(String nome, String endereco, char sexo) {
    this.nome = nome;
    this.endereco = endereco;
    this.sexo = sexo;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public void setSexo(String sexo) {
    if (sexo.equalsIgnoreCase("Feminino"))
        this.sexo = 'F';
      else
        this.sexo = 'M';
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setEndereco(String logradouro, String endereco) {
    this.endereco = logradouro + " " + endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
}