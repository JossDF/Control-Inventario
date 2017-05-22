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
public class ArticuloList extends AbstractListModel{

    private ArrayList<Articulo> lista = new ArrayList<>();
    private static ArticuloList instance = null;
    
    public static ArticuloList getInstance() {
        if(instance == null) {
            instance = new ArticuloList();
        }
        return instance;
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        Articulo p = lista.get(index);
        return p.getNombre();
    }
    public void agregarArticulo(Articulo p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminarArticulo(int index0){
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    public Articulo getArticulo(int index){
        return lista.get(index);
    }
}
