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
public class SubPedido {
    
    private int id; 
    private Articulo articulo;
    private int cantidad;
    private double precio;
    private int idPedido;
    
    public SubPedido() {
        
    }

    public SubPedido(int id, Articulo articulo, int cantidad, double precio, int idPedido) {
        this.id = id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idPedido = idPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
}
