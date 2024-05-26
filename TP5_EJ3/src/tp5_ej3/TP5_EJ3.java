/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej3;

/**
 *
 * @author Luis Mendoza
 */
public class TP5_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        Perro  ani1 = new Perro("Salchicha",6);
        Gato  ani2 = new Gato("Siames",2);
        Programador pro = new Programador("Luis",19);
        
        
        
        
        
        System.out.println(ani1);
        ani1.saluda();
        System.out.println();
        
        System.out.println(ani2);
        ani2.saluda();
        System.out.println();
        
        System.out.println(pro);
        pro.saluda();
        System.out.println();
        
    }
    
}
