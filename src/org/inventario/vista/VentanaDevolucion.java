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
        guardar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 370));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 370));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sesion.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btn_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresar.png"))); // NOI18N
        btn_sesion.setBorderPainted(false);
        btn_sesion.setContentAreaFilled(false);
        btn_sesion.setFocusPainted(false);
        btn_sesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresarPressed.png"))); // NOI18N
        btn_sesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresarPressed.png"))); // NOI18N
        btn_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 52, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("Devolución");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 11, 202, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Código Pedido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 104, -1, -1));

        cb_devolver.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(cb_devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 136, 120, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Artículo a devolver");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 135, -1, -1));

        txt_codigo.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 105, 120, -1));

        cb_enviar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cb_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_enviarActionPerformed(evt);
            }
        });
        getContentPane().add(cb_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 120, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Artículo a enviar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btn_guardar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquette.png"))); // NOI18N
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setFocusPainted(false);
        btn_guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquette pressed.png"))); // NOI18N
        btn_guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquette pressed.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 262, 70, -1));
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 224, 120, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Fecha de entrega");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 224, -1, -1));

        btn_buscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorderPainted(false);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setFocusPainted(false);
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search pressed.png"))); // NOI18N
        btn_buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search pressed.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 120, -1));

        guardar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar.setText("Guardar");
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 73, -1));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/White-christmas-light-background.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));

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
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_codigo;
    private com.toedter.calendar.JDateChooser txt_fecha;
    // End of variables declaration//GEN-END:variables
}
