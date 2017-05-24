/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.inventario.bean.SubPedido;
import org.inventario.bean.SubPedidoList;

/**
 *
 * @author dafuentes
 */
public class ControladorSubPedido {
    private static ControladorSubPedido instance = null;
    ArrayList<SubPedido> listado = new ArrayList<>();
    private BufferedWriter archivo;
    private SubPedidoList subPedido_list = new SubPedidoList().getInstance();
    
    public static ControladorSubPedido getInstance() {
        if(instance == null) {
            instance = new ControladorSubPedido();
        }
        return instance;
    }
    
    public ControladorSubPedido() {
        try {
            this.archivo = new BufferedWriter(new FileWriter("SubPedido.txt",true));
        } catch (IOException ex) {
            System.out.println("Error en Constructor");
        }
    }
     // Carga los datos guardados al iniciar la aplicacion
    public void cargarDatos() {
        try {
            String descripcion = "";
            String arreglo[];
            BufferedReader lectura = new BufferedReader(new FileReader("SubPedido.txt"));
            while((descripcion = lectura.readLine()) != null) {
                arreglo = descripcion.split(",");
                ControladorArticulo ctl_articulo = new ControladorArticulo().getInstance();
                SubPedido objeto = new SubPedido(Integer.parseInt(arreglo[0]),ctl_articulo.buscar(Integer.parseInt(arreglo[1])),
                        Integer.parseInt(arreglo[2]),Double.parseDouble(arreglo[3]),
                        Integer.parseInt(arreglo[4]));
                listado.add(objeto);
            }
        } catch (IOException ex) {
            System.out.println("Error carga de datos PEDIDO");
        }  
        
    }
    
    public ArrayList<SubPedido> getListado() {
        return listado;
    }
     
    public int getLongitud() {
        if (!listado.isEmpty()) {
           SubPedido objeto =  listado.get(listado.size() - 1);
           return objeto.getId() + 1;
        } else {
            return 1;
        }        
    }
    // Agrega un subPedido tanto en el archivo como en el listado
    public void agregar(SubPedido objeto) {
        listado.add(objeto);
        try {
            String registro = objeto.getId() + "," + objeto.getArticulo().getId()+ "," + 
                              objeto.getCantidad() + "," + objeto.getPrecio()+ "," +
                              objeto.getIdPedido();
            archivo.write(registro);
            archivo.newLine();
            archivo.flush();
        } catch (IOException ex) {
            System.out.println("Error al agregar");
        }

    }
}
