/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5eje3;

/**
 *
 * @author usuario
 */
public abstract class Animal implements Hablador{

    public Animal() {
    }

    public Animal(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }
    
    
    private String tipo;
    private int edad;

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
