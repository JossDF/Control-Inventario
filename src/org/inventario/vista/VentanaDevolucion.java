/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.vista;

import java.text.DateFormat;
import java.util.Date;
import org.inventario.bean.Articulo;
import org.inventario.bean.ArticuloComboBox;
import org.inventario.bean.ArticuloComboBoxEnviar;
import org.inventario.bean.Devolucion;
import org.inventario.bean.Entrega;
import org.inventario.bean.Pedido;
import org.inventario.bean.SubPedido;
import org.inventario.controlador.ControladorArchivo;
import org.inventario.controlador.ControladorDevolucion;
import org.inventario.controlador.ControladorEntrega;
import org.inventario.controlador.ControladorPedido;
import org.inventario.controlador.ControladorSubPedido;
import org.inventario.controlador.ControladorUsuario;

/**
 *
 * @author dafuentes
 */
public class VentanaDevolucion extends javax.swing.JFrame {

    private ControladorDevolucion ctl_devolucion = new ControladorDevolucion().getInstance();
    private ControladorEntrega ctl_entrega = new ControladorEntrega().getInstance();
    private ControladorPedido ctl_pedido = new ControladorPedido().getInstance();
    private ControladorSubPedido ctl_subPedido = new ControladorSubPedido().getInstance();
    private ArticuloComboBox cmb_articuloDevolver = new ArticuloComboBox().getInstance();
    private ArticuloComboBoxEnviar cmb_articuloEnviar = new ArticuloComboBoxEnviar().getInstance();
    private ControladorArchivo ctl_archivo = new ControladorArchivo().getInstance();
    /**
     * Creates new form Devolucion
     */
    public VentanaDevolucion() {
        initComponents();
        this.setLocationRelativeTo(null);
        agregarComponente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_devolver = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        cb_enviar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btn_sesion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btn_sesion.setText("<-");
        btn_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Devolución");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel1.setText("Codigo Pedido");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Articulo a devolver");

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        cb_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_enviarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Articulo a enviar");

        btn_guardar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel10.setText("Fecha entrega");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_guardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cb_devolver, 0, 101, Short.MAX_VALUE)
                                .addComponent(cb_enviar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_codigo))
                            .addComponent(txt_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_sesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sesionActionPerformed
        MenuCliente menuCliente = new MenuCliente();
        menuCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_sesionActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void cb_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_enviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_enviarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Date date = txt_fecha.getDate();
        String fecha = "";
        if (date != null) {
           fecha = DateFormat.getDateInstance().format(date);
        }
        
        int selection = cb_enviar.getSelectedIndex();
        Articulo articulo = null;
        Articulo art_devolver = null;
        if (selection > -1) {
            articulo = cmb_articuloEnviar.getArticulo(selection);
        }
        selection = cb_devolver.getSelectedIndex();
        if (selection > -1) {
            art_devolver = cmb_articuloDevolver.getArticulo(selection);
        }
        int idEliminar = 0;
        if (articulo != null && art_devolver != null && !fecha.equals("")) {
            if (!txt_codigo.getText().equals("")) {
                Pedido objeto = ctl_pedido.buscar(Integer.parseInt(txt_codigo.getText()));
                if (objeto != null) {
                    for (SubPedido subPedido : ctl_subPedido.consultaPedido(objeto.getId())) {
                        if (subPedido.getArticulo().getId() == art_devolver.getId()) {
                            idEliminar = subPedido.getId();
                            break;
                        }
                    }
                }
            }
            SubPedido subPedido = new SubPedido(ctl_subPedido.getLongitud(false), articulo, 1, articulo.getPrecio(), ctl_pedido.getLongitud());
            ctl_subPedido.agregar(subPedido);
            Pedido pedido = new Pedido(ctl_pedido.getLongitud(),ControladorUsuario.usuario,fecha);
            ctl_pedido.agregar(pedido);
            Entrega entrega = new Entrega(ctl_entrega.getLongitud(), "INICIADO",pedido);
            ctl_entrega.agregar(entrega);
            ctl_archivo.eliminarRegistro("SubPedido.txt", idEliminar);
            Devolucion devolucion = new Devolucion(ctl_devolucion.getLongitud(), art_devolver, articulo, entrega);
            ctl_devolucion.agregar(devolucion);
            MenuCliente menu = new MenuCliente();
            menu.setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        if (!txt_codigo.getText().equals("")) {
            Pedido objeto = ctl_pedido.buscar(Integer.parseInt(txt_codigo.getText()));
            if (objeto != null) {
                cmb_articuloDevolver.limpiar();
                for (SubPedido subPedido : ctl_subPedido.getListado()) {
                    if (objeto.getId() == subPedido.getIdPedido()) {
                        cmb_articuloDevolver.agregarArticulo(subPedido.getArticulo());
                    }
                }
                cb_devolver.setModel(cmb_articuloDevolver);
                cb_devolver.setSelectedIndex(-1);
                cb_devolver.repaint();
            }
            
        } 
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDevolucion().setVisible(true);
            }
        });
    }
    
    public void agregarComponente() {
        txt_codigo.setText("");
        cb_enviar.setModel(cmb_articuloEnviar);
        cb_enviar.setSelectedIndex(-1);
        cb_enviar.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_sesion;
    private javax.swing.JComboBox<String> cb_devolver;
    private javax.swing.JComboBox<String> cb_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_codigo;
    private com.toedter.calendar.JDateChooser txt_fecha;
    // End of variables declaration//GEN-END:variables
}
