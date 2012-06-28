/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorEmpleado;
import controlador.ControladorSucursal;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Empleado;

/**
 *
 * @author JUANPAULO
 */
public class JPEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form JPEmpleado
     */
    ControladorSucursal controladorSucursal;
    ControladorEmpleado controladorEmpleado;

    public JPEmpleado() {
        initComponents();
        controladorSucursal = new ControladorSucursal();
        controladorEmpleado = new ControladorEmpleado();
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
        jLabel24 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTFNombre1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jCBGenero1 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jCBEstadoCivil1 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jCBTipoContrato1 = new javax.swing.JComboBox();
        jLabel31 = new javax.swing.JLabel();
        jCBCargo1 = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jCBSucursal1 = new javax.swing.JComboBox();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jDCFechaIngreso1 = new com.toedter.calendar.JDateChooser();
        jDCFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jTFCodigo2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTFNombre2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jCBGenero2 = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jCBEstadoCivil2 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jCBCargo2 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jCBTipoContrato2 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jCBSucursal2 = new javax.swing.JComboBox();
        jBLimpiar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jDCFechaNacimiento2 = new com.toedter.calendar.JDateChooser();
        jDCFechaIngreso2 = new com.toedter.calendar.JDateChooser();
        jBConsultar2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jBModificar3 = new javax.swing.JButton();
        jTFCodigo3 = new javax.swing.JTextField();
        jTFNombre3 = new javax.swing.JTextField();
        jCBGenero3 = new javax.swing.JComboBox();
        jCBEstadoCivil3 = new javax.swing.JComboBox();
        jDCFechaNacimiento3 = new com.toedter.calendar.JDateChooser();
        jDCFechaIngreso3 = new com.toedter.calendar.JDateChooser();
        jCBTipoContrato3 = new javax.swing.JComboBox();
        jCBCargo3 = new javax.swing.JComboBox();
        jCBSucursal3 = new javax.swing.JComboBox();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        jPanel3.setLayout(null);

        jPanel1.setLayout(null);

        jLabel24.setText("Id");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(10, 10, 10, 14);
        jPanel1.add(jTFCodigo1);
        jTFCodigo1.setBounds(130, 10, 130, 20);

        jLabel25.setText("Nombre");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(10, 40, 80, 14);
        jPanel1.add(jTFNombre1);
        jTFNombre1.setBounds(130, 40, 200, 20);

        jLabel26.setText("Genero");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(10, 70, 70, 14);

        jCBGenero1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        jCBGenero1.setName(""); // NOI18N
        jPanel1.add(jCBGenero1);
        jCBGenero1.setBounds(130, 70, 200, 20);

        jLabel27.setText("Estado Civil");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(10, 100, 100, 14);

        jCBEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Soltero", "Viudo", "Divorciado", "Union Libre" }));
        jCBEstadoCivil1.setName(""); // NOI18N
        jPanel1.add(jCBEstadoCivil1);
        jCBEstadoCivil1.setBounds(130, 100, 200, 20);

        jLabel28.setText("F. de Nacimiento");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(10, 130, 130, 14);

        jLabel29.setText("F. de Ingreso");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(10, 160, 110, 20);

        jLabel30.setText("Tipo de Contrato");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(10, 190, 130, 20);

        jCBTipoContrato1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Tiempo Completo", "Medio Tiempo", "Contratista" }));
        jCBTipoContrato1.setName(""); // NOI18N
        jPanel1.add(jCBTipoContrato1);
        jCBTipoContrato1.setBounds(130, 190, 200, 20);

        jLabel31.setText("Cargo");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(10, 220, 60, 20);

        jCBCargo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Vendedor", "Gerente" }));
        jCBCargo1.setName(""); // NOI18N
        jPanel1.add(jCBCargo1);
        jCBCargo1.setBounds(130, 220, 200, 20);

        jLabel32.setText("Sucursal");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(10, 250, 80, 20);

        jCBSucursal1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Sucursales" }));
        jCBSucursal1.setName(""); // NOI18N
        jCBSucursal1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBSucursal1PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel1.add(jCBSucursal1);
        jCBSucursal1.setBounds(130, 250, 200, 20);

        jBLimpiar1.setText("Limpiar");
        jPanel1.add(jBLimpiar1);
        jBLimpiar1.setBounds(130, 280, 80, 23);

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrear1);
        jBCrear1.setBounds(220, 280, 90, 23);

        jDCFechaIngreso1.setDateFormatString("dd MMM yyyy");
        jPanel1.add(jDCFechaIngreso1);
        jDCFechaIngreso1.setBounds(130, 160, 200, 20);

        jDCFechaNacimiento1.setDateFormatString("dd MMM yyyy");
        jPanel1.add(jDCFechaNacimiento1);
        jDCFechaNacimiento1.setBounds(130, 130, 200, 20);

        jTabbedPane1.addTab("Crear", jPanel1);

        jPanel2.setLayout(null);
        jPanel2.add(jTFCodigo2);
        jTFCodigo2.setBounds(140, 10, 100, 20);

        jLabel33.setText("Id");
        jPanel2.add(jLabel33);
        jLabel33.setBounds(10, 10, 10, 14);

        jLabel34.setText("Nombre");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(10, 40, 80, 14);
        jPanel2.add(jTFNombre2);
        jTFNombre2.setBounds(140, 40, 200, 20);

        jLabel38.setText("F. de Ingreso");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(10, 70, 110, 20);

        jLabel37.setText("F. de Nacimiento");
        jPanel2.add(jLabel37);
        jLabel37.setBounds(10, 100, 80, 14);

        jLabel35.setText("Genero");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(390, 10, 70, 14);

        jCBGenero2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        jCBGenero2.setName(""); // NOI18N
        jPanel2.add(jCBGenero2);
        jCBGenero2.setBounds(470, 10, 170, 20);

        jLabel36.setText("Estado Civil");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(390, 40, 100, 14);

        jCBEstadoCivil2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Casado", "Soltero", "Viudo", "Divorsiado", "Union Libre" }));
        jCBEstadoCivil2.setName(""); // NOI18N
        jPanel2.add(jCBEstadoCivil2);
        jCBEstadoCivil2.setBounds(470, 40, 170, 20);

        jLabel40.setText("Cargo");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(390, 70, 60, 20);

        jCBCargo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Vendedor", "Gerente" }));
        jCBCargo2.setName(""); // NOI18N
        jPanel2.add(jCBCargo2);
        jCBCargo2.setBounds(470, 70, 170, 20);

        jLabel39.setText("Tipo de Contrato");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(10, 130, 130, 20);

        jCBTipoContrato2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Tiempo Completo", "Medio Tiempo", "Contratista" }));
        jCBTipoContrato2.setName(""); // NOI18N
        jPanel2.add(jCBTipoContrato2);
        jCBTipoContrato2.setBounds(140, 130, 200, 20);

        jLabel41.setText("Sucursal");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(390, 100, 80, 20);

        jCBSucursal2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Sucursales" }));
        jCBSucursal2.setName(""); // NOI18N
        jCBSucursal2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBSucursal2PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel2.add(jCBSucursal2);
        jCBSucursal2.setBounds(470, 100, 170, 20);

        jBLimpiar2.setText("Limpiar");
        jPanel2.add(jBLimpiar2);
        jBLimpiar2.setBounds(550, 140, 90, 23);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTResultados);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 640, 140);

        jDCFechaNacimiento2.setDateFormatString("dd MMM yyyy");
        jPanel2.add(jDCFechaNacimiento2);
        jDCFechaNacimiento2.setBounds(140, 100, 200, 20);

        jDCFechaIngreso2.setDateFormatString("dd MMM yyyy");
        jPanel2.add(jDCFechaIngreso2);
        jDCFechaIngreso2.setBounds(140, 70, 200, 20);

        jBConsultar2.setText("Consultar");
        jBConsultar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultar2ActionPerformed(evt);
            }
        });
        jPanel2.add(jBConsultar2);
        jBConsultar2.setBounds(400, 140, 120, 23);

        jTabbedPane1.addTab("Consultar", jPanel2);

        jPanel4.setLayout(null);

        jLabel42.setText("Id");
        jPanel4.add(jLabel42);
        jLabel42.setBounds(10, 10, 40, 14);

        jLabel43.setText("Nombre");
        jPanel4.add(jLabel43);
        jLabel43.setBounds(10, 40, 90, 14);

        jLabel44.setText("Genero");
        jPanel4.add(jLabel44);
        jLabel44.setBounds(10, 70, 80, 14);

        jLabel45.setText("Estado Civil");
        jPanel4.add(jLabel45);
        jLabel45.setBounds(10, 100, 100, 14);

        jLabel46.setText("F. de Nacimiento");
        jPanel4.add(jLabel46);
        jLabel46.setBounds(10, 130, 130, 14);

        jLabel47.setText("F. de Ingreso");
        jPanel4.add(jLabel47);
        jLabel47.setBounds(10, 160, 110, 20);

        jLabel48.setText("Tipo de Contrato");
        jPanel4.add(jLabel48);
        jLabel48.setBounds(10, 190, 130, 20);

        jLabel49.setText("Cargo");
        jPanel4.add(jLabel49);
        jLabel49.setBounds(10, 220, 90, 20);

        jLabel50.setText("Sucursal");
        jPanel4.add(jLabel50);
        jLabel50.setBounds(10, 250, 90, 20);

        jBModificar3.setText("Modificar");
        jPanel4.add(jBModificar3);
        jBModificar3.setBounds(240, 280, 90, 23);
        jPanel4.add(jTFCodigo3);
        jTFCodigo3.setBounds(130, 10, 130, 20);
        jPanel4.add(jTFNombre3);
        jTFNombre3.setBounds(130, 40, 200, 20);

        jCBGenero3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        jCBGenero3.setName(""); // NOI18N
        jPanel4.add(jCBGenero3);
        jCBGenero3.setBounds(130, 70, 200, 20);

        jCBEstadoCivil3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Casado", "Soltero", "Viudo", "Divorsiado", "Union Libre" }));
        jCBEstadoCivil3.setName(""); // NOI18N
        jPanel4.add(jCBEstadoCivil3);
        jCBEstadoCivil3.setBounds(130, 100, 200, 20);

        jDCFechaNacimiento3.setDateFormatString("dd MMM yyyy");
        jPanel4.add(jDCFechaNacimiento3);
        jDCFechaNacimiento3.setBounds(130, 130, 200, 20);

        jDCFechaIngreso3.setDateFormatString("dd MMM yyyy");
        jPanel4.add(jDCFechaIngreso3);
        jDCFechaIngreso3.setBounds(130, 160, 200, 20);

        jCBTipoContrato3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Tiempo Completo", "Medio Tiempo", "Contratista" }));
        jCBTipoContrato3.setName(""); // NOI18N
        jPanel4.add(jCBTipoContrato3);
        jCBTipoContrato3.setBounds(130, 190, 200, 20);

        jCBCargo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Vendedor", "Gerente" }));
        jCBCargo3.setName(""); // NOI18N
        jPanel4.add(jCBCargo3);
        jCBCargo3.setBounds(130, 220, 200, 20);

        jCBSucursal3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Sucursales" }));
        jCBSucursal3.setName(""); // NOI18N
        jCBSucursal3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBSucursal3PopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel4.add(jCBSucursal3);
        jCBSucursal3.setBounds(130, 250, 200, 20);

        jTabbedPane1.addTab("Editar", jPanel4);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 670, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBSucursal1PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBSucursal1PopupMenuWillBecomeVisible
        jCBSucursal1.setModel(
                new javax.swing.DefaultComboBoxModel(controladorSucursal.listar()));
    }//GEN-LAST:event_jCBSucursal1PopupMenuWillBecomeVisible

    private void jCBSucursal3PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBSucursal3PopupMenuWillBecomeVisible
   jCBSucursal3.setModel(
                new javax.swing.DefaultComboBoxModel(controladorSucursal.listar()));      // TODO add your handling code here:
    }//GEN-LAST:event_jCBSucursal3PopupMenuWillBecomeVisible

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed
        // TODO add your handling code here:
        int guardar = -1;
        try {
            java.sql.Date fecha_nacimiento = new java.sql.Date(jDCFechaNacimiento1.getDate().getTime());

            java.sql.Date fecha_ingreso = new java.sql.Date(jDCFechaIngreso1.getDate().getTime());

            String codigo_sucursal[] = new String[2];
            codigo_sucursal = jCBSucursal1.getSelectedItem().toString().split(" - ");
            System.out.println(codigo_sucursal[0]);

            guardar = controladorEmpleado.guardar(jTFCodigo1.getText(),
                    jTFNombre1.getText(), jCBGenero1.getSelectedItem().toString(),
                    jCBEstadoCivil1.getSelectedItem().toString(),
                    fecha_nacimiento, fecha_ingreso, jCBTipoContrato1.getSelectedItem().toString(),
                    jCBCargo1.getSelectedItem().toString(), codigo_sucursal[0]);

        } catch (Exception e) {
        }

        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo crear el Empleado", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Empleado Creado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTFCodigo2.setText(jTFCodigo1.getText());
            jBConsultar2.doClick();
            jBLimpiar1.doClick();
            jTabbedPane1.setSelectedIndex(1);

        }

    }//GEN-LAST:event_jBCrear1ActionPerformed
    private void limpiarCamposConsultar() {
        jTFCodigo2.setText("");
        jTFNombre2.setText("");
        jCBCargo2.setSelectedIndex(0);
        jCBEstadoCivil2.setSelectedIndex(0);
        jCBGenero2.setSelectedIndex(0);
        jCBSucursal2.setSelectedIndex(0);
        jCBTipoContrato2.setSelectedIndex(0);
        jDCFechaIngreso2.setDate(null);
        jDCFechaNacimiento2.setDate(null);

    }

    private void limpiarCamposCrear() {
        jTFCodigo1.setText("");
        jTFNombre1.setText("");
        jCBCargo1.setSelectedIndex(0);
        jCBEstadoCivil1.setSelectedIndex(0);
        jCBGenero1.setSelectedIndex(0);
        jCBSucursal1.setSelectedIndex(0);
        jCBTipoContrato1.setSelectedIndex(0);
        jDCFechaIngreso1.setDate(null);
        jDCFechaNacimiento1.setDate(null);

    }

    private void limpiarCamposModificar() {
        jTFCodigo3.setText("");
        jTFNombre3.setText("");
        jCBCargo3.setSelectedIndex(0);
        jCBEstadoCivil3.setSelectedIndex(0);
        jCBGenero3.setSelectedIndex(0);
        jCBSucursal3.setSelectedIndex(0);
        jCBTipoContrato3.setSelectedIndex(0);
        jDCFechaIngreso3.setDate(null);
        jDCFechaNacimiento3.setDate(null);

    }

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = jTResultados.getSelectedRow();
        jTFCodigo3.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));
        jTFNombre3.setText("" + jTResultados.getModel().getValueAt(selectedRow, 1));
        jCBCargo3.setSelectedItem("" + jTResultados.getModel().getValueAt(selectedRow, 7));
        jCBEstadoCivil3.setSelectedItem("" + jTResultados.getModel().getValueAt(selectedRow, 3));
        jCBGenero3.setSelectedItem("" + jTResultados.getModel().getValueAt(selectedRow, 2));
        jDCFechaIngreso3.setDateFormatString("" + jTResultados.getModel().getValueAt(selectedRow, 5));
        jDCFechaNacimiento3.setDateFormatString("" + jTResultados.getModel().getValueAt(selectedRow, 4));
        jCBTipoContrato3.setSelectedItem("" + jTResultados.getModel().getValueAt(selectedRow, 6));
        jTabbedPane1.setSelectedIndex(2);
    }
    private void jBConsultar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultar2ActionPerformed
        LinkedList consulta = new LinkedList();
        String nacimiento, f_ingreso;
        try {
            java.sql.Date fecha_nacimiento = new java.sql.Date(jDCFechaNacimiento2.getDate().getTime());
            nacimiento = fecha_nacimiento.toString();

        } catch (Exception e) {
            nacimiento = "";


        }
        try {
            java.sql.Date fecha_ingreso = new java.sql.Date(jDCFechaIngreso2.getDate().getTime());
        f_ingreso=fecha_ingreso.toString();
        } catch (Exception e) {

            f_ingreso = "";

        }
        try {
            System.err.println(nacimiento + " y " + f_ingreso);
            String codigo_sucursal[] = new String[2];
            codigo_sucursal = jCBSucursal2.getSelectedItem().toString().split(" - ");
            consulta = controladorEmpleado.consultar(
                    jTFCodigo2.getText(),
                    jTFNombre2.getText(), jCBGenero2.getSelectedItem().toString(),
                    jCBEstadoCivil2.getSelectedItem().toString(),
                    nacimiento, f_ingreso, jCBTipoContrato2.getSelectedItem().toString(),
                    jCBCargo1.getSelectedItem().toString(), codigo_sucursal[0]);

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
            jTResultados.setModel(myModel);
            jTResultados.setRowSorter(new TableRowSorter(myModel));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBConsultar2ActionPerformed

    private void jCBSucursal2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBSucursal2PopupMenuWillBecomeVisible
 jCBSucursal2.setModel(
                new javax.swing.DefaultComboBoxModel(controladorSucursal.listar()));        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSucursal2PopupMenuWillBecomeVisible

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JComboBox jCBCargo1;
    private javax.swing.JComboBox jCBCargo2;
    private javax.swing.JComboBox jCBCargo3;
    private javax.swing.JComboBox jCBEstadoCivil1;
    private javax.swing.JComboBox jCBEstadoCivil2;
    private javax.swing.JComboBox jCBEstadoCivil3;
    private javax.swing.JComboBox jCBGenero1;
    private javax.swing.JComboBox jCBGenero2;
    private javax.swing.JComboBox jCBGenero3;
    private javax.swing.JComboBox jCBSucursal1;
    private javax.swing.JComboBox jCBSucursal2;
    private javax.swing.JComboBox jCBSucursal3;
    private javax.swing.JComboBox jCBTipoContrato1;
    private javax.swing.JComboBox jCBTipoContrato2;
    private javax.swing.JComboBox jCBTipoContrato3;
    private com.toedter.calendar.JDateChooser jDCFechaIngreso1;
    private com.toedter.calendar.JDateChooser jDCFechaIngreso2;
    private com.toedter.calendar.JDateChooser jDCFechaIngreso3;
    private com.toedter.calendar.JDateChooser jDCFechaNacimiento1;
    private com.toedter.calendar.JDateChooser jDCFechaNacimiento2;
    private com.toedter.calendar.JDateChooser jDCFechaNacimiento3;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFCodigo2;
    private javax.swing.JTextField jTFCodigo3;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
