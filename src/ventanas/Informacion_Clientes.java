
package ventanas;

import java.sql.*;
import clases.Conexion;
import com.itextpdf.text.BaseColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.Color;
import java.io.FileOutputStream;
import static ventanas.Gestionar_Clientes.ID_cliente_update;
import com.itextpdf.text.Image;
import java.io.IOException;



public class Informacion_Clientes extends javax.swing.JFrame {

   DefaultTableModel model = new DefaultTableModel();
   int ID_cliente, cliente_update= 0;
   public static int id_equipo= 0;
   String user = "";
   
  
    public Informacion_Clientes() {
        initComponents();
    user = Login.user;
    cliente_update= Gestionar_Clientes.ID_cliente_update;
    
     setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atencion al publico- sesion de " + user);
    
    try{
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
                "select * from clientes where ID_cliente ='" + cliente_update + "'");
                
              ResultSet rs = pst.executeQuery();
              if (rs.next()){
                  setTitle("informacion de cliente " + rs.getString("nomblre_cliente"));
                  
                  txt_nombre2.setText(rs.getString("nomblre_cliente"));
                   txt_mal.setText(rs.getString("mail_cliente"));
                    txt_dir.setText(rs.getString("dir_cliente"));
                     txt_tel.setText(rs.getString("tel_cliente"));
                     txt_registrado.setText(rs.getString("ultima_modificacion"));
                     
                     
              }
        cn.close();
    }catch(SQLException e){
        System.err.println("error en conexion" + e);
        
    }
    
    try{
        Connection cn = Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
        "select id_equipo, tipo_equipo, marca, estatus from equipos where ID_cliente = '"+ cliente_update +"'");
        ResultSet rs = pst.executeQuery();
        
        jTable_equipos=new  JTable(model);
        jScroll.setViewportView(jTable_equipos);
        model.addColumn("id_equipo");
        model.addColumn("tipo_equipo");
        model.addColumn("marca");
        model.addColumn("estatus");
        
        while (rs.next()){
            Object[] fila = new Object[4];
            for (int i = 0 ; i<4; i++){
                fila[i] = rs.getObject(i+1);
                
            }
            model.addRow(fila);
            
            
        }
        
        cn.close();
        
    }catch(SQLException e){
        System.err.println( "error " + e);
        
        
    }
     jTable_equipos.addMouseListener(new MouseAdapter(){ 
    @Override
    public void mouseClicked(MouseEvent e){
        int fila_point= jTable_equipos.rowAtPoint(e.getPoint());
        int columna_point= 0;
        if( fila_point> -1){
            id_equipo= (int) model.getValueAt(fila_point, columna_point);
                   JOptionPane.showMessageDialog( null, " elID del cliente es " + ID_cliente_update );
       // Informacion_Clientes ic = new Informacion_Clientes();
        
       // ic.setVisible(true);
       Informacion_equipo IF = new Informacion_equipo();;
       IF.setVisible(true);
       
       
       
        }
        
    }
    } );
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_registrado = new javax.swing.JLabel();
        txt_mail = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre1 = new javax.swing.JLabel();
        txt_mal = new javax.swing.JTextField();
        txt_reg = new javax.swing.JTextField();
        txt_dir = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_nombre2 = new javax.swing.JTextField();
        jScroll = new javax.swing.JScrollPane();
        jTable_equipos = new javax.swing.JTable();
        jButton_registrar = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        wpp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_registrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_registrado.setForeground(new java.awt.Color(255, 255, 255));
        txt_registrado.setText("registrado por");
        getContentPane().add(txt_registrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, -1));

        txt_mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setText("Mail cliente");
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        txt_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_direccion.setText("Direccion");
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setText("Telefono");
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informacion Cliente");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 140, -1));

        txt_nombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre1.setText("Nombre cliente");
        getContentPane().add(txt_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, -1));

        txt_mal.setBackground(new java.awt.Color(51, 102, 255));
        txt_mal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_mal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, -1));

        txt_reg.setBackground(new java.awt.Color(51, 102, 255));
        txt_reg.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 130, -1));

        txt_dir.setBackground(new java.awt.Color(51, 102, 255));
        txt_dir.setForeground(new java.awt.Color(255, 255, 255));
        txt_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dirActionPerformed(evt);
            }
        });
        getContentPane().add(txt_dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 130, -1));

        txt_tel.setBackground(new java.awt.Color(51, 102, 255));
        txt_tel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        txt_nombre2.setBackground(new java.awt.Color(51, 102, 255));
        txt_nombre2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txt_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));

        jTable_equipos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScroll.setViewportView(jTable_equipos);

        getContentPane().add(jScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 400, 200));

        jButton_registrar.setText("Registrar equipo");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 140, 60));

        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 120, 60));

        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 330, 40));

        wpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        getContentPane().add(wpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dirActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
       int validacion = 0;
       String nombre, mail, telefono, direccion;
       nombre = txt_nombre2.getText().trim();
       mail = txt_mal.getText().trim();
       telefono= txt_tel.getText().trim();
       direccion = txt_dir.getText().trim();
       if (txt_nombre2.equals("")){
           txt_nombre2.setBackground(Color.red);
           validacion++;
       }
       if (txt_mail.equals("")){
           txt_mail.setBackground(Color.red);
           validacion++;
       }
       if (txt_tel.equals("")){
           txt_telefono.setBackground(Color.red);
           validacion++;
       }
       if (txt_dir.equals("")){
           txt_direccion.setBackground(Color.red);
           validacion++;
       
       }
       if (validacion == 0){
           try{
               Connection cn = Conexion.conectar();
               PreparedStatement pst = cn.prepareStatement(
               "update clientes set nomblre_cliente=?, mail_cliente= ?, tel_cliente= ?,dir_cliente= ?, ultima_modificacion= ?"
                       + "where ID_cliente ='" + cliente_update + "'");
               pst.setString(1, nombre);
               pst.setString(2, mail);
               pst.setString(3,telefono);
               pst.setString(4, direccion);
               pst.setString(5, user);
               pst.executeUpdate();
               cn.close();
               limpiar();
               JOptionPane.showMessageDialog(null, "actializacion exitosa");;
               this.dispose();
               
               
               
               
               
               
           }catch(SQLException e){
               System.err.println("error en la conexion" + e);
           }
       }else{
           JOptionPane.showMessageDialog(null, "debe llenar todos los campos");
           
       }
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        Registrar_equipo re = new Registrar_equipo();
        re.setVisible(true);
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        // primero creamos objeto de la clase document paragenerar los documentos
        //para generer pdf hay que poner en estructura try - catch
        Document documento = new Document();
         try{
             //Vamos a indicar la ruta donde queremos que se guarde
             String ruta = System.getProperty("user.home");
             //como no sabemos quien va a estar usando la pc ponemos la ruta home..
             // Este codigo es para poner el header en el documento tomando el nombre de Txt_nombre
             //despues llamamos a la clase, creamos un objeto, instanciiamos la imagen con su ruta
             PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Facturas/" + txt_nombre2.getText().trim()+ ".pdf"));
          com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/DI.png");
          // para que encaje justo..y le asignamos tamaño
          header.scaleToFit(400, 600);
          // aca centramos el header, la propiedad chun es de Itext 
          header.setAlignment(Chunk.ALIGN_CENTER);
          // creamos objeto de la calse paragraf para dar formato al texto y explicar que texto queremos
          Paragraph parrafo = new Paragraph();
          parrafo.setAlignment(Paragraph.ALIGN_CENTER);
          parrafo.add("Informacion cliente \n \n ");
          //  ahora le damos formato al text0
          parrafo.setFont(FontFactory.getFont("Tahoma", 14 ,Font.BOLD, BaseColor.DARK_GRAY));
          
                                            //( tipo de letra, tamaño, estilo, color)
                                            
         // despues de agregar las cosas con la clase paragraph, abrimos y agragamos
         //cosas al documento, header y lo demas..
         
          documento.open();
          documento.add(header);
          documento.add(parrafo);
          // ahora creamos objetos para usar elementos de la base de datos.
          //es importante indicar la cantidad de columnas que queremos en la tabla
          
          
          PdfPTable tablaCliente = new PdfPTable(5);
          // llamamos a la tabla y decimos lo que vamos a agregar
          
          tablaCliente.addCell("ID");
           tablaCliente.addCell("nombre");
            tablaCliente.addCell("Mail");
             tablaCliente.addCell("telefono");
              tablaCliente.addCell("direccion");
              
              // ahora consultamos a la base de datos..
              try{
                  Connection cn = Conexion.conectar();
                  PreparedStatement pst = cn.prepareStatement(
                  "select * from clientes where ID_cliente ='" + cliente_update + "'");
                  //cuando necesitamos traer datos de la base ( select) usamos result set rs
                  // cuando queremos agregar a la tabla usamos update ()
                  ResultSet rs = pst.executeQuery();
                  if (rs.next()){
                      // como vamos a trabajar en una base de datos y no sabemeos cuantos valores
                      // vamos a usar una estructura do while
                      do{
                          tablaCliente.addCell(rs.getString(1));
                          tablaCliente.addCell(rs.getString(2));
                          tablaCliente.addCell(rs.getString(3));
                          tablaCliente.addCell(rs.getString(4));
                          tablaCliente.addCell(rs.getString(5));
                      }while(rs.next());
                      // volvemos a llamar al metodo documento y llamamos a la tabla
                      //cuando indicamos que . add al documento , estamos diciendo
                      // que agregue toda la tabla a nuestro documento
                      documento.add(tablaCliente);
                      
                  }
                  
                  // creamos un objeto Paragraph para agregar algo
                  Paragraph parrafo2 = new Paragraph();
                  // ahora vamos a centrarlo
                  parrafo2.setAlignment(Paragraph.ALIGN_CENTER);
                  parrafo2.add("\n \n equipos registrados \n\n");
                  //volvemos a darle formato
                 parrafo2.setFont(FontFactory.getFont("Tahoma", 14 ,Font.BOLD, BaseColor.DARK_GRAY)); 
                 documento.add(parrafo2);
                 PdfPTable tablaEquipos = new PdfPTable(4);
                 //volvemos a agregar el titulo a la tabla
                 tablaEquipos.addCell( "id equipo");
                 tablaEquipos.addCell( "tipo equipo");
                  tablaEquipos.addCell( "marca");
                  tablaEquipos.addCell( "status");
                  try{
                      Connection cn2 = Conexion.conectar();
                      PreparedStatement pst2 = cn2.prepareStatement(
                      "select ID_equipo, tipo_equipo, marca, estatus from equipos  where Id_cliente = '" + cliente_update + "'");
                       ResultSet rs2 = pst2.executeQuery();
                       if ( rs2.next()){
                           do{
                               tablaEquipos.addCell(rs2.getString(1));
                                tablaEquipos.addCell(rs2.getString(2));
                                 tablaEquipos.addCell(rs2.getString(3));
                                  tablaEquipos.addCell(rs2.getString(4));
                           }while(rs2.next());
                       }
                       documento.add(tablaEquipos);
                  }catch(SQLException e){
                      System.err.println("error al cargar equipos" + e);
                  }
                  
              }catch(SQLException e){
                  System.err.println("error conexion usuarios " + e);
              }
          
          documento.close();
          JOptionPane.showMessageDialog(null, " documento creado con exito");
         
         
         }
         
         catch(DocumentException | IOException e){
             System.err.println( " error al imprimir el documento + " + e);
             
             
         }
    }//GEN-LAST:event_ImprimirActionPerformed

    
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
            java.util.logging.Logger.getLogger(Informacion_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JTable jTable_equipos;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JLabel txt_mail;
    private javax.swing.JTextField txt_mal;
    private javax.swing.JLabel txt_nombre1;
    private javax.swing.JTextField txt_nombre2;
    private javax.swing.JTextField txt_reg;
    private javax.swing.JLabel txt_registrado;
    private javax.swing.JTextField txt_tel;
    private javax.swing.JLabel txt_telefono;
    private javax.swing.JLabel wpp;
    // End of variables declaration//GEN-END:variables

public void limpiar(){
    txt_nombre2.setText("");
    txt_mail.setText("");
    txt_direccion.setText("");
    txt_telefono.setText("");
    
}
}
