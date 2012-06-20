/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSucursal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Sucursal;

/**
 *
 * @author juandapp
 */
public class JPSucursal extends javax.swing.JPanel {

    /**
     * Creates new form JPSucursal
     */
    ControladorSucursal cs;

    public JPSucursal() {
        initComponents();
        cs = new ControladorSucursal();
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
        jLabel6 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFNombre1 = new javax.swing.JTextField();
        jTFCiudad1 = new javax.swing.JTextField();
        jTFDireccion1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFTelefono1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFCiudad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTFCodigo2 = new javax.swing.JTextField();
        jTFNombre2 = new javax.swing.JTextField();
        jTFCiudad2 = new javax.swing.JTextField();
        jTFDireccion2 = new javax.swing.JTextField();
        jTFTelefono2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jBModificar3 = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sucursal"));
        jPanel3.setLayout(null);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBLimpiar1.setText("Limpiar");
        jPanel4.add(jBLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 72, -1));

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBCrear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, -1));

        jLabel6.setText("Codigo");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel4.add(jTFCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, -1));

        jLabel7.setText("Nombre");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 20));
        jPanel4.add(jTFNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, -1));
        jPanel4.add(jTFCiudad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));
        jPanel4.add(jTFDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, -1));

        jLabel8.setText("Ciudad");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel9.setText("Direccion");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jLabel10.setText("Telefono");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel4.add(jTFTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 190, -1));

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(jTFCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));
        jPanel1.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, -1));

        jLabel3.setText("Ciudad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(jTFCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, -1));

        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, -1));
        jPanel1.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 190, -1));

        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel1.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 190, -1));

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Ciudad", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 125));

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, -1));

        jBLimpiar2.setText("Limpiar");
        jPanel1.add(jBLimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, -1));

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Codigo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel2.add(jTFCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, -1));
        jPanel2.add(jTFNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, -1));
        jPanel2.add(jTFCiudad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, -1));
        jPanel2.add(jTFDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 190, -1));
        jPanel2.add(jTFTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 190, -1));

        jLabel12.setText("Telefono");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel13.setText("Direccion");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, -1));

        jLabel14.setText("Ciudad");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel15.setText("Nombre");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 20));

        jBModificar3.setText("Modificar");
        jBModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar3ActionPerformed(evt);
            }
        });
        jPanel2.add(jBModificar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 90, -1));

        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 10, 470, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

        String cod_sucursal = jTFCodigo.getText();
        Sucursal consultar =
                cs.consultar(cod_sucursal);
        /*
         * Object[][] s = {{consultar.getCod_sucursal()},
         * {consultar.getNombre()}, {consultar.getCiudad()},
         * {consultar.getDireccion()}, {consultar.getTelefono()}};
         */
if(consultar != null){
        Object[][] s = new Object[1][5];
        s[0][0] = consultar.getCod_sucursal();
        s[0][1] = consultar.getNombre();
        s[0][2] = consultar.getCiudad();
        s[0][3] = consultar.getDireccion();
        s[0][4] = consultar.getTelefono();



        TableModel myModel = new javax.swing.table.DefaultTableModel(s, new String[]{"Codigo", "Nombre", "Ciudad", "Direccion", "Telefono"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        jTResultados.setModel(myModel);
        jTResultados.setRowSorter(new TableRowSorter(myModel));

}



        /*
         *
         * DefaultTableModel modelo = new DefaultTableModel();
         * modelo.addColumn("Codigo"); modelo.addColumn("Nombre");
         * modelo.addColumn("Ciudad"); modelo.addColumn("Direccion");
         * modelo.addColumn("Telefono"); Object[] s = new Object[1]; s[0] =
         * cs.consultar(jTFCodigo.getText()); for (int i = 0; i < s.length; i++)
         * { Object[] fila = new Object[5]; fila[0]=s[0]; fila[1]=s[0];
         * fila[2]=s[0]; fila[3]=s[0]; fila[4]=s[0];
         *
         * modelo.addRow(fila); }
         */





    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed
        String cod_sucursal = jTFCodigo.getText();
        String nombre = jTFNombre.getText();
        String ciudad = jTFCiudad.getText();
        String direccion = jTFDireccion.getText();
        String telefono = jTFTelefono.getText();
        int guardar = cs.guardar(cod_sucursal, nombre, ciudad, direccion, telefono);
        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo crear la sucursal", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sucursal Creada correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBCrear1ActionPerformed

    private void jBModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificar3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCiudad;
    private javax.swing.JTextField jTFCiudad1;
    private javax.swing.JTextField jTFCiudad2;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFCodigo2;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDireccion1;
    private javax.swing.JTextField jTFDireccion2;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFTelefono1;
    private javax.swing.JTextField jTFTelefono2;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
