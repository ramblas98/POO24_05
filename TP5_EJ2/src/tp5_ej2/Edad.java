/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej2;

import java.time.LocalDate;
import java.time.Period;
import java.time.LocalDateTime;

import java.util.Comparator;

/**
 *
 * @author Luis Mendoza
 */
public class Edad implements Comparator{
    
    public int edades(LocalDate fact){
        
       LocalDate actual = LocalDate.now(); 
       Period periodo = Period.between(fact,actual); 
       
       return periodo.getYears();
    }

    @Override
    public int compare(Object o1, Object o2) {
         Empleado d1 = (Empleado)o1;
        Empleado d2 = (Empleado)o2;
        
        if(edades(d1.getFechanac()) == edades(d2.getFechanac())){
          return 0;
        }
        else if(edades(d1.getFechanac()) < edades(d2.getFechanac())){
          return -1;
        }
        else 
            return 1;
    }
    
    
}
