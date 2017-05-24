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
import org.inventario.bean.Entrega;

/**
 *
 * @author dafuentes
 */
public class ControladorEntrega {
    private static ControladorEntrega instance = null;
    ArrayList<Entrega> listado = new ArrayList<>();
    private BufferedWriter archivo;
    
    public static ControladorEntrega getInstance() {
        if(instance == null) {
            instance = new ControladorEntrega();
        }
        return instance;
    }
    
    public ControladorEntrega() {
        try {
            this.archivo = new BufferedWriter(new FileWriter("Entrega.txt",true));
        } catch (IOException ex) {
            System.out.println("Error en Constructor");
        }
    }
    // Carga los datos guardados al iniciar la aplicacion
    public void cargarDatos() {
        try {
            String descripcion = "";
            String arreglo[];
            BufferedReader lectura = new BufferedReader(new FileReader("Entrega.txt"));
            while((descripcion = lectura.readLine()) != null) {
                arreglo = descripcion.split(",");
                ControladorPedido ctl_pedido = new ControladorPedido().getInstance();
                Entrega objeto = new Entrega(Integer.parseInt(arreglo[0]),arreglo[1],ctl_pedido.buscar(Integer.parseInt(arreglo[2])));
                listado.add(objeto);
            }
        } catch (IOException ex) {
            System.out.println("Error carga de datos PEDIDO");
        }  
        
    }
    
    public ArrayList<Entrega> getListado() {
        return listado;
    }
     
    public int getLongitud() {
        if (!listado.isEmpty()) {
           Entrega objeto =  listado.get(listado.size() - 1);
           return objeto.getId() + 1;
        } else {
            return 1;
        }        
    }
    // Agrega un pedido tanto en el archivo como en el listado
    public void agregar(Entrega objeto) {
        listado.add(objeto);
        try {
            String registro = objeto.getId() + "," + objeto.getEstado()+ "," + 
                              objeto.getPedido().getId();
            archivo.write(registro);
            archivo.newLine();
            archivo.flush();
        } catch (IOException ex) {
            System.out.println("Error al agregar");
        }

    }
    
    public ArrayList<Entrega> buscar() {
        ArrayList<Entrega> temporal = new ArrayList<>();
        for(Entrega objeto: listado) {
            if (objeto.getPedido().getUsuario().getId() == ControladorUsuario.usuario.getId()) {
                temporal.add(objeto);
            }
        }
        return temporal;
    }
    
    public Entrega buscarId(int id) {
        for(Entrega objeto: listado) {
            if (objeto.getId() == id) {
                return objeto;
            }
        }
        return null;
    }
}
