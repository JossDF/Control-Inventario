/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.bean;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author dafuentes
 */
public class EntregaList extends AbstractListModel{
    private ArrayList<Entrega> lista = new ArrayList<>();
    private static EntregaList instance = null;
    
    public static EntregaList getInstance() {
        if(instance == null) {
            instance = new EntregaList();
        }
        return instance;
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Entrega p = lista.get(index);
        return p.getId() + " [ " + p.getEstado()+ " ] ";
    }
    public void agregar(Entrega p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminar(int index0){
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    public Entrega getEntrega(int index){
        if (!lista.isEmpty()) {
            try {
                return lista.get(index);
            } catch (IndexOutOfBoundsException ex) {
                return null;
            }
        } else { 
            return null;
        }
        
    }
    public void vaciar() {
        lista.clear();
    }
    public ArrayList<Entrega> getListado() {
        return lista;
    }
}
