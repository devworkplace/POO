
import br.ifs.PessoaFisica;

public class Teste{
  public static void main (String[] args){
      PessoaFisica p = new PessoaFisica();

      p.setEndereco("Av.", "7 de junho");
     
      System.out.println("Endereco: " + p.getEndereco());
  }
}