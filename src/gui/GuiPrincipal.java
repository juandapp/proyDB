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
        jMIPlanPostpago = new javax.swing.JMenuItem();
        jMIPlanPrepago = new javax.swing.JMenuItem();
        jMIEmpresa = new javax.swing.JMenuItem();
        jMIEmpleado = new javax.swing.JMenuItem();
        jMICompaniaInternacional = new javax.swing.JMenuItem();
        jMICompaniaLocal = new javax.swing.JMenuItem();
        jMISimCard = new javax.swing.JMenuItem();
        jMIRecarga = new javax.swing.JMenuItem();
        jMICorreo = new javax.swing.JMenuItem();
        jMIPlanDatos = new javax.swing.JMenuItem();
        jMIRegistroLocal = new javax.swing.JMenuItem();
        jMIContrato = new javax.swing.JMenuItem();
        jMIRobo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMIMensaje_entrante_roaming = new javax.swing.JMenuItem();

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
        jMIAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAbonadoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIAbonado);

        jMIEquipo.setText("Equipo");
        jMIEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEquipoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIEquipo);

        jMIPlanPostpago.setText("Plan Postpago");
        jMIPlanPostpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPlanPostpagoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIPlanPostpago);

        jMIPlanPrepago.setText("Plan Prepago");
        jMIPlanPrepago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPlanPrepagoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIPlanPrepago);

        jMIEmpresa.setText("Empresa");
        jMIEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmpresaActionPerformed(evt);
            }
        });
        jMenu3.add(jMIEmpresa);

        jMIEmpleado.setText("Empleado");
        jMIEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIEmpleado);

        jMICompaniaInternacional.setText("Compania Internacional");
        jMICompaniaInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICompaniaInternacionalActionPerformed(evt);
            }
        });
        jMenu3.add(jMICompaniaInternacional);

        jMICompaniaLocal.setText("Compania Local");
        jMICompaniaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICompaniaLocalActionPerformed(evt);
            }
        });
        jMenu3.add(jMICompaniaLocal);

        jMISimCard.setText("SimCard");
        jMISimCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISimCardActionPerformed(evt);
            }
        });
        jMenu3.add(jMISimCard);

        jMIRecarga.setText("Recarga");
        jMIRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRecargaActionPerformed(evt);
            }
        });
        jMenu3.add(jMIRecarga);

        jMICorreo.setText("Correo");
        jMICorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICorreoActionPerformed(evt);
            }
        });
        jMenu3.add(jMICorreo);

        jMIPlanDatos.setText("Plan de Datos");
        jMIPlanDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPlanDatosActionPerformed(evt);
            }
        });
        jMenu3.add(jMIPlanDatos);

        jMIRegistroLocal.setText("Registro Local");
        jMIRegistroLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRegistroLocalActionPerformed(evt);
            }
        });
        jMenu3.add(jMIRegistroLocal);

        jMIContrato.setText("Contrato");
        jMIContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIContratoActionPerformed(evt);
            }
        });
        jMenu3.add(jMIContrato);

        jMIRobo.setText("Reporte Robo");
        jMIRobo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRoboActionPerformed(evt);
            }
        });
        jMenu3.add(jMIRobo);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Roaming");

        jMIMensaje_entrante_roaming.setText("Roaming");
        jMIMensaje_entrante_roaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMensaje_entrante_roamingActionPerformed(evt);
            }
        });
        jMenu1.add(jMIMensaje_entrante_roaming);

        jMenuBar1.add(jMenu1);

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

    private void jMIAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAbonadoActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPAbonado(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIAbonadoActionPerformed

    private void jMIPlanPostpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPlanPostpagoActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPPlanPostpago(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIPlanPostpagoActionPerformed

    private void jMIEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEmpresaActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPEmpresa(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMIEmpresaActionPerformed

    private void jMICompaniaInternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICompaniaInternacionalActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPCompaniaInternacional(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMICompaniaInternacionalActionPerformed

    private void jMICompaniaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICompaniaLocalActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPCompaniaLocal(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMICompaniaLocalActionPerformed

    private void jMISimCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISimCardActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPSimCard(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMISimCardActionPerformed

    private void jMIPlanPrepagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPlanPrepagoActionPerformed
        // TODO add your handling code here:
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPPlanPrepago(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIPlanPrepagoActionPerformed

    private void jMICorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICorreoActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPCorreos(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMICorreoActionPerformed

    private void jMIRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRecargaActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPRecarga(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIRecargaActionPerformed

    private void jMIMensaje_entrante_roamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMensaje_entrante_roamingActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPRoaming(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIMensaje_entrante_roamingActionPerformed

    private void jMIPlanDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPlanDatosActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPPlanDatos(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIPlanDatosActionPerformed

    private void jMIRegistroLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRegistroLocalActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPRegistroLocal(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIRegistroLocalActionPerformed

    private void jMIContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIContratoActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPContrato(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }    }//GEN-LAST:event_jMIContratoActionPerformed

    private void jMIRoboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRoboActionPerformed
        try {
            jPPrincipal.removeAll();
            jPPrincipal.add(new JPRobo(), BorderLayout.CENTER);
            jPPrincipal.updateUI();
            this.pack();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMIRoboActionPerformed

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
    private javax.swing.JMenuItem jMICompaniaInternacional;
    private javax.swing.JMenuItem jMICompaniaLocal;
    private javax.swing.JMenuItem jMIContrato;
    private javax.swing.JMenuItem jMICorreo;
    private javax.swing.JMenuItem jMIEmpleado;
    private javax.swing.JMenuItem jMIEmpresa;
    private javax.swing.JMenuItem jMIEquipo;
    private javax.swing.JMenuItem jMIMensaje_entrante_roaming;
    private javax.swing.JMenuItem jMIPlanDatos;
    private javax.swing.JMenuItem jMIPlanPostpago;
    private javax.swing.JMenuItem jMIPlanPrepago;
    private javax.swing.JMenuItem jMIRecarga;
    private javax.swing.JMenuItem jMIRegistroLocal;
    private javax.swing.JMenuItem jMIRobo;
    private javax.swing.JMenuItem jMISimCard;
    private javax.swing.JMenuItem jMISucursal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPPrincipal;
    // End of variables declaration//GEN-END:variables
}
