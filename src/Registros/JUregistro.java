/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.LlenarCombobox;
import Clases.Temporal;
import Clases.Validar;
import Menu.Mprincipal;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author FCGinebraI
 */
public class JUregistro extends javax.swing.JInternalFrame {

    /**
     * Creates new form JUREGISTRO
     */
    public JUregistro() {
           initComponents();
       ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        Calendar Fecha = new GregorianCalendar();
        FechaAdmin.setCalendar(Fecha);
        FechaAdmin.setVisible(false);
   
        TxtID.setVisible(false);
        llenarCombo();
        validarNyL();
    }

    Mprincipal Menu = new Mprincipal();
    Encriptar encriptar = new Encriptar();
    
    Validar va = new Validar();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        respuesta3 = new javax.swing.JTextField();
        Pregunta3 = new javax.swing.JComboBox<>();
        respuesta2 = new javax.swing.JTextField();
        Pregunta2 = new javax.swing.JComboBox<>();
        respuesta1 = new javax.swing.JTextField();
        Pregunta1 = new javax.swing.JComboBox<>();
        jLabel98 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDireccion = new javax.swing.JTextArea();
        TxtCorreo = new javax.swing.JTextField();
        TxtMovil = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        Txtcedula = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        BuscarUsuarios = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        TxtEstado = new javax.swing.JComboBox<>();
        TxtRol = new javax.swing.JComboBox<>();
        jLabel105 = new javax.swing.JLabel();
        TxtClaverepeat = new javax.swing.JPasswordField();
        TxtClave = new javax.swing.JPasswordField();
        TxtUsuario = new javax.swing.JTextField();
        TxtID = new javax.swing.JTextField();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel104 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel113 = new javax.swing.JLabel();
        lbfoto = new javax.swing.JLabel();
        AUfoto = new javax.swing.JButton();
        JCEspecialidad = new javax.swing.JComboBox<>();
        TxtMPPS = new javax.swing.JTextField();
        TxtCMA = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        BtnModificar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        FechaAdmin = new com.toedter.calendar.JDateChooser();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        respuesta3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Respuesta #3"));
        respuesta3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuesta3KeyTyped(evt);
            }
        });
        jPanel5.add(respuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 350, 50));

        Pregunta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Idioma favorito?", "¿Color preferido?", "¿Nombre de un amigo de la infancia?" }));
        jPanel5.add(Pregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 350, 40));

        respuesta2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Respuesta #2"));
        respuesta2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuesta2KeyTyped(evt);
            }
        });
        jPanel5.add(respuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 350, 50));

        Pregunta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Genero musical preferido?", "¿Nombre de tu mascota?", "¿Pasatiempo preferido?" }));
        jPanel5.add(Pregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 350, 40));

        respuesta1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Respuesta #1"));
        respuesta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respuesta1KeyTyped(evt);
            }
        });
        jPanel5.add(respuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, 50));

        Pregunta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cual es tu ciudad favorita?", "¿Cual es tu video juego favorito?", "¿Cual es tu sabor de helado favorito?" }));
        jPanel5.add(Pregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 350, 40));

        jLabel98.setBackground(new java.awt.Color(0, 0, 0));
        jLabel98.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel98.setText("PREGUNTAS DE SEGURIDAD");
        jPanel5.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 220, -1));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 10));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 410, 520));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel111.setText("Fecha de nacimiento");
        jPanel4.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        TxtDireccion.setColumns(20);
        TxtDireccion.setRows(5);
        TxtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dirección"));
        TxtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDireccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TxtDireccion);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 330, -1));

        TxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo"));
        TxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCorreoKeyTyped(evt);
            }
        });
        jPanel4.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 50));

        TxtMovil.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefono Movil"));
        TxtMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtMovilKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtMovilKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMovilKeyTyped(evt);
            }
        });
        jPanel4.add(TxtMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 50));

        TxtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apellido"));
        TxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtApellidoKeyTyped(evt);
            }
        });
        jPanel4.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 160, 50));

        Txtcedula.setText("V-");
        Txtcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cédula"));
        Txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtcedulaKeyTyped(evt);
            }
        });
        jPanel4.add(Txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 50));

        TxtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"));
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        jPanel4.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 50));

        BuscarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        BuscarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/magnifier-1_icon-icons.com_56924.png"))); // NOI18N
        BuscarUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BuscarUsuarios.setBorderPainted(false);
        BuscarUsuarios.setContentAreaFilled(false);
        BuscarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarUsuariosActionPerformed(evt);
            }
        });
        jPanel4.add(BuscarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 50, 50));

        jLabel112.setBackground(new java.awt.Color(0, 0, 0));
        jLabel112.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel112.setText("Firma");
        jPanel4.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        TxtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel4.add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 270, 40));

        TxtRol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TxtRolItemStateChanged(evt);
            }
        });
        TxtRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRolActionPerformed(evt);
            }
        });
        jPanel4.add(TxtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 120, 40));

        jLabel105.setBackground(new java.awt.Color(0, 0, 0));
        jLabel105.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel105.setText("Rol");
        jPanel4.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        TxtClaverepeat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Repetir contraseña"));
        TxtClaverepeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtClaverepeatKeyTyped(evt);
            }
        });
        jPanel4.add(TxtClaverepeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 330, 50));

        TxtClave.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contraseña"));
        TxtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtClaveKeyTyped(evt);
            }
        });
        jPanel4.add(TxtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 330, 50));

        TxtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuario"));
        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyTyped(evt);
            }
        });
        jPanel4.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 330, 50));

        TxtID.setText("ID");
        jPanel4.add(TxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 20, 30));

        FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        FechaNacimiento.setToolTipText("");
        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel4.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 170, 40));

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel104.setText("M Ó D U L O     P E R S O N A L");
        jPanel4.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 250, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 780, 20));

        jLabel113.setBackground(new java.awt.Color(0, 0, 0));
        jLabel113.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel113.setText("Estado");
        jPanel4.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        lbfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lbfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 150, 90));

        AUfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Img.png"))); // NOI18N
        AUfoto.setBorderPainted(false);
        AUfoto.setContentAreaFilled(false);
        AUfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUfotoActionPerformed(evt);
            }
        });
        jPanel4.add(AUfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 130, 30));

        JCEspecialidad.setEnabled(false);
        jPanel4.add(JCEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 120, 40));

        TxtMPPS.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "M.P.P.S"));
        TxtMPPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMPPSKeyTyped(evt);
            }
        });
        jPanel4.add(TxtMPPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 160, 50));

        TxtCMA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "C.M.A"));
        TxtCMA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCMAKeyTyped(evt);
            }
        });
        jPanel4.add(TxtCMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 160, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, 520));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1300, 10));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 10, 60));

        BtnModificar.setText("MODIFICAR");
        BtnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnModificar.setContentAreaFilled(false);
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 130, 30));

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 130, 30));

        jButton5.setText("Nuevo");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 130, 30));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, 10, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 610));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        FechaAdmin.setToolTipText("");
        FechaAdmin.setEnabled(false);
        FechaAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(FechaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1300, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtClaverepeatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClaverepeatKeyTyped
        va.longitud( TxtClaverepeat.getText(), 20, evt);

    }//GEN-LAST:event_TxtClaverepeatKeyTyped

    private void TxtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreoKeyTyped
        va.longitud(TxtCorreo.getText(), 40, evt);
    }//GEN-LAST:event_TxtCorreoKeyTyped

    private void TxtMovilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMovilKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String Caracteres = TxtMovil.getText();
            if(Caracteres.length()!=11)
            {
                JOptionPane.showMessageDialog(null,"El telefono debe posser todos sus digitos","Registro de campos",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_TxtMovilKeyPressed

    private void TxtMovilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMovilKeyReleased
        if (TxtMovil.getText().length()==4)
        {
            TxtMovil.setText(TxtMovil.getText()+ "-" );

        }
    }//GEN-LAST:event_TxtMovilKeyReleased

    private void TxtMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMovilKeyTyped
        va.longitud(TxtMovil.getText(), 12, evt);
    }//GEN-LAST:event_TxtMovilKeyTyped

    private void TxtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtcedulaKeyTyped
        char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='V' || car=='E' || car =='J' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = Txtcedula.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='V' && car!='E' && car != 'J' && car!='-' || car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_TxtcedulaKeyTyped

    private void TxtClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtClaveKeyTyped
        va.longitud(TxtClave.getText(), 20, evt);
    }//GEN-LAST:event_TxtClaveKeyTyped

    private void TxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyTyped
        va.longitud(TxtUsuario.getText(), 20, evt);
    }//GEN-LAST:event_TxtUsuarioKeyTyped

    private void TxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellidoKeyTyped
        va.longitud(TxtNombre.getText(), 20, evt);
    }//GEN-LAST:event_TxtApellidoKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
        va.longitud(TxtNombre.getText(), 20, evt);
    }//GEN-LAST:event_TxtNombreKeyTyped

    private void BuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarUsuariosActionPerformed

       BuscarUsuario();
    }//GEN-LAST:event_BuscarUsuariosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed


        try{

            Connection con=null;
            EnlaceBd cn = new EnlaceBd();
            PreparedStatement ps=null;
            ResultSet rs=null;

            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            String Correo = TxtCorreo.getText();
            Matcher mather = pattern.matcher(Correo);

            String fecha = new SimpleDateFormat("yyyy/MM/dd").format(FechaNacimiento.getDate());
            String [] dateParts= fecha.split("/");
            String an = dateParts[0];
            String mes = dateParts[1];
            String dia = dateParts[2];
            String an_actual = Validar.fecha_actual();

            int edad;
            edad= Integer.parseInt(an_actual)-Integer.parseInt(an);

            if (TxtUsuario.getText().equals("") || TxtClave.getPassword().equals("")  || TxtNombre.getText().equals("")

                || TxtApellido.getText().equals("")  || TxtMovil.getText().equals("") || TxtDireccion.getText().equals("")
                    || respuesta1.getText().equals("") || respuesta2.getText().equals("") || respuesta3.getText().equals(""))  { 
                JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.ERROR_MESSAGE);

            } else if (mather.find() == false) {
                JOptionPane.showMessageDialog(null, "EMAIL INVALIDO", "EMAIL", JOptionPane.ERROR_MESSAGE);
                
                
            } else if (!this.TxtClave.getText().equals(this.TxtClaverepeat.getText())) {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO COINCIDEN", "CONTRASEÑA", JOptionPane.ERROR_MESSAGE);
                TxtClave.setText("");
                TxtClaverepeat.setText("");
                this.TxtClave.requestFocus();
                return;
            }
            
         else   if (TxtClave.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "LA CONTRASEÑA DEBE SER MAYOR A 5 CARACTERES", "CONTRASEÑA", JOptionPane.ERROR_MESSAGE);
        } 
            
            else if(edad<=17){JOptionPane.showMessageDialog(null,"LA PERSONA QUE INTENTA AGREGAR NO ES MAYOR DE EDAD", "EDAD", 1);}
            //   else if (edad<=17){     JOptionPane.showMessageDialog(null, "La persona no es mayor de edad", "Personal", JOptionPane.ERROR_MESSAGE);}

            else if(JCEspecialidad.getSelectedItem().equals("Seleccionar") )
           {
     JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA ESPECIALIDAD VALIDA", "SELECCIONAR", JOptionPane.ERROR_MESSAGE);
           }
     
            
            
            else {

                String cedula= Txtcedula.getText();
                String sql="SELECT Cedula FROM table_personal WHERE Cedula='"+ cedula +"'";

                try{
                    con = EnlaceBd.getConnection();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    if(rs.next()){JOptionPane.showMessageDialog(null, "CÉDULA PREVIAMENTE REGISTRADA", "REGISTRO",JOptionPane.ERROR_MESSAGE);}
                    else{

                        String usuario= TxtUsuario.getText();
                        String sql2="SELECT Usuario FROM table_usuario WHERE Usuario='"+ usuario+"'";

                        try{
                            con = EnlaceBd.getConnection();
                            ps = con.prepareStatement(sql2);
                            rs = ps.executeQuery();
                            if(rs.next()){JOptionPane.showMessageDialog(null, "USUARIO PREVIAMENTE REGISTRADO", "REGISTRO",JOptionPane.ERROR_MESSAGE);}
                            else{

                               agregarusuario();
                               AuditoriaAgregar();
                               limpiar();

                            }
                        }catch(Exception e){System.out.println(e);}

                    }
                }catch(Exception e){System.out.println(e);}

            }
        }
        catch(Exception e){ JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Correo = TxtCorreo.getText();
        Matcher mather = pattern.matcher(Correo);

        if ( TxtNombre.getText().trim().equals("")
            || TxtNombre.getText().equals("") || TxtMovil.getText().equals("")
           
            || Txtcedula.getText().equals("") || TxtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);
        } else if (mather.find() == false) {
            JOptionPane.showMessageDialog(null, "EMAIL INVALIDO, VERIFIQUE", "EMAIL", JOptionPane.INFORMATION_MESSAGE);
        } 
  
          else if(JCEspecialidad.getSelectedItem().equals("Seleccionar") )
           {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA ESPECIALIDAD VALIDA", "SELECCIONAR", JOptionPane.ERROR_MESSAGE);
           }
          


        else {

           actualizarusuario();
           AuditoriaModificar();
           limpiar();

            BtnModificar.setEnabled(false);
            BtnAgregar.setEnabled(true);
        }

    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TxtRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRolActionPerformed

    private void TxtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDireccionKeyTyped
     va.longitud(TxtDireccion.getText(), 120, evt);
    }//GEN-LAST:event_TxtDireccionKeyTyped

    private void respuesta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuesta1KeyTyped
           va.longitud(respuesta1.getText(), 30, evt);
    }//GEN-LAST:event_respuesta1KeyTyped

    private void respuesta2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuesta2KeyTyped
       va.longitud(respuesta2.getText(), 30, evt);
    }//GEN-LAST:event_respuesta2KeyTyped

    private void respuesta3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respuesta3KeyTyped
       va.longitud(respuesta3.getText(), 30, evt);
    }//GEN-LAST:event_respuesta3KeyTyped

    private void AUfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUfotoActionPerformed

        
        try{
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("*.images", "JPEG", "jpg", "png");
        chooser.addChoosableFileFilter(fnef);
        int ans = chooser.showSaveDialog(null);

        //  if (ans == JFileChooser.APPROVE_OPTION && fila==-1) {
            //    File selectedPhoto = chooser.getSelectedFile();
            //  String path = selectedPhoto.getAbsolutePath();
            // lbfoto.setIcon(resetImageSize(path, null));
            //this.rutafoto = path;
            // AUregistrar.setEnabled(true);
            // }

        //else if (ans == JFileChooser.APPROVE_OPTION )
        //{
            File selectedPhoto = chooser.getSelectedFile();
            String path = selectedPhoto.getAbsolutePath();
            lbfoto.setIcon(resetImageSize(path, null));
            this.rutafoto = path;
            // }
        // else{}
//System.out.println(rutafoto);

}catch(Exception  e){System.out.println(e);}
    }//GEN-LAST:event_AUfotoActionPerformed

    private void TxtRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TxtRolItemStateChanged
       if(TxtRol.getSelectedIndex()!=-1){
      
           
           if(TxtRol.getSelectedItem().equals("Lcdo")){
           JCEspecialidad.setEnabled(true);
           }
          else    if(TxtRol.getSelectedItem().equals("Doctor")){
           JCEspecialidad.setEnabled(true);
           }
              else   if(TxtRol.getSelectedItem().equals("Medico")){
           JCEspecialidad.setEnabled(true);
           }
           
              else{
              JCEspecialidad.setSelectedItem("Administrativo");
              JCEspecialidad.setEnabled(false);
              }
           
         
           
    
        }
       
       

       
    }//GEN-LAST:event_TxtRolItemStateChanged

    private void TxtMPPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMPPSKeyTyped
      char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TxtMPPS.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=','  && car!='-' || car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_TxtMPPSKeyTyped

    private void TxtCMAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCMAKeyTyped
        char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TxtCMA.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=','  && car!='-' || car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_TxtCMAKeyTyped

    
        
   
    
    
     public void BuscarUsuario()
    {
   
       Connection con=null;
       EnlaceBd cn = new EnlaceBd();
       PreparedStatement ps=null;
        ResultSet rs=null;

        String Cedula = Txtcedula.getText();
        
     
         
        
        try{
   
       String query="Select IdPersonal from table_personal where Cedula=? ";
       
       con = EnlaceBd.getConnection();
       ps = con.prepareStatement(query);
       ps.setString(1, Cedula);
       rs=ps.executeQuery();
      
if(Txtcedula.getText().equals("V-") ||Txtcedula.getText().equals(""))
{
JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CÉDULA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
}
       
      else if(rs.next())
       {
      int idu= rs.getInt("IdPersonal");
      try{
      String sql2 = " SELECT IdPersonal, Cedula, Nombre, Apellido, Direccion, Telefono, Correo, Estado, date_format(Nacimiento, '%d/%m/%Y') AS Fecha, Firma, CMA, MPPS from table_personal u INNER JOIN table_estado n ON u.Pestado=n.IdEstado WHERE IdPersonal=?";
      con = EnlaceBd.getConnection();
      ps = con.prepareStatement(sql2);
      ps.setInt(1, idu);
      rs=ps.executeQuery();
    
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 
       
      if(rs.next()){
     
    
      String cedula= rs.getString("Cedula");
      String nombre= rs.getString("Nombre");
      String apellido= rs.getString("Apellido");
      String Direccion= rs.getString("Direccion");
      String tlf1= rs.getString("Telefono");
      String correo= rs.getString("Correo");
      String nacimiento= rs.getString("Fecha");
      String estado= rs.getString("Estado");
      Blob fot = rs.getBlob("Firma");
      String CMA= rs.getString("CMA");
      String MPPS= rs.getString("MPPS");
 
      if( fot!=null){
      byte [] ft = fot.getBytes(1, (int) fot.length());
      BufferedImage imagen =ImageIO.read(new ByteArrayInputStream(ft));
      Image img = null;
      ImageIcon imgs = null;   
      img= imagen.getScaledInstance(120, 90, Image.SCALE_SMOOTH);
      imgs = new ImageIcon(img);
      lbfoto.setIcon(imgs);
      }
      
      
      TxtID.setText(Integer.toString(idu));
      TxtNombre.setText(nombre);
      TxtApellido.setText(apellido);
      TxtMovil.setText(tlf1);
      TxtDireccion.setText(Direccion);
      TxtCorreo.setText(correo);
      FechaNacimiento.setDate(formato.parse(nacimiento));
      TxtEstado.setSelectedItem(estado);
      

      if( TxtCMA!=null){TxtCMA.setText(CMA);}
      if( TxtMPPS!=null){TxtMPPS.setText(MPPS);;}
   
      
      
      }
      TxtUsuario.setEnabled(false);
      TxtClave.setEnabled(false);
      TxtClaverepeat.setEnabled(false);
      Pregunta1.setEnabled(false);
      Pregunta2.setEnabled(false);
      Pregunta3.setEnabled(false);
      respuesta1.setEnabled(false);
      respuesta2.setEnabled(false);
      respuesta3.setEnabled(false);
      BtnAgregar.setEnabled(false);
      BtnModificar.setEnabled(true);
      JCEspecialidad.setEnabled(true);
      
       }catch(Exception e){JOptionPane.showMessageDialog(null, e); System.out.println(e);}
       
      
      try{
      
 String sql3 = "SELECT IdPersonal, Nivelu,  especialidad from table_usuario u\n" +
" \n" +
"INNER JOIN table_nivel n\n" +
"ON u.Nivel=n.IdNivel\n" +
"              \n" +
"INNER JOIN table_especialidad d\n" +
"ON u.idEspecialidad=d.id_especialidad\n" +
"WHERE IdPersonal=?"  ;

           
      
      con = EnlaceBd.getConnection();
      ps = con.prepareStatement(sql3);
      ps.setInt(1, idu);
      rs=ps.executeQuery();
     

      if(rs.next())
      {
          String nivel= rs.getString("Nivelu");
          String especialidad= rs.getString("especialidad");
          TxtRol.setSelectedItem(nivel.toString());
          JCEspecialidad.setSelectedItem(especialidad.toString());
      }
      
          
    
      
      }
  
      
      catch(Exception e ){System.out.println("error de especialidades;" +e);}
      
      
      
       }
      
      
      
      
      
      
      
       else{JOptionPane.showMessageDialog(null, "Usuario erroneo o asegure colocar: V-", "USUARIO NO ENCONTRADO", 1);}
        
         
         
      }catch(Exception e){ System.out.println(""+e);}
        
        
    
    }
    
     
    
    String rutafoto = "";

    public ImageIcon resetImageSize(String rutafoto, byte[] photo) {
        ImageIcon Ufoto = null;
        if (rutafoto != null) {
            Ufoto = new ImageIcon(rutafoto);
        } else {
            Ufoto = new ImageIcon(photo);
        }
        Image img = Ufoto.getImage();
        Image img1 = img.getScaledInstance(lbfoto.getWidth(), lbfoto.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon ph = new ImageIcon(img1);
        return ph;
    }

 
    
       
    public void agregarusuario()
    {
   Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null;
    
   
        java.sql.Date fechaU;
        Date dateU = FechaAdmin.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
        
        
        
        java.sql.Date fechaN;
        Date dateN = FechaNacimiento.getDate();
        long dN = dateN.getTime();
        fechaN = new java.sql.Date(dN);
        
       String tiempo = Menu.Time.getText() +" "+MP.jLabel102.getText();
      
   try {
            InputStream fotoFirma = new FileInputStream(new File(rutafoto));
 
            String sql = "INSERT INTO table_personal (Cedula, Nombre, Apellido,	Direccion,	Telefono,	Correo, Nacimiento, Pestado, Firma, CMA, MPPS)  VALUES (?,?,?,?,?,?,?,(SELECT IdEstado FROM table_estado WHERE Estado=?),?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Txtcedula.getText());
            ps.setString(2, TxtNombre.getText());
            ps.setString(3, TxtApellido.getText());
            ps.setString(4, TxtDireccion.getText());
            ps.setString(5, TxtMovil.getText());
            ps.setString(6, TxtCorreo.getText());
            ps.setDate(7, fechaN);
            ps.setString(8, TxtEstado.getSelectedItem().toString());
            ps.setBlob(9, fotoFirma);
            ps.setString(10, TxtCMA.getText());
            ps.setString(11, TxtMPPS.getText());
            ps.execute();
            
            
            
            String sql1 = "INSERT INTO table_usuario (Usuario, Clave, Nivel,  Fecha, Hora, Pregunta1,	Respuesta1,	Pregunta2,	Respuesta2,	Pregunta3,	Respuesta3, idEspecialidad)  VALUES (?,?,(SELECT IdNivel FROM table_nivel WHERE Nivelu=?),?,?,?,?,?,?,?,?,(SELECT id_especialidad FROM table_especialidad WHERE especialidad=?))";
            con = cn.getConnection();
            ps = con.prepareStatement(sql1);

     
      
            ps.setString(1, TxtUsuario.getText());
            ps.setString(2, encriptar.ecnode(String.valueOf(TxtClave.getPassword())));
            ps.setString(3, TxtRol.getSelectedItem().toString());
            ps.setDate(4, fechaU);
            ps.setString(5, tiempo);
            ps.setString(6, Pregunta1.getSelectedItem().toString());
            ps.setString(7, encriptar.ecnode(respuesta1.getText()));
            ps.setString(8, Pregunta2.getSelectedItem().toString());
            ps.setString(9, encriptar.ecnode(respuesta2.getText()));
            ps.setString(10, Pregunta3.getSelectedItem().toString());
            ps.setString(11, encriptar.ecnode(respuesta3.getText()));
            ps.setString(12, JCEspecialidad.getSelectedItem().toString());
           

            ps.execute();

            JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO EXITOSAMENTE", "REGISTRO DE USUARIO", 1);
       
    
        } catch (Exception e) {
      
           agregarusuariosinFoto();
        }
 
   
   
    }
    
    
    
    
    
      public void agregarusuariosinFoto()
    {
   Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null;
    
   
        java.sql.Date fechaU;
        Date dateU = FechaAdmin.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
        
        
        
        java.sql.Date fechaN;
        Date dateN = FechaNacimiento.getDate();
        long dN = dateN.getTime();
        fechaN = new java.sql.Date(dN);
        
       String tiempo = Menu.Time.getText() +" "+MP.jLabel102.getText();
      
   try {
           
            InputStream fotoFirma = new FileInputStream(new File(rutafoto));
            String sql = "INSERT INTO table_personal (Cedula, Nombre, Apellido,	Direccion,	Telefono,	Correo, Nacimiento, Pestado, Firma, CMA, MPPS)  VALUES (?,?,?,?,?,?,?,(SELECT IdEstado FROM table_estado WHERE Estado=?),?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Txtcedula.getText());
            ps.setString(2, TxtNombre.getText());
            ps.setString(3, TxtApellido.getText());
            ps.setString(4, TxtDireccion.getText());
            ps.setString(5, TxtMovil.getText());
            ps.setString(6, TxtCorreo.getText());
            ps.setDate(7, fechaN);
            ps.setString(8, TxtEstado.getSelectedItem().toString());
            ps.setBlob(9, fotoFirma);
            ps.setString(10, TxtCMA.getText());
            ps.setString(11, TxtMPPS.getText());
        
            ps.execute();
            
            
            
            String sql1 = "INSERT INTO table_usuario (Usuario, Clave, Nivel,  Fecha, Hora, Pregunta1,	Respuesta1,	Pregunta2,	Respuesta2,	Pregunta3,	Respuesta3, idEspecialidad	)  VALUES (?,?,(SELECT IdNivel FROM table_nivel WHERE Nivelu=?),?,?,?,?,?,?,?,?,(SELECT id_especialidad FROM table_especialidad WHERE especialidad=?))";
            con = cn.getConnection();
            ps = con.prepareStatement(sql1);

     
      
            ps.setString(1, TxtUsuario.getText());
            ps.setString(2, encriptar.ecnode(String.valueOf(TxtClave.getPassword())));
            ps.setString(3, TxtRol.getSelectedItem().toString());
            ps.setDate(4, fechaU);
            ps.setString(5, tiempo);
            ps.setString(6, Pregunta1.getSelectedItem().toString());
            ps.setString(7, encriptar.ecnode(respuesta1.getText()));
            ps.setString(8, Pregunta2.getSelectedItem().toString());
            ps.setString(9, encriptar.ecnode(respuesta2.getText()));
            ps.setString(10, Pregunta3.getSelectedItem().toString());
            ps.setString(11, encriptar.ecnode(respuesta3.getText()));
            ps.setString(12, JCEspecialidad.getSelectedItem().toString());
            

            ps.execute();

            JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO EXITOSAMENTE", "REGISTRO DE USUARIO", 1);
       
    
        } catch (Exception e) {
      
            System.out.println(e +" error en metodo agregar");
        }
 
   
   
    }
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    public  void actualizarusuario() {
         
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
   java.sql.Date fechaN;
   Date dateN = FechaNacimiento.getDate();
   long dN = dateN.getTime();
   fechaN = new java.sql.Date(dN);
   
        
        try {
            String sql = "update table_personal set Cedula=?," +
"Nombre=?," +
"Apellido=?," +
"Direccion=?," +
"Telefono=?," +
"Correo=?," +
"Nacimiento=?," +
"Firma=?," +
"Pestado=(SELECT IdEstado FROM table_estado WHERE Estado=?),"+ 
"CMA=?," +
"MPPS=?" +

"where IdPersonal=?";

           InputStream fotoFirma = new FileInputStream(new File(rutafoto));
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Txtcedula.getText());
            ps.setString(2, TxtNombre.getText());
            ps.setString(3, TxtApellido.getText());
            ps.setString(4, TxtDireccion.getText());
            ps.setString(5, TxtMovil.getText());
            ps.setString(6, TxtCorreo.getText());
            ps.setDate(7, fechaN);
            ps.setBlob(8, fotoFirma);
            ps.setString(9, TxtEstado.getSelectedItem().toString());
            ps.setString(10, TxtCMA.getText());
            ps.setString(11, TxtMPPS.getText());
         
            ps.setInt(12, Integer.parseInt(TxtID.getText()));

            int res = ps.executeUpdate();

            if (res >= 1) {
                actualizarniveles();
                JOptionPane.showMessageDialog(null, " EL USUARIO HA SIDO ACTUALIZADO ", "ACTUALIZAR", 1);
       
         
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al actualizar el usuario ....");
            }
            
            
            
              

            
            
            
            
        } catch (Exception e) {
         
           actualizarusuarioTexto();
        }
        
  

}
    
    
    
    
    
    
    
    
    
    
     public  void actualizarusuarioTexto() {
         
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
   java.sql.Date fechaN;
   Date dateN = FechaNacimiento.getDate();
   long dN = dateN.getTime();
   fechaN = new java.sql.Date(dN);
   
        
        try {
            String sql = "update table_personal set Cedula=?," +
"Nombre=?," +
"Apellido=?," +
"Direccion=?," +
"Telefono=?," +
"Correo=?," +
"Nacimiento=?," +
"Pestado=(SELECT IdEstado FROM table_estado WHERE Estado=?),"+ 
"CMA=?," +
"MPPS=?" +
"where IdPersonal=?";

      
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Txtcedula.getText());
            ps.setString(2, TxtNombre.getText());
            ps.setString(3, TxtApellido.getText());
            ps.setString(4, TxtDireccion.getText());
            ps.setString(5, TxtMovil.getText());
            ps.setString(6, TxtCorreo.getText());
            ps.setDate(7, fechaN);
            ps.setString(8, TxtEstado.getSelectedItem().toString());
            ps.setString(9, TxtCMA.getText());
            ps.setString(10, TxtMPPS.getText());
            ps.setInt(11, Integer.parseInt(TxtID.getText()));

            int res = ps.executeUpdate();

            if (res >= 1) {
                  
                actualizarniveles();
                JOptionPane.showMessageDialog(null, " EL USUARIO HA SIDO ACTUALIZADO ", "ACTUALIZAR", 1);
       
         
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al actualizar el usuario ....");
            }
        } catch (Exception e) {
           System.out.println(e);
        }
        



}
    
    
    
    
    
    
    public void actualizarniveles(){
           
        
                 
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
        try {
       String sql= "update table_usuario set Nivel=(SELECT IdNivel FROM table_nivel WHERE Nivelu=?)   WHERE IdPersonal=?";


            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, TxtRol.getSelectedItem().toString());
            ps.setInt(2, Integer.parseInt(TxtID.getText()));
            ps.executeUpdate();
            BtnModificar.setEnabled(false);
            
        } catch (Exception e) {
           System.out.println(e);
    
        
        }
        
        
        
          try {
       String sql= "update table_usuario set idEspecialidad=(SELECT id_especialidad FROM table_especialidad WHERE especialidad=?)   WHERE IdPersonal=?";


            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, JCEspecialidad.getSelectedItem().toString());
            ps.setInt(2, Integer.parseInt(TxtID.getText()));
            ps.executeUpdate();
            BtnModificar.setEnabled(false);
            
        } catch (Exception e) {
           System.out.println(e);
    
        
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      public void limpiar()
    {
    Txtcedula.setText("V-");
    TxtNombre.setText("");
    TxtApellido.setText("");
    TxtMovil.setText("");
    TxtDireccion.setText("");
    TxtCorreo.setText("");
    TxtUsuario.setText("");
    TxtClave.setText("");
    TxtClaverepeat.setText("");
    TxtRol.setSelectedItem("Administrador");
    TxtEstado.setSelectedItem("Activo");
    respuesta1.setText("");
    respuesta2.setText("");
    respuesta3.setText("");
    TxtCMA.setText("");
    TxtMPPS.setText("");
    FechaNacimiento.setCalendar(null);
    TxtUsuario.setEnabled(true);
    TxtClave.setEnabled(true);
    TxtClaverepeat.setEnabled(true);
    Pregunta1.setEnabled(true);
    Pregunta2.setEnabled(true);
    Pregunta3.setEnabled(true);
    respuesta1.setEnabled(true);
    respuesta2.setEnabled(true);
    respuesta3.setEnabled(true);
    
    BtnAgregar.setEnabled(true);
    BtnModificar.setEnabled(false);
    JCEspecialidad.setEnabled(false);
    lbfoto.setIcon(null);
    }
    
    
    
    
    
    
    
    
    public void AuditoriaAgregar(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;

             try {
            
            String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(MP.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Agrego a "+ TxtNombre.getText()+" "+TxtApellido.getText() +" como nuevo usuario" ;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.setInt(2, idusuario);
            ps.setString(3,accion);
            ps.setString(4,Fecha);

             ps.executeUpdate();

            
        } catch (Exception e) {System.out.println(e);}
       
             finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }
           
        
    }
     
    }
    
    
    
      public void AuditoriaModificar(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(MP.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Modifico el usuario de: "+ TxtNombre.getText()+" "+TxtApellido.getText() +" " ;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.setInt(2, idusuario);
            ps.setString(3,accion);
            ps.setString(4,Fecha);
   

             ps.executeUpdate();

            
        } catch (Exception e) {System.out.println(e +"1"); }
 
             
             finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
        
    }
     
    }
    
    
    
      
        public void llenarCombo() {

        
       try{
       
        
        TxtRol.removeAllItems();
        ArrayList<String> lista3 = new ArrayList<String>();
        lista3 = lc.llenarRol();
        for (int i = 0; i < lista3.size(); i++) {
            TxtRol.addItem(lista3.get(i));

        }
        
           }catch(Exception e ){JOptionPane.showMessageDialog(null,e );};
           
           
           
           
            try{
       
        
        JCEspecialidad.removeAllItems();
        ArrayList<String> lista4 = new ArrayList<String>();
        lista4 = lc.llenarEspecialidad();
        for (int i = 0; i < lista4.size(); i++) {
            JCEspecialidad.addItem(lista4.get(i));

        }
        
           }catch(Exception e ){JOptionPane.showMessageDialog(null,e );};
          }
    
      
      
      
      
      LlenarCombobox lc = new LlenarCombobox();
      
      
    
     public void validarNyL() {
       
     

      
       // va.Validarnumeros(Conversion);
     
        va.Validarnumeros(TxtMovil);
        if(TxtRol.getSelectedItem().equals("Lcdo")){
           JCEspecialidad.setEnabled(true);
           }
          else    if(TxtRol.getSelectedItem().equals("Doctor")){
           JCEspecialidad.setEnabled(true);
           }
              else   if(TxtRol.getSelectedItem().equals("Medico")){
           JCEspecialidad.setEnabled(true);
           }
           
              else{
              JCEspecialidad.setSelectedItem("Administrativo");
              JCEspecialidad.setEnabled(false);
              }
           
   

    }
  

     
     
     
     
     
     
     
     
     
     
     
     
     Temporal TM = new Temporal(); 
     int idusuario=TM.getTexto(); 
     Mprincipal MP = new Mprincipal();
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AUfoto;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BuscarUsuarios;
    public com.toedter.calendar.JDateChooser FechaAdmin;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JComboBox<String> JCEspecialidad;
    private javax.swing.JComboBox<String> Pregunta1;
    private javax.swing.JComboBox<String> Pregunta2;
    private javax.swing.JComboBox<String> Pregunta3;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCMA;
    public javax.swing.JPasswordField TxtClave;
    public javax.swing.JPasswordField TxtClaverepeat;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextArea TxtDireccion;
    private javax.swing.JComboBox<String> TxtEstado;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtMPPS;
    private javax.swing.JTextField TxtMovil;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JComboBox<String> TxtRol;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JTextField Txtcedula;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel lbfoto;
    private javax.swing.JTextField respuesta1;
    private javax.swing.JTextField respuesta2;
    private javax.swing.JTextField respuesta3;
    // End of variables declaration//GEN-END:variables
}
