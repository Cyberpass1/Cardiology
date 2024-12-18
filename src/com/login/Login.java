package com.login;

import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.Validar;
import Menu.Mprincipal;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static sun.security.jgss.GSSUtil.login;

public class Login extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        
         Calendar Fecha = new GregorianCalendar();
         FechaAdmin.setCalendar(Fecha);
        
  FechaAdmin.setVisible(false);
  
  
  try{    
       setIconImage(ImageIO.read(new File("C:\\Cyberia\\src\\imagenes\\Cardiologylogo.png")));   
   }
catch (Exception ex){
       System.out.println(ex);
   }
  
  
  
    try {
    // Establecer el LookAndFeel global
    UIManager.setLookAndFeel(new FlatLightLaf());
    
    // Aplicar un LookAndFeel diferente solo para JTabbedPane
    UIManager.put("TabbedPaneUI", "com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI"); 
    UIManager.put("TableUI", "javax.swing.plaf.basic.BasicTableUI");

        


} catch (Exception e) {
    e.printStackTrace();
}
 
  
  
  
  
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        FechaAdmin = new com.toedter.calendar.JDateChooser();
        title = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/heart-2561958_1280-removebg-preview.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 340, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        header.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        FechaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        FechaAdmin.setToolTipText("");
        FechaAdmin.setEnabled(false);
        FechaAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        header.add(FechaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("INICIAR SESIÓN");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt.setForeground(new java.awt.Color(204, 204, 204));
        userTxt.setBorder(null);
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userTxtKeyTyped(evt);
            }
        });
        bg.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 410, 20));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passTxtKeyTyped(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 410, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 410, 20));

        loginBtn.setBackground(new java.awt.Color(0, 0, 51));

        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ENTRAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("¿Olvidaste la contraseña?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
 
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed

    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
      //  javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + userTxt.getText() + "\nContraseña: " + String.valueOf(passTxt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
     
      
            String fecha = new SimpleDateFormat("yyyy/MM/dd").format(FechaAdmin.getDate());
            String [] dateParts= fecha.split("/");
            String an = dateParts[0];
            String mes = dateParts[1];
            String dia = dateParts[2];
            
      
            
            int Year, Month, Day;
            Year= Integer.parseInt(an);
            Month= Integer.parseInt(mes);
            Day= Integer.parseInt(dia);
            
           // System.out.println(Day+" " + Month + " "+ Year);
            
            
            
            if(Year<2022){JOptionPane.showMessageDialog(null,"LA FECHA DE LA COMPUTADORA ESTÁ MAL CONFIGURADA", "FECHA", 1);}
         // else if(Day>=20 && Month>=8 && Year>=2023){JOptionPane.showMessageDialog(null,"LICENCIA VENCIDA, FAVOR DE CONTACTAR CON EL DESARROLLADOR", "LICENCIA", JOptionPane.WARNING_MESSAGE);}
            else{validar();}
      
   
   
      
      
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        recuperar me = new recuperar();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel6MouseClicked
Validar va = new Validar();



    private void userTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTxtKeyTyped
    va.longitud(userTxt.getText(), 40, evt);
    }//GEN-LAST:event_userTxtKeyTyped

    private void passTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyTyped
  va.longitud(passTxt.getText(), 40, evt);
    }//GEN-LAST:event_passTxtKeyTyped

    private void passTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyReleased
    
    }//GEN-LAST:event_passTxtKeyReleased

    private void passTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
     
            String fecha = new SimpleDateFormat("yyyy/MM/dd").format(FechaAdmin.getDate());
            String [] dateParts= fecha.split("/");
            String an = dateParts[0];
            String mes = dateParts[1];
            String dia = dateParts[2];
            String an_actual = Validar.fecha_actual();

            int Year, Month, Day;
            Year= Integer.parseInt(an);
            Month= Integer.parseInt(mes);
            Day= Integer.parseInt(dia);
           
            if(Year<2022){JOptionPane.showMessageDialog(null,"LA FECHA DE LA COMPUTADORA ESTÁ MAL CONFIGURADA", "FECHA", 1);}
           //else if(Day>=20 && Month>=8 && Year>=2023){JOptionPane.showMessageDialog(null,"LICENCIA VENCIDA, FAVOR DE CONTACTAR CON EL DESARROLLADOR", "LICENCIA", JOptionPane.WARNING_MESSAGE);}
            else{validar();}
      
        
        } 
    }//GEN-LAST:event_passTxtKeyPressed

    
    Encriptar encriptar = new Encriptar();
    public int idu, rolSesion;
    public String nombreSesion, usuarioSesion;
    public void validar()
   
    
    {

        
        
   String clave = "";
   String usuario = this.userTxt.getText();
   clave = encriptar.ecnode(passTxt.getText().trim());
   
    if(this.userTxt.getText().equals("") || passTxt.getPassword().equals("") /*|| c1.getSelectedItem().toString().equals("Seleccionar")*/)
    {
    JOptionPane.showMessageDialog(this,"DEBE COMPLETAR LOS CAMPOS VACIOS", "CAMPOS VACIOS", 1);
    this.userTxt.requestFocus();
    }
    
    else
    {
        try{
   
       String query="SELECT IdPersonal, Usuario,  Clave, Nivel, date_format(Fecha, '%d/%m/%Y') AS myDate, Hora, especialidad, idEspecialidad FROM table_usuario u\n" +
"INNER JOIN table_nivel n ON u.Nivel=n.Idnivel\n" +
"INNER JOIN table_especialidad c ON u.idEspecialidad=c.id_especialidad \n"+
"where Usuario=? and Clave=?";
       
       con = EnlaceBd.getConnection();
       ps = con.prepareStatement(query);
       ps.setString(1, usuario);
       ps.setString(2, clave);
       rs=ps.executeQuery();

       
       if(rs.next())
       {
       
       int id =rs.getInt("IdPersonal");
       String user =rs.getString("Usuario");
       int nivel =rs.getInt("Nivel");
       String userfecha =rs.getString("myDate");
       String hora =rs.getString("Hora");
       String especialidad =rs.getString("Especialidad");
       String idEspecialidad = rs.getString("idEspecialidad");
          
             
             
      
       
       
        try
        
        
        {
         
      String sql2 = "SELECT IdPersonal,  Nombre, Apellido, Pestado FROM table_personal WHERE IdPersonal like " + '"' + id + '"';
      con = EnlaceBd.getConnection();
      ps = con.prepareStatement(sql2);
      rs=ps.executeQuery();
      
      
          while(rs.next())
          {
      idu= rs.getInt("IdPersonal");
      int estado= rs.getInt("Pestado");
      String nombre= rs.getString("Nombre");
      String Apellido= rs.getString("Apellido");
     
  
      
      
      
      
      nombreSesion=nombre+" "+Apellido;
      rolSesion=nivel;
      usuarioSesion=user;
      
      
      
      
      
      
      
      
     //Administrador
      if(nivel==1 && estado==100  )
      { 
        
         
        Mprincipal ad = new Mprincipal(); 
        
        
        ad.IDUSER.setText(Integer.toString(idu));
        ad.JLabelNombre.setText(nombreSesion);
        ad.TxtUser.setText(user);
        ad.Txtentrada.setText(userfecha + " | "+ hora );                                                                                                                                                      
        ad.BtnMensaje.setEnabled(true);  
        ad.Txtinfo.setEditable(true);
        ad.jMenuItem4.setEnabled(true);  
        ad.jMenuRestauracion.setEnabled(true);  
        ad.TxtRol.setText("Administrador");  
        ad.IDEspecialidad.setText(idEspecialidad);
        ad.TxtRol1.setText(especialidad);
        
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
        dispose(); 

      }
      
      
    

      
      
    
      
      
      
      
       //Doctor
      else  if(nivel==7 && estado==100  )
      { 
        

        Mprincipal ad = new Mprincipal(); 
        
       
    
        ad.BtnMensaje.setVisible(false);
        ad.BtnMensaje.setEnabled(false);
        ad.JMuser.setEnabled(false);
        ad.jMenuRegistros.setEnabled(true);
        ad.jMenuConfiguracion.setEnabled(false);
        ad.jMenuSeguridad.setEnabled(false);
        ad.jMenuServicios.setEnabled(false);
      //ad.jMenuItem10.setEnabled(false);
      //ad.jMenuItem12.setEnabled(false);
      //ad.jMenuItem9.setEnabled(false);
        ad.jMenuItem13.setEnabled(true);
        //ad.jMAsignar.setEnabled(false);
        ad. Txtinfo.setEditable(false);
        ad.jMenuItem5.setEnabled(false);
        
        
        ad.jLabel106.setVisible(false);
        ad.TxtUser.setVisible(false);
       
        ad.IDUSER.setText(Integer.toString(idu));
        ad.JLabelNombre.setText(nombreSesion);
        ad.TxtUser.setText(user);
        
        ad.TxtRol.setText("Doctor");
        ad.IDEspecialidad.setText(idEspecialidad);
        ad.TxtRol1.setText(especialidad);
        ad.jMenu4.setEnabled(true);
        ad.jMenuItem5.setEnabled(false);
        ad.Txtentrada.setText(userfecha + " | "+ hora );                                                                                                                                                     
        ad.usuario=idu;
        
        ad.setLocationRelativeTo(null);
        ad.setVisible(true);
        dispose(); 
      
      }
      
      
          
          
       else if (estado==101){JOptionPane.showMessageDialog(null, "SU USUARIO SE ENCUENTRA INACTIVO, COMUNIQUESE CON UN ADMINISTRADOR", "USUARIO INACTIVO",JOptionPane.ERROR_MESSAGE);}
        
       else{JOptionPane.showMessageDialog(null,"USUARIO NO REGISTRADO", "USUARIO", JOptionPane.ERROR_MESSAGE);}
          
          }

     
        
        } 
        

        
        catch(Exception ex)
   {
    JOptionPane.showMessageDialog(this, ex.getMessage());
    this.userTxt.requestFocus();
   
   }
        

        
       }
            else{JOptionPane.showMessageDialog(null,"USUARIO O CLAVE INCORRECTA", "DATOS ERRONEOS", JOptionPane.ERROR_MESSAGE);}
        
        
        } catch(Exception ex){System.out.println(ex);}
    }

   
    
    }
    
    
    
    

        
    Connection con = null;
    PreparedStatement ps=null;
    ResultSet rs = null;
 
    
    
    
    
    

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser FechaAdmin;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
