import javax.swing.plaf.synth.SynthGraphicsUtils;

public class Teste {

  public static void main (String[] args){

    // Instanciando a classe computador e atribuindo valores
    Computador computador = new Computador();
    computador.marca = "HP";
    computador.processador = "Intel";
    computador.ligar();
    System.out.println(computador.marca + "\t" + computador.processador + "\t" + computador.status);
    System.out.println("-----------------------------");

    // Instanciando a classe caderno e atribuindo valores
    Caderno caderno = new Caderno();
    caderno.capa = "Dura";
    caderno.numero_de_folhas = 300;
    caderno.possui_arame = true;
    caderno.tamanho = 'M';  
    caderno.fechar();
    System.out.println(caderno.capa + "\t" + caderno.numero_de_folhas + "\t" + caderno.tamanho + "\t" + caderno.fazerAnotacoes());
    caderno.abrir();
    System.out.println(caderno.capa + "\t" + caderno.numero_de_folhas + "\t" + caderno.tamanho + "\t" + caderno.fazerAnotacoes());
    System.out.println("-----------------------------");

    // Instanciando a classe aluno e atribundo nome e notas
    Aluno aluno = new Aluno();
    aluno.nome = "Fulano de Tal";
    aluno.nota1 = 8.0f;
    aluno.nota2 = 4.0f;
    aluno.faltas = 15;
    String status = aluno.analisarSituacao(aluno.nota1, aluno.nota2, aluno.faltas);
    System.out.println("Nome: " + aluno.nome + "\n" + "Status = " + status);
    System.out.println("-----------------------------");

    // Instanciando a classe bola e atribuindo valores
    Bola bola = new Bola();
    bola.tamanho = 10;
    bola.cor = "branco";
    bola.esvaziar();
    System.out.println("Cor da Bola: " + bola.cor + "\n" + "Cheia: " + bola.cheia);

    System.out.println("-----------------------------");
    System.out.println("Oi, criando uma conta corrente...");
 
    ContaCorrente c1 = new ContaCorrente();
    c1.cadastrarConta(500178,"bb","Anderson Silva");
    System.out.println("Saldo: " + c1.obterSaldo());
    
    // movimentando a conta corrente
    c1.depositar(3000);
    System.out.println("Saldo: " + c1.obterSaldo());

    c1.sacar(80);
    System.out.println("Saldo: " + c1.obterSaldo());
  }
  
}
