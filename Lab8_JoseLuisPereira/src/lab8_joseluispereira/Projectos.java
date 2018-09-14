/*
 los cuales tienen una duracion (Que inicalmente sera 0), un nombre y una lista de actividades.
 */
package lab8_joseluispereira;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Projectos {
    private int duracion;
    private String nombre;
    private ArrayList<Actividades> actividades=new ArrayList();

    public Projectos() {
    }

    public Projectos(String nombre) {
        this.nombre = nombre;
        duracion=0;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividades> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividades> actividades) {
        this.actividades = actividades;
    }

    @Override
    public String toString() {
        return "Projectos: " +nombre;
    }
    
    
    
}
