/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFrame;

/**
 *
 * @author Juan
 */
public class JPAbonados extends javax.swing.JFrame {

    /**
     * Creates new form JPAbonados
     */
    public JPAbonados() {
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
        jPanel1 = new javax.swing.JPanel();
        jBConsultar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTFNombre6 = new javax.swing.JTextField();
        jTFNombre7 = new javax.swing.JTextField();
        jTFNombre8 = new javax.swing.JTextField();
        jTFNombre9 = new javax.swing.JTextField();
        jTFTelefono2 = new javax.swing.JTextField();
        jTFDireccion2 = new javax.swing.JTextField();
        jTFCiudad2 = new javax.swing.JTextField();
        jTFCodigo2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jTFNombre11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTFNombre12 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTFNombre15 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTFNombre16 = new javax.swing.JTextField();
        jTFNombre17 = new javax.swing.JTextField();
        jTFNombre18 = new javax.swing.JTextField();
        jTFNombre19 = new javax.swing.JTextField();
        jTFNombre20 = new javax.swing.JTextField();
        jTFNombre21 = new javax.swing.JTextField();
        jTFNombre22 = new javax.swing.JTextField();
        jTFTelefono3 = new javax.swing.JTextField();
        jTFDireccion3 = new javax.swing.JTextField();
        jTFCiudad3 = new javax.swing.JTextField();
        jTFNombre23 = new javax.swing.JTextField();
        jTFCodigo3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Abonado"));
        jPanel3.setLayout(null);

        jPanel1.setLayout(null);

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar);
        jBConsultar.setBounds(280, 10, 90, 23);

        jLabel15.setText("Id");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 10, 10, 14);
        jPanel1.add(jTFNombre6);
        jTFNombre6.setBounds(130, 250, 140, 20);
        jPanel1.add(jTFNombre7);
        jTFNombre7.setBounds(130, 220, 140, 20);
        jPanel1.add(jTFNombre8);
        jTFNombre8.setBounds(130, 190, 140, 20);
        jPanel1.add(jTFNombre9);
        jTFNombre9.setBounds(130, 160, 140, 20);
        jPanel1.add(jTFTelefono2);
        jTFTelefono2.setBounds(130, 130, 140, 20);
        jPanel1.add(jTFDireccion2);
        jTFDireccion2.setBounds(130, 100, 140, 20);
        jPanel1.add(jTFCiudad2);
        jTFCiudad2.setBounds(130, 70, 140, 20);
        jPanel1.add(jTFCodigo2);
        jTFCodigo2.setBounds(130, 10, 100, 20);

        jLabel16.setText("Tipo de Documento");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 40, 100, 14);

        jLabel17.setText("Nombres");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(20, 70, 50, 14);

        jLabel18.setText("Apellidos");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(20, 100, 70, 14);

        jLabel19.setText("Direccion");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 130, 43, 14);

        jLabel20.setText("Genero");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(20, 160, 50, 10);

        jLabel21.setText("Estado Civil");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(20, 190, 100, 20);

        jLabel22.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(20, 220, 110, 20);

        jLabel23.setText("Comuna");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(20, 250, 60, 20);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Genero", "Estado Civil", "Ciudad", "Imei"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTResultados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 410, 660, 80);

        jLabel24.setText("Ciudad");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(20, 310, 60, 20);
        jPanel1.add(jTFNombre11);
        jTFNombre11.setBounds(130, 310, 140, 20);

        jLabel25.setText("Barrio");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(20, 280, 60, 20);
        jPanel1.add(jTFNombre12);
        jTFNombre12.setBounds(130, 280, 140, 20);

        jLabel26.setText("Tipo");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(20, 340, 60, 20);

        jLabel27.setText("Imei");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(20, 370, 60, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(130, 370, 56, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(130, 40, 56, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(130, 340, 56, 20);

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(null);
        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear Abonado"));
        jPanel5.setLayout(null);
        jPanel5.add(jTFNombre15);
        jTFNombre15.setBounds(130, 380, 140, 20);

        jLabel28.setText("Imei");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(10, 380, 60, 20);

        jLabel29.setText("Tipo");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(10, 350, 60, 20);

        jLabel30.setText("Ciudad");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(10, 320, 60, 20);

        jLabel31.setText("Barrio");
        jPanel5.add(jLabel31);
        jLabel31.setBounds(10, 290, 60, 20);

        jLabel32.setText("Comuna");
        jPanel5.add(jLabel32);
        jLabel32.setBounds(10, 260, 60, 20);
        jPanel5.add(jTFNombre16);
        jTFNombre16.setBounds(130, 260, 140, 20);
        jPanel5.add(jTFNombre17);
        jTFNombre17.setBounds(130, 290, 140, 20);
        jPanel5.add(jTFNombre18);
        jTFNombre18.setBounds(130, 320, 140, 20);
        jPanel5.add(jTFNombre19);
        jTFNombre19.setBounds(130, 350, 140, 20);
        jPanel5.add(jTFNombre20);
        jTFNombre20.setBounds(130, 230, 140, 20);
        jPanel5.add(jTFNombre21);
        jTFNombre21.setBounds(130, 200, 140, 20);
        jPanel5.add(jTFNombre22);
        jTFNombre22.setBounds(130, 170, 140, 20);
        jPanel5.add(jTFTelefono3);
        jTFTelefono3.setBounds(130, 140, 140, 20);
        jPanel5.add(jTFDireccion3);
        jTFDireccion3.setBounds(130, 110, 140, 20);
        jPanel5.add(jTFCiudad3);
        jTFCiudad3.setBounds(130, 80, 140, 20);
        jPanel5.add(jTFNombre23);
        jTFNombre23.setBounds(130, 50, 140, 20);
        jPanel5.add(jTFCodigo3);
        jTFCodigo3.setBounds(130, 20, 100, 20);

        jLabel33.setText("Id");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(20, 20, 10, 14);

        jLabel34.setText("Tipo de Documento");
        jPanel5.add(jLabel34);
        jLabel34.setBounds(10, 50, 60, 14);

        jLabel35.setText("Nombres");
        jPanel5.add(jLabel35);
        jLabel35.setBounds(10, 90, 50, 14);

        jLabel36.setText("Apellidos");
        jPanel5.add(jLabel36);
        jLabel36.setBounds(10, 120, 70, 14);

        jLabel37.setText("Direccion");
        jPanel5.add(jLabel37);
        jLabel37.setBounds(10, 140, 43, 14);

        jLabel38.setText("Genero");
        jPanel5.add(jLabel38);
        jLabel38.setBounds(10, 170, 80, 20);

        jLabel39.setText("Estado Civil");
        jPanel5.add(jLabel39);
        jLabel39.setBounds(10, 200, 100, 20);

        jLabel40.setText("Fecha de Nacimiento");
        jPanel5.add(jLabel40);
        jLabel40.setBounds(10, 230, 110, 20);

        jBLimpiar.setText("Limpiar");

        jBCrear.setText("Crear");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 388, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBCrear))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 680, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed

    }//GEN-LAST:event_jBCrearActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JPAbonados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPAbonados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPAbonados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPAbonados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JPAbonados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCiudad2;
    private javax.swing.JTextField jTFCiudad3;
    private javax.swing.JTextField jTFCodigo2;
    private javax.swing.JTextField jTFCodigo3;
    private javax.swing.JTextField jTFDireccion2;
    private javax.swing.JTextField jTFDireccion3;
    private javax.swing.JTextField jTFNombre11;
    private javax.swing.JTextField jTFNombre12;
    private javax.swing.JTextField jTFNombre15;
    private javax.swing.JTextField jTFNombre16;
    private javax.swing.JTextField jTFNombre17;
    private javax.swing.JTextField jTFNombre18;
    private javax.swing.JTextField jTFNombre19;
    private javax.swing.JTextField jTFNombre20;
    private javax.swing.JTextField jTFNombre21;
    private javax.swing.JTextField jTFNombre22;
    private javax.swing.JTextField jTFNombre23;
    private javax.swing.JTextField jTFNombre6;
    private javax.swing.JTextField jTFNombre7;
    private javax.swing.JTextField jTFNombre8;
    private javax.swing.JTextField jTFNombre9;
    private javax.swing.JTextField jTFTelefono2;
    private javax.swing.JTextField jTFTelefono3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
