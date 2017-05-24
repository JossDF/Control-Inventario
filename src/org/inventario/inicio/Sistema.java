/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.inicio;
import org.inventario.bean.Articulo;
import org.inventario.bean.ArticuloComboBox;
import org.inventario.bean.ArticuloList;
import org.inventario.controlador.ControladorArticulo;
import org.inventario.controlador.ControladorPedido;
import org.inventario.controlador.ControladorSubPedido;
import org.inventario.controlador.ControladorUsuario;
import org.inventario.vista.VentanaLogin;

/**
 *
 * @author dafuentes
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Metodos para cargar los datos de los archivos
        ControladorUsuario ctl_usuario = new ControladorUsuario().getInstance();
        ctl_usuario.cargarDatos();
        
        ControladorArticulo ctl_articulo = new ControladorArticulo().getInstance();
        ctl_articulo.cargarDatos();
        
        ControladorPedido ctl_pedido = new ControladorPedido().getInstance();
        ctl_pedido.cargarDatos();
        
        ControladorSubPedido ctl_subPedido = new ControladorSubPedido().getInstance();
        ctl_subPedido.cargarDatos();
        
        VentanaLogin login = new VentanaLogin();
        login.setVisible(true);
    }
    
}
