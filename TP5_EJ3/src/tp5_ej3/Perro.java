/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej3;

/**
 *
 * @author Luis Mendoza
 */
public class Perro extends Animal implements Hablador{

    public Perro() {
    }

    public Perro(String tipo, int edad) {
        super(tipo, edad);
    }
    
   @Override
   public void saluda(){
   System.out.println("Guauuuu");
   }
   
    
}
