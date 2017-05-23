/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.bean;

import java.util.Date;

/**
 *
 * @author dafuentes
 */
public class Pedido {
    
    private int id;
    private Usuario usuario;
    private Date fechaEntrega;
    
    public Pedido() {
        
    }   

    public Pedido(int id, Usuario usuario, Date fechaEntrega) {
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

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
