public class Teste {

  public static void main (String[] args){

    // Instanciando a classe computador e atribuindo valores
    Computador computador = new Computador();
    computador.marca = "HP";
    computador.processador = "Intel";
    computador.possuiCDRoom = false;
    System.out.println(computador.marca + "\t" + computador.processador + "\t" + computador.possuiCDRoom);
    System.out.println("--------------------------");

    // Instanciando a classe caderno e atribuindo valores
    Caderno caderno = new Caderno();
    caderno.capa = "Dura";
    caderno.numero_de_folhas = 300;
    caderno.possui_arame = true;
    caderno.tamanho = 'M';

    System.out.println(caderno.capa + "\t" + caderno.numero_de_folhas + "\t" + caderno.tamanho);
    System.out.println("--------------------------");

    // Instanciando a classe aluno e atribundo nome e notas
    Aluno aluno = new Aluno();
    aluno.nome = "Fulano de Tal";
    aluno.notas = new float[3];
    aluno.notas[0] = 10.0f;
    aluno.notas[1] = 5.0f;
    aluno.notas[2] = 6.5f;
    float media = (aluno.notas[0] + aluno.notas[1] + aluno.notas[2])/3;
    System.out.println("Nome: " + aluno.nome + "\n" + "Media = " + media);

  }
  
}
