/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_joseluispereira;

/**
 *
 * @author j0c3lwiz
 */
public class Hilo_actividades extends Thread{
    private boolean t;
    private boolean s;
    private String prioridad;
    private int duracion;

    public Hilo_actividades( int duracion) {
        t = true;
        s = true;
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public boolean isS() {
        return s;
    }

    public void setS(boolean s) {
        this.s = s;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    int c=0;
    @Override
    public void run(){
        while (t) {
            try {
                Thread.sleep(1000);
                duracion=duracion-1000;
            } catch (InterruptedException e) {
            }            
            if (s) {
                c++;
                System.out.println(c);
            }
            if (duracion<=0) {
                t=false;
            }
            
        }
    }
    
    
}
