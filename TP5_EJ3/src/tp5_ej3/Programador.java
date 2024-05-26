/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej3;

/**
 *
 * @author Luis Mendoza
 */
public class Programador extends Persona implements Hablador{

    public Programador() {
    }

    public Programador(String nombre, int edad) {
        super(nombre, edad);
    }
    
    
   @Override
   public void saluda(){
   System.out.println("Hola, Soy un Programador");
   }
}
