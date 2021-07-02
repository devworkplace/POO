public class Aluno {
  int matricula;
  String nome;
  float nota1;
  float nota2;
  int faltas;
  String email;
  String telefone;
  boolean presente;

  void estudar(){

  }

  String analisarSituacao(float nota1, float nota2, int faltas){
    float media = (nota1 + nota2)/2;

    if ((media < 5) || (faltas > 12))
      return "Reprovado";
    else
      return "Aprovado";
    
  }

  boolean assistirAula(){
    if (presente == true)
      return true;
    else
      return false;
  }

  boolean fazerProva(){
    if (presente == true)
      return true;
    else
      return false;
  }



  
}
