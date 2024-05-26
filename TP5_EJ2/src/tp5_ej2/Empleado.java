/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5_ej2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Luis Mendoza
 */
public class Empleado implements Comparable {
    private String apeYNom;
    private LocalDate fechanac;
    private int dni,anioDeIngre;

    public Empleado() {
    }

    public Empleado(String apeYNom, LocalDate fechanac, int dni, int anioDeIngre) {
        this.apeYNom = apeYNom;
        this.fechanac = fechanac;
        this.dni = dni;
        this.anioDeIngre = anioDeIngre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "apeYNom=" + apeYNom + ", fechanac=" + fechanac + ", dni=" + dni + ", anioDeIngre=" + anioDeIngre + '}';
    }
    
    

    public String getApeYNom() {
        return apeYNom;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }


    public int getDni() {
        return dni;
    }

    public int getAnioDeIngre() {
        return anioDeIngre;
    }

    public void setApeYNom(String apeYNom) {
        this.apeYNom = apeYNom;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setAnioDeIngre(int anioDeIngre) {
        this.anioDeIngre = anioDeIngre;
    }

    @Override
    public int compareTo(Object o) {
        Empleado d1 = (Empleado)o;
        return this.apeYNom.compareTo(d1.apeYNom);
    
    }
    
   
    
    
    
}
