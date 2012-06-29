/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorEquipo;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Equipo;

/**
 *
 *
 */
public class JPRecarga extends javax.swing.JPanel {

    /**
     * Creates new form JPEquipo
     */
    ControladorEquipo ce;

    public JPRecarga() {
        initComponents();
        ce = new ControladorEquipo();
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
        jTFValor1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jCBMedioRecarga1 = new javax.swing.JComboBox();
        jCBSimCard1 = new javax.swing.JComboBox();
        jDCFecha1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTFValor2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDCFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jCBMedioRecarga2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jCBSimCard2 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jBModificar3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTFValor3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jDCFecha3 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jCBMedioRecarga3 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jCBSimCard3 = new javax.swing.JComboBox();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Recarga"));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jLabel9.setText("Valor");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 40, 14);
        jPanel4.add(jTFValor1);
        jTFValor1.setBounds(90, 10, 110, 20);

        jLabel6.setText("Fecha");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 70, 14);

        jLabel8.setText("Simcard");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 100, 90, 14);

        jBLimpiar1.setText("Limpiar");
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(110, 150, 72, 23);

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBCrear1);
        jBCrear1.setBounds(200, 150, 70, 23);

        jLabel13.setText("Medio Recarga");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 70, 90, 14);

        jCBMedioRecarga1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Internet", "Baloto", "Tarjeta" }));
        jCBMedioRecarga1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jCBMedioRecarga1);
        jCBMedioRecarga1.setBounds(90, 70, 150, 20);

        jCBSimCard1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Simcard", " " }));
        jCBSimCard1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(jCBSimCard1);
        jCBSimCard1.setBounds(90, 100, 150, 20);

        jDCFecha1.setDateFormatString("yyyy-MMM-dd");
        jPanel4.add(jDCFecha1);
        jDCFecha1.setBounds(90, 40, 150, 20);

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel1.setLayout(null);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valor", "Fecha", "Medio Recarga", "Simcard"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
        jScrollPane1.setBounds(10, 130, 390, 125);

        jBConsultar2.setText("Consultar");
        jBConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar2);
        jBConsultar2.setBounds(300, 10, 90, 23);

        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar2);
        jBLimpiar2.setBounds(300, 40, 90, 23);

        jLabel14.setText("Valor");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 10, 40, 14);
        jPanel1.add(jTFValor2);
        jTFValor2.setBounds(90, 10, 110, 20);

        jLabel7.setText("Fecha");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 40, 70, 14);

        jDCFecha2.setDateFormatString("yyyy-MMM-dd");
        jPanel1.add(jDCFecha2);
        jDCFecha2.setBounds(90, 40, 150, 20);

        jLabel15.setText("Medio Recarga");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 70, 90, 14);

        jCBMedioRecarga2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Internet", "Baloto", "Tarjeta" }));
        jCBMedioRecarga2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jCBMedioRecarga2);
        jCBMedioRecarga2.setBounds(90, 70, 150, 20);

        jLabel16.setText("Simcard");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 100, 90, 14);

        jCBSimCard2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Simcard", " " }));
        jCBSimCard2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jCBSimCard2);
        jCBSimCard2.setBounds(90, 100, 150, 20);

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(null);

        jBModificar3.setText("Modificar");
        jBModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar3ActionPerformed(evt);
            }
        });
        jPanel2.add(jBModificar3);
        jBModificar3.setBounds(150, 140, 90, 23);

        jLabel17.setText("Valor");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 10, 40, 14);
        jPanel2.add(jTFValor3);
        jTFValor3.setBounds(90, 10, 110, 20);

        jLabel18.setText("Fecha");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 40, 70, 14);

        jDCFecha3.setDateFormatString("yyyy-MMM-dd");
        jPanel2.add(jDCFecha3);
        jDCFecha3.setBounds(90, 40, 150, 20);

        jLabel19.setText("Medio Recarga");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 70, 90, 14);

        jCBMedioRecarga3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Internet", "Baloto", "Tarjeta" }));
        jCBMedioRecarga3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jCBMedioRecarga3);
        jCBMedioRecarga3.setBounds(90, 70, 150, 20);

        jLabel20.setText("Simcard");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 100, 90, 14);

        jCBSimCard3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Simcard", " " }));
        jCBSimCard3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jCBSimCard3);
        jCBSimCard3.setBounds(90, 100, 150, 20);

        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 420, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed

   }//GEN-LAST:event_jBCrear1ActionPerformed

    private void jBConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar2ActionPerformed

    }//GEN-LAST:event_jBConsultar2ActionPerformed

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed

   }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jBModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar3ActionPerformed
      
    }//GEN-LAST:event_jBModificar3ActionPerformed

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
       
    }//GEN-LAST:event_jTResultadosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JComboBox jCBMedioRecarga1;
    private javax.swing.JComboBox jCBMedioRecarga2;
    private javax.swing.JComboBox jCBMedioRecarga3;
    private javax.swing.JComboBox jCBSimCard1;
    private javax.swing.JComboBox jCBSimCard2;
    private javax.swing.JComboBox jCBSimCard3;
    private com.toedter.calendar.JDateChooser jDCFecha1;
    private com.toedter.calendar.JDateChooser jDCFecha2;
    private com.toedter.calendar.JDateChooser jDCFecha3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFValor1;
    private javax.swing.JTextField jTFValor2;
    private javax.swing.JTextField jTFValor3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
