/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.util.ArrayList;
import org.inventario.vista.Entrega;

/**
 *
 * @author dafuentes
 */
public class ControladorEntrega {
    private static ControladorEntrega instance = null;
    ArrayList<Entrega> listado = new ArrayList<>();
    
    public static ControladorEntrega getInstance() {
        if(instance == null) {
            instance = new ControladorEntrega();
        }
        return instance;
    }
}
