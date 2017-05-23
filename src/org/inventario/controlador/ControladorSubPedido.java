/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.util.ArrayList;
import org.inventario.bean.SubPedido;

/**
 *
 * @author dafuentes
 */
public class ControladorSubPedido {
    private static ControladorSubPedido instance = null;
    ArrayList<SubPedido> listado = new ArrayList<>();
    
    public static ControladorSubPedido getInstance() {
        if(instance == null) {
            instance = new ControladorSubPedido();
        }
        return instance;
    }
}
