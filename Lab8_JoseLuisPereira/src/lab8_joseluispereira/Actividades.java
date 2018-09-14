/*
Posteriormente se podran crear actividades, las actividades poseen un nombre, un inicio temprano, una duracion, un final temprano, actividades predecesoras, 
actividades sucesoras y posibilidad de retraso. 
INICIALEMENTE SOLO SE LLENARA EL NOMBRE, LA DURACION Y LA POSIBILIDAD DE RETRASO. LOS OTROS CAMPOS SERAN LLENADOS POR MEDIO DE CALCULOS EXPLICADOS POSTERIORMENTE.
 */
package lab8_joseluispereira;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Actividades {
    private String nombre;
    private int inicio_temprano;
    private int duracion;
    private int final_temprano;
    private ArrayList<Actividades>actividades_predecesoras;
    private ArrayList<Actividades>actividades_sucesoras;
    private int posibilidad_retraso;
    private String tipo;

    public Actividades() {
    }

    public Actividades(String nombre, int duracion, int posibilidad_retraso, String tipo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.posibilidad_retraso = posibilidad_retraso;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInicio_temprano() {
        return inicio_temprano;
    }

    public void setInicio_temprano(int inicio_temprano) {
        this.inicio_temprano = inicio_temprano;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFinal_temprano() {
        return final_temprano;
    }

    public void setFinal_temprano(int final_temprano) {
        this.final_temprano = final_temprano;
    }

    public ArrayList<Actividades> getActividades_predecesoras() {
        return actividades_predecesoras;
    }

    public void setActividades_predecesoras(ArrayList<Actividades> actividades_predecesoras) {
        this.actividades_predecesoras = actividades_predecesoras;
    }

    public ArrayList<Actividades> getActividades_sucesoras() {
        return actividades_sucesoras;
    }

    public void setActividades_sucesoras(ArrayList<Actividades> actividades_sucesoras) {
        this.actividades_sucesoras = actividades_sucesoras;
    }

    public int getPosibilidad_retraso() {
        return posibilidad_retraso;
    }

    public void setPosibilidad_retraso(int posibilidad_retraso) {
        this.posibilidad_retraso = posibilidad_retraso;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}
