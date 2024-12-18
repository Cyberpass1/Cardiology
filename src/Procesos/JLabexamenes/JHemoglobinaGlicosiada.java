/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos.JLabexamenes;

import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.JCPacientes;
import Clases.JPacientesDao;
import Clases.PdfVO;
import Clases.Validar;
import Menu.Mprincipal;
import Clases.PdfDAO1;
import Clases.Tabla_PdfVO;
import Clases.Temporal;
import Clases.sql;
import Procesos.JLaboratorio;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FCGinebraI
 */
public class JHemoglobinaGlicosiada extends javax.swing.JInternalFrame {

    /**
     * Creates new form JERutina
     */
    public JHemoglobinaGlicosiada() {
    initComponents();
    ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    informacionpdf();
    MaxIdestudios();
    this.JRMasculino.setSelected(true);
    JPregistro.setVisible(false);
    BtnAgregar.setVisible(false);
    IdPacientess.setVisible(false);
    CallReferencia();

// ConocerUsuario();
    }
     
    
    
   String  empresa, rif, ubicacion, telefonos, piepagina;
   public void informacionpdf() {

   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
   
        try {

            String sql = "select * from tableinfopdfs";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                empresa = rs.getString("nombrempresa");
                rif = rs.getString("rif");
                ubicacion = rs.getString("ubicacion");
                telefonos = rs.getString("telefonos");
                piepagina = rs.getString("infopiepagina");
               
            }

        } catch (Exception e) {System.out.println(e);
        }  
    }



 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        TXTGLICOSIADA = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TXTNODIABETICO = new javax.swing.JTextField();
        TXTCDIABETICO = new javax.swing.JTextField();
        TXTGLICOSIADA1 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        TXTSDIABETICO = new javax.swing.JTextField();
        TXTA1C1 = new javax.swing.JTextField();
        TXTHNA1C = new javax.swing.JTextField();
        TXTA1C = new javax.swing.JTextField();
        TxtFerritina3 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        JPregistro = new javax.swing.JPanel();
        TXTPnombre = new javax.swing.JTextField();
        TXTPcorreo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        JRMasculino = new javax.swing.JRadioButton();
        JRfemenino = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTPdireccion = new javax.swing.JTextArea();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel111 = new javax.swing.JLabel();
        TXTPtelefono = new javax.swing.JFormattedTextField();
        TXTPapellido = new javax.swing.JTextField();
        TXTPcedula = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        FechaAc6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        IdPacientess = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        BtnCancelar.setText("NUEVO");
        BtnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCancelar.setContentAreaFilled(false);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 120, 30));

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 400, 70));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "HEMOGLOBINA GLICOSIADA"));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTGLICOSIADA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hb. Glicosiada"));
        TXTGLICOSIADA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTGLICOSIADAKeyTyped(evt);
            }
        });
        jPanel25.add(TXTGLICOSIADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 190, 40));

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Imprimir");
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton34.setContentAreaFilled(false);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 220, 30));

        jButton20.setText("Cancelar");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 220, 30));
        jPanel25.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 590, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel25.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 490));

        TXTNODIABETICO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Referencia No diabetico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        TXTNODIABETICO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNODIABETICOKeyTyped(evt);
            }
        });
        jPanel25.add(TXTNODIABETICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 170, 40));

        TXTCDIABETICO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Referencia Diabetico C/Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        TXTCDIABETICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCDIABETICOActionPerformed(evt);
            }
        });
        TXTCDIABETICO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCDIABETICOKeyTyped(evt);
            }
        });
        jPanel25.add(TXTCDIABETICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 170, 40));

        TXTGLICOSIADA1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Referencia Hb. Glicosilada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        TXTGLICOSIADA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTGLICOSIADA1KeyTyped(evt);
            }
        });
        jPanel25.add(TXTGLICOSIADA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 170, 40));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/modificar.png"))); // NOI18N
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 110, 30));

        TXTSDIABETICO.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Referencia Diabetico S/Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        TXTSDIABETICO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTSDIABETICOKeyTyped(evt);
            }
        });
        jPanel25.add(TXTSDIABETICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, 40));

        TXTA1C1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Referencia Fracción A1C", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        TXTA1C1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTA1C1KeyTyped(evt);
            }
        });
        jPanel25.add(TXTA1C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 170, 40));

        TXTHNA1C.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fracción HbA1c"));
        TXTHNA1C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHNA1CKeyTyped(evt);
            }
        });
        jPanel25.add(TXTHNA1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 40));

        TXTA1C.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fracción A1C"));
        TXTA1C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTA1CKeyTyped(evt);
            }
        });
        jPanel25.add(TXTA1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 190, 40));

        TxtFerritina3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fracción HbA1c"));
        TxtFerritina3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFerritina3KeyTyped(evt);
            }
        });
        jPanel25.add(TxtFerritina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 190, 40));

        jPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 590, 550));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPregistro.setBackground(new java.awt.Color(255, 255, 255));
        JPregistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTPnombre.setEditable(false);
        TXTPnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre")));
        TXTPnombre.setOpaque(false);
        TXTPnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPnombreActionPerformed(evt);
            }
        });
        TXTPnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPnombreKeyTyped(evt);
            }
        });
        JPregistro.add(TXTPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 50));

        TXTPcorreo.setEditable(false);
        TXTPcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Correo"));
        TXTPcorreo.setOpaque(false);
        TXTPcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPcorreoKeyTyped(evt);
            }
        });
        JPregistro.add(TXTPcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sexo"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JRMasculino.setBackground(new java.awt.Color(255, 255, 255));
        JRMasculino.setText("Masculino");
        JRMasculino.setEnabled(false);
        JRMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRMasculinoActionPerformed(evt);
            }
        });
        jPanel5.add(JRMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        JRfemenino.setBackground(new java.awt.Color(255, 255, 255));
        JRfemenino.setText("Femenino");
        JRfemenino.setEnabled(false);
        JRfemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRfemeninoActionPerformed(evt);
            }
        });
        jPanel5.add(JRfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        JPregistro.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 50));

        TXTPdireccion.setEditable(false);
        TXTPdireccion.setColumns(20);
        TXTPdireccion.setRows(5);
        TXTPdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dirección"));
        TXTPdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPdireccionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TXTPdireccion);

        JPregistro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 350, 120));

        FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        FechaNacimiento.setToolTipText("");
        FechaNacimiento.setEnabled(false);
        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JPregistro.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 190, 30));

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel111.setText("Fecha de nacimiento");
        JPregistro.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 60));

        TXTPtelefono.setEditable(false);
        TXTPtelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefono"));
        try {
            TXTPtelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TXTPtelefono.setOpaque(false);
        JPregistro.add(TXTPtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, 50));

        TXTPapellido.setEditable(false);
        TXTPapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Apellido"));
        TXTPapellido.setOpaque(false);
        TXTPapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPapellidoKeyTyped(evt);
            }
        });
        JPregistro.add(TXTPapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 50));

        jPanel1.add(JPregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, -1));

        TXTPcedula.setText("V-");
        TXTPcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cédula"));
        TXTPcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPcedulaActionPerformed(evt);
            }
        });
        TXTPcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPcedulaKeyTyped(evt);
            }
        });
        jPanel1.add(TXTPcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 50));

        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/magnifier-1_icon-icons.com_56924.png"))); // NOI18N
        BtnSearch.setBorderPainted(false);
        BtnSearch.setContentAreaFilled(false);
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 20));

        FechaAc6.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc6.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        FechaAc6.setText("                                   P A C I E N T E ");
        jPanel1.add(FechaAc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 20));

        IdPacientess.setText("ID");
        jPanel1.add(IdPacientess, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 50));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PACIENTE", "CEDULA", "EDAD", "SEXO", "CORREO", "ESTUDIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 450));

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel9.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 540));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
           
        
           if (TXTPapellido.getText().equals("") 
                   
       
                   || TXTGLICOSIADA.getText().equals("")
        
                   || TXTGLICOSIADA1.getText().equals("")
                   || TXTCDIABETICO.getText().equals("")
                   || TXTNODIABETICO.getText().equals("")
    
                   || TXTPnombre.getText().equals("")
                   || TXTPcedula.getText().equals("") 
                   || TXTPcorreo.getText().equals("") 
                   || TXTPtelefono.getText().equals("") 
                   || TXTPdireccion.getText().equals(""))
           
           
           
           
           {
             
               
               
               
            JOptionPane.showMessageDialog(null, "ASIGNE UN PACIENTE, Y VERIFIQUE QUE TODOS LOS CAMPOS SE ENCUENTRAN COMPLETADOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);

        }
        
           
           
           
           
           
           
        else{   JOptionPane.showMessageDialog(null, "GENERANDO REPORTE...","ESTUDIO",1);  MaxIdestudios(); pdf();  guardarReporte();   cancelarexamen(); }
        
        
        
        
        
        
   
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        
                if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea cancelar los resultado?",
            "Cancelar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {
        cancelarexamen(); CallReferencia(); }
                
                else{}
                
    }//GEN-LAST:event_jButton20ActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        if(TXTPcedula.getText().equals("V-") || TXTPcedula.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "CAMPO VACIO O CÉDULA INVALIDA", "CEDULA", JOptionPane.ERROR_MESSAGE);
            TXTPcedula.setText("V-");
        }
        else
        {
            Callpacient();
         

        }
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        Connection con;
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps;
        ResultSet rs;

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Correo = TXTPcorreo.getText();
        Matcher mather = pattern.matcher(Correo);

        if (TXTPapellido.getText().equals("") || TXTPnombre.getText().equals("") || FechaNacimiento.getDate()==null
            || TXTPcedula.getText().equals("") || TXTPcorreo.getText().equals("") || TXTPtelefono.getText().equals("") || TXTPdireccion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);

        } else if (mather.find() == false) {
            JOptionPane.showMessageDialog(null, "EMAIL INVALIDO, VERIFIQUE", "EMAIL INVALIDO", JOptionPane.ERROR_MESSAGE);
            this.TXTPcorreo.requestFocus();
        }

        else {

            String sql="SELECT Idpaciente, Nombre, Apellido, Cedula, Telefono, Direccion FROM table_paciente  WHERE Cedula='"+ TXTPcedula.getText() +"'";

            try{
                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){JOptionPane.showMessageDialog(null, "EL PACIENTE YA SE ENCUENTRA", "DATO DUPLICADO",JOptionPane.ERROR_MESSAGE);}

                else{
                    AuditoriaAgregar();
                    AgregarPaciente();
                    Callpacient();
                    BtnAgregar.setEnabled(false);
                    //      TxtMotivo.setEnabled(true);

                }

            }catch(Exception e){System.out.println(e);}
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        limpiarCampos();
        DesactivarCampos();
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");
        BtnAgregar.setEnabled(true);
        BtnSearch.setEnabled(true);  
        TXTPcedula.setEnabled(true);
        BtnAgregar.setEnabled(false);
        
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void TXTPcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPcedulaActionPerformed

    private void TXTPcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPcedulaKeyTyped
   char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='V' || car=='E' || car =='J' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTPcedula.getText();
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

    }//GEN-LAST:event_TXTPcedulaKeyTyped

    private void TXTPnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPnombreActionPerformed

    private void TXTPnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPnombreKeyTyped
          va.longitud(TXTPnombre.getText(), 30, evt);
    }//GEN-LAST:event_TXTPnombreKeyTyped

    private void TXTPapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPapellidoKeyTyped
        va.longitud(TXTPapellido.getText(), 30, evt);
    }//GEN-LAST:event_TXTPapellidoKeyTyped

    private void TXTPcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPcorreoKeyTyped
         va.longitud(TXTPcorreo.getText(), 30, evt);
    }//GEN-LAST:event_TXTPcorreoKeyTyped

    private void TXTPdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPdireccionKeyTyped
         va.longitud(TXTPdireccion .getText(), 80, evt);
    }//GEN-LAST:event_TXTPdireccionKeyTyped

    private void TXTGLICOSIADAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTGLICOSIADAKeyTyped
          char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTGLICOSIADA.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==5)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=','|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_TXTGLICOSIADAKeyTyped

    private void TXTNODIABETICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNODIABETICOKeyTyped
             char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTNODIABETICO.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==7)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_TXTNODIABETICOKeyTyped

    private void TXTCDIABETICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCDIABETICOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCDIABETICOActionPerformed

    private void TXTCDIABETICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCDIABETICOKeyTyped
       char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTCDIABETICO.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==7)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=',' && car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_TXTCDIABETICOKeyTyped

    private void TXTGLICOSIADA1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTGLICOSIADA1KeyTyped
                   char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTGLICOSIADA1.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==7)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=',' && car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_TXTGLICOSIADA1KeyTyped

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    
                if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea actualizar los valores referenciales?",
            "Valores Referenciales", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {
    AuditoriaModificar();     ActualizarReferencia(); CallReferencia(); }
                
                else{CallReferencia();}      
        
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void TXTSDIABETICOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTSDIABETICOKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTSDIABETICOKeyTyped

    private void TXTA1C1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTA1C1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTA1C1KeyTyped

    private void TXTHNA1CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHNA1CKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTHNA1CKeyTyped

    private void TXTA1CKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTA1CKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTA1CKeyTyped

    private void TxtFerritina3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFerritina3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFerritina3KeyTyped

    private void JRMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRMasculinoActionPerformed
      JRMasculino.setSelected(true);
      JRfemenino.setSelected(false);
      Sexo="Masculino";
    }//GEN-LAST:event_JRMasculinoActionPerformed

    private void JRfemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRfemeninoActionPerformed
       JRfemenino.setSelected(true);
      JRMasculino.setSelected(false);
      Sexo="Femenino";
    }//GEN-LAST:event_JRfemeninoActionPerformed

    
    
    
    public static String getEdad(Date fechaNacimiento) {
    if (fechaNacimiento != null) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder result = new StringBuilder();
        if (fechaNacimiento != null) {
            result.append(sdf.format(fechaNacimiento));
            result.append(" (");
            Calendar c = new GregorianCalendar();
            c.setTime(fechaNacimiento);
            result.append(calcularEdad(c));
            result.append(" años)");
        }
        return result.toString();
    }
    return "";
}

private static int calcularEdad(Calendar fechaNac) {
    Calendar today = Calendar.getInstance();
    int diffYear = today.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
    int diffMonth = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
    int diffDay = today.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
    // Si está en ese año pero todavía no los ha cumplido
    if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
        diffYear = diffYear - 1;
    }
    return diffYear;
}
    
    
    
    
    
     public void pdf() {
      try {

                   
        /*-------------------------------------------------------------------------------------*/
            
            String fechaN = new SimpleDateFormat("yyyy/MM/dd").format(FechaNacimiento.getDate());
            String [] dateParts1= fechaN.split("/");
            String an1 = dateParts1[0];
            String mes1 = dateParts1[1];
            String dia1 = dateParts1[2];
            
            
            String an_actual = Validar.fecha_actual();
            String mes_actual = Validar.fecha_mes();
            String dia_actual = Validar.fecha_dia();
            
           /* System.out.println("Hoy es :"+dia_actual+" "+ mes_actual+" "+an_actual);*/
            
            
            
        
            
            int diferenciadia=Integer.parseInt(dia_actual)- Integer.parseInt(dia1);
            int diferenciames=Integer.parseInt(mes_actual)- Integer.parseInt(mes1);
            int diferencian=Integer.parseInt(an_actual)- Integer.parseInt(an1);;
        
      /*      
                
            System.out.println("Fecha de nacimiento :"+dia1+" "+ mes1+" "+an1);
           
            
            
          System.out.println("Dia" +dia_actual+"- " +dia1 +" ="+diferenciadia);
          System.out.println("Mes" +mes_actual+"- " +mes1 +"= "+diferenciames);  
          System.out.println("Año" +an_actual+"- " +an1 +"= "+diferencian);   
            
            
          System.out.println("Tu cumpleaños es :"+diferenciadia+" "+ diferenciames+" "+diferencian); */
            
   if (diferenciames < 0 || (diferenciames == 0 && diferenciadia < 0)) {
        diferencian = diferencian - 1;
    }
 
   
          
          
          
          
         DateTimeFormatter fth = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).ofPattern("dd-MM-yyyy--HH-mm");
         LocalDateTime fechaactual = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
          

         
            PdfNames=TXTPcedula.getText()+"_"+Maxid;
    
        
          
          
            BaseFont BF = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);    
            Font Letra = new Font(BF); 
            Paragraph saltolinea = new Paragraph();
          

            FileOutputStream archivo;
            //String rut = System.getProperty("user.home");
            File file = new File("C://Fundaginebra//Reportes//"+PdfNames+".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter writer=  PdfWriter.getInstance(doc, archivo);
            doc.open();
       
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("C:\\Fundaginebra\\src\\imagenes\\Fundacionlogo1.png");
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String Fecha = FormatoFecha.format(Menu.FechaAdmin.getDate());
            String Hora = Menu.Time.getText()+" "+Menu.jLabel102.getText();
            //fecha.add( "  Fecha: " + Fecha + "\n" +"  Hora: "+ Hora ) ;

            
            
            PdfPTable Encabezado = new PdfPTable(1);
            Encabezado.setWidthPercentage(25);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{50f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
           // String razon =  "Fundación Convenio de Ginbra I";
           // String riff =   "J-8188418-8";
           // String tlf =    "0000-000000";
           // String dir =    "Centro";
            Encabezado.addCell(header);
            doc.add(Encabezado);
          
            
            
            
            

            PdfContentByte CB = writer.getDirectContent();  
            BaseFont BF2 = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
  
            CB.beginText();
            CB.setFontAndSize(BF2, 12);
            CB.setTextMatrix(200, 800);
            CB.showText(empresa);
            CB.setFontAndSize(BF, 10);
            CB.setTextMatrix(260, 790);
            CB.showText(rif);
            CB.setFontAndSize(BF2, 10);
            CB.setTextMatrix(460, 780);
            CB.showText("FECHA: "+ Fecha);
            
            CB.setFontAndSize(BF2, 10);
            CB.setTextMatrix(460, 770);
            CB.showText("HORA: "+ Hora);
            
            CB.setFontAndSize(BF2, 8);
            CB.setTextMatrix(235, 740);
            CB.showText(ubicacion);
          
            CB.setFontAndSize(BF2, 8);
            CB.setTextMatrix(210, 730);
            CB.showText(telefonos); 
            CB.setTextMatrix(168, 725);
            CB.showText("__________________________________________________________________");
          
            CB.endText();
            

            
      
       //BODY 
       
       
       
            PdfPTable Tabla = new PdfPTable(3); 
            Tabla.setWidthPercentage(100);  
            float[] medidaCeldas = {1f, 3f, 1f };
            Tabla.setWidths(medidaCeldas);
            Tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph tcolumna1 = new Paragraph("N° DE ORDEN: "+Maxid+" ");
            tcolumna1.getFont().setStyle(Font.BOLD);
            tcolumna1.getFont().setSize(8);        
            tcolumna1.setFont(Letra);
            tcolumna1.setAlignment(Element.ALIGN_CENTER);
            Tabla.addCell(tcolumna1);
     
                
            Paragraph tcolumna2 = new Paragraph("RESULTADOS DEL ANALISIS");
            tcolumna2.getFont().setStyle(Font.BOLD);
            tcolumna2.getFont().setSize(12);        
            tcolumna2.setFont(Letra);
            tcolumna2.setAlignment(Element.ALIGN_CENTER);
            Tabla.addCell(tcolumna2);

            Paragraph tcolumna3 = new Paragraph("N° DE PACIENTE: " +IdPaciente+" ");
            tcolumna3.getFont().setStyle(Font.BOLD);
            tcolumna3.getFont().setSize(8);        
            tcolumna3.setFont(Letra);
            tcolumna3.setAlignment(Element.ALIGN_CENTER);
            Tabla.addCell(tcolumna3);
        

              
              
            PdfPTable Tabla0 = new PdfPTable(4); 
            // Tabla0.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            // Tabla0.SetBorderBottomLeftRadius(new BorderRadius(4f)); // No border is drawn
            Tabla0.setWidthPercentage(100);  
            float[] medidaCeldas0 = {3f, 2f, 1f,2f};
            Tabla0.setWidths(medidaCeldas0);
            Tabla0.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla0.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t0columna1 = new Paragraph("PACIENTE");
            t0columna1.getFont().setStyle(Font.BOLD);
            t0columna1.getFont().setSize(8);        
            t0columna1.setFont(Letra);
            t0columna1.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna1);
     
                
            Paragraph t0columna2 = new Paragraph("CÉDULA");
            t0columna2.getFont().setStyle(Font.BOLD);
            t0columna2.getFont().setSize(8);        
            t0columna2.setFont(Letra);
            t0columna2.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna2);

            Paragraph t0columna3 = new Paragraph("EDAD");
            t0columna3.getFont().setStyle(Font.BOLD);
            t0columna3.getFont().setSize(8);        
            t0columna3.setFont(Letra);
            t0columna3.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna3);
        
            Paragraph t0columna4 = new Paragraph("SEXO");
            t0columna4.getFont().setStyle(Font.BOLD);
            t0columna4.getFont().setSize(8);        
            t0columna4.setFont(Letra);
            t0columna4.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna4);
        
             String Paciente=TXTPnombre.getText()+ " "+ TXTPapellido.getText();
            
            Tabla0.addCell(new Paragraph(Paciente,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            Tabla0.addCell(new Paragraph(TXTPcedula.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            Tabla0.addCell(new Paragraph(Integer.toString(diferencian),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            Tabla0.addCell(new Paragraph(Sexo,FontFactory.getFont("Arial",8,Font.NORMAL))); 

           // Tabla0.addCell("Juan Calderón") ;  
           // Tabla0.addCell("V-27434836"); 
           // Tabla0.addCell("18"+" años"); 
           // Tabla0.addCell("Masculino");
            
            
            
            
            
                 
            PdfPTable Tabla1 = new PdfPTable(1); 
            Tabla1.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            // Tabla0.SetBorderBottomLeftRadius(new BorderRadius(4f)); // No border is drawn
            Tabla1.setWidthPercentage(100);  
            float[] medidaCeldas1 = {5f};
            Tabla1.setWidths(medidaCeldas1);
            Tabla1.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t1columna1 = new Paragraph("----- HEMOGLOBINA GLICOSIADA ---- ");
            t1columna1.getFont().setStyle(Font.BOLD);
            t1columna1.getFont().setSize(10);        
            t1columna1.setFont(Letra);
            t1columna1.setAlignment(Element.ALIGN_LEFT);
            Tabla1.addCell(t1columna1);
     
                

            
            
            
            PdfPTable Tabla2 = new PdfPTable(4); 
            Tabla2.setWidthPercentage(100);  
            Tabla2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldas2 = {4f, 2f, 2f,4f};
            Tabla2.setWidths(medidaCeldas2);
            Tabla2.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t2columna1 = new Paragraph("ANALISIS REALIZADO");
            t2columna1.getFont().setStyle(Font.BOLD);
            t2columna1.getFont().setSize(9);        
            t2columna1.setFont(Letra);
            t2columna1.setAlignment(Element.ALIGN_CENTER);
            Tabla2.addCell(t2columna1);
     
                
            Paragraph t2columna2 = new Paragraph("RESULTADOS");
            t2columna2.getFont().setStyle(Font.BOLD);
            t2columna2.getFont().setSize(9);        
            t2columna2.setFont(Letra);
            t2columna2.setAlignment(Element.ALIGN_CENTER);
            Tabla2.addCell(t2columna2);

            Paragraph t2columna3 = new Paragraph("UNIDAD");
            t2columna3.getFont().setStyle(Font.BOLD);
            t2columna3.getFont().setSize(10);        
            t2columna3.setFont(Letra);
            t2columna3.setAlignment(Element.ALIGN_CENTER);
            Tabla2.addCell(t2columna3);

            Paragraph t2columna4 = new Paragraph("REFERENCIA");
            t2columna4.getFont().setStyle(Font.BOLD);
            t2columna4.getFont().setSize(9);        
            t2columna4.setFont(Letra);
            t2columna4.setAlignment(Element.ALIGN_CENTER);
            Tabla2.addCell(t2columna4);
            
            
            
         
           
            
            
           Tabla2.addCell(new Paragraph("Fracción HbA1c",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TXTHNA1C.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("%",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("No diabético: " +TXTNODIABETICO.getText()+ "\n"+ "Diabético C/Control : " +TXTCDIABETICO.getText()+"\n Diabético S/Control: " +TXTSDIABETICO.getText()+ "\n",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
         
           Tabla2.addCell(new Paragraph("Hb. Glicosilada",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TXTGLICOSIADA.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("%",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TXTGLICOSIADA1.getText(),FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
              
           Tabla2.addCell(new Paragraph("Fracción A1C",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TXTHNA1C.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("%",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TXTA1C1.getText(),FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
           
           
           
           
           
           
            PdfPTable Tablafirma = new PdfPTable(3); 
            Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            Tablafirma.setWidthPercentage(100);  
            float[] medidaCeldasP = {3f, 1f, 3f};
            Tablafirma.setWidths(medidaCeldasP);
            Tablafirma.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tablafirma.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph tPcolumna1 = new Paragraph("\n\n\n\n  "+piepagina);
            tPcolumna1.getFont().setStyle(Font.BOLD);
            tPcolumna1.getFont().setSize(8);        
            tPcolumna1.setFont(Letra);
            tPcolumna1.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna1);

                
            com.itextpdf.text.Image FirmaLcdo = com.itextpdf.text.Image.getInstance("C:\\Fundaginebra\\dist\\imagen.bin");
            FirmaLcdo.setAlignment(Chunk.ALIGN_CENTER);
            Tablafirma.addCell(FirmaLcdo);

            Paragraph tPcolumna3 = new Paragraph("\n\n\n\n" + writer.getPageNumber()+ " Pág");
            tPcolumna3.getFont().setStyle(Font.BOLD);
            tPcolumna3.getFont().setSize(8);        
            tPcolumna3.setFont(Letra);
            tPcolumna3.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna3);
           


           knowaboutlcdo(); 
           PdfPTable TablafirmaLcdo = new PdfPTable(1); 
           TablafirmaLcdo.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
           TablafirmaLcdo.setWidthPercentage(100);  
           float[] medidaCeldasFirma = {20f};
           TablafirmaLcdo.setWidths(medidaCeldasFirma);
           TablafirmaLcdo.setHorizontalAlignment(Element.ALIGN_CENTER);
           TablafirmaLcdo.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
           Paragraph tPcolumnaFirma1 = new Paragraph("________________ \n "+"Lcdo/a "+NameOfLcdo);
           tPcolumnaFirma1.getFont().setStyle(Font.BOLD);
           tPcolumnaFirma1.getFont().setSize(8);        
           tPcolumnaFirma1.setFont(Letra);
           tPcolumnaFirma1.setAlignment(Element.ALIGN_CENTER);
           TablafirmaLcdo.addCell(tPcolumnaFirma1);
           
           
           
           
           
           
           
           
           
           
       /*                
                 
            PdfPTable Tablafirma = new PdfPTable(1); 
            //  Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
           
            Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);// Tabla0.SetBorderBottomLeftRadius(new BorderRadius(4f)); // No border is drawn
            float[] medidaCelda = {20f};
            Tabla1.setWidthPercentage(100);  
            Tabla1.setWidths(medidaCelda);
            Tabla1.setHorizontalAlignment(Element.ALIGN_LEFT);
            Tabla1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
            
            Paragraph tf1columna1 = new Paragraph("Elaborado por Lcdo/a: "+MP.JLabelNombre.getText()+"                                |    www.fundaginebra.org    |                                     "+ writer.getPageNumber()+ "| Pág");
            tf1columna1.getFont().setStyle(Font.BOLD);
            tf1columna1.getFont().setSize(7);        
            tf1columna1.setFont(Letra);
            tf1columna1.setAlignment(Element.ALIGN_LEFT);
            Tablafirma.addCell(tf1columna1);
     
           */
           
            saltolinea.add("\n");
            doc.add(saltolinea); 
            doc.add(Tabla);
            
            doc.add(Tabla0);
            doc.add(saltolinea);
           
        
            doc.add(Tabla1);
            doc.add(saltolinea);
            
            doc.add(Tabla2);
            doc.add(saltolinea);
        
            doc.add(Tablafirma);
            doc.add(TablafirmaLcdo);
         
            //FOOTER
     //   addFooter(writer);
            
            
            doc.close();
            archivo.close();
         // Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "NO SE CONSIGUE LA CARPETA FUNDAGINEBRA EN DISCO C", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
      
     
     
     String NameOfLcdo;
     
     public void knowaboutlcdo(){
     
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs; 
         
         
         try{
         
       String query="Select FirmaLcdo from tableinfo where idinfo=? ";
       
       con = EnlaceBd.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, 1);
       rs=ps.executeQuery();
         
        if(rs.next()){
       NameOfLcdo= rs.getString("FirmaLcdo");
    
         }
       
       
       
       
         }catch(Exception e){ System.out.println(e);}
     }
     
     
     
     
     
     
     
     
     
     
     
     
         private void addFooter(PdfWriter writer){
    PdfPTable footer = new PdfPTable(1);
    try {

        footer.setWidths(new int[]{100});
        footer.setTotalWidth(527);
        footer.setLockedWidth(false);
        footer.getDefaultCell().setFixedHeight(40);
        footer.getDefaultCell().setBorder(Rectangle.TOP);
        footer.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

        // add current page count
        footer.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
        footer.addCell(new Phrase(String.format("Elaborado por Lcdo/a:"+Menu.JLabelNombre.getText()+"                                      |    www.fundaginebra.org    |                                            "+ writer.getPageNumber()+ " | Pág") , new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.BLACK)));

        // write page
        PdfContentByte canvas = writer.getDirectContent();
        canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
        footer.writeSelectedRows(0, -1, 34, 50, canvas);
        canvas.endMarkedContentSequence();
    } catch(DocumentException de) {
        throw new ExceptionConverter(de);
   
    }
}
    
    /*
         
            private void addHeader(PdfWriter writer){
   
                
                
                PdfPTable footer = new PdfPTable(1);
    try {

        footer.setWidths(new int[]{100});
        footer.setTotalWidth(527);
        footer.setLockedWidth(false);
        footer.getDefaultCell().setFixedHeight(40);
        footer.getDefaultCell().setBorder(Rectangle.TOP);
        footer.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);

        // add current page count
        footer.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
        footer.addCell(new Phrase(String.format("@Fundaginebra                                              |    www.fundaginebra.org    |                                            "+ writer.getPageNumber()+ " | Pág") , new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.BLACK)));

        // write page
        PdfContentByte canvas = writer.getDirectContent();
        canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
        footer.writeSelectedRows(0, -1, 34, 50, canvas);
        canvas.endMarkedContentSequence();
    } catch(DocumentException de) {
        throw new ExceptionConverter(de);
   
    }
}
         
         
 
   
   
   
   
   */
   
   
   
         
         
     public void Callpacient() {  
       
       TXTPcedula.setEnabled(false);  
         Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
     
         String Cedula = TXTPcedula.getText();
        
        try{
   
       String query="SELECT Idpaciente from table_paciente where Cedula=? ";
       
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setString(1, Cedula);
       rs=ps.executeQuery();
      
if(TXTPcedula.getText().equals("V-") || TXTPcedula.getText().equals("") )
{
JOptionPane.showMessageDialog(null, "EL CAMPO CÉDULA NO PUEDE ESTAR VACIO Y DEBE LLEVAR V-", "CAMPO VACIO", 1);
}
       
      else if(rs.next())
       {
        

      IdPaciente= rs.getInt("Idpaciente");
      IdPacientess.setText(Integer.toString(IdPaciente));
      
      
      try{
      String sql2 = "SELECT Nombre, Apellido, Cedula, Telefono, Correo, Direccion, Sexo, date_format(FechNacimiento, '%d/%m/%Y') AS Fecha FROM table_paciente WHERE Idpaciente=? ";
      con = cn.getConnection();
      ps = con.prepareStatement(sql2);
      ps.setInt(1, IdPaciente);
      rs=ps.executeQuery();
     
       
      if(rs.next()){
     
 
      String nombre= rs.getString("Nombre");
      String apellido= rs.getString("Apellido");
      String cedula= rs.getString("Cedula");
      String telefono= rs.getString("Telefono");
      String correo= rs.getString("Correo");
      String direccion= rs.getString("Direccion");
      String sexo= rs.getString("Sexo");
      String nacimiento= rs.getString("Fecha");
     
      
      
      if(sexo.equals("Femenino") ){Sexo="Femenino"; JRfemenino.setSelected(true); JRMasculino.setSelected(false);}
      else if(sexo.equals("Masculino") ){Sexo="Masculino"; JRMasculino.setSelected(true); JRfemenino.setSelected(false);}
      TXTPnombre.setText(nombre);
      TXTPapellido.setText(apellido);
      TXTPcorreo.setText(correo);
      TXTPtelefono.setText(telefono);
      TXTPdireccion.setText(direccion);

      
      
      
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      FechaNacimiento.setDate(formato.parse(nacimiento));
JPregistro.setVisible(true);
   
      }

      
    

       }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
       
       
       }
      
      
      
      
       else{
          
          
          
          
       
          
          
          
           if (JOptionPane.showConfirmDialog(rootPane, " El paciente no se encuentra registrado ¿Desea registrarlo?",
            "Registro Paciente", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {
  
                    
                    

      
                    
                    
       ActivarCampos();
       limpiarCamposNoregistro();
       JPregistro.setVisible(true);
       BtnSearch.setEnabled(false);
         
         

         
        }   
        
        else{  BtnAgregar.setVisible(false); TXTPcedula.setEnabled(true); BtnSearch.setEnabled(true); }
    
        
       
    }                                        
         }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}
         
             
             
       
       }
       
     
     
     public void AgregarPaciente(){                                             
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    

          try {

              
                    
        java.sql.Date fechaU;
        Date dateU = FechaNacimiento.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
        
        
        
            String fecha = new SimpleDateFormat("yyyy/MM/dd").format(FechaNacimiento.getDate());
            String [] dateParts= fecha.split("/");
            String an = dateParts[0];
            String mes = dateParts[1];
            String dia = dateParts[2];
            String an_actual = Validar.fecha_actual();

            int edad;
            edad= Integer.parseInt(an_actual)-Integer.parseInt(an);
        
        
        
        
              
              
            String sql = "INSERT INTO table_paciente (Nombre, Apellido, Cedula,Telefono,Correo,Direccion, Sexo, FechNacimiento, edad) VALUES (?,?,?,?,?,?,?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
            ps.setString(1, TXTPnombre.getText());
            ps.setString(2, TXTPapellido.getText());
            ps.setString(3, TXTPcedula.getText());
            ps.setString(4, TXTPtelefono.getText());
            ps.setString(5, TXTPcorreo.getText());
            ps.setString(6, TXTPdireccion.getText());
            ps.setString(7, Sexo);
            ps.setDate(8, fechaU);
            ps.setInt(9, edad);
            ps.execute();
  
            
            
  JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO REGISTRADO","REGISTRO DE PACIENTES", 1);
        } catch (Exception e) {
      
            JOptionPane.showMessageDialog(null, e);
        }


      
          
          
    } 
     

    
    public void guardar_pdf(int codigo, int idexamen, int idpaciente, int idusuario, String Fecha, File ruta) {
        
        
   
        
        PdfDAO1 pa = new PdfDAO1();
        PdfVO po = new PdfVO();
        po.setCodigopdf(codigo);
        po.setIdexamen(idexamen);
        po.setIdpaciente(idpaciente);
        po.setIdusuario(idusuario);
        po.setFecha(Fecha);
        
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            po.setArchivopdf(pdf);
        } catch (IOException ex) {
            po.setArchivopdf(null);
            System.out.println("Error al agregar archivo pdf "+ex.getMessage());
        }
        pa.Agregar_PdfVO(po);
    }

    String PdfNames;
    
    public void guardarReporte()
    {

      
        ruta_archivo="C://Fundaginebra//Reportes//"+PdfNames+".pdf";
        int idexamen = 1028;
        int idpaciente= Integer.parseInt(IdPacientess.getText());

        String Fecha = new SimpleDateFormat("yyyy-MM-dd").format(Menu.FechaAdmin.getDate());
        sql s = new sql();
        
        int codigo = s.auto_increment("SELECT MAX(codigopdf) FROM table_laboratorio;");
        File ruta = new File(ruta_archivo);
       
        
        
        
        if ( ruta_archivo.trim().length() != 0) {
            guardar_pdf(codigo, idexamen, idpaciente, idusuario, Fecha, ruta);
 
         //   tpdf.visualizar_PdfVO(tabla);
            ruta_archivo = "";
           // activa_boton(false, false, false);
  
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
    
    }
     /*
         public void seleccionar_pdf() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(this);
        if (se == 0) {
            this.btnseleccionar.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }
*/
     
     
     
     
     
     
     
     
     
     
     
     
     
          public void ActivarCampos() {
   
                 TXTPnombre.setEditable(true);
                 TXTPapellido.setEditable(true);
                 TXTPcorreo.setEditable(true);
                 TXTPtelefono.setEditable(true);
                 TXTPdireccion.setEditable(true);
                 JRMasculino.setEnabled(true);
                 JRfemenino.setEnabled(true);
                 FechaNacimiento.setEnabled(true);
                 BtnAgregar.setEnabled(true);
                 BtnAgregar.setVisible(true);
                
                 
       
           
    }
    
                
    public void limpiarCamposNoregistro() {
      TXTPnombre.setText("");
      TXTPapellido.setText("");
      TXTPcorreo.setText("");
      TXTPtelefono.setText("");
      TXTPdireccion.setText("");
      JRMasculino.setSelected(true);
      JRfemenino.setSelected(false);
      Sexo="Masculino";
      BtnAgregar.setEnabled(true); 
      FechaNacimiento.setCalendar(null);
    }  
    
       
                   public void DesactivarCampos() {
   
                 TXTPnombre.setEditable(false);
                 TXTPapellido.setEditable(false);
                 TXTPcorreo.setEditable(false);
                 TXTPtelefono.setEditable(false);
                 TXTPdireccion.setEditable(false);
                 JRMasculino.setEnabled(false);
                 JRfemenino.setEnabled(false);
                 FechaNacimiento.setEnabled(false);
                 BtnAgregar.setEnabled(false);
               
       
           
    }
     
     
     
     
     
     

    String Sexo;
    int IdPaciente;
    
    
    public void limpiarCampos() {
      TXTPnombre.setText("");
      TXTPapellido.setText("");
      TXTPcedula.setText("V-");
      TXTPcorreo.setText("");
      TXTPtelefono.setText("");
      TXTPdireccion.setText("");
      JRMasculino.setSelected(true);
      JRfemenino.setSelected(false);
      Sexo="Masculino";
      BtnAgregar.setEnabled(true);  
      FechaNacimiento.setCalendar(null);
    }
    
    
        
        void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
        
        
   
        

   int Maxid;
             public void MaxIdestudios() {
   Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps = null;
    ResultSet rs;
    
   
       try {

            String sql = "SELECT MAX(COdigopdf) from table_laboratorio ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
            Maxid= rs.getInt("MAX(codigopdf)")+1;
        
            }
            
          
            

        } catch (Exception e) { JOptionPane.showMessageDialog(null, e);}
     
       finally {
            try {
                ps.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
     
     
     }
    
     
           public void cancelarexamen() 
        
        {
        
        
         jButton34.setEnabled(true);
         TXTGLICOSIADA.setText(""); 

        
        }
           
         
           
           
           public void ActualizarReferencia()   {
                   
                   

        Connection con=null;
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps=null;
        ResultSet rs=null;

        try {
            String sql = "update referencia_glicosiada set nodiabetico=?,diabeticocontrol=?,diabeticosincontrol=?,hbglicosiada=?,FracciónA1C=?   " ;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, TXTNODIABETICO.getText());
            ps.setString(2, TXTCDIABETICO.getText());
            ps.setString(3, TXTSDIABETICO.getText());
            ps.setString(4, TXTGLICOSIADA1.getText());
            ps.setString(5, TXTA1C1.getText());
    
       
            int res = ps.executeUpdate();

            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "LOS VALORES REFENCIALES HAN SIDO MODIFICADOS", "VALORES REFENCIALES", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Fallo al actualizar los datos....");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
           
           
                  }
           
           
           
           
 
        
          public void CallReferencia() {
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
  
        try {

            String sql = "select * from referencia_glicosiada";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String info0 = rs.getString("nodiabetico");
                String info1 = rs.getString("diabeticocontrol");
                String info2 = rs.getString("diabeticosincontrol");
                String info3 = rs.getString("hbglicosiada");
                String info4 = rs.getString("FracciónA1C");
                
                
                
         TXTNODIABETICO.setText(info0); 
         TXTCDIABETICO.setText(info1);
         TXTSDIABETICO.setText(info2);
         TXTGLICOSIADA1.setText(info3);
         TXTA1C1.setText(info4);

                
            }

        } catch (Exception e) {System.out.println(e);
        }  
    }
         
          
          
                   public void AuditoriaAgregar(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
             try {
            
            String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(Menu.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Agrego al paciente "+ TXTPnombre.getText()+" "+TXTPapellido.getText() +" " ;
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
            
            String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(Menu.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Modificó los valores referenciales de: Hemoglobina Glicosiada" ;
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
           
          
          
          
               
  DefaultTableModel modelo = new DefaultTableModel();
  

  Temporal MP = new Temporal();
  Mprincipal Menu = new Mprincipal();
  int idusuario=MP.getTexto();

  Encriptar encriptar = new Encriptar();
  JCPacientes pacientes  = new JCPacientes();
  JPacientesDao pacientesDao  = new JPacientesDao();     
  Tabla_PdfVO tpdf = new Tabla_PdfVO();   
  String ruta_archivo = "";
  String Usuario;
  Validar va = new Validar();
  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JLabel FechaAc6;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JTextField IdPacientess;
    private javax.swing.JPanel JPregistro;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JRadioButton JRfemenino;
    private javax.swing.JTextField TXTA1C;
    private javax.swing.JTextField TXTA1C1;
    private javax.swing.JTextField TXTCDIABETICO;
    private javax.swing.JTextField TXTGLICOSIADA;
    private javax.swing.JTextField TXTGLICOSIADA1;
    private javax.swing.JTextField TXTHNA1C;
    private javax.swing.JTextField TXTNODIABETICO;
    private javax.swing.JTextField TXTPapellido;
    private javax.swing.JTextField TXTPcedula;
    private javax.swing.JTextField TXTPcorreo;
    private javax.swing.JTextArea TXTPdireccion;
    private javax.swing.JTextField TXTPnombre;
    private javax.swing.JFormattedTextField TXTPtelefono;
    private javax.swing.JTextField TXTSDIABETICO;
    private javax.swing.JTextField TxtFerritina3;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
