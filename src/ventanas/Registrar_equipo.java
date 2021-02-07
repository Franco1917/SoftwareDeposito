
package ventanas;
import java.util.Calendar;
import clases.Conexion;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Registrar_equipo extends javax.swing.JFrame {

    int id_cliente_up = 0;
    String user= "", nombre_cliente="";
    
    
    public Registrar_equipo() {
        initComponents();
     user= Login.user;
     id_cliente_up = Gestionar_Clientes.ID_cliente_update;
     setSize(700, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
     
     
     
     try{
         
         Connection cn = Conexion.conectar();
         PreparedStatement pst = cn.prepareStatement(
         "select nomblre_cliente from clientes where ID_cliente = '" + id_cliente_up+"'");
         ResultSet rs = pst.executeQuery();
         if(rs.next()){
              nombre_cliente= rs.getString("nomblre_cliente");
             txt_cliente.setText(nombre_cliente);
         
             
         }else{
             
         }
     }catch(SQLException e){
         System.err.println("error" + e);
     }
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        txt_cliente = new javax.swing.JTextField();
        txt_num_serie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        combo_marca = new javax.swing.JComboBox<>();
        combo_equipo1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_obvservaciones = new javax.swing.JTextPane();
        registrar = new javax.swing.JButton();
        wlp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo equipo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero de serie");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Daño reportado y observaciones");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cliente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txt_modelo.setBackground(new java.awt.Color(51, 102, 255));
        txt_modelo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, -1));

        txt_cliente.setBackground(new java.awt.Color(51, 102, 255));
        txt_cliente.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, -1));

        txt_num_serie.setBackground(new java.awt.Color(51, 102, 255));
        txt_num_serie.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_num_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registro de equipos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        combo_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "easer", "apple", "assus", "dell", "hp", " " }));
        getContentPane().add(combo_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, -1));

        combo_equipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Descktop", "Impresora", "Multifuncional", " " }));
        getContentPane().add(combo_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));

        jScrollPane1.setViewportView(jTextPane_obvservaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 340, 230));

        registrar.setText("Registrar Equipo");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 330, 70));

        wlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        getContentPane().add(wlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        int validacion= 0;
        String tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, annio_ingreso, status, obvservaciones;
        tipo_equipo = combo_equipo1.getSelectedItem().toString();
        marca = combo_marca.getSelectedItem().toString();
        num_serie =  txt_num_serie.getText().trim();
        modelo= txt_modelo.getText().trim();
        obvservaciones = jTextPane_obvservaciones.getText();
        status= "nuevo ingreso";
        // para poder usar calendar primero crear objeto.
        Calendar calendar = Calendar.getInstance();
        dia_ingreso = Integer.toString(calendar.get(Calendar.DATE));
        mes_ingreso = Integer.toString(calendar.get(Calendar.MONTH));
        annio_ingreso = Integer.toString(calendar.get(Calendar.YEAR));
        
        if(modelo.equals("")){
            txt_modelo.setBackground(Color.red);
            validacion ++;
            
            
        }
        if(num_serie.equals("")){
            txt_num_serie.setBackground(Color.red);
            validacion ++;
            
       } 
        if(obvservaciones.equals("")){
            jTextPane_obvservaciones.setText(" sin obvservaciones ");
            validacion ++;
            
       } 
        
        if (validacion==0){
            try{
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                "insert into equipos values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setInt(1, 0);
                pst.setInt(2, id_cliente_up);
                pst.setString(3, tipo_equipo);
                pst.setString(4, marca );
                pst.setString(5, modelo );
                pst.setString(6, num_serie );
                pst.setString(7, dia_ingreso );
                pst.setString(8, mes_ingreso );
                pst.setString(9, annio_ingreso );
                pst.setString(10, obvservaciones );
                pst.setString(11, user );
                pst.setString(12, "" );
                pst.setString(13, "" );
                pst.setString(14, status );
                
                pst.executeUpdate();
                cn.close();
                JOptionPane.showMessageDialog(null, " registro exitoso");
                
                this.dispose();
                
                
                
                
                
                
            }catch(SQLException e ){
                System.err.println("error al registrar equipo" + e);
                
            }
        
        
        
        
        
        }else{
            
            JOptionPane.showMessageDialog(null, " complete todos los campos");
            
        }
        
        
    }//GEN-LAST:event_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_equipo1;
    private javax.swing.JComboBox<String> combo_marca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane_obvservaciones;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_num_serie;
    private javax.swing.JLabel wlp;
    // End of variables declaration//GEN-END:variables
}
