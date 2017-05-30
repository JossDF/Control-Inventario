/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.inventario.bean.Entrega;
import org.inventario.bean.SubPedido;

/**
 *
 * @author dafuentes
 */
public class ControladorArchivo {
    private static ControladorArchivo instance = null;
    private ControladorSubPedido ctl_subPedido = new ControladorSubPedido().getInstance();
    private ControladorEntrega ctl_entrega = new ControladorEntrega().getInstance();
    
    public static ControladorArchivo getInstance() {
        if(instance == null) {
            instance = new ControladorArchivo();
        }
        return instance;
    }
    
    public void eliminarRegistro(String nombre_archivo, int dato) {
        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter(nombre_archivo,false));
            for (SubPedido objeto : ctl_subPedido.getListado()) {
                if (objeto.getId() != dato) {
                    String registro = objeto.getId() + "," + objeto.getArticulo().getId()+ "," + 
                                  objeto.getCantidad() + "," + objeto.getPrecio()+ "," +
                                  objeto.getIdPedido();
                    archivo.write(registro);
                    archivo.newLine();
                    archivo.flush();
                }
            }
            archivo.close();
            ctl_subPedido.cargarDatos();
        } catch (IOException ex) {
            System.out.println("Error eliminar registro archivo" + ex);
        }
    }  
    
    public void editarRegistro(String nombre_archivo, int dato, String estado) {
        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter(nombre_archivo,false));
            String registro = "";
            for (Entrega objeto : ctl_entrega.getListado()) {
                if (objeto.getId() != dato) {
                    registro = objeto.getId() + "," + objeto.getEstado()+ "," + 
                              objeto.getPedido().getId(); 
                } else {
                    registro = objeto.getId() + "," + estado + "," + 
                              objeto.getPedido().getId(); 
                }
                archivo.write(registro);
                archivo.newLine();
                archivo.flush();
            }
            archivo.close();
            ctl_entrega.cargarDatos(false);
        } catch (IOException ex) {
            System.out.println("Error editar registro archivo" + ex);
        }
    }  
}
