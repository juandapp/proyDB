/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author JUANPAULO
 */
public class JPCompaniaLocal extends javax.swing.JPanel {

    /**
     * Creates new form JPCompaniaLocal
     */
    public JPCompaniaLocal() {
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

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTFId1 = new javax.swing.JTextField();
        jTFNombre3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTFId2 = new javax.swing.JTextField();
        jTFNombre4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBModificar3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTFId3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTFNombre5 = new javax.swing.JTextField();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Compania Local"));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jBLimpiar1.setText("Limpiar");
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(210, 40, 90, 23);

        jBCrear1.setText("Crear");
        jPanel4.add(jBCrear1);
        jBCrear1.setBounds(210, 10, 90, 23);

        jLabel11.setText("Id");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(20, 10, 10, 14);

        jLabel12.setText("Nombre");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 40, 60, 14);
        jPanel4.add(jTFId1);
        jTFId1.setBounds(80, 10, 90, 20);
        jPanel4.add(jTFNombre3);
        jTFNombre3.setBounds(80, 40, 90, 20);

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel1.setLayout(null);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane1.setBounds(20, 70, 370, 125);

        jBConsultar2.setText("Consultar");
        jPanel1.add(jBConsultar2);
        jBConsultar2.setBounds(280, 10, 90, 23);

        jBLimpiar2.setText("Limpiar");
        jPanel1.add(jBLimpiar2);
        jBLimpiar2.setBounds(280, 40, 90, 23);

        jLabel13.setText("Id");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 10, 10, 14);
        jPanel1.add(jTFId2);
        jTFId2.setBounds(80, 10, 90, 20);
        jPanel1.add(jTFNombre4);
        jTFNombre4.setBounds(80, 40, 90, 20);

        jLabel14.setText("Nombre");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 40, 60, 14);

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(null);

        jBModificar3.setText("Modificar");
        jPanel2.add(jBModificar3);
        jBModificar3.setBounds(200, 10, 90, 23);

        jLabel15.setText("Id");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 10, 10, 14);
        jPanel2.add(jTFId3);
        jTFId3.setBounds(80, 10, 90, 20);

        jLabel21.setText("Nombre");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(20, 40, 60, 14);
        jPanel2.add(jTFNombre5);
        jTFNombre5.setBounds(80, 40, 90, 20);

        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 410, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked

    }//GEN-LAST:event_jTResultadosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFId1;
    private javax.swing.JTextField jTFId2;
    private javax.swing.JTextField jTFId3;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTextField jTFNombre4;
    private javax.swing.JTextField jTFNombre5;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}