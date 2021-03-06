/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSucursal;
import java.util.LinkedList;
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
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTFCodigo2 = new javax.swing.JTextField();
        jTFNombre2 = new javax.swing.JTextField();
        jTFCiudad2 = new javax.swing.JTextField();
        jTFDireccion2 = new javax.swing.JTextField();
        jTFTelefono2 = new javax.swing.JTextField();
        jBModificar3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sucursal"));
        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        jBLimpiar1.setText("Limpiar");
        jBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(130, 170, 72, 23);

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBCrear1);
        jBCrear1.setBounds(210, 170, 70, 23);

        jLabel6.setText("Codigo");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(20, 10, 60, 14);
        jPanel4.add(jTFCodigo1);
        jTFCodigo1.setBounds(90, 10, 100, 20);

        jLabel7.setText("Nombre");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(20, 40, 70, 20);
        jPanel4.add(jTFNombre1);
        jTFNombre1.setBounds(90, 40, 190, 20);
        jPanel4.add(jTFCiudad1);
        jTFCiudad1.setBounds(90, 70, 190, 20);
        jPanel4.add(jTFDireccion1);
        jTFDireccion1.setBounds(90, 100, 190, 20);

        jLabel8.setText("Ciudad");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(20, 70, 60, 14);

        jLabel9.setText("Direccion");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 100, 90, 14);

        jLabel10.setText("Telefono");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 130, 90, 14);
        jPanel4.add(jTFTelefono1);
        jTFTelefono1.setBounds(90, 130, 190, 20);

        jTabbedPane1.addTab("Crear", jPanel4);

        jPanel1.setLayout(null);

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 70, 14);
        jPanel1.add(jTFCodigo);
        jTFCodigo.setBounds(80, 10, 120, 20);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 70, 20);
        jPanel1.add(jTFNombre);
        jTFNombre.setBounds(80, 40, 190, 20);

        jLabel3.setText("Ciudad");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 70, 14);
        jPanel1.add(jTFCiudad);
        jTFCiudad.setBounds(80, 70, 190, 20);

        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 100, 90, 14);
        jPanel1.add(jTFDireccion);
        jTFDireccion.setBounds(80, 100, 190, 20);

        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 130, 90, 14);
        jPanel1.add(jTFTelefono);
        jTFTelefono.setBounds(80, 130, 190, 20);

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
        jTResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTResultados);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 452, 125);

        jBConsultar2.setText("Consultar");
        jBConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar2);
        jBConsultar2.setBounds(280, 10, 90, 23);

        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar2);
        jBLimpiar2.setBounds(280, 40, 90, 23);

        jTabbedPane1.addTab("Consultar", jPanel1);

        jPanel2.setLayout(null);

        jTFCodigo2.setEditable(false);
        jPanel2.add(jTFCodigo2);
        jTFCodigo2.setBounds(80, 10, 100, 20);
        jPanel2.add(jTFNombre2);
        jTFNombre2.setBounds(80, 40, 190, 20);
        jPanel2.add(jTFCiudad2);
        jTFCiudad2.setBounds(80, 70, 190, 20);
        jPanel2.add(jTFDireccion2);
        jTFDireccion2.setBounds(80, 100, 190, 20);
        jPanel2.add(jTFTelefono2);
        jTFTelefono2.setBounds(80, 130, 190, 20);

        jBModificar3.setText("Modificar");
        jBModificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificar3ActionPerformed(evt);
            }
        });
        jPanel2.add(jBModificar3);
        jBModificar3.setBounds(180, 160, 90, 23);

        jLabel16.setText("Telefono");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 130, 90, 14);

        jLabel17.setText("Direccion");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 100, 100, 14);

        jLabel18.setText("Ciudad");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 70, 50, 14);

        jLabel19.setText("Nombre");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 40, 80, 14);

        jLabel20.setText("Codigo");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 10, 60, 14);

        jTabbedPane1.addTab("Editar", jPanel2);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 470, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar2ActionPerformed

        LinkedList consulta = new LinkedList();
        try {
            consulta = cs.consultar(
                    jTFCodigo.getText(),
                    jTFNombre.getText(),
                    jTFCiudad.getText(),
                    jTFDireccion.getText(),
                    jTFTelefono.getText());

            Object[][] s = new Object[consulta.size()][5];
            for (int i = 0; i < consulta.size(); i++) {
                Sucursal suc = (Sucursal) consulta.get(i);
                if (suc.getNombre() != null) {
                    s[i][0] = suc.getCod_sucursal();
                    s[i][1] = suc.getNombre();
                    s[i][2] = suc.getCiudad();
                    s[i][3] = suc.getDireccion();
                    s[i][4] = suc.getTelefono();
                } else {
                    s = null;
                }
            }
            TableModel myModel = new DefaultTableModel(s, new String[]{"Codigo", "Nombre", "Ciudad", "Direccion", "Telefono"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false, false
                };

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

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed
        int guardar = -1;
        try {
            guardar = cs.guardar(
                    jTFCodigo1.getText(),
                    jTFNombre1.getText(),
                    jTFCiudad1.getText(),
                    jTFDireccion1.getText(),
                    jTFTelefono1.getText());
        } catch (Exception e) {
        }

        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo crear la Sucursal", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sucursal Creada correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTFCodigo.setText(jTFCodigo1.getText());
            jBConsultar2.doClick();
            jBLimpiar1.doClick();
            jTabbedPane1.setSelectedIndex(1);

        }

    }//GEN-LAST:event_jBCrear1ActionPerformed

    private void jBModificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificar3ActionPerformed
        int editar = -1;
        try {
            editar = cs.editar(
                    jTFCodigo2.getText(),
                    jTFNombre2.getText(),
                    jTFCiudad2.getText(),
                    jTFDireccion2.getText(),
                    jTFTelefono2.getText());
        } catch (Exception e) {
            System.out.print(e);
        }
        if (editar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo modificar la Sucursal", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Sucursal modificada correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTFCodigo.setText(jTFCodigo2.getText());
            jBConsultar2.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposModificar();
        }
    }//GEN-LAST:event_jBModificar3ActionPerformed

    private void jBLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar1ActionPerformed
        limpiarCamposCrear();
    }//GEN-LAST:event_jBLimpiar1ActionPerformed

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
        int selectedRow = jTResultados.getSelectedRow();
        jTFCodigo2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));
        jTFNombre2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 1));
        jTFCiudad2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 2));
        jTFDireccion2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 3));
        jTFTelefono2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 4));
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
       limpiarCamposConsultar();
       jBConsultar2.doClick();
    }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void limpiarCamposModificar() {
        jTFCodigo2.setText("");
        jTFNombre2.setText("");
        jTFCiudad2.setText("");
        jTFDireccion2.setText("");
        jTFTelefono2.setText("");
    }

    private void limpiarCamposCrear() {
        jTFCodigo1.setText("");
        jTFNombre1.setText("");
        jTFCiudad1.setText("");
        jTFDireccion1.setText("");
        jTFTelefono1.setText("");
    }

    private void limpiarCamposConsultar() {
        jTFCodigo.setText("");
        jTFNombre.setText("");
        jTFCiudad.setText("");
        jTFDireccion.setText("");
        jTFTelefono.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
