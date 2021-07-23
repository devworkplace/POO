import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teste{
  public static void main(String[] args){

    PessoaFisica pf = new PessoaFisica();
    pf.setDataNascimento(new GregorianCalendar(2000,12,01));
    System.out.println(pf.getDataNascimento().getTime());
  }
}