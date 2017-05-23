/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.inicio;
import org.inventario.bean.Articulo;
import org.inventario.bean.ArticuloComboBox;
import org.inventario.bean.ArticuloList;
import org.inventario.controlador.ControladorPedido;
import org.inventario.controlador.ControladorUsuario;
import org.inventario.vista.Login;

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
        
        ControladorPedido ctl_pedido = new ControladorPedido().getInstance();
        ctl_pedido.cargarDatos();
        
        Articulo art = new Articulo();
        art.setId(1);
        art.setNombre("sdsdf");
        ArticuloList list_model = new ArticuloList().getInstance();
        ArticuloComboBox cbm_model = new ArticuloComboBox().getInstance();
        list_model.agregarArticulo(art);
        cbm_model.agregarArticulo(art);
        Login login = new Login();
        login.setVisible(true);
    }
    
}
