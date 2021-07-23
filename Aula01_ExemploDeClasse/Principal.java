public class Principal {
  
  public static void main (String[] args){
    /*
    Produto prod = new Produto();
    prod.setCodigo(1);
    prod.setNome("Caderno");
    prod.setPreco(12.90);

    System.out.println("Codigo: " + prod.getCodigo());
    System.out.println("Nome: " + prod.getNome());
    System.out.println("Preco: " + prod.getPreco());
    */

    // HERANÇA 
    Computador comp = new Computador();
    comp.setPreco(2000);
    comp.setMarca("Sony");
    System.out.println("Preco: " + comp.getPreco());
    System.out.println("Marca: " + comp.getMarca());




  }

}
