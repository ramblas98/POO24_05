/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej4;
import java.util.Arrays;
/**
 *
 * @author Luis Mendoza
 */
public class TP5_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Hablador lista[]= new Hablador[3];
        lista[0]= new Perro("Salchicha",6);
        lista[1]= new Gato("Burmes",2);
        lista[2]= new Programador("Luis",19);
        
        System.out.println();
        
        for(i=0;i<3;i++){
           lista[i].saluda(); 
           
        }
        
        Arrays.sort(lista,new CompRelaciones());
        
        System.out.println();
        
        for(i=0;i<3;i++){
           System.out.println(lista[i]);
        }
        
    }
    
}
