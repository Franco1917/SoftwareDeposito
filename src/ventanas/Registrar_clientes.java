
package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.sql.*;
public class Registrar_clientes extends javax.swing.JFrame {

    String user="";
    public Registrar_clientes() {
        initComponents();
        user= Login.user;
        setLocationRelativeTo(null);
        
        setResizable(false);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        wallp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mail @:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrar Clientes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, -1));

        txt_mail.setBackground(new java.awt.Color(51, 102, 255));
        txt_mail.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, -1));

        txt_telefono.setBackground(new java.awt.Color(51, 102, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, -1));

        txt_direccion.setBackground(new java.awt.Color(51, 102, 255));
        txt_direccion.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 180, -1));

        txt_nombre.setBackground(new java.awt.Color(51, 102, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 160, 90));

        wallp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        getContentPane().add(wallp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int validacion= 0;       

String nombre, mail, direccion, telefono;
nombre = txt_nombre.getText().trim();
mail= txt_mail.getText().trim();
telefono = txt_telefono.getText().trim();
direccion = txt_direccion.getText().trim();

if(nombre.equals("")){
    txt_nombre.setBackground(Color.red);
    validacion ++;
}
if(direccion.equals("")){
    txt_direccion.setBackground(Color.red);
    validacion ++;
}
if(telefono.equals("")){
    txt_telefono.setBackground(Color.red);
    validacion ++;
}
if(mail.equals("")){
    txt_mail.setBackground(Color.red);
    validacion ++;
}

if ( validacion == 0){
    try{
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
        "insert into clientes values (?,?,?,?,?,?)");
        pst.setInt(1, 0);
        pst.setString(2,nombre);
        pst.setString(3, mail);
        pst.setString(4, telefono);
        pst.setString(5,direccion);
        pst.setString (6, user);
        
        pst.executeUpdate();
        cn.close();
        limpiar();
        
        JOptionPane.showMessageDialog(null," Registro exitoso");
        this.dispose();
        
        
    }catch(SQLException e){
        System.err.println("Error en conexion a base" + e);
        JOptionPane.showMessageDialog(null," error en conexion contacte tecnico");
        
    }
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
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JLabel wallp;
    // End of variables declaration//GEN-END:variables


public void limpiar(){
    txt_nombre.setText("");
    txt_mail.setText("");
    txt_direccion.setText("");
    txt_telefono.setText("");
    
}

}
