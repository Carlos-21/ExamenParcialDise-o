/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.ReservarAsiento;

/**
 *
 * @author CARLOS
 */
public class panelPasajero extends javax.swing.JPanel {

    /**
     * Creates new form panelPasajero
     */
    public panelPasajero() {
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

        labelPasajeros = new javax.swing.JLabel();
        comboDocumento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        labelPasajeros1 = new javax.swing.JLabel();
        textoDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelPasajeros2 = new javax.swing.JLabel();
        textoApellidoPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelPasajeros3 = new javax.swing.JLabel();
        textoApellidoMaterno = new javax.swing.JTextField();
        labelPasajeros4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        labelPasajeros5 = new javax.swing.JLabel();
        textoEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelPasajeros6 = new javax.swing.JLabel();
        labelPasajeros7 = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        labelPasajeros8 = new javax.swing.JLabel();
        comoLugarEmbarque = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        labelPasajeros9 = new javax.swing.JLabel();
        comboLugarEmision = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        labelAsiento = new javax.swing.JLabel();
        labelPasajeros10 = new javax.swing.JLabel();
        textoRUC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelPasajeros11 = new javax.swing.JLabel();
        textoRazonSocial = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        labelPasajeros12 = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(820, 417));
        setPreferredSize(new java.awt.Dimension(857, 417));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPasajeros.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros.setText("Documento");
        labelPasajeros.setAlignmentX(1.0F);
        labelPasajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros.setOpaque(true);
        add(labelPasajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, 40));

        comboDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte" }));
        comboDocumento.setSelectedIndex(-1);
        add(comboDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, 25));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, 50));

        labelPasajeros1.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros1.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros1.setText("Nº Documento");
        labelPasajeros1.setAlignmentX(1.0F);
        labelPasajeros1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros1.setOpaque(true);
        add(labelPasajeros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 140, 40));
        add(textoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 120, 25));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 140, 50));
        add(textoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 120, 25));

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 140, 50));

        labelPasajeros2.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros2.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros2.setText("Nombres");
        labelPasajeros2.setAlignmentX(1.0F);
        labelPasajeros2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros2.setOpaque(true);
        add(labelPasajeros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 140, 40));
        add(textoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 120, 25));

        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 140, 50));

        labelPasajeros3.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros3.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros3.setText("Apellido Paterno");
        labelPasajeros3.setAlignmentX(1.0F);
        labelPasajeros3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros3.setOpaque(true);
        add(labelPasajeros3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 140, 40));
        add(textoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 120, 25));

        labelPasajeros4.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros4.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros4.setText("Apellido Materno");
        labelPasajeros4.setAlignmentX(1.0F);
        labelPasajeros4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros4.setOpaque(true);
        add(labelPasajeros4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 140, 40));

        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 140, 50));

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione sexo", "Masculino", "Femenino" }));
        add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 25));

        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, 50));

        labelPasajeros5.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros5.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros5.setText("Sexo");
        labelPasajeros5.setAlignmentX(1.0F);
        labelPasajeros5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros5.setOpaque(true);
        add(labelPasajeros5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, 40));
        add(textoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 120, 25));

        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 140, 50));

        labelPasajeros6.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros6.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros6.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros6.setText("Edad");
        labelPasajeros6.setAlignmentX(1.0F);
        labelPasajeros6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros6.setOpaque(true);
        add(labelPasajeros6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 140, 40));

        labelPasajeros7.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros7.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros7.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros7.setText("Teléfono");
        labelPasajeros7.setAlignmentX(1.0F);
        labelPasajeros7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros7.setOpaque(true);
        add(labelPasajeros7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 140, 40));
        add(textoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 120, 25));

        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 140, 50));

        labelPasajeros8.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros8.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros8.setText("<html><p align=center>Lugar Emisión</p><p align=center>de Boleto</p></html>");
        labelPasajeros8.setAlignmentX(1.0F);
        labelPasajeros8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros8.setOpaque(true);
        add(labelPasajeros8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 140, 40));

        comoLugarEmbarque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione sexo", "Masculino", "Femenino" }));
        add(comoLugarEmbarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 120, 25));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 140, 50));

        labelPasajeros9.setBackground(new java.awt.Color(255, 255, 0));
        labelPasajeros9.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros9.setForeground(new java.awt.Color(0, 0, 153));
        labelPasajeros9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros9.setText("<html><p align=center>Lugar de embarque</p><p align=center>Pasajero</p></html>");
        labelPasajeros9.setAlignmentX(1.0F);
        labelPasajeros9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros9.setOpaque(true);
        add(labelPasajeros9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 140, 40));

        comboLugarEmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione sexo", "Masculino", "Femenino" }));
        add(comboLugarEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 120, 25));

        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 140, 50));

        labelAsiento.setBackground(new java.awt.Color(0, 0, 153));
        labelAsiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelAsiento.setForeground(new java.awt.Color(255, 255, 255));
        labelAsiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAsiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelAsiento.setOpaque(true);
        add(labelAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 180));

        labelPasajeros10.setBackground(new java.awt.Color(56, 100, 144));
        labelPasajeros10.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros10.setForeground(new java.awt.Color(255, 255, 255));
        labelPasajeros10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros10.setText("R.U.C.");
        labelPasajeros10.setAlignmentX(1.0F);
        labelPasajeros10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros10.setOpaque(true);
        add(labelPasajeros10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, 40));
        add(textoRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 120, 25));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 140, 50));

        jLabel13.setBackground(new java.awt.Color(56, 100, 144));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html><p align=center>Si desea emitir boleto de</p><p align=center>viaje para sustentar</p><p align=center>costos y gastos, ingresar</p><p align=center>Nº de Ruc y Razón Social<p></html>");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.setOpaque(true);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 90));

        labelPasajeros11.setBackground(new java.awt.Color(56, 100, 144));
        labelPasajeros11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros11.setForeground(new java.awt.Color(255, 255, 255));
        labelPasajeros11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros11.setText("Razon Social");
        labelPasajeros11.setAlignmentX(1.0F);
        labelPasajeros11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros11.setOpaque(true);
        add(labelPasajeros11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 200, 40));
        add(textoRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 180, 25));

        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 200, 50));

        labelPasajeros12.setBackground(new java.awt.Color(56, 100, 144));
        labelPasajeros12.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        labelPasajeros12.setForeground(new java.awt.Color(255, 255, 255));
        labelPasajeros12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasajeros12.setText("Dirección");
        labelPasajeros12.setAlignmentX(1.0F);
        labelPasajeros12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasajeros12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelPasajeros12.setOpaque(true);
        add(labelPasajeros12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 280, 40));
        add(textoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 260, 25));

        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 280, 50));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/imagenes/iconos/eliminar.png"))); // NOI18N
        jButton1.setText("Eliminar pasajero");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/imagenes/iconos/guardar.png"))); // NOI18N
        jButton2.setText("Guardar datos");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/imagenes/iconos/icono-de-lupa.png"))); // NOI18N
        jButton3.setText("Buscar pasajero");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboDocumento;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JComboBox<String> comboLugarEmision;
    private javax.swing.JComboBox<String> comoLugarEmbarque;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    public javax.swing.JLabel labelAsiento;
    private javax.swing.JLabel labelPasajeros;
    private javax.swing.JLabel labelPasajeros1;
    private javax.swing.JLabel labelPasajeros10;
    private javax.swing.JLabel labelPasajeros11;
    private javax.swing.JLabel labelPasajeros12;
    private javax.swing.JLabel labelPasajeros2;
    private javax.swing.JLabel labelPasajeros3;
    private javax.swing.JLabel labelPasajeros4;
    private javax.swing.JLabel labelPasajeros5;
    private javax.swing.JLabel labelPasajeros6;
    private javax.swing.JLabel labelPasajeros7;
    private javax.swing.JLabel labelPasajeros8;
    private javax.swing.JLabel labelPasajeros9;
    private javax.swing.JTextField textoApellidoMaterno;
    private javax.swing.JTextField textoApellidoPaterno;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoDocumento;
    private javax.swing.JTextField textoEdad;
    private javax.swing.JTextField textoNombres;
    private javax.swing.JTextField textoRUC;
    private javax.swing.JTextField textoRazonSocial;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
