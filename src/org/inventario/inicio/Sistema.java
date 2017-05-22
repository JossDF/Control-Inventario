/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.inicio;
import org.inventario.bean.Articulo;
import org.inventario.bean.ArticuloList;
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
        Articulo art = new Articulo();
        art.setId(1);
        art.setNombre("sdsdf");
        ArticuloList list_model = new ArticuloList().getInstance();
        list_model.agregarArticulo(art);
        Login login = new Login();
        login.setVisible(true);
    }
    
}
