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
import org.inventario.bean.Pedido;

/**
 *
 * @author dafuentes
 */
public class ControladorPedido {
    private static ControladorPedido instance = null;
    ArrayList<Pedido> listado = new ArrayList<>();
    private BufferedWriter archivo;
    
    public static ControladorPedido getInstance() {
        if(instance == null) {
            instance = new ControladorPedido();
        }
        return instance;
    }
    
    public ControladorPedido() {
        try {
            this.archivo = new BufferedWriter(new FileWriter("Pedido.txt",true));
        } catch (IOException ex) {
            System.out.println("Error en Constructor");
        }
    }
    // Carga los datos guardados al iniciar la aplicacion
    public void cargarDatos() {
        try {
            String descripcion = "";
            String arreglo[];
            BufferedReader lectura = new BufferedReader(new FileReader("Pedido.txt"));
            while((descripcion = lectura.readLine()) != null) {
                arreglo = descripcion.split(",");
                ControladorUsuario ctl_usuario = new ControladorUsuario().getInstance();
                Pedido objeto = new Pedido(Integer.parseInt(arreglo[0]),ctl_usuario.buscar(Integer.parseInt(arreglo[1])),arreglo[2]);
                listado.add(objeto);
            }
        } catch (IOException ex) {
            System.out.println("Error carga de datos PEDIDO");
        }  
        
    }
    
    public ArrayList<Pedido> getListado() {
        return listado;
    }
     
    public int getLongitud() {
        if (!listado.isEmpty()) {
           Pedido objeto =  listado.get(listado.size() - 1);
           return objeto.getId() + 1;
        } else {
            return 1;
        }        
    }
    // Agrega un pedido tanto en el archivo como en el listado
    public void agregar(Pedido objeto) {
        listado.add(objeto);
        try {
            String registro = objeto.getId() + "," + objeto.getUsuario().getId()+ "," + 
                              objeto.getFechaEntrega();
            archivo.write(registro);
            archivo.newLine();
            archivo.flush();
        } catch (IOException ex) {
            System.out.println("Error al agregar");
        }

    }
    
    public Pedido buscar(int id) {
        for(Pedido objeto : listado) {
            if (objeto.getId() == id) {
                return objeto;
            }
        }
        return null;
    }
}
