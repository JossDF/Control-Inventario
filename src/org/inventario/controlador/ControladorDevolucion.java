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
import org.inventario.bean.Devolucion;
/**
 *
 * @author dafuentes
 */
public class ControladorDevolucion {
    private static ControladorDevolucion instance = null;
    ArrayList<Devolucion> listado = new ArrayList<>();
    private BufferedWriter archivo;
    private ControladorArticulo ctl_articulo = new ControladorArticulo().getInstance();
    private ControladorEntrega ctl_entrega = new ControladorEntrega().getInstance();
    
    public static ControladorDevolucion getInstance() {
        if(instance == null) {
            instance = new ControladorDevolucion();
        }
        return instance;
    }
    
    public ControladorDevolucion() {
        try {
            this.archivo = new BufferedWriter(new FileWriter("Devolucion.txt",true));
        } catch (IOException ex) {
            System.out.println("Error en Constructor");
        }
    }
    // Carga los datos guardados al iniciar la aplicacion
    public void cargarDatos() {
        try {
            String descripcion = "";
            String arreglo[];
            BufferedReader lectura = new BufferedReader(new FileReader("Devolucion.txt"));
            while((descripcion = lectura.readLine()) != null) {
                arreglo = descripcion.split(",");
                Devolucion objeto = new Devolucion(Integer.parseInt(arreglo[0]),ctl_articulo.buscar(Integer.parseInt(arreglo[1])),ctl_articulo.buscar(Integer.parseInt(arreglo[2])),ctl_entrega.buscarId(Integer.parseInt(arreglo[3])));
                listado.add(objeto);
            }
        } catch (IOException ex) {
            System.out.println("Error carga de datos PEDIDO");
        }  
        
    }
    
    public ArrayList<Devolucion> getListado() {
        return listado;
    }
     
    public int getLongitud() {
        if (!listado.isEmpty()) {
           Devolucion objeto =  listado.get(listado.size() - 1);
           return objeto.getId() + 1;
        } else {
            return 1;
        }        
    }
    // Agrega un pedido tanto en el archivo como en el listado
    public void agregar(Devolucion objeto) {
        listado.add(objeto);
        try {
            String registro = objeto.getId() + "," + objeto.getArticuloDevolucion().getId()+ "," + 
                              objeto.getArticuloEnvio().getId() + "," + objeto.getEntrega().getId() ;
            archivo.write(registro);
            archivo.newLine();
            archivo.flush();
        } catch (IOException ex) {
            System.out.println("Error al agregar");
        }

    }
}
