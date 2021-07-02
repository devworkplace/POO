public class Caderno{

  String capa; // dura, fina
  int numero_de_folhas; // 50, 100, 300
  boolean possui_arame; // sim ou nao
  char tamanho; //P = pequeno, M = medio, G = grande
  boolean aberto;


  boolean fazerAnotacoes(){
    if (aberto == true)
      return true;
    else
      return false;
  }

  void abrir(){
    this.aberto = true;
  }

  void fechar(){
    this.aberto = false;
  }

}