/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentable;

/**
 *
 * @author Estudiante
 */
public class PT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inmueble im1= new Inmueble("Alvarado 1030","departamento",250003);
        Inmueble im2= new Inmueble("Facio 77","casa",3000004);
        
        Disfraz D1 = new Disfraz("pikachu",'S',4000);
        Disfraz D2= new Disfraz("batman",'L',4000);
        
        System.out.println(im1.toString());
        
        System.out.println(im2.toString());
        
        System.out.println(D1.toString());
        
        System.out.println(D2);
        
        if(D1.alquilado()) System.out.println("El disfraz esta alquilado");
        else System.out.println("El disfraz no esta alquilado");
        D1.alquilar(4);
        if(D1.alquilado()) System.out.println("El disfraz esta alquilado");
        else System.out.println("El disfraz no esta alquilado");
        System.out.println(D1);
        D1.desocupar();
        if(D1.alquilado()) System.out.println("El disfraz esta alquilado");
        else System.out.println("El disfraz no esta alquilado");
    }
        
        
    
    
}
