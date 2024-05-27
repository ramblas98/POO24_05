/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class Programador extends Persona{

    public Programador() {
    }

    public Programador(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public String darNombre(){
     return this.getNombre();
    }
    
    @Override
    public void saluda(){
    System.out.println("Hola, Soy un Programador");
    }
    
    
    @Override
    public boolean esIgual(Object o) {
        Persona otro = (Persona) o;
        return this.getNombre().equals(otro.darNombre());
    }

    @Override
    public boolean esMayor(Object o) {
        Persona otro = (Persona) o;
        if(this.getNombre().compareTo(otro.darNombre())>0) return true;
        else return false;
    }

    @Override
    public boolean esMenor(Object o) {
        Persona otro = (Persona) o;
        if(this.getNombre().compareTo(otro.darNombre())<0) return true;
        else return false;
    }
}


