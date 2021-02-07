
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import com.itextpdf.text.*;





public class Capturista extends javax.swing.JFrame {
String user = "", nombre_usuario;
        int sesion_usuario;
    public Capturista() {
        initComponents();
        user=Login.user;
        sesion_usuario= Administrador.sesion_usuario;
        setTitle("Capturista");
        setLocationRelativeTo(null);
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

        label_usuario = new javax.swing.JLabel();
        jButton_gestionarClientes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton_registrarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(label_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 20));

        jButton_gestionarClientes.setText("Gestionar Clientes");
        jButton_gestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gestionarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_gestionarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 400, 70));

        jButton2.setText("Imprimir");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 400, 70));

        jButton_registrarCliente.setText("Registrar Cliente");
        jButton_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 400, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Atencion al Publico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarClienteActionPerformed
        Registrar_clientes rc = new Registrar_clientes();
        rc.setVisible(true);
        
    }//GEN-LAST:event_jButton_registrarClienteActionPerformed

    private void jButton_gestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gestionarClientesActionPerformed
        // TODO add your handling code here:
        Gestionar_Clientes gc = new Gestionar_Clientes();
        gc.setVisible(true);
        
    }//GEN-LAST:event_jButton_gestionarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capturista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_gestionarClientes;
    private javax.swing.JButton jButton_registrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel label_usuario;
    // End of variables declaration//GEN-END:variables
}
