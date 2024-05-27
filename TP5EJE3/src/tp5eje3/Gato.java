/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5eje3;

/**
 *
 * @author usuario
 */
public class Gato extends Animal{

    public Gato() {
    }
    
    public Gato(String tipo,int edad){
        
        super(tipo,edad);
 
    }
    
    @Override
    public void saluda(){
        System.out.println("Miauuu");
    }
}
