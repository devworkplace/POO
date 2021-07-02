public class Teste {
  public static void main (String[] args){
    
    Automovel automovel = new Automovel();
    automovel.setMarca("Ford");
    automovel.setModelo("Ka");
    automovel.ligar();

    System.out.println("********************");

    Automovel auto = new Automovel("Renault", "Duster", "Branco", "Flex");
    auto.ligar();


  }
}
