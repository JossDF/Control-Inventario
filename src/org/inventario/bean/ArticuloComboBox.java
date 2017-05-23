/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.bean;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author dafuentes
 */
public class ArticuloComboBox extends AbstractListModel implements ComboBoxModel{
    
    private ArrayList<Articulo> lista = new ArrayList<>();
    private static ArticuloComboBox instance = null;
    String selection = null;
    
    public static ArticuloComboBox getInstance() {
        if(instance == null) {
            instance = new ArticuloComboBox();
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
    
    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem; // to select and register an
    } // item from the pull-down list

    @Override
    // Methods implemented from the interface ComboBoxModel
    public Object getSelectedItem() {
      return selection; // to add the selection to the combo box
    }
}
