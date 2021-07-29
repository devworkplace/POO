package br.ifs;

import java.util.Date;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private Date dataNascimento;

    public PessoaFisica(){
      
    }

    public PessoaFisica(String cpf, Date dataNascimento) {
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;
    }

    public PessoaFisica(String nome, String endereco, char sexo, String cpf, Date dataNascimento) {
      super(nome, endereco, sexo);
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
      return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
      this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
      return cpf;
    }

    public void setCpf(String cpf) {
      this.cpf = cpf;
    }

    
}
