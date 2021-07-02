public class Bola {

  // Atributos
  String cor;
  int tamanho;
  boolean cheia;

  // Metodos
  void encher(){
    cheia = true;
  }
  
  void esvaziar(){
    cheia = false;
  }

  void pintar(String novaCor){
    this.cor = novaCor;
  }
  
  void definirTamanho(int novoTamanho){
    if (novoTamanho > 0)
      this.tamanho = novoTamanho;
  }
}
