public class ContaCorrente {

  // Atributos
  int numeroConta;
  String nomeBanco;
  String nomeCliente;
  float saldo;

  //Métodos

  void cadastrarConta(int nConta, String nBanco, String nCliente) 
  {
    numeroConta = nConta;
    nomeBanco = nBanco;
    nomeCliente = nCliente;
  }
  
  void depositar(float valor){
    if (valor > 0)
    {
      saldo += valor;
    }
  }
  
  boolean sacar(float valor){
    if (saldo >= valor){
      saldo -= valor;
      return true;
    }
      return false;
  }
  
  void atualizarNomeCliente(String nCliente){
    nomeCliente = nCliente;
  }
  
  void atualizarBanco(String nBanco){
    nomeBanco = nBanco;
  }
  
  void atualizarNumeroConta(int numConta){
    numeroConta = numConta;
  }
 
  float obterSaldo(){
    return saldo;
  }
}
