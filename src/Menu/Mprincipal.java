package Menu;
import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.RespaldoBd;
import Clases.RestauracionBd;
import Clases.Temporal;
import Consultas.ConsultaCitas;
import Consultas.ConsultaLaboratorio;            
import Consultas.ConsultaPacientes;
import Consultas.ConsultaUsers;
import Procesos.JAsignarPaciente;
import Procesos.JConsultas;
import Procesos.JLaboratorio;
import Registros.JAuditoria;
import Registros.JEspecialidades;
import Registros.JPacientes;
import Registros.JPermisos;
import Registros.JProcedimientos;
import Registros.JSeguridad;
import Registros.JUregistro;
import com.formdev.flatlaf.FlatLightLaf;
import com.login.Login;
import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;



public class Mprincipal extends javax.swing.JFrame implements Runnable{
   
 
     
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mprincipal().setVisible(true);
            }
        });
    }

    
    

    
    
    public Mprincipal() {

        initComponents();
        this.setResizable(false);
    
// con = conexion.getConnection();  
 Calendar Fecha = new GregorianCalendar();
 FechaAdmin.setCalendar(Fecha);
 h1= new Thread(this);
 h1.start();
   
 informacion();
 String fecha = new SimpleDateFormat("dd/MM/yyyy").format(FechaAdmin.getDate());
 String fecha2 = new SimpleDateFormat("dd/MM/yyyy").format(FechaAdmin.getDate());
 String [] dateParts= fecha.split("/");
 String an = dateParts[0];
 String mes = dateParts[1];
 String dia = dateParts[2];
 fecha2 = (an+"/"+mes+"/"+dia);

 FechaAc.setText(fecha2);
 FechaAdmin.setVisible(false);
 IDUSER.setVisible(false);
 IDEspecialidad.setVisible(false);




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



    
  
public void hora()
{
    
  Calendar calendario = new GregorianCalendar();
  Date horaactual= new Date();
  calendario.setTime(horaactual);
  
  hora= calendario.get(Calendar.HOUR_OF_DAY)>9? ""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
  minutos= calendario.get(Calendar.MINUTE)>9? ""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
  segundos= calendario.get(Calendar.SECOND)>9? ""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);

}

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JMenu = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        FechaAc = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        FechaAc1 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        BtnMensaje = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        FechaAdmin = new com.toedter.calendar.JDateChooser();
        TxtUser = new javax.swing.JTextField();
        TxtRol = new javax.swing.JTextField();
        Txtentrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtinfo = new javax.swing.JTextArea();
        IDUSER = new javax.swing.JTextField();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        JLabelNombre = new javax.swing.JTextField();
        TxtRol1 = new javax.swing.JTextField();
        IDEspecialidad = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JDesktopMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenuRegistros = new javax.swing.JMenu();
        JMuser = new javax.swing.JMenuItem();
        JMenuCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuConfiguracion = new javax.swing.JMenu();
        JMPermisologia = new javax.swing.JMenuItem();
        jMenuSeguridad = new javax.swing.JMenu();
        jMenuPassword = new javax.swing.JMenuItem();
        jMenuServicios = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuRestauracion = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Aboutme = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú - CYBERIA");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 695));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JMenu.setEnabled(false);
        JMenu.setMinimumSize(new java.awt.Dimension(1300, 695));
        JMenu.setPreferredSize(new java.awt.Dimension(1300, 695));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaperbetter.com_3840x2160.jpg"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAc.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        FechaAc.setForeground(new java.awt.Color(255, 255, 255));
        FechaAc.setText("Fecha");
        panelImage2.add(FechaAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, 50));

        Time.setBackground(new java.awt.Color(0, 0, 0));
        Time.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        Time.setText("Hora");
        panelImage2.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, 50));

        FechaAc1.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc1.setFont(new java.awt.Font("Arial Narrow", 1, 70)); // NOI18N
        FechaAc1.setForeground(new java.awt.Color(255, 255, 255));
        FechaAc1.setText("¡BIENVENIDO!");
        panelImage2.add(FechaAc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, -1));

        jLabel102.setBackground(new java.awt.Color(0, 0, 0));
        jLabel102.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("AM");
        panelImage2.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 60, 60));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setBackground(new java.awt.Color(0, 0, 0));
        jLabel95.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel95.setText("Buenos dias");
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 50));

        jLabel98.setBackground(new java.awt.Color(0, 0, 0));
        jLabel98.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel98.setText("Ultima Entrada:");
        jPanel7.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 50));

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel104.setText("Rol");
        jPanel7.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 50));

        BtnMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/modificar.png"))); // NOI18N
        BtnMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnMensaje.setBorderPainted(false);
        BtnMensaje.setContentAreaFilled(false);
        BtnMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnMensaje.setEnabled(false);
        BtnMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMensajeActionPerformed(evt);
            }
        });
        jPanel7.add(BtnMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 120, 40));

        jPanel6.setBackground(new java.awt.Color(51, 0, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel107.setBackground(new java.awt.Color(0, 0, 0));
        jLabel107.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("D A T O S    D E    U S U A R I O");
        jPanel6.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, 210, 50));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel106.setBackground(new java.awt.Color(0, 0, 0));
        jLabel106.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel106.setText("Usuario:");
        jPanel7.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 50));

        FechaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        FechaAdmin.setToolTipText("");
        FechaAdmin.setEnabled(false);
        FechaAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel7.add(FechaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 110, 30));

        TxtUser.setEditable(false);
        TxtUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtUserCaretUpdate(evt);
            }
        });
        jPanel7.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 230, 30));

        TxtRol.setEditable(false);
        TxtRol.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtRolCaretUpdate(evt);
            }
        });
        jPanel7.add(TxtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, 30));

        Txtentrada.setEditable(false);
        jPanel7.add(Txtentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 230, 30));

        Txtinfo.setEditable(false);
        Txtinfo.setColumns(20);
        Txtinfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Txtinfo.setRows(5);
        Txtinfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensaje Administrativo"));
        jScrollPane1.setViewportView(Txtinfo);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 390, 140));

        IDUSER.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                IDUSERCaretUpdate(evt);
            }
        });
        jPanel7.add(IDUSER, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 60, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Corazon200x124.png"))); // NOI18N
        panelImage1.setInheritsPopupMenu(true);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel7.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 180, 120));

        JLabelNombre.setEditable(false);
        JLabelNombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                JLabelNombreCaretUpdate(evt);
            }
        });
        jPanel7.add(JLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 230, 30));

        TxtRol1.setEditable(false);
        TxtRol1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TxtRol1CaretUpdate(evt);
            }
        });
        jPanel7.add(TxtRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, 30));

        IDEspecialidad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                IDEspecialidadCaretUpdate(evt);
            }
        });
        jPanel7.add(IDEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 60, -1));

        panelImage2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 410, 560));

        jPanel3.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 660));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1310, 40));

        JMenu.addTab("", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JDesktopMenu.setMinimumSize(new java.awt.Dimension(1300, 695));

        javax.swing.GroupLayout JDesktopMenuLayout = new javax.swing.GroupLayout(JDesktopMenu);
        JDesktopMenu.setLayout(JDesktopMenuLayout);
        JDesktopMenuLayout.setHorizontalGroup(
            JDesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        JDesktopMenuLayout.setVerticalGroup(
            JDesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        jPanel4.add(JDesktopMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 690));

        JMenu.addTab("", jPanel4);

        jPanel1.add(JMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1300, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1300, 690));

        jMenu11.setBackground(new java.awt.Color(255, 255, 255));
        jMenu11.setText("|  INICIO   |");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu11ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu11);

        jMenuRegistros.setText("  REGISTROS  |");

        JMuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mujer.png"))); // NOI18N
        JMuser.setText("Usuarios");
        JMuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMuserActionPerformed(evt);
            }
        });
        jMenuRegistros.add(JMuser);

        JMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paciente.png"))); // NOI18N
        JMenuCliente.setText("Pacientes");
        JMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuClienteActionPerformed(evt);
            }
        });
        jMenuRegistros.add(JMenuCliente);

        jMenuBar1.add(jMenuRegistros);

        jMenu3.setText("PROCESOS  | ");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/discusion.png"))); // NOI18N
        jMenuItem7.setText("Consultas Medicas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("CONSULTAS & REPORTES  | ");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/doctor.png"))); // NOI18N
        jMenuItem9.setText("Consultas Médicas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paciente.png"))); // NOI18N
        jMenuItem13.setText("Pacientes");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trabajo-en-equipo.png"))); // NOI18N
        jMenuItem5.setText("Personal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenuConfiguracion.setText("CONFIGURACIÓN  |");
        jMenuConfiguracion.setEnabled(false);

        JMPermisologia.setText("Permisologia");
        JMPermisologia.setEnabled(false);
        JMPermisologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMPermisologiaActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(JMPermisologia);

        jMenuBar1.add(jMenuConfiguracion);

        jMenuSeguridad.setText("SEGURIDAD  |");

        jMenuPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bloquear.png"))); // NOI18N
        jMenuPassword.setText("Cambio contraseña");
        jMenuPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPasswordActionPerformed(evt);
            }
        });
        jMenuSeguridad.add(jMenuPassword);

        jMenuBar1.add(jMenuSeguridad);

        jMenuServicios.setText("SERVICIOS  |");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/respaldo.png"))); // NOI18N
        jMenuItem4.setText("Respaldo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuServicios.add(jMenuItem4);

        jMenuRestauracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/copia-de-respaldo.png"))); // NOI18N
        jMenuRestauracion.setText("Restauración");
        jMenuRestauracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRestauracionActionPerformed(evt);
            }
        });
        jMenuServicios.add(jMenuRestauracion);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/auditoria.png"))); // NOI18N
        jMenuItem6.setText("Auditoria");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuServicios.add(jMenuItem6);

        jMenuBar1.add(jMenuServicios);

        jMenu8.setText("HERRAMIENTAS  |");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calculadora.png"))); // NOI18N
        jMenuItem8.setText("Calculadora");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("AYUDA  |");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/informacion.png"))); // NOI18N
        jMenuItem1.setText("Manual de usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        Aboutme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/informacion (1).png"))); // NOI18N
        Aboutme.setText("Acerda de...");
        Aboutme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutmeActionPerformed(evt);
            }
        });
        jMenu9.add(Aboutme);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("CERRAR SESIÓN  |");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flecha.png"))); // NOI18N
        jMenuItem2.setText("Cerrar sesión");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/boton.png"))); // NOI18N
        jMenuItem3.setText("Cerrar sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        Connection con;
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps;
        ResultSet rs;
        java.sql.Date fechaU;
        Date dateU = FechaAdmin.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente cerrar la sesión?",
            "Cerrar Sesión", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

        try {
            String sql = "update table_usuario set Fecha=? ,Hora=? where IdPersonal=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setDate(1, fechaU);
            ps.setString(2, Time.getText() +" "+jLabel102.getText());
            ps.setInt(3, Integer.parseInt(IDUSER.getText()));
            ps.executeUpdate();

      
        } catch (Exception e) { System.out.println(e);
        }

        Login me = new Login();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
        dispose();
        } 

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    
    
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
 
   Connection con;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps;
   ResultSet rs;
   java.sql.Date fechaU;
   Date dateU = FechaAdmin.getDate();
   long dU = dateU.getTime(); 
   fechaU = new java.sql.Date(dU);

        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
            "Cerrar Sesión", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

        try {
            String sql = "update table_usuario set Fecha=? ,Hora=? where IdPersonal=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setDate(1, fechaU);
            ps.setString(2, Time.getText() +" "+jLabel102.getText());
            ps.setInt(3, Integer.parseInt(IDUSER.getText()));
            ps.executeUpdate();


      
        } catch (Exception e) { System.out.println(e);
        }

 System.exit(0);
        } else {}
        

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    
    
    
    
    
    
    
    
    private void JMuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMuserActionPerformed
       JMenu.setSelectedIndex(1);


        JUregistro Ir = new JUregistro();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
        //String restringir= Dnombre.getText(); 
        //Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_JMuserActionPerformed

    private void JMPermisologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMPermisologiaActionPerformed
         JMenu.setSelectedIndex(1);


        JPermisos Ir = new JPermisos();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
      //  String restringir= Dnombre.getText(); 
       // Ir.Text.setText(restringir); 
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_JMPermisologiaActionPerformed

    private void JMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuClienteActionPerformed
        JMenu.setSelectedIndex(1);
        JPacientes Ir = new JPacientes();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
      //  String restringir= Dnombre.getText(); 
       // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_JMenuClienteActionPerformed

    private void jMenuPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPasswordActionPerformed
        JMenu.setSelectedIndex(1);
        JSeguridad Ir = new  JSeguridad();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
       // String restringir= Dnombre.getText(); 
       // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_jMenuPasswordActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JMenu.setSelectedIndex(1);


        JAuditoria Ir = new JAuditoria();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
      //  String restringir= Dnombre.getText(); 
       // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu11ActionPerformed
      JMenu.setSelectedIndex(0);
    }//GEN-LAST:event_jMenu11ActionPerformed

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
          JMenu.setSelectedIndex(0);
    }//GEN-LAST:event_jMenu11MouseClicked

    private void AboutmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutmeActionPerformed
        AboutMe me = new  AboutMe();
        me.setLocationRelativeTo(null);
        me.setVisible(true);
    
     
        
    }//GEN-LAST:event_AboutmeActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       try
        {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
        }
        //EXCEPCION
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        
        
     
        
        try {
     
            File path = new File ("C:\\Cyberia\\src\\Manual_Cyberia.pdf");
            Desktop.getDesktop().open(path);
            
}catch (IOException ex) {
     ex.printStackTrace();
}
        
        
        
        
        
        
  
        /*
        
        
        try
        {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("C:\\Program Files (x86)\\Adobe\\Reader 9.0\\Reader\\AcroRd32.exe C:\\Fundaginebra\\src\\Manual_Laboratorio.pdf");            
      
        }
     
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
                ex.printStackTrace();
        }

*/
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         if (JOptionPane.showConfirmDialog(rootPane, "Esta apunto de hacer un respaldo de la BD ¿Desea realizarlo?",
            "Respaldo de BD", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {


        try {
            instanciaRespaldo.crearBackup();
            JOptionPane.showMessageDialog(null,"RESPALDO COMPLETADO CON EXITO", "RESPALDO", 1);
            AuditoriaRespaldo();
        } catch (IOException error) {
            System.out.println(error);
           JOptionPane.showMessageDialog(null,"ERROR EN LA CREACIÓN DEL RESPALDO - EL RESPALDO SOLO PUEDE SER HECHO DESDE EL SERVIDOR", "RESPALDO", JOptionPane.ERROR_MESSAGE);
        }
        
        
        

        
       }
       else{JOptionPane.showMessageDialog(null, "CREACIÓN DE RESPALDO CANCELADA","RESPALDO BD",1);}
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    
    
    
    
    
    
    private void jMenuRestauracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRestauracionActionPerformed

        
      if (JOptionPane.showConfirmDialog(rootPane, "Es recomendable consultar con el desarrollador del software antes de realizar una restauración, ¿Desea realizarla?",
            "Respaldo de BD", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  { 
        
        
        
        
        
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
   
   
   String query="SELECT IdPersonal, Usuario,  Clave, Nivel, date_format(Fecha, '%d/%m/%Y') AS myDate, Hora FROM table_usuario u\n" +
"INNER JOIN table_nivel n ON u.Nivel=n.Idnivel\n" +
"where Clave=?";
        
       
JPasswordField contraseña = new JPasswordField();
if(JOptionPane.showConfirmDialog(null, contraseña, "CONFIRMAR CONTRASEÑA", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
    String pass = new String(contraseña.getPassword());


String clave = encriptar.ecnode(pass);
   
try {        
       
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setString(1, clave);
       rs=ps.executeQuery();
       
 
    
       
       if(rs.next())
       {
            
            
            
        instanciaRestauracion.crearRestauracion();
        AuditoriaRestauracion();
        // ConsultaRestauracion();
       
       
       }else{JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA", "RESTAURACIÓN", JOptionPane.ERROR_MESSAGE);}
        
        
        
        } catch (Exception e) {
            System.out.println(e);
           JOptionPane.showMessageDialog(null,"ERROR EN LA RESTAURACIÓN - LA RESTAURACIÓN SOLO PUEDE SER HECHA DESDE EL SERVIDOR", "RESTAURACIÓN", JOptionPane.ERROR_MESSAGE);
       }



         finally
    {
    
    try{ps.close();
        rs.close();
        con.close();
    }catch(Exception e){System.out.println(e);}    
    } }

else{
 JOptionPane.showMessageDialog(null,"RESTAURACIÓN CANCELADA", "RESTAURACIÓN", 1);
}
}           
  
    }//GEN-LAST:event_jMenuRestauracionActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        JMenu.setSelectedIndex(1);
        ConsultaPacientes Ir = new ConsultaPacientes();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
        // String restringir= Dnombre.getText(); 
        // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      JMenu.setSelectedIndex(1);
        ConsultaUsers Ir = new ConsultaUsers();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
        // String restringir= Dnombre.getText(); 
        // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
    
    
    
    
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JMenu.setSelectedIndex(1);
        JConsultas Ir = new JConsultas();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
        // String restringir= Dnombre.getText();
        // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JMenu.setSelectedIndex(1);
        ConsultaCitas Ir = new ConsultaCitas();
        JDesktopMenu.setVisible(true);
        JDesktopMenu.add(Ir);
        // String restringir= Dnombre.getText(); 
        // Ir.Text.setText(restringir);
        Ir.setClosable(true);
        Ir.setIconifiable(true);
        try {
            Ir.setMaximum(true);
        } catch (Exception e) {
        }
        Ir.toFront();
        Ir.setVisible(true);
        this.setLocationRelativeTo(null); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void IDEspecialidadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_IDEspecialidadCaretUpdate
        Temporal tm = new Temporal();
        tm.setIdEspecialidad(Integer.parseInt(IDEspecialidad.getText().trim()));

    }//GEN-LAST:event_IDEspecialidadCaretUpdate

    private void TxtRol1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtRol1CaretUpdate
        Temporal tm = new Temporal();
        tm.setEspecialidad((TxtRol1.getText().trim()));
    }//GEN-LAST:event_TxtRol1CaretUpdate

    private void JLabelNombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_JLabelNombreCaretUpdate
        Temporal tm = new Temporal();
        tm.setNombre((JLabelNombre.getText().trim()));
    }//GEN-LAST:event_JLabelNombreCaretUpdate

    private void IDUSERCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_IDUSERCaretUpdate
        Temporal tm = new Temporal();
        tm.setTexto(Integer.parseInt(IDUSER.getText().trim()));
    }//GEN-LAST:event_IDUSERCaretUpdate

    private void TxtRolCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtRolCaretUpdate
        Temporal tm = new Temporal();
        tm.setNivel((TxtRol.getText().trim()));
    }//GEN-LAST:event_TxtRolCaretUpdate

    private void TxtUserCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TxtUserCaretUpdate
        Temporal tm = new Temporal();
        tm.setUser((TxtUser.getText().trim()));
    }//GEN-LAST:event_TxtUserCaretUpdate

    private void BtnMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMensajeActionPerformed
        Connection con=null;
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps=null;
        ResultSet rs=null;

        try {
            String sql = "update tableinfo set mensaje=? " ;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Txtinfo.getText());
            int res = ps.executeUpdate();

            if (res >= 1) {
                JOptionPane.showMessageDialog(null, " Mensaje Actualizado ", "Mensaje", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al actualizar los datos....");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_BtnMensajeActionPerformed

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        JMenu.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel95MouseClicked
 
        

    
    
   
   public void informacion() {

   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
   
        try {

            String sql = "select * from tableinfo";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String info = rs.getString("mensaje");
                Txtinfo.setText(info);
            }

        } catch (Exception e) {System.out.println(e);
        }  
    }
         
    

   
   
 
   
   
    public void AuditoriaRespaldo(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;

             try {
            
            String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Realizó un respaldo de la base de datos";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(IDUSER.getText()));
            ps.setInt(2, Integer.parseInt(IDUSER.getText()));
            ps.setString(3,accion);
            ps.setString(4,Fecha);

             ps.executeUpdate();

            
        } catch (Exception e) {System.out.println(e);}
       
             finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }
           
        
    } }
    
    
    
    public void AuditoriaRestauracion(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;

             try {
            
            String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Realizó una restauración de la base de datos";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(IDUSER.getText()));
            ps.setInt(2, Integer.parseInt(IDUSER.getText()));
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

    
    
       
    public void ejecutar_archivoPDF() throws SQLException {
 
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
          
        try {
            ps = cn.getConnection().prepareStatement("SELECT Firma FROM table_personal WHERE IdPersonal = ?;");
            ps.setInt(1, Integer.parseInt(IDUSER.getText()));
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("imagen.bin");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    

    

  Encriptar encriptar = new Encriptar();  
  public int  usuario;
  String hora, minutos, segundos, ampm;
  Thread h1;
  public String UserNombre;
  public int IdUsuario;
  RespaldoBd  instanciaRespaldo = RespaldoBd.getInstance(); 
  RestauracionBd instanciaRestauracion = RestauracionBd.getInstance(); 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aboutme;
    public javax.swing.JButton BtnMensaje;
    public javax.swing.JLabel FechaAc;
    private javax.swing.JLabel FechaAc1;
    public com.toedter.calendar.JDateChooser FechaAdmin;
    public javax.swing.JTextField IDEspecialidad;
    public javax.swing.JTextField IDUSER;
    public javax.swing.JDesktopPane JDesktopMenu;
    public javax.swing.JTextField JLabelNombre;
    private javax.swing.JMenuItem JMPermisologia;
    public javax.swing.JTabbedPane JMenu;
    private javax.swing.JMenuItem JMenuCliente;
    public javax.swing.JMenuItem JMuser;
    public javax.swing.JLabel Time;
    public javax.swing.JTextField TxtRol;
    public javax.swing.JTextField TxtRol1;
    public javax.swing.JTextField TxtUser;
    public javax.swing.JTextField Txtentrada;
    public javax.swing.JTextArea Txtinfo;
    public javax.swing.JLabel jLabel102;
    public javax.swing.JLabel jLabel104;
    public javax.swing.JLabel jLabel106;
    public javax.swing.JLabel jLabel107;
    public javax.swing.JLabel jLabel95;
    public javax.swing.JLabel jLabel98;
    public javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu4;
    public javax.swing.JMenu jMenu8;
    public javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public javax.swing.JMenuItem jMenuItem4;
    public javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    public javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuPassword;
    public javax.swing.JMenu jMenuRegistros;
    public javax.swing.JMenuItem jMenuRestauracion;
    public javax.swing.JMenu jMenuSeguridad;
    public javax.swing.JMenu jMenuServicios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
               Thread current = Thread.currentThread();


while(current==h1)
{
hora();
Time.setText(hora + ":"+ minutos+":"+segundos);

int hour = (Integer.parseInt(hora));

if(hour<12){jLabel95.setText("Buenos dias");   jLabel102.setText("AM");}

else if(hour>=12 && hour <19){jLabel95.setText("Buenas tardes");  jLabel102.setText("PM");}

else if(hour>20){jLabel95.setText("Buenas noches"); jLabel102.setText("PM");}


try
{
Thread.sleep(1000);
}

catch(Exception e){}

}
    }
}
