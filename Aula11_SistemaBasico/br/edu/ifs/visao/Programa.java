package br.edu.ifs.visao;

import java.util.ArrayList;

import br.edu.ifs.controle.AlunoControle;
import br.edu.ifs.modelo.Aluno;

public class Programa {
  public static void main (String[] args){
     Aluno aluno1 = new Aluno();
     aluno1.setMatricula(100);
     aluno1.setNome("Raimundo");
     Aluno aluno2 = new Aluno();
     aluno2.setMatricula(200);
     aluno2.setNome("Adelmo");
     Aluno aluno3 = new Aluno();
     aluno3.setMatricula(300);
     aluno3.setNome("Michele");

     AlunoControle controle = new AlunoControle();
     controle.CadastrarAluno(aluno1);
     controle.CadastrarAluno(aluno2);
     controle.CadastrarAluno(aluno3);


     for (Aluno aluno : controle.ListarAlunos()) {
      System.out.println(aluno.getMatricula() + "\t" + aluno.getNome());
     }
    

  }
}
