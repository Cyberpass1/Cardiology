
package com.login;

import com.login.Login;
import java.io.File;
import javax.imageio.ImageIO;

public class fsplash extends javax.swing.JFrame {

    public fsplash() {
        initComponents();
        
      
  try{    
       setIconImage(ImageIO.read(new File("C:\\Cyberia\\src\\imagenes\\Cardiologylogo.png")));   
   }
catch (Exception ex){
       System.out.println(ex);
   }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proge1 = new org.edisoncor.gui.progressBar.ProgressBarRound();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Percentage4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proge1.setBackground(new java.awt.Color(255, 255, 255));
        proge1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        proge1.setForeground(new java.awt.Color(0, 0, 0));
        proge1.setColorDeBorde(new java.awt.Color(255, 255, 255));
        proge1.setColorDeSombra(new java.awt.Color(255, 255, 255));
        getContentPane().add(proge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 326, 650, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel7.setText("System");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 170, 60));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/heart-2561958_1280-removebg-preview.png"))); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        Percentage4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        Percentage4.setText("%");
        jPanel2.add(Percentage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 110, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel8.setText("Cyberia");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 230, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       fsplash me = new fsplash();
       me.setLocationRelativeTo(null);
       me.setVisible(true);
       
      //----
      
      
       for(int i=0;i<=100;i++){
           
        try{
       Thread.sleep (60);
       }
       catch(Exception e){}   
           
       System.out.println(i+"%");
       me.proge1.setValue(i);
       me.Percentage4.setText(Integer.toString(i)+"%");
       }
        
        
      me.dispose();
      Login de = new Login();
      de.setLocationRelativeTo(null);
      de.setVisible(true);
      
    }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Percentage4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    public org.edisoncor.gui.progressBar.ProgressBarRound proge1;
    // End of variables declaration//GEN-END:variables
}
