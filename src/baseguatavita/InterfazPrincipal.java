package baseguatavita;
import baseguatavita.Busqueda;
import baseguatavita.REG1;
import baseguatavita.REG1DAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class InterfazPrincipal extends javax.swing.JFrame {
    
    REG1 cl = new REG1();
    REG1DAO r1 = new REG1DAO();
    REG2 cl2 = new REG2();
    REG2DAO r12 = new REG2DAO();
        public InterfazPrincipal() {
                        initComponents();
        setLocationRelativeTo(null);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
      } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        REG1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        botonIrATabla = new javax.swing.JButton();
        REG2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        tbuscar2 = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableLista = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tx9 = new javax.swing.JTextField();
        tx4 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        tx6 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        tx8 = new javax.swing.JTextField();
        tx18 = new javax.swing.JTextField();
        tccatastral2 = new javax.swing.JTextField();
        tx7 = new javax.swing.JTextField();
        tx19 = new javax.swing.JTextField();
        tx17 = new javax.swing.JTextField();
        tx23 = new javax.swing.JTextField();
        tx24 = new javax.swing.JTextField();
        tx25 = new javax.swing.JTextField();
        tx29 = new javax.swing.JTextField();
        tx31 = new javax.swing.JTextField();
        tx30 = new javax.swing.JTextField();
        tx27 = new javax.swing.JTextField();
        tx28 = new javax.swing.JTextField();
        tx26 = new javax.swing.JTextField();
        tx14 = new javax.swing.JTextField();
        tx16 = new javax.swing.JTextField();
        tx15 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        tx20 = new javax.swing.JTextField();
        tx21 = new javax.swing.JTextField();
        tx22 = new javax.swing.JTextField();
        tx11 = new javax.swing.JTextField();
        tx13 = new javax.swing.JTextField();
        tx12 = new javax.swing.JTextField();
        tx5 = new javax.swing.JTextField();
        anadir2 = new javax.swing.JButton();
        actualizar2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Bq2 = new javax.swing.JButton();
        limpiar1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        tx10 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableLista2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableLista3 = new javax.swing.JTable();
        Buscar2 = new javax.swing.JButton();
        tbuscar3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt10 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        tccatastral = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        anadir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        txt5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        txt12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        Bq1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });

        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Captura de pantalla 2024-11-04 111809.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/25861_12-212438_200x200.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 218, 205));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda-de-casa.png"))); // NOI18N
        jButton1.setText("Consulta Registro 2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        REG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editor-de-documentos.png"))); // NOI18N
        REG1.setText("Modificacion REG 1");
        REG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REG1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/data_storage_database_icon_194717 (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Proxy 9", 1, 24)); // NOI18N
        jLabel2.setText("Base de Datos");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar-sesion.png"))); // NOI18N
        jButton4.setText("Salida");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        botonIrATabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda-de-casa.png"))); // NOI18N
        botonIrATabla.setText("Consulta Registro 1");
        botonIrATabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIrATablaActionPerformed(evt);
            }
        });

        REG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/editor-de-documentos.png"))); // NOI18N
        REG2.setText("Modificacion REG 2");
        REG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REG2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(botonIrATabla)
                            .addComponent(REG1)
                            .addComponent(REG2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(botonIrATabla)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(REG1)
                .addGap(29, 29, 29)
                .addComponent(REG2)
                .addGap(31, 31, 31)
                .addComponent(jButton4)
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 246, 936));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbuscar2ActionPerformed(evt);
            }
        });
        jPanel4.add(tbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 470, 20));

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda-de-casa.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel4.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        tableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableLista);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 740, 320));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel55.setText("Documento de Identidad");
        jLabel55.setToolTipText("");
        jPanel4.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        jTabbedPane1.addTab(".", jPanel4);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("ID");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 45, 26));

        jLabel20.setText("Cedula Catastral");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 102, -1));

        jLabel21.setText("Matricula Inmobiliaria");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 120, -1));

        jLabel22.setText("Area Terreno");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, 80, -1));

        jLabel23.setText("Area Construida");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, 142, -1));

        jLabel24.setText("Vigencia");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, 55, -1));

        jLabel25.setText("Zona Fisica 1");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, 80, -1));

        tx9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx9ActionPerformed(evt);
            }
        });
        jPanel7.add(tx9, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 253, 119, -1));

        tx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx4ActionPerformed(evt);
            }
        });
        jPanel7.add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 94, 86, -1));

        tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx2ActionPerformed(evt);
            }
        });
        jPanel7.add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 38, 210, -1));

        tx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx3ActionPerformed(evt);
            }
        });
        jPanel7.add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 66, 138, -1));

        tx6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx6ActionPerformed(evt);
            }
        });
        jPanel7.add(tx6, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 160, 86, -1));

        jLabel29.setText("Zona Economica 1");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 231, 130, -1));

        jLabel30.setText("Zona Fisica 2");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 259, 90, -1));

        jLabel31.setText("Zona Economica 2");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, 110, -1));

        jLabel34.setText("Hab3");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 256, -1, -1));

        jLabel35.setText("Baños1");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 284, 45, -1));

        jLabel36.setText("Baños2");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 312, 45, -1));

        jLabel37.setText("Baños3");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 340, 45, -1));

        jLabel38.setText("Local2");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, 20));

        jLabel40.setText("Local3");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 65, -1, -1));

        jLabel41.setText("Estrato1");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 45, -1));

        jLabel42.setText("Estrato2");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 45, -1));

        jLabel43.setText("Estrato3");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 45, -1));

        jLabel44.setText("Puntaje1");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 109, -1, -1));

        jLabel45.setText("Puntaje2");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 137, -1, -1));

        jLabel46.setText("Puntaje3");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 165, -1, -1));

        jLabel47.setText("Destino1");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 200, -1, -1));

        jLabel48.setText("Destino2");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 228, -1, -1));

        jLabel49.setText("Destino3");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 256, -1, -1));

        jLabel50.setText("Hab2");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 228, -1, -1));

        jLabel51.setText("Hab1");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 200, 33, -1));

        jLabel52.setText("Pisos1");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 109, -1, -1));

        tx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx1ActionPerformed(evt);
            }
        });
        jPanel7.add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 8, 120, -1));

        tx8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx8ActionPerformed(evt);
            }
        });
        jPanel7.add(tx8, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 225, 119, -1));

        tx18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx18ActionPerformed(evt);
            }
        });
        jPanel7.add(tx18, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 34, 120, -1));

        tccatastral2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tccatastral2ActionPerformed(evt);
            }
        });
        jPanel7.add(tccatastral2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, -1));

        tx7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx7ActionPerformed(evt);
            }
        });
        jPanel7.add(tx7, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 197, 119, -1));

        tx19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx19ActionPerformed(evt);
            }
        });
        jPanel7.add(tx19, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 62, 120, -1));

        tx17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx17ActionPerformed(evt);
            }
        });
        jPanel7.add(tx17, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 6, 120, -1));

        tx23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx23ActionPerformed(evt);
            }
        });
        jPanel7.add(tx23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 120, -1));

        tx24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx24ActionPerformed(evt);
            }
        });
        jPanel7.add(tx24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 120, -1));

        tx25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx25ActionPerformed(evt);
            }
        });
        jPanel7.add(tx25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 120, -1));

        tx29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx29ActionPerformed(evt);
            }
        });
        jPanel7.add(tx29, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 106, 120, -1));

        tx31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx31ActionPerformed(evt);
            }
        });
        jPanel7.add(tx31, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 162, 120, -1));

        tx30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx30ActionPerformed(evt);
            }
        });
        jPanel7.add(tx30, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 134, 120, -1));

        tx27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx27ActionPerformed(evt);
            }
        });
        jPanel7.add(tx27, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 225, 120, -1));

        tx28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx28ActionPerformed(evt);
            }
        });
        jPanel7.add(tx28, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 253, 120, -1));

        tx26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx26ActionPerformed(evt);
            }
        });
        jPanel7.add(tx26, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 197, 120, -1));

        tx14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx14ActionPerformed(evt);
            }
        });
        jPanel7.add(tx14, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 281, 120, -1));

        tx16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx16ActionPerformed(evt);
            }
        });
        jPanel7.add(tx16, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 337, 120, -1));

        tx15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx15ActionPerformed(evt);
            }
        });
        jPanel7.add(tx15, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 309, 120, -1));

        jLabel57.setText("Pisos2");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 137, -1, -1));

        jLabel58.setText("Pisos3");
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 165, -1, -1));

        tx20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx20ActionPerformed(evt);
            }
        });
        jPanel7.add(tx20, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 106, 120, -1));

        tx21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx21ActionPerformed(evt);
            }
        });
        jPanel7.add(tx21, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 134, 120, -1));

        tx22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx22ActionPerformed(evt);
            }
        });
        jPanel7.add(tx22, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 162, 120, -1));

        tx11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx11ActionPerformed(evt);
            }
        });
        jPanel7.add(tx11, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 197, 120, -1));

        tx13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx13ActionPerformed(evt);
            }
        });
        jPanel7.add(tx13, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 253, 120, -1));

        tx12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx12ActionPerformed(evt);
            }
        });
        jPanel7.add(tx12, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 225, 120, -1));

        tx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx5ActionPerformed(evt);
            }
        });
        jPanel7.add(tx5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 128, 86, -1));

        anadir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/anadir.png"))); // NOI18N
        anadir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadir2ActionPerformed(evt);
            }
        });
        jPanel7.add(anadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        actualizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        actualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar2ActionPerformed(evt);
            }
        });
        jPanel7.add(actualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/eliminar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, -1, -1));

        Bq2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda-de-casa.png"))); // NOI18N
        Bq2.setText("Buscar");
        Bq2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bq2ActionPerformed(evt);
            }
        });
        jPanel7.add(Bq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        limpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/liquido-de-limpieza.png"))); // NOI18N
        limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar1ActionPerformed(evt);
            }
        });
        jPanel7.add(limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Busqueda ID");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 20));

        tx10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx10ActionPerformed(evt);
            }
        });
        jPanel7.add(tx10, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 281, 119, -1));

        jLabel53.setText("Local1");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 9, -1, -1));

        jTabbedPane1.addTab(".", jPanel7);

        tableLista2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableLista2);

        tableLista3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tableLista3);

        Buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda-de-casa.png"))); // NOI18N
        Buscar2.setText("Buscar");
        Buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar2ActionPerformed(evt);
            }
        });

        tbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbuscar3ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Cédula Catastral");
        jLabel33.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(Buscar2))
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar2))))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(".", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("ID");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, 45, 26));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Busqueda ID");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, 20));

        jLabel8.setText("Cantidad de Propietarios");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 75, 140, -1));

        jLabel9.setText("Propietario Principal");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 103, 110, -1));

        jLabel10.setText("Numero de Documento");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 102, -1));

        jLabel11.setText("Direccion");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jLabel12.setText("Área del Terreno");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 186, -1));

        jLabel13.setText("Área Construida");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 127, -1));

        jLabel14.setText("Avalúo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 43, -1));

        jLabel15.setText("Vigencia");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 55, -1));

        txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt10ActionPerformed(evt);
            }
        });
        jPanel6.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 479, -1));

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        jPanel6.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 479, -1));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        jPanel6.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 479, -1));

        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });
        jPanel6.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 479, -1));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel6.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 479, -1));

        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });
        jPanel6.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 479, -1));

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });
        jPanel6.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 479, -1));

        tccatastral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tccatastralActionPerformed(evt);
            }
        });
        jPanel6.add(tccatastral, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 70, -1));

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        jPanel6.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 479, -1));

        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });
        jPanel6.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 479, -1));

        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel6.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        anadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/anadir.png"))); // NOI18N
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });
        jPanel6.add(anadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/eliminar.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel6.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        jPanel6.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 479, -1));

        jLabel16.setText("Tipo de Documento");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 131, 110, -1));

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/liquido-de-limpieza.png"))); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel6.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        txt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt12ActionPerformed(evt);
            }
        });
        jPanel6.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 479, -1));

        jLabel17.setText("Cedula Catastral");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 41, 102, -1));

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        jPanel6.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 479, -1));

        Bq1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda-de-casa.png"))); // NOI18N
        Bq1.setText("Buscar");
        Bq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bq1ActionPerformed(evt);
            }
        });
        jPanel6.add(Bq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jTabbedPane1.addTab(".", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 190, 790, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Seguro que deseas salir?");
        if (respuesta==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbuscar2ActionPerformed

    private void REG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REG2ActionPerformed
REG2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       
        jTabbedPane1.setSelectedIndex(1); 
    }
});
    }//GEN-LAST:event_REG2ActionPerformed

    private void txt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt10ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void tccatastralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tccatastralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tccatastralActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt11ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                             
jButton1.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        jTabbedPane1.setSelectedIndex(2);
    }
});    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53ActionPerformed

    private void tx15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx15ActionPerformed

    private void tx16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx16ActionPerformed

    private void tx14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx14ActionPerformed

    private void tx26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx26ActionPerformed

    private void tx28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx28ActionPerformed

    private void tx27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx27ActionPerformed

    private void tx30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx30ActionPerformed

    private void tx31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx31ActionPerformed

    private void tx29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx29ActionPerformed

    private void tx25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx25ActionPerformed

    private void tx24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx24ActionPerformed

    private void tx23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx23ActionPerformed

    private void tx17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx17ActionPerformed

    private void tx19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx19ActionPerformed

    private void tx7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx7ActionPerformed

    private void tccatastral2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tccatastral2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tccatastral2ActionPerformed

    private void tx18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx18ActionPerformed

    private void tx8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx8ActionPerformed

    private void tx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx1ActionPerformed

    private void tx6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx6ActionPerformed

    private void tx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx3ActionPerformed

    private void tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx2ActionPerformed

    private void tx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx4ActionPerformed

    private void tx9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx9ActionPerformed

    private void tx20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx20ActionPerformed

    private void tx21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx21ActionPerformed

    private void tx22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx22ActionPerformed

    private void tx11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx11ActionPerformed

    private void tx13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx13ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void tx12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx12ActionPerformed

    private void tx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx5ActionPerformed
public void buscar(String buscar){
    Busqueda p = new Busqueda();
DefaultTableModel modelo = p.buscarPer(buscar);
tableLista.setModel(modelo);
}


        
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       buscar(tbuscar2.getText());
       
    }//GEN-LAST:event_BuscarActionPerformed
public void buscar2(String buscar2){
    Busqueda p = new Busqueda();
DefaultTableModel modelo2 = p.buscarPer2(buscar2);
tableLista2.setModel(modelo2);
DefaultTableModel modelo3 = p.buscarPer3(buscar2);
tableLista3.setModel(modelo3);
}

    private void Buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar2ActionPerformed
        buscar2(tbuscar3.getText());
    }//GEN-LAST:event_Buscar2ActionPerformed

    private void botonIrATablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIrATablaActionPerformed
botonIrATabla.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        jTabbedPane1.setSelectedIndex(0);
    }
});
    }//GEN-LAST:event_botonIrATablaActionPerformed

    private void REG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REG1ActionPerformed
                                         
                                                  
REG1.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {

        jTabbedPane1.setSelectedIndex(3);
    }
});

    }//GEN-LAST:event_REG1ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
    cl.setNumid(Integer.parseInt(txt1.getText())); // Obtener el numid del campo
    cl.setCedula_catastral(txt2.getText());
    cl.setNum_orden(Integer.parseInt(txt3.getText()));
    cl.setNombre(txt4.getText());
    cl.setTipo_doc(txt5.getText());
    cl.setNum_doc(Integer.parseInt(txt6.getText()));
    cl.setDireccion(txt7.getText());
    cl.setArea_terreno(new BigDecimal(txt8.getText()));
    cl.setArea_construida(new BigDecimal(txt9.getText()));
    cl.setAvaluo(new BigDecimal(txt10.getText()));
    // Asumiendo que el campo de fecha está formateado adecuadamente
    String dateString = txt11.getText(); 
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
    try {
        java.util.Date utilDate = formatter.parse(dateString);
        cl.setVigencia(new java.sql.Date(utilDate.getTime())); // Establecer vigencia como java.sql.Date
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa dd/MM/yyyy");
        return;
    }

    if (r1.ActualizarREG1(cl)) {
        JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro.");
    }


    }//GEN-LAST:event_actualizarActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        // Verificar si al menos un campo está vacío
    if ("".equals(txt1.getText()) || 
        "".equals(txt2.getText()) || 
        "".equals(txt3.getText()) || 
        "".equals(txt4.getText()) || 
        "".equals(txt5.getText()) || 
        "".equals(txt6.getText()) || 
        "".equals(txt7.getText()) || 
        "".equals(txt8.getText()) || 
        "".equals(txt9.getText()) || 
        "".equals(txt10.getText()) ||
        "".equals(txt11.getText())) {
        
        // Si algún campo está vacío, mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
    } else {
        // Si todos los campos están llenos, proceder con la operación
        cl.setNumid(Integer.parseInt(txt1.getText()));
        cl.setCedula_catastral(txt2.getText());
        cl.setNum_orden(Integer.parseInt(txt3.getText()));
        cl.setNombre(txt4.getText());
        cl.setTipo_doc(txt5.getText());
        cl.setNum_doc(Integer.parseInt(txt6.getText()));
        cl.setDireccion(txt7.getText());
        cl.setArea_terreno(new BigDecimal(txt8.getText()));
        cl.setArea_construida(new BigDecimal(txt9.getText()));
        cl.setAvaluo(new BigDecimal(txt10.getText()));
        
        String dateString = txt11.getText(); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 

        try {
            java.util.Date utilDate = formatter.parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 
            cl.setVigencia(sqlDate);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Por favor, use dd/MM/yyyy.");
            return; // Salir del método si hay un error en la fecha
        }

        r1.RegistrarREG1(cl);
        JOptionPane.showMessageDialog(null, "Registrado");
    }
    }//GEN-LAST:event_anadirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
try {
    int numid = Integer.parseInt(tccatastral.getText()); 
    if (r1.EliminarREG1(numid)) { 
        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro.");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para ID.");
}

    }//GEN-LAST:event_eliminarActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed


    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
    txt1.setText("");
    txt2.setText("");
    txt3.setText("");
    txt4.setText("");
    txt5.setText("");
    txt6.setText("");
    txt7.setText("");
    txt8.setText("");
    txt9.setText("");
    txt10.setText("");
    txt11.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void txt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt12ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void Bq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bq1ActionPerformed
          int numid = Integer.parseInt(tccatastral.getText()); // Obtener la cédula ingresada
    REG1 registro = r1.obtenerRegistroPorCedula(numid); // Buscar el registro por cédula

    if (registro != null) {
        
        txt1.setText(String.valueOf(registro.getNumid()));
        txt2.setText(registro.getCedula_catastral());
        txt3.setText(String.valueOf(registro.getNum_orden()));
        txt4.setText(registro.getNombre());
        txt5.setText(registro.getTipo_doc());
        txt6.setText(String.valueOf(registro.getNum_doc()));
        txt7.setText(registro.getDireccion());
        txt8.setText(registro.getArea_terreno().toString());
        txt9.setText(registro.getArea_construida().toString());
        txt10.setText(registro.getAvaluo().toString());
        txt11.setText(new SimpleDateFormat("dd/MM/yyyy").format(registro.getVigencia())); // Formato de fecha
    } else {
        JOptionPane.showMessageDialog(null, "No se encontró el registro con el ID proporcionado.");
    }
    }//GEN-LAST:event_Bq1ActionPerformed

    private void Bq2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bq2ActionPerformed
int numid = Integer.parseInt(tccatastral2.getText()); // Obtener la cédula ingresada
REG2 registro = r12.obtenerRegistroPorCedula(numid); // Buscar el registro por cédula

if (registro != null) {
    
    tx1.setText(String.valueOf(registro.getNumid()));
    tx2.setText(registro.getCedula_catastral());
    tx3.setText(registro.getMatricula_inmobiliaria());
    tx4.setText(registro.getAterreno().toString());
    tx5.setText(registro.getAconstruida().toString());
    tx6.setText(new SimpleDateFormat("dd/MM/yyyy").format(registro.getVigencia())); // Formato de fecha
    
    tx7.setText(registro.getZ_fis1());
    tx8.setText(registro.getZ_fis2());
    tx9.setText(registro.getZ_econ1());
    tx10.setText(registro.getZ_econ2());
    
    tx11.setText(String.valueOf(registro.getHabitaciones1()));
    tx12.setText(String.valueOf(registro.getHabitaciones2()));
    tx13.setText(String.valueOf(registro.getHabitaciones3()));
    
    tx14.setText(String.valueOf(registro.getBanos1()));
    tx15.setText(String.valueOf(registro.getBanos2()));
    tx16.setText(String.valueOf(registro.getBanos3()));
    
    tx17.setText(String.valueOf(registro.getLocales1()));
    tx18.setText(String.valueOf(registro.getLocales2()));
    tx19.setText(String.valueOf(registro.getLocales3()));
    
    tx20.setText(String.valueOf(registro.getPisos1()));
    tx21.setText(String.valueOf(registro.getPisos2()));
    tx22.setText(String.valueOf(registro.getPisos3()));
    
    tx23.setText(String.valueOf(registro.getEstrato1()));
    tx24.setText(String.valueOf(registro.getEstrato2()));
    tx25.setText(String.valueOf(registro.getEstrato3()));
    
    tx26.setText(registro.getDestino1());
    tx27.setText(registro.getDestino2());
    tx28.setText(registro.getDestino3());
    
    tx29.setText(registro.getPuntaje1().toString());
    tx30.setText(registro.getPuntaje2().toString());
    tx31.setText(registro.getPuntaje3().toString());

} else {
    JOptionPane.showMessageDialog(null, "No se encontró el registro con el ID proporcionado.");
}

    }//GEN-LAST:event_Bq2ActionPerformed

    private void limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar1ActionPerformed
tx1.setText("");
tx2.setText("");
tx3.setText("");
tx4.setText("");
tx5.setText("");
tx6.setText("");
tx7.setText("");
tx8.setText("");
tx9.setText("");
tx10.setText("");
tx11.setText("");
tx12.setText("");
tx13.setText("");
tx14.setText("");
tx15.setText("");
tx16.setText("");
tx17.setText("");
tx18.setText("");
tx19.setText("");
tx20.setText("");
tx21.setText("");
tx22.setText("");
tx23.setText("");
tx24.setText("");
tx25.setText("");
tx26.setText("");
tx27.setText("");
tx28.setText("");
tx29.setText("");
tx30.setText("");
tx31.setText("");
    }//GEN-LAST:event_limpiar1ActionPerformed

    private void actualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar2ActionPerformed
cl2.setNumid(Integer.parseInt(tx1.getText())); // Obtener el numid del campo
cl2.setCedula_catastral(tx2.getText());
cl2.setMatricula_inmobiliaria(tx3.getText()); // Asegúrate de que este campo esté correctamente asignado
cl2.setAterreno(new BigDecimal(tx4.getText())); // Campo para área de terreno
cl2.setAconstruida(new BigDecimal(tx5.getText())); // Campo para área construida

// Asumiendo que el campo de fecha está formateado adecuadamente
String dateString = tx6.getText(); // Cambiar a tx6 para el campo de fecha
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
try {
    java.util.Date utilDate = formatter.parse(dateString);
    cl2.setVigencia(new java.sql.Date(utilDate.getTime())); // Establecer vigencia como java.sql.Date
} catch (ParseException e) {
    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa dd/MM/yyyy");
    return;
}
// Obtener los demás campos
cl2.setZ_fis1(tx7.getText());
cl2.setZ_fis2(tx8.getText());
cl2.setZ_econ1(tx9.getText());
cl2.setZ_econ2(tx10.getText());
cl2.setHabitaciones1(Integer.parseInt(tx11.getText())); // Campo para habitaciones
cl2.setHabitaciones2(Integer.parseInt(tx12.getText())); // Segundo campo para habitaciones
cl2.setHabitaciones3(Integer.parseInt(tx13.getText())); // Tercer campo para habitaciones
cl2.setBanos1(Integer.parseInt(tx14.getText())); // Campo para baños
cl2.setBanos2(Integer.parseInt(tx15.getText())); // Segundo campo para baños
cl2.setBanos3(Integer.parseInt(tx16.getText())); // Tercer campo para baños
cl2.setLocales1(Integer.parseInt(tx17.getText())); // Campo para locales
cl2.setLocales2(Integer.parseInt(tx18.getText())); // Segundo campo para locales
cl2.setLocales3(Integer.parseInt(tx19.getText())); // Tercer campo para locales
cl2.setPisos1(Integer.parseInt(tx20.getText())); // Campo para pisos
cl2.setPisos2(Integer.parseInt(tx21.getText())); // Segundo campo para pisos
cl2.setPisos3(Integer.parseInt(tx22.getText())); // Tercer campo para pisos
cl2.setEstrato1(Integer.parseInt(tx23.getText())); // Campo para estrato
cl2.setEstrato2(Integer.parseInt(tx24.getText())); // Segundo campo para estrato
cl2.setEstrato3(Integer.parseInt(tx25.getText())); // Tercer campo para estrato
cl2.setDestino1(tx26.getText());
cl2.setDestino2(tx27.getText());
cl2.setDestino3(tx28.getText());
cl2.setPuntaje1(new BigDecimal(tx29.getText())); // Campo para puntaje
cl2.setPuntaje2(new BigDecimal(tx30.getText())); // Segundo campo para puntaje
cl2.setPuntaje3(new BigDecimal(tx31.getText())); // Tercer campo para puntaje

// Actualizar el registro en la base de datos
if (r12.ActualizarREG2(cl2)) {
    JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente.");
} else {
    JOptionPane.showMessageDialog(null, "Error al actualizar el registro.");
}
    }//GEN-LAST:event_actualizar2ActionPerformed

    private void tx10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx10ActionPerformed

    private void anadir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadir2ActionPerformed
// Verificar si al menos un campo está vacío
if ("".equals(tx1.getText()) || 
    "".equals(tx2.getText()) || 
    "".equals(tx3.getText()) || 
    "".equals(tx4.getText()) || 
    "".equals(tx5.getText()) || 
    "".equals(tx6.getText()) || 
    "".equals(tx7.getText()) || 
    "".equals(tx8.getText()) || 
    "".equals(tx9.getText()) || 
    "".equals(tx10.getText()) || 
    "".equals(tx11.getText()) || 
    "".equals(tx12.getText()) || 
    "".equals(tx13.getText()) || 
    "".equals(tx14.getText()) || 
    "".equals(tx15.getText()) || 
    "".equals(tx16.getText()) || 
    "".equals(tx17.getText()) || 
    "".equals(tx18.getText()) || 
    "".equals(tx19.getText()) || 
    "".equals(tx20.getText()) || 
    "".equals(tx21.getText()) || 
    "".equals(tx22.getText()) || 
    "".equals(tx23.getText()) || 
    "".equals(tx24.getText()) || 
    "".equals(tx25.getText()) || 
    "".equals(tx26.getText()) || 
    "".equals(tx27.getText()) || 
    "".equals(tx28.getText()) || 
    "".equals(tx29.getText()) ||
    "".equals(tx30.getText()) ||
    "".equals(tx31.getText())) {

    // Si algún campo está vacío, mostrar un mensaje
    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
} else {
    try {
        REG2 cl2 = new REG2(); // Asegúrate de instanciar REG2
        cl2.setNumid(Integer.parseInt(tx1.getText()));
        cl2.setCedula_catastral(tx2.getText());
        cl2.setMatricula_inmobiliaria(tx3.getText());
        cl2.setAterreno(new BigDecimal(tx4.getText()));
        cl2.setAconstruida(new BigDecimal(tx5.getText()));

        String dateString = tx6.getText(); // Asumiendo que el campo de fecha es tx6
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        java.util.Date utilDate = formatter.parse(dateString);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        cl2.setVigencia(sqlDate);

        cl2.setZ_fis1(tx7.getText());
        cl2.setZ_fis2(tx8.getText());
        cl2.setZ_econ1(tx9.getText());
        cl2.setZ_econ2(tx10.getText());
        cl2.setHabitaciones1(Integer.parseInt(tx11.getText()));
        cl2.setHabitaciones2(Integer.parseInt(tx12.getText()));
        cl2.setHabitaciones3(Integer.parseInt(tx13.getText()));
        cl2.setBanos1(Integer.parseInt(tx14.getText()));
        cl2.setBanos2(Integer.parseInt(tx15.getText()));
        cl2.setBanos3(Integer.parseInt(tx16.getText()));
        cl2.setLocales1(Integer.parseInt(tx17.getText()));
        cl2.setLocales2(Integer.parseInt(tx18.getText()));
        cl2.setLocales3(Integer.parseInt(tx19.getText()));
        cl2.setPisos1(Integer.parseInt(tx20.getText()));
        cl2.setPisos2(Integer.parseInt(tx21.getText()));
        cl2.setPisos3(Integer.parseInt(tx22.getText()));
        cl2.setEstrato1(Integer.parseInt(tx23.getText()));
        cl2.setEstrato2(Integer.parseInt(tx24.getText()));
        cl2.setEstrato3(Integer.parseInt(tx25.getText()));
        cl2.setDestino1(tx26.getText());
        cl2.setDestino2(tx27.getText());
        cl2.setDestino3(tx28.getText());
        cl2.setPuntaje1(new BigDecimal(tx29.getText()));
        cl2.setPuntaje2(new BigDecimal(tx30.getText()));
        cl2.setPuntaje3(new BigDecimal(tx31.getText()));

        // Ahora se registra el objeto REG2
        REG2DAO r12 = new REG2DAO(); // Asegúrate de tener una instancia de REG2DAO
        if (r12.RegistrarREG2(cl2)) {
            JOptionPane.showMessageDialog(null, "Registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Uno de los campos numéricos contiene un valor no válido.");
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Usa dd/MM/yyyy.");
    }
}

    }//GEN-LAST:event_anadir2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {
    int numid = Integer.parseInt(tccatastral2.getText()); 
    if (r12.EliminarREG2(numid)) { 
        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Error al eliminar el registro.");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para ID.");
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbuscar3ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bq1;
    private javax.swing.JButton Bq2;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Buscar2;
    public javax.swing.JButton REG1;
    public javax.swing.JButton REG2;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton actualizar2;
    private javax.swing.JButton anadir;
    private javax.swing.JButton anadir2;
    private javax.swing.JButton botonIrATabla;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton limpiar1;
    private javax.swing.JTable tableLista;
    private javax.swing.JTable tableLista2;
    private javax.swing.JTable tableLista3;
    private javax.swing.JTextField tbuscar2;
    private javax.swing.JTextField tbuscar3;
    private javax.swing.JTextField tccatastral;
    private javax.swing.JTextField tccatastral2;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx10;
    private javax.swing.JTextField tx11;
    private javax.swing.JTextField tx12;
    private javax.swing.JTextField tx13;
    private javax.swing.JTextField tx14;
    private javax.swing.JTextField tx15;
    private javax.swing.JTextField tx16;
    private javax.swing.JTextField tx17;
    private javax.swing.JTextField tx18;
    private javax.swing.JTextField tx19;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx20;
    private javax.swing.JTextField tx21;
    private javax.swing.JTextField tx22;
    private javax.swing.JTextField tx23;
    private javax.swing.JTextField tx24;
    private javax.swing.JTextField tx25;
    private javax.swing.JTextField tx26;
    private javax.swing.JTextField tx27;
    private javax.swing.JTextField tx28;
    private javax.swing.JTextField tx29;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx30;
    private javax.swing.JTextField tx31;
    private javax.swing.JTextField tx4;
    private javax.swing.JTextField tx5;
    private javax.swing.JTextField tx6;
    private javax.swing.JTextField tx7;
    private javax.swing.JTextField tx8;
    private javax.swing.JTextField tx9;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
