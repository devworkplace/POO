public class Animal{

    // atributos private
    private int peso;
    private int altura;
    private String cor;

    // metodos public
    public int getPeso() {
      return peso;
    }
    public void setPeso(int peso) {
      this.peso = peso;
    }
    public int getAltura() {
      return altura;
    }
    public void setAltura(int altura) {
      this.altura = altura;
    }
    public String getCor() {
      return cor;
    }
    public void setCor(String cor) {
      this.cor = cor;
    } 

    public void comer(){
      System.out.println("Sou carnivoro, como tudo!");
      this.fazerBarulho();
    }

    public void dormir(){
      System.out.println("Deitei e dormir");
    }

    public void andar(){
      System.out.println("Estou andando por aí");
    }

    private void fazerBarulho(){
      System.out.println("huurrmmmm....");
    }
}