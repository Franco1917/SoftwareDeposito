/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.WindowConstants;


public class Tecnico extends javax.swing.JFrame {
String user= "", nombre_usuario;
int sesion_usuario;
    public Tecnico() {
        initComponents();
        setTitle("Tecnico");
        setLocationRelativeTo(null);
        user=Login.user;
        sesion_usuario= Administrador.sesion_usuario;
        setTitle("sesion de " + nombre_usuario);
        if(sesion_usuario == 1){
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            
        }else{
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            
        }
    try{
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
        "select nombre_ususario from usuarios where username = '" + user +"'");
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
            nombre_usuario = rs.getString("nombre_ususario");
            label_usuario.setText("BIenvenido " + nombre_usuario);
            
            
        }
    }catch(SQLException e ){
        System.err.println(" error en conexion" + e);
    }
    
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_status = new javax.swing.JToggleButton();
        button_gestionar = new javax.swing.JToggleButton();
        label_usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wlp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_status.setText("Grafico de Status");
        button_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_statusActionPerformed(evt);
            }
        });
        getContentPane().add(button_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 250, 90));

        button_gestionar.setText("Gestion de equipo");
        button_gestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_gestionarActionPerformed(evt);
            }
        });
        getContentPane().add(button_gestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 250, 70));

        label_usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(255, 255, 255));
        label_usuario.setText("Tecnico");
        getContentPane().add(label_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/opciones.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 90, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 60));

        wlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        wlp.setText("jLabel1");
        getContentPane().add(wlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_gestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_gestionarActionPerformed
        Gestionar_Equipos ge = new Gestionar_Equipos();
        ge.setVisible(true);
        
        
    }//GEN-LAST:event_button_gestionarActionPerformed

    private void button_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_statusActionPerformed
Grafico_status ge= new Grafico_status();
ge.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_button_statusActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton button_gestionar;
    private javax.swing.JToggleButton button_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JLabel wlp;
    // End of variables declaration//GEN-END:variables
}
