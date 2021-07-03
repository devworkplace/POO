import javax.naming.ldap.ControlFactory;

public class Teste {
  public static void main(String[] args){

    ContaCorrente conta1 = new ContaCorrente();
    conta1.setNomeBanco("Banese");
    conta1.setNumeroConta(123);
    conta1.setNomeCliente("Raimundo");

    conta1.setSaldo(1000);
    System.out.println("Conta de " + conta1.getNomeCliente());
    System.out.println("Obtendo o saldo da conta:" + conta1.getSaldo());
    conta1.setDeposito(100);
    System.out.println("Depositando " + conta1.getDeposito() + " ...");
    conta1.depositar(conta1.getDeposito());
    System.out.println("Obtendo o saldo da conta:" + conta1.getSaldo());
    conta1.setSaque(50);
    System.out.println("Sacando " + conta1.getSaque() + " ...");  conta1.sacar(conta1.getSaque());
    System.out.println("Obtendo o saldo da conta:" + conta1.getSaldo());

    System.out.println("------------------------------");
    ContaCorrente conta2 = new ContaCorrente(222, "Caixa", "Adelmo");
    conta2.setSaldo(0);
    System.out.println("Conta de " + conta2.getNomeCliente());
    System.out.println("Obtendo o saldo da conta:" + conta2.getSaldo());
    conta2.setDeposito(100);
    System.out.println("Depositando " + conta2.getDeposito() + " ...");  conta2.depositar(conta2.getDeposito());
    System.out.println("Obtendo o saldo da conta:" + conta2.getSaldo());
    conta2.setSaque(50);
    System.out.println("Sacando " + conta2.getSaque() + " ..."); conta2.sacar(conta2.getSaque());
    System.out.println("Obtendo o saldo da conta:" + conta2.getSaldo());

    System.out.println("------------------------------");
    ContaCorrente conta3 = new ContaCorrente(333, "BB", "Vanessa");
    conta3.setSaldo(0);
    System.out.println("Conta de " + conta3.getNomeCliente());
    System.out.println("Obtendo o saldo da conta:" + conta3.getSaldo());
    conta3.setDeposito(100);
    System.out.println("Depositando " + conta3.getDeposito() + " ...");  conta3.depositar(conta3.getDeposito());
    System.out.println("Obtendo o saldo da conta:" + conta3.getSaldo());
    conta3.setSaque(200);
    System.out.println("Sacando " + conta3.getSaque() + " ...");
    conta3.sacar(conta3.getSaque());
    System.out.println("Obtendo o saldo da conta:" + conta3.getSaldo());

    

  }
}
