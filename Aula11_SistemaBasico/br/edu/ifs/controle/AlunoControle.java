package br.edu.ifs.controle;

import java.util.ArrayList;
import br.edu.ifs.modelo.Aluno;

public class AlunoControle {
  private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

  public void CadastrarAluno(Aluno aluno){
    listaAlunos.add(aluno);
    System.out.println("Aluno " + aluno.getNome() + " cadastrado.");
  }

  public ArrayList<Aluno> ListarAlunos(){
    System.out.println("Lista de aluno(s) cadastrado(s)... ");
    return listaAlunos;
  }

}
