/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorEmpleado;
import controlador.ControladorSucursal;
import javax.swing.JOptionPane;

/**
 *
 * @author JUANPAULO
 */
public class JPAbonado extends javax.swing.JPanel {

    /**
     * Creates new form JPEmpleado
     */
    ControladorSucursal controladorSucursal;
    ControladorEmpleado controladorEmpleado;
    public JPAbonado() {
        initComponents();
        controladorSucursal = new ControladorSucursal();
        controladorEmpleado= new ControladorEmpleado();
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
        jTFApellidos1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jCBGenero1 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jCBEstadoCivil1 = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jCBTipoAbonado1 = new javax.swing.JComboBox();
        jBLimpiar1 = new javax.swing.JButton();
        jBCrear1 = new javax.swing.JButton();
        jDCFechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        jTFComuna1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTFNombre1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTFBarrio1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTFDireccion1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTFCiudad1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jCBTipoDocumento1 = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jCBImei1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jBLimpiar2 = new javax.swing.JButton();
        jBConsultar2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTFCodigo2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTFApellidos2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jCBGenero2 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jCBEstadoCivil2 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jCBTipoAbonado2 = new javax.swing.JComboBox();
        jDCFechaNacimiento2 = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        jTFComuna2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTFNombre2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTFBarrio2 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTFDireccion2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTFCiudad2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jCBTipoDocumento2 = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jCBImei2 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jBModificar3 = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jTFCodigo3 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jTFApellidos3 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jCBGenero3 = new javax.swing.JComboBox();
        jLabel66 = new javax.swing.JLabel();
        jCBEstadoCivil3 = new javax.swing.JComboBox();
        jLabel67 = new javax.swing.JLabel();
        jCBTipoAbonado3 = new javax.swing.JComboBox();
        jDCFechaNacimiento3 = new com.toedter.calendar.JDateChooser();
        jLabel68 = new javax.swing.JLabel();
        jTFComuna3 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jTFNombre3 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jTFBarrio3 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTFDireccion3 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTFCiudad3 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jCBTipoDocumento3 = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jCBImei3 = new javax.swing.JComboBox();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Abonado"));
        jPanel3.setLayout(null);

        jPanel1.setLayout(null);

        jLabel24.setText("Id");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(10, 10, 20, 14);
        jPanel1.add(jTFCodigo1);
        jTFCodigo1.setBounds(130, 10, 130, 20);

        jLabel25.setText("Apellidos");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(360, 40, 80, 14);
        jPanel1.add(jTFApellidos1);
        jTFApellidos1.setBounds(430, 40, 200, 20);

        jLabel26.setText("Genero");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(10, 130, 70, 14);

        jCBGenero1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        jCBGenero1.setName(""); // NOI18N
        jPanel1.add(jCBGenero1);
        jCBGenero1.setBounds(130, 130, 200, 20);

        jLabel27.setText("Estado Civil");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(360, 130, 100, 14);

        jCBEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Soltero", "Viudo", "Divorciado", "Union Libre" }));
        jCBEstadoCivil1.setName(""); // NOI18N
        jPanel1.add(jCBEstadoCivil1);
        jCBEstadoCivil1.setBounds(430, 130, 200, 20);

        jLabel28.setText("Tipo Abonado");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(10, 190, 130, 14);

        jCBTipoAbonado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Prepago", "Postpago", "Empresarial" }));
        jCBTipoAbonado1.setName(""); // NOI18N
        jPanel1.add(jCBTipoAbonado1);
        jCBTipoAbonado1.setBounds(130, 190, 200, 20);

        jBLimpiar1.setText("Limpiar");
        jPanel1.add(jBLimpiar1);
        jBLimpiar1.setBounds(510, 220, 80, 23);

        jBCrear1.setText("Crear");
        jBCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrear1ActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrear1);
        jBCrear1.setBounds(400, 220, 90, 23);

        jDCFechaNacimiento1.setDateFormatString("dd MMM yyyy");
        jPanel1.add(jDCFechaNacimiento1);
        jDCFechaNacimiento1.setBounds(130, 160, 200, 20);

        jLabel33.setText("Barrio");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(10, 100, 80, 14);
        jPanel1.add(jTFComuna1);
        jTFComuna1.setBounds(430, 70, 200, 20);

        jLabel34.setText("Nombres");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(10, 40, 80, 14);
        jPanel1.add(jTFNombre1);
        jTFNombre1.setBounds(130, 40, 200, 20);

        jLabel35.setText("Direccion");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(10, 70, 80, 14);
        jPanel1.add(jTFBarrio1);
        jTFBarrio1.setBounds(130, 100, 200, 20);

        jLabel36.setText("Comuna");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(360, 70, 80, 14);
        jPanel1.add(jTFDireccion1);
        jTFDireccion1.setBounds(130, 70, 200, 20);

        jLabel37.setText("Ciudad");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(360, 100, 80, 14);
        jPanel1.add(jTFCiudad1);
        jTFCiudad1.setBounds(430, 100, 200, 20);

        jLabel38.setText("Tipo Documento");
        jPanel1.add(jLabel38);
        jLabel38.setBounds(340, 10, 100, 14);

        jCBTipoDocumento1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Cedula", "Tarjeta de Identidad", "Pasaporte" }));
        jCBTipoDocumento1.setName(""); // NOI18N
        jPanel1.add(jCBTipoDocumento1);
        jCBTipoDocumento1.setBounds(430, 10, 200, 20);

        jLabel39.setText("F. de Nacimiento");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(10, 160, 130, 14);

        jLabel29.setText("Imei");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(360, 160, 100, 14);

        jCBImei1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Imei" }));
        jCBImei1.setName(""); // NOI18N
        jPanel1.add(jCBImei1);
        jCBImei1.setBounds(430, 160, 200, 20);

        jTabbedPane1.addTab("Crear", jPanel1);

        jPanel2.setLayout(null);

        jBLimpiar2.setText("Limpiar");
        jPanel2.add(jBLimpiar2);
        jBLimpiar2.setBounds(540, 200, 90, 23);

        jBConsultar2.setText("Consultar");
        jPanel2.add(jBConsultar2);
        jBConsultar2.setBounds(390, 200, 110, 23);

        jLabel30.setText("Id");
        jPanel2.add(jLabel30);
        jLabel30.setBounds(10, 10, 30, 14);
        jPanel2.add(jTFCodigo2);
        jTFCodigo2.setBounds(130, 10, 130, 20);

        jLabel31.setText("Apellidos");
        jPanel2.add(jLabel31);
        jLabel31.setBounds(360, 40, 80, 14);
        jPanel2.add(jTFApellidos2);
        jTFApellidos2.setBounds(430, 40, 200, 20);

        jLabel32.setText("Genero");
        jPanel2.add(jLabel32);
        jLabel32.setBounds(10, 130, 70, 14);

        jCBGenero2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        jCBGenero2.setName(""); // NOI18N
        jPanel2.add(jCBGenero2);
        jCBGenero2.setBounds(130, 130, 200, 20);

        jLabel40.setText("Estado Civil");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(360, 130, 100, 14);

        jCBEstadoCivil2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Soltero", "Viudo", "Divorciado", "Union Libre" }));
        jCBEstadoCivil2.setName(""); // NOI18N
        jPanel2.add(jCBEstadoCivil2);
        jCBEstadoCivil2.setBounds(430, 130, 200, 20);

        jLabel41.setText("Tipo Abonado");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(10, 190, 130, 14);

        jCBTipoAbonado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Prepago", "Postpago", "Empresarial" }));
        jCBTipoAbonado2.setName(""); // NOI18N
        jPanel2.add(jCBTipoAbonado2);
        jCBTipoAbonado2.setBounds(130, 190, 200, 20);

        jDCFechaNacimiento2.setDateFormatString("dd MMM yyyy");
        jPanel2.add(jDCFechaNacimiento2);
        jDCFechaNacimiento2.setBounds(130, 160, 200, 20);

        jLabel42.setText("Barrio");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(10, 100, 80, 14);
        jPanel2.add(jTFComuna2);
        jTFComuna2.setBounds(430, 70, 200, 20);

        jLabel43.setText("Nombres");
        jPanel2.add(jLabel43);
        jLabel43.setBounds(10, 40, 80, 14);
        jPanel2.add(jTFNombre2);
        jTFNombre2.setBounds(130, 40, 200, 20);

        jLabel44.setText("Direccion");
        jPanel2.add(jLabel44);
        jLabel44.setBounds(10, 70, 80, 14);
        jPanel2.add(jTFBarrio2);
        jTFBarrio2.setBounds(130, 100, 200, 20);

        jLabel45.setText("Comuna");
        jPanel2.add(jLabel45);
        jLabel45.setBounds(360, 70, 80, 14);
        jPanel2.add(jTFDireccion2);
        jTFDireccion2.setBounds(130, 70, 200, 20);

        jLabel46.setText("Ciudad");
        jPanel2.add(jLabel46);
        jLabel46.setBounds(360, 100, 80, 14);
        jPanel2.add(jTFCiudad2);
        jTFCiudad2.setBounds(430, 100, 200, 20);

        jLabel47.setText("Tipo Documento");
        jPanel2.add(jLabel47);
        jLabel47.setBounds(340, 10, 100, 14);

        jCBTipoDocumento2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Cedula", "Tarjeta de Identidad", "Pasaporte" }));
        jCBTipoDocumento2.setName(""); // NOI18N
        jPanel2.add(jCBTipoDocumento2);
        jCBTipoDocumento2.setBounds(430, 10, 200, 20);

        jLabel48.setText("F. de Nacimiento");
        jPanel2.add(jLabel48);
        jLabel48.setBounds(10, 160, 130, 14);

        jLabel49.setText("Imei");
        jPanel2.add(jLabel49);
        jLabel49.setBounds(360, 160, 100, 14);

        jCBImei2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Imei" }));
        jCBImei2.setName(""); // NOI18N
        jPanel2.add(jCBImei2);
        jCBImei2.setBounds(430, 160, 200, 20);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTResultados);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 240, 670, 120);

        jTabbedPane1.addTab("Consultar", jPanel2);

        jPanel4.setLayout(null);

        jBModificar3.setText("Modificar");
        jPanel4.add(jBModificar3);
        jBModificar3.setBounds(440, 200, 90, 23);

        jLabel63.setText("Id");
        jPanel4.add(jLabel63);
        jLabel63.setBounds(10, 10, 30, 14);
        jPanel4.add(jTFCodigo3);
        jTFCodigo3.setBounds(130, 10, 130, 20);

        jLabel64.setText("Apellidos");
        jPanel4.add(jLabel64);
        jLabel64.setBounds(360, 40, 80, 14);
        jPanel4.add(jTFApellidos3);
        jTFApellidos3.setBounds(430, 40, 200, 20);

        jLabel65.setText("Genero");
        jPanel4.add(jLabel65);
        jLabel65.setBounds(10, 130, 70, 14);

        jCBGenero3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Femenino", "Masculino" }));
        jCBGenero3.setName(""); // NOI18N
        jPanel4.add(jCBGenero3);
        jCBGenero3.setBounds(130, 130, 200, 20);

        jLabel66.setText("Estado Civil");
        jPanel4.add(jLabel66);
        jLabel66.setBounds(360, 130, 100, 14);

        jCBEstadoCivil3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Soltero", "Viudo", "Divorciado", "Union Libre" }));
        jCBEstadoCivil3.setName(""); // NOI18N
        jPanel4.add(jCBEstadoCivil3);
        jCBEstadoCivil3.setBounds(430, 130, 200, 20);

        jLabel67.setText("Tipo Abonado");
        jPanel4.add(jLabel67);
        jLabel67.setBounds(10, 190, 130, 14);

        jCBTipoAbonado3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Prepago", "Postpago", "Empresarial" }));
        jCBTipoAbonado3.setName(""); // NOI18N
        jPanel4.add(jCBTipoAbonado3);
        jCBTipoAbonado3.setBounds(130, 190, 200, 20);

        jDCFechaNacimiento3.setDateFormatString("dd MMM yyyy");
        jPanel4.add(jDCFechaNacimiento3);
        jDCFechaNacimiento3.setBounds(130, 160, 200, 20);

        jLabel68.setText("Barrio");
        jPanel4.add(jLabel68);
        jLabel68.setBounds(10, 100, 80, 14);
        jPanel4.add(jTFComuna3);
        jTFComuna3.setBounds(430, 70, 200, 20);

        jLabel69.setText("Nombres");
        jPanel4.add(jLabel69);
        jLabel69.setBounds(10, 40, 80, 14);
        jPanel4.add(jTFNombre3);
        jTFNombre3.setBounds(130, 40, 200, 20);

        jLabel70.setText("Direccion");
        jPanel4.add(jLabel70);
        jLabel70.setBounds(10, 70, 80, 14);
        jPanel4.add(jTFBarrio3);
        jTFBarrio3.setBounds(130, 100, 200, 20);

        jLabel71.setText("Comuna");
        jPanel4.add(jLabel71);
        jLabel71.setBounds(360, 70, 80, 14);
        jPanel4.add(jTFDireccion3);
        jTFDireccion3.setBounds(130, 70, 200, 20);

        jLabel72.setText("Ciudad");
        jPanel4.add(jLabel72);
        jLabel72.setBounds(360, 100, 80, 14);
        jPanel4.add(jTFCiudad3);
        jTFCiudad3.setBounds(430, 100, 200, 20);

        jLabel73.setText("Tipo Documento");
        jPanel4.add(jLabel73);
        jLabel73.setBounds(340, 10, 100, 14);

        jCBTipoDocumento3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Cedula", "Tarjeta de Identidad", "Pasaporte" }));
        jCBTipoDocumento3.setName(""); // NOI18N
        jPanel4.add(jCBTipoDocumento3);
        jCBTipoDocumento3.setBounds(430, 10, 200, 20);

        jLabel74.setText("F. de Nacimiento");
        jPanel4.add(jLabel74);
        jLabel74.setBounds(10, 160, 130, 14);

        jLabel75.setText("Imei");
        jPanel4.add(jLabel75);
        jLabel75.setBounds(360, 160, 100, 14);

        jCBImei3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cargar Imei" }));
        jCBImei3.setName(""); // NOI18N
        jPanel4.add(jCBImei3);
        jCBImei3.setBounds(430, 160, 200, 20);

        jTabbedPane1.addTab("Editar", jPanel4);

        jPanel3.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 750, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrear1ActionPerformed
     
    }//GEN-LAST:event_jBCrear1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar2;
    private javax.swing.JButton jBCrear1;
    private javax.swing.JButton jBLimpiar1;
    private javax.swing.JButton jBLimpiar2;
    private javax.swing.JButton jBModificar3;
    private javax.swing.JComboBox jCBEstadoCivil1;
    private javax.swing.JComboBox jCBEstadoCivil2;
    private javax.swing.JComboBox jCBEstadoCivil3;
    private javax.swing.JComboBox jCBGenero1;
    private javax.swing.JComboBox jCBGenero2;
    private javax.swing.JComboBox jCBGenero3;
    private javax.swing.JComboBox jCBImei1;
    private javax.swing.JComboBox jCBImei2;
    private javax.swing.JComboBox jCBImei3;
    private javax.swing.JComboBox jCBTipoAbonado1;
    private javax.swing.JComboBox jCBTipoAbonado2;
    private javax.swing.JComboBox jCBTipoAbonado3;
    private javax.swing.JComboBox jCBTipoDocumento1;
    private javax.swing.JComboBox jCBTipoDocumento2;
    private javax.swing.JComboBox jCBTipoDocumento3;
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
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellidos1;
    private javax.swing.JTextField jTFApellidos2;
    private javax.swing.JTextField jTFApellidos3;
    private javax.swing.JTextField jTFBarrio1;
    private javax.swing.JTextField jTFBarrio2;
    private javax.swing.JTextField jTFBarrio3;
    private javax.swing.JTextField jTFCiudad1;
    private javax.swing.JTextField jTFCiudad2;
    private javax.swing.JTextField jTFCiudad3;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFCodigo2;
    private javax.swing.JTextField jTFCodigo3;
    private javax.swing.JTextField jTFComuna1;
    private javax.swing.JTextField jTFComuna2;
    private javax.swing.JTextField jTFComuna3;
    private javax.swing.JTextField jTFDireccion1;
    private javax.swing.JTextField jTFDireccion2;
    private javax.swing.JTextField jTFDireccion3;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
