/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_joseluispereira;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j0c3lwiz
 */
public class Hilo_actividades extends Thread{
    private boolean t;
    private boolean s;
    private String prioridad;
    private int duracion;
    private ArrayList<Actividades>lista=new ArrayList();
     private JTable tabla;
     

    public Hilo_actividades() {
        t = true;
        s = true;
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isT() {
        return t;
    }

    public ArrayList<Actividades> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Actividades> lista) {
        this.lista = lista;
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
        for (Actividades o : lista) {
            try {
                Thread.sleep(o.getDuracion()* 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Object[] newrow = {
                o.getNombre(),o.getInicio_temprano(),o.getDuracion(),o.getFinal_temprano(),o.getPosibilidad_retraso()};
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
    }
    
    /*
      @Override
    public void run() {
        ordenar(c, lista);
        t.setVisible(true);
        for (pieza object : lista) {
            try {
                Thread.sleep(object.getTiempo() * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Object[] newrow = {
                c.getNombre(),
                object.getNombre(),
                object.getTiempo(),};
            DefaultTableModel modelo = (DefaultTableModel) t.jTable1.getModel();
            modelo.addRow(newrow);
            t.jTable1.setModel(modelo);
        }
    }
    */
}
