/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorAbonado;
import controlador.ControladorCorreos;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Correos;

/**
 *
 *
 */
public class JPCorreos extends javax.swing.JPanel {

    /**
     * Creates new form JPEquipo
     */
    ControladorCorreos cc;
    ControladorAbonado controladorAbonado;

    public JPCorreos() {
        initComponents();
        cc = new ControladorCorreos();
        controladorAbonado=new ControladorAbonado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTEmail1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jCBAbonado1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jCBAbonado2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jTEmail2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBModificar3 = new javax.swing.JButton();
        jTEmail3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBAbonado3 = new javax.swing.JComboBox();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipo"));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jLabel9.setText("Email");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 40, 14);
        jPanel4.add(jTEmail1);
        jTEmail1.setBounds(90, 10, 100, 20);

        jLabel6.setText("Abonado");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 70, 14);

        jBLimpiar1.setText("Limpiar");
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(40, 90, 72, 23);

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBCrear1);
        jBCrear1.setBounds(130, 90, 60, 23);

        jCBAbonado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Abonado", " " }));
        jCBAbonado1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBAbonado1PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel4.add(jCBAbonado1);
        jCBAbonado1.setBounds(90, 40, 100, 20);

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel1.setLayout(null);

        jLabel1.setText("Abonado");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 60, 14);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Cod Abonado", "Abonado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTResultados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 390, 125);

        jBConsultar2.setText("Consultar");
        jBConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar2);
        jBConsultar2.setBounds(250, 10, 90, 23);

        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar2);
        jBLimpiar2.setBounds(250, 40, 90, 23);

        jCBAbonado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Abonado", " " }));
        jCBAbonado2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBAbonado2PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel1.add(jCBAbonado2);
        jCBAbonado2.setBounds(80, 40, 100, 20);

        jLabel13.setText("Email");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 10, 40, 14);
        jPanel1.add(jTEmail2);
        jTEmail2.setBounds(80, 10, 100, 20);

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(null);

        jBModificar3.setText("Modificar");
        jBModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar3ActionPerformed(evt);
            }
        });
        jPanel2.add(jBModificar3);
        jBModificar3.setBounds(80, 80, 90, 23);

        jTEmail3.setEditable(false);
        jPanel2.add(jTEmail3);
        jTEmail3.setBounds(80, 10, 100, 20);

        jLabel14.setText("Email");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 10, 40, 14);

        jLabel2.setText("Abonado");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 40, 60, 14);

        jCBAbonado3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Abonado", " " }));
        jCBAbonado3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBAbonado3PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(jCBAbonado3);
        jCBAbonado3.setBounds(80, 40, 100, 20);

        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 410, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed
        int guardar = -1;
        try {
            String codigo_abonado[] = new String[2];
            codigo_abonado = jCBAbonado1.getSelectedItem().toString().split(" - ");
            guardar = cc.guardar(
                    jTEmail1.getText(),
                    codigo_abonado[0]
                    );
        } catch (Exception e) {
        }

        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo crear el Correo", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "Correo Creado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTEmail2.setText(jTEmail1.getText());
            jBConsultar2.doClick();
            jBLimpiar1.doClick();
            jTabbedPane1.setSelectedIndex(1);

        }

   }//GEN-LAST:event_jBCrear1ActionPerformed

    private void jBConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar2ActionPerformed
        // TODO add your handling code here:
        LinkedList consulta = new LinkedList();
        try {
            String codigo_abonado[] = new String[2];
            codigo_abonado = jCBAbonado2.getSelectedItem().toString().split(" - ");
            
            consulta = cc.consultar(
                    jTEmail2.getText(),
                    codigo_abonado[0]);

            Object[][] s = new Object[consulta.size()][3];
            for (int i = 0; i < consulta.size(); i++) {
                Correos c = (Correos) consulta.get(i);
                if (c.getEmail() != null) {
                    s[i][0] = c.getEmail();
                    s[i][1] = c.getId_abonado().getId();
                    s[i][2] = c.getId_abonado().getNombres();
                } else {
                    s = null;
                }
            }
            TableModel myModel = new DefaultTableModel(s, new String[]{"Email", "Cod Abonado", "Abonado"}) {

                boolean[] canEdit = new boolean[]{false, false, false};

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            ///remover filas
            jTResultados.setModel(myModel);
            jTResultados.setRowSorter(new TableRowSorter(myModel));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBConsultar2ActionPerformed

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
        limpiarCamposConsultar();
   }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jBModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar3ActionPerformed
        // TODO add your handling code here:
        int editar = -1;
        try {
            String codigo_abonado[] = new String[2];
            codigo_abonado = jCBAbonado3.getSelectedItem().toString().split(" - ");
            
            editar = cc.editar(
                    jTEmail3.getText(),
                    codigo_abonado[0]);
        } catch (Exception e) {
            System.out.print(e);
        }
        if (editar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo modificar el Correo", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Correo modificado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTEmail2.setText(jTEmail3.getText());
            jBConsultar2.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposModificar();
        }
    }//GEN-LAST:event_jBModificar3ActionPerformed

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTResultados.getSelectedRow();
        jTEmail3.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void jCBAbonado1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBAbonado1PopupMenuWillBecomeVisible
        // TODO add your handling code here:
         jCBAbonado1.setModel(
                new javax.swing.DefaultComboBoxModel(controladorAbonado.listar()));
    }//GEN-LAST:event_jCBAbonado1PopupMenuWillBecomeVisible

    private void jCBAbonado2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBAbonado2PopupMenuWillBecomeVisible
        // TODO add your handling code here:
         jCBAbonado2.setModel(
                new javax.swing.DefaultComboBoxModel(controladorAbonado.listar()));
    
    }//GEN-LAST:event_jCBAbonado2PopupMenuWillBecomeVisible

    private void jCBAbonado3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBAbonado3PopupMenuWillBecomeVisible
 jCBAbonado3.setModel(
                new javax.swing.DefaultComboBoxModel(controladorAbonado.listar()));
            // TODO add your handling code here:
    }//GEN-LAST:event_jCBAbonado3PopupMenuWillBecomeVisible
    private void limpiarCamposModificar() {
        jTEmail3.setText("");
        jCBAbonado3.setSelectedIndex(0);
    }

    private void limpiarCamposCrear() {
        jTEmail1.setText("");
        jCBAbonado1.setSelectedIndex(0);
    }

    private void limpiarCamposConsultar() {
        jTEmail2.setText("");
        jCBAbonado2.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JComboBox jCBAbonado1;
    private javax.swing.JComboBox jCBAbonado2;
    private javax.swing.JComboBox jCBAbonado3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTEmail1;
    private javax.swing.JTextField jTEmail2;
    private javax.swing.JTextField jTEmail3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
