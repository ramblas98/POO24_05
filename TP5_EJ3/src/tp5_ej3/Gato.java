/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej3;

/**
 *
 * @author Luis Mendoza
 */
public class Gato extends Animal implements Hablador{

    public Gato() {
    }

    public Gato(String tipo, int edad) {
        super(tipo, edad);
    }
    
    
    
    
   @Override
   public void saluda(){
   System.out.println("Miauuuuu");
   }
}

