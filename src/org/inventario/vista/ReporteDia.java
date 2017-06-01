/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.inventario.vista;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import org.inventario.bean.Pedido;
import org.inventario.bean.SubPedido;
import org.inventario.controlador.ControladorEntrega;
import org.inventario.controlador.ControladorPedido;
import org.inventario.controlador.ControladorSubPedido;

/**
 *
 * @author dafuentes
 */
public class ReporteDia extends javax.swing.JFrame {
    
    private ControladorEntrega ctl_entrega = new ControladorEntrega().getInstance();
    private ControladorPedido ctl_pedido = new ControladorPedido().getInstance();
    private ControladorSubPedido ctl_subPedido = new ControladorSubPedido().getInstance();
    /**
     * Creates new form ReporteDia
     */
    public ReporteDia() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_sesion4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_entrega = new javax.swing.JTable();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(660, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sesion4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btn_sesion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresar.png"))); // NOI18N
        btn_sesion4.setBorderPainted(false);
        btn_sesion4.setContentAreaFilled(false);
        btn_sesion4.setFocusPainted(false);
        btn_sesion4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresarPressed.png"))); // NOI18N
        btn_sesion4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresarPressed.png"))); // NOI18N
        btn_sesion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sesion4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sesion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 33, 32));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("REPORTE DE PEDIDOS POR DÍA");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 11, -1, -1));

        tbl_entrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Correlativo", "Artículo", "Fecha de Entrega"
            }
        ));
        tbl_entrega.setEnabled(false);
        tbl_entrega.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tbl_entrega);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 134, 551, 313));
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 87, 150, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 87, 51, 20));

        btn_buscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/White-christmas-light-background.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sesion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sesion4ActionPerformed
        VentanaReporte ventana = new VentanaReporte();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_sesion4ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Date date = txt_fecha.getDate();
        String fecha = "";
        if (date != null) {
            fecha = DateFormat.getDateInstance().format(date);
        } 
        
        DefaultTableModel model = (DefaultTableModel) tbl_entrega.getModel();
        model.setRowCount(0);
        for (Pedido t : ctl_pedido.consultaReporteDia(fecha) ) {
            String productos = "| ";
            for (SubPedido objeto: ctl_subPedido.buscar(t.getId())) {
                productos += objeto.getArticulo().getNombre() + " | ";
            }
            Object rowData[] = {t.getId(), productos, t.getFechaEntrega() };
            model.addRow(rowData);
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
            java.util.logging.Logger.getLogger(ReporteDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteDia().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_sesion4;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_entrega;
    private com.toedter.calendar.JDateChooser txt_fecha;
    // End of variables declaration//GEN-END:variables
}
