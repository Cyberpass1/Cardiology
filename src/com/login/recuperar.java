/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;


import Clases.Encriptar;
import Clases.EnlaceBd;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
      

        
public class recuperar extends javax.swing.JFrame {


    Connection con = null;
    PreparedStatement ps=null;
    ResultSet rs = null;
    Encriptar encriptar = new Encriptar();
    
    
    public recuperar() {
        
        initComponents();
        
  jLabel13.setVisible(false);
        this.setResizable(false);
        //mainPanel.setFocusable(true);
        //test();
        
        
           jPanel9.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        usuariotxt = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Cedula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        TxtPregunta2 = new javax.swing.JTextField();
        Txtrespuesta2 = new javax.swing.JPasswordField();
        TxtPregunta3 = new javax.swing.JTextField();
        Txtrespuesta3 = new javax.swing.JPasswordField();
        b1 = new javax.swing.JButton();
        TxtPregunta1 = new javax.swing.JTextField();
        Txtrespuesta1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        nuevaclave1 = new javax.swing.JPasswordField();
        nuevaclave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 601));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(380, 560));
        jPanel3.setPreferredSize(new java.awt.Dimension(370, 590));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuariotxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 0, 0)));
        usuariotxt.setMargin(new java.awt.Insets(3, 2, 2, 2));
        usuariotxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuariotxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuariotxtFocusLost(evt);
            }
        });
        usuariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuariotxtKeyPressed(evt);
            }
        });
        jPanel3.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, 40));

        BtnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnBuscar.setContentAreaFilled(false);
        BtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 340, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("VOLVER");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 340, 30));

        Cedula.setText("V-");
        Cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CedulaKeyPressed(evt);
            }
        });
        jPanel3.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 340, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 1, 10)); // NOI18N
        jLabel13.setText("Realizando cambios, espera antes de volver...");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 290, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("CÉDULA");
        jPanel3.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        title2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title2.setText("USUARIO");
        jPanel3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel1.setMinimumSize(new java.awt.Dimension(380, 290));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgDoctora.jpg"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(380, 290));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgDoctora.jpg"))); // NOI18N
        jLabel7.setMinimumSize(new java.awt.Dimension(380, 290));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 580));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(390, 582));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtPregunta2.setEditable(false);
        TxtPregunta2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Segunda Pregunta")));
        jPanel9.add(TxtPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 50));

        Txtrespuesta2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Respuesta 2"));
        jPanel9.add(Txtrespuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 50));

        TxtPregunta3.setEditable(false);
        TxtPregunta3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tercera Pregunta")));
        jPanel9.add(TxtPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 50));

        Txtrespuesta3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Respuesta 3"));
        jPanel9.add(Txtrespuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 170, 50));

        b1.setText("Verificar");
        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b1.setContentAreaFilled(false);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel9.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 40));

        TxtPregunta1.setEditable(false);
        TxtPregunta1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Primera Pregunta")));
        jPanel9.add(TxtPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 50));

        Txtrespuesta1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Respuesta 1"));
        jPanel9.add(Txtrespuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, 50));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel14.setText("Preguntas de seguridad");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 260, 30));
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cambio de contraseña"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("CONFIRMAR");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 280, 30));

        nuevaclave1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Repetir clave"));
        jPanel8.add(nuevaclave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 280, 40));

        nuevaclave.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nueva clave"));
        jPanel8.add(nuevaclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 280, 40));

        jPanel9.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, 230));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/candado (1).png"))); // NOI18N
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 410, 580));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 601));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariotxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuariotxtFocusGained

        if(usuariotxt.getText().trim().equals("Coloca tu usuario")) { usuariotxt.setText("");}

    }//GEN-LAST:event_usuariotxtFocusGained

    private void usuariotxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuariotxtFocusLost

        if(usuariotxt.getText().trim().equals(""))
        {

            // respuestatxt.setText("");

        }
        usuariotxt.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_usuariotxtFocusLost

    private void usuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariotxtKeyPressed
        /*
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                String sql = "SELECT * FROM tab_acceso WHERE Id_Personal=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, usuariotxt.getText());
                rs=ps.executeQuery();

                if(rs.next())
                {
                    String pregunta1;
                    String pregunta2;
                    String pregunta3;

                    pregunta1=(rs.getString("Pregunta_1"));
                    pregunta2=(rs.getString("Pregunta_2"));
                    pregunta3=(rs.getString("Pregunta_3"));

                }else{  JOptionPane.showMessageDialog(null,"El usuario no existe", "RECUPERAR", 1);}

            }
            catch(Exception ex ){  JOptionPane.showMessageDialog(null,ex);}

        }*/
    }//GEN-LAST:event_usuariotxtKeyPressed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        checkInformation();

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Login me = new Login();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    
       public void checkInformation(){
    
        
           if( usuariotxt.getText().trim().equals("") ||  Cedula.getText().trim().equals("V-")  ){ JOptionPane.showMessageDialog(null, "Debe completar los campos", "RECUPERAR", JOptionPane.ERROR_MESSAGE);}
      
           
           else{
           
           try{
            String sql = "SELECT Usuario,  Cedula, Pregunta1, Pregunta2, Pregunta3\n" +
"FROM table_usuario u\n" +
"INNER JOIN table_personal h\n" +
"ON u.IdPersonal=h.IdPersonal\n" +
"WHERE Usuario=? and Cedula=?";
            
            
            con = EnlaceBd.getConnection();
       ps = con.prepareStatement(sql);
       ps.setString(1, usuariotxt.getText());
       ps.setString(2, Cedula.getText());
       rs=ps.executeQuery();

       
       if(rs.next())
            {
                
                String pregunta1, pregunta2, pregunta3;
                pregunta1=(rs.getString("Pregunta1"));
                pregunta2=(rs.getString("Pregunta2"));
                pregunta3=(rs.getString("Pregunta3"));
                //question.setText(pregunta1);
      jPanel9.setVisible(true);
      count=1;
      TxtPregunta1.setText(pregunta1);
      TxtPregunta2.setText(pregunta2);
      TxtPregunta3.setText(pregunta3);
      
    // usuariotxt.setEnabled(false); 
     jPanel8.setVisible(false);
  
      b1.setEnabled(true);
    
      
      
      
            }else{  JOptionPane.showMessageDialog(null,"El usuario o cédula no son correctos", "RECUPERAR", 1);}
              
        }
        catch(Exception ex ){  JOptionPane.showMessageDialog(null,ex);}
           
           }
           
    
    }
    
    
    private void CedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkInformation();
        }
    }//GEN-LAST:event_CedulaKeyPressed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String usuario = this.usuariotxt.getText();
        String respuesta = (encriptar.ecnode(Txtrespuesta1.getText()));
        String respuesta2 = (encriptar.ecnode(Txtrespuesta2.getText()));
        String respuesta3 = (encriptar.ecnode(Txtrespuesta3.getText()));
        if( Txtrespuesta1.getText().equals("")||Txtrespuesta2.getText().equals("") ||Txtrespuesta3.getText().equals("")) { JOptionPane.showMessageDialog(null, "Debe completar los campos", "RECUPERAR", JOptionPane.ERROR_MESSAGE);}

        else{

            try {
                String query="SELECT * FROM table_usuario WHERE Usuario=? And Respuesta1='"+respuesta+"'" + "And Respuesta2='"+respuesta2+"'"+ "And Respuesta3='"+respuesta3+"'";
                ps= con.prepareStatement(query);
                ps.setString(1, usuario);
                rs = ps.executeQuery();

                if(rs.next())
                {
                    jPanel8.setVisible(true);
                    b1.setEnabled(false);

                }
                else{JOptionPane.showMessageDialog(null,"Respuestas Incorrectas", "RECUPERAR", 1);}
            }         catch(Exception e){System.out.println("");}}

    }//GEN-LAST:event_b1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (!this.nuevaclave.getText().equals(this.nuevaclave1.getText())){

            JOptionPane.showMessageDialog(null, "Verificar: Las contraseñas no coinciden", "Contraseñas no coinciden", JOptionPane.INFORMATION_MESSAGE);
            nuevaclave.setText("");
            nuevaclave1.setText("");
            this.nuevaclave.requestFocus();
            return;
        }

        else if (nuevaclave.getText().equals("")|| nuevaclave1.getText().equals("") )
        {

            JOptionPane.showMessageDialog(null, "LOS CAMPOS NO PUEDEN ESTAR VACIOS", "CAMPOS VACIOS", JOptionPane.INFORMATION_MESSAGE);
        }

        else{

            try {

                String sql = "update table_usuario set Clave=? where Usuario=? ";

                ps = con.prepareStatement(sql);
                ps.setString(1, encriptar.ecnode(String.valueOf(nuevaclave.getPassword())));
                ps.setString(2, usuariotxt.getText());

                int res = ps.executeUpdate();

                if (res >= 1) {

                    CallId();

                    jButton3.setEnabled(false);
                    jButton4.setEnabled(false);
                    jLabel13.setVisible(true);

                    email();

                    jButton3.setEnabled(true);
                    jButton4.setEnabled(true);
                    jLabel13.setVisible(false);

                    JOptionPane.showMessageDialog(null, "ESTIMADO USUARIO, SU CONTRASEÑA HA SIDO ACTUALIZADA", "ACTUALIZAR CONTRASEÑA", 1);
                    nuevaclave.setText("");
                    nuevaclave1.setText("");
                    usuariotxt.setText("");
                    Cedula.setText("V-");
                    jPanel9.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Fallo al actualizar  ....");
                }
            } catch (Exception e) {
                {System.out.println(e);
                    jButton3.setEnabled(true);
                }
            }

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    JFormattedTextField tf = new JFormattedTextField();
    
   
    
    
    
       private int count =0;
    
    public void sad()
    {
         count++;
       
     
      if(count == 1){
              try{
            String sql = "SELECT Pregunta_1 FROM tab_acceso WHERE Usuario=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, usuariotxt.getText());
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                
                String pregunta1;
                pregunta1=(rs.getString("Pregunta_1"));
          //      question.setText(pregunta1);
   
            }else{  JOptionPane.showMessageDialog(null,"error", "RECUPERAR", 1);}
                
        }
        catch(Exception ex ){  JOptionPane.showMessageDialog(null,ex);}
            
        }
      
       if(count == 2){
              try{
            String sql = "SELECT Pregunta_2 FROM tab_acceso WHERE Usuario=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, usuariotxt.getText());
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                
                String pregunta1;
                pregunta1=(rs.getString("Pregunta_2"));
           //     question.setText(pregunta1);
   
            }else{  JOptionPane.showMessageDialog(null,"error", "RECUPERAR", 1);}
                
        }
        catch(Exception ex ){  JOptionPane.showMessageDialog(null,ex);}
            
        }
           else if(count == 3){
          try{
            String sql = "SELECT Pregunta_3 FROM tab_acceso WHERE Usuario=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, usuariotxt.getText());
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                
                String pregunta1;
                pregunta1=(rs.getString("Pregunta_3"));
           //     question.setText(pregunta1);
   
            }else{  JOptionPane.showMessageDialog(null,"error", "RECUPERAR", 1);}
                
        }
        catch(Exception ex ){  JOptionPane.showMessageDialog(null,ex);}
            
        }
          
            else if(count > 3){
            count=0;
        }
    }
    
    
    public String porcentaje, cedula, correo;
   
    
    
    
    
    
    
    
    

    //sqjaqrvlxglnrtol
    
    
     
    public void email()
    {
    String remitente ="cyberiasystemjc@gmail.com";
    String clave= "tbasmzkiofgsqfha";
    String destino=correo;
    String mensaje="Estimado/a "+usuariotxt.getText()+" "+"se ha detectado un cambio de clave dentro del sistema cyberia. \n ";
          
    Properties props= new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.setProperty("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.port", "587");
    props.setProperty("mail.smtp.port", "587");
    props.put("mail.smtp.user", remitente);
    props.setProperty("mail.smtp.auth","true");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
   

    
    Session session = Session.getDefaultInstance(props);
    MimeMessage mail = new MimeMessage(session);
    
    try{
  
        mail.setFrom(new InternetAddress(remitente));
        mail.addRecipient(Message.RecipientType.TO, new  InternetAddress(destino));
        mail.setSubject("Cambio de clave | C Y B E R I A |");
        mail.setText(mensaje);
        
       Transport transporte = session.getTransport("smtp");
       transporte.connect(remitente, clave);
       transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
       transporte.close();
     //  JOptionPane.showMessageDialog(null,"CORREO ENVIADO");
        
    } 
    catch(Exception e)
    {System.out.println(e);
      JOptionPane.showMessageDialog(null,"ERROR AL ENVIAR EL CORREO");}
    }

    
    
      
      public void email2()
    {
    String remitente ="fundaginebralab@gmail.com";
    String clave= "sqjaqrvlxglnrtol";
    String destino=correo;
    Properties props= new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.setProperty("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.port", "587");
    props.setProperty("mail.smtp.port", "587");
    props.put("mail.smtp.user", remitente);
    props.setProperty("mail.smtp.auth","true");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
    
    
   String PdfNames="This_is_a_test";
    
    Session session = Session.getDefaultInstance(props);
    MimeMessage mensaje = new MimeMessage(session);
    
    try{
    mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
    mensaje.setSubject("Esto es una prueba");
  
    BodyPart parteTexto= new MimeBodyPart();
     parteTexto.setContent("Hola Mundo", "text/html");
    
     
     File file = new File("C://Fundaginebra//Reportes//"+PdfNames+".pdf");
     BodyPart parteArchivo= new MimeBodyPart();
     parteArchivo.setDataHandler(new DataHandler(new FileDataSource(file)));
     parteArchivo.setFileName("admin.pdf");
   
    
    MimeMultipart todasLasPartes = new MimeMultipart();
    todasLasPartes.addBodyPart(parteTexto);
    todasLasPartes.addBodyPart(parteArchivo);
    mensaje.setContent(todasLasPartes);
    
    
    Transport transport = session.getTransport("smtp");
    transport.connect("smtp.gmail.com", remitente, clave);
    transport.sendMessage(mensaje, mensaje.getAllRecipients());
    transport.close();
    JOptionPane.showMessageDialog(null,"Correo Enviado a: "+ usuariotxt.getText() );
    } 
    catch(Exception e)
    {System.out.println(e);
      JOptionPane.showMessageDialog(null,"ERROR AL ENVIAR EL CORREO");}
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void CallId() {
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
   
        try {

            String sql = "select * from table_personal WHERE Cedula like " + '"' + Cedula.getText() + '"';

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
         
            System.out.println( Cedula.getText() );
            if (rs.next()) {
             String  Username = rs.getString("Nombre");
             String  Userlastname = rs.getString("Apellido");
             correo= rs.getString("Correo");
             
             
             
            }

        } catch (Exception e) {System.out.println(e);
        }  
    }
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recuperar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField TxtPregunta1;
    private javax.swing.JTextField TxtPregunta2;
    private javax.swing.JTextField TxtPregunta3;
    private javax.swing.JPasswordField Txtrespuesta1;
    private javax.swing.JPasswordField Txtrespuesta2;
    private javax.swing.JPasswordField Txtrespuesta3;
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField nuevaclave;
    private javax.swing.JPasswordField nuevaclave1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
