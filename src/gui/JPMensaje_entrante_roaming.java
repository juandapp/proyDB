/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSimcard;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Simcard;

/**
 *
 * @author JUANPAULO
 */
public class JPMensaje_entrante_roaming extends javax.swing.JPanel {

    /**
     * Creates new form JPMensaje_entrante_roaming
     */
    ControladorSimcard cs;

    public JPMensaje_entrante_roaming() {
        cs = new ControladorSimcard();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBConsultar1 = new javax.swing.JButton();
        jBLimpiar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCBautorizacion_roaming1 = new javax.swing.JComboBox();
        jCBActivacion_Internet1 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jTFnum_telefono1 = new javax.swing.JTextField();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCBactivacion_correo1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jCBbloqueado_por_robo1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTFSimdCard2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jDCFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jCBCompaniaInternacional2 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jTFTelOrigen2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTFHora2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTFSimdCard3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jDCFecha3 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jCBCompaniaInternacional3 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResultados1 = new javax.swing.JTable();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensaje Entrante Roaming"));
        jPanel3.setLayout(null);

        jPanel1.setLayout(null);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero Tel", "Internet", "Bloqueado", "Correo", "Roaming"
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
        jScrollPane1.setBounds(10, 130, 490, 125);

        jBConsultar1.setText("Consultar");
        jBConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar1);
        jBConsultar1.setBounds(260, 100, 100, 23);

        jBLimpiar1.setText("Limpiar");
        jBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar1);
        jBLimpiar1.setBounds(390, 100, 100, 23);

        jLabel10.setText("Autorizacion Roaming");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 70, 110, 14);

        jLabel11.setText("Numero Tel");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 40, 70, 14);

        jCBautorizacion_roaming1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Autorizado", "Desautorizado" }));
        jPanel1.add(jCBautorizacion_roaming1);
        jCBautorizacion_roaming1.setBounds(390, 70, 100, 20);

        jCBActivacion_Internet1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Si", "No" }));
        jPanel1.add(jCBActivacion_Internet1);
        jCBActivacion_Internet1.setBounds(130, 70, 100, 20);

        jLabel27.setText("Activacion de Internet");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(10, 70, 140, 14);
        jPanel1.add(jTFnum_telefono1);
        jTFnum_telefono1.setBounds(130, 40, 110, 20);
        jPanel1.add(jTFCodigo1);
        jTFCodigo1.setBounds(130, 10, 100, 20);

        jLabel28.setText("Activacion Correo");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(270, 40, 100, 14);

        jLabel29.setText("Bloqueado por robo");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(270, 10, 100, 14);

        jCBactivacion_correo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Si", "No" }));
        jPanel1.add(jCBactivacion_correo1);
        jCBactivacion_correo1.setBounds(390, 40, 100, 20);

        jLabel12.setText("Codigo");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 10, 60, 14);

        jCBbloqueado_por_robo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Si", "No" }));
        jPanel1.add(jCBbloqueado_por_robo1);
        jCBbloqueado_por_robo1.setBounds(390, 10, 100, 20);

        jTabbedPane1.addTab("SimCard", jPanel1);

        jPanel2.setLayout(null);

        jLabel13.setText("Telefono Origen");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 100, 100, 14);

        jTFSimdCard2.setEditable(false);
        jTFSimdCard2.setEnabled(false);
        jPanel2.add(jTFSimdCard2);
        jTFSimdCard2.setBounds(110, 10, 100, 20);

        jLabel30.setText("Cia. Internacional");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(10, 70, 100, 14);

        jDCFecha2.setDateFormatString("dd MMM yyyy");
        jPanel2.add(jDCFecha2);
        jDCFecha2.setBounds(110, 40, 160, 20);

        jLabel31.setText("Hora");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(300, 40, 60, 14);

        jCBCompaniaInternacional2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Compania Internacional" }));
        jPanel2.add(jCBCompaniaInternacional2);
        jCBCompaniaInternacional2.setBounds(110, 70, 190, 20);

        jLabel14.setText("SimCard");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 10, 60, 14);
        jPanel2.add(jTFTelOrigen2);
        jTFTelOrigen2.setBounds(110, 100, 130, 20);

        jLabel32.setText("Fecha");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(10, 40, 60, 14);

        jButton1.setText("Recibir Mensaje");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(240, 140, 120, 23);

        jTFHora2.setEditable(false);
        jTFHora2.setEnabled(false);
        jPanel2.add(jTFHora2);
        jTFHora2.setBounds(340, 40, 100, 20);

        jTabbedPane1.addTab("Mensaje", jPanel2);

        jPanel4.setLayout(null);

        jLabel15.setText("SimCard");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(10, 10, 60, 14);

        jTFSimdCard3.setEditable(false);
        jTFSimdCard3.setEnabled(false);
        jPanel4.add(jTFSimdCard3);
        jTFSimdCard3.setBounds(110, 10, 100, 20);

        jLabel33.setText("Fecha");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(10, 40, 60, 14);

        jDCFecha3.setDateFormatString("dd MMM yyyy");
        jPanel4.add(jDCFecha3);
        jDCFecha3.setBounds(110, 40, 160, 20);

        jLabel34.setText("Cia. Internacional");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 70, 100, 14);

        jCBCompaniaInternacional3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Compania Internacional" }));
        jPanel4.add(jCBCompaniaInternacional3);
        jCBCompaniaInternacional3.setBounds(110, 70, 190, 20);

        jTResultados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SimCard", "Fecha", "Hora", "Cia. Internacional", "Tel. Origen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTResultados1);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(10, 110, 490, 125);

        jTabbedPane1.addTab("Consultar Mensajes", jPanel4);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 520, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
        int selectedRow = jTResultados.getSelectedRow();
        jTFSimdCard2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));        
        jTabbedPane1.setSelectedIndex(1);
        jDCFecha2.setDate(new Date());
        
        // Agregar hora actual
        Calendar c = Calendar.getInstance();
        String hora = c.get(Calendar.HOUR_OF_DAY) +":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
        jTFHora2.setText(hora);
        //System.out.println(hora);
        
        
        
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void jBConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar1ActionPerformed
        // TODO add your handling code here:
        LinkedList consulta = new LinkedList();
        try {

            consulta = cs.consultar(
                    jTFCodigo1.getText(),
                    jTFnum_telefono1.getText(),
                    jCBActivacion_Internet1.getSelectedItem().toString(),
                    jCBbloqueado_por_robo1.getSelectedItem().toString(),
                    jCBactivacion_correo1.getSelectedItem().toString(),
                    jCBautorizacion_roaming1.getSelectedItem().toString());

            Object[][] s = new Object[consulta.size()][6];
            for (int i = 0; i < consulta.size(); i++) {
                Simcard sim = (Simcard) consulta.get(i);
                if (sim.getCodigo() != null) {
                    s[i][0] = sim.getCodigo();
                    s[i][1] = sim.getNum_telefono();
                    s[i][2] = sim.getActivacion_internet();
                    s[i][3] = sim.getBloqueado_por_robo();
                    s[i][4] = sim.getActivacion_correo();
                    s[i][5] = sim.getAutorizacion_roaming();
                } else {
                    s = null;
                }
            }
            TableModel myModel = new DefaultTableModel(s, new String[]{"Codigo", "Numero Tel", "Internet", "Bloqueado", "Correo", "Roaming"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false, false, false
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
    }//GEN-LAST:event_jBConsultar1ActionPerformed

    private void jBLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar1ActionPerformed
        limpiarCamposConsultar();        // TODO add your handling code here:
    }//GEN-LAST:event_jBLimpiar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calendar c = Calendar.getInstance();
        String hora = c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND);
        System.out.println(hora);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCamposConsultar() {
        jTFCodigo1.setText("");
        jTFnum_telefono1.setText("");
        jCBActivacion_Internet1.setSelectedIndex(0);
        jCBbloqueado_por_robo1.setSelectedIndex(0);
        jCBactivacion_correo1.setSelectedIndex(0);
        jCBautorizacion_roaming1.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCBActivacion_Internet1;
    private javax.swing.JComboBox jCBCompaniaInternacional2;
    private javax.swing.JComboBox jCBCompaniaInternacional3;
    private javax.swing.JComboBox jCBactivacion_correo1;
    private javax.swing.JComboBox jCBautorizacion_roaming1;
    private javax.swing.JComboBox jCBbloqueado_por_robo1;
    private com.toedter.calendar.JDateChooser jDCFecha2;
    private com.toedter.calendar.JDateChooser jDCFecha3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFHora2;
    private javax.swing.JTextField jTFSimdCard2;
    private javax.swing.JTextField jTFSimdCard3;
    private javax.swing.JTextField jTFTelOrigen2;
    private javax.swing.JTextField jTFnum_telefono1;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTable jTResultados1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
