/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej2;

import java.util.Comparator;

/**
 *
 * @author Luis Mendoza
 */
public class Antiguedad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Empleado d1 = (Empleado)o1;
        Empleado d2 = (Empleado)o2;
        if(d1.getAnioDeIngre()== d2.getAnioDeIngre()){
          return 0;
        }
        else if(d1.getAnioDeIngre() < d2.getAnioDeIngre()){
          return -1;
        }
        else 
            return 1;
    }

    
}
