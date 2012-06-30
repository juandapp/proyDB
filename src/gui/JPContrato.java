/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorEmpleado;
import controlador.ControladorSucursal;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Empleado;

/**
 *
 * @author JUANPAULO
 */
public class JPContrato extends javax.swing.JPanel {

    /**
     * Creates new form JPContrato
     */
    ControladorSucursal controladorSucursal;
    ControladorEmpleado controladorEmpleado;

    public JPContrato() {
        controladorSucursal = new ControladorSucursal();
        controladorEmpleado = new ControladorEmpleado();
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
        jPanel2 = new javax.swing.JPanel();
        jBLimpiarAbonado = new javax.swing.JButton();
        jBConsultarAbonado = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTFCodigoAbonado = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTFApellidosAbonado = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jCBGeneroAbonado = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jCBEstadoCivilAbonado = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jCBTipoAbonadoAbonado = new javax.swing.JComboBox();
        jDCFechaNacimientoAbonado = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        jTFComunaAbonado = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTFNombresAbonado = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTFBarrioAbonado = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTFDireccionAbonado = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTFCiudadAbonado = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jCBTipoDocumentoAbonado = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jCBImeiAbonado = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultadosAbonado = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTFCodigoEmpleado = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTFNombreEmpleado = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jCBGeneroEmpleado = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jCBEstadoCivilEmpleado = new javax.swing.JComboBox();
        jLabel50 = new javax.swing.JLabel();
        jCBCargoEmpleado = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jCBTipoContratoEmpleado = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        jCBSucursalEmpleado = new javax.swing.JComboBox();
        jBLimpiarEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResultadosEmpleado = new javax.swing.JTable();
        jDCFechaNacimientoEmpleado = new com.toedter.calendar.JDateChooser();
        jDCFechaIngresoEmpleado = new com.toedter.calendar.JDateChooser();
        jBConsultarEmpleado = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));

        jPanel2.setLayout(null);

        jBLimpiarAbonado.setText("Limpiar");
        jBLimpiarAbonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarAbonadoActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpiarAbonado);
        jBLimpiarAbonado.setBounds(540, 200, 90, 23);

        jBConsultarAbonado.setText("Consultar");
        jPanel2.add(jBConsultarAbonado);
        jBConsultarAbonado.setBounds(390, 200, 110, 23);

        jLabel30.setText("Id");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(10, 10, 30, 14);
        jPanel2.add(jTFCodigoAbonado);
        jTFCodigoAbonado.setBounds(130, 10, 130, 20);

        jLabel31.setText("Apellidos");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(360, 40, 80, 14);
        jPanel2.add(jTFApellidosAbonado);
        jTFApellidosAbonado.setBounds(430, 40, 200, 20);

        jLabel32.setText("Genero");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(10, 130, 70, 14);

        jCBGeneroAbonado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        jCBGeneroAbonado.setName(""); // NOI18N
        jPanel2.add(jCBGeneroAbonado);
        jCBGeneroAbonado.setBounds(130, 130, 200, 20);

        jLabel40.setText("Estado Civil");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(360, 130, 100, 14);

        jCBEstadoCivilAbonado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Soltero", "Viudo", "Divorciado", "Union Libre" }));
        jCBEstadoCivilAbonado.setName(""); // NOI18N
        jPanel2.add(jCBEstadoCivilAbonado);
        jCBEstadoCivilAbonado.setBounds(430, 130, 200, 20);

        jLabel41.setText("Tipo Abonado");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(10, 190, 130, 14);

        jCBTipoAbonadoAbonado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Prepago", "Postpago", "Empresarial" }));
        jCBTipoAbonadoAbonado.setName(""); // NOI18N
        jPanel2.add(jCBTipoAbonadoAbonado);
        jCBTipoAbonadoAbonado.setBounds(130, 190, 200, 20);

        jDCFechaNacimientoAbonado.setDateFormatString("dd MMM yyyy");
        jPanel2.add(jDCFechaNacimientoAbonado);
        jDCFechaNacimientoAbonado.setBounds(130, 160, 200, 20);

        jLabel42.setText("Barrio");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(10, 100, 80, 14);
        jPanel2.add(jTFComunaAbonado);
        jTFComunaAbonado.setBounds(430, 70, 200, 20);

        jLabel43.setText("Nombres");
        jPanel2.add(jLabel43);
        jLabel43.setBounds(10, 40, 80, 14);
        jPanel2.add(jTFNombresAbonado);
        jTFNombresAbonado.setBounds(130, 40, 200, 20);

        jLabel44.setText("Direccion");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(10, 70, 80, 14);
        jPanel2.add(jTFBarrioAbonado);
        jTFBarrioAbonado.setBounds(130, 100, 200, 20);

        jLabel45.setText("Comuna");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(360, 70, 80, 14);
        jPanel2.add(jTFDireccionAbonado);
        jTFDireccionAbonado.setBounds(130, 70, 200, 20);

        jLabel46.setText("Ciudad");
        jPanel2.add(jLabel46);
        jLabel46.setBounds(360, 100, 80, 14);
        jPanel2.add(jTFCiudadAbonado);
        jTFCiudadAbonado.setBounds(430, 100, 200, 20);

        jLabel47.setText("Tipo Documento");
        jPanel2.add(jLabel47);
        jLabel47.setBounds(340, 10, 100, 14);

        jCBTipoDocumentoAbonado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Cedula", "Tarjeta de Identidad", "Pasaporte" }));
        jCBTipoDocumentoAbonado.setName(""); // NOI18N
        jPanel2.add(jCBTipoDocumentoAbonado);
        jCBTipoDocumentoAbonado.setBounds(430, 10, 200, 20);

        jLabel48.setText("F. de Nacimiento");
        jPanel2.add(jLabel48);
        jLabel48.setBounds(10, 160, 130, 14);

        jLabel49.setText("Imei");
        jPanel2.add(jLabel49);
        jLabel49.setBounds(360, 160, 100, 14);

        jCBImeiAbonado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Imei" }));
        jCBImeiAbonado.setName(""); // NOI18N
        jPanel2.add(jCBImeiAbonado);
        jCBImeiAbonado.setBounds(430, 160, 200, 20);

        jTResultadosAbonado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "T. ID", "Nombres", "Apellidos", "Direccion", "Genero", "Estado Civil", "F. Nac", "Comuna", "Barrio", "Ciudad", "Tipo", "Imei"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTResultadosAbonado);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 240, 670, 120);

        jTabbedPane1.addTab("Abonado", jPanel2);

        jPanel3.setLayout(null);
        jPanel3.add(jTFCodigoEmpleado);
        jTFCodigoEmpleado.setBounds(140, 10, 100, 20);

        jLabel33.setText("Id");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(10, 10, 10, 14);

        jLabel34.setText("Nombre");
        jPanel3.add(jLabel34);
        jLabel34.setBounds(10, 40, 80, 14);
        jPanel3.add(jTFNombreEmpleado);
        jTFNombreEmpleado.setBounds(140, 40, 200, 20);

        jLabel38.setText("F. de Ingreso");
        jPanel3.add(jLabel38);
        jLabel38.setBounds(10, 70, 110, 20);

        jLabel37.setText("F. de Nacimiento");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(10, 100, 80, 14);

        jLabel35.setText("Genero");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(390, 10, 70, 14);

        jCBGeneroEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        jCBGeneroEmpleado.setName(""); // NOI18N
        jPanel3.add(jCBGeneroEmpleado);
        jCBGeneroEmpleado.setBounds(470, 10, 170, 20);

        jLabel36.setText("Estado Civil");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(390, 40, 100, 14);

        jCBEstadoCivilEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Casado", "Soltero", "Viudo", "Divorsiado", "Union Libre" }));
        jCBEstadoCivilEmpleado.setName(""); // NOI18N
        jPanel3.add(jCBEstadoCivilEmpleado);
        jCBEstadoCivilEmpleado.setBounds(470, 40, 170, 20);

        jLabel50.setText("Cargo");
        jPanel3.add(jLabel50);
        jLabel50.setBounds(390, 70, 60, 20);

        jCBCargoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Vendedor", "Gerente" }));
        jCBCargoEmpleado.setName(""); // NOI18N
        jPanel3.add(jCBCargoEmpleado);
        jCBCargoEmpleado.setBounds(470, 70, 170, 20);

        jLabel39.setText("Tipo de Contrato");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(10, 130, 130, 20);

        jCBTipoContratoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Tiempo Completo", "Medio Tiempo", "Contratista" }));
        jCBTipoContratoEmpleado.setName(""); // NOI18N
        jPanel3.add(jCBTipoContratoEmpleado);
        jCBTipoContratoEmpleado.setBounds(140, 130, 200, 20);

        jLabel51.setText("Sucursal");
        jPanel3.add(jLabel51);
        jLabel51.setBounds(390, 100, 80, 20);

        jCBSucursalEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Sucursales" }));
        jCBSucursalEmpleado.setName(""); // NOI18N
        jCBSucursalEmpleado.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBSucursalEmpleadoPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel3.add(jCBSucursalEmpleado);
        jCBSucursalEmpleado.setBounds(470, 100, 170, 20);

        jBLimpiarEmpleado.setText("Limpiar");
        jPanel3.add(jBLimpiarEmpleado);
        jBLimpiarEmpleado.setBounds(550, 140, 90, 23);

        jTResultadosEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Genero", "Estado Civil", "Fecha Nacimiento", "Fecha Ingreso", "Tipo Contraro", "Cargo", "Cod Sucursal", "Sucursal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTResultadosEmpleado);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(30, 190, 640, 140);

        jDCFechaNacimientoEmpleado.setDateFormatString("dd MMM yyyy");
        jPanel3.add(jDCFechaNacimientoEmpleado);
        jDCFechaNacimientoEmpleado.setBounds(140, 100, 200, 20);

        jDCFechaIngresoEmpleado.setDateFormatString("dd MMM yyyy");
        jPanel3.add(jDCFechaIngresoEmpleado);
        jDCFechaIngresoEmpleado.setBounds(140, 70, 200, 20);

        jBConsultarEmpleado.setText("Consultar");
        jBConsultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(jBConsultarEmpleado);
        jBConsultarEmpleado.setBounds(400, 140, 120, 23);

        jTabbedPane1.addTab("Empleado", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSucursalEmpleadoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBSucursalEmpleadoPopupMenuWillBecomeVisible
        jCBSucursalEmpleado.setModel(
                new javax.swing.DefaultComboBoxModel(controladorSucursal.listar()));        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSucursalEmpleadoPopupMenuWillBecomeVisible

    private void jBConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarEmpleadoActionPerformed
        LinkedList consulta = new LinkedList();
        String nacimiento, f_ingreso;
        try {
            java.sql.Date fecha_nacimiento = new java.sql.Date(jDCFechaNacimientoEmpleado.getDate().getTime());
            nacimiento = fecha_nacimiento.toString();

        } catch (Exception e) {
            nacimiento = "";
        }
        try {
            java.sql.Date fecha_ingreso = new java.sql.Date(jDCFechaIngresoEmpleado.getDate().getTime());
            f_ingreso = fecha_ingreso.toString();
        } catch (Exception e) {

            f_ingreso = "";

        }
        try {
            System.err.println(nacimiento + " y " + f_ingreso);
            String codigo_sucursal[] = new String[2];
            codigo_sucursal = jCBSucursalEmpleado.getSelectedItem().toString().split(" - ");
            consulta = controladorEmpleado.consultar(
                    jTFCodigoEmpleado.getText(),
                    jTFNombreEmpleado.getText(), jCBGeneroEmpleado.getSelectedItem().toString(),
                    jCBEstadoCivilEmpleado.getSelectedItem().toString(),
                    nacimiento, f_ingreso, jCBTipoContratoEmpleado.getSelectedItem().toString(),
                    jCBCargoEmpleado.getSelectedItem().toString(), codigo_sucursal[0]);

            Object[][] s = new Object[consulta.size()][10];
            for (int i = 0; i < consulta.size(); i++) {
                Empleado emp = (Empleado) consulta.get(i);
                if (emp.getNombre() != null) {
                    s[i][0] = emp.getId_empleado();
                    s[i][1] = emp.getNombre();
                    s[i][2] = emp.getGenero();
                    s[i][3] = emp.getEstado_civil();
                    s[i][4] = emp.getFecha_nacimiento();
                    s[i][5] = emp.getFecha_ingreso();
                    s[i][6] = emp.getTipo_contrato();
                    s[i][7] = emp.getCargo();
                    s[i][8] = emp.getCod_sucursal().getCod_sucursal();
                    s[i][9] = emp.getCod_sucursal().getNombre();
                } else {
                    s = null;
                }
            }
            TableModel myModel = new DefaultTableModel(s, new String[]{"Id", "Nombre", "Genero", "Estado Civil",
                        "Fecha Nacimiento", "Fecha ingreso", "Tipo Contrato", "Cargo", "Cod Sucursal", "Sucursal"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            ///remover filas
            jTResultadosAbonado.setModel(myModel);
            jTResultadosAbonado.setRowSorter(new TableRowSorter(myModel));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConsultarEmpleadoActionPerformed

    private void jBLimpiarAbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarAbonadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLimpiarAbonadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultarAbonado;
    private javax.swing.JButton jBConsultarEmpleado;
    private javax.swing.JButton jBLimpiarAbonado;
    private javax.swing.JButton jBLimpiarEmpleado;
    private javax.swing.JComboBox jCBCargoEmpleado;
    private javax.swing.JComboBox jCBEstadoCivilAbonado;
    private javax.swing.JComboBox jCBEstadoCivilEmpleado;
    private javax.swing.JComboBox jCBGeneroAbonado;
    private javax.swing.JComboBox jCBGeneroEmpleado;
    private javax.swing.JComboBox jCBImeiAbonado;
    private javax.swing.JComboBox jCBSucursalEmpleado;
    private javax.swing.JComboBox jCBTipoAbonadoAbonado;
    private javax.swing.JComboBox jCBTipoContratoEmpleado;
    private javax.swing.JComboBox jCBTipoDocumentoAbonado;
    private com.toedter.calendar.JDateChooser jDCFechaIngresoEmpleado;
    private com.toedter.calendar.JDateChooser jDCFechaNacimientoAbonado;
    private com.toedter.calendar.JDateChooser jDCFechaNacimientoEmpleado;
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
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFApellidosAbonado;
    private javax.swing.JTextField jTFBarrioAbonado;
    private javax.swing.JTextField jTFCiudadAbonado;
    private javax.swing.JTextField jTFCodigoAbonado;
    private javax.swing.JTextField jTFCodigoEmpleado;
    private javax.swing.JTextField jTFComunaAbonado;
    private javax.swing.JTextField jTFDireccionAbonado;
    private javax.swing.JTextField jTFNombreEmpleado;
    private javax.swing.JTextField jTFNombresAbonado;
    private javax.swing.JTable jTResultadosAbonado;
    private javax.swing.JTable jTResultadosEmpleado;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
