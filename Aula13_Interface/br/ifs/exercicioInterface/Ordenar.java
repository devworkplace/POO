package br.ifs.exercicioInterface;


public class Ordenar {

  public void ordenar(Comparavel[] objetos) {
    for(int i = 0; i < objetos.length; i++) {
      for(int j = i + 1; j < objetos.length; j++) {
        /* Verifica se os objetos não estão na ordem. */
        if(objetos[i].comparar(objetos[j]) > 0) {
          /* Troca os objetos de lugar no vetor. */
          Comparavel temp = objetos[i];
          objetos[i] = objetos[j];
          objetos[j] = temp;
        }
      }
    }
  }
}