public class Teste {
  public static void main (String[] args){

    // Testar visibilidade
    Animal animal = new Animal();
    animal.setAltura(180);
    animal.setCor("branco");
    animal.setPeso(250);
    
    System.out.println(animal.getAltura());
    System.out.println(animal.getCor());
    System.out.println(animal.getPeso());
    animal.comer();

  }
}
