package rentable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Disfraz implements Rentable{
    private String personaje;
    private char talle;
    private int dias;
    private double precio;

    public Disfraz() {
    }

    public Disfraz(String personaje, char talle, double precio) {
        this.personaje = personaje;
        this.talle = talle;
        this.precio = precio;
    }

    public String getPersonaje() {
        return personaje;
    }

    public char getTalle() {
        return talle;
    }

    public int getDias() {
        return dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public void alquilar(int periodo){
        this.dias=periodo;
    }
    @Override
    public boolean alquilado(){
        if (this.dias==0) return false;
                else return true;
    }
    @Override
    public void desocupar(){
        this.dias=0;
        
    }

    @Override
    public String toString() {
        return "Disfraz{" + "personaje=" + personaje + ", talle=" + talle + ", dias=" + dias + ", precio=" + precio + '}';
    }
    
    
    
}
