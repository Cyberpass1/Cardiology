/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Clases.ControladorJtable;
import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.JCAsignar;
import Clases.JCAsignarDao;
import Clases.JCAsignarProcedimientos;
import Clases.JCambiarState;
import Clases.LlenarCombobox;
import Clases.Temporal;
import Clases.Validar;
import Menu.Mprincipal;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import static java.nio.file.Files.exists;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import static org.apache.commons.collections4.CollectionUtils.exists;
import static org.h2.store.fs.FileUtils.exists;

/**
 *
 * @author FCGinebraI
 */
public class JAsignarPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JUREGISTRO
     */
    public JAsignarPaciente() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
       
        this.JRMasculino.setSelected(true);
        JLabelTitle.setVisible(false);
        JPregistro.setVisible(false);
        BtnAgregar.setVisible(false);
        TXTPcedula.setEnabled(false);
        BtnSearch.setEnabled(false);
        BtnAgregar.setEnabled(false);
        BtnReasignar.setEnabled(false);
        cantidad=0;
        llenarEspecialidades();
        acomodarceldasProcesos();
                 
         Calendar Fecha = new GregorianCalendar();
         FechaAsignar.setCalendar(Fecha);
        
  JTableAsignar.requestFocusInWindow();
JLabelTitle.setHorizontalAlignment(JLabelTitle.CENTER);
    }
    

    
    

    @SuppressWarnings("unchecked")
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupEstado = new javax.swing.JPopupMenu();
        AsignarProcedimiento = new javax.swing.JMenuItem();
        Reasignar = new javax.swing.JMenuItem();
        Cancelar = new javax.swing.JMenuItem();
        EstadoProcess = new javax.swing.JPopupMenu();
        CancelarProcess = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        BtnSearch = new javax.swing.JButton();
        FechaAc4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        TXTPcedula = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        JLabelTitle = new javax.swing.JLabel();
        JtabedAsignar = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        JLconteo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        JComboDoctor = new javax.swing.JComboBox<>();
        btnAsignar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        FechaAsignar = new com.toedter.calendar.JDateChooser();
        JtabbedAsignar = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableAsignar = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        JComboProcedimientos = new javax.swing.JComboBox<>();
        JLabelPPaciente = new javax.swing.JLabel();
        BtnAprocedimiento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        JtableProcedimientos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        TXTPcedula1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        JPregistro = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        FechaAc5 = new javax.swing.JLabel();
        JTabbedPacientes = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        TXTPnombre = new javax.swing.JTextField();
        TXTPcorreo = new javax.swing.JTextField();
        TXTPtelefono = new javax.swing.JFormattedTextField();
        TXTPapellido = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        JRMasculino = new javax.swing.JRadioButton();
        JRfemenino = new javax.swing.JRadioButton();
        jLabel111 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTPdireccion = new javax.swing.JTextArea();
        BtnAgregar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        FechReasignar = new com.toedter.calendar.JDateChooser();
        BtnReasignar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtReasignar = new javax.swing.JTextField();
        BtnCancelar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        AsignarProcedimiento.setText("Asignar Procedimiento");
        AsignarProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarProcedimientoActionPerformed(evt);
            }
        });
        JPopupEstado.add(AsignarProcedimiento);

        Reasignar.setText("Reasignar cita");
        Reasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReasignarActionPerformed(evt);
            }
        });
        JPopupEstado.add(Reasignar);

        Cancelar.setText("Cancelar");
        Cancelar.setToolTipText("");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        JPopupEstado.add(Cancelar);

        CancelarProcess.setText("Cancelar");
        CancelarProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarProcessActionPerformed(evt);
            }
        });
        EstadoProcess.add(CancelarProcess);

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1300, 676));
        setPreferredSize(new java.awt.Dimension(1300, 676));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una especialidad", "Cardiologia" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 330, 30));

        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/magnifier-1_icon-icons.com_56924.png"))); // NOI18N
        BtnSearch.setBorderPainted(false);
        BtnSearch.setContentAreaFilled(false);
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 50, 50));

        FechaAc4.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        FechaAc4.setText("               M Ó D U L O      A S I G N A R");
        jPanel2.add(FechaAc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 350, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 10));

        TXTPcedula.setText("V-");
        TXTPcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cédula"));
        TXTPcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTPcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPcedulaKeyTyped(evt);
            }
        });
        jPanel2.add(TXTPcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 150));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabelTitle.setBackground(new java.awt.Color(0, 0, 0));
        JLabelTitle.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        JLabelTitle.setText("CARDIOLOGIA");
        jPanel6.add(JLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 10));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        JtabedAsignar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JtabedAsignar.setEnabled(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blur-hospital.jpg"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 570));

        JtabedAsignar.addTab("Inicio", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLconteo.setText("n°");
        jPanel9.add(JLconteo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 20, -1));

        jLabel4.setText(" Total de pacientes:");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jButton1.setText("Refrescar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 80, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JComboDoctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboDoctorItemStateChanged(evt);
            }
        });
        jPanel15.add(JComboDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 30));

        btnAsignar.setText("Asignar Cita");
        btnAsignar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAsignar.setContentAreaFilled(false);
        btnAsignar.setEnabled(false);
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel15.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 100, 30));

        jLabel5.setText("Seleccione el/la  dr/a");
        jPanel15.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        FechaAsignar.setBackground(new java.awt.Color(255, 255, 255));
        FechaAsignar.setToolTipText("");
        FechaAsignar.setDateFormatString("yyyy-MM-dd");
        FechaAsignar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaAsignar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FechaAsignarFocusLost(evt);
            }
        });
        FechaAsignar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaAsignarPropertyChange(evt);
            }
        });
        jPanel15.add(FechaAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 170, 30));

        jPanel9.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 80));

        JtabbedAsignar.setEnabled(false);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableAsignar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PACIENTE", "CEDULA", "FECHA", "DOCTOR", "ESTADO"
            }
        ));
        JTableAsignar.setComponentPopupMenu(JPopupEstado);
        JTableAsignar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAsignarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTableAsignar);

        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 410));

        JtabbedAsignar.addTab("tab1", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JComboProcedimientos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel13.add(JComboProcedimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 30));

        JLabelPPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLabelPPaciente.setText("N");
        jPanel13.add(JLabelPPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        BtnAprocedimiento.setText("Asignar Procedimientos");
        BtnAprocedimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnAprocedimiento.setContentAreaFilled(false);
        BtnAprocedimiento.setEnabled(false);
        BtnAprocedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAprocedimientoActionPerformed(evt);
            }
        });
        jPanel13.add(BtnAprocedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 210, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Procedimiento", "Estado"
            }
        ));
        jTable1.setComponentPopupMenu(EstadoProcess);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 440, 290));

        JtableProcedimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num", "Procedimiento"
            }
        ));
        jScrollPane4.setViewportView(JtableProcedimientos);

        jPanel13.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 350, 250));

        jLabel6.setText("Asignar Procedimientos");
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel7.setText("Procedimientos Actuales:");
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Paciente:");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jButton3.setText("Agregar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 70, 30));

        jButton4.setText("Volver");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 30));

        jButton5.setText("Quitar");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 70, 30));

        JtabbedAsignar.addTab("tab2", jPanel13);

        jPanel9.add(JtabbedAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 880, 450));

        TXTPcedula1.setText("V-");
        TXTPcedula1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por cédula"));
        TXTPcedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTPcedula1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPcedula1KeyTyped(evt);
            }
        });
        jPanel9.add(TXTPcedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 200, 40));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 560));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel8.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 20, 570));

        JtabedAsignar.addTab("Asignar", jPanel8);

        jPanel4.add(JtabedAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 590));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 590));

        JPregistro.setBackground(new java.awt.Color(255, 255, 255));
        JPregistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPregistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAc5.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        FechaAc5.setText("                                   P A C I E N T E ");
        jPanel14.add(FechaAc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        JPregistro.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 30));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTPnombre.setEditable(false);
        TXTPnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre")));
        TXTPnombre.setOpaque(false);
        TXTPnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPnombreActionPerformed(evt);
            }
        });
        jPanel11.add(TXTPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 50));

        TXTPcorreo.setEditable(false);
        TXTPcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Correo"));
        TXTPcorreo.setOpaque(false);
        TXTPcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPcorreoActionPerformed(evt);
            }
        });
        jPanel11.add(TXTPcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 50));

        TXTPtelefono.setEditable(false);
        TXTPtelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefono"));
        try {
            TXTPtelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TXTPtelefono.setOpaque(false);
        TXTPtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPtelefonoActionPerformed(evt);
            }
        });
        jPanel11.add(TXTPtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, 50));

        TXTPapellido.setEditable(false);
        TXTPapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Apellido"));
        TXTPapellido.setOpaque(false);
        jPanel11.add(TXTPapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, 50));

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

        jPanel11.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, 50));

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel111.setText("Fecha de nacimiento");
        jPanel11.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 60));

        FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        FechaNacimiento.setToolTipText("");
        FechaNacimiento.setEnabled(false);
        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel11.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 30));

        TXTPdireccion.setEditable(false);
        TXTPdireccion.setColumns(20);
        TXTPdireccion.setLineWrap(true);
        TXTPdireccion.setRows(5);
        TXTPdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dirección"));
        jScrollPane2.setViewportView(TXTPdireccion);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 310, 120));

        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/agregar2.png"))); // NOI18N
        BtnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnAgregar.setBorderPainted(false);
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel11.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, 40));

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/cancelar.png"))); // NOI18N
        BtnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCancelar.setBorderPainted(false);
        BtnCancelar.setContentAreaFilled(false);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel11.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 120, 40));

        JTabbedPacientes.addTab("tab2", jPanel11);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechReasignar.setBackground(new java.awt.Color(255, 255, 255));
        FechReasignar.setToolTipText("");
        FechReasignar.setDateFormatString("yyyy-MM-dd");
        FechReasignar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel10.add(FechReasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 340, 40));

        BtnReasignar.setBackground(new java.awt.Color(255, 255, 255));
        BtnReasignar.setText("Reasignar");
        BtnReasignar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnReasignar.setContentAreaFilled(false);
        BtnReasignar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnReasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReasignarActionPerformed(evt);
            }
        });
        jPanel10.add(BtnReasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 340, 40));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setText("        R E A S I G N A R            C I T A ");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, -1));

        TxtReasignar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PACIENTE"));
        jPanel10.add(TxtReasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 340, 50));

        BtnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/cancelar.png"))); // NOI18N
        BtnCancelar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCancelar1.setBorderPainted(false);
        BtnCancelar1.setContentAreaFilled(false);
        BtnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelar1ActionPerformed(evt);
            }
        });
        jPanel10.add(BtnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 120, 40));

        JTabbedPacientes.addTab("tab1", jPanel10);

        JPregistro.add(JTabbedPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));

        jPanel1.add(JPregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 430));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1300, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRMasculinoActionPerformed

        this.JRMasculino.setSelected(true);
        JRfemenino.setSelected(false);
        Sexo="Masculino";

    }//GEN-LAST:event_JRMasculinoActionPerformed

    private void JRfemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRfemeninoActionPerformed
        Sexo="Femenino";
        this.JRMasculino.setSelected(false);
        JRfemenino.setSelected(true);
      
    }//GEN-LAST:event_JRfemeninoActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
     
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    
    
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Correo = TXTPcorreo.getText();
        Matcher mather = pattern.matcher(Correo);
        Object Telefono = TXTPtelefono.getValue();

        if (TXTPapellido.getText().equals("") || TXTPnombre.getText().equals("")
            || TXTPcedula.getText().equals("") || TXTPcorreo.getText().equals("") || TXTPtelefono.getText().equals("") || TXTPdireccion.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);

        

        } else if (mather.find() == false) {
            JOptionPane.showMessageDialog(null, "EMAIL INVALIDO, VERIFIQUE", "EMAIL INVALIDO", JOptionPane.ERROR_MESSAGE);
            this.TXTPcorreo.requestFocus();
        }

        else if ( FechaNacimiento.getDate()== null){
         JOptionPane.showMessageDialog(null, "DEBE INGRESAR UNA FECHA DE NACIMIENTO", "FECHA NACIMIENTO", JOptionPane.ERROR_MESSAGE);
        }
        
          else if ( Telefono== null){
         JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NUMERO DE TELEFONO VALIDO", "NUMERO DE TELEFONO", JOptionPane.ERROR_MESSAGE);
        }
        

        
        else {

            String sql="SELECT Idpaciente, Nombre, Apellido, Cedula, Telefono, Direccion FROM table_paciente  WHERE Cedula='"+ TXTPcedula.getText() +"'";

            try{
                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){JOptionPane.showMessageDialog(null, "EL PACIENTE YA SE ENCUENTRA", "DATO DUPLICADO",JOptionPane.ERROR_MESSAGE);}
               
                
                
                
                else{
                 AgregarPaciente(); 
                 AuditoriaAgregar();
                 Callpacient();
                BtnAgregar.setEnabled(false);
          //      TxtMotivo.setEnabled(true);
           JTableAsignar.requestFocusInWindow();
               
                }
                
                
    
                
                

            }catch(Exception e){System.out.println(e);}
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed
    int IdPaciente;






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

    
    
    
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       if(jComboBox1.getSelectedIndex()!=-1){

        Combobox();
       
        limpiarCampos();
        volver();
        JTabbedPacientes.setSelectedIndex(0);
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");
        BtnSearch.setEnabled(true);
        BtnAgregar.setEnabled(true);
        btnAsignar.setEnabled(false);
        cantidad=0;
        JTableAsignar.requestFocusInWindow();
        }
   
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    
    
    
    
    
    
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        limpiarCampos();
        JTabbedPacientes.setSelectedIndex(0);
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");
        BtnSearch.setEnabled(true);
        BtnAgregar.setEnabled(true);
        btnAsignar.setEnabled(false);
        cantidad=0;
        
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TXTPtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPtelefonoActionPerformed

    private void ReasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReasignarActionPerformed
        
        
           JTabbedPacientes.setSelectedIndex(1);
           JPregistro.setVisible(true);

    
    }//GEN-LAST:event_ReasignarActionPerformed

    private void BtnReasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReasignarActionPerformed
         
        reasignarCita();
        BtnReasignar.setEnabled(false);       
    }//GEN-LAST:event_BtnReasignarActionPerformed

    private void TXTPnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPnombreActionPerformed
      
    }//GEN-LAST:event_TXTPnombreActionPerformed

    private void TXTPcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPcorreoActionPerformed
     
    }//GEN-LAST:event_TXTPcorreoActionPerformed

    private void BtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelar1ActionPerformed
        limpiarCampos();
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");
  
    }//GEN-LAST:event_BtnCancelar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          limpiarTabla();
          ListarAsignacion();
          ConteoTabla();
   
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
    
    int row = JTableAsignar.getRowCount();
    Object[] content = new Object[row];
    for (int i = 0; i < row; i++) {
        content[i] = JTableAsignar.getValueAt(i, 2);
    }
    Object value_to_find= TXTPcedula.getText();
    boolean exist = Arrays.asList(content).contains(value_to_find);
        
        
        if( TXTPapellido.getText().equals("") || TXTPnombre.getText().equals("")
     || TXTPcedula.getText().equals("")    || TXTPcorreo.getText().equals("")   || TXTPtelefono.getText().equals("") 
     || TXTPdireccion.getText().equals("") || TXTPcedula.getText().equals("V-") || TXTPcedula.getText().equals("") )
{
JOptionPane.showMessageDialog(null, "DEBE ASOCIAR UN PACIENTE A LA CONSULTA ANTES DE ASIGNAR", "ASIGNAR", JOptionPane.ERROR_MESSAGE);
TXTPcedula.setText("V-");
}
   
   else if (JComboDoctor.getSelectedItem() == null || JComboDoctor.getSelectedIndex() < 0){
   
   
   JOptionPane.showMessageDialog(null, "NO HAY DOCTORES ASIGNADOS A ESTA ESPECIALIDAD", "ASIGNAR", JOptionPane.ERROR_MESSAGE);
   
   }

    else if (exist){
        JOptionPane.showMessageDialog(null, "EL PACIENTE YA TIENE UNA CITA ASIGNADA", "PACIENTES", JOptionPane.ERROR_MESSAGE);
    }

                            
   else
 {
AsignarPaciente();
limpiarTabla();
ListarAsignacion();
AuditoriaAsignarCita();
ConteoTabla();
       
btnAsignar.setEnabled(false);
JTableAsignar.requestFocusInWindow();
}
    
    }//GEN-LAST:event_btnAsignarActionPerformed

    
    
    int idAsignar;
    String EstadoTexto, nombrepaciente;
    private void JTableAsignarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAsignarMouseClicked
        int fila = JTableAsignar.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
   

    
            idAsignar=(int) (JTableAsignar.getValueAt(fila, 0));
            nombrepaciente=(JTableAsignar.getValueAt(fila, 1).toString());
            TxtReasignar.setText(JTableAsignar.getValueAt(fila, 1).toString());
            EstadoTexto=(JTableAsignar.getValueAt(fila, 5).toString());
            BtnReasignar.setEnabled(true);
            IdProcessPatient();
            limpiarTablaProcedimientos2();
            ListarAsigProc();
            JComboDoctor.setEnabled(true);
            JTableAsignar.requestFocusInWindow();
    }                                         
    }//GEN-LAST:event_JTableAsignarMouseClicked

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        

             if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente cancelar este estudio?",
            "CANCELAR ESTUDIO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {
         
            
            
            
            
        int fila = JTableAsignar.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe selecionar una Fila");
        } else {
      
          if (EstadoTexto.equals("Cancelado")){ JOptionPane.showMessageDialog(null, "ESTA CITA YA SE ENCUENTRA: Cancelado", "Estado", JOptionPane.WARNING_MESSAGE);}
        
          else if (EstadoTexto.equals("Completado")){ JOptionPane.showMessageDialog(null, "NO PUEDE CANCELAR UNA CITA QUE YA HA SIDO COMPLETADA", "Estado", JOptionPane.WARNING_MESSAGE);}
        
          
          else if (setState.CancelarAsignacion(104,      idAsignar )) {

                JOptionPane.showMessageDialog(null, "EL ESTADO DE LA CITA SE HA ACTUALIZADO A : Cancelado", "Estado", 1);
                 limpiarTabla();
                 ListarAsignacion();
                 acomodarceldas();
                 AuditoriaCancelarCita();
             
             
            }
        }

            
            
         }
    }//GEN-LAST:event_CancelarActionPerformed
    
    private void BtnAprocedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAprocedimientoActionPerformed
    int row = jTable1.getRowCount();
    Object[] content = new Object[row];
    for (int i = 0; i < row; i++) {
        content[i] = jTable1.getValueAt(i, 1);
    }
    
          int row2 = JtableProcedimientos.getRowCount();
    Object[] content2 = new Object[row2];
    for (int i = 0; i < row2; i++) {
        content2[i] = JtableProcedimientos.getValueAt(i, 1);
    }
    
  //  Object value_to_find= JComboProcedimientos.getSelectedItem();
    boolean exist = Arrays.asList(content2).contains(content);
    if (exist){
        JOptionPane.showMessageDialog(null, "NO PUEDEN HABER PROCEDIMIENTOS DUPLICADOS", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
    }
    else if(idselecdoproces==0){
    JOptionPane.showMessageDialog(null, "POR FAVOR RETROCEDE Y VUELVE A SELECCIONAR EL PACIENTE", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
    JtabbedAsignar.setSelectedIndex(0);
    }     
                 
        else{
        AsignarProcedimiento();
        limpiarTablaProcedimientos2();
        ListarAsigProc();
        AuditoriaAsignarProced();
            
        limpiarCampos();
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");

        BtnSearch.setEnabled(true);
        BtnAgregar.setEnabled(true);
        BtnAprocedimiento.setEnabled(true);
        limpiarTablaProcedimientos();
      
        
 }
            
            
       
    }//GEN-LAST:event_BtnAprocedimientoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              
    int row = JtableProcedimientos.getRowCount();
    Object[] content = new Object[row];
    for (int i = 0; i < row; i++) {
        content[i] = JtableProcedimientos.getValueAt(i, 1);
    }
    Object value_to_find= JComboProcedimientos.getSelectedItem();
    boolean exist = Arrays.asList(content).contains(value_to_find);
    if (exist){
        JOptionPane.showMessageDialog(null, "NO PUEDEN HABER PROCEDIMIENTOS DUPLICADOS", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
    }
         
       else 
       {
       addexamen();
       BtnAprocedimiento.setEnabled(true);
       JtableProcedimientos.requestFocusInWindow();
  
       }
    
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    volver();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void volver(){
        jButton1.setVisible(true);
        jLabel4.setVisible(true);
        JLconteo.setVisible(true);
        TXTPcedula1.setVisible(true);
        TXTPcedula.setEnabled(true);
        BtnSearch.setEnabled(true);
        JtabbedAsignar.setSelectedIndex(0);
        limpiarTablaProcedimientos();
        JComboDoctor.setEnabled(true);
        JTableAsignar.requestFocusInWindow();
    }
    
    
    
    
    private void AsignarProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarProcedimientoActionPerformed
        limpiarCampos();
        JTabbedPacientes.setSelectedIndex(0);
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");
        BtnSearch.setEnabled(true);
        BtnAgregar.setEnabled(true);
        btnAsignar.setEnabled(false);
        cantidad=0;
        jButton1.setVisible(false);
        jLabel4.setVisible(false);
        JLconteo.setVisible(false);
        TXTPcedula1.setVisible(false);
        JtabbedAsignar.setSelectedIndex(1);
        TXTPcedula.setEnabled(false);
        BtnSearch.setEnabled(false); 
        JLabelPPaciente.setText(nombrepaciente);
        llenarProcedimientos();
        JComboDoctor.setEnabled(false);
        
    }//GEN-LAST:event_AsignarProcedimientoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int fila = JtableProcedimientos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila", "Fila",1);
        } else {
   

        try {
            int FilaRemover;
            DefaultTableModel Mode = (DefaultTableModel) JtableProcedimientos.getModel();
            FilaRemover = this.JtableProcedimientos.getSelectedRow();
            Mode.removeRow(FilaRemover);
cantidad=cantidad-1;
        } catch (Exception e){ System.out.println("" + e);
        }  }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TXTPcedula1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPcedula1KeyReleased
     Search(); acomodarceldas();
    }//GEN-LAST:event_TXTPcedula1KeyReleased

    private void TXTPcedula1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPcedula1KeyTyped
                         char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='V' || car=='E' || car =='J' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTPcedula1.getText();
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
    }//GEN-LAST:event_TXTPcedula1KeyTyped

    private void FechaAsignarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaAsignarFocusLost
    }//GEN-LAST:event_FechaAsignarFocusLost

    private void FechaAsignarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaAsignarPropertyChange
        limpiarTablaProcedimientos2();
        ListarAsigProc();
        limpiarTabla();
        ListarAsignacion();
    }//GEN-LAST:event_FechaAsignarPropertyChange

    
    int IdProcess;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
   

    
            IdProcess=(int) (jTable1.getValueAt(fila, 0));


    }             
    }//GEN-LAST:event_jTable1MouseClicked

    private void CancelarProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarProcessActionPerformed
         if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente cancelar este procedimiento?",
            "CANCELAR PROCEDIMIENTO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {
         
            
            
            
            
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe selecionar una Fila");
        } else {
      
          if (EstadoTexto.equals("Cancelado")){ JOptionPane.showMessageDialog(null, "ESTE PROCEDIMIENTO YA SE ENCUENTRA: Cancelado", "Estado", JOptionPane.WARNING_MESSAGE);}
          else if (setState.CancelarProceso(104,      IdProcess )) {

                 JOptionPane.showMessageDialog(null, "EL ESTADO DEL PROCEDIMIENTO HA ACTUALIZADO A : Cancelado", "Estado", 1);
                 limpiarTablaProcedimientos2();
                 ListarAsigProc();
                 AuditoriaCancelarProcedimiento();
             
             
            }
        }

            
            
         }
    }//GEN-LAST:event_CancelarProcessActionPerformed

    private void TXTPcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPcedulaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
     
        
        if(TXTPcedula.getText().equals("V-") || TXTPcedula.getText().equals("") )
{
JOptionPane.showMessageDialog(null, "CAMPO VACIO O CÉDULA INVALIDA", "CEDULA", JOptionPane.ERROR_MESSAGE);
TXTPcedula.setText("V-");
}
   else
        {
 Callpacient(); 

}
           
        
        } 
    }//GEN-LAST:event_TXTPcedulaKeyPressed

    private void JComboDoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboDoctorItemStateChanged
      
      if(JComboDoctor.getSelectedIndex()!=-1){
limpiarTabla();         
ListarAsignacion();

ConteoTabla();
JTableAsignar.requestFocusInWindow();
   }

    }//GEN-LAST:event_JComboDoctorItemStateChanged

    

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
     
     
     
     
  
     

     
     
     
     
     
       public void Combobox() {
   
         
           if(jComboBox1.getSelectedItem().equals("Seleccionar") )
           {
           JtabedAsignar.setSelectedIndex(0);
           
           DesactivarCampos();
           TXTPcedula.setEnabled(false);
           JPregistro.setVisible(false);
           BtnSearch.setEnabled(false);
           JLabelTitle.setVisible(false);
           }
     
           
           else if(jComboBox1.getSelectedItem().equals("Administrativo") )
           {  
           JtabedAsignar.setSelectedIndex(0);
           DesactivarCampos();
           TXTPcedula.setEnabled(false);
           JPregistro.setVisible(false);
           BtnSearch.setEnabled(false);
           JLabelTitle.setVisible(false);
           }
           

           
           else 
           {  
           llenarCombo(); 
           
           
      
                   
           limpiarTabla();
           ListarAsignacion();
           JtabedAsignar.setSelectedIndex(1);
           JLabelTitle.setVisible(true);
           TXTPcedula.setEditable(true);
           BtnSearch.setEnabled(true);
           TXTPcedula.setEnabled(true);
           JLabelTitle.setText(jComboBox1.getSelectedItem().toString());    
           ConteoTabla();
      
                         
                         
           
           

                 
           
           
    }
    
       
       
       }
       
       
       
       
       public void ConteoTabla()
       {
                for(int x=0;x<=JTableAsignar.getRowCount();x++)
           {
           JLconteo.setText(""+x);
           }
       }
       
       
       
       
      
      
      
       
       
       
       
       
       
       
       
       
    
       
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
    
       
       
       
       
       
       public void Callpacient() {  
       
       
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
btnAsignar.setEnabled(false);
}
       
      else if(rs.next())
       {
        

      IdPaciente= rs.getInt("Idpaciente");;
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
      btnAsignar.setEnabled(true);
      DesactivarCampos();

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
       btnAsignar.setEnabled(true);
         
         

         
        }   
        
        else{  BtnAgregar.setVisible(false);
      }
        
       
    }                                        
         }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}
        JTableAsignar.requestFocusInWindow();
       }
       
     
       
       
       
       
       
            public void ListarAsignacion() {
                Object selectedItem = JComboDoctor.getSelectedItem();
                if(selectedItem == null || selectedItem.toString().isEmpty()){
                }
                
                
                
                
                
                
        else{
        List<JCAsignar> lista = LlenarLista();
        modelo = (DefaultTableModel) JTableAsignar.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdAsignar();
            ob[1] = lista.get(i).getNombre() +" " + lista.get(i).getApellido();
            ob[2] = lista.get(i).getCedula();
            ob[3] = lista.get(i).getFecha();
            ob[4] = lista.get(i).getDoctor();
            ob[5] = lista.get(i).getEstado();
            modelo.addRow(ob);

        }
       JTableAsignar.setModel(modelo);
       JTableAsignar.setDefaultEditor(Object.class, null);
        acomodarceldas();
            
    //JTableAsignar.getColumnModel().getColumn(0).setMaxWidth(0);
    // JTableAsignar.getColumnModel().getColumn(0).setMinWidth(0);
   //  JTableAsignar.getColumnModel().getColumn(0).setPreferredWidth(0);
    // JTableAsignar.setDefaultEditor(Object.class, null);
                } 
   }
    
    
            public void ListarAsigProc() {
                
                
                
                      
                Object selectedItem = JComboDoctor.getSelectedItem();
                if(selectedItem == null || selectedItem.toString().isEmpty()){
                }
                
                else{
                
                
              
                
                

        List<JCAsignarProcedimientos> lista = LlenarListaProceso();
        modelo = (DefaultTableModel) jTable1.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdShowProcess();
            ob[1] = lista.get(i).getProcess() ;
            ob[2] = lista.get(i).getEstado();
      
            modelo.addRow(ob);

        }
       jTable1.setModel(modelo);
       jTable1.setDefaultEditor(Object.class, null);
       
       jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
       jTable1.getColumnModel().getColumn(0).setMinWidth(0);
       jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
       
       
       acomodarceldasProcesos2();
            
    //JTableAsignar.getColumnModel().getColumn(0).setMaxWidth(0);
    // JTableAsignar.getColumnModel().getColumn(0).setMinWidth(0);
    //  JTableAsignar.getColumnModel().getColumn(0).setPreferredWidth(0);
    // JTableAsignar.setDefaultEditor(Object.class, null);
      }
    }
       
          
            
            
            
  public ArrayList<JCAsignarProcedimientos> LlenarListaProceso(){
      

                
  String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar.getDate());    
  ArrayList<JCAsignarProcedimientos> al=null;
  al=new ArrayList<JCAsignarProcedimientos>();
                

 
  
 
String sql = "SELECT Id_AProcedimientos, Id_Paciente, Procedimiento, Id_Estado, Estado, Fecha_Procedimiento, Usuario, especialidad\n" +
"FROM asignar_procedimiento u\n" +

"INNER JOIN table_procedimientos l\n" +
"ON u.Id_Procedimiento= l.idProcedimiento" +
"  \n" +
"INNER JOIN table_paciente c\n" +
"ON u.Id_Paciente= c.Idpaciente\n" +
"\n" +
"INNER JOIN table_estado p\n" +
"ON u.Id_Estado= p.IdEstado \n" +
"\n" +
"INNER JOIN table_usuario x\n" +
"ON u.Id_Usuario= x.IdPersonal\n" +
"\n" +
"INNER JOIN table_especialidad o\n" +
"ON u.Id_Especialidad= o.id_especialidad\n" +
"  \n" +  
        
"WHERE Usuario LIKE '%" + JComboDoctor.getSelectedItem().toString() + 
"%' AND especialidad LIKE '%" + jComboBox1.getSelectedItem().toString() + 
"%' AND Fecha_Procedimiento =" +  '"' + fecha+ '"' +
"   AND Id_Paciente = " + idselecdoproces +  "  \n" +  
"\n ORDER by Id_AProcedimientos";





        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int estado =rs.getInt("Id_Estado"); 
                if( estado==102){
                JCAsignarProcedimientos AsigProc = new JCAsignarProcedimientos();
                AsigProc.setIdShowProcess(rs.getInt(1));
                AsigProc.setProcess(rs.getString(3));
            
                AsigProc.setEstado(rs.getString(5));
                al.add(AsigProc
                );
                  }
            }
        } catch (Exception e) {System.err.println("Error al listar"+ e);
        }
        
        finally {
            try {
                ps.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return al;
    }
    
       
       
  
       
                  
   
    
    
    
    
    
public ArrayList<JCAsignar> LlenarLista(){
       
ArrayList<JCAsignar> al=null;
al=new ArrayList<JCAsignar>();
String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar.getDate());   
String sql = "SELECT IdAsignar, Nombre, Apellido, Cedula, Usuario,date_format(FechaAsignar, '%d/%m/%Y') AS Fecha, especialidad, Estado, EstadoA, FechaAsignar \n" +
"FROM table_asignar u\n" +
"\n" +
"INNER JOIN table_paciente c\n" +
"ON u.IdPacientes= c.Idpaciente\n" +
"\n" +
"INNER JOIN table_estado p\n" +
"ON u.EstadoA= p.IdEstado \n" +
"\n" +
"INNER JOIN table_usuario x\n" +
"ON u.IdUsuario= x.IdPersonal\n" +
"\n" +
"INNER JOIN table_especialidad l\n" +
"ON u.Id_Especialidades= l.id_especialidad\n" +
"  \n" +
"WHERE Usuario LIKE '%" + JComboDoctor.getSelectedItem().toString() + "%' \n" +
"AND especialidad LIKE '%" + jComboBox1.getSelectedItem().toString() + "%' \n" +
"AND FechaAsignar = '" + fecha + "' \n" +
"AND Usuario = '" + JComboDoctor.getSelectedItem().toString()+ "' \n" +
"ORDER BY IdAsignar";





        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int estado =rs.getInt("EstadoA"); 
                if( estado==102 || estado==103){
                JCAsignar prd = new JCAsignar();
                prd.setIdAsignar(rs.getInt(1));
                prd.setNombre(rs.getString(2));
                prd.setApellido(rs.getString(3));      
                prd.setCedula(rs.getString(4));
                prd.setDoctor(rs.getString(5)); 
                prd.setFecha(rs.getString(6));
                prd.setEstado(rs.getString(8));
                al.add(prd);
                  }
            }
        } catch (Exception e) {System.err.println("Error al listar"+ e);
        }
        
        finally {
            try {
                ps.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return al;
    }
    
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       

        
     
      public  void limpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) JTableAsignar.getModel();
        int a = JTableAsignar.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

       
             
     
        public void limpiarTablaProcedimientos() {
        DefaultTableModel tb = (DefaultTableModel) JtableProcedimientos.getModel();
        int a = JtableProcedimientos.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }


           
        public void limpiarTablaProcedimientos2() {
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        int a = jTable1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
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
    
    
    
              
     Connection con;
     EnlaceBd cn = new EnlaceBd();
     PreparedStatement ps;
     ResultSet rs;
  
    
     
     
     
      
          public void llenarCombo() {

       try{
      
        JComboDoctor.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = llenarDoctoresAsignar(); 
        for (int i = 0; i < lista.size(); i++) {
            JComboDoctor.addItem(lista.get(i));

        }
  
           }catch(Exception e ){JOptionPane.showMessageDialog(null,e );};
           
     
           
          }
    
     
     
     
     public void llenarEspecialidades(){
             try{
      
        jComboBox1.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = lc.llenarEspecialidad();
        for (int i = 0; i < lista.size(); i++) {
            jComboBox1.addItem(lista.get(i));

        }
  
           }catch(Exception e ){JOptionPane.showMessageDialog(null,e );};
     
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      public  ArrayList<String> llenarDoctoresAsignar(){

          
        ArrayList<String> lista = new ArrayList<String>();
        
        
    
        String sql = "SELECT  Usuario, especialidad, Pestado FROM table_usuario u\n" +
                
"INNER JOIN table_especialidad c\n" +
"ON u.idEspecialidad= c.id_especialidad\n" +
"\n" +
"where Pestado=100 AND  especialidad LIKE '%" + jComboBox1.getSelectedItem().toString() + "%' ORDER BY Usuario ASC";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
          
            while(rs.next()){
           
                lista.add(rs.getString("Usuario"));}
           
            
            
        } catch (Exception e) {System.out.println(e);}
        
        
        
        finally
    {  
    try{ps.close();
    rs.close();
    con.close();
    }catch(Exception e){System.out.println(e);}    
    }
       
        return lista;
    }
    
      
      
      
      
      
  
      
      
      
      
      
      
          
     
     public void llenarProcedimientos(){
             try{
      
        JComboProcedimientos.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = llenarProcess();
        for (int i = 0; i < lista.size(); i++) {
            JComboProcedimientos.addItem(lista.get(i));

        }
  
           }catch(Exception e ){JOptionPane.showMessageDialog(null,e );};
     
     }
     
     
      public  ArrayList<String> llenarProcess(){

          
        ArrayList<String> lista = new ArrayList<String>();
        
        
    
        String sql = "SELECT procedimiento, especialidad, Id_Pestado FROM table_procedimientos u\n" +
                
"INNER JOIN table_especialidad c\n" +
"ON u.Id_Categoria= c.id_especialidad\n" +
"\n" +
"where Id_Pestado=100 AND  especialidad LIKE '%" + jComboBox1.getSelectedItem().toString() + "%' ";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
          
            while(rs.next()){
           
                lista.add(rs.getString("procedimiento"));}
           
            
            
        } catch (Exception e) {System.out.println(e);}
        
        
        
        finally
    {  
    try{ps.close();
    rs.close();
    con.close();
    }catch(Exception e){System.out.println(e);}    
    }
       
        return lista;
    }
    
      
      
      
      
      
      
      
      
      
      
      
      
    
    
    
    public void AsignarPaciente(){
    
   Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null;
    
   
        java.sql.Date fechaU;
        Date dateU = mp.FechaAdmin.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
        
        
        

        
   
      
   try {
         
 
            String sql = "INSERT INTO table_asignar (`IdPacientes`, `IdUsuario`, `Id_Especialidades`, `FechaAsignar`, `EstadoA`)  VALUES (?,(SELECT IdPersonal FROM table_usuario WHERE Usuario=?),(SELECT id_especialidad FROM table_especialidad WHERE especialidad=?),?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, IdPaciente);
            ps.setString(2, JComboDoctor.getSelectedItem().toString());
            ps.setString(3, jComboBox1.getSelectedItem().toString());
            ps.setDate(4, fechaU);
            ps.setInt(5, 102);
          
            ps.execute();
            JOptionPane.showMessageDialog(null, "CITA REGISTRADA EXITOSAMENTE", "CITAS", 1);
            
            
           

         
           AsignarHistoriaPaciente();
    
        } catch (Exception e) {
      
           System.out.println("Error en agregar Asignacion"+ e);
        }
 

    }
    
    
     
    public void AsignarHistoriaPaciente(){
    
   Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null;
    
   
        java.sql.Date fechaU;
        Date dateU = mp.FechaAdmin.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
        
        
        

        
   
      
   try {
         
 
            String sql = "INSERT INTO table_historias (`Id_usuarioh`, `Id_pacienteh`, `Id_Hespecialidad`, `Fecha_Historia`, `Id_Estadoh`)  VALUES ((SELECT IdPersonal FROM table_usuario WHERE Usuario=?),?,(SELECT id_especialidad FROM table_especialidad WHERE especialidad=?),?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, JComboDoctor.getSelectedItem().toString());
            ps.setInt(2, IdPaciente);
            ps.setString(3, jComboBox1.getSelectedItem().toString());
            ps.setDate(4, fechaU);
            ps.setInt(5, 102);
          
            ps.execute();
          //  JOptionPane.showMessageDialog(null, "CITA REGISTRADA EXITOSAMENTE", "CITAS", 1);
            
            
           

         
       
    
        } catch (Exception e) {
      
           System.out.println("Error en agregar Asignacion historia"+ e);
        }
 
   
   
   
   

   
   
    
    }
    
    
    
    
    
    
   
    
    
            
            
            
    public void reasignarCita(){
           
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
       try {
          
            
            
            
            
   
        
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechReasignar.getDate());
        
            String sql = "update table_asignar set FechaAsignar=? where idAsignar=?";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1,  fecha);
            ps.setInt(2, idAsignar);
  
            int res = ps.executeUpdate();

            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "LA CITA HA SIDO REASIGNADA", "CITAS", 1);
                limpiarTabla();
                ListarAsignacion();
                AuditoriaReasignarCita();
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA CITA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR UNA CÉDULA DUPLICADA", "DATOS DUPLICADOS", JOptionPane.ERROR_MESSAGE);
           }
    
    }
    
    
      
      
      
      
        public void acomodarceldas()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)JTableAsignar.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        JTableAsignar.setRowHeight(20);
        
       JTableAsignar.getColumnModel().getColumn(0).setMaxWidth(0);
       JTableAsignar.getColumnModel().getColumn(0).setMinWidth(0);
       JTableAsignar.getColumnModel().getColumn(0).setPreferredWidth(0);
       
       JTableAsignar.getColumnModel().getColumn(4).setMaxWidth(0);
       JTableAsignar.getColumnModel().getColumn(4).setMinWidth(0);
       JTableAsignar.getColumnModel().getColumn(4).setPreferredWidth(0);
        
       
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("PACIENTE")).setPreferredWidth(120);
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("CEDULA")).setPreferredWidth(60);
       // JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("DOCTOR")).setPreferredWidth(60);
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("FECHA")).setPreferredWidth(70);
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("ESTADO")).setPreferredWidth(70);

      
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("PACIENTE")).setCellRenderer(Alinear);
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("CEDULA")).setCellRenderer(Alinear);
       // JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("DOCTOR")).setCellRenderer(Alinear);;
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("FECHA")).setCellRenderer(Alinear);
        JTableAsignar.getColumnModel().getColumn(Tabla.findColumn("ESTADO")).setCellRenderer(Alinear);
    }
            
      
    
    
      public void acomodarceldasProcesos()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)JtableProcedimientos.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        JtableProcedimientos.setRowHeight(20);
        
     
       
        JtableProcedimientos.getColumnModel().getColumn(Tabla.findColumn("Num")).setPreferredWidth(5);
        JtableProcedimientos.getColumnModel().getColumn(Tabla.findColumn("Procedimiento")).setPreferredWidth(120);

        JtableProcedimientos.getColumnModel().getColumn(Tabla.findColumn("Num")).setCellRenderer(Alinear);
        JtableProcedimientos.getColumnModel().getColumn(Tabla.findColumn("Procedimiento")).setCellRenderer(Alinear);

    
    }
      
      
      
      
            public void acomodarceldasProcesos2()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)jTable1.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        jTable1.setRowHeight(20);
        
     
       
     // jTable1.getColumnModel().getColumn(Tabla.findColumn("Id")).setPreferredWidth(5);
        jTable1.getColumnModel().getColumn(Tabla.findColumn("Procedimiento")).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(Tabla.findColumn("Estado")).setPreferredWidth(20);

    //  jTable1.getColumnModel().getColumn(Tabla.findColumn("Id")).setCellRenderer(Alinear);
        jTable1.getColumnModel().getColumn(Tabla.findColumn("Procedimiento")).setCellRenderer(Alinear);
        jTable1.getColumnModel().getColumn(Tabla.findColumn("Estado")).setCellRenderer(Alinear);

    
    }
        
        
        
        
        
    
    
     public void AuditoriaAgregar(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(mp.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Agrego al paciente: "+ TXTPnombre.getText()+" "+TXTPapellido.getText() +" " ;
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
      
         public void AuditoriaCancelarCita(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(mp.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Cancelo la cita del paciente: " +nombrepaciente +" " ;
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
         
         
         
         
         
         
         
         
         
        
         
         public void AuditoriaAsignarCita(){
         
          Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(mp.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Asigno la cita del paciente: " +TXTPnombre.getText()+" "+ TXTPapellido.getText() +" " ;
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
         
           
         
         
         
         
         
         
         public void AuditoriaCancelarProcedimiento(){
         
          Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(mp.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Cancelo el procedimiento del paciente: " + JLabelPPaciente.getText() +" " ;
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
         
         
         
         
         
         
         
         
         
        
         public void AuditoriaReasignarCita(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(mp.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Reasigno la cita del paciente: " +nombrepaciente +" " ;
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
         
         
           public void AuditoriaAsignarProced(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(mp.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Asigno un procedimiento para el paciente: " +JLabelPPaciente.getText() +" " ;
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
         
         
         
         
         
         
        
        
      
   
    
     public void addexamen() {
//controlT.AsignarPaciente(JTableLaboratorio, (String) JComboEstudio.getSelectedItem(), 0, modelo);
             cantidad=cantidad+1;
        modelo = (DefaultTableModel) JtableProcedimientos.getModel();
        Procedimiento = JComboProcedimientos.getSelectedItem().toString();
    
      
            ArrayList lista = new ArrayList();
     
            lista.add(cantidad);
            lista.add(Procedimiento);

            Object[] ob = new Object[8];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
      
            modelo.addRow(ob);
            JtableProcedimientos.setModel(modelo);
            JtableProcedimientos.setDefaultEditor(Object.class, null);
    }
       
         
         
         
     
     public void AsignarProcedimientos(){
     
       Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
  


          try {



 
        

        java.sql.Date fechaU;
        Date dateU = mp.FechaAdmin.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
          
        
                  int fila = 0;


    


           // Examen1=(String) (JTableLaboratorio.getValueAt(fila, 1));
            //String sql = "INSERT INTO table_asignar (IdPacientes, Fecha, Especialidad, Examen1) VALUES (((SELECT IdPaciente FROM table_paciente WHERE Cedula=?) ),?,((SELECT IdEspecialidades FROM table_especialidades WHERE Especialidades=?),?))";
            String sql = "INSERT INTO table_asignar (IdPacientes, Fecha, Especialidad, Examen1) VALUES ((SELECT IdPaciente FROM table_paciente WHERE Cedula=?), ?, (SELECT IdEspecialidades FROM table_especialidades WHERE Especialidades=?),(SELECT IdEstudio FROM table_estudios WHERE Estudio=?))";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
            ps.setString(1, TXTPcedula.getText());
            ps.setDate(2, fechaU);
            ps.setString(3, JLabelTitle.getText());
     //       ps.setString(4,Examen1);
       
            ps.execute();
  
            
         
           JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO REGISTRADO","REGISTRO DE PACIENTES", 1);




     
        
     
     
     }
     
     
         catch(Exception e ){ System.out.println("Error en asignar procedimiento:"+ e);} }
     
     
     
     
     
     
     
     
     
      public void Search(){
              
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    String fechaDia = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar.getDate());    
    String Busqueda = this.TXTPcedula1.getText();
    String sql = "select IdAsignar, Nombre, Apellido, Cedula, date_format(FechaAsignar, '%d/%m/%Y') AS Fecha, Usuario, Estado, EstadoA, especialidad, IdPacientes  from table_asignar u "
           + "\n" + 
           "INNER JOIN table_paciente c ON u.IdPacientes= c.Idpaciente"                  + "\n" + 
           "INNER JOIN table_estado p ON u.EstadoA= p.IdEstado"                          + "\n" + 
           "INNER JOIN table_usuario x ON u.IdUsuario= x.IdPersonal"                     + "\n" + 
           "INNER JOIN table_especialidad l ON u.Id_Especialidades= l.id_especialidad"   + "\n" + 
           "WHERE Cedula LIKE '%" + Busqueda + 
           "%' AND especialidad LIKE '%" + jComboBox1.getSelectedItem().toString() + 
           "%' AND FechaAsignar =" +  '"' + fechaDia + '"' +
           "   AND Usuario=" +  '"' +  JComboDoctor.getSelectedItem().toString() + '"' +

           "ORDER by IdAsignar ASC";
         
        
     
        //DECLARACIÓN DEL MODELO DE LA TABLA
        DefaultTableModel Tabla = (DefaultTableModel)JTableAsignar.getModel();
        JTableAsignar.setDefaultEditor(Object.class, null);
        try
        {
            //SENTENCIA SQL Y VARIABLES PARA CONEXION Y CONSULTA
    
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            limpiarTabla();

            while(rs.next()) 
            {
                //LLENADO DE TABLA
               int id = rs.getInt(1);
               String nombre = rs.getString(2) + " "+ rs.getString(3);
               String cedula = rs.getString(4);
               String fecha = rs.getString(5);
               String usuario = rs.getString(6);
               String estado = rs.getString(7);
               int estadonum = rs.getInt(8);
             
               if(estadonum==102){
               Vector vRow=new Vector();
               vRow.add(id);
               vRow.add(nombre);
               vRow.add(cedula);
               vRow.add(fecha);
               vRow.add(usuario);
               vRow.add(estado);
               Tabla.addRow(vRow);
               
               }
          
            }            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
  }
         
         
         
      
      
      
      
      
      public void AsignarProcedimiento(){
      
    Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;  
   String Fecha = new SimpleDateFormat("yyyy/MM/dd").format(FechaAsignar.getDate());     
        try {
               String sql = "INSERT INTO asignar_procedimiento (`Id_Procedimiento`, `Id_Paciente`, `Id_Usuario`, `Id_Especialidad`, `Id_Estado`, `Fecha_Procedimiento`) VALUES ((SELECT idProcedimiento FROM table_procedimientos WHERE procedimiento=?),?,(SELECT IdPersonal FROM table_usuario WHERE Usuario=?),(SELECT id_especialidad FROM table_especialidad WHERE especialidad=?),?,?)";
            for (int i = 0; i < JtableProcedimientos.getRowCount(); i++) {
  
                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                
               
                ps.setString(1, JtableProcedimientos.getValueAt(i, 1).toString());
                ps.setInt(2, idselecdoproces);
                ps.setString(3, JComboDoctor.getSelectedItem().toString());
                ps.setString(4, jComboBox1.getSelectedItem().toString());
                ps.setInt(5, 102);
                ps.setString(6, Fecha);
                ps.execute();
                

            }
            
            
        JOptionPane.showMessageDialog(null, "PROCEDIMIENTOS ASIGNADOS", "PROCEDIMIENTOS", 1);
        


        } catch (Exception e) {
            System.out.println("ERROR EN INSERT"+e);
        }

        
      }
      
      
      
      
      int idselecdoproces=0;
      public void IdProcessPatient(){
     
          try{
              
       int fila = JTableAsignar.getSelectedRow();
       
       String query="SELECT Idpaciente from table_paciente where Cedula=? ";
       
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setString(1, JTableAsignar.getValueAt(fila, 2).toString());
       rs=ps.executeQuery();
      

       
      if(rs.next())
       {
        

       idselecdoproces= rs.getInt("Idpaciente");
  

       }
          }
catch(Exception e){System.out.println(e);}

      }
      
    
   /*
          public void validarTabla()
    {
      
        
        
        for (int i = 0; i < JTableLaboratorio.getRowCount(); i++) {

              if(JTableLaboratorio.getValueAt(i,1).equals(JComboEstudio.getSelectedItem().toString()))
              {
             JOptionPane.showMessageDialog(this, "ESTE EXAMEN YA HA SIDO AGREGADO PARA ESTE PACIENTE "+ JComboEstudio.getSelectedItem().toString() +" ", "EXAMEN",JOptionPane.ERROR_MESSAGE);
             modelo.removeRow(i);
             existe=true;
             cantidad=cantidad-1;
              } 
              else  {  existe=false; } 
       }

    }*/
    
    Temporal MP = new Temporal();
    int idusuario=MP.getTexto();
    public String  Sexo="Masculino";;
    String nacimiento, sexoTable;  
    DefaultTableModel modelo = new DefaultTableModel();   
    JCAsignarDao Asignar = new JCAsignarDao();
    LlenarCombobox lc = new LlenarCombobox();
    int cantidad=0;
    String Procedimiento;
    JCambiarState setState = new JCambiarState();
    boolean existe=false;
    Mprincipal mp = new Mprincipal();
    Encriptar encriptar = new Encriptar();
    ControladorJtable controlT = new ControladorJtable();
    Validar va = new Validar();     
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AsignarProcedimiento;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAprocedimiento;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JButton BtnReasignar;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JMenuItem Cancelar;
    private javax.swing.JMenuItem CancelarProcess;
    private javax.swing.JPopupMenu EstadoProcess;
    private com.toedter.calendar.JDateChooser FechReasignar;
    private javax.swing.JLabel FechaAc4;
    private javax.swing.JLabel FechaAc5;
    private com.toedter.calendar.JDateChooser FechaAsignar;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JComboBox<String> JComboDoctor;
    private javax.swing.JComboBox<String> JComboProcedimientos;
    private javax.swing.JLabel JLabelPPaciente;
    private javax.swing.JLabel JLabelTitle;
    private javax.swing.JLabel JLconteo;
    private javax.swing.JPopupMenu JPopupEstado;
    private javax.swing.JPanel JPregistro;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JRadioButton JRfemenino;
    private javax.swing.JTabbedPane JTabbedPacientes;
    private javax.swing.JTable JTableAsignar;
    private javax.swing.JTabbedPane JtabbedAsignar;
    private javax.swing.JTabbedPane JtabedAsignar;
    private javax.swing.JTable JtableProcedimientos;
    private javax.swing.JMenuItem Reasignar;
    private javax.swing.JTextField TXTPapellido;
    private javax.swing.JTextField TXTPcedula;
    private javax.swing.JTextField TXTPcedula1;
    private javax.swing.JTextField TXTPcorreo;
    private javax.swing.JTextArea TXTPdireccion;
    private javax.swing.JTextField TXTPnombre;
    private javax.swing.JFormattedTextField TXTPtelefono;
    private javax.swing.JTextField TxtReasignar;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables
}
