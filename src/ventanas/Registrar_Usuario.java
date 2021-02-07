
package ventanas;
import clases.Conexion;
import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;



public class Registrar_Usuario extends javax.swing.JFrame {

   String user;
   
    public Registrar_Usuario() {
        initComponents();
        user = Login.user;
        setTitle("registrar nuevo espacio - Sesion de " + user);
        setSize(501, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //con esto evitamos que el programa se cierre entero al cierre de esta ventana
        
    }

     @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_permisos = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_pasword = new javax.swing.JPasswordField();
        box_seleccion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel_wp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(500, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creado por Franco");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 20));

        jLabel2.setBackground(new java.awt.Color(153, 153, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("e-mail:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 20));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 20));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 150, 20));

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("pasword");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 150, 20));

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Permisos de :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 20));

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro Usuarios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, 20));

        txt_mail.setBackground(new java.awt.Color(102, 153, 255));
        txt_mail.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, -1));

        txt_telefono.setBackground(new java.awt.Color(102, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 180, 20));

        txt_permisos.setBackground(new java.awt.Color(102, 153, 255));
        txt_permisos.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_permisos.setForeground(new java.awt.Color(255, 255, 255));
        txt_permisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_permisosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_permisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, -1));

        txt_username.setBackground(new java.awt.Color(102, 153, 255));
        txt_username.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 180, -1));

        txt_nombre.setBackground(new java.awt.Color(102, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, -1));

        txt_pasword.setBackground(new java.awt.Color(102, 153, 255));
        txt_pasword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 180, 20));

        box_seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atencion", "Tecnico", " " }));
        getContentPane().add(box_seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 180, 70));

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registro Usuarios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, 20));

        jLabel_wp.setBackground(new java.awt.Color(102, 153, 255));
        jLabel_wp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_wp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        jLabel_wp.setText("jLabel1");
        getContentPane().add(jLabel_wp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_permisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_permisosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_permisosActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int permiso_cmb;
       int validacion = 0;// variable que usaremos de bandera
       String nombre, mail, telefono, pass, username, permisos_string = null;
       nombre = txt_nombre.getText().trim();
       mail = txt_mail.getText().trim();
       telefono = txt_telefono.getText().trim();
       pass = txt_pasword.getText().trim();
       username = txt_username.getText().trim();
       permiso_cmb = box_seleccion.getSelectedIndex() + 1 ;
       //validacion de los campos
       if(mail.equals("")) {
           txt_mail.setBackground(Color.red);
           validacion++ ;
           }
       if(username.equals("")) {
           txt_username.setBackground(Color.red);
           validacion++ ;
           }
       if(pass.equals("")) {
           txt_pasword.setBackground(Color.red);
           validacion++ ;
           }
       if(nombre.equals("")) {
           txt_nombre.setBackground(Color.red);
           validacion++ ;
           }
       if(telefono.equals("")) {
           txt_telefono.setBackground(Color.red);
           validacion++ ;
           }
       
       if (permiso_cmb == 1){
           permisos_string = "Administrador";
       }else if (permiso_cmb == 2 ){
           permisos_string = "Atencion";
       }else if (permiso_cmb == 3){
           permisos_string = "Tecnico";
           
       }
          
       try{
           // codigo para evitar usuarios repetidos
           Connection cn = Conexion.conectar();
           PreparedStatement pst = cn.prepareStatement(
           "select username from usuarios where username = '" + username  +"'");
           ResultSet rs = pst.executeQuery();
           if(rs.next()){
               txt_username.setBackground(Color.red);
               JOptionPane.showMessageDialog(null, " NOmbre de usuario existente");
               cn.close(); // cerramos la conexion.
               
               
           } else{
               cn.close();
               if (validacion == 0){
                   try{
                       Connection cn1 = Conexion.conectar();
                       PreparedStatement pst1 = cn1.prepareStatement(
                       "insert into usuarios values (?,?,?,?,?,?,?,?,?)");
                       pst1.setInt(1,0);// mandamos al ID columna 1 y asi con cada columna.
                       pst1.setString(2, nombre);
                        pst1.setString(3, mail);
                         pst1.setString(4, telefono);
                          pst1.setString(5, username);
                           pst1.setString(6, pass);
                            pst1.setString(7, permisos_string);
                             pst1.setString(8, "Activo");
                              pst1.setString(9, user);
                              pst1.executeUpdate();
                              cn1.close();
                              
                               JOptionPane.showMessageDialog(null, "registro exitoso");
                              Limpiar();
                       
                   }catch(SQLException e){
                       System.err.println(" error en la conexion" + e) ;
                       JOptionPane.showMessageDialog(null, " Error de conexion, contancte administrador");
                   }
                   
               }else {
                    JOptionPane.showMessageDialog(null, " Error de conexion, contancte administrador");
               }
           }
           
           
       }catch(SQLException e ){
           System.err.println("Error en validar nombre de usuario" + e);
            JOptionPane.showMessageDialog(null, " Debes llenar todos los campos");
           
       }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_seleccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_wp;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_pasword;
    private javax.swing.JTextField txt_permisos;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

public void Limpiar(){
    txt_nombre.setText("");
     txt_nombre.setBackground(Color.blue);
    txt_username.setText("");
     txt_username.setBackground(Color.blue);
    txt_pasword.setText("");
     txt_pasword.setBackground(Color.blue);
    txt_telefono.setText("");
     txt_telefono.setBackground(Color.blue);
    txt_mail.setText("");
    txt_mail.setBackground(Color.blue);
    txt_permisos.setText("");
    txt_permisos.setBackground(Color.blue);
    box_seleccion.setSelectedIndex(0);
    
    
    
}
}
