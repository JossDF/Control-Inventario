/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.bean;

import org.inventario.controlador.ControladorSubPedido;

/**
 *
 * @author dafuentes
 */
public class Pedido {
    
    private int id;
    private Usuario usuario;
    private String fechaEntrega;
    
    public Pedido() {
        
    }   

    public Pedido(int id, Usuario usuario, String fechaEntrega) {
        this.id = id;
        this.usuario = usuario;
        this.fechaEntrega = fechaEntrega;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public int getSubPedidos() { 
        int contador = 0;
        ControladorSubPedido ctl_subPedido = new ControladorSubPedido().getInstance();
        for (SubPedido objeto : ctl_subPedido.getListado()) {
            if (objeto.getIdPedido() == this.id) {
                contador++;
            }
        }
        return contador;
    }
    
    
}
