/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author KatheV
 */
public class JPPlanDatos extends javax.swing.JPanel {

    /**
     * Creates new form JPPlanDatos
     */
    public JPPlanDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFCostoInternet1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFCostoCorreo1 = new javax.swing.JTextField();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTFCodigo2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCostoInternet2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFCostoCorreo2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jBModificar3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTFCodigo3 = new javax.swing.JTextField();
        jTFCostoInternet3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTFCostoCorreo3 = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Plan de Datos"));
        jPanel1.setLayout(null);

        jPanel4.setLayout(null);

        jLabel9.setText("Codigo");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 14);
        jPanel4.add(jTFCodigo1);
        jTFCodigo1.setBounds(100, 10, 100, 20);

        jLabel6.setText("Costo Internet");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 90, 14);
        jPanel4.add(jTFCostoInternet1);
        jTFCostoInternet1.setBounds(100, 40, 190, 20);

        jLabel8.setText("Costo Correo");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 70, 100, 14);
        jPanel4.add(jTFCostoCorreo1);
        jTFCostoCorreo1.setBounds(100, 70, 190, 20);

        jBLimpiar1.setText("Limpiar");
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(222, 100, 80, 23);

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBCrear1);
        jBCrear1.setBounds(110, 100, 80, 23);

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel2.setLayout(null);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imei", "Modelo", "Marca"
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

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 110, 390, 125);

        jBConsultar2.setText("Consultar");
        jBConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jBConsultar2);
        jBConsultar2.setBounds(250, 10, 100, 23);

        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpiar2);
        jBLimpiar2.setBounds(250, 40, 100, 23);

        jLabel13.setText("Codigo");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 10, 50, 14);
        jPanel2.add(jTFCodigo2);
        jTFCodigo2.setBounds(100, 10, 100, 20);

        jLabel7.setText("Costo Internet <");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 40, 90, 14);
        jPanel2.add(jTFCostoInternet2);
        jTFCostoInternet2.setBounds(100, 40, 100, 20);

        jLabel14.setText("Costo Correo <");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 70, 100, 14);
        jPanel2.add(jTFCostoCorreo2);
        jTFCostoCorreo2.setBounds(100, 70, 100, 20);

        jTabbedPane1.addTab("Consultar", jPanel2);

        jPanel3.setLayout(null);

        jBModificar3.setText("Modificar");
        jBModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar3ActionPerformed(evt);
            }
        });
        jPanel3.add(jBModificar3);
        jBModificar3.setBounds(200, 100, 90, 23);

        jLabel15.setText("Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 10, 50, 14);

        jTFCodigo3.setEditable(false);
        jTFCodigo3.setEnabled(false);
        jPanel3.add(jTFCodigo3);
        jTFCodigo3.setBounds(100, 10, 100, 20);
        jPanel3.add(jTFCostoInternet3);
        jTFCostoInternet3.setBounds(100, 40, 190, 20);

        jLabel16.setText("Costo Internet");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 40, 90, 14);

        jLabel17.setText("Costo Correo");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(10, 70, 100, 14);
        jPanel3.add(jTFCostoCorreo3);
        jTFCostoCorreo3.setBounds(100, 70, 190, 20);

        jTabbedPane1.addTab("Editar", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 410, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed
       
    }//GEN-LAST:event_jBCrear1ActionPerformed

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
       
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void jBConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar2ActionPerformed
       
    }//GEN-LAST:event_jBConsultar2ActionPerformed

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
       
    }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jBModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar3ActionPerformed
       
    }//GEN-LAST:event_jBModificar3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFCodigo2;
    private javax.swing.JTextField jTFCodigo3;
    private javax.swing.JTextField jTFCostoCorreo1;
    private javax.swing.JTextField jTFCostoCorreo2;
    private javax.swing.JTextField jTFCostoCorreo3;
    private javax.swing.JTextField jTFCostoInternet1;
    private javax.swing.JTextField jTFCostoInternet2;
    private javax.swing.JTextField jTFCostoInternet3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
