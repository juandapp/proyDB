/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorConsultas;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 *
 */
public class JPConsultarCliente extends javax.swing.JPanel {

    /**
     * Creates new form JPEquipo
     */
    ControladorConsultas cc;

    public JPConsultarCliente() {
        initComponents();
        cc = new ControladorConsultas();
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
        jBConsultar2 = new javax.swing.JButton();
        jBLimpiar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDCFecha2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jCBMedioRecarga2 = new javax.swing.JComboBox();
        jDCFecha3 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResultados1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTResultados2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
        jPanel3.setLayout(null);

        jPanel1.setLayout(null);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Direccion", "Ciudad", "Cod_Plan", "Fecha_ingreso", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jTResultados.getColumnModel().getColumn(2).setHeaderValue("Direccion");
        jTResultados.getColumnModel().getColumn(3).setHeaderValue("Ciudad");

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 440, 140);

        jBConsultar2.setText("Por Mes");
        jBConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBConsultar2);
        jBConsultar2.setBounds(50, 90, 90, 23);

        jBLimpiar2.setText("Limpiar");
        jBLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiar2ActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar2);
        jBLimpiar2.setBounds(180, 90, 90, 23);

        jLabel7.setText("Fecha 1");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 30, 70, 14);

        jDCFecha2.setDateFormatString("yyyy-MMM-dd");
        jPanel1.add(jDCFecha2);
        jDCFecha2.setBounds(90, 30, 110, 20);

        jLabel15.setText("Tipo");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(280, 30, 60, 14);

        jCBMedioRecarga2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Individual", "Corporativo" }));
        jCBMedioRecarga2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jCBMedioRecarga2);
        jCBMedioRecarga2.setBounds(280, 50, 150, 20);

        jDCFecha3.setDateFormatString("yyyy-MMM-dd");
        jPanel1.add(jDCFecha3);
        jDCFecha3.setBounds(90, 60, 110, 20);

        jLabel8.setText("Fecha 2");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 60, 70, 14);

        jLabel1.setText("Rango de Tiempo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 130, 14);

        jButton1.setText("Por Tipo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 90, 90, 23);

        jTabbedPane1.addTab("Clientes", jPanel1);

        jTResultados1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Abonado", "Nombre", "Apellido", "Direccion", "Ciudad", "Plan", "Simcard", "Fecha_ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTResultados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultados1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTResultados1);
        jTResultados1.getColumnModel().getColumn(3).setHeaderValue("Direccion");
        jTResultados1.getColumnModel().getColumn(4).setHeaderValue("Ciudad");

        jButton2.setText("Prepago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuarios de planes prepago registrados");

        jLabel3.setText("usuarios de planes postpago");

        jButton3.setText("Postpago");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Planes mas escogidos");

        jButton4.setText("Consultar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4))
                        .addGap(0, 121, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Planes", jPanel2);

        jTResultados2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Abonado", "Nombre", "Apellido", "Plan de Datos", "Costo Correo", "Cos. Internet", "Vol Datos Correo", "Vol Datos Internet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTResultados2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultados2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTResultados2);

        jLabel5.setText("Listado usuarios que contratan plan de datos y consumo mensual");

        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Plan Datos", jPanel4);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 460, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar2ActionPerformed
        LinkedList consulta = new LinkedList();
        String fecha_i, fecha_f;
        try {

            java.sql.Date fecha1 = new java.sql.Date(jDCFecha2.getDate().getTime());
            fecha_i = fecha1.toString();
        } catch (Exception e) {
            fecha_i = "";
        }

        try {

            java.sql.Date fecha2 = new java.sql.Date(jDCFecha3.getDate().getTime());
            fecha_f = fecha2.toString();
        } catch (Exception e) {
            fecha_f = "";
        }

        try {

            consulta = cc.clientesPorMes(
                    fecha_i, fecha_f);

            Object[][] s = new Object[consulta.size()][7];
            for (int i = 0; i < consulta.size(); i++) {
                String [] retorno = (String []) consulta.get(i);
                if (retorno[0] != null) {
                    s[i][0] = retorno[0];
                    s[i][1] = retorno[1];
                    s[i][2] = retorno[2];
                    s[i][3] = retorno[3];
                    s[i][4] = retorno[4];
                    s[i][5] = retorno[5];
                    s[i][6] = retorno[6];
                    
                } else {
                    s = null;
                }
            }
            TableModel myModel = new DefaultTableModel(s, new String[]{"Nombres", "Apellidos", "Direccion", "Ciudad"
            , "Cod_Plan", "fecha_ingreso","Tipo"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

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

    private void jBLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiar2ActionPerformed
jDCFecha2.setDate(null);        
jDCFecha3.setDate(null);
jCBMedioRecarga2.setSelectedIndex(0);
   }//GEN-LAST:event_jBLimpiar2ActionPerformed

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    LinkedList consulta = new LinkedList();
       

       try {

            consulta = cc.clientesPorTipo(
                    jCBMedioRecarga2.getSelectedItem().toString());

            Object[][] s = new Object[consulta.size()][7];
            for (int i = 0; i < consulta.size(); i++) {
                String [] retorno = (String []) consulta.get(i);
                if (retorno[0] != null) {
                    s[i][0] = retorno[0];
                    s[i][1] = retorno[1];
                    s[i][2] = retorno[2];
                    s[i][3] = retorno[3];
                    s[i][4] = retorno[4];
                    s[i][5] = retorno[5];
                    s[i][6] = retorno[6];
                    
                } else {
                    s = null;
                }
            }
            TableModel myModel = new DefaultTableModel(s, new String[]{"Nombres", "Apellidos", "Direccion", "Ciudad"
            , "Cod_Plan", "fecha_ingreso","Tipo"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

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
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTResultados1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultados1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTResultados1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTResultados2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultados2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTResultados2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jCBMedioRecarga2;
    private com.toedter.calendar.JDateChooser jDCFecha2;
    private com.toedter.calendar.JDateChooser jDCFecha3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTable jTResultados1;
    private javax.swing.JTable jTResultados2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
