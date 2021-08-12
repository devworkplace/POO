package br.edu.ifs.polimorfismo;
import java.util.ArrayList;

public class GatoOad {
 
  private ArrayList<Gato> listaDeGatos = new ArrayList<Gato>();
 
  public void Cadastrar(Gato gato){
    listaDeGatos.add(gato);
  }

  public ArrayList<Gato> Listar(){
    return listaDeGatos;
  }
  
}
