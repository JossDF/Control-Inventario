/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.util.ArrayList;
import org.inventario.bean.Articulo;

/**
 *
 * @author dafuentes
 */
public class ControladorArticulo {
    private static ControladorArticulo instance = null;
    ArrayList<Articulo> listado = new ArrayList<>();
    
    public static ControladorArticulo getInstance() {
        if(instance == null) {
            instance = new ControladorArticulo();
        }
        return instance;
    }
}
