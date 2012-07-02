/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSimcard;
import controlador.ControladorSimcardRobo;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Simcard;

/**
 *
 * @author JUANPAULO
 */
public class JPRobo extends javax.swing.JPanel {

    /**
     * Creates new form JPRobo
     */
    ControladorSimcard controladorSimCard;
    ControladorSimcardRobo controladorSimCardRobo;

    public JPRobo() {
        controladorSimCard = new ControladorSimcard();
        controladorSimCardRobo = new ControladorSimcardRobo();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFCiudadReporte = new javax.swing.JTextField();
        jTFSimcardReporte1 = new javax.swing.JTextField();
        jDCFechaEnviarMensaje = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reporte por robo"));
        jPanel1.setLayout(null);

        jPanel4.setLayout(null);

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

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 490, 125);

        jBConsultar1.setText("Consultar");
        jBConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBConsultar1);
        jBConsultar1.setBounds(260, 100, 100, 23);

        jBLimpiar1.setText("Limpiar");
        jBLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBLimpiar1);
        jBLimpiar1.setBounds(390, 100, 100, 23);

        jLabel10.setText("Autorizacion Roaming");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(270, 70, 110, 14);

        jLabel11.setText("Numero Tel");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 40, 70, 14);

        jCBautorizacion_roaming1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Autorizado", "Desautorizado" }));
        jPanel4.add(jCBautorizacion_roaming1);
        jCBautorizacion_roaming1.setBounds(390, 70, 100, 20);

        jCBActivacion_Internet1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Si", "No" }));
        jPanel4.add(jCBActivacion_Internet1);
        jCBActivacion_Internet1.setBounds(130, 70, 100, 20);

        jLabel27.setText("Activacion de Internet");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(10, 70, 140, 14);
        jPanel4.add(jTFnum_telefono1);
        jTFnum_telefono1.setBounds(130, 40, 110, 20);
        jPanel4.add(jTFCodigo1);
        jTFCodigo1.setBounds(130, 10, 100, 20);

        jLabel28.setText("Activacion Correo");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(270, 40, 100, 14);

        jLabel29.setText("Bloqueado por robo");
        jPanel4.add(jLabel29);
        jLabel29.setBounds(270, 10, 100, 14);

        jCBactivacion_correo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Si", "No" }));
        jPanel4.add(jCBactivacion_correo1);
        jCBactivacion_correo1.setBounds(390, 40, 100, 20);

        jLabel12.setText("Codigo");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 60, 14);

        jCBbloqueado_por_robo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Si", "No" }));
        jPanel4.add(jCBbloqueado_por_robo1);
        jCBbloqueado_por_robo1.setBounds(390, 10, 100, 20);

        jTabbedPane1.addTab("SimCard", jPanel4);

        jPanel2.setLayout(null);

        jLabel1.setText("Fecha");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 70, 90, 14);

        jLabel2.setText("SimCard");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 90, 14);

        jLabel3.setText("Ciudad");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 40, 90, 14);
        jPanel2.add(jTFCiudadReporte);
        jTFCiudadReporte.setBounds(70, 40, 120, 20);
        jPanel2.add(jTFSimcardReporte1);
        jTFSimcardReporte1.setBounds(70, 10, 120, 20);

        jDCFechaEnviarMensaje.setDateFormatString("dd MMM yyyy");
        jPanel2.add(jDCFechaEnviarMensaje);
        jDCFechaEnviarMensaje.setBounds(70, 70, 160, 20);

        jButton1.setText("Reportar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(30, 110, 130, 23);

        jButton2.setText("Limpiar");
        jPanel2.add(jButton2);
        jButton2.setBounds(200, 110, 130, 23);

        jTabbedPane1.addTab("Reporte", jPanel2);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 520, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int guardar = -1;
        try {
            java.sql.Date fecha = new java.sql.Date(jDCFechaEnviarMensaje.getDate().getTime());
            guardar = controladorSimCardRobo.guardar(jTFSimcardReporte1.getText(), jTFCiudadReporte.getText(), fecha);

        } catch (Exception e) {
        }

        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo Enviar el mensaje", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Mensaje Enviado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            // limpiarCamposConsultarMensajesEnviados();
//            jTFSimdCardConsultarSmsEnviados.setText(jTFSimdCardEnviarMensaje.getText());
//            jBConsultarMensajes_Enviados.doClick();
//            jBLimpiarEnviarMensaje.doClick();
//            jTabbedPaneMensajes.setSelectedIndex(3);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar1ActionPerformed
        limpiarCamposSimCard();
        jBConsultar1.doClick();
    }//GEN-LAST:event_jBLimpiar1ActionPerformed

    private void jBConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar1ActionPerformed
        // TODO add your handling code here:
        LinkedList consulta = new LinkedList();
        try {

            consulta = controladorSimCard.consultar(
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

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
        int selectedRow = jTResultados.getSelectedRow();
        jTFSimcardReporte1.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void limpiarCamposSimCard() {
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
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jCBActivacion_Internet1;
    private javax.swing.JComboBox jCBactivacion_correo1;
    private javax.swing.JComboBox jCBautorizacion_roaming1;
    private javax.swing.JComboBox jCBbloqueado_por_robo1;
    private com.toedter.calendar.JDateChooser jDCFechaEnviarMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCiudadReporte;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFSimcardReporte1;
    private javax.swing.JTextField jTFnum_telefono1;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}