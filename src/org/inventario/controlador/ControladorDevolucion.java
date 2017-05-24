/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.util.ArrayList;
import org.inventario.vista.VentanaDevolucion;

/**
 *
 * @author dafuentes
 */
public class ControladorDevolucion {
    private static ControladorDevolucion instance = null;
    ArrayList<VentanaDevolucion> listado = new ArrayList<>();
    
    public static ControladorDevolucion getInstance() {
        if(instance == null) {
            instance = new ControladorDevolucion();
        }
        return instance;
    }
}
