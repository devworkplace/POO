public class Testador {
  public static void main(String[] args){
      Aluno aluno1 = new Aluno();
      aluno1.setCpf("12121212121");
      aluno1.setNome("Jose");
      System.out.println(aluno1.getNome());
      aluno1.listar();
  }
}
