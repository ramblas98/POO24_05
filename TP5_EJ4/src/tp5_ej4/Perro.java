/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String tipo, int edad) {
        super(tipo, edad);
    }
    
    @Override
    public void saluda(){
    System.out.println("Guauuuu");
    }
   
   
    @Override
    public String darNombre(){
     return this.getTipo();
    }
    
    
    @Override
    public boolean esIgual(Object o) {
        Hablador otro = (Hablador) o;
        return this.getTipo().equals(otro.darNombre());
    }

    @Override
    public boolean esMayor(Object o) {
        Hablador otro = (Hablador) o;
        if(this.getTipo().compareTo(otro.darNombre())>0) return true;
        else return false;
    }

    @Override
    public boolean esMenor(Object o) {
        Hablador otro = (Hablador) o;
        if(this.getTipo().compareTo(otro.darNombre())<0) return true;
        else return false;
    }
   
}
