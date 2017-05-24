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
public class SubPedidoList extends AbstractListModel{
    private ArrayList<SubPedido> lista = new ArrayList<>();
    private static SubPedidoList instance = null;
    
    public static SubPedidoList getInstance() {
        if(instance == null) {
            instance = new SubPedidoList();
        }
        return instance;
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int index) {
        SubPedido p = lista.get(index);
        return p.getArticulo().getNombre() + " [ " + p.getCantidad() + " ] - Total [ " + p.getPrecio() +" ] ";
    }
    public void agregar(SubPedido p){
        lista.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    public void eliminar(int index0){
        lista.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    public SubPedido getSubPedido(int index){
        return lista.get(index);
    }
    public void vaciar() {
        lista.clear();
    }
    public ArrayList<SubPedido> getListado() {
        return lista;
    }
}
