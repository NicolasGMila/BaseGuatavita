package baseguatavita;

import baseguatavita.InterfazPrincipal;
import javax.swing.JOptionPane;

public class Sesion extends javax.swing.JFrame {
Login lg = new Login();
         LOGINDAO Login = new LOGINDAO();
    public Sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void validar(){
        String Correo = txtUsuario.getText();
        String Contraseña = String.valueOf(txtContraseña1.getText());
        String Privilegio = String.valueOf(TipoUsuario.getSelectedItem());
        if (!"".equals(Correo) || !"".equals(Contraseña) || !"".equals(Privilegio))
        {
         lg = Login.log(Correo, Contraseña, Privilegio);
         if (lg.getCorreo()!=null && lg.getContraseña()!= null && lg.getPrivilegio()!= null)
         {
             ocultar();
            dispose();
            
                        
         }else
         {JOptionPane.showMessageDialog(null, "Correo o Contraseña invalida o Rol no correspondiente");
         }
         
         
        }
    }
    

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BTNIngresar = new javax.swing.JButton();
        BTNSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña1 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        TipoUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/25861_12-212438_200x200.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        jLabel2.setText("Privilegio");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("De Guatavita");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alcaldía Municipal");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/4k-vector-mountain-scenery-kppfpltih5lnsaml.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 510));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel11.setText("Contraseña");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 350, 20));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 370, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/data_storage_database_icon_194717 (1).png"))); // NOI18N
        jLabel5.setText("Iniciar Sesión");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        BTNIngresar.setText("Ingresar");
        BTNIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(BTNIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 120, 40));

        BTNSalir.setText("Salir");
        BTNSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });
        jPanel3.add(BTNSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 120, 40));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 40));

        txtContraseña1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtContraseña1.setBorder(null);
        jPanel3.add(txtContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 340, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 350, 20));

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Usuario" }));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void ocultar ()
{
    if(TipoUsuario.getSelectedItem().equals("Admin"))
    {InterfazPrincipal m = new InterfazPrincipal();
    m.show();
    }else{
        if(TipoUsuario.getSelectedItem().equals("Usuario"))
    {InterfazPrincipal m = new InterfazPrincipal();
    m.REG1.setEnabled(false);
    m.REG2.setEnabled(false);
    m.show();
    }
    }
}
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void BTNIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIngresarActionPerformed

        if (txtUsuario.getText().isEmpty())
          JOptionPane.showMessageDialog(this,"Debes ingresar el usuario");
      else
    {
          if (txtContraseña1.getText().isEmpty())
              JOptionPane.showMessageDialog(this,"Debes ingresar la contraseña");
    else {
          validar();    
          }
    }
    }//GEN-LAST:event_BTNIngresarActionPerformed

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Seguro que deseas salir?");
        if (respuesta==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_BTNSalirActionPerformed

    private void TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoUsuarioActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNIngresar;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField txtContraseña1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
