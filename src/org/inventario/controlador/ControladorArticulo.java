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
import org.inventario.bean.Articulo;
import org.inventario.bean.ArticuloComboBox;

/**
 *
 * @author dafuentes
 */
public class ControladorArticulo {
    private static ControladorArticulo instance = null;
    ArrayList<Articulo> listado = new ArrayList<>();
    private ArticuloComboBox cbm_model = new ArticuloComboBox().getInstance();
    private BufferedWriter archivo;
    
    public static ControladorArticulo getInstance() {
        if(instance == null) {
            instance = new ControladorArticulo();
        }
        return instance;
    }
    
    public ControladorArticulo() {
        try {
            this.archivo = new BufferedWriter(new FileWriter("Articulo.txt",true));
        } catch (IOException ex) {
            System.out.println("Error en Constructor");
        }
    }
    
    // Carga los datos guardados al iniciar la aplicacion
    public void cargarDatos() {
        try {
            String descripcion = "";
            String arreglo[];
            BufferedReader lectura = new BufferedReader(new FileReader("Articulo.txt"));
            while((descripcion = lectura.readLine()) != null) {
                arreglo = descripcion.split(",");
                ControladorUsuario ctl_usuario = new ControladorUsuario().getInstance();
                Articulo objeto = new Articulo(Integer.parseInt(arreglo[0]),arreglo[1],arreglo[2],Double.parseDouble(arreglo[3]),Double.parseDouble(arreglo[4]),arreglo[5],Integer.parseInt(arreglo[6]));
                cbm_model.agregarArticulo(objeto);
                listado.add(objeto);
            }
        } catch (IOException ex) {
            System.out.println("Error carga de datos PEDIDO");
        }  
        
    }
    
     public ArrayList<Articulo> getListado() {
        return listado;
    }
     
    public int getLongitud() {
        if (!listado.isEmpty()) {
           Articulo objeto =  listado.get(listado.size() - 1);
           return objeto.getId() + 1;
        } else {
            return 1;
        }        
    }
    // Agrega un articulo tanto en el archivo como en el listado
    public void agregar(Articulo objeto) {
        listado.add(objeto);
        cbm_model.agregarArticulo(objeto);
        try {
            String registro = objeto.getId() + "," + objeto.getNombre()+ "," + 
                              objeto.getDescripcion() + "," + objeto.getCosto() + "," +
                              objeto.getPrecio() + "," + objeto.getTipo() + "," +
                              objeto.getCantidad();
            archivo.write(registro);
            archivo.newLine();
            archivo.flush();
        } catch (IOException ex) {
            System.out.println("Error al agregar");
        }

    }
    
    public Articulo buscar(int id) {
        for (Articulo objeto : listado) {
            if (objeto.getId() == id) {
                return objeto;
            }
        }
        return null;
    }
    
}
