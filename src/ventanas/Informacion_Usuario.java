/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class Informacion_Usuario extends javax.swing.JFrame {

    String user = "", user_update = "";
    int ID;

    public Informacion_Usuario() {
        initComponents();
        user = Login.user;

        user_update = Administrar_Usuarios.user_update;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador- sesion de " + user);

        Label_informacion.setText("informacion de " + user_update);

        try {

            Connection cn1 = Conexion.conectar();
            PreparedStatement pst = cn1.prepareStatement(
                    "select * from usuarios where username = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                ID = rs.getInt("ID");
                txt_nombre4.setText(rs.getString("nombre_ususario"));
                txt_mail1.setText(rs.getString("email"));
                txt_username.setText(rs.getString("username"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_registrado.setText(rs.getString("registrado_por"));
                box_niveles1.setSelectedItem(rs.getString("tipo_nivel"));
                box_estatus.setSelectedItem(rs.getString("estatus"));

            }
            cn1.close();

        } catch (SQLException e) {
            System.err.println("error en cargar usuario " + e);
            JOptionPane.showMessageDialog(null, " error en la conexion contacte administrador");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Label_informacion = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_registrado = new javax.swing.JTextField();
        txt_nombre4 = new javax.swing.JTextField();
        txt_mail1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        box_estatus = new javax.swing.JComboBox<>();
        box_niveles1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        boton_actualizar = new javax.swing.JButton();
        boton_pasword = new javax.swing.JButton();
        jLabel_wp1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrado  por");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        Label_informacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_informacion.setForeground(new java.awt.Color(255, 255, 255));
        Label_informacion.setText("Informacion Usuario");
        getContentPane().add(Label_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 230, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 230, -1));

        txt_registrado.setBackground(new java.awt.Color(153, 153, 255));
        txt_registrado.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txt_registrado.setForeground(new java.awt.Color(255, 255, 255));
        txt_registrado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_registrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 230, -1));

        txt_nombre4.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txt_nombre4.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 230, -1));

        txt_mail1.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        txt_mail1.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mail:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        box_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(box_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 110, -1));

        box_niveles1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atencion", "Tecnico" }));
        getContentPane().add(box_niveles1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estatus");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        boton_actualizar.setText("Actualizar Usuario");
        boton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 140, 60));

        boton_pasword.setText("Restaurar Pasword");
        boton_pasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_paswordActionPerformed(evt);
            }
        });
        getContentPane().add(boton_pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 150, 60));

        jLabel_wp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        getContentPane().add(jLabel_wp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mail:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarActionPerformed
        int permisos_cmb, status_cmb, validacion = 0;
        String nombre, mail, telefono, pass, username, permisos_string = "", estatus_string = "";

        nombre = txt_nombre4.getText().trim();
        mail = txt_mail1.getText().trim();
        telefono = txt_telefono.getText().trim();
        username = txt_username.getText().trim();
        permisos_cmb = box_niveles1.getSelectedIndex() + 1;
        status_cmb = box_estatus.getSelectedIndex() + 1;

        if (mail.equals("")) {
            txt_mail1.setBackground(Color.red);
            validacion++;

        }
        if (nombre.equals("")) {
            txt_nombre4.setBackground(Color.red);
            validacion++;
        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);
            validacion++;
        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);
            validacion++;

        }
        if (validacion == 0) {
            if (permisos_cmb == 1) {
                permisos_string = "Administrador";
            } else if (permisos_cmb == 2) {
                permisos_string = "Atencion";
            } else if (permisos_cmb == 2) {
                permisos_string = "Tecnico";

            }
            if (status_cmb == 1) {
                estatus_string = "Activo";
            }
            if (status_cmb == 2) {
                estatus_string = "Inactivo";
            }

            try{
                Connection cn= Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "select username from usuarios where username = '" + username + "' and not ID = '"+ ID +"'" );
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    txt_username.setBackground(Color.red);
                     JOptionPane.showMessageDialog(null, " nombre de usuario no disponible");
                    cn.close();
                }
                else{
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn.prepareStatement(
                        "update usuarios set nombre_ususario = ?, email = ?, telefono= ?, username= ?, tipo_nivel = ?, estatus = ?"
                                + "where ID = '" + ID + "'");
                        pst2.setString(1, nombre);
                        pst2.setString(2, mail);
                        pst2.setString(3, telefono);
                        pst2.setString(4, username);
                        pst2.setString(5, permisos_string);
                        pst2.setString(6, estatus_string);        
                                pst2.executeUpdate();
                                cn2.close();
                       JOptionPane.showMessageDialog(null, " actualizacion correcta");
                        }    
            }catch(SQLException e){
                System.err.println("error en la conexion" + e );
            }
            
            } else {
                JOptionPane.showMessageDialog(null, " debes llenar todos los campos");
            
    }//GEN-LAST:event_boton_actualizarActionPerformed
    }
    private void boton_paswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_paswordActionPerformed
        Rstaurar_pasword rst = new Rstaurar_pasword();
        rst.setVisible(true);
    }//GEN-LAST:event_boton_paswordActionPerformed

    

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
            java.util.logging.Logger.getLogger(Informacion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_informacion;
    private javax.swing.JButton boton_actualizar;
    private javax.swing.JButton boton_pasword;
    private javax.swing.JComboBox<String> box_estatus;
    private javax.swing.JComboBox<String> box_niveles1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wp1;
    private javax.swing.JTextField txt_mail1;
    private javax.swing.JTextField txt_nombre4;
    private javax.swing.JTextField txt_registrado;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
