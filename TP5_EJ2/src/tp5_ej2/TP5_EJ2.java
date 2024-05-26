/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej2;

import java.util.Arrays;
import java.time.LocalDate;


/**
 *
 * @author Luis Mendoza
 */
public class TP5_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado lista[] = new Empleado[3];
        int i;
        
        lista[0] = new Empleado("Martinez Pedro",LocalDate.of(2003,01,26),44789543,2019);
        lista[1] = new Empleado("Jimenes Claudia",LocalDate.of(2001,10,16),42345865,2016);
        lista[2] = new Empleado("Perez Juan",LocalDate.of(1998,05,02),39978345,2015);
        
        
        System.out.println("Orden Alfabetico: ");
        Arrays.sort(lista);
        for(i=0;i<3;i++){
           System.out.println(lista[i]);
        }
        
        
        System.out.println();
        
        System.out.println("Orden Por Antiguedad:(Mas antiguo a mas nuevo) ");
        Arrays.sort(lista,new Antiguedad());
        for(i=0;i<3;i++){
           System.out.println(lista[i]);
        }
        
        System.out.println();
        
        
        System.out.println("Orden Por Edad:(Menor edad a Mayor edad) ");
        Arrays.sort(lista,new Edad());
        for(i=0;i<3;i++){
           System.out.println(lista[i]);
        }
        
        
    }
    
}
