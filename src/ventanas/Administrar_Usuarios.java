/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Franci
 */
public class Administrar_Usuarios extends javax.swing.JFrame {

    String user;
    public static String user_update = "";// usamos para comunicar
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form Administrar_Usuarios
     */
    public Administrar_Usuarios() {
        initComponents();
        user = Login.user;
        setSize(501, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador- sesion de " + user);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select ID, nombre_ususario, username, tipo_nivel, estatus from usuarios");
            ResultSet rs = pst.executeQuery();
            jTable_usuarios = new JTable(model);
            jScrollPane1.setViewportView(jTable_usuarios);// para que la tabla pueda escrolearse.

            model.addColumn(" ");
            model.addColumn("Nombre");
            model.addColumn("Username");
            model.addColumn("Permisos");
            model.addColumn("Estatus");
            while (rs.next()) {
                Object[] fila = new Object[5];//creo un vector fila y un for quelo recorra
                                                  // llenandolo desde i+1(1) hasta 5 
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);

            }

            cn.close();

        } catch (SQLException e) {
            System.err.println( "error en la conexion " + e);
            JOptionPane.showMessageDialog(null, " error en la conexion contacte administrador");

        }
        
        jTable_usuarios.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = jTable_usuarios.rowAtPoint(e.getPoint());
                int columna_point= 2;
                if(fila_point> -1){
                    user_update = (String) model.getValueAt(fila_point, columna_point);
                    Informacion_Usuario usuario = new Informacion_Usuario();
                    usuario.setVisible(true);
                    
                    
                }
                
                
            }
        
    });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_usuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel_wp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creado por Franco");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        jTable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_usuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel_wp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        getContentPane().add(jLabel_wp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Administrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrar_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_wp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_usuarios;
    // End of variables declaration//GEN-END:variables
}
