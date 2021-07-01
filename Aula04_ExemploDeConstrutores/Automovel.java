public class Automovel{
  private String marca;
  private String modelo;
  private String cor;
  private String combustivel;


  public Automovel(){

  }
  
  public Automovel(String marca, String modelo, String cor, String combustivel) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.combustivel = combustivel;
  }

  public String getMarca() {
    return marca;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public String getCombustivel() {
    return combustivel;
  }
  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }

  public void ligar(){
    System.out.println(this.marca + "\n" + this.modelo);
    System.out.println("Ligando...");
  }

  public void desligar(){
    System.out.println("Desligando...");
  }

  public void acelerar(){
    System.out.println("Acelerando...");
  }

  public void frear(){
    System.out.println("Freando...");
  }
  
}