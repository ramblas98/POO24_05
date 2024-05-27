/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej4;
import java.util.Comparator;
/**
 *
 * @author Luis Mendoza
 */
public class CompRelaciones implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Relaciones r1 = (Relaciones) o1;
        Relaciones r2 = (Relaciones) o2;
        if(r1.esIgual(r2)) return 0;
        else if(r1.esMayor(r2)) return 1;
        else return -1;
    }
    
}
