/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.bean;

/**
 *
 * @author dafuentes
 */
public class Entrega {
    
    private int id;
    private String estado;
    private Pedido pedido;
    
    public Entrega() {
        
    }

    public Entrega(int id, String estado, Pedido pedido) {
        this.id = id;
        this.estado = estado;
        this.pedido = pedido;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido idPedido) {
        this.pedido = idPedido;
    }
    
}
