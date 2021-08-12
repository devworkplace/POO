package br.edu.ifs.polimorfismo;

import java.util.ArrayList;


public class Teste {
  public static void main(String[] args) {
    
    Felino fel = new Felino();
    fel.setIdade(10);
    fel.setPeso(50.0f);
    fel.setTamanho(1.20f);
    fel.comer();

    Canino can = new Canino();
    can.setIdade(12);
    can.setPeso(52.0f);
    can.setTamanho(1.40f);
    can.comer();

    Gato gat1 = new Gato();
    gat1.setIdade(1);
    gat1.setPeso(2.0f);
    gat1.setTamanho(0.20f);
    Gato gat2 = new Gato();
    gat2.setIdade(5);
    gat2.setPeso(3.0f);
    gat2.setTamanho(0.30f);


    /*
    Gato[] gatos = new Gato[2];
    gatos[0].setIdade(11);
    gatos[1].setIdade(2);
    */

    String[] gatos = new String[2];
    gatos[0]= "gatinho a";
    gatos[1]= "gatinho b";
    for (String gato : gatos) {
      System.out.println(gato);
    }

    GatoOad novoGato = new GatoOad();
    novoGato.Cadastrar(gat1);
    novoGato.Cadastrar(gat2);

    for (Gato gato : novoGato.Listar()) {
      System.out.println(gato.getIdade());
    }

    /*
    ArrayList<Gato> listaDeGatos = new ArrayList<Gato>();
    listaDeGatos.add(gat1);
    listaDeGatos.add(gat2);

    for (Gato gato : listaDeGatos) {
      System.out.println(gato.getIdade());
    }
    */





    

  }
}
