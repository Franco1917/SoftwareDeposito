/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;


/**
 *
 * @author Franco
 */
public class Administrador extends javax.swing.JFrame {
String user, nombre_usuario;
public static int sesion_usuario;

    
    public Administrador() {
        initComponents();
        user = Login.user;
        sesion_usuario = 1; // esta es una variable bandera.
        setTitle("Administrador- sesion de "  + user);// de quien es la sesion
        setLocationRelativeTo(null);
        setSize(550,450);
        setResizable(false); // esto es para que no se modifique el tamaño.
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // esto es para cerrar lo que se ejecuta en segundo plano
        //y cerrar el programa cuando al interface se cierra.
    try{
        Connection cn = Conexion.conectar();// objeto para la conexion
        PreparedStatement pst = cn.prepareStatement(
        "select nombre_ususario from usuarios where username  = '"+ user +"'");// objeto para dar ordens sql
        ResultSet rs = pst.executeQuery(); // para que se ejecute
        if(rs.next()){
            nombre_usuario = rs.getString("nombre_ususario");
            jLabel_nombreUsuario.setText(nombre_usuario);
            
            
        }else{
            System.err.println(" aca hay un error");
            
           
        }
    }catch(SQLException e){
        
    }
    }
    
     public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombreUsuario = new javax.swing.JLabel();
        jButton_registrarUsuario = new javax.swing.JButton();
        jButton_administracion = new javax.swing.JButton();
        jButton_tecnico = new javax.swing.JButton();
        jButton_registrarUsuario5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_wlp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombreUsuario.setBackground(new java.awt.Color(153, 153, 255));
        jLabel_nombreUsuario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel_nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        jButton_registrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        jButton_registrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 290, -1));

        jButton_administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        jButton_administracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_administracionActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_administracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, -1));

        jButton_tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apoyo-tecnico.png"))); // NOI18N
        jButton_tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 290, -1));

        jButton_registrarUsuario5.setBackground(new java.awt.Color(255, 255, 255));
        jButton_registrarUsuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/us2.png"))); // NOI18N
        jButton_registrarUsuario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarUsuario5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccionar Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Atencion al Publico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel Tecnico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrar Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Creado por Franco");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 150, -1));

        jLabel_wlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        getContentPane().add(jLabel_wlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarUsuario5ActionPerformed
        // TODO add your handling code here:
        Registrar_Usuario ru = new Registrar_Usuario();
        ru.setVisible(true);
    }//GEN-LAST:event_jButton_registrarUsuario5ActionPerformed

    private void jButton_registrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarUsuarioActionPerformed
        Administrar_Usuarios usuarios = new Administrar_Usuarios();
        usuarios.setVisible(true);
        
    }//GEN-LAST:event_jButton_registrarUsuarioActionPerformed

    private void jButton_administracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_administracionActionPerformed
        new Capturista().setVisible(true);
    }//GEN-LAST:event_jButton_administracionActionPerformed

    private void jButton_tecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tecnicoActionPerformed
       Tecnico t = new Tecnico();
       t.setVisible(true);
       
    }//GEN-LAST:event_jButton_tecnicoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_administracion;
    private javax.swing.JButton jButton_registrarUsuario;
    private javax.swing.JButton jButton_registrarUsuario5;
    private javax.swing.JButton jButton_tecnico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_nombreUsuario;
    private javax.swing.JLabel jLabel_wlp;
    // End of variables declaration//GEN-END:variables
}
