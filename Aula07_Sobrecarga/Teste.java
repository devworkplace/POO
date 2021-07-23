

public class Teste{
  public static void main (String[] args){
      Pessoa p = new Pessoa();

      //Exemplo de sobrecarga
      p.setEndereco("Av.", "7 de junho");
     
      System.out.println("Endereco: " + p.getEndereco());
  }
}