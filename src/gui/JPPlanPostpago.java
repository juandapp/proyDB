/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author JUANPAULO
 */
public class JPPlanPostpago extends javax.swing.JPanel {

    /**
     * Creates new form JPPlanPostpago
     */
    public JPPlanPostpago() {
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
        jLabel9 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFtarifa_otro_operador1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFtarifa_msj_multimedia1 = new javax.swing.JTextField();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTtarifa_msj_texto1 = new javax.swing.JTextField();
        jTtotal_minutos1 = new javax.swing.JTextField();
        jTcosto_min_adicional1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTFCodigo2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFtarifa_otro_operador2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTFtarifa_msj_multimedia2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTtarifa_msj_texto2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTtotal_minutos2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTcosto_min_adicional2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBModificar3 = new javax.swing.JButton();
        jTFtarifa_msj_multimedia3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTFCodigo4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTcosto_min_adicional3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTtotal_minutos3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTtarifa_msj_texto3 = new javax.swing.JTextField();
        jTFtarifa_otro_operador3 = new javax.swing.JTextField();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Plan Postpago"));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jLabel9.setText("Codigo");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(10, 10, 60, 14);
        jPanel4.add(jTFCodigo1);
        jTFCodigo1.setBounds(120, 10, 100, 20);

        jLabel6.setText("Tarifa otro op.");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 70, 14);
        jPanel4.add(jTFtarifa_otro_operador1);
        jTFtarifa_otro_operador1.setBounds(120, 40, 110, 20);

        jLabel8.setText("Costo min adicional");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 160, 110, 14);
        jPanel4.add(jTFtarifa_msj_multimedia1);
        jTFtarifa_msj_multimedia1.setBounds(120, 70, 110, 20);

        jBLimpiar1.setText("Limpiar");
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(50, 190, 72, 23);

        jBCrear1.setText("Crear");
        jPanel4.add(jBCrear1);
        jBCrear1.setBounds(160, 190, 70, 23);

        jLabel13.setText("Tarifa msj multimedia");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 70, 120, 14);

        jLabel14.setText("Tarifa msj texto");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(10, 100, 100, 14);

        jLabel15.setText("Total minutos");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(10, 130, 100, 14);

        jTtarifa_msj_texto1.setText(" ");
        jPanel4.add(jTtarifa_msj_texto1);
        jTtarifa_msj_texto1.setBounds(120, 100, 110, 20);
        jPanel4.add(jTtotal_minutos1);
        jTtotal_minutos1.setBounds(120, 130, 110, 20);
        jPanel4.add(jTcosto_min_adicional1);
        jTcosto_min_adicional1.setBounds(120, 160, 110, 20);

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel1.setLayout(null);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "T. otro operador", "T. msj multimedia", "T. msj texto", "Total minutos", "Costo min adicional"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane1.setBounds(10, 140, 470, 125);

        jBConsultar2.setText("Consultar");
        jPanel1.add(jBConsultar2);
        jBConsultar2.setBounds(270, 100, 90, 23);

        jBLimpiar2.setText("Limpiar");
        jPanel1.add(jBLimpiar2);
        jBLimpiar2.setBounds(380, 100, 90, 23);

        jLabel16.setText("Codigo");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 10, 60, 14);
        jPanel1.add(jTFCodigo2);
        jTFCodigo2.setBounds(120, 10, 100, 20);

        jLabel7.setText("Tarifa otro op.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 40, 70, 14);
        jPanel1.add(jTFtarifa_otro_operador2);
        jTFtarifa_otro_operador2.setBounds(120, 40, 110, 20);

        jLabel17.setText("Tarifa msj multimedia");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(10, 70, 120, 14);
        jPanel1.add(jTFtarifa_msj_multimedia2);
        jTFtarifa_msj_multimedia2.setBounds(120, 70, 110, 20);

        jLabel18.setText("Tarifa msj texto");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(270, 10, 100, 14);

        jTtarifa_msj_texto2.setText(" ");
        jPanel1.add(jTtarifa_msj_texto2);
        jTtarifa_msj_texto2.setBounds(380, 10, 110, 20);

        jLabel19.setText("Total minutos");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(270, 40, 100, 14);
        jPanel1.add(jTtotal_minutos2);
        jTtotal_minutos2.setBounds(380, 40, 110, 20);

        jLabel20.setText("Costo min adicional");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(270, 70, 110, 14);
        jPanel1.add(jTcosto_min_adicional2);
        jTcosto_min_adicional2.setBounds(380, 70, 110, 20);

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(null);

        jBModificar3.setText("Modificar");
        jPanel2.add(jBModificar3);
        jBModificar3.setBounds(120, 200, 90, 23);
        jPanel2.add(jTFtarifa_msj_multimedia3);
        jTFtarifa_msj_multimedia3.setBounds(120, 70, 110, 20);

        jLabel21.setText("Tarifa msj texto");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(10, 100, 100, 14);

        jTFCodigo4.setEditable(false);
        jTFCodigo4.setEnabled(false);
        jPanel2.add(jTFCodigo4);
        jTFCodigo4.setBounds(120, 10, 100, 20);

        jLabel22.setText("Total minutos");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(10, 130, 100, 14);

        jLabel23.setText("Codigo");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(10, 10, 60, 14);
        jPanel2.add(jTcosto_min_adicional3);
        jTcosto_min_adicional3.setBounds(120, 160, 110, 20);

        jLabel24.setText("Tarifa msj multimedia");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(10, 70, 120, 14);

        jLabel25.setText("Tarifa otro op.");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(10, 40, 70, 14);
        jPanel2.add(jTtotal_minutos3);
        jTtotal_minutos3.setBounds(120, 130, 110, 20);

        jLabel26.setText("Costo min adicional");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(10, 160, 110, 14);

        jTtarifa_msj_texto3.setText(" ");
        jPanel2.add(jTtarifa_msj_texto3);
        jTtarifa_msj_texto3.setBounds(120, 100, 110, 20);
        jPanel2.add(jTFtarifa_otro_operador3);
        jTFtarifa_otro_operador3.setBounds(120, 40, 110, 20);

        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 500, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JTextField jTFCodigo4;
    private javax.swing.JTextField jTFtarifa_msj_multimedia1;
    private javax.swing.JTextField jTFtarifa_msj_multimedia2;
    private javax.swing.JTextField jTFtarifa_msj_multimedia3;
    private javax.swing.JTextField jTFtarifa_otro_operador1;
    private javax.swing.JTextField jTFtarifa_otro_operador2;
    private javax.swing.JTextField jTFtarifa_otro_operador3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTcosto_min_adicional1;
    private javax.swing.JTextField jTcosto_min_adicional2;
    private javax.swing.JTextField jTcosto_min_adicional3;
    private javax.swing.JTextField jTtarifa_msj_texto1;
    private javax.swing.JTextField jTtarifa_msj_texto2;
    private javax.swing.JTextField jTtarifa_msj_texto3;
    private javax.swing.JTextField jTtotal_minutos1;
    private javax.swing.JTextField jTtotal_minutos2;
    private javax.swing.JTextField jTtotal_minutos3;
    // End of variables declaration//GEN-END:variables
}
