
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
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
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
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Calderon
 */
public class JFemenino extends javax.swing.JInternalFrame {

 
    public JFemenino() {
    initComponents();
    ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    informacionpdf();
    MaxIdestudios();
    this.JRMasculino.setSelected(true);
    JPregistro.setVisible(false);
    BtnAgregar.setVisible(false);
    IdPacientess.setVisible(false);
    CallReferencia();


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
        TxtFSH = new javax.swing.JTextField();
        TxtLH = new javax.swing.JTextField();
        Txtestradiol = new javax.swing.JTextField();
        Txtprogestosterona = new javax.swing.JTextField();
        TxtProlactina = new javax.swing.JTextField();
        TxtEstrogenos = new javax.swing.JTextField();
        jButton34 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        R1 = new javax.swing.JTextField();
        R2 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        FechaAc6 = new javax.swing.JLabel();
        R3 = new javax.swing.JTextField();
        R15 = new javax.swing.JTextField();
        R9 = new javax.swing.JTextField();
        R10 = new javax.swing.JTextField();
        R11 = new javax.swing.JTextField();
        R23 = new javax.swing.JTextField();
        R14 = new javax.swing.JTextField();
        R17 = new javax.swing.JTextField();
        R18 = new javax.swing.JTextField();
        R19 = new javax.swing.JTextField();
        R24 = new javax.swing.JTextField();
        R22 = new javax.swing.JTextField();
        R5 = new javax.swing.JTextField();
        R6 = new javax.swing.JTextField();
        R7 = new javax.swing.JTextField();
        R8 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        R12 = new javax.swing.JTextField();
        R13 = new javax.swing.JTextField();
        R4 = new javax.swing.JTextField();
        R21 = new javax.swing.JTextField();
        R16 = new javax.swing.JTextField();
        R20 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
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
        jSeparator5 = new javax.swing.JSeparator();
        IdPacientess = new javax.swing.JTextField();
        FechaAc7 = new javax.swing.JLabel();
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
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        BtnCancelar.setText("NUEVO");
        BtnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCancelar.setContentAreaFilled(false);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 120, 30));

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 400, 70));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PERFIL FEMENINO"));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtFSH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FSH"));
        TxtFSH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFSHKeyTyped(evt);
            }
        });
        jPanel25.add(TxtFSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 40));

        TxtLH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "LH"));
        TxtLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLHActionPerformed(evt);
            }
        });
        TxtLH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtLHKeyTyped(evt);
            }
        });
        jPanel25.add(TxtLH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 40));

        Txtestradiol.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estradiol"));
        Txtestradiol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtestradiolKeyTyped(evt);
            }
        });
        jPanel25.add(Txtestradiol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 170, 40));

        Txtprogestosterona.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Progestosterona"));
        Txtprogestosterona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtprogestosteronaKeyTyped(evt);
            }
        });
        jPanel25.add(Txtprogestosterona, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 170, 40));

        TxtProlactina.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prolactina"));
        TxtProlactina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtProlactinaKeyTyped(evt);
            }
        });
        jPanel25.add(TxtProlactina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 40));

        TxtEstrogenos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estrogenos Totales"));
        TxtEstrogenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEstrogenosKeyTyped(evt);
            }
        });
        jPanel25.add(TxtEstrogenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Imprimir");
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton34.setContentAreaFilled(false);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 220, 30));

        jButton20.setText("Cancelar");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 220, 30));
        jPanel25.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 590, 20));
        jPanel25.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 600, 10));

        R1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Folicular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R1KeyTyped(evt);
            }
        });
        jPanel25.add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 90, 40));

        R2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Lutea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });
        R2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R2KeyTyped(evt);
            }
        });
        jPanel25.add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, 40));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/modificar.png"))); // NOI18N
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 110, 30));

        FechaAc6.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc6.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        FechaAc6.setText("REFERENCIAS");
        jPanel25.add(FechaAc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, 20));

        R3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mitad de Ciclo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });
        R3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R3KeyTyped(evt);
            }
        });
        jPanel25.add(R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 90, 40));

        R15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Postmenopausia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R15ActionPerformed(evt);
            }
        });
        R15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R15KeyTyped(evt);
            }
        });
        jPanel25.add(R15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 90, 40));

        R9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "1 - 10 Dias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R9KeyTyped(evt);
            }
        });
        jPanel25.add(R9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, 40));

        R10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "11 - 20 Dias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R10ActionPerformed(evt);
            }
        });
        R10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R10KeyTyped(evt);
            }
        });
        jPanel25.add(R10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 90, 40));

        R11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "21 - 30 Dias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R11ActionPerformed(evt);
            }
        });
        R11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R11KeyTyped(evt);
            }
        });
        jPanel25.add(R11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 90, 40));

        R23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Embarazo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R23KeyTyped(evt);
            }
        });
        jPanel25.add(R23, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 90, 40));

        R14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mitad de fase lutea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R14ActionPerformed(evt);
            }
        });
        R14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R14KeyTyped(evt);
            }
        });
        jPanel25.add(R14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 100, 40));

        R17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ovulacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R17ActionPerformed(evt);
            }
        });
        R17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R17KeyTyped(evt);
            }
        });
        jPanel25.add(R17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 80, 40));

        R18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tardia Folicular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R18ActionPerformed(evt);
            }
        });
        R18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R18KeyTyped(evt);
            }
        });
        jPanel25.add(R18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 90, 40));

        R19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Lutea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R19KeyTyped(evt);
            }
        });
        jPanel25.add(R19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 80, 40));

        R24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Postmenopausia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R24KeyTyped(evt);
            }
        });
        jPanel25.add(R24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 120, 40));

        R22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "No Embarazo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R22KeyTyped(evt);
            }
        });
        jPanel25.add(R22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 90, 40));

        R5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Folicular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R5KeyTyped(evt);
            }
        });
        jPanel25.add(R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 90, 40));

        R6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Lutea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6ActionPerformed(evt);
            }
        });
        R6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R6KeyTyped(evt);
            }
        });
        jPanel25.add(R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 40));

        R7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mitad de Ciclo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7ActionPerformed(evt);
            }
        });
        R7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R7KeyTyped(evt);
            }
        });
        jPanel25.add(R7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 40));

        R8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Postmenopausia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8ActionPerformed(evt);
            }
        });
        R8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R8KeyTyped(evt);
            }
        });
        jPanel25.add(R8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 90, 40));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel25.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 10, 500));
        jPanel25.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 600, 10));
        jPanel25.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 600, 10));

        R12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Folicular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R12KeyTyped(evt);
            }
        });
        jPanel25.add(R12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, 40));

        R13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Lutea", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R13ActionPerformed(evt);
            }
        });
        R13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R13KeyTyped(evt);
            }
        });
        jPanel25.add(R13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 90, 40));

        R4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Postmenopausia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4ActionPerformed(evt);
            }
        });
        R4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R4KeyTyped(evt);
            }
        });
        jPanel25.add(R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 90, 40));

        R21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pubertad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R21KeyTyped(evt);
            }
        });
        jPanel25.add(R21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 80, 40));

        R16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fase Postmenopausica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R16KeyTyped(evt);
            }
        });
        jPanel25.add(R16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 120, 40));

        R20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Embarazo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 9))); // NOI18N
        R20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                R20KeyTyped(evt);
            }
        });
        jPanel25.add(R20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 120, 40));
        jPanel25.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 600, 10));
        jPanel25.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 600, 10));

        jPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 600, 560));

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
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 20));

        IdPacientess.setText("ID");
        jPanel1.add(IdPacientess, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 50));

        FechaAc7.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc7.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        FechaAc7.setText("                                   P A C I E N T E ");
        jPanel1.add(FechaAc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 20));

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

    private void TxtLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLHActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
       
        
           if (TXTPapellido.getText().equals("") 
                   
                   || TxtEstrogenos.getText().equals("")
                   || Txtprogestosterona.getText().equals("")
                   || Txtestradiol.getText().equals("")
                   || TxtProlactina.getText().equals("")
                 
                   || TxtLH.getText().equals("")
                   || TxtFSH.getText().equals("")

                  
                   || R1.getText().equals("")
                   || R2.getText().equals("")
                   || R3.getText().equals("")
                   || R4.getText().equals("")
                   || R5.getText().equals("")
                   || R6.getText().equals("")
                   || R7.getText().equals("")
                   || R8.getText().equals("")
                   || R9.getText().equals("")
                   || R10.getText().equals("")
                 //  || R11.getText().equals("")
                   || R12.getText().equals("")  
                   || R13.getText().equals("")
                   || R14.getText().equals("")
                   || R15.getText().equals("")
                   || R16.getText().equals("")
                   || R17.getText().equals("")
                   || R18.getText().equals("")
                   || R19.getText().equals("")
                   || R20.getText().equals("")
                   || R21.getText().equals("")
                   || R22.getText().equals("")
                   || R23.getText().equals("")
                   

                   || TXTPnombre.getText().equals("")
                   || TXTPcedula.getText().equals("") 
                   || TXTPcorreo.getText().equals("") 
                   || TXTPtelefono.getText().equals("") 
                   || TXTPdireccion.getText().equals(""))
           
           
           
           
           {
             
               
               
               
            JOptionPane.showMessageDialog(null, "ASIGNE UN PACIENTE, Y VERIFIQUE QUE TODOS LOS CAMPOS SE ENCUENTRAN COMPLETADOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);

        }
        
           
           
           
           
           
           
        else{   JOptionPane.showMessageDialog(null, "GENERANDO REPORTE...","ESTUDIO",1);  MaxIdestudios();  pdf();  guardarReporte();   cancelarexamen(); }
        
        
        
        
        
        
   
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

    private void TxtEstrogenosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEstrogenosKeyTyped
  char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TxtEstrogenos.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==3)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=','|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }       
    }//GEN-LAST:event_TxtEstrogenosKeyTyped

    private void TxtprogestosteronaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtprogestosteronaKeyTyped
          char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = Txtprogestosterona.getText();
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
    }//GEN-LAST:event_TxtprogestosteronaKeyTyped

    private void TxtestradiolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtestradiolKeyTyped
      char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-'|| car=='<' || car=='>'|| car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = Txtestradiol.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-' && car!='<'&& car!='>'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_TxtestradiolKeyTyped

    private void TxtProlactinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProlactinaKeyTyped
          char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TxtProlactina.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==7)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=','|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_TxtProlactinaKeyTyped

    private void TxtLHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLHKeyTyped
          char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TxtLH.getText();
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
    }//GEN-LAST:event_TxtLHKeyTyped

    private void TxtFSHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFSHKeyTyped
          char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TxtFSH.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==8)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=','|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_TxtFSHKeyTyped

    private void R1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R1KeyTyped
             char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R1.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_R1KeyTyped

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2ActionPerformed

    private void R2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R2KeyTyped
       char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R2.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
        else if((car!='.' && car!=',' && car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_R2KeyTyped

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    
                if (JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea actualizar los valores referenciales?",
            "Valores Referenciales", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {
       AuditoriaModificar(); ActualizarReferencia(); CallReferencia(); }
                
                else{CallReferencia();}      
        
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3ActionPerformed

    private void R3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R3KeyTyped
              char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R3.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R3KeyTyped

    private void R15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R15KeyTyped
               char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R15.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_R15KeyTyped

    private void R9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R9KeyTyped
           char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R9.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R9KeyTyped

    private void R10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R10ActionPerformed

    private void R10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R10KeyTyped
             char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R9.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R10KeyTyped

    private void R11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R11ActionPerformed

    private void R11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R11KeyTyped
            char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R11.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R11KeyTyped

    private void R23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R23KeyTyped
                       char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R23.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R23KeyTyped

    private void R14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R14ActionPerformed

    private void R14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R14KeyTyped
                 char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R14.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_R14KeyTyped

    private void R17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R17ActionPerformed

    private void R17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R17KeyTyped
                  char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R17.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R17KeyTyped

    private void R18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R18ActionPerformed

    private void R18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R18KeyTyped
                        char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R18.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R18KeyTyped

    private void R19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R19KeyTyped
                      char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R19.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R19KeyTyped

    private void R24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R24KeyTyped
                      char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R24.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R24KeyTyped

    private void R22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R22KeyTyped
                       char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R22.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R22KeyTyped

    private void R15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R15ActionPerformed

    private void R5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R5KeyTyped
              char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R5.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R5KeyTyped

    private void R6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R6ActionPerformed

    private void R6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R6KeyTyped
           char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R6.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R6KeyTyped

    private void R7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R7ActionPerformed

    private void R7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R7KeyTyped
             char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R7.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R7KeyTyped

    private void R8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R8ActionPerformed

    private void R8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R8KeyTyped
           char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R8.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R8KeyTyped

    private void R12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R12KeyTyped
            char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R12.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R12KeyTyped

    private void R13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R13ActionPerformed

    private void R13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R13KeyTyped
             char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R13.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R13KeyTyped

    private void R4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R4ActionPerformed

    private void R4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R4KeyTyped
             char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R4.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R4KeyTyped

    private void R21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R21KeyTyped
                     char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R21.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R21KeyTyped

    private void R16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R16KeyTyped
               char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-'|| car=='<' || car=='>'|| car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R16.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-' && car!='<'&& car!='>'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R16KeyTyped

    private void R20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_R20KeyTyped
                      char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='.' || car==',' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = R20.getText();
            //CONTABILIZA LOS CARACTERES
            if(Caracteres.length()==10)
            {
                evt.consume();
            }
        }
        //EVITA EL INGRESO DE OTROS CARACTERES
           else if((car!='.' && car!=','&& car!='-'|| car<'0' || car>'9' || car!=(char)KeyEvent.VK_DELETE))
        {
            evt.consume();
        } 
    }//GEN-LAST:event_R20KeyTyped

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
            
            Paragraph t1columna1 = new Paragraph("----- PERFIL FEMENINO ---- ");
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
            
            
            
         
           
            
            
           Tabla2.addCell(new Paragraph("Hormonas Foliculo Estimulante (FSH)",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TxtFSH.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("mUI/m",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("Fase Folicular: "+R1.getText() +"\n Fase Lutea: "+ R2.getText()+"\n Mitad de Ciclo: "+ R3.getText()+"\n Postmenopausia: "+ R4.getText()+"\n \n \n",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
           Tabla2.addCell(new Paragraph("Hormona Luteínizante (LH)",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TxtLH.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("pg/ml",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("Fase Folicular: "+R5.getText() +"\n Fase Lutea: "+ R6.getText()+"\n Mitad de Ciclo: "+ R7.getText()+"\n Postmenopausia: "+ R8.getText() +"\n \n \n",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
           Tabla2.addCell(new Paragraph("Estrogenos Totales",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TxtEstrogenos.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("mUI/ml",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("1-10 Dias: "+R9.getText() +"\n 11-20 Dias: "+ R10.getText()+"\n 21-30 Dias: "+ R11.getText() +"\n \n \n",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
           Tabla2.addCell(new Paragraph("Progesterona",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(Txtprogestosterona.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("ng/ml",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("Fase Folicular: "+R12.getText() +"\n Fase Lutea: "+ R13.getText()+"\n Mitad de Fase Lutea: "+ R14.getText()+"\n Postmenopausia: "+ R15.getText()+"\n \n \n",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            
           Tabla2.addCell(new Paragraph("Estradiol",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(Txtestradiol.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("mUI/ml",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("Fase Postmenopausica: "+R16.getText() +"\n Ovulación: "+ R17.getText()+"\n Tardia Folicular: "+ R18.getText()+"\n Fase Lutea: "+ R19.getText()+"\n Embarazo: "+ R20.getText()+"\n Pubertad: "+ R21.getText()+"\n \n \n",FontFactory.getFont("Arial",9,Font.NORMAL)));
           
           Tabla2.addCell(new Paragraph("Prolactina",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph(TxtProlactina.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           Tabla2.addCell(new Paragraph("ng/ml",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           Tabla2.addCell(new Paragraph("No Embarazo: "+R22.getText() +"\n Embarazo: "+ R23.getText()+"\n Postmenupausia: "+ R24.getText() +"\n \n \n",FontFactory.getFont("Arial",9,Font.NORMAL))); 

           
           
           
           
           
           
           
           
             /*
            PdfPTable Tablafirma = new PdfPTable(3); 
            Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            Tablafirma.setWidthPercentage(100);  
            float[] medidaCeldasP = {3f, 3f, 3f };
            Tablafirma.setWidths(medidaCeldasP);
            Tablafirma.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tablafirma.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph tPcolumna1 = new Paragraph("www.fundaginebra.org");
            tPcolumna1.getFont().setStyle(Font.BOLD);
            tPcolumna1.getFont().setSize(8);        
            tPcolumna1.setFont(Letra);
            tPcolumna1.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna1);

                
            Paragraph tPcolumna2 = new Paragraph("________________ \n Firma");
            tPcolumna2.getFont().setStyle(Font.BOLD);
            tPcolumna2.getFont().setSize(8);        
            tPcolumna2.setFont(Letra);
            tPcolumna2.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna2);

            Paragraph tPcolumna3 = new Paragraph( " " + writer.getPageNumber()+ " Pág");
            tPcolumna3.getFont().setStyle(Font.BOLD);
            tPcolumna3.getFont().setSize(8);        
            tPcolumna3.setFont(Letra);
            tPcolumna3.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna3);
    
                 
                 
            PdfPTable Tablafirma = new PdfPTable(1); 
            Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
           
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
            doc.add(saltolinea);

        //    doc.add(Tablafirma);

            addFooterConfirma(writer);
          

            
            
            doc.close();
            archivo.close();
        //    Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "NO SE CONSIGUE LA CARPETA FUNDAGINEBRA EN DISCO C", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
       
     
     
     
     private void addFooter(PdfWriter writer) throws IOException{

    try {

        
        
        
             
            BaseFont BF = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);    
            Font Letra = new Font(BF); 
     
          
        
        
        
        
        
          
            PdfPTable Tablafirma = new PdfPTable(3); 
            Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            Tablafirma.setWidthPercentage(100);  
            float[] medidaCeldasP = {3f, 3f, 3f };
            Tablafirma.setWidths(medidaCeldasP);
            Tablafirma.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tablafirma.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        
            Paragraph tPcolumna1 = new Paragraph("www.cmollca.com");
            tPcolumna1.getFont().setStyle(Font.BOLD);
            tPcolumna1.getFont().setSize(8);        
            tPcolumna1.setFont(Letra);
            tPcolumna1.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna1);

                
            Paragraph tPcolumna2 = new Paragraph("____________________ \n Firma");
            tPcolumna2.getFont().setStyle(Font.BOLD);
            tPcolumna2.getFont().setSize(8);        
            tPcolumna2.setFont(Letra);
            tPcolumna2.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna2);

            Paragraph tPcolumna3 = new Paragraph( " " + writer.getPageNumber()+ " Pág");
            tPcolumna3.getFont().setStyle(Font.BOLD);
            tPcolumna3.getFont().setSize(8);        
            tPcolumna3.setFont(Letra);
            tPcolumna3.setAlignment(Element.ALIGN_CENTER);
            Tablafirma.addCell(tPcolumna3); 
             

     
        Tablafirma.setTotalWidth(527);
        Tablafirma.setLockedWidth(false);
        Tablafirma.getDefaultCell().setFixedHeight(40);
        Tablafirma.getDefaultCell().setBorder(Rectangle.TOP);
        Tablafirma.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
        
        
        
        // write page
        PdfContentByte canvas = writer.getDirectContent();
        canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
        Tablafirma.writeSelectedRows(0, -1, 34, 50, canvas);  
        canvas.endMarkedContentSequence();
    } catch(DocumentException de) {
        throw new ExceptionConverter(de);
   
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     private void addFooterConfirma(PdfWriter writer) throws IOException{
                 
     knowaboutlcdo();    
    try {

            BaseFont BF = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);    
            Font Letra = new Font(BF); 
     
          

           
           PdfPTable TablafirmaLcdo = new PdfPTable(1); 
           TablafirmaLcdo.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
           TablafirmaLcdo.setWidthPercentage(100);  
           float[] medidaCeldasFirma = {20f};
           TablafirmaLcdo.setWidths(medidaCeldasFirma);
           TablafirmaLcdo.setHorizontalAlignment(Element.ALIGN_CENTER);
           TablafirmaLcdo.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
           Paragraph tPcolumnaFirma1 = new Paragraph("________________ \n Lcdo/a "+ NameOfLcdo);
           tPcolumnaFirma1.getFont().setStyle(Font.BOLD);
           tPcolumnaFirma1.getFont().setSize(8);        
           tPcolumnaFirma1.setFont(Letra);
           tPcolumnaFirma1.setAlignment(Element.ALIGN_CENTER);
           TablafirmaLcdo.addCell(tPcolumnaFirma1);

            
            
            
          PdfPTable Tablafirma = new PdfPTable(3); 
          Tablafirma.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
          Tablafirma.setWidthPercentage(100);  
          float[] medidaCeldasP = {3f, 1f, 3f };
          Tablafirma.setWidths(medidaCeldasP);
          Tablafirma.setHorizontalAlignment(Element.ALIGN_CENTER);
          Tablafirma.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        
          Paragraph tPcolumna1 = new Paragraph("\n\n\n\n\n "+piepagina);
          tPcolumna1.getFont().setStyle(Font.BOLD);
          tPcolumna1.getFont().setSize(8);        
          tPcolumna1.setFont(Letra);
          tPcolumna1.setAlignment(Element.ALIGN_CENTER);
          Tablafirma.addCell(tPcolumna1);


            
            
            
         com.itextpdf.text.Image FirmaLcdo = com.itextpdf.text.Image.getInstance("C:\\Fundaginebra\\dist\\imagen.bin");
         FirmaLcdo.setAlignment(Chunk.ALIGN_CENTER);
         Tablafirma.addCell(FirmaLcdo);
   

         

            
            
            
            
            
            
        Paragraph tPcolumna3 = new Paragraph( "\n\n\n\n\n" + writer.getPageNumber()+ " Pág");
        tPcolumna3.getFont().setStyle(Font.BOLD);
        tPcolumna3.getFont().setSize(8);        
        tPcolumna3.setFont(Letra);
        tPcolumna3.setAlignment(Element.ALIGN_CENTER);
        Tablafirma.addCell(tPcolumna3); 
             

     
        Tablafirma.setTotalWidth(527);
        Tablafirma.setLockedWidth(false);
        Tablafirma.getDefaultCell().setFixedHeight(40);
        Tablafirma.getDefaultCell().setBorder(Rectangle.TOP);
        Tablafirma.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
        
        TablafirmaLcdo.setTotalWidth(527);
        TablafirmaLcdo.setLockedWidth(false);
        TablafirmaLcdo.getDefaultCell().setFixedHeight(40);
        TablafirmaLcdo.getDefaultCell().setBorder(Rectangle.TOP);
        TablafirmaLcdo.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
        
        // write page
        PdfContentByte canvas = writer.getDirectContent();
        canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
        

        Tablafirma.writeSelectedRows(0, -1, 34, 120, canvas);
        TablafirmaLcdo.writeSelectedRows(0, -1, 34, 80, canvas);
        
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
        
        else{  BtnAgregar.setVisible(false); TXTPcedula.setEnabled(true); BtnSearch.setEnabled(true);  }
    
        
       
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
        int idexamen = 1009;
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
         TxtEstrogenos.setText("");
         Txtprogestosterona.setText("");
         Txtestradiol.setText("");
         TxtProlactina.setText("");
   //    TxtHCM.setText("");
    
         TxtLH.setText("");
   //    TxtEosinofilos.setText("");
   //    TxtMonocitos.setText(""); 
         TxtFSH.setText(""); 
   //    TxtSegmentados.setText(""); 

        
        }
           
         
           
           
           public void ActualizarReferencia()   {
                   
                   

        Connection con=null;
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps=null;
        ResultSet rs=null;

        try {
            String sql = "update referencia_femenina set FSHfaseFolicular=?,FSHfaseLutea=?,FSHMitaddeCiclo=?,FSHPostmenopausia=?,LHfaseFolicular=?,LHfaseLutea=?,LHMitaddeCiclo=?,LHPostmenopausia=?,Estrouno=? ,Estrodos=? ,Estrotres=? ,ProgesfaseFolicular=? ,ProgesfaseLutea=? ,Progesmitadlutea=? ,ProgesPostmenopausia=? ,EstradiolFasePostmenopausica=? ,EstradiolOvulacion=? ,EstradiolTardiaFolicular=? ,EstradiolFaseLutea=?, EstradiolEmbarazo=?, EstradiolPubertad=?, ProlacNoembarazo=? ,ProlacEmbarazo=?,ProlacPostmenopausia=? " ;
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, R1.getText());
            ps.setString(2, R2.getText());
            ps.setString(3, R3.getText());
            ps.setString(4, R4.getText());
            ps.setString(5, R5.getText());
            ps.setString(6, R6.getText());
            ps.setString(7, R7.getText());
            ps.setString(8, R8.getText());
            ps.setString(9, R9.getText());
            ps.setString(10, R10.getText());
            ps.setString(11, R11.getText());
            ps.setString(12, R12.getText());
            ps.setString(13, R13.getText());
            ps.setString(14, R14.getText());
            ps.setString(15, R15.getText());
            ps.setString(16, R16.getText());
            ps.setString(17, R17.getText());
            ps.setString(18, R18.getText());
            ps.setString(19, R19.getText());
            ps.setString(20, R20.getText());
            ps.setString(21, R21.getText());
            ps.setString(22, R22.getText());
            ps.setString(23, R23.getText());
            ps.setString(24, R24.getText());
  
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

            String sql = "select * from referencia_femenina";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String info0 = rs.getString("FSHfaseFolicular");
                String info1 = rs.getString("FSHfaseLutea");
                String info2 = rs.getString("FSHMitaddeCiclo");
                String info3 = rs.getString("FSHPostmenopausia");
                String info4 = rs.getString("LHfaseFolicular");
                String info5 = rs.getString("LHfaseLutea");
                String info6 = rs.getString("LHMitaddeCiclo");
                String info7 = rs.getString("LHPostmenopausia");
                String info8 = rs.getString("Estrouno");
                String info9 = rs.getString("Estrodos");
                String info10 = rs.getString("Estrotres");
                String info11 = rs.getString("ProgesfaseFolicular");
                String info12 = rs.getString("ProgesfaseLutea");
                String info13 = rs.getString("Progesmitadlutea");
                String info14 = rs.getString("ProgesPostmenopausia");
                String info15 = rs.getString("EstradiolFasePostmenopausica");
                String info16 = rs.getString("EstradiolOvulacion");
                String info17 = rs.getString("EstradiolTardiaFolicular");
                String info18 = rs.getString("EstradiolFaseLutea");
                String info19 = rs.getString("EstradiolEmbarazo");
                String info20 = rs.getString("EstradiolPubertad");
                String info21 = rs.getString("ProlacNoembarazo");
                String info22 = rs.getString("ProlacEmbarazo");
                String info23 = rs.getString("ProlacPostmenopausia");
                
                
         R1.setText(info0); 
         R2.setText(info1);
         R3.setText(info2); 
         R4.setText(info3);
         R5.setText(info4); 
         R6.setText(info5);
         R7.setText(info6); 
         R8.setText(info7);
         R9.setText(info8); 
         R10.setText(info9);
         R11.setText(info10); 
         R12.setText(info11);
         R13.setText(info12); 
         R14.setText(info13);
         R15.setText(info14); 
         R16.setText(info15);
         R17.setText(info16); 
         R18.setText(info17);
         R19.setText(info18); 
         R20.setText(info19);
         R21.setText(info20); 
         R22.setText(info21);
         R23.setText(info22); 
         R24.setText(info23); 
         

                
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
            String accion= "Modificó los valores referenciales de: Perfil Femenino" ;
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
  Temporal TM = new Temporal();
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JLabel FechaAc6;
    private javax.swing.JLabel FechaAc7;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JTextField IdPacientess;
    private javax.swing.JPanel JPregistro;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JRadioButton JRfemenino;
    private javax.swing.JTextField R1;
    private javax.swing.JTextField R10;
    private javax.swing.JTextField R11;
    private javax.swing.JTextField R12;
    private javax.swing.JTextField R13;
    private javax.swing.JTextField R14;
    private javax.swing.JTextField R15;
    private javax.swing.JTextField R16;
    private javax.swing.JTextField R17;
    private javax.swing.JTextField R18;
    private javax.swing.JTextField R19;
    private javax.swing.JTextField R2;
    private javax.swing.JTextField R20;
    private javax.swing.JTextField R21;
    private javax.swing.JTextField R22;
    private javax.swing.JTextField R23;
    private javax.swing.JTextField R24;
    private javax.swing.JTextField R3;
    private javax.swing.JTextField R4;
    private javax.swing.JTextField R5;
    private javax.swing.JTextField R6;
    private javax.swing.JTextField R7;
    private javax.swing.JTextField R8;
    private javax.swing.JTextField R9;
    private javax.swing.JTextField TXTPapellido;
    private javax.swing.JTextField TXTPcedula;
    private javax.swing.JTextField TXTPcorreo;
    private javax.swing.JTextArea TXTPdireccion;
    private javax.swing.JTextField TXTPnombre;
    private javax.swing.JFormattedTextField TXTPtelefono;
    private javax.swing.JTextField TxtEstrogenos;
    private javax.swing.JTextField TxtFSH;
    private javax.swing.JTextField TxtLH;
    private javax.swing.JTextField TxtProlactina;
    private javax.swing.JTextField Txtestradiol;
    private javax.swing.JTextField Txtprogestosterona;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
