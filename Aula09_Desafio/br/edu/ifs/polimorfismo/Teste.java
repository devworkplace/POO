package br.edu.ifs.polimorfismo;

public class Teste {
  public static void main(String[] args) {

    Felino fel = new Felino();
    fel.vaguear();
    fel.vaguear("vrummm");

    Animal anima = fel;
    anima.comer();

    fel = (Felino)anima;
    fel.dormir();

    if (anima instanceof Felino){
      System.out.println("Posso atribir um animal a um felino");
    } 

    Cachorro cao = new Cachorro();
    cao.fazerBarulho("au au au");

    //Animal anima1  = new Animal();
    //Canino canino1 = new Canino();
    // erro de compilacao
    // canino1 = anima1;

    // correto typecast
    // anima1 = canino1;
    //anima1 = (Animal)canino1;

  }
}
