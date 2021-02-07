
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.WindowConstants;

public class Grafico_status extends javax.swing.JFrame {

    String user= "";
    int NuevoIngreso, NoReparado, Reparado,  Entregado;
    String[] vector_status_nombre= new String [5];
  int[] vector_status_cantidad= new int[5];
    public Grafico_status() {
        initComponents();
        user=Login.user;
        setTitle("Grafico Status");
        setLocationRelativeTo(null);
        setResizable(false);
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
    
    try{
        Connection cn= Conexion.conectar();
        PreparedStatement pst = cn.prepareStatement(
                "select estatus, count(estatus) as Cantidad from equipos group by estatus "
                );
        ResultSet rs=pst.executeQuery();
        if(rs.next()){
            int posicion=0;
            do{
                 vector_status_nombre[posicion]=rs.getString(1);
                 vector_status_cantidad[posicion]=rs.getInt(2);
                 
                if(vector_status_nombre[posicion].equalsIgnoreCase("entregado")){
                    Entregado= vector_status_cantidad[posicion];
                }
               else if(vector_status_nombre[posicion].equalsIgnoreCase("no reparado")){
                    NoReparado= vector_status_cantidad[posicion];
                }
               else if(vector_status_nombre[posicion].equalsIgnoreCase("nuevo ingreso")){
                    NuevoIngreso= vector_status_cantidad[posicion];
                }
               else if(vector_status_nombre[posicion].equalsIgnoreCase("reparado")){
                    Reparado= vector_status_cantidad[posicion];
                }
                
                posicion++; 
            }while(rs.next());
        }
        
    }catch(SQLException e){
        System.err.print("error en conexion grafico" + e );
    }
         
    
    repaint(); // podemos invocar al metodo paint para dibujar sobre el frame
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Grafico Status");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wp-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

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
            java.util.logging.Logger.getLogger(Grafico_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico_status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

//NuevoIngreso, NoReparado, Reparado,  Entregado;
public int statusRepetido(int NuevoIngreso, int NoReparado, int Reparado, int Entregado){
if(NuevoIngreso > NoReparado && NuevoIngreso> Entregado && NuevoIngreso > Reparado){
    return NuevoIngreso;
}else if(NoReparado> NuevoIngreso && NoReparado> Entregado && NoReparado > Reparado){
    return NoReparado;}
    else if(Reparado > Entregado ){
            return Reparado;
            
            }
return Entregado;

}



@Override
public void paint(Graphics g){
    super.paint(g);
    int Estatus_mas_repetido = statusRepetido(NuevoIngreso, NoReparado, Reparado,  Entregado);
     
    int largo_nuevo_ingreso = NuevoIngreso * 400/ Estatus_mas_repetido;
    int largo_no_reparado= NoReparado*400/Estatus_mas_repetido;
    int largo_reparado= Reparado*400/Estatus_mas_repetido;
    int largo_entregado= Entregado*400/Estatus_mas_repetido;

g.setColor(Color.yellow);
g.fillRect(100,100,largo_nuevo_ingreso,40);
g.drawString("Nuevo Ingreso", 10, 118);
g.drawString("cantidad "+ NuevoIngreso, 10, 133);

g.setColor(Color.blue);
g.fillRect(100,150,largo_no_reparado,40);
g.drawString("No Reparado", 10, 168);
g.drawString("cantidad "+ NoReparado, 10, 183);


g.setColor(Color.black);
g.fillRect(100,200,largo_reparado,40);
g.drawString("Reparado", 10, 218);
g.drawString("cantidad "+ Reparado, 10, 233);

g.setColor(Color.red);
g.fillRect(100,250,largo_entregado,40);
g.drawString("Entregado", 10, 268);
g.drawString("cantidad "+ Entregado, 10, 283);

}




}
