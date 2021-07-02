public class Computador {
  String marca; // HP, Dell, Sony
  String processador; // Intel, AMD
  String memoriaEmGB; // 4, 8
  int discoRigidoEmGB; // 500, 1200
  boolean status; // sim ou nao
  
  void ligar(){
    status = true;
    System.out.println("Computador ligado.");
  }

  void desligar(){
    status = false;
    System.out.println("Computador desligado.");
  }

}
