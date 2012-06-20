/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author juandapp
 */
public class GuiPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form GuiPrincipal
     */
    public GuiPrincipal() {
        initComponents();
        jPPrincipal.setLayout(new FlowLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMISucursal = new javax.swing.JMenuItem();
        jMIAbonado = new javax.swing.JMenuItem();
        jMIEquipo = new javax.swing.JMenuItem();
        jMIEmpleado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPPrincipal.setLayout(null);

        jMenu3.setText("Opciones");

        jMISucursal.setText("Sucursal");
        jMISucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISucursalActionPerformed(evt);
            }
        });
        jMenu3.add(jMISucursal);

        jMIAbonado.setText("Abonado");
        jMenu3.add(jMIAbonado);

        jMIEquipo.setText("Equipo");
        jMIEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEquipoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIEquipo);

        jMIEmpleado.setText("Empleado");
        jMIEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIEmpleado);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMISucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISucursalActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPSucursal(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMISucursalActionPerformed

    private void jMIEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEmpleadoActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPEmpleado(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIEmpleadoActionPerformed

    private void jMIEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEquipoActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPEquipo(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIEquipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            try {
                javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
        //    java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuiPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMIAbonado;
    private javax.swing.JMenuItem jMIEmpleado;
    private javax.swing.JMenuItem jMIEquipo;
    private javax.swing.JMenuItem jMISucursal;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPPrincipal;
    // End of variables declaration//GEN-END:variables
}
