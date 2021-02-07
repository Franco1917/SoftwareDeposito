
package ventanas;

import javax.swing.WindowConstants;
import java.util.Calendar;
import clases.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;


public class Informacion_equipo_tecnico extends javax.swing.JFrame {

   int id_equipo= 0;
   String user= "";
   
   
   
    public Informacion_equipo_tecnico() {
        initComponents();
     user= Login.user;
     id_equipo = Gestionar_Equipos.ID_equipo_update ;
    
    
    
    try{
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
        " select * from equipos where id_equipo = '" + id_equipo + "'");
        ResultSet rs = pst.executeQuery();
        if (rs.next()){// hacemos el vaciado de info
             combo_equipo1.setSelectedItem(rs.getString("tipo_equipo"));
             combo_marca.setSelectedItem(rs.getString("marca"));
             combo_status.setSelectedItem(rs.getString("estatus"));
             txt_modelo.setText(rs.getString("modelo"));
             txt_num1.setText(rs.getString("num_serie"));
             txt_um.setText(rs.getString("ultima_modificacion"));
            // hay que recuperar los valores de la fecha por separado y unirlos
            String dia= "", mes= "", anio= "";
            dia= rs.getString("dia_ingreso");
            mes= rs.getString("mes_ingreso");
            anio= rs.getString("año_ingreso");
            txt_fecha.setText(dia+ "/"+ mes+"/"+ anio );
            txt_obvservaciones.setText(rs.getString("observaciones"));
            txt_comentarios.setText(rs.getString("comentarios_tecnicos"));
            
            label_comentarios.setText("comentarios de tecnico : " + rs.getString("revicion_tecnica_de"));
            
            
            
            
             
            
        }
    }catch(SQLException e ){
        System.err.println("error "+ e);
        
    }
    setTitle("Equipo cliente " );
    setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(650, 500);
    
    
    
    
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_comentarios = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        txt_um = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_nombrecliente = new javax.swing.JTextField();
        txt_num1 = new javax.swing.JTextField();
        combo_equipo1 = new javax.swing.JComboBox<>();
        combo_marca = new javax.swing.JComboBox<>();
        combo_status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_obvservaciones = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_comentarios = new javax.swing.JTextPane();
        actualizar = new javax.swing.JToggleButton();
        wlp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de equipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de serie");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Ingreso");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ultima modificacion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Daño reportado y obsvervaciones");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        label_comentarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_comentarios.setForeground(new java.awt.Color(255, 255, 255));
        label_comentarios.setText("Comentarios y actualizacion tecnico de :");
        getContentPane().add(label_comentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Informacion equipos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        txt_modelo.setBackground(new java.awt.Color(102, 153, 255));
        txt_modelo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, -1));

        txt_um.setBackground(new java.awt.Color(102, 153, 255));
        txt_um.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_um, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 160, -1));

        txt_fecha.setBackground(new java.awt.Color(102, 153, 255));
        txt_fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 160, -1));

        txt_nombrecliente.setBackground(new java.awt.Color(102, 153, 255));
        txt_nombrecliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombrecliente.setEnabled(false);
        txt_nombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreclienteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 160, -1));

        txt_num1.setBackground(new java.awt.Color(102, 153, 255));
        txt_num1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 160, -1));

        combo_equipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Descktop", "Impresora", "Multifuncional", " " }));
        getContentPane().add(combo_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 130, -1));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "easer", "apple", "assus", "dell", "hp", " " }));
        getContentPane().add(combo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nuevo ingreso", "no reparado", "en revision", "reparado", "entregado", " " }));
        getContentPane().add(combo_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 130, -1));

        txt_obvservaciones.setEditable(false);
        jScrollPane1.setViewportView(txt_obvservaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 310, 130));

        jScrollPane2.setViewportView(txt_comentarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 310, 90));

        actualizar.setText("Comentar y actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 200, 50));

        wlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        wlp.setText("jLabel1");
        wlp.setPreferredSize(new java.awt.Dimension(650, 500));
        getContentPane().add(wlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreclienteActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
   
     String status, comentarios, tecnico;
     status= combo_status.getSelectedItem().toString();
     comentarios=txt_comentarios.getText();
     tecnico= user;
     try{
         Connection cn= Conexion.conectar();
         PreparedStatement pst = cn.prepareStatement(
         "update equipos set status=?, comentarios_tecnicos=?, revision_tecnica_de=? where id_equipo= '"+id_equipo+"'");
         pst.setString(1, status);
         pst.setString(2,comentarios);
         pst.setString(3, tecnico);
         
         pst.executeUpdate();
         
         cn.close();
         JOptionPane.showMessageDialog(null, "actualizacion exitosa");
         this.dispose();
         
     }catch(SQLException e ){
         System.err.print("error en equipos" + e);
     }
     
    
        
    }//GEN-LAST:event_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion_equipo_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_equipo_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_equipo_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_equipo_tecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_equipo_tecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton actualizar;
    private javax.swing.JComboBox<String> combo_equipo1;
    private javax.swing.JComboBox<String> combo_marca;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_comentarios;
    private javax.swing.JTextPane txt_comentarios;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombrecliente;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextPane txt_obvservaciones;
    private javax.swing.JTextField txt_um;
    private javax.swing.JLabel wlp;
    // End of variables declaration//GEN-END:variables

public void Limpiar(){
    txt_fecha.setText("");
    txt_num1.setText("");
    txt_modelo.setText("");
    txt_obvservaciones.setText("");
    
}


}
