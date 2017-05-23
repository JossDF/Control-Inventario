/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.util.ArrayList;
import org.inventario.vista.Pedido;

/**
 *
 * @author dafuentes
 */
public class ControladorPedido {
    private static ControladorPedido instance = null;
    ArrayList<Pedido> listado = new ArrayList<>();
    
    public static ControladorPedido getInstance() {
        if(instance == null) {
            instance = new ControladorPedido();
        }
        return instance;
    }
}
