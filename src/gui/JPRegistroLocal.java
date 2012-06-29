/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorSimcard;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Simcard;

/**
 *
 * @author KatheV
 */
public class JPRegistroLocal extends javax.swing.JPanel {

    /**
     * Creates new form JPRegistroLocal
     */
    ControladorSimcard cs;
    public JPRegistroLocal() {
        initComponents();
        cs = new ControladorSimcard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTFSimdCardRealizarLlamada = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jDCFechaRealizarLlamada = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jTFTelDestinoRealizarLlamada = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTFHoraInicioRealizarLlamada = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTFHoraFinRealizarLlamada = new javax.swing.JTextField();
        jBLimpiarRealizarLLamada = new javax.swing.JButton();
        jBRealizarLLamada1 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jCBCompaniaLocalRealizarLlamada = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTFSimdCardConsultarRealizarLlamada = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jDCFechaConsultarRealizarLlamada = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTResultadosLlamadasRealizadas = new javax.swing.JTable();
        jBLimpiarConsultarLlamadasRealizadas = new javax.swing.JButton();
        jBConsultarLlamadasRealizadas = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jCBCompaniaLocalConsultarRealizarLlamada = new javax.swing.JComboBox();
        jTabbedPaneMensajes = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTFSimdCardEnviarMensaje = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jCBCompaniaLocallEnviarMensaje = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jTFMensajesAEnviar_EnviarMensaje = new javax.swing.JTextField();
        jBLimpiarEnviarMensaje = new javax.swing.JButton();
        jBEnviarMensaje = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTFSimdCardConsultarMensajeEnviado = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTResultadosMensajesEnviados = new javax.swing.JTable();
        jBLimpiarConsultar_Mensajes = new javax.swing.JButton();
        jBConsultarMensajes = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jCBCompaniaLocalConsultarMensajeEnviado = new javax.swing.JComboBox();

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

        jPanel7.setLayout(null);

        jPanel8.setLayout(null);

        jLabel22.setText("SimCard");
        jPanel8.add(jLabel22);
        jLabel22.setBounds(10, 10, 60, 14);

        jTFSimdCardRealizarLlamada.setEditable(false);
        jTFSimdCardRealizarLlamada.setEnabled(false);
        jPanel8.add(jTFSimdCardRealizarLlamada);
        jTFSimdCardRealizarLlamada.setBounds(110, 10, 100, 20);

        jLabel44.setText("Fecha");
        jPanel8.add(jLabel44);
        jLabel44.setBounds(10, 40, 60, 14);

        jDCFechaRealizarLlamada.setDateFormatString("dd MMM yyyy");
        jPanel8.add(jDCFechaRealizarLlamada);
        jDCFechaRealizarLlamada.setBounds(110, 40, 160, 20);

        jLabel23.setText("Telefono Destino");
        jPanel8.add(jLabel23);
        jLabel23.setBounds(10, 100, 100, 14);
        jPanel8.add(jTFTelDestinoRealizarLlamada);
        jTFTelDestinoRealizarLlamada.setBounds(110, 100, 130, 20);

        jLabel46.setText("Hora Inicio");
        jPanel8.add(jLabel46);
        jLabel46.setBounds(320, 40, 70, 14);

        jTFHoraInicioRealizarLlamada.setEditable(false);
        jTFHoraInicioRealizarLlamada.setEnabled(false);
        jTFHoraInicioRealizarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHoraInicioRealizarLlamadaActionPerformed(evt);
            }
        });
        jPanel8.add(jTFHoraInicioRealizarLlamada);
        jTFHoraInicioRealizarLlamada.setBounds(390, 40, 100, 20);

        jLabel47.setText("Hora Fin");
        jPanel8.add(jLabel47);
        jLabel47.setBounds(320, 70, 70, 14);

        jTFHoraFinRealizarLlamada.setEditable(false);
        jTFHoraFinRealizarLlamada.setEnabled(false);
        jTFHoraFinRealizarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFHoraFinRealizarLlamadaActionPerformed(evt);
            }
        });
        jPanel8.add(jTFHoraFinRealizarLlamada);
        jTFHoraFinRealizarLlamada.setBounds(390, 70, 100, 20);

        jBLimpiarRealizarLLamada.setText("Limpiar");
        jPanel8.add(jBLimpiarRealizarLLamada);
        jBLimpiarRealizarLLamada.setBounds(290, 140, 130, 23);

        jBRealizarLLamada1.setText("Realizar Llamada");
        jPanel8.add(jBRealizarLLamada1);
        jBRealizarLLamada1.setBounds(110, 140, 130, 23);

        jLabel37.setText("Cia. Local");
        jPanel8.add(jLabel37);
        jLabel37.setBounds(10, 70, 90, 14);

        jCBCompaniaLocalRealizarLlamada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Compania Local" }));
        jPanel8.add(jCBCompaniaLocalRealizarLlamada);
        jCBCompaniaLocalRealizarLlamada.setBounds(110, 70, 180, 20);

        jTabbedPane2.addTab("Realizar LLamada", jPanel8);

        jPanel10.setLayout(null);

        jLabel25.setText("SimCard");
        jPanel10.add(jLabel25);
        jLabel25.setBounds(10, 10, 60, 14);
        jPanel10.add(jTFSimdCardConsultarRealizarLlamada);
        jTFSimdCardConsultarRealizarLlamada.setBounds(110, 10, 100, 20);

        jLabel48.setText("Fecha");
        jPanel10.add(jLabel48);
        jLabel48.setBounds(10, 40, 60, 14);

        jDCFechaConsultarRealizarLlamada.setDateFormatString("dd MMM yyyy");
        jPanel10.add(jDCFechaConsultarRealizarLlamada);
        jDCFechaConsultarRealizarLlamada.setBounds(110, 40, 160, 20);

        jTResultadosLlamadasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SimCard", "Hora Inicio", "Fecha", "Tel. Destino", "Hora Fin", "Cia. Local"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTResultadosLlamadasRealizadas);

        jPanel10.add(jScrollPane4);
        jScrollPane4.setBounds(10, 110, 490, 125);

        jBLimpiarConsultarLlamadasRealizadas.setText("Limpiar");
        jPanel10.add(jBLimpiarConsultarLlamadasRealizadas);
        jBLimpiarConsultarLlamadasRealizadas.setBounds(330, 40, 120, 23);

        jBConsultarLlamadasRealizadas.setText("Consultar");
        jPanel10.add(jBConsultarLlamadasRealizadas);
        jBConsultarLlamadasRealizadas.setBounds(330, 10, 120, 23);

        jLabel38.setText("Cia. Local");
        jPanel10.add(jLabel38);
        jLabel38.setBounds(10, 70, 90, 14);

        jCBCompaniaLocalConsultarRealizarLlamada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Compania Local" }));
        jPanel10.add(jCBCompaniaLocalConsultarRealizarLlamada);
        jCBCompaniaLocalConsultarRealizarLlamada.setBounds(110, 70, 180, 20);

        jTabbedPane2.addTab("Consultar Llamadas Realizadas", jPanel10);

        jPanel7.add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 0, 510, 270);

        jTabbedPane1.addTab("Llamada", jPanel7);

        jPanel6.setLayout(null);

        jLabel16.setText("Mensajes a Enviar");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(10, 70, 100, 14);

        jTFSimdCardEnviarMensaje.setEditable(false);
        jTFSimdCardEnviarMensaje.setEnabled(false);
        jPanel6.add(jTFSimdCardEnviarMensaje);
        jTFSimdCardEnviarMensaje.setBounds(110, 10, 100, 20);

        jLabel35.setText("Cia. Local");
        jPanel6.add(jLabel35);
        jLabel35.setBounds(10, 40, 100, 14);

        jCBCompaniaLocallEnviarMensaje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Compania Local" }));
        jPanel6.add(jCBCompaniaLocallEnviarMensaje);
        jCBCompaniaLocallEnviarMensaje.setBounds(110, 40, 190, 20);

        jLabel17.setText("SimCard");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(10, 10, 60, 14);

        jTFMensajesAEnviar_EnviarMensaje.setText("1");
        jPanel6.add(jTFMensajesAEnviar_EnviarMensaje);
        jTFMensajesAEnviar_EnviarMensaje.setBounds(110, 70, 40, 20);

        jBLimpiarEnviarMensaje.setText("Limpiar");
        jBLimpiarEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarEnviarMensajeActionPerformed(evt);
            }
        });
        jPanel6.add(jBLimpiarEnviarMensaje);
        jBLimpiarEnviarMensaje.setBounds(180, 110, 120, 23);

        jBEnviarMensaje.setText("Enviar Mensaje");
        jBEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarMensajeActionPerformed(evt);
            }
        });
        jPanel6.add(jBEnviarMensaje);
        jBEnviarMensaje.setBounds(40, 110, 120, 23);

        jTabbedPaneMensajes.addTab("Enviar Mensaje", jPanel6);

        jPanel5.setLayout(null);

        jLabel18.setText("SimCard");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(10, 10, 60, 14);

        jTFSimdCardConsultarMensajeEnviado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSimdCardConsultarMensajeEnviadoActionPerformed(evt);
            }
        });
        jPanel5.add(jTFSimdCardConsultarMensajeEnviado);
        jTFSimdCardConsultarMensajeEnviado.setBounds(110, 10, 100, 20);

        jTResultadosMensajesEnviados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SimCard", "Cia.Local", "Msm enviados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTResultadosMensajesEnviados);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(10, 110, 490, 125);

        jBLimpiarConsultar_Mensajes.setText("Limpiar");
        jPanel5.add(jBLimpiarConsultar_Mensajes);
        jBLimpiarConsultar_Mensajes.setBounds(330, 40, 110, 23);

        jBConsultarMensajes.setText("Consultar");
        jPanel5.add(jBConsultarMensajes);
        jBConsultarMensajes.setBounds(330, 10, 110, 23);

        jLabel36.setText("Cia. Local");
        jPanel5.add(jLabel36);
        jLabel36.setBounds(10, 40, 100, 14);

        jCBCompaniaLocalConsultarMensajeEnviado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Compania Local" }));
        jPanel5.add(jCBCompaniaLocalConsultarMensajeEnviado);
        jCBCompaniaLocalConsultarMensajeEnviado.setBounds(110, 40, 190, 20);

        jTabbedPaneMensajes.addTab("Consultar Mensajes Enviados", jPanel5);

        jTabbedPane1.addTab("Mensaje", jTabbedPaneMensajes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
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

    }//GEN-LAST:event_jBLimpiar1ActionPerformed

    private void jBLimpiarEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarEnviarMensajeActionPerformed

    }//GEN-LAST:event_jBLimpiarEnviarMensajeActionPerformed

    private void jBEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEnviarMensajeActionPerformed

    private void jTFHoraInicioRealizarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHoraInicioRealizarLlamadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFHoraInicioRealizarLlamadaActionPerformed

    private void jTFHoraFinRealizarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFHoraFinRealizarLlamadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFHoraFinRealizarLlamadaActionPerformed

    private void jTFSimdCardConsultarMensajeEnviadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSimdCardConsultarMensajeEnviadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSimdCardConsultarMensajeEnviadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar1;
    private javax.swing.JButton jBConsultarLlamadasRealizadas;
    private javax.swing.JButton jBConsultarMensajes;
    private javax.swing.JButton jBEnviarMensaje;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiarConsultarLlamadasRealizadas;
    private javax.swing.JButton jBLimpiarConsultar_Mensajes;
    private javax.swing.JButton jBLimpiarEnviarMensaje;
    private javax.swing.JButton jBLimpiarRealizarLLamada;
    private javax.swing.JButton jBRealizarLLamada1;
    private javax.swing.JComboBox jCBActivacion_Internet1;
    private javax.swing.JComboBox jCBCompaniaLocalConsultarMensajeEnviado;
    private javax.swing.JComboBox jCBCompaniaLocalConsultarRealizarLlamada;
    private javax.swing.JComboBox jCBCompaniaLocalRealizarLlamada;
    private javax.swing.JComboBox jCBCompaniaLocallEnviarMensaje;
    private javax.swing.JComboBox jCBactivacion_correo1;
    private javax.swing.JComboBox jCBautorizacion_roaming1;
    private javax.swing.JComboBox jCBbloqueado_por_robo1;
    private com.toedter.calendar.JDateChooser jDCFechaConsultarRealizarLlamada;
    private com.toedter.calendar.JDateChooser jDCFechaRealizarLlamada;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFHoraFinRealizarLlamada;
    private javax.swing.JTextField jTFHoraInicioRealizarLlamada;
    private javax.swing.JTextField jTFMensajesAEnviar_EnviarMensaje;
    private javax.swing.JTextField jTFSimdCardConsultarMensajeEnviado;
    private javax.swing.JTextField jTFSimdCardConsultarRealizarLlamada;
    private javax.swing.JTextField jTFSimdCardEnviarMensaje;
    private javax.swing.JTextField jTFSimdCardRealizarLlamada;
    private javax.swing.JTextField jTFTelDestinoRealizarLlamada;
    private javax.swing.JTextField jTFnum_telefono1;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTable jTResultadosLlamadasRealizadas;
    private javax.swing.JTable jTResultadosMensajesEnviados;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPaneMensajes;
    // End of variables declaration//GEN-END:variables
}
