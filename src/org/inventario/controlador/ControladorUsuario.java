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
import org.inventario.bean.Usuario;

/**
 *
 * @author dafuentes
 */
public class ControladorUsuario  {
    private static ControladorUsuario instance = null;
    ArrayList<Usuario> listado = new ArrayList<>();
    private BufferedWriter archivo;
    public static Usuario usuario;
    
    public static ControladorUsuario getInstance() {
        if(instance == null) {
            instance = new ControladorUsuario();

        }
        return instance;
    }
    
    // Carga los datos guardados al iniciar la aplicacion
    public void cargarDatos() {
        try {
            String descripcion = "";
            String objeto[];
            BufferedReader lectura = new BufferedReader(new FileReader("Usuario.txt"));
            while((descripcion = lectura.readLine()) != null) {
                objeto = descripcion.split(",");
                Usuario usuario = new Usuario(Integer.parseInt(objeto[0]),objeto[1],objeto[2],Integer.parseInt(objeto[3]), objeto[4],objeto[5], objeto[6],Integer.parseInt(objeto[7]));
                listado.add(usuario);
            }
        } catch (IOException ex) {
            System.out.println();
        }  
        
    }

    public ControladorUsuario() {
        try {
            this.archivo = new BufferedWriter(new FileWriter("Usuario.txt",true));
        } catch (IOException ex) {
            System.out.println("Error en Constructor");
        }
    }
    
    public ArrayList<Usuario> getListado() {
        return listado;
    }
    
    public int getLongitud() {
        if (!listado.isEmpty()) {
           Usuario usuario =  listado.get(listado.size() - 1);
           return usuario.getId() + 1;
        } else {
            return 1;
        }        
    }
    // Agrega un usuario tanto en el archivo como en el listado
    public void agregar(Usuario usuario) {
        listado.add(usuario);
        try {
            String registro = usuario.getId() + "," + usuario.getNombre() + "," + 
                              usuario.getDireccion() + "," + usuario.getTelefono() + "," +
                              usuario.getNit() + "," + usuario.getUsuario() + "," + 
                              usuario.getContrasenia() + "," + usuario.getRol();
            archivo.write(registro);
            archivo.newLine();
            archivo.flush();
        } catch (IOException ex) {
            System.out.println("Error al agregar");
        }

    }
    
    public Usuario buscar(int id) {
        for (Usuario objeto: listado) {
            if (objeto.getId() == id) {
                return objeto;
            }
        }
        return null;
    }
    
    public Usuario autenticar(String usuario, String contrasenia) {
        for (Usuario objeto: listado)  {
            if (objeto.getUsuario().equals(usuario) && objeto.getContrasenia().equals(contrasenia)) {
                ControladorUsuario.usuario = objeto;
                return objeto;
            }
        }
        return null;
    }
}
