/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Rstaurar_pasword extends javax.swing.JFrame {

    String user = "", user_update= "";
    
    public Rstaurar_pasword() {
        initComponents();
        user=Login.user;
        user_update = Administrar_Usuarios.user_update;
        setSize(501, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("cambio de pasword de " + user_update);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_pasword = new javax.swing.JTextField();
        txt_confirmar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label_wp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Confirmar pasword");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Restaurar Pasword");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nuevo Pasword");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, -1));

        txt_pasword.setBackground(new java.awt.Color(102, 153, 255));
        txt_pasword.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_pasword.setForeground(new java.awt.Color(255, 255, 255));
        txt_pasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, -1));

        txt_confirmar.setBackground(new java.awt.Color(102, 153, 255));
        txt_confirmar.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txt_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        txt_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        jButton1.setText("Restaurar Pasword");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 200, 70));

        label_wp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        label_wp.setMaximumSize(new java.awt.Dimension(500, 450));
        label_wp.setPreferredSize(new java.awt.Dimension(500, 450));
        getContentPane().add(label_wp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 586, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_paswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paswordActionPerformed

    }//GEN-LAST:event_txt_paswordActionPerformed

    private void txt_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_confirmarActionPerformed

    }//GEN-LAST:event_txt_confirmarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String pasword="", confirmacion= "";
       
       pasword = txt_pasword.getText().trim();
       confirmacion = txt_confirmar.getText().trim();
       if ( !pasword.equals("") && !confirmacion.equals("")){
           if (pasword.equals(confirmacion)){
               
               try{
                   Connection cn = Conexion.conectar();
                   PreparedStatement pst = cn.prepareStatement(
                   "update usuarios set password = ? where username ='"+ user_update + "'");
                   pst.setString(1, pasword);
                   pst.executeUpdate();
                   JOptionPane.showMessageDialog(null, " Cambio realizado");
                   this.dispose();
                   
                   
               }catch(SQLException e){
                   JOptionPane.showMessageDialog(null, " error " + e);
               }
               
           }else{
               txt_confirmar.setBackground(Color.red);
               JOptionPane.showMessageDialog(null, " Las contraseñas no coinciden");
           }
           
           
       }else{
           txt_pasword.setBackground(Color.red);
            txt_confirmar.setBackground(Color.red);
           JOptionPane.showMessageDialog(null, " Debe completar todos los campos");
       }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Rstaurar_pasword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rstaurar_pasword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rstaurar_pasword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rstaurar_pasword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rstaurar_pasword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_wp;
    private javax.swing.JTextField txt_confirmar;
    private javax.swing.JTextField txt_pasword;
    // End of variables declaration//GEN-END:variables
}
