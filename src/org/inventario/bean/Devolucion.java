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
public class Devolucion {
    
    private int id;
    private Articulo articuloDevolucion;
    private Articulo articuloEnvio;
    private Entrega entrega;
    
    public Devolucion() {
        
    }

    public Devolucion(int id, Articulo articuloDevolucion, Articulo articuloEnvio, Entrega entrega) {
        this.id = id;
        this.articuloDevolucion = articuloDevolucion;
        this.articuloEnvio = articuloEnvio;
        this.entrega = entrega;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Articulo getArticuloDevolucion() {
        return articuloDevolucion;
    }

    public void setArticuloDevolucion(Articulo articuloDevolucion) {
        this.articuloDevolucion = articuloDevolucion;
    }

    public Articulo getArticuloEnvio() {
        return articuloEnvio;
    }

    public void setArticuloEnvio(Articulo articuloEnvio) {
        this.articuloEnvio = articuloEnvio;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    
}
