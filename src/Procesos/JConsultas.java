/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Clases.AddPdfConsulta;
import Clases.AddPdfConsultaDao;
import Registros.*;
import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.JCAntecedentesFamiliares;
import Clases.JCAntecedentesFamiliaresDao;
import Clases.JCAsignar;
import Clases.JCMostrarAsignados;
import Clases.JCPacientes;
import Clases.JCProcedimientos;
import Clases.JCambiarState;
import Clases.PdfDAO1;
import Clases.PdfVO;
import Clases.Temporal;
import Clases.Validar;
import Clases.imgTabla;
import Clases.sql;
import Menu.Mprincipal;
import static com.itextpdf.kernel.pdf.PdfName.Footer;
import com.itextpdf.layout.property.BorderRadius;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Footer;


/**
 *
 * @author FCGinebraI
 */
public class JConsultas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JUREGISTRO
     */
    
    
    Calendar Fecha;
    public JConsultas() {
           initComponents();
       ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        Fecha = new GregorianCalendar();

        
        FechaAsignar1.setCalendar(Fecha);
        FechaAsignar2.setCalendar(Fecha);
        //FechaOne.setCalendar(Fecha);
        //FechaTwo.setCalendar(Fecha);
        JPregistro.setVisible(false);
        FechaAsignar1.setVisible(false);
 
       informacionpdf();
       ActivarFirma();
       cleanHistorias();
     
      
  // JConsultaInicio.setVisible(false);
  
        limpiarTAntecedentes();
        listarAntecedentes();
        jRadioAF.setSelected(true);
        jRadioAPP.setSelected(false);
     
        BtnAexamen.setVisible(false);
        BtnMexamen.setVisible(false);
      
    }

/*try {
    Runtime rt = Runtime.getRuntime();
    Process p = rt.exec("C:\\Windows\\System32\\mspaint.exe C:\\Fundaginebra\\dist\\imagen.bin");            
} catch(Exception ex) {
    System.out.println(ex);
}*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupHistorias = new javax.swing.JPopupMenu();
        jcorreo = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FechaAsignar1 = new com.toedter.calendar.JDateChooser();
        tabbedAntecedentes = new javax.swing.JTabbedPane();
        JPanelHistoria = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jRadioAF = new javax.swing.JRadioButton();
        jRadioAPP = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextMotivoConsulta = new javax.swing.JTextArea();
        jSeparator11 = new javax.swing.JSeparator();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTableAntecedentesF = new javax.swing.JTable();
        TxtbusquedaAntc = new javax.swing.JTextField();
        jScrollPane21 = new javax.swing.JScrollPane();
        JtextAntc1 = new javax.swing.JTextArea();
        jButton29 = new javax.swing.JButton();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTableAF2 = new javax.swing.JTable();
        jAButton30 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTableAntcPers = new javax.swing.JTable();
        TxtBusAntcP = new javax.swing.JTextField();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextAntPersonales = new javax.swing.JTextArea();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTableAntpersonal = new javax.swing.JTable();
        FactorRiesgo = new javax.swing.JPanel();
        Txtdilatada = new javax.swing.JTextField();
        JcheckIsquemica = new javax.swing.JCheckBox();
        jCheckPercutanea = new javax.swing.JCheckBox();
        jCheckPERIFERICA = new javax.swing.JCheckBox();
        TxtIsquemica = new javax.swing.JTextField();
        TxtPercutanea = new javax.swing.JTextField();
        TxtQuirurgica = new javax.swing.JTextField();
        TxtEstrictural = new javax.swing.JTextField();
        Txthemorragica = new javax.swing.JTextField();
        TXTIV = new javax.swing.JTextField();
        TXTAV = new javax.swing.JTextField();
        TxtRitmo = new javax.swing.JTextField();
        TxtRestrictiva = new javax.swing.JTextField();
        TXTDEFINITIVOP = new javax.swing.JTextField();
        TXTPERIFERICA = new javax.swing.JTextField();
        TxtCerebroVascular = new javax.swing.JTextField();
        Txtisquemica = new javax.swing.JTextField();
        jCheckQuirurgica = new javax.swing.JCheckBox();
        JcheckEstructural = new javax.swing.JCheckBox();
        jCheckDilatada = new javax.swing.JCheckBox();
        jCheckRestrictiva = new javax.swing.JCheckBox();
        jCheckRitmo = new javax.swing.JCheckBox();
        jCheckAV = new javax.swing.JCheckBox();
        jCheckIV = new javax.swing.JCheckBox();
        jCheckDEFINITIVO = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckAngina = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckConstitucional = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckPielMucosa = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckORL = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckRespiratorio = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextRevision = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboHabitos = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTConsumoDrugs = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSexualidad = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jActividadF = new javax.swing.JComboBox<>();
        Fsemanal = new javax.swing.JComboBox<>();
        jSueno = new javax.swing.JComboBox<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTConsumoAlcohol = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTConsumoTabaco = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jSmenospausia = new javax.swing.JSpinner();
        jSpartos = new javax.swing.JSpinner();
        jScesareas = new javax.swing.JSpinner();
        jSembarazo = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        TxtCiclosMestru = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSabortos = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        FechaAsignar2 = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        TXTsuperior = new javax.swing.JTextField();
        TXTinferior = new javax.swing.JTextField();
        TXTcolumna = new javax.swing.JTextField();
        TXTAbdomen2 = new javax.swing.JTextField();
        TXTcorazon = new javax.swing.JTextField();
        TXTcuello = new javax.swing.JTextField();
        TXTboca = new javax.swing.JTextField();
        TXTdientes = new javax.swing.JTextField();
        TXToidos = new javax.swing.JTextField();
        TXTojos = new javax.swing.JTextField();
        TXTpiel = new javax.swing.JTextField();
        TXTtemperatura = new javax.swing.JTextField();
        TXTtalla = new javax.swing.JTextField();
        TXTpeso = new javax.swing.JTextField();
        TXTpulso = new javax.swing.JTextField();
        TXTfr = new javax.swing.JTextField();
        TXTpesoIdeal = new javax.swing.JTextField();
        TXTpesoAdic = new javax.swing.JTextField();
        TXTrespiracion = new javax.swing.JTextField();
        TXTimc = new javax.swing.JTextField();
        TXTlinfaticos = new javax.swing.JTextField();
        TXTgenitales = new javax.swing.JTextField();
        TXTrectal = new javax.swing.JTextField();
        TXToftamoscopia = new javax.swing.JTextField();
        TXTnariz = new javax.swing.JTextField();
        TXTtorax = new javax.swing.JTextField();
        TXTmamas = new javax.swing.JTextField();
        TXTpulmones = new javax.swing.JTextField();
        TXThernias = new javax.swing.JTextField();
        TXTginecologo = new javax.swing.JTextField();
        TXTprostata = new javax.swing.JTextField();
        TXTneurologico = new javax.swing.JTextField();
        TXTvenas = new javax.swing.JTextField();
        TXTarterias = new javax.swing.JTextField();
        TXTtension = new javax.swing.JTextField();
        TXTaspecto = new javax.swing.JTextField();
        TXTabdominal = new javax.swing.JTextField();
        TXTcadera = new javax.swing.JTextField();
        BtnAexamen = new javax.swing.JButton();
        BtnMexamen = new javax.swing.JButton();
        Electro = new javax.swing.JPanel();
        TXTVentricular = new javax.swing.JTextField();
        TXTSupraventricular = new javax.swing.JTextField();
        TXTQTc = new javax.swing.JTextField();
        TXTFrec = new javax.swing.JTextField();
        TXTpr = new javax.swing.JTextField();
        TXTQrs = new javax.swing.JTextField();
        TXTAqrs = new javax.swing.JTextField();
        TXTTxtQTm = new javax.swing.JTextField();
        TXTauriculo = new javax.swing.JTextField();
        TxtIntraventicular = new javax.swing.JTextField();
        TXTCrecimiento = new javax.swing.JTextField();
        TXTRepolarizacion = new javax.swing.JTextField();
        TXTecg = new javax.swing.JTextField();
        TXTtopografico = new javax.swing.JTextField();
        TXTzei = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextTratatamiento = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        TXTterapeutico = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTexttrombolitico = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextIngreso = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextCriterios = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextManejo = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        TxtDiagnosticoElectro = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jNosinusal = new javax.swing.JRadioButton();
        jRadioSinusal = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jRadioTrazo2 = new javax.swing.JRadioButton();
        JRadioTrazo = new javax.swing.JRadioButton();
        Laboratorio = new javax.swing.JPanel();
        TXTprot = new javax.swing.JTextField();
        TXThb = new javax.swing.JTextField();
        TXTplaquetas = new javax.swing.JTextField();
        TXTglicemia = new javax.swing.JTextField();
        TXTcolesterol = new javax.swing.JTextField();
        TXTna = new javax.swing.JTextField();
        TXThematocrito = new javax.swing.JTextField();
        TXTpt = new javax.swing.JTextField();
        TXTurea = new javax.swing.JTextField();
        TXThdl = new javax.swing.JTextField();
        TXTk = new javax.swing.JTextField();
        TXTalbumina = new javax.swing.JTextField();
        TXTcreatinina = new javax.swing.JTextField();
        TXTleucocitos = new javax.swing.JTextField();
        TXTldl = new javax.swing.JTextField();
        TXThiv = new javax.swing.JTextField();
        TXTmg = new javax.swing.JTextField();
        TXTpttt = new javax.swing.JTextField();
        TXTtrigliceridos = new javax.swing.JTextField();
        TXTinr = new javax.swing.JTextField();
        TXTtfg = new javax.swing.JTextField();
        TXTtgp = new javax.swing.JTextField();
        TXTneutrofilos = new javax.swing.JTextField();
        TXTvdrl = new javax.swing.JTextField();
        TXTlinfocitos = new javax.swing.JTextField();
        TXTbpn = new javax.swing.JTextField();
        TXTacurico = new javax.swing.JTextField();
        TXTfibrinogeno = new javax.swing.JTextField();
        TXTtgo = new javax.swing.JTextField();
        TXTtroponina2 = new javax.swing.JTextField();
        TXTtroponina3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TXTtroponina1 = new javax.swing.JTextField();
        fecha3 = new javax.swing.JFormattedTextField();
        labDate = new javax.swing.JFormattedTextField();
        fecha1 = new javax.swing.JFormattedTextField();
        fecha2 = new javax.swing.JFormattedTextField();
        Rayosx = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        JtxtRayosx = new javax.swing.JTextArea();
        TXTvalvulas = new javax.swing.JTextField();
        TXTmitral = new javax.swing.JTextField();
        dateRayosx = new javax.swing.JFormattedTextField();
        TxtiAuriculazquierda = new javax.swing.JTextField();
        TXTauriculaderecha = new javax.swing.JTextField();
        TXTventriculoizquierdo = new javax.swing.JTextField();
        TXTaortica = new javax.swing.JTextField();
        TXTtricuspide = new javax.swing.JTextField();
        TXTcontractilidad = new javax.swing.JTextField();
        TXTventriculoderecho = new javax.swing.JTextField();
        TXTpericardio = new javax.swing.JTextField();
        TXTeyeccion = new javax.swing.JTextField();
        TXTpulmonar = new javax.swing.JTextField();
        TXTotros = new javax.swing.JTextField();
        TXTpsap = new javax.swing.JTextField();
        TXTsistolica = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jTextExamenAdic = new javax.swing.JTextField();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextObservAdic = new javax.swing.JTextArea();
        jButton21 = new javax.swing.JButton();
        jAdcModif = new javax.swing.JButton();
        jAdcDelete = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTableAdic = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        BtnImprimirHistoria = new javax.swing.JButton();
        jConclusion = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextRecomendacion = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextConclusion = new javax.swing.JTextArea();
        BtnGuardar = new javax.swing.JButton();
        BtnImprimirHistoria2 = new javax.swing.JButton();
        BtnGuardar1 = new javax.swing.JButton();
        JPanelAnteriores = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableVisualizarC = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        BtnSearch = new javax.swing.JButton();
        FechaAc4 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        TXTPcedula = new javax.swing.JTextField();
        JPregistro = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        FechaAc5 = new javax.swing.JLabel();
        JTabbedPacientes = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        TXTPnombre = new javax.swing.JTextField();
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
        jSeparator12 = new javax.swing.JSeparator();
        TXTPcorreo = new javax.swing.JTextField();

        jcorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/correo-electronico.png"))); // NOI18N
        jcorreo.setText("Enviar al correo");
        jcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcorreoActionPerformed(evt);
            }
        });
        PopupHistorias.add(jcorreo);

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1290, 30));

        FechaAsignar1.setBackground(new java.awt.Color(255, 255, 255));
        FechaAsignar1.setToolTipText("");
        FechaAsignar1.setDateFormatString("yyyy-MM-dd");
        FechaAsignar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaAsignar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FechaAsignar1FocusLost(evt);
            }
        });
        FechaAsignar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaAsignar1PropertyChange(evt);
            }
        });
        jPanel1.add(FechaAsignar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 650, 140, 10));

        tabbedAntecedentes.setBackground(new java.awt.Color(255, 255, 255));
        tabbedAntecedentes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabbedAntecedentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedAntecedentesMouseClicked(evt);
            }
        });

        JPanelHistoria.setBackground(new java.awt.Color(255, 255, 255));
        JPanelHistoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioAF.setBackground(new java.awt.Color(255, 255, 255));
        jRadioAF.setText("Antecedentes Familiares");
        jRadioAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAFActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, -1));

        jRadioAPP.setBackground(new java.awt.Color(255, 255, 255));
        jRadioAPP.setText("Antecedentes Personales Patologicos");
        jRadioAPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioAPPActionPerformed(evt);
            }
        });
        jPanel14.add(jRadioAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 250, -1));

        jTextMotivoConsulta.setColumns(20);
        jTextMotivoConsulta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextMotivoConsulta.setLineWrap(true);
        jTextMotivoConsulta.setRows(5);
        jTextMotivoConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Motivo de Consulta | Enfermedad Actual"));
        jScrollPane4.setViewportView(jTextMotivoConsulta);

        jPanel14.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, 160));
        jPanel14.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 920, 20));

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 930, 220));

        jTabbedPane3.setEnabled(false);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAntecedentesF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Enfermedad"
            }
        ));
        jTableAntecedentesF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAntecedentesFMouseClicked(evt);
            }
        });
        jScrollPane34.setViewportView(jTableAntecedentesF);

        jPanel11.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, 160));

        TxtbusquedaAntc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por nombre"));
        TxtbusquedaAntc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtbusquedaAntcKeyReleased(evt);
            }
        });
        jPanel11.add(TxtbusquedaAntc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 40));

        jScrollPane21.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe / Interpretación"));

        JtextAntc1.setColumns(20);
        JtextAntc1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JtextAntc1.setLineWrap(true);
        JtextAntc1.setRows(5);
        jScrollPane21.setViewportView(JtextAntc1);

        jPanel11.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 330, 170));

        jButton29.setText("Retirar");
        jButton29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton29.setContentAreaFilled(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 80, 30));

        jTableAF2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Enfermedad", "Descripción"
            }
        ));
        jTableAF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAF2MouseClicked(evt);
            }
        });
        jScrollPane35.setViewportView(jTableAF2);

        jPanel11.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 890, 120));

        jAButton30.setText("Añadir");
        jAButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jAButton30.setContentAreaFilled(false);
        jAButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAButton30ActionPerformed(evt);
            }
        });
        jPanel11.add(jAButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, 30));

        jTabbedPane3.addTab("Familiares", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAntcPers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Enfermedad"
            }
        ));
        jTableAntcPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAntcPersMouseClicked(evt);
            }
        });
        jScrollPane32.setViewportView(jTableAntcPers);

        jPanel12.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, 160));

        TxtBusAntcP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por nombre"));
        TxtBusAntcP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBusAntcPKeyReleased(evt);
            }
        });
        jPanel12.add(TxtBusAntcP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 40));

        jScrollPane19.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe / Interpretación"));

        jTextAntPersonales.setColumns(20);
        jTextAntPersonales.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextAntPersonales.setLineWrap(true);
        jTextAntPersonales.setRows(5);
        jScrollPane19.setViewportView(jTextAntPersonales);

        jPanel12.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 330, 170));

        jButton26.setText("Añadir");
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton26.setContentAreaFilled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, 30));

        jButton27.setText("Retirar");
        jButton27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton27.setContentAreaFilled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 80, 30));

        jTableAntpersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Enfermedad", "Descripción"
            }
        ));
        jScrollPane33.setViewportView(jTableAntpersonal);

        jPanel12.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 890, 120));

        jTabbedPane3.addTab("Patologico", jPanel12);

        jPanel6.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 920, 390));

        jTabbedPane2.addTab("Motivo & Antecedentes |", jPanel6);

        FactorRiesgo.setBackground(new java.awt.Color(255, 255, 255));
        FactorRiesgo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txtdilatada.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Txtdilatada.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        Txtdilatada.setEnabled(false);
        FactorRiesgo.add(Txtdilatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 630, 40));

        JcheckIsquemica.setBackground(new java.awt.Color(255, 255, 255));
        JcheckIsquemica.setText("CARDIOPATÍA ISQUÉMICA ");
        JcheckIsquemica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JcheckIsquemicaStateChanged(evt);
            }
        });
        JcheckIsquemica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcheckIsquemicaActionPerformed(evt);
            }
        });
        FactorRiesgo.add(JcheckIsquemica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        jCheckPercutanea.setBackground(new java.awt.Color(255, 255, 255));
        jCheckPercutanea.setText("REVASCULARIZACIÓN PERCUTÁNEA ");
        jCheckPercutanea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckPercutaneaStateChanged(evt);
            }
        });
        jCheckPercutanea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPercutaneaActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckPercutanea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, -1));

        jCheckPERIFERICA.setBackground(new java.awt.Color(255, 255, 255));
        jCheckPERIFERICA.setText("ENFERMEDAD ARTERIAL PERIFÉRICA ");
        jCheckPERIFERICA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckPERIFERICAStateChanged(evt);
            }
        });
        jCheckPERIFERICA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPERIFERICAActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckPERIFERICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 240, -1));

        TxtIsquemica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtIsquemica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TxtIsquemica.setEnabled(false);
        FactorRiesgo.add(TxtIsquemica, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 630, 40));

        TxtPercutanea.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtPercutanea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TxtPercutanea.setEnabled(false);
        FactorRiesgo.add(TxtPercutanea, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 630, 40));

        TxtQuirurgica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtQuirurgica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TxtQuirurgica.setEnabled(false);
        FactorRiesgo.add(TxtQuirurgica, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 630, 40));

        TxtEstrictural.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtEstrictural.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TxtEstrictural.setEnabled(false);
        FactorRiesgo.add(TxtEstrictural, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 630, 40));

        Txthemorragica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Txthemorragica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hemorragica"));
        FactorRiesgo.add(Txthemorragica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 870, 40));

        TXTIV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTIV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TXTIV.setEnabled(false);
        FactorRiesgo.add(TXTIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 630, 40));

        TXTAV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTAV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TXTAV.setEnabled(false);
        FactorRiesgo.add(TXTAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 630, 40));

        TxtRitmo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtRitmo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TxtRitmo.setEnabled(false);
        FactorRiesgo.add(TxtRitmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 630, 40));

        TxtRestrictiva.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtRestrictiva.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TxtRestrictiva.setEnabled(false);
        FactorRiesgo.add(TxtRestrictiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 630, 40));

        TXTDEFINITIVOP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTDEFINITIVOP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TXTDEFINITIVOP.setEnabled(false);
        FactorRiesgo.add(TXTDEFINITIVOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 630, 40));

        TXTPERIFERICA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTPERIFERICA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo"));
        TXTPERIFERICA.setEnabled(false);
        FactorRiesgo.add(TXTPERIFERICA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 630, 40));

        TxtCerebroVascular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtCerebroVascular.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Enfermedad Cerebro Vascular"));
        FactorRiesgo.add(TxtCerebroVascular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 870, 40));

        Txtisquemica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Txtisquemica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Isquémica"));
        FactorRiesgo.add(Txtisquemica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 870, 40));

        jCheckQuirurgica.setBackground(new java.awt.Color(255, 255, 255));
        jCheckQuirurgica.setText("REVASCULARIZACIÓN QUIRÚRGICA");
        jCheckQuirurgica.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckQuirurgicaStateChanged(evt);
            }
        });
        jCheckQuirurgica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckQuirurgicaActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckQuirurgica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, -1));

        JcheckEstructural.setBackground(new java.awt.Color(255, 255, 255));
        JcheckEstructural.setText("CARDIOPATÍA ESTRUCTURAL");
        JcheckEstructural.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JcheckEstructuralStateChanged(evt);
            }
        });
        JcheckEstructural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcheckEstructuralActionPerformed(evt);
            }
        });
        FactorRiesgo.add(JcheckEstructural, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, -1));

        jCheckDilatada.setBackground(new java.awt.Color(255, 255, 255));
        jCheckDilatada.setText("MIOCARDIOPATÍA DILATADA ");
        jCheckDilatada.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckDilatadaStateChanged(evt);
            }
        });
        jCheckDilatada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDilatadaActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckDilatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, -1));

        jCheckRestrictiva.setBackground(new java.awt.Color(255, 255, 255));
        jCheckRestrictiva.setText("MIOCARDIOPATÍA RESTRICTIVA");
        jCheckRestrictiva.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckRestrictivaStateChanged(evt);
            }
        });
        jCheckRestrictiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRestrictivaActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckRestrictiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, -1));

        jCheckRitmo.setBackground(new java.awt.Color(255, 255, 255));
        jCheckRitmo.setText("TRASTORNO DEL RITMO");
        jCheckRitmo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckRitmoStateChanged(evt);
            }
        });
        jCheckRitmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRitmoActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckRitmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, -1));

        jCheckAV.setBackground(new java.awt.Color(255, 255, 255));
        jCheckAV.setText("TRASTORNO DE CONDUCCIÓN A/V");
        jCheckAV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckAVStateChanged(evt);
            }
        });
        jCheckAV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAVActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, -1));

        jCheckIV.setBackground(new java.awt.Color(255, 255, 255));
        jCheckIV.setText("TRASTORNO DE CONDUCCIÓN I/V");
        jCheckIV.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckIVStateChanged(evt);
            }
        });
        jCheckIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckIVActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, -1));

        jCheckDEFINITIVO.setBackground(new java.awt.Color(255, 255, 255));
        jCheckDEFINITIVO.setText("MARCAPASO DEFINITIVO");
        jCheckDEFINITIVO.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckDEFINITIVOStateChanged(evt);
            }
        });
        jCheckDEFINITIVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckDEFINITIVOActionPerformed(evt);
            }
        });
        FactorRiesgo.add(jCheckDEFINITIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, -1));

        jTabbedPane2.addTab("Factor de Riesgo |", FactorRiesgo);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Simatología ");
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        jLabel9.setText("CardioVascular");
        jPanel15.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        jLabel10.setText("Digestivo");
        jPanel15.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 20));

        jLabel11.setText("Músculo-Esqueletico");
        jPanel15.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        jLabel12.setText("Neurológico");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 20));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Cefalea");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jCheckAngina.setBackground(new java.awt.Color(255, 255, 255));
        jCheckAngina.setText("Angina");
        jCheckAngina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAnginaActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckAngina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Dolor Abdominal");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jCheckConstitucional.setBackground(new java.awt.Color(255, 255, 255));
        jCheckConstitucional.setText("Constitucional");
        jCheckConstitucional.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckConstitucionalStateChanged(evt);
            }
        });
        jCheckConstitucional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckConstitucionalActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckConstitucional, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Dolor Muscular");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jCheckPielMucosa.setBackground(new java.awt.Color(255, 255, 255));
        jCheckPielMucosa.setText("Piel y Mucosas");
        jCheckPielMucosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckPielMucosaActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckPielMucosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Palpitaciones");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Flatulencia");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Dolor Articular");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Migraña");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jCheckORL.setBackground(new java.awt.Color(255, 255, 255));
        jCheckORL.setText("ORL/Sentidos");
        jCheckORL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckORLActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckORL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("Debilidad");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("Inflamación");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jCheckBox16.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox16.setText("Síncope");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jCheckBox17.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox17.setText("Estreñimiento");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jCheckBox19.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox19.setText("Disestesia");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jCheckBox20.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox20.setText("Endema Msis");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jCheckRespiratorio.setBackground(new java.awt.Color(255, 255, 255));
        jCheckRespiratorio.setText("Respiratorio/Disnea");
        jCheckRespiratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRespiratorioActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckRespiratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setText("Parestesia");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jCheckBox18.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBox18.setText("Genito-Urinario");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jCheckBox22.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox22.setText("Anticonceptivos");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jCheckBox23.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox23.setText("Angustia");
        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jCheckBox24.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox24.setText("Alergias");
        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setText("Otros");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jCheckBox25.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox25.setText("Endocrino");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jScrollPane17.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe / Interpretación"));

        jTextRevision.setColumns(20);
        jTextRevision.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextRevision.setLineWrap(true);
        jTextRevision.setRows(5);
        jScrollPane17.setViewportView(jTextRevision);

        jPanel15.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 240, 170));

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 900, 190));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 880, 110));

        jLabel18.setText("Consumo de estupefacientes");
        jPanel16.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 170, 20));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 880, 130));

        jLabel20.setText("Hábitos Sociales");
        jPanel20.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jLabel21.setText("Hábitos Sociales");
        jPanel20.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 100, 20));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 100, 30));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 100, 30));

        jLabel22.setText("Hábitos Sociales");
        jPanel20.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 30));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, 30));

        jLabel23.setText("Hábitos Sociales");
        jPanel20.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 100, 20));

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 100, 30));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel20.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 100, 30));

        jPanel16.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 880, 160));

        jComboHabitos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboHabitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/R", "Practica deportes", "Lectura", "Montañismo", "Gimnasio", "Fiestas", "Baile", "Televisión", "Juegos de computadora", "Juegos de azar", "Ninguno de los anteriores" }));
        jPanel16.add(jComboHabitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, 30));
        jPanel16.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 900, 10));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel16.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 20, 120));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel16.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 40, 120));

        jLabel31.setText("Sexualidad");
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 100, 20));

        jLabel32.setText("Consumo Alcohol");
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 100, 20));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel16.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 20, 120));

        jLabel33.setText("Consumo Tabaco");
        jPanel16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 100, 20));

        jTConsumoDrugs.setColumns(20);
        jTConsumoDrugs.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTConsumoDrugs.setLineWrap(true);
        jTConsumoDrugs.setRows(5);
        jScrollPane9.setViewportView(jTConsumoDrugs);

        jPanel16.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 230, 90));

        jLabel34.setText("Tiempo libre");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        jLabel35.setText("Actividad Física");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 20));

        jSexualidad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jSexualidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/R", "Satisfactoria", "Insatisfactoria", "Dispaurenia/relación dolorosa", "Inapetencia/frigidez", "Urgencia sexual/ninfomania", "Abstinencia voluntaria", "Bisexualidad", "Homosexualidad", "Impotencia", "Eyaculación precoz" }));
        jPanel16.add(jSexualidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 190, 30));

        jLabel36.setText("Frecuencia semanal");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 160, 20));

        jLabel37.setText("Sueño");
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 100, 20));

        jLabel38.setText("Hábitos Sociales");
        jPanel16.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jActividadF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jActividadF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/R", "Sedentario", "Aeróbicos", "Anaeróbicos  y aeróbicos", "Deportes", "Aeróbicos, anaeróbicos y deportes" }));
        jPanel16.add(jActividadF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 30));

        Fsemanal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Fsemanal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/R", "Nunca", "Una vez", "Dos veces", "Tres veces", "Cuatro veces", "Cinco veces", "Seis veces", "Diariamente" }));
        jPanel16.add(Fsemanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 190, 30));

        jSueno.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jSueno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/R", "Reparador", "Interrumpido", "Insomnio", "Pesadillas" }));
        jPanel16.add(jSueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 190, 30));

        jTConsumoAlcohol.setColumns(20);
        jTConsumoAlcohol.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTConsumoAlcohol.setLineWrap(true);
        jTConsumoAlcohol.setRows(5);
        jScrollPane15.setViewportView(jTConsumoAlcohol);

        jPanel16.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 230, 90));

        jTConsumoTabaco.setColumns(20);
        jTConsumoTabaco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTConsumoTabaco.setLineWrap(true);
        jTConsumoTabaco.setRows(5);
        jScrollPane16.setViewportView(jTConsumoTabaco);

        jPanel16.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 230, 90));

        jPanel7.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 900, 230));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 880, 130));

        jLabel13.setText("Menospausia edad");
        jPanel18.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 0, 100, 20));

        jLabel15.setText("Embarazos");
        jPanel18.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 70, 20));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jPanel18.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 30));

        jSmenospausia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jPanel18.add(jSmenospausia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 50, 30));

        jSpartos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpartos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpartosStateChanged(evt);
            }
        });
        jPanel18.add(jSpartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 50, 30));

        jScesareas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jScesareas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jScesareasStateChanged(evt);
            }
        });
        jPanel18.add(jScesareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 50, 30));

        jSembarazo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSembarazo.setEnabled(false);
        jPanel18.add(jSembarazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 50, 30));

        jLabel16.setText("Mernarquia edad");
        jPanel18.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eumenorreica", "Dismenorreica", "Oligomenorreica", "Hipermenorreica", "Polimenorreica", "Amenorreica", "Menospáusica" }));
        jPanel18.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, 30));

        jScrollPane18.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe / Interpretación"));

        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextArea10.setLineWrap(true);
        jTextArea10.setRows(5);
        jScrollPane18.setViewportView(jTextArea10);

        jPanel18.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 870, 60));

        TxtCiclosMestru.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ciclos menstruación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        jPanel18.add(TxtCiclosMestru, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 110, 40));

        jLabel26.setText("Ultima menstruación");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 110, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel18.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 60));

        jSabortos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSabortos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSabortosStateChanged(evt);
            }
        });
        jPanel18.add(jSabortos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 50, 30));

        jLabel27.setText("Menstruación");
        jPanel18.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 110, 20));

        FechaAsignar2.setBackground(new java.awt.Color(255, 255, 255));
        FechaAsignar2.setToolTipText("");
        FechaAsignar2.setDateFormatString("yyyy-MM-dd");
        FechaAsignar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FechaAsignar2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FechaAsignar2FocusLost(evt);
            }
        });
        FechaAsignar2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FechaAsignar2PropertyChange(evt);
            }
        });
        jPanel18.add(FechaAsignar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 120, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel18.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 40, 60));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel18.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 10, 60));

        jLabel28.setText("Partos");
        jPanel18.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 20));

        jLabel29.setText("Cesareas");
        jPanel18.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 50, 20));

        jLabel30.setText("Abortos");
        jPanel18.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 50, 20));

        jPanel7.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 900, 130));

        jTabbedPane2.addTab("Revisión |", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTsuperior.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTsuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Extr. Superior"));
        jPanel8.add(TXTsuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 300, 40));

        TXTinferior.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTinferior.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Extr. Inferior"));
        jPanel8.add(TXTinferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 300, 40));

        TXTcolumna.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTcolumna.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Columna"));
        jPanel8.add(TXTcolumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 300, 40));

        TXTAbdomen2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTAbdomen2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Abdomen"));
        jPanel8.add(TXTAbdomen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 300, 40));

        TXTcorazon.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTcorazon.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Corazón"));
        jPanel8.add(TXTcorazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 300, 40));

        TXTcuello.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTcuello.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cuello"));
        jPanel8.add(TXTcuello, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 300, 40));

        TXTboca.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTboca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Boca"));
        jPanel8.add(TXTboca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 300, 40));

        TXTdientes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTdientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dientes"));
        jPanel8.add(TXTdientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 300, 40));

        TXToidos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXToidos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Oidos"));
        jPanel8.add(TXToidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, 40));

        TXTojos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTojos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ojos"));
        jPanel8.add(TXTojos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, 40));

        TXTpiel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpiel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Piel"));
        jPanel8.add(TXTpiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 300, 40));

        TXTtemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Temperatura"));
        jPanel8.add(TXTtemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 40));

        TXTtalla.setText("0");
        TXTtalla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estatura (cm)"));
        TXTtalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTtallaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTtallaKeyTyped(evt);
            }
        });
        jPanel8.add(TXTtalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        TXTpeso.setText("0");
        TXTpeso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Peso"));
        TXTpeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTpesoKeyReleased(evt);
            }
        });
        jPanel8.add(TXTpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 40));

        TXTpulso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pulso"));
        jPanel8.add(TXTpulso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 150, 40));

        TXTfr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "F.R"));
        jPanel8.add(TXTfr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 80, 40));

        TXTpesoIdeal.setEditable(false);
        TXTpesoIdeal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Peso ideal"));
        TXTpesoIdeal.setOpaque(false);
        jPanel8.add(TXTpesoIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 40));

        TXTpesoAdic.setEditable(false);
        TXTpesoAdic.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Peso adic"));
        TXTpesoAdic.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TXTpesoAdic.setOpaque(false);
        jPanel8.add(TXTpesoAdic, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 110, 40));

        TXTrespiracion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tipo respiracion"));
        jPanel8.add(TXTrespiracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 220, 40));

        TXTimc.setEditable(false);
        TXTimc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "I.M.C"));
        TXTimc.setOpaque(false);
        jPanel8.add(TXTimc, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 110, 40));

        TXTlinfaticos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTlinfaticos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Linfáticos"));
        jPanel8.add(TXTlinfaticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 300, 40));

        TXTgenitales.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTgenitales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Genitales"));
        jPanel8.add(TXTgenitales, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 300, 40));

        TXTrectal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTrectal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ano-Rectal"));
        jPanel8.add(TXTrectal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 300, 40));

        TXToftamoscopia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXToftamoscopia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Oftamoscopia"));
        jPanel8.add(TXToftamoscopia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 300, 40));

        TXTnariz.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTnariz.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nariz"));
        jPanel8.add(TXTnariz, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 300, 40));

        TXTtorax.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtorax.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Toráx"));
        jPanel8.add(TXTtorax, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 300, 40));

        TXTmamas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTmamas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mamas"));
        jPanel8.add(TXTmamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 300, 40));

        TXTpulmones.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpulmones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pulmones"));
        jPanel8.add(TXTpulmones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 300, 40));

        TXThernias.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXThernias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hernias"));
        jPanel8.add(TXThernias, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 300, 40));

        TXTginecologo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTginecologo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ginecologo"));
        jPanel8.add(TXTginecologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 300, 40));

        TXTprostata.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTprostata.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Prostata"));
        jPanel8.add(TXTprostata, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 300, 40));

        TXTneurologico.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTneurologico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Neurológico"));
        jPanel8.add(TXTneurologico, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 300, 40));

        TXTvenas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTvenas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Venas"));
        jPanel8.add(TXTvenas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 300, 40));

        TXTarterias.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTarterias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Arterias"));
        jPanel8.add(TXTarterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 300, 40));

        TXTtension.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tension Arterial"));
        jPanel8.add(TXTtension, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 170, 40));

        TXTaspecto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aspecto Contextura"));
        jPanel8.add(TXTaspecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 170, 40));

        TXTabdominal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Abdominal (cm)"));
        jPanel8.add(TXTabdominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 130, 40));

        TXTcadera.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadera (cm)"));
        jPanel8.add(TXTcadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 130, 40));

        BtnAexamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/agregar2.png"))); // NOI18N
        BtnAexamen.setBorder(null);
        BtnAexamen.setContentAreaFilled(false);
        BtnAexamen.setEnabled(false);
        jPanel8.add(BtnAexamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 110, 30));

        BtnMexamen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/modificar.png"))); // NOI18N
        BtnMexamen.setBorder(null);
        BtnMexamen.setContentAreaFilled(false);
        BtnMexamen.setEnabled(false);
        jPanel8.add(BtnMexamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 110, 30));

        jTabbedPane2.addTab("Examen Físico |", jPanel8);

        Electro.setBackground(new java.awt.Color(255, 255, 255));
        Electro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTVentricular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTVentricular.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VENTRICULAR"));
        Electro.add(TXTVentricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 300, 40));

        TXTSupraventricular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTSupraventricular.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SUPRAVENTRICULAR "));
        Electro.add(TXTSupraventricular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, 40));

        TXTQTc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTQTc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "QTc"));
        Electro.add(TXTQTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 80, 40));

        TXTFrec.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTFrec.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FREC | DPM"));
        Electro.add(TXTFrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 130, 40));

        TXTpr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PR"));
        Electro.add(TXTpr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 80, 40));

        TXTQrs.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTQrs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "QRS"));
        Electro.add(TXTQrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 80, 40));

        TXTAqrs.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTAqrs.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AQRS"));
        Electro.add(TXTAqrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 80, 40));

        TXTTxtQTm.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTTxtQTm.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "QTm"));
        Electro.add(TXTTxtQTm, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 80, 40));

        TXTauriculo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTauriculo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TRASTORNOS DE CONDUCCIÓN  AURICULO VENTRICULAR  "));
        Electro.add(TXTauriculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 320, 40));

        TxtIntraventicular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtIntraventicular.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TRASTORNO DE CONDUCCIÓN INTRAVENTRICULAR "));
        Electro.add(TxtIntraventicular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 280, 40));

        TXTCrecimiento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTCrecimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CRECIMIENTO DE CAVIDADES "));
        Electro.add(TXTCrecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 300, 40));

        TXTRepolarizacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTRepolarizacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "REPOLARIZACIÓN"));
        Electro.add(TXTRepolarizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 320, 40));

        TXTecg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTecg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ECG DE REFERENCIA"));
        Electro.add(TXTecg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 320, 40));

        TXTtopografico.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtopografico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DIAGNÓSTICO TOPOGRÁFICO"));
        Electro.add(TXTtopografico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 300, 40));

        TXTzei.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTzei.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ZEI"));
        Electro.add(TXTzei, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 280, 40));

        jTextTratatamiento.setColumns(20);
        jTextTratatamiento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextTratatamiento.setLineWrap(true);
        jTextTratatamiento.setRows(5);
        jTextTratatamiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "TRATAMIENTO ADMINISTRADO AL INGRESO"));
        jScrollPane12.setViewportView(jTextTratatamiento);

        Electro.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 450, 100));

        TXTterapeutico.setColumns(20);
        TXTterapeutico.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TXTterapeutico.setLineWrap(true);
        TXTterapeutico.setRows(5);
        TXTterapeutico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "MANEJO DIAGNÓSTICO Y TERAPÉUTICO "));
        jScrollPane13.setViewportView(TXTterapeutico);

        Electro.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 450, 90));

        jTexttrombolitico.setColumns(20);
        jTexttrombolitico.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTexttrombolitico.setLineWrap(true);
        jTexttrombolitico.setRows(5);
        jTexttrombolitico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "ADMINISTRACIÓN DE TROMBOLITICO"));
        jScrollPane14.setViewportView(jTexttrombolitico);

        Electro.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 430, 100));

        jTextIngreso.setColumns(20);
        jTextIngreso.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextIngreso.setLineWrap(true);
        jTextIngreso.setRows(5);
        jTextIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DIAGNÓSTICO DE INGRESO"));
        jScrollPane20.setViewportView(jTextIngreso);

        Electro.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 450, 100));

        jTextCriterios.setColumns(20);
        jTextCriterios.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextCriterios.setLineWrap(true);
        jTextCriterios.setRows(5);
        jTextCriterios.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CRITERIOS DE REPERFUSIÓN"));
        jScrollPane22.setViewportView(jTextCriterios);

        Electro.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 430, 100));

        jTextManejo.setColumns(20);
        jTextManejo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextManejo.setLineWrap(true);
        jTextManejo.setRows(5);
        jTextManejo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "COMPLICACIONES DE LA TROMBOLISIS Y MANEJO DE LAS MISMAS"));
        jScrollPane23.setViewportView(jTextManejo);

        Electro.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 430, -1));

        TxtDiagnosticoElectro.setColumns(20);
        TxtDiagnosticoElectro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtDiagnosticoElectro.setLineWrap(true);
        TxtDiagnosticoElectro.setRows(5);
        TxtDiagnosticoElectro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DIAGNÓSTICO ELECTROCARDIOGRÁFICO"));
        jScrollPane10.setViewportView(TxtDiagnosticoElectro);

        Electro.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 100));

        jLabel17.setText("Trazo:");
        Electro.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 40, 20));

        jNosinusal.setBackground(new java.awt.Color(255, 255, 255));
        jNosinusal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jNosinusal.setText("NO SINUSAL");
        jNosinusal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNosinusalActionPerformed(evt);
            }
        });
        Electro.add(jNosinusal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jRadioSinusal.setBackground(new java.awt.Color(255, 255, 255));
        jRadioSinusal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioSinusal.setText("SINUSAL");
        jRadioSinusal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSinusalActionPerformed(evt);
            }
        });
        Electro.add(jRadioSinusal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel19.setText("Ritmo:");
        Electro.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 40, 20));

        jRadioTrazo2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioTrazo2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioTrazo2.setText("Anormal");
        jRadioTrazo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioTrazo2ActionPerformed(evt);
            }
        });
        Electro.add(jRadioTrazo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        JRadioTrazo.setBackground(new java.awt.Color(255, 255, 255));
        JRadioTrazo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        JRadioTrazo.setText("Normal");
        JRadioTrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioTrazoActionPerformed(evt);
            }
        });
        Electro.add(JRadioTrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jTabbedPane2.addTab("Electro |", Electro);

        Laboratorio.setBackground(new java.awt.Color(255, 255, 255));
        Laboratorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTprot.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTprot.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PROT/T"));
        Laboratorio.add(TXTprot, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 150, 40));

        TXThb.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXThb.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "HB"));
        Laboratorio.add(TXThb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 40));

        TXTplaquetas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTplaquetas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PLAQUETAS"));
        Laboratorio.add(TXTplaquetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 150, 40));

        TXTglicemia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTglicemia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "GLICEMIA"));
        Laboratorio.add(TXTglicemia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, 40));

        TXTcolesterol.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTcolesterol.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "COLESTEROL"));
        Laboratorio.add(TXTcolesterol, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 150, 40));

        TXTna.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTna.setText(" ");
        TXTna.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "NA+"));
        Laboratorio.add(TXTna, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 150, 40));

        TXThematocrito.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXThematocrito.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "HEMATOCRITO"));
        Laboratorio.add(TXThematocrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 40));

        TXTpt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PT"));
        Laboratorio.add(TXTpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 40));

        TXTurea.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTurea.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "UREA"));
        Laboratorio.add(TXTurea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, 40));

        TXThdl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXThdl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "HDL"));
        Laboratorio.add(TXThdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 150, 40));

        TXTk.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTk.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "K+"));
        Laboratorio.add(TXTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 150, 40));

        TXTalbumina.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTalbumina.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "ALBUMINA"));
        Laboratorio.add(TXTalbumina, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 150, 40));

        TXTcreatinina.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTcreatinina.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CREATININA"));
        Laboratorio.add(TXTcreatinina, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 150, 40));

        TXTleucocitos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTleucocitos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "LEUCOCITOS"));
        Laboratorio.add(TXTleucocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 40));

        TXTldl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTldl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "LDL"));
        Laboratorio.add(TXTldl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 150, 40));

        TXThiv.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXThiv.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "HIV"));
        Laboratorio.add(TXThiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 150, 40));

        TXTmg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTmg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MG+"));
        Laboratorio.add(TXTmg, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 150, 40));

        TXTpttt.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpttt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PTT"));
        Laboratorio.add(TXTpttt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 150, 40));

        TXTtrigliceridos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtrigliceridos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TRIGLICÉRIDOS"));
        Laboratorio.add(TXTtrigliceridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, 40));

        TXTinr.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTinr.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "INR"));
        Laboratorio.add(TXTinr, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 150, 40));

        TXTtfg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtfg.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TFG"));
        Laboratorio.add(TXTtfg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 150, 40));

        TXTtgp.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtgp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TGP"));
        Laboratorio.add(TXTtgp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 150, 40));

        TXTneutrofilos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTneutrofilos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "NEUTROFILOS"));
        Laboratorio.add(TXTneutrofilos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 40));

        TXTvdrl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTvdrl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VDRL"));
        Laboratorio.add(TXTvdrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 150, 40));

        TXTlinfocitos.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTlinfocitos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "LINFOCITOS"));
        Laboratorio.add(TXTlinfocitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        TXTbpn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTbpn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BPN"));
        Laboratorio.add(TXTbpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 150, 40));

        TXTacurico.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTacurico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AC. ÚRICO"));
        Laboratorio.add(TXTacurico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 150, 40));

        TXTfibrinogeno.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTfibrinogeno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FIBRINÓGENO"));
        Laboratorio.add(TXTfibrinogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 150, 40));

        TXTtgo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtgo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TGO"));
        Laboratorio.add(TXTtgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 150, 40));

        TXTtroponina2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtroponina2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TROPONINA 2"));
        Laboratorio.add(TXTtroponina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, 40));

        TXTtroponina3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtroponina3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TROPONINA 3"));
        Laboratorio.add(TXTtroponina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 280, 40));

        jLabel24.setText("Fecha del estudio:");
        Laboratorio.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 40));

        TXTtroponina1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtroponina1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TROPONINA 1"));
        Laboratorio.add(TXTtroponina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 280, 40));

        fecha3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha 3"));
        try {
            fecha3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Laboratorio.add(fecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 180, 40));

        try {
            labDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Laboratorio.add(labDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 30));

        fecha1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha 1"));
        try {
            fecha1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Laboratorio.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 180, 40));

        fecha2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha 2"));
        try {
            fecha2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Laboratorio.add(fecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 180, 40));

        jTabbedPane2.addTab("Laboratorio |", Laboratorio);

        Rayosx.setBackground(new java.awt.Color(255, 255, 255));
        Rayosx.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtxtRayosx.setColumns(20);
        JtxtRayosx.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JtxtRayosx.setLineWrap(true);
        JtxtRayosx.setRows(5);
        JtxtRayosx.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Rayos x de torax"));
        jScrollPane24.setViewportView(JtxtRayosx);

        Rayosx.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 710, 110));

        TXTvalvulas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTvalvulas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VÁLVULAS"));
        TXTvalvulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTvalvulasActionPerformed(evt);
            }
        });
        Rayosx.add(TXTvalvulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 440, 40));

        TXTmitral.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTmitral.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MITRAL"));
        TXTmitral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTmitralActionPerformed(evt);
            }
        });
        Rayosx.add(TXTmitral, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 440, 40));

        dateRayosx.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha del estudio"));
        try {
            dateRayosx.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Rayosx.add(dateRayosx, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 160, 40));

        TxtiAuriculazquierda.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TxtiAuriculazquierda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AURÍCULA IZQUIERDA"));
        TxtiAuriculazquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtiAuriculazquierdaActionPerformed(evt);
            }
        });
        Rayosx.add(TxtiAuriculazquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 440, 40));

        TXTauriculaderecha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTauriculaderecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AURÍCULA DERECHA"));
        TXTauriculaderecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTauriculaderechaActionPerformed(evt);
            }
        });
        Rayosx.add(TXTauriculaderecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 440, 40));

        TXTventriculoizquierdo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTventriculoizquierdo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VENTRÍCULO IZQUIERDO"));
        TXTventriculoizquierdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTventriculoizquierdoActionPerformed(evt);
            }
        });
        Rayosx.add(TXTventriculoizquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 440, 40));

        TXTaortica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTaortica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AORTICA"));
        TXTaortica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTaorticaActionPerformed(evt);
            }
        });
        Rayosx.add(TXTaortica, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 440, 40));

        TXTtricuspide.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTtricuspide.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TRICÚSPIDE"));
        TXTtricuspide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtricuspideActionPerformed(evt);
            }
        });
        Rayosx.add(TXTtricuspide, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 440, 40));

        TXTcontractilidad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTcontractilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CONTRACTILIDAD"));
        TXTcontractilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcontractilidadActionPerformed(evt);
            }
        });
        Rayosx.add(TXTcontractilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 440, 40));

        TXTventriculoderecho.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTventriculoderecho.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "VENTRÍCULO DERECHO"));
        TXTventriculoderecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTventriculoderechoActionPerformed(evt);
            }
        });
        Rayosx.add(TXTventriculoderecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 440, 40));

        TXTpericardio.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpericardio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PERICARDIO"));
        TXTpericardio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTpericardioActionPerformed(evt);
            }
        });
        Rayosx.add(TXTpericardio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 440, 40));

        TXTeyeccion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTeyeccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FRACCIÓN DE EYECCIÓN"));
        TXTeyeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTeyeccionActionPerformed(evt);
            }
        });
        Rayosx.add(TXTeyeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 440, 40));

        TXTpulmonar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpulmonar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PULMONAR"));
        TXTpulmonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTpulmonarActionPerformed(evt);
            }
        });
        Rayosx.add(TXTpulmonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 440, 40));

        TXTotros.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTotros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Otros"));
        TXTotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTotrosActionPerformed(evt);
            }
        });
        Rayosx.add(TXTotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 440, 40));

        TXTpsap.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTpsap.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PSAP/MMHG"));
        TXTpsap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTpsapActionPerformed(evt);
            }
        });
        Rayosx.add(TXTpsap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 440, 40));

        TXTsistolica.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        TXTsistolica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FUNCIÓN SISTÓLICA VD "));
        TXTsistolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTsistolicaActionPerformed(evt);
            }
        });
        Rayosx.add(TXTsistolica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 440, 40));

        jLabel1.setText("Estudios ecograficos");
        Rayosx.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        Rayosx.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 152, 880, 10));

        jTabbedPane2.addTab("Estudios |", Rayosx);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextExamenAdic.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Examen"));
        jPanel4.add(jTextExamenAdic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 760, 40));

        jScrollPane31.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane31.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe / Interpretación"));

        jTextObservAdic.setColumns(20);
        jTextObservAdic.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextObservAdic.setLineWrap(true);
        jTextObservAdic.setRows(5);
        jTextObservAdic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextObservAdicMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextObservAdicMouseReleased(evt);
            }
        });
        jTextObservAdic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextObservAdicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextObservAdicKeyTyped(evt);
            }
        });
        jScrollPane31.setViewportView(jTextObservAdic);

        jPanel4.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 150));

        jButton21.setText("Agregar");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 70, 40));

        jAdcModif.setText("Modificar");
        jAdcModif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jAdcModif.setContentAreaFilled(false);
        jAdcModif.setEnabled(false);
        jAdcModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdcModifActionPerformed(evt);
            }
        });
        jPanel4.add(jAdcModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 70, 40));

        jAdcDelete.setText("Retirar");
        jAdcDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jAdcDelete.setContentAreaFilled(false);
        jAdcDelete.setEnabled(false);
        jAdcDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdcDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jAdcDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 70, 40));

        jButton18.setText("Cancelar");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.setContentAreaFilled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 70, 40));

        jTableAdic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Examen", "Descripción"
            }
        ));
        jTableAdic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAdicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableAdicMouseEntered(evt);
            }
        });
        jScrollPane25.setViewportView(jTableAdic);

        jPanel4.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 860, 310));

        jTabbedPane2.addTab("Complementario |", jPanel4);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnImprimirHistoria.setText("Imprimir");
        BtnImprimirHistoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnImprimirHistoria.setContentAreaFilled(false);
        BtnImprimirHistoria.setEnabled(false);
        BtnImprimirHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirHistoriaActionPerformed(evt);
            }
        });
        jPanel10.add(BtnImprimirHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 150, 40));

        jConclusion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Buenas condiciones de salud", "Buenas condiciones de salud con recomendaciones médicas", "Elegible con recomenciones / restricciones", "Elegible con recomendaciones médicas", "Elegible para el cargo propuesto", "Se encuentra en buenas condiciones de salud para su egreso", "Espera por resultados de examenes paraclínicos", "No elegible para el cargo propuesto", "No se encuentra en buenas condiciones de salud", "Se encuentra en buenas condiciones de salud para el reintegro", "Reintegro con recomendaciones / restricciones médicas", "Diferido", "Sano sin hábitos", "Sano con hábitos", "En riesgo", "Enfermo erradicable", "Enfermo controlable", "Con secuelas" }));
        jConclusion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Indicador cualitativo de salud (resultado)")));
        jConclusion.setOpaque(false);
        jPanel10.add(jConclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 850, 50));

        jTextRecomendacion.setColumns(20);
        jTextRecomendacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextRecomendacion.setLineWrap(true);
        jTextRecomendacion.setRows(5);
        jTextRecomendacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Recomendaciones"));
        jScrollPane5.setViewportView(jTextRecomendacion);

        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 850, 200));

        jTextConclusion.setColumns(20);
        jTextConclusion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextConclusion.setLineWrap(true);
        jTextConclusion.setRows(5);
        jTextConclusion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Conclusión"));
        jScrollPane8.setViewportView(jTextConclusion);

        jPanel10.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 850, 210));

        BtnGuardar.setText("Guardar");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGuardar.setContentAreaFilled(false);
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel10.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 140, 40));

        BtnImprimirHistoria2.setText("Cancelar");
        BtnImprimirHistoria2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnImprimirHistoria2.setContentAreaFilled(false);
        BtnImprimirHistoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImprimirHistoria2ActionPerformed(evt);
            }
        });
        jPanel10.add(BtnImprimirHistoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 110, 40));

        BtnGuardar1.setText("Vista Previa");
        BtnGuardar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnGuardar1.setContentAreaFilled(false);
        BtnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardar1ActionPerformed(evt);
            }
        });
        jPanel10.add(BtnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 140, 40));

        jTabbedPane2.addTab("Conclusión |", jPanel10);

        JPanelHistoria.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 610));

        tabbedAntecedentes.addTab("Historia Clinica |", JPanelHistoria);

        JPanelAnteriores.setBackground(new java.awt.Color(255, 255, 255));
        JPanelAnteriores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableVisualizarC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Doctor", "Reporte", "Fecha", "Estado"
            }
        ));
        jTableVisualizarC.setComponentPopupMenu(PopupHistorias);
        jTableVisualizarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVisualizarCMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableVisualizarC);

        JPanelAnteriores.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 900, 550));

        tabbedAntecedentes.addTab("Evolución & citas anteriores |", JPanelAnteriores);

        jPanel1.add(tabbedAntecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 930, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgBotones/magnifier-1_icon-icons.com_56924.png"))); // NOI18N
        BtnSearch.setBorderPainted(false);
        BtnSearch.setContentAreaFilled(false);
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 50, 50));

        FechaAc4.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        FechaAc4.setText("             B U S C A R        P A C I E N T E");
        jPanel2.add(FechaAc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 30));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 10));

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
        jPanel2.add(TXTPcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 330, 100));

        JPregistro.setBackground(new java.awt.Color(255, 255, 255));
        JPregistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPregistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAc5.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc5.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        FechaAc5.setText("                           P A C I E N T E ");
        jPanel22.add(FechaAc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 30));

        JPregistro.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTPnombre.setEditable(false);
        TXTPnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre")));
        TXTPnombre.setOpaque(false);
        TXTPnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPnombreActionPerformed(evt);
            }
        });
        jPanel13.add(TXTPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 50));

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
        jPanel13.add(TXTPtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 50));

        TXTPapellido.setEditable(false);
        TXTPapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Apellido"));
        TXTPapellido.setOpaque(false);
        jPanel13.add(TXTPapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, 50));

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

        jPanel13.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, 50));

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel111.setText("Fecha de nacimiento");
        jPanel13.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 60));

        FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        FechaNacimiento.setToolTipText("");
        FechaNacimiento.setEnabled(false);
        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel13.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, 30));

        TXTPdireccion.setEditable(false);
        TXTPdireccion.setColumns(20);
        TXTPdireccion.setLineWrap(true);
        TXTPdireccion.setRows(5);
        TXTPdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dirección"));
        jScrollPane2.setViewportView(TXTPdireccion);

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 310, 150));

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
        jPanel13.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 120, 40));

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
        jPanel13.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 120, 40));
        jPanel13.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 320, 20));

        TXTPcorreo.setEditable(false);
        TXTPcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Correo")));
        TXTPcorreo.setOpaque(false);
        TXTPcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPcorreoActionPerformed(evt);
            }
        });
        jPanel13.add(TXTPcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 50));

        JTabbedPacientes.addTab("tab2", jPanel13);

        JPregistro.add(JTabbedPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        jPanel1.add(JPregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    private void FechaAsignar1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaAsignar1FocusLost
     
  
    }//GEN-LAST:event_FechaAsignar1FocusLost

  
    private void FechaAsignar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaAsignar1PropertyChange
    String fechaActual = new SimpleDateFormat("yyyy-MM-dd").format(Fecha.getTime());  
    String fechaNueva = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar1.getDate());  
  
   if(!fechaActual.equals(fechaNueva)) {

        
        if (filaPaciente != -1) {
        limpiarTVisualizar();
        visualizar_PdfVO(jTableVisualizarC);
        }

 
}

    }//GEN-LAST:event_FechaAsignar1PropertyChange


    private void tabbedAntecedentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedAntecedentesMouseClicked
    /*
        if (JOptionPane.showConfirmDialog(rootPane, "¿Deseas utilizar los datos previos registrados de este paciente?",
            "Historias", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {}
    
    else{cleanHistorias();}
     
        */
    }//GEN-LAST:event_tabbedAntecedentesMouseClicked

    
    
    private void BtnImprimirHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirHistoriaActionPerformed
    
        
      if(jTextMotivoConsulta.getText().equals("")){
      JOptionPane.showMessageDialog(this, "DEBE COMPLETAR EL CAMPO MOTIVO CONSULTA", "CAMPOS", 1);
      
      }  
      
      
      else if(estadoEstudio.equals("Pendiente")){
      
      
      
      idAsignar=idCallestudios;
       pdfHistorias();
       guardarHistoria();
       ActualizarHistoriaBdpdf();
     
       
       limpiarTVisualizar();
       visualizar_PdfVOHistorias(jTableVisualizarC);
   
   
      BtnSearch.setEnabled(true);
         JOptionPane.showMessageDialog(null, "GENERANDO REPORTE...", "REPORTE CONSULTA", 1);
      }
      
      
      else{
          
          
   
       
       
       
       pdfHistorias();
       guardarHistoria();
       ActualizarHistoriaBdpdf();
   
     
       
       limpiarTVisualizar();
       visualizar_PdfVOHistorias(jTableVisualizarC);
    
     //BtnImprimirHistoria.setEnabled(false);
     BtnSearch.setEnabled(true);
      }
    
    }//GEN-LAST:event_BtnImprimirHistoriaActionPerformed

    
    int idtablaproceso;
    String nombreAntc1;
int  idtablaConsulta;
int  idtablaHistorias;
int  idFromConsulta;
JButton boton;
    private void jTableVisualizarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVisualizarCMouseClicked

        
     
        int column = jTableVisualizarC.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTableVisualizarC.getRowHeight();
        
           
         //----------------------------------------------------------------
                               
                                    
             
  
        if (row < jTableVisualizarC.getRowCount() && row >= 0 && column < jTableVisualizarC.getColumnCount() && column >= 0) {
            idtablaHistorias = (int) jTableVisualizarC.getValueAt(row, 0);
            Object value = jTableVisualizarC.getValueAt(row, column);
        
        
        if (value instanceof JButton) {
          ((JButton) value).doClick();
          boton = (JButton) value;
         
          
          if (boton.getText().equals("Vacio")) {
                    JOptionPane.showMessageDialog(null, "No hay archivo", "Archivos", 1);
                } 
                
                
                 else {
                       AddPdfConsultaDao pd = new AddPdfConsultaDao();
                    pd.ejecutar_archivoPDFHistorias(idtablaHistorias);
                    try {
                        JOptionPane.showMessageDialog(null,"Abriendo reporte...","Reporte",1);
                        Desktop.getDesktop().open(new File("ConsultaHistoria.pdf"));
                    } catch (Exception ex) {JOptionPane.showMessageDialog(null,ex);}
                }

        }
        

        
        }  
             
   jTableVisualizarC.requestFocusInWindow();
                
                
    }//GEN-LAST:event_jTableVisualizarCMouseClicked
  int filaPaciente;
    private void jRadioAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAFActionPerformed
        this.jRadioAF.setSelected(true);
        jRadioAPP.setSelected(false);
     
        jTabbedPane3.setSelectedIndex(0);
        
        
        limpiarTAntecedentes();
        listarAntecedentes();
        jRadioAF.setSelected(true);
        
    }//GEN-LAST:event_jRadioAFActionPerformed

    private void jRadioAPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioAPPActionPerformed
        jRadioAF.setSelected(false);
        this.jRadioAPP.setSelected(true);
        limpiarTAntecedentesPerso();
        listarAntecedentespersonales();
        jTabbedPane3.setSelectedIndex(1);
        
        
          
        
        
        
        
        
    }//GEN-LAST:event_jRadioAPPActionPerformed

    

    String EnfermedadAF="";
    
    
    String TextAntPersonal="";
    private void jCheckConstitucionalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckConstitucionalStateChanged
    
     
        
        
        
    }//GEN-LAST:event_jCheckConstitucionalStateChanged


         String constitucional="", 
                piel="", 
                orl="",
                respiratorio="",
                Angina="",
                Palpitaciones="",
                Síncope="",
                EndemaMsis="",
                DolorAbdominal="",
                Flatulencia="",
                Estreñimiento="",
                DolorMuscular="",
                DolorArticular="",
                Inflamación="",
                Cefalea="",
                Migraña="",
                Debilidad="",
                Disestesia="",
                Parestesia="",
                Genito="",
                Endocrino="",
                Anticonceptivos="",
                Angustia="",
                Alergias="",
                Otros="";
                        
                
         
         
         
    private void jCheckConstitucionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckConstitucionalActionPerformed
         if(jCheckConstitucional.isSelected()){
         
         constitucional="  Constitucional ";
         }
         else{constitucional="";}
   
    }//GEN-LAST:event_jCheckConstitucionalActionPerformed

    
    
    
    private void jCheckPielMucosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPielMucosaActionPerformed

     if(jCheckPielMucosa.isSelected()){
         
         piel="  Piel y mucosa ";
         }
         else{piel="";}
    }//GEN-LAST:event_jCheckPielMucosaActionPerformed

    private void jCheckORLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckORLActionPerformed
  if(jCheckORL.isSelected()){
         
         orl="  ORL/sentidos ";
         }
         else{orl="";}
    }//GEN-LAST:event_jCheckORLActionPerformed

    private void jCheckRespiratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRespiratorioActionPerformed
  if(jCheckRespiratorio.isSelected()){
         
         respiratorio="  Respiratorio/disnea ";
         }
         else{respiratorio="";}
    }//GEN-LAST:event_jCheckRespiratorioActionPerformed

    private void jCheckAnginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAnginaActionPerformed
           if(jCheckAngina.isSelected()){
         
         Angina="  Angina ";
         }
         else{Angina="";}
    }//GEN-LAST:event_jCheckAnginaActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
                 if(jCheckBox9.isSelected()){
         
         Palpitaciones="  Palpitaciones ";
         }
         else{Palpitaciones="";}
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
                      if(jCheckBox16.isSelected()){
         
         Síncope="  Síncope ";
         }
         else{Síncope="";}
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
                         if(jCheckBox20.isSelected()){
         
        EndemaMsis="  Endema Msis ";
         }
         else{EndemaMsis="";}
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
            
        if(jCheckBox6.isSelected()){
         
       DolorAbdominal="  Dolor Abdominal ";
         }
         else{DolorAbdominal="";}
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
              if(jCheckBox10.isSelected()){
         
       Flatulencia="  Flatulencia ";
         }
         else{Flatulencia="";}
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
       if(jCheckBox17.isSelected()){
         
       Estreñimiento="  Estreñimiento ";
         }
         else{Estreñimiento="";}
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
       if(jCheckBox7.isSelected()){
         
       DolorMuscular="  Dolor Muscular ";
         }
         else{DolorMuscular="";}
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
       if(jCheckBox11.isSelected()){
         
       DolorArticular="  Dolor Muscular ";
         }
         else{DolorArticular="";}
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
       if(jCheckBox15.isSelected()){
         
       Inflamación="  Inflamación ";
         }
         else{Inflamación="";}
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected()){
         
       Cefalea="  Cefalea ";
         }
         else{Cefalea="";}
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
       if(jCheckBox12.isSelected()){
         
       Migraña="  Migraña ";
         }
         else{Migraña="";}
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
       if(jCheckBox14.isSelected()){
         
       Debilidad="  Debilidad ";
         }
         else{Debilidad="";}
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        if(jCheckBox19.isSelected()){
         
       Disestesia="  Disestesia ";
         }
         else{Disestesia="";}
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
            if(jCheckBox27.isSelected()){
         
       Parestesia="  Parestesia ";
         }
         else{Parestesia="";}
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
               if(jCheckBox18.isSelected()){
         
       Genito="  Genito-Urinario ";
         }
         else{Genito="";}
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        if(jCheckBox25.isSelected()){
         
       Endocrino="  Endocrino ";
         }
         else{Endocrino="";}
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
            if(jCheckBox22.isSelected()){
         
       Anticonceptivos="  Anticonceptivos ";
         }
         else{Anticonceptivos="";}
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
             if(jCheckBox23.isSelected()){
         
       Angustia="  Angustia ";
         }
         else{Angustia="";}
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
             if(jCheckBox24.isSelected()){
         
       Alergias="  Alergias ";
         }
         else{Alergias="";}
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
                  if(jCheckBox28.isSelected()){
         
       Otros="  Otros ";
         }
         else{Otros="";}
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void FechaAsignar2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaAsignar2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaAsignar2FocusLost

    private void FechaAsignar2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FechaAsignar2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaAsignar2PropertyChange

    
    int partos, cesareas, abortos, embarazos=0;
    private void jSpartosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpartosStateChanged
       
        
         partos= (Integer) this.jSpartos.getValue();
         cesareas= (Integer) this.jScesareas.getValue();
         abortos= (Integer) this.jSabortos.getValue();
         
         embarazos=partos+cesareas+abortos;
         jSembarazo.setValue(embarazos);
        
    }//GEN-LAST:event_jSpartosStateChanged

    private void jScesareasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jScesareasStateChanged
       partos= (Integer) this.jSpartos.getValue();
         cesareas= (Integer) this.jScesareas.getValue();
         abortos= (Integer) this.jSabortos.getValue();
         
         embarazos=partos+cesareas+abortos;
         jSembarazo.setValue(embarazos);
    }//GEN-LAST:event_jScesareasStateChanged

    private void jSabortosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSabortosStateChanged
          partos= (Integer) this.jSpartos.getValue();
         cesareas= (Integer) this.jScesareas.getValue();
         abortos= (Integer) this.jSabortos.getValue();
         
         embarazos=partos+cesareas+abortos;
         jSembarazo.setValue(embarazos);
    }//GEN-LAST:event_jSabortosStateChanged

    
    
    double altura=0, pesoactual=0, pesoideal=0, pesoextra=0, imc=0;
    private void TXTtallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTtallaKeyReleased
       

       

       
        if (!TXTtalla.getText().isEmpty() && !Sexo.equals("")) {
            calcularpeso();
       }
        
    }//GEN-LAST:event_TXTtallaKeyReleased

    private void TXTpesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTpesoKeyReleased
         
    
       
       

       
        if (!TXTpeso.getText().isEmpty() && !Sexo.equals("")) {
        calcularpeso();
        
        
        }
    }//GEN-LAST:event_TXTpesoKeyReleased

    
    
    
    public void calcularpeso(){
        
       DecimalFormat formato = new DecimalFormat("##.##");
       altura=0;
       pesoactual=0;
       pesoideal=0;
       pesoextra=0;
       imc=0;
    
        altura = Double.parseDouble(TXTtalla.getText());
        pesoactual = Double.parseDouble(TXTpeso.getText());
        

 double alturaMetros = altura / 100;           
 imc = pesoactual / (alturaMetros * alturaMetros);           


 if(Sexo.equals("Masculino")){ pesoideal = (altura - 100) - ((altura - 150) / 4);}
 else  if(Sexo.equals("Femenino")){ pesoideal = (altura - 100) - ((altura - 150) / 2);}
 
 
 pesoextra = pesoactual - pesoideal;
        
        
        
         TXTimc.setText(String.valueOf(formato.format(imc)));
         TXTpesoIdeal.setText(String.valueOf(formato.format(pesoideal)));
         TXTpesoAdic.setText(String.valueOf(formato.format(pesoextra)));
    
    }
    
    
    
    
    
    
    private void TXTtallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTtallaKeyTyped
    char car = evt.getKeyChar();

        // Permitir dígitos y punto decimal
        if (Character.isDigit(car) || car == '.') {
            String caracteres = TXTtalla.getText();

            // Limitar a 4 caracteres
            if (caracteres.length() == 4 && !Character.isDigit(car)) {
                evt.consume(); // Consumir el evento si se intenta agregar más caracteres después del límite
            }
            // Permitir la entrada
            return;
        }

        // Permitir teclas de control (como retroceso)
        if (Character.isISOControl(car)) {
            return;
        }

        // Consumir el evento si el carácter no es válido
        evt.consume();
    }//GEN-LAST:event_TXTtallaKeyTyped

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
    
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        
        
        
       if(estadoEstudio.equals("Pendiente")){
      
      
      
       idAsignar=idCallestudios;
       ActualizarHistoriaBd();
   
      //  System.out.println("Estas entrando en guardado desde corregir");
      // BtnSearch.setEnabled(true);
       
      }
       
       
       
           else{
           ActualizarHistoriaBd();
           insertbdAntc1();
           insertbdAntc2();
           setState.CompletarHistoria(106,  idAsignar);

           }
             
            



    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void jcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcorreoActionPerformed
       int fila = jTableVisualizarC.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe selecionar una Fila");
        } 
       
        
        
        else {
            
            try{
             //   limpiarTVisualizar();
             //   visualizar_PdfVOHistorias(jTableVisualizarC);
          
                 
                 
                    PdfDAO1 pd = new PdfDAO1();
                    pd.correo_archivoPDF(idtablaHistorias);
        
                    email2();
                    
                    
        } catch(Exception e){JOptionPane.showMessageDialog(null, "No hay archivo", "Archivos", 1);
                             System.out.println(e);
        
        }
             
           
            
        }

    }//GEN-LAST:event_jcorreoActionPerformed
  
    
    int antcid1;
    String ShowAntcObs="",ShowName1;
    
    
    
    
    
    private void BtnImprimirHistoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImprimirHistoria2ActionPerformed
           if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea cancelar la historia clinica?",
            "Cancelar historia", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

        cleanHistorias();
        BtnImprimirHistoria.setEnabled(false); 
        estadoEstudio="";


        
          limpiarTVisualizar();
           }
    }//GEN-LAST:event_BtnImprimirHistoria2ActionPerformed

    private void TXTPnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPnombreActionPerformed

    }//GEN-LAST:event_TXTPnombreActionPerformed

    private void TXTPtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPtelefonoActionPerformed

    
    
    String Sexo;
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
            || TXTPcedula.getText().equals("") || TXTPtelefono.getText().equals("") || TXTPdireccion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);

        } /*else if (mather.find() == false) {
            JOptionPane.showMessageDialog(null, "EMAIL INVALIDO, VERIFIQUE", "EMAIL INVALIDO", JOptionPane.ERROR_MESSAGE);
            this.TXTPcorreo.requestFocus();
        }*/

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
                    BtnImprimirHistoria.setEnabled(true);
                    //      TxtMotivo.setEnabled(true);
              

                }

            }catch(Exception e){System.out.println(e);}
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        limpiarCampos();
        JTabbedPacientes.setSelectedIndex(0);
        JPregistro.setVisible(false);
        TXTPcedula.setText("V-");
        BtnSearch.setEnabled(true);
        BtnAgregar.setEnabled(true);

        cantidad=0;
        BtnSearch.setEnabled(true);

    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed

        if(TXTPcedula.getText().equals("V-") || TXTPcedula.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "CAMPO VACIO O CÉDULA INVALIDA", "CEDULA", JOptionPane.ERROR_MESSAGE);
            TXTPcedula.setText("V-");
        }
        else
        {
            
            
            Callpacient();
            cleanHistorias();
            BtnSearch.setEnabled(false);
          

        }

    }//GEN-LAST:event_BtnSearchActionPerformed

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

    private void JcheckIsquemicaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JcheckIsquemicaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JcheckIsquemicaStateChanged

    private void JcheckIsquemicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcheckIsquemicaActionPerformed
      if (JcheckIsquemica.isSelected()){
      
      TxtIsquemica.setEnabled(true);
      }
      
      else{ TxtIsquemica.setEnabled(false);}
    }//GEN-LAST:event_JcheckIsquemicaActionPerformed

    private void jCheckPercutaneaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckPercutaneaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckPercutaneaStateChanged

    private void jCheckPercutaneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPercutaneaActionPerformed
            if (jCheckPercutanea.isSelected()){
      
      TxtPercutanea.setEnabled(true);
      }
      
      else{ TxtPercutanea.setEnabled(false);}
    }//GEN-LAST:event_jCheckPercutaneaActionPerformed

    private void jCheckPERIFERICAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckPERIFERICAStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckPERIFERICAStateChanged

    private void jCheckPERIFERICAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckPERIFERICAActionPerformed
       if (jCheckPERIFERICA.isSelected()){
      
      TXTPERIFERICA.setEnabled(true);
      }
      
      else{ TXTPERIFERICA.setEnabled(false);}
    }//GEN-LAST:event_jCheckPERIFERICAActionPerformed

    private void jCheckQuirurgicaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckQuirurgicaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckQuirurgicaStateChanged

    private void jCheckQuirurgicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckQuirurgicaActionPerformed
     if (jCheckQuirurgica.isSelected()){
      
      TxtQuirurgica.setEnabled(true);
      }
      
      else{ TxtQuirurgica.setEnabled(false);}
    }//GEN-LAST:event_jCheckQuirurgicaActionPerformed

    private void JcheckEstructuralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JcheckEstructuralStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JcheckEstructuralStateChanged

    private void JcheckEstructuralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcheckEstructuralActionPerformed
             if (JcheckEstructural.isSelected()){
      
      TxtEstrictural.setEnabled(true);
      }
      
      else{ TxtEstrictural.setEnabled(false);}
    }//GEN-LAST:event_JcheckEstructuralActionPerformed

    private void jCheckDilatadaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckDilatadaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckDilatadaStateChanged

    private void jCheckDilatadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDilatadaActionPerformed
            if (jCheckDilatada.isSelected()){
      
      Txtdilatada.setEnabled(true);
      }
      
      else{ Txtdilatada.setEnabled(false);}
    }//GEN-LAST:event_jCheckDilatadaActionPerformed

    private void jCheckRestrictivaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckRestrictivaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckRestrictivaStateChanged

    private void jCheckRestrictivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRestrictivaActionPerformed
              if (jCheckRestrictiva.isSelected()){
      
      TxtRestrictiva.setEnabled(true);
      }
      
      else{ TxtRestrictiva.setEnabled(false);}
    }//GEN-LAST:event_jCheckRestrictivaActionPerformed

    private void jCheckRitmoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckRitmoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckRitmoStateChanged

    private void jCheckRitmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRitmoActionPerformed
              if (jCheckRitmo.isSelected()){
      
      TxtRitmo.setEnabled(true);
      }
      
      else{ TxtRitmo.setEnabled(false);}
    }//GEN-LAST:event_jCheckRitmoActionPerformed

    private void jCheckAVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckAVStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckAVStateChanged

    private void jCheckAVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAVActionPerformed
                if (jCheckAV.isSelected()){
      
      TXTAV.setEnabled(true);
      }
      
      else{ TXTAV.setEnabled(false);}
    }//GEN-LAST:event_jCheckAVActionPerformed

    private void jCheckIVStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckIVStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckIVStateChanged

    private void jCheckIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckIVActionPerformed
                 if (jCheckIV.isSelected()){
      
      TXTIV.setEnabled(true);
      }
      
      else{ TXTIV.setEnabled(false);}
    }//GEN-LAST:event_jCheckIVActionPerformed

    private void jCheckDEFINITIVOStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckDEFINITIVOStateChanged
             if (jCheckDEFINITIVO.isSelected()){
      
      TXTDEFINITIVOP.setEnabled(true);
      }
      
      else{ TXTDEFINITIVOP.setEnabled(false);}
    }//GEN-LAST:event_jCheckDEFINITIVOStateChanged

    private void jCheckDEFINITIVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckDEFINITIVOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckDEFINITIVOActionPerformed

    private void TXTvalvulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTvalvulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTvalvulasActionPerformed

    private void TXTmitralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTmitralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTmitralActionPerformed

    
    
    String ritmoelectro="", trazo="";
    private void jRadioSinusalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSinusalActionPerformed
        this.jRadioSinusal.setSelected(true);
        jNosinusal.setSelected(false);
        ritmoelectro="Sinusal";
         
    }//GEN-LAST:event_jRadioSinusalActionPerformed

    private void jNosinusalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNosinusalActionPerformed
        this.jNosinusal.setSelected(true);
        jRadioSinusal.setSelected(false);
        ritmoelectro="No inusal";
    }//GEN-LAST:event_jNosinusalActionPerformed

    private void JRadioTrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioTrazoActionPerformed
        this.JRadioTrazo.setSelected(true);
        jRadioTrazo2.setSelected(false);
        trazo="Normal";
    }//GEN-LAST:event_JRadioTrazoActionPerformed

    private void jRadioTrazo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioTrazo2ActionPerformed
        this.jRadioTrazo2.setSelected(true);
        JRadioTrazo.setSelected(false);
        trazo="Anormal";
    }//GEN-LAST:event_jRadioTrazo2ActionPerformed

    private void TxtiAuriculazquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtiAuriculazquierdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtiAuriculazquierdaActionPerformed

    private void TXTauriculaderechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTauriculaderechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTauriculaderechaActionPerformed

    private void TXTventriculoizquierdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTventriculoizquierdoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTventriculoizquierdoActionPerformed

    private void TXTaorticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTaorticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTaorticaActionPerformed

    private void TXTtricuspideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtricuspideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtricuspideActionPerformed

    private void TXTcontractilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcontractilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcontractilidadActionPerformed

    private void TXTventriculoderechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTventriculoderechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTventriculoderechoActionPerformed

    private void TXTpericardioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTpericardioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpericardioActionPerformed

    private void TXTeyeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTeyeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTeyeccionActionPerformed

    private void TXTpulmonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTpulmonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpulmonarActionPerformed

    private void TXTotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTotrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTotrosActionPerformed

    private void TXTpsapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTpsapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpsapActionPerformed

    private void TXTsistolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTsistolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTsistolicaActionPerformed

    private void jTableAntecedentesFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAntecedentesFMouseClicked
        jTableAntecedentesF.requestFocusInWindow();
        int fila = jTableAntecedentesF.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un campo de la tabla", "Campos", 1);

        }

        else{
            EnfermedadAF=(jTableAntecedentesF.getValueAt(fila, 1).toString());}

    }//GEN-LAST:event_jTableAntecedentesFMouseClicked

    private void TxtbusquedaAntcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtbusquedaAntcKeyReleased
        SearchAntecedentesF();
    }//GEN-LAST:event_TxtbusquedaAntcKeyReleased

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
          int fila = jTableAF2.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar la fila que desea eliminar", "Fila",1);
        } else {
   

        try {
            int FilaRemover;
            DefaultTableModel Mode = (DefaultTableModel) jTableAF2.getModel();
            FilaRemover = this.jTableAF2.getSelectedRow();
            Mode.removeRow(FilaRemover);
cantidad=cantidad-1;
        } catch (Exception e){ System.out.println("" + e);
        }  }
        JtextAntc1.setText("");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jTableAF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAF2MouseClicked

      

    }//GEN-LAST:event_jTableAF2MouseClicked

    private void jAButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAButton30ActionPerformed

        int fila = jTableAntecedentesF.getSelectedRow();
        int row = jTableAF2.getRowCount();
        Object[] content = new Object[row];
        for (int i = 0; i < row; i++) {
            content[i] = jTableAF2.getValueAt(i, 1);
        }
        Object value_to_find= EnfermedadAF;
        boolean exist = Arrays.asList(content).contains(value_to_find);

        if (exist){
            JOptionPane.showMessageDialog(null, "NO PUEDEN HABER ENFERMEDADES DUPLICADAS", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
        }

        else  if (fila == -1) {

            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA OPCIÓN DE LA TABLA ENFERMEDAD", "CAMPOS", JOptionPane.ERROR_MESSAGE);
        }
        else if(EnfermedadAF.equals("")){
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA OPCIÓN DE LA TABLA ENFERMEDAD", "CAMPOS", JOptionPane.ERROR_MESSAGE);
        }

        else if (JtextAntc1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "COMPLETE EL CAMPO INFORME", "CAMPOS", JOptionPane.ERROR_MESSAGE);
        }

        else
        {
            addAntec1();
            //acomodarAntec1();
            acomodarAntec1();
            //  BtnAprocedimiento.setEnabled(true);

        }

    }//GEN-LAST:event_jAButton30ActionPerformed

    private void jTableAntcPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAntcPersMouseClicked

        jTableAntcPers.requestFocusInWindow();
        int fila = jTableAntcPers.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un campo de la tabla", "Campos", 1);

        }

        else{ TextAntPersonal=(jTableAntcPers.getValueAt(fila, 1).toString());}

    }//GEN-LAST:event_jTableAntcPersMouseClicked

    private void TxtBusAntcPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBusAntcPKeyReleased
        SearchAntecedentesP();
    }//GEN-LAST:event_TxtBusAntcPKeyReleased

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int fila = jTableAntcPers.getSelectedRow();
        int row = jTableAntpersonal.getRowCount();
        Object[] content = new Object[row];
        for (int i = 0; i < row; i++) {
            content[i] = jTableAntpersonal.getValueAt(i, 1);
        }
        Object value_to_find= TextAntPersonal;
        boolean exist = Arrays.asList(content).contains(value_to_find);

        if (exist){
            JOptionPane.showMessageDialog(null, "NO PUEDEN HABER ENFERMEDADES DUPLICADAS", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }

        if (fila == -1) {

            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA OPCIÓN DE LA TABLA ENFERMEDAD", "CAMPOS", JOptionPane.ERROR_MESSAGE);

        }

        else if (TextAntPersonal.equals("")){ JOptionPane.showMessageDialog(null, "DEBE LLENAR EL CAMPO DE OBSERVACIÓN", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);}

        else if (jTextAntPersonales.getText().equals("")){
            JOptionPane.showMessageDialog(null, "COMPLETE EL CAMPO INFORME", "CAMPOS", JOptionPane.ERROR_MESSAGE);
        }

        else
        {

            addAntec2();

        }

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
           int fila = jTableAntpersonal.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar la fila que desea eliminar", "Fila",1);
        } else {
   

        try {
            int FilaRemover;
            DefaultTableModel Mode = (DefaultTableModel) jTableAntpersonal.getModel();
            FilaRemover = this.jTableAntpersonal.getSelectedRow();
            Mode.removeRow(FilaRemover);
cantidad=cantidad-1;
        } catch (Exception e){ System.out.println("" + e);
        }  }
        jTextAntPersonales.setText("");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void BtnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardar1ActionPerformed
       pdfHistorias();
    }//GEN-LAST:event_BtnGuardar1ActionPerformed

    private void jTextObservAdicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextObservAdicMousePressed
        checkPopup(evt, jTextObservAdic);
    }//GEN-LAST:event_jTextObservAdicMousePressed

    private void jTextObservAdicMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextObservAdicMouseReleased
        checkPopup(evt, jTextObservAdic);
    }//GEN-LAST:event_jTextObservAdicMouseReleased

    private void jTextObservAdicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextObservAdicKeyReleased
        String text = jTextObservAdic.getText();
        int maxLength = 3100;
        if (text.length() > maxLength) {
            JOptionPane.showMessageDialog(this, "Se ha alcanzado la longitud máxima permitida", "Advertencia", JOptionPane.WARNING_MESSAGE);
            // Trunca el texto si lo deseas
            jTextObservAdic.setText(text.substring(0, maxLength));
        }
    }//GEN-LAST:event_jTextObservAdicKeyReleased

    private void jTextObservAdicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextObservAdicKeyTyped
        va.longitud(jTextObservAdic.getText(), 3100, evt);
    }//GEN-LAST:event_jTextObservAdicKeyTyped

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

        int row = jTableAdic.getRowCount();
        Object[] content = new Object[row];
        for (int i = 0; i < row; i++) {
            content[i] = jTableAdic.getValueAt(i, 1);
        }
        Object value_to_find= jTextExamenAdic.getText();
        boolean exist = Arrays.asList(content).contains(value_to_find);

        if (exist){
            JOptionPane.showMessageDialog(null, "NO PUEDEN HABER ENFERMEDADES DUPLICADAS", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }

        else if (jTextExamenAdic.getText().equals("") || jTextObservAdic.getText().equals("") ){ JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS CAMPOS", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);}

     
        else
        {

            if (estadoEstudio.equals("Pendiente")) {
                AgregarExamenAdc();
                limpiarEAdc();
                ShowExamAdic(idtablaHistorias);
            }

            else{
                // addexamenextra();
                AgregarExamenAdc();
                limpiarEAdc();
                ShowExamAdic(idAsignar);
            }

        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jAdcModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdcModifActionPerformed

        int idAdicionalM;
        if (!estadoEstudio.equals("Pendiente")) {
            idAdicionalM = idAsignar;
        } else {
            idAdicionalM = idtablaHistorias;
        }

        jAdcModif.setEnabled(false);
        modificarEadc();
        limpiarEAdc();
        ShowExamAdic(idAdicionalM);

        jTextObservAdic.setText("");
        jTextExamenAdic.setText("");
    }//GEN-LAST:event_jAdcModifActionPerformed

    private void jAdcDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdcDeleteActionPerformed

        int fila = jTableAdic.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UNA OPCIÓN DE LA TABLA ENFERMEDAD", "CAMPOS", JOptionPane.ERROR_MESSAGE);
        }

        else{

            if (JOptionPane.showConfirmDialog(rootPane, "¿Realmente desea retirar este estudio?",
                "Estudios", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

            int idValidarAdc;
            if (!estadoEstudio.equals("Pendiente")) {
                idValidarAdc = idAsignar;
            } else {
                idValidarAdc = idtablaHistorias;
            }

            jAdcDelete.setEnabled(false);
            EliminarEadc();
            limpiarEAdc();
            ShowExamAdic(idValidarAdc);

            jTextObservAdic.setText("");
            jTextExamenAdic.setText("");
        }
        }

    }//GEN-LAST:event_jAdcDeleteActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea cancelar la informacion?",
            "Informacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

        limpiarTEAdd();

        }
    }//GEN-LAST:event_jButton18ActionPerformed

    
    
     int idEadc;
    String nomEadc, descripEadc;
    private void jTableAdicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdicMouseClicked

        jTableAdic.requestFocusInWindow();
        int fila = jTableAdic.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un campo de la tabla", "Campos", 1);

        }

        else{ idEadc= (int) (jTableAdic.getValueAt(fila, 0));
            nomEadc= (jTableAdic.getValueAt(fila, 1).toString());
            descripEadc= (jTableAdic.getValueAt(fila, 2).toString());
            jAdcModif.setEnabled(true);
            jAdcDelete.setEnabled(true);

            jTextExamenAdic.setText(nomEadc);
            jTextObservAdic.setText(descripEadc);

        }

    }//GEN-LAST:event_jTableAdicMouseClicked

    private void jTableAdicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAdicMouseEntered
        jTableAdic.requestFocusInWindow();
    }//GEN-LAST:event_jTableAdicMouseEntered

    private void TXTPcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPcorreoActionPerformed

    
     
    
    
    
    
    
    
    
    
    
    
      
        
        
      
  public ArrayList<JCMostrarAsignados> LlenarLista(){
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps =null;
    ResultSet rs = null;
    
    
    
ArrayList<JCMostrarAsignados> al=null;
al=new ArrayList<JCMostrarAsignados>();
String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar1.getDate());   
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
"\n" +
 "where IdUsuario LIKE '%" + idusuario + "%'     AND especialidad = "+  '"' + especialidad + '"'  + "AND FechaAsignar="+  '"' + fecha + '"'
        
    +      "ORDER by IdAsignar";
        



 

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int estado =rs.getInt("EstadoA"); 
                if( estado!=104){
                JCMostrarAsignados prd = new JCMostrarAsignados();
                prd.setIdAsginado(rs.getInt(1));
                prd.setPacAsignado(rs.getString(2) + " " +rs.getString(3));
                prd.setCedAsignado(rs.getString(4));      
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
    
    
    
    
    
    
  

  
  
  public ArrayList<JCProcedimientos> LlenarListaPro(){
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps =null;
    ResultSet rs = null;
    
    
    
ArrayList<JCProcedimientos> al=null;
al=new ArrayList<JCProcedimientos>();
String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar1.getDate());   
String sql = "SELECT Id_AProcedimientos,Id_Procedimiento, Procedimiento, Id_Paciente, Id_Usuario, Id_Especialidad, Descripcion_Procedimiento, Fecha_Procedimiento, Id_Estado, Estado\n" +
"\n" +
"FROM asignar_procedimiento u\n" +
"\n" +
"INNER JOIN table_paciente c\n" +
"ON u.Id_Paciente= c.Idpaciente\n" +
"\n" +
"INNER JOIN table_estado p\n" +
"ON u.Id_Estado= p.IdEstado \n" +
"\n" +
"INNER JOIN table_procedimientos x\n" +
"ON u.Id_Procedimiento= x.idProcedimiento \n" +
        
 "where Id_Usuario LIKE '%" + idusuario + "%'     AND Id_Paciente LIKE "+  '"' + IdPaciente + '"'  + "AND Fecha_Procedimiento LIKE"+  '"' + fecha + '"'
        
  +      "ORDER by  Id_AProcedimientos" ;

       
        

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int estado =rs.getInt("Id_Estado"); 
               if( estado==102){
                JCProcedimientos prd = new JCProcedimientos();
                prd.setIdprocedimiento(rs.getInt(1));
                prd.setProcedimiento(rs.getString(3));      
                prd.setObservacion(rs.getString(7));
                prd.setEstado(rs.getString(10));

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
    
  
  
  
  
  public ArrayList<JCProcedimientos> LlenarListaPro2(){
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps =null;
    ResultSet rs = null;
    
    
    
ArrayList<JCProcedimientos> al=null;
al=new ArrayList<JCProcedimientos>();
String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar1.getDate());   
String sql = "SELECT Id_AProcedimientos,Id_Procedimiento, Procedimiento, Id_Paciente, Id_Usuario, Id_Especialidad, Descripcion_Procedimiento, Fecha_Procedimiento, Id_Estado, Estado\n" +
"\n" +
"FROM asignar_procedimiento u\n" +
"\n" +
"INNER JOIN table_paciente c\n" +
"ON u.Id_Paciente= c.Idpaciente\n" +
"\n" +
"INNER JOIN table_estado p\n" +
"ON u.Id_Estado= p.IdEstado \n" +
"\n" +
"INNER JOIN table_procedimientos x\n" +
"ON u.Id_Procedimiento= x.idProcedimiento \n" +
        
 "where Id_Usuario LIKE '%" + idusuario + "%'     AND Id_Paciente LIKE "+  '"' + PacienteSelec + '"'  + "AND Fecha_Procedimiento LIKE"+  '"' + fecha + '"'
        
  +      "ORDER by  Id_AProcedimientos" ;

       
        

 

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int estado =rs.getInt("Id_Estado"); 
               if( estado==103){
                JCProcedimientos prd = new JCProcedimientos();
                prd.setIdprocedimiento(rs.getInt(1));
                prd.setProcedimiento(rs.getString(3));      
                prd.setObservacion(rs.getString(7));
                prd.setEstado(rs.getString(10));

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
  
  
  
  
  
  
  
  

  
  
  
  
    public void listarAntecedentes() {

        List<JCAntecedentesFamiliares> lista = AntcDao.listarAntecedentesFamiliares();
        modelo = (DefaultTableModel) jTableAntecedentesF.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getIdAntecentes1();
            ob[1] = lista.get(i).getEnfermedad1();
            ob[2] = lista.get(i).getEstado1();
   
            modelo.addRow(ob);

        }
       jTableAntecedentesF.setModel(modelo);
        
            
     jTableAntecedentesF.getColumnModel().getColumn(0).setMaxWidth(0);
     jTableAntecedentesF.getColumnModel().getColumn(0).setMinWidth(0);
     jTableAntecedentesF.getColumnModel().getColumn(0).setPreferredWidth(0);
     jTableAntecedentesF.setDefaultEditor(Object.class, null);
     jTableAntecedentesF.setRowHeight(20);
    }
    
    
  
  
  
  
  
  
  
    public void listarAntecedentespersonales() {

        List<JCAntecedentesFamiliares> lista = AntcDao.listarAntecedentesPatologicos();
        modelo = (DefaultTableModel) jTableAntcPers.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getIdAntecentes2();
            ob[1] = lista.get(i).getEnfermedad2();
            ob[2] = lista.get(i).getEstado2();
   
            modelo.addRow(ob);

        }
       jTableAntcPers.setModel(modelo);
        
            
     jTableAntcPers.getColumnModel().getColumn(0).setMaxWidth(0);
     jTableAntcPers.getColumnModel().getColumn(0).setMinWidth(0);
     jTableAntcPers.getColumnModel().getColumn(0).setPreferredWidth(0);
     jTableAntcPers.setDefaultEditor(Object.class, null);
     jTableAntcPers.setRowHeight(20);
    }
    
  
  
  
  
  
  
  
    public void listarCallAntc1() {

        
        
  
        
        List<JCAntecedentesFamiliares> lista = AntcDao.listarCallAntc1(idtablaConsulta);
        modelo = (DefaultTableModel) jTableAF2.getModel();
        Object[] ob = new Object[10];
         

   
   
        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getCallAtcd1();
            ob[1] = lista.get(i).getCallE1();
            ob[2] = lista.get(i).getCallD1();
   
            modelo.addRow(ob);

        }
       jTableAF2.setModel(modelo);
       acomodarAntec1();

    }
  
  
  
  
  
  
  
  
  
  

    
  

      public  void limpiarTAntecedentes() {
        DefaultTableModel tb = (DefaultTableModel) jTableAntecedentesF.getModel();
        int a = jTableAntecedentesF.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }
    
      
            public  void limpiarTAntecedentesPerso() {
        DefaultTableModel tb = (DefaultTableModel) jTableAntcPers.getModel();
        int a = jTableAntcPers.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }
    
            



          
                 public  void limpiarTVisualizar() {
        DefaultTableModel tb = (DefaultTableModel) jTableVisualizarC.getModel();
        int a = jTableVisualizarC.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

      
      

      
          
              public  void limpiarTAntecedentesF2() {
        DefaultTableModel tb = (DefaultTableModel) jTableAF2.getModel();
        int a = jTableAF2.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

                    
              public  void limpiarTAntecedentesF3() {
        DefaultTableModel tb = (DefaultTableModel) jTableAntpersonal.getModel();
        int a = jTableAntpersonal.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

          

        
      
      
      int PacienteSelec;
      Date fechanac;
      int idAsignar=0;
      
   public void SearchLastHistory(){

   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          
          
          
       try{
    
 //    int fila = JTablePacientes.getSelectedRow();
       
       String query="SELECT MAX(Id_historias) from table_historias  ";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
      
       rs=ps.executeQuery();
   
       if (rs.next()){
        idAsignar= rs.getInt("MAX(Id_historias)");
       }
   
  
          }
catch(Exception e){System.out.println("Error searchidpaciente"+e);}

      }
      
   
   
   
   
      
   
   
   

      
     String PdfNames;
     int idexamen;
      
   
     
     
 
     
     
       String PdfNamesHistorias;
       
       public void pdfHistorias() {
      
       try {
       
          
         
               
            String cedula= TXTPcedula.getText();
            String nombrepaciente= TXTPnombre.getText() + " "+ TXTPapellido.getText(); 
            com.itextpdf.text.Image FirmaDoctor = com.itextpdf.text.Image.getInstance("C:\\Cyberia\\dist\\imagen.bin");
            String fechaN = new SimpleDateFormat("yyyy/MM/dd").format(FechaNacimiento.getDate());
            String [] dateParts1= fechaN.split("/");
            String an1 = dateParts1[0];
            String mes1 = dateParts1[1];
            String dia1 = dateParts1[2];
            
            
            String an_actual = Validar.fecha_actual();
            String mes_actual = Validar.fecha_mes();
            String dia_actual = Validar.fecha_dia();
            
           /* System.out.println("Hoy es :"+dia_actual+" "+ mes_actual+" "+an_actual);*/
            
            PdfNamesHistorias="Historia_"+cedula+"_"+ idAsignar;
            
        
            
            int diferenciadia=Integer.parseInt(dia_actual)- Integer.parseInt(dia1);
            int diferenciames=Integer.parseInt(mes_actual)- Integer.parseInt(mes1);
            int diferencian=Integer.parseInt(an_actual)- Integer.parseInt(an1);;

            
            if (diferenciames < 0 || (diferenciames == 0 && diferenciadia < 0)) {
            diferencian = diferencian - 1;
            }
 
   
        
          
          
         BaseFont BF = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);    
         Font Letra = new Font(BF, 10); 
         Font Letrasmall = new Font(BF, 8);
         Paragraph saltolinea = new Paragraph();
          

         FileOutputStream archivo;
         File file = new File("C://Cyberia//Reportes_Consulta//"+PdfNamesHistorias+".pdf");
         archivo = new FileOutputStream(file);
         Document doc = new Document();
         PdfWriter writer=  PdfWriter.getInstance(doc, archivo);
         doc.setMargins(36, 36, 36, 130);
           
            
       // Agregas el footer utilizando la clase PdfPageEventHelper
     
        PdfPageEventHelper eventHelper = new PdfPageEventHelper() {
        public void onEndPage(PdfWriter writer, Document document) {
        
    


        PdfPTable footerTable = new PdfPTable(3);
        footerTable.setTotalWidth(document.getPageSize().getWidth() - document.leftMargin() - document.rightMargin());
        footerTable.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        footerTable.setHorizontalAlignment(Element.ALIGN_CENTER);

        float footerHeight = -26;
        float x = (document.left() + document.right()) / 2;
        float y = document.bottom() - footerHeight;

        footerTable.writeSelectedRows(0, -1, x, y, writer.getDirectContent());
    

 
       Paragraph tfooter1 = new Paragraph(piepagina, new Font(FontFactory.getFont("Arial",9,Font.NORMAL)));  
       PdfPCell piepag = new PdfPCell(tfooter1 );
       piepag.setBorder(Rectangle.NO_BORDER);
       // Alineas la imagen y el texto al centro horizontal y vertical de la celda
       piepag.setHorizontalAlignment(Element.ALIGN_CENTER);
       piepag.setVerticalAlignment(Element.ALIGN_MIDDLE);
       footerTable.addCell(piepag);
     
       
        
       Phrase phrase = new Phrase();
       FirmaDoctor.scaleToFit(100, 100);
       FirmaDoctor.setAlignment(Chunk.ALIGN_CENTER);
       phrase.add(new Chunk(FirmaDoctor, 0, 0));
       phrase.add(new Chunk("\n ______________ \n" + "Dr/a "+nombredoctor+ "\n C.M.A: "+CMA + "| MPPS: "+ MPPS , new Font(FontFactory.getFont("Arial",9,Font.NORMAL))));
         
       PdfPCell imgfirma = new PdfPCell(phrase);
       imgfirma.setBorder(Rectangle.NO_BORDER);
       // Alineas la imagen y el texto al centro horizontal y vertical de la celda
       imgfirma.setHorizontalAlignment(Element.ALIGN_CENTER);
       imgfirma.setVerticalAlignment(Element.ALIGN_MIDDLE);
       footerTable.addCell(imgfirma);
            
        
        
        
       Paragraph tfooter2 = new Paragraph(writer.getPageNumber()+ " Pág", new Font(FontFactory.getFont("Arial",9,Font.NORMAL)));
           
       PdfPCell numpag = new PdfPCell(tfooter2);
       numpag.setBorder(Rectangle.NO_BORDER);
       
       
       // Alineas la imagen y el texto al centro horizontal y vertical de la celda
       numpag.setHorizontalAlignment(Element.ALIGN_CENTER);
       numpag.setVerticalAlignment(Element.ALIGN_MIDDLE);
       footerTable.addCell(numpag);
        
     

       //footerTable.writeSelectedRows(0, -1, document.leftMargin(), document.bottomMargin(), writer.getDirectContent());
       

        footerTable.writeSelectedRows(0, -1, document.leftMargin(), document.bottom() + footerHeight, writer.getDirectContent());
       
  
    
        
    }
    };

            writer.setPageEvent(eventHelper);
       


            
         
            doc.open();
           
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("C:\\Cyberia\\src\\imagenes\\Fundacionlogo1.png");
            header.setAlignment(Chunk.ALIGN_CENTER);
           // header.scaleAbsolute(200, 124);
            
            Paragraph fecha = new Paragraph();
    //      Font negrita = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String Fecha = FormatoFecha.format(Menu.FechaAdmin.getDate());
            String Hora = Menu.Time.getText()+" "+Menu.jLabel102.getText();


            
            
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
            CB.setTextMatrix(205, 790);
            CB.showText(empresa);
            
            CB.setFontAndSize(BF, 10);
            CB.setTextMatrix(240, 780);
            CB.showText(rif);
            
            CB.setFontAndSize(BF2, 10);
            CB.setTextMatrix(460, 780);
            CB.showText("FECHA: "+ Fecha);
            
            CB.setFontAndSize(BF2, 10);
            CB.setTextMatrix(460, 770);
            CB.showText("HORA: "+ Hora);
            
            CB.setFontAndSize(BF2, 8);
            CB.setTextMatrix(230, 740);
            CB.showText(telefonos);
          
            CB.setFontAndSize(BF2, 8);
            CB.setTextMatrix(160, 730);
            CB.showText(ubicacion); 
     
            CB.endText();
            
      
            
            
             //BODY ---------------------------------------------------------------------------------

            PdfPTable Tabla = new PdfPTable(3); 
            Tabla.setWidthPercentage(100);  
            float[] medidaCeldas = {1f, 3f, 1f };
            Tabla.setWidths(medidaCeldas);
            Tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph tcolumna1 = new Paragraph("N° DE ORDEN: " +  idAsignar);
            tcolumna1.getFont().setStyle(Font.BOLD);
            tcolumna1.getFont().setSize(8);        
            tcolumna1.setFont(Letra);
            tcolumna1.setAlignment(Element.ALIGN_CENTER);
            Tabla.addCell(tcolumna1);
     
                
            Paragraph tcolumna2 = new Paragraph("HISTORIA CLINICA ");
            tcolumna2.getFont().setStyle(Font.BOLD);
            tcolumna2.getFont().setSize(12);        
            tcolumna2.setFont(Letra);
            tcolumna2.setAlignment(Element.ALIGN_CENTER);
            Tabla.addCell(tcolumna2);

            Paragraph tcolumna3 = new Paragraph("N° DE PACIENTE: " + IdPaciente);
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
            
            Paragraph t0columna1 = new Paragraph("PACIENTE: "+ nombrepaciente);
            t0columna1.getFont().setStyle(Font.BOLD);
            t0columna1.getFont().setSize(8);        
            t0columna1.setFont(Letra);
            t0columna1.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna1);
     
                
            Paragraph t0columna2 = new Paragraph("CÉDULA: "+ cedula );
            t0columna2.getFont().setStyle(Font.BOLD);
            t0columna2.getFont().setSize(8);        
            t0columna2.setFont(Letra);
            t0columna2.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna2);

            Paragraph t0columna3 = new Paragraph("EDAD: " + Integer.toString(diferencian));
            t0columna3.getFont().setStyle(Font.BOLD);
            t0columna3.getFont().setSize(8);        
            t0columna3.setFont(Letra);
            t0columna3.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna3);
        
            Paragraph t0columna4 = new Paragraph("SEXO: "+ Sexo);
            t0columna4.getFont().setStyle(Font.BOLD);
            t0columna4.getFont().setSize(8);        
            t0columna4.setFont(Letra);
            t0columna4.setAlignment(Element.ALIGN_LEFT);
            Tabla0.addCell(t0columna4);
        
            
         
            
            
                 
         
                

            
            //PARTE 1
            PdfPTable Tabla2 = new PdfPTable(1); 
            Tabla2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
     
            float[] medidaCeldas3 = {5f};
            Tabla2.setWidthPercentage(100);  
            Tabla2.setWidths(medidaCeldas3);
            Tabla2.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            Paragraph t2columna1 = new Paragraph("M O T I V O   C O N S U L T A");
            t2columna1.getFont().setStyle(Font.BOLD);
            t2columna1.getFont().setSize(10);        
            t2columna1.setFont(Letra);
           
            PdfPCell cell = new PdfPCell();
            cell.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            cell.setPadding(0);
            cell.setBorder(PdfPCell.NO_BORDER);
            cell.setPhrase (new Paragraph(jTextMotivoConsulta.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
            
            t2columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            Tabla2.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            Tabla2.addCell(t2columna1);
            Tabla2.addCell(cell);   
         

            
            
            
            
           
            
            
            //PARTE 2 ANTECEDENTES
            
            
            
            PdfPTable TableProcedimiento = new PdfPTable(2);
            TableProcedimiento.setWidthPercentage(100);
          //  TableProcedimiento.getDefaultCell().setBorder(0);
            float[] Columnapro = new float[]{30f, 50f};
            TableProcedimiento.setWidths(Columnapro);
            TableProcedimiento.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell pro1 = new PdfPCell(new Phrase("Ant. Familiares", Letra));
            PdfPCell pro2 = new PdfPCell(new Phrase("Observación", Letra));
            pro1.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            pro2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            pro1.setBorder(0);
            pro2.setBorder(0);

            pro1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            pro2.setBackgroundColor(BaseColor.LIGHT_GRAY);
  
            TableProcedimiento.addCell(pro1);
            TableProcedimiento.addCell(pro2);
      
            for (int i = 0; i < jTableAF2.getRowCount(); i++) {
               
                String Procedimiento = jTableAF2.getValueAt(i, 1).toString();
                String Observacion = jTableAF2.getValueAt(i, 2).toString();
      
                TableProcedimiento.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
                
               
                TableProcedimiento.addCell(new Paragraph(Procedimiento,FontFactory.getFont("Arial",9,Font.NORMAL))); 
                TableProcedimiento.addCell(new Paragraph(Observacion,FontFactory.getFont("Arial",9,Font.NORMAL))); 
                
            }
            
        
            
            
            
            
            
            
            
            
            
            
            
            PdfPTable TableAntc2 = new PdfPTable(2);
            TableAntc2.setWidthPercentage(100);
            //TableProcedimiento.getDefaultCell().setBorder(0);

            TableAntc2.setWidths(Columnapro);
            TableAntc2.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell Antc1 = new PdfPCell(new Phrase("Ant. Personales Patológicos", Letra));
            PdfPCell Antc2 = new PdfPCell(new Phrase("Observación", Letra));
            Antc1.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            Antc2.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            Antc1.setBorder(0);
            Antc2.setBorder(0);

            Antc1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            Antc2.setBackgroundColor(BaseColor.LIGHT_GRAY);
  
            TableProcedimiento.addCell(Antc1);
            TableProcedimiento.addCell(Antc2);
      
            for (int i = 0; i < jTableAntpersonal.getRowCount(); i++) {
               
                String Procedimiento = jTableAntpersonal.getValueAt(i, 1).toString();
                String Observacion = jTableAntpersonal.getValueAt(i, 2).toString();
      
                TableProcedimiento.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
                
               
                TableProcedimiento.addCell(new Paragraph(Procedimiento,FontFactory.getFont("Arial",9,Font.NORMAL))); 
                TableProcedimiento.addCell(new Paragraph(Observacion,FontFactory.getFont("Arial",9,Font.NORMAL))); 
                
            }
            
            
            
            
            
            
            // PARTE 3 REVISION FUNCIONAL
            
            PdfPTable TablaFuncional1 = new PdfPTable(1); 
            TablaFuncional1.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
     
            float[] medidaCeldasF = {5f};
            TablaFuncional1.setWidthPercentage(100);  
            TablaFuncional1.setWidths(medidaCeldas3);
            TablaFuncional1.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaFuncional1.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            Paragraph t3columna1 = new Paragraph("Revisión Funcional & hábitos Psicobiologicos");
            t3columna1.getFont().setStyle(Font.BOLD);
            t3columna1.getFont().setSize(10);        
            t3columna1.setFont(Letra);
           
            PdfPCell cellFuncional1 = new PdfPCell();
            cellFuncional1.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            cellFuncional1.setPadding(10);
            cellFuncional1.setBorder(PdfPCell.NO_BORDER);
            cellFuncional1.setPhrase (new Paragraph(jTextRevision.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
            
            t3columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TablaFuncional1.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TablaFuncional1.addCell(t3columna1);
            TablaFuncional1.addCell(cellFuncional1);   
            
            
            
            
           
                 
            PdfPTable TablaFuncional2 = new PdfPTable(5); 
            TablaFuncional2.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldas2 = {4f, 4f, 4f,4f,4f};
            TablaFuncional2.setWidths(medidaCeldas2);
            TablaFuncional2.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaFuncional2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t4columna1 = new Paragraph("Simatología");
            t4columna1.getFont().setStyle(Font.BOLD);
            t4columna1.getFont().setSize(9);        
            t4columna1.setFont(Letrasmall);
            t4columna1.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional2.addCell(t4columna1);
     
                
            Paragraph t5columna2 = new Paragraph("CardioVascular");
            t5columna2.getFont().setStyle(Font.BOLD);
            t5columna2.getFont().setSize(9);        
            t5columna2.setFont(Letrasmall);
            t5columna2.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional2.addCell(t5columna2);

            Paragraph t6columna3 = new Paragraph("Digestivo");
            t6columna3.getFont().setStyle(Font.BOLD);
            t6columna3.getFont().setSize(10);        
            t6columna3.setFont(Letrasmall);
            t6columna3.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional2.addCell(t6columna3);

            Paragraph t7columna4 = new Paragraph("Músculo-Esqueletico");
            t7columna4.getFont().setStyle(Font.BOLD);
            t7columna4.getFont().setSize(9);        
            t7columna4.setFont(Letrasmall);
            t7columna4.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional2.addCell(t7columna4);
            
            
            Paragraph t8columna4 = new Paragraph("Neurológico");
            t8columna4.getFont().setStyle(Font.BOLD);
            t8columna4.getFont().setSize(9);        
            t8columna4.setFont(Letrasmall);
            t8columna4.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional2.addCell(t8columna4);
            
            
            

            TablaFuncional2.addCell(new Paragraph(constitucional + piel + orl + respiratorio,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional2.addCell(new Paragraph(Angina + Palpitaciones + Síncope + EndemaMsis,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional2.addCell(new Paragraph(DolorAbdominal + Flatulencia + Estreñimiento ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional2.addCell(new Paragraph(DolorMuscular + DolorArticular + Inflamación ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional2.addCell(new Paragraph(Cefalea + Migraña + Debilidad + Disestesia + Parestesia + Genito + Endocrino + Anticonceptivos + Angustia + Alergias + Otros ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            
            
          
          
            
            
            
           
           //MESTRUACION
           
           
            PdfPTable TablaFuncional3 = new PdfPTable(9); 
            // Tabla0.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            // Tabla0.SetBorderBottomLeftRadius(new BorderRadius(4f)); // No border is drawn
            TablaFuncional3.setWidthPercentage(100);  
            float[] medidaCeldasF3 = {2f, 4f, 3f, 3f, 2f, 2f, 2f, 2f, 2f};
            TablaFuncional3.setWidths(medidaCeldasF3);
            TablaFuncional3.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaFuncional3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t9columna1 = new Paragraph("Mernarquia");
            t9columna1.getFont().setStyle(Font.BOLD);
            t9columna1.getFont().setSize(8);        
            t9columna1.setFont(Letra);
            t9columna1.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t9columna1);
     
                
            Paragraph t10columna2 = new Paragraph("Menstruación");
            t10columna2.getFont().setStyle(Font.BOLD);
            t10columna2.getFont().setSize(8);        
            t10columna2.setFont(Letra);
            t10columna2.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t10columna2);

            Paragraph t11columna3 = new Paragraph("Ciclos menstruales");
            t11columna3.getFont().setStyle(Font.BOLD);
            t11columna3.getFont().setSize(8);        
            t11columna3.setFont(Letra);
            t11columna3.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t11columna3);
        
            Paragraph t12columna4 = new Paragraph("Ultima Menstruación");
            t12columna4.getFont().setStyle(Font.BOLD);
            t12columna4.getFont().setSize(8);        
            t12columna4.setFont(Letra);
            t12columna4.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t12columna4);
            
            Paragraph t13columna4 = new Paragraph("Partos");
            t13columna4.getFont().setStyle(Font.BOLD);
            t13columna4.getFont().setSize(8);        
            t13columna4.setFont(Letra);
            t13columna4.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t13columna4);
            
            
            Paragraph t14columna4 = new Paragraph("Cesareas");
            t14columna4.getFont().setStyle(Font.BOLD);
            t14columna4.getFont().setSize(8);        
            t14columna4.setFont(Letra);
            t14columna4.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t14columna4);
            
            
            Paragraph t15columna4 = new Paragraph("Abortos");
            t15columna4.getFont().setStyle(Font.BOLD);
            t15columna4.getFont().setSize(8);        
            t15columna4.setFont(Letra);
            t15columna4.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t15columna4);
           
            
            Paragraph t16columna4 = new Paragraph("Embarazos");
            t16columna4.getFont().setStyle(Font.BOLD);
            t16columna4.getFont().setSize(8);        
            t16columna4.setFont(Letra);
            t16columna4.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t16columna4);
            
            
            
            Paragraph t17columna4 = new Paragraph("Menospaucia");
            t17columna4.getFont().setStyle(Font.BOLD);
            t17columna4.getFont().setSize(8);        
            t17columna4.setFont(Letra);
            t17columna4.setAlignment(Element.ALIGN_LEFT);
            TablaFuncional3.addCell(t17columna4);
            

       
            String FechaMest = FormatoFecha.format(FechaAsignar2.getDate());
            
          
            
            int mernarquia = (Integer) this.jSpinner2.getValue();
            if(mernarquia>0){TablaFuncional3.addCell(new Paragraph(String.valueOf(jSpinner2.getValue() + " años") ,FontFactory.getFont("Arial",8,Font.NORMAL))); }
            else{TablaFuncional3.addCell(new Paragraph("N/A" ,FontFactory.getFont("Arial",8,Font.NORMAL))); }
            
            TablaFuncional3.addCell(new Paragraph(jComboBox3.getSelectedItem().toString(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional3.addCell(new Paragraph(TxtCiclosMestru.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional3.addCell(new Paragraph(FechaMest,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional3.addCell(new Paragraph(String.valueOf(jSpartos.getValue()) ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional3.addCell(new Paragraph(String.valueOf(jScesareas.getValue()) ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional3.addCell(new Paragraph(String.valueOf(jSabortos.getValue()) ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional3.addCell(new Paragraph(String.valueOf(jSembarazo.getValue()) ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
           
            int menospaucia = (Integer) this.jSmenospausia.getValue();
            if(menospaucia>0){TablaFuncional3.addCell(new Paragraph(String.valueOf(jSmenospausia.getValue() +" años") ,FontFactory.getFont("Arial",8,Font.NORMAL))); }
            else{TablaFuncional3.addCell(new Paragraph("N/A" ,FontFactory.getFont("Arial",8,Font.NORMAL))); }
            
          
    

       
            
            PdfPTable TablaFuncional4 = new PdfPTable(1); 
            TablaFuncional4.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
     
            TablaFuncional4.setWidthPercentage(100);  
            TablaFuncional4.setWidths(medidaCeldas3);
            TablaFuncional4.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaFuncional4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
        
           
            PdfPCell cellFuncional2 = new PdfPCell();
            cellFuncional2.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            cellFuncional2.setPadding(10);
            cellFuncional2.setBorder(PdfPCell.NO_BORDER);
            cellFuncional2.setPhrase (new Paragraph(jTextArea10.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
            

            TablaFuncional4.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TablaFuncional4.addCell(cellFuncional2);  
         
              
          
            //CONSUMO Y CREACION
            
            
            
            PdfPTable TablaFuncional5 = new PdfPTable(4); 
            TablaFuncional5.setWidthPercentage(100);  
            TablaFuncional5.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldas5 = {4f, 4f, 4f,4f};
            TablaFuncional5.setWidths(medidaCeldas5);
            TablaFuncional5.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaFuncional5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t18columna1 = new Paragraph("Hábitos Sociales");
            t18columna1.getFont().setStyle(Font.BOLD);
            t18columna1.getFont().setSize(9);        
            t18columna1.setFont(Letrasmall);
            t18columna1.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional5.addCell(t18columna1);
     
                
            Paragraph t19columna2 = new Paragraph("Consumo Alcohol");
            t19columna2.getFont().setStyle(Font.BOLD);
            t19columna2.getFont().setSize(9);        
            t19columna2.setFont(Letrasmall);
            t19columna2.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional5.addCell(t19columna2);

            Paragraph t20columna3 = new Paragraph("Consumo Tabaco");
            t20columna3.getFont().setStyle(Font.BOLD);
            t20columna3.getFont().setSize(10);        
            t20columna3.setFont(Letrasmall);
            t20columna3.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional5.addCell(t20columna3);

            Paragraph t21columna4 = new Paragraph("Consumo de estupefacientes");
            t21columna4.getFont().setStyle(Font.BOLD);
            t21columna4.getFont().setSize(9);        
            t21columna4.setFont(Letrasmall);
            t21columna4.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional5.addCell(t21columna4);
            

            PdfPCell Habitos = new PdfPCell();
            Habitos.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            Habitos.addElement(new Paragraph(jComboHabitos.getSelectedItem().toString(), FontFactory.getFont("Arial", 8, Font.NORMAL, BaseColor.BLACK)));
            Habitos.setBorder(PdfPCell.NO_BORDER);
            
            PdfPCell Alcohol = new PdfPCell();
            Alcohol.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            Alcohol.addElement(new Paragraph(jTConsumoAlcohol.getText(), FontFactory.getFont("Arial", 8, Font.NORMAL, BaseColor.BLACK)));
            Alcohol.setBorder(PdfPCell.NO_BORDER);
            
            PdfPCell Tabaco = new PdfPCell();
            Tabaco.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            Tabaco.addElement(new Paragraph(jTConsumoTabaco.getText(), FontFactory.getFont("Arial", 8, Font.NORMAL, BaseColor.BLACK)));
            Tabaco.setBorder(PdfPCell.NO_BORDER);
            
            PdfPCell Esupefaciente = new PdfPCell();
            Esupefaciente.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            Esupefaciente.addElement(new Paragraph(jTConsumoDrugs.getText(), FontFactory.getFont("Arial", 8, Font.NORMAL, BaseColor.BLACK)));
            Esupefaciente.setBorder(PdfPCell.NO_BORDER);
            

            TablaFuncional5.addCell(Habitos); 
            TablaFuncional5.addCell(Alcohol);
            TablaFuncional5.addCell(Tabaco); 
            TablaFuncional5.addCell(Esupefaciente); 
          
    
           
           
           
            
            
            PdfPTable TablaFuncional6 = new PdfPTable(4); 
            TablaFuncional6.setWidthPercentage(100);  
            TablaFuncional6.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TablaFuncional6.setWidths(medidaCeldas5);
            TablaFuncional6.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaFuncional6.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph t22columna1 = new Paragraph("Actividad Física");
            t22columna1.getFont().setStyle(Font.BOLD);
            t22columna1.getFont().setSize(9);        
            t22columna1.setFont(Letrasmall);
            t22columna1.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional6.addCell(t22columna1);
     
                
            Paragraph t23columna2 = new Paragraph("Frecuencia semanal");
            t23columna2.getFont().setStyle(Font.BOLD);
            t23columna2.getFont().setSize(9);        
            t23columna2.setFont(Letrasmall);
            t23columna2.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional6.addCell(t23columna2);

            Paragraph t24columna3 = new Paragraph("Sueño");
            t24columna3.getFont().setStyle(Font.BOLD);
            t24columna3.getFont().setSize(9);        
            t24columna3.setFont(Letrasmall);
            t24columna3.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional6.addCell(t24columna3);

            Paragraph t25columna4 = new Paragraph("Sexualidad");
            t25columna4.getFont().setStyle(Font.BOLD);
            t25columna4.getFont().setSize(9);        
            t25columna4.setFont(Letrasmall);
            t25columna4.setAlignment(Element.ALIGN_CENTER);
            TablaFuncional6.addCell(t25columna4);
            
            
            
                    
            TablaFuncional6.addCell(new Paragraph(jActividadF.getSelectedItem().toString(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional6.addCell(new Paragraph(Fsemanal.getSelectedItem().toString(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional6.addCell(new Paragraph(jSueno.getSelectedItem().toString(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TablaFuncional6.addCell(new Paragraph(jSexualidad.getSelectedItem().toString(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
          
    
            
            
      
            
            
            
            // EXAMEN FISICO
            
            
            
         
            Paragraph tituloFisico = new Paragraph("E X A M E N   F Í S I C O", Letra);
            tituloFisico.setAlignment(Element.ALIGN_CENTER);
            tituloFisico.getFont().setStyle(Font.BOLD);
            tituloFisico.getFont().setSize(10);
            
            
            


            PdfPTable TableFisico2 = new PdfPTable(7); 
            TableFisico2.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldaFisico = {2f, 2f, 2f,2f,2f, 2f,2f};
            TableFisico2.setWidths(medidaCeldaFisico);
            TableFisico2.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableFisico2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph t27columna1 = new Paragraph("Estatura (CM)");
            t27columna1.getFont().setStyle(Font.BOLD);
            t27columna1.getFont().setSize(9);        
            t27columna1.setFont(Letrasmall);
            t27columna1.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t27columna1);
     
                
            Paragraph t28columna2 = new Paragraph("Peso");
            t28columna2.getFont().setStyle(Font.BOLD);
            t28columna2.getFont().setSize(9);        
            t28columna2.setFont(Letrasmall);
            t28columna2.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t28columna2);

            Paragraph t29columna3 = new Paragraph("Peso ideal");
            t29columna3.getFont().setStyle(Font.BOLD);
            t29columna3.getFont().setSize(9);        
            t29columna3.setFont(Letrasmall);
            t29columna3.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t29columna3);

            Paragraph t30columna4 = new Paragraph("Peso adicional");
            t30columna4.getFont().setStyle(Font.BOLD);
            t30columna4.getFont().setSize(9);        
            t30columna4.setFont(Letrasmall);
            t30columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t30columna4);
            
            
            Paragraph t31columna4 = new Paragraph("I.M.C");
            t31columna4.getFont().setStyle(Font.BOLD);
            t31columna4.getFont().setSize(9);        
            t31columna4.setFont(Letrasmall);
            t31columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t31columna4);
            
            Paragraph t32columna4 = new Paragraph("Temperatura");
            t32columna4.getFont().setStyle(Font.BOLD);
            t32columna4.getFont().setSize(9);        
            t32columna4.setFont(Letrasmall);
            t32columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t32columna4);
            
            Paragraph t33columna4 = new Paragraph("Pulso");
            t33columna4.getFont().setStyle(Font.BOLD);
            t33columna4.getFont().setSize(9);        
            t33columna4.setFont(Letrasmall);
            t33columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico2.addCell(t33columna4);
            

            
          
            TableFisico2.addCell(new Paragraph(TXTtalla.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableFisico2.addCell(new Paragraph(TXTpeso.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableFisico2.addCell(new Paragraph(TXTpesoIdeal.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableFisico2.addCell(new Paragraph(TXTpesoAdic.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableFisico2.addCell(new Paragraph(TXTimc.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableFisico2.addCell(new Paragraph(TXTtemperatura.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableFisico2.addCell(new Paragraph(TXTpulso.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            
           
       
            
            
            
            
            
            
            
            
            PdfPTable TableFisico3 = new PdfPTable(6); 
            TableFisico3.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldaFisico2 = {2f, 3f, 3f,2f,2f,2f};
            TableFisico3.setWidths(medidaCeldaFisico2);
            TableFisico3.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableFisico3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph t34columna1 = new Paragraph("F.R");
            t34columna1.getFont().setStyle(Font.BOLD);
            t34columna1.getFont().setSize(9);        
            t34columna1.setFont(Letrasmall);
            t34columna1.setAlignment(Element.ALIGN_CENTER);
            TableFisico3.addCell(t34columna1);
     
                
            Paragraph t35columna2 = new Paragraph("Tipo respiración");
            t35columna2.getFont().setStyle(Font.BOLD);
            t35columna2.getFont().setSize(9);        
            t35columna2.setFont(Letrasmall);
            t35columna2.setAlignment(Element.ALIGN_CENTER);
            TableFisico3.addCell(t35columna2);

            Paragraph t36columna3 = new Paragraph("Aspecto ctxtura");
            t36columna3.getFont().setStyle(Font.BOLD);
            t36columna3.getFont().setSize(9);        
            t36columna3.setFont(Letrasmall);
            t36columna3.setAlignment(Element.ALIGN_CENTER);
            TableFisico3.addCell(t36columna3);

            Paragraph t37columna4 = new Paragraph("Tensión art");
            t37columna4.getFont().setStyle(Font.BOLD);
            t37columna4.getFont().setSize(9);        
            t37columna4.setFont(Letrasmall);
            t37columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico3.addCell(t37columna4);
            
            
            Paragraph t38columna4 = new Paragraph("Abdominal (CM)");
            t38columna4.getFont().setStyle(Font.BOLD);
            t38columna4.getFont().setSize(9);        
            t38columna4.setFont(Letrasmall);
            t38columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico3.addCell(t38columna4);
            
            Paragraph t39columna4 = new Paragraph("Cadera (CM)");
            t39columna4.getFont().setStyle(Font.BOLD);
            t39columna4.getFont().setSize(9);        
            t39columna4.setFont(Letrasmall);
            t39columna4.setAlignment(Element.ALIGN_CENTER);
            TableFisico3.addCell(t39columna4);
            
           

            TableFisico3.addCell(new Paragraph(TXTfr.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            TableFisico3.addCell(new Paragraph(TXTrespiracion.getText(),FontFactory.getFont("Arial",8,Font.NORMAL)));
            
            TableFisico3.addCell(new Paragraph(TXTaspecto.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            TableFisico3.addCell(new Paragraph(TXTtension.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            TableFisico3.addCell(new Paragraph(TXTabdominal.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            TableFisico3.addCell(new Paragraph(TXTcadera.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
          
            
            
            
            
            
            
            
            PdfPTable TableFisico4 = new PdfPTable(1); 
            TableFisico4.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableFisico4.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TableFisico4.setWidthPercentage(100);  
            TableFisico4.setWidths(medidaCeldas3);
            TableFisico4.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableFisico4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            Paragraph t40columna1 = new Paragraph("Piel: "+ TXTpiel.getText());
            t40columna1.getFont().setStyle(Font.NORMAL);
            t40columna1.getFont().setSize(9);        
            t40columna1.setFont(Letrasmall);
            t40columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico = new PdfPCell(t40columna1);
            aspectoFisico.setBorder(Rectangle.NO_BORDER);
            aspectoFisico.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t41columna1 = new Paragraph("Ojos: "+ TXTojos.getText());
            t41columna1.getFont().setStyle(Font.NORMAL);
            t41columna1.getFont().setSize(9);        
            t41columna1.setFont(Letrasmall);
            t41columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico2 = new PdfPCell(t41columna1);
            aspectoFisico2.setBorder(Rectangle.NO_BORDER);
            aspectoFisico2.enableBorderSide(Rectangle.BOTTOM);

            
             
            Paragraph t42columna1 = new Paragraph("Oídos: "+ TXToidos.getText());
            t42columna1.getFont().setStyle(Font.NORMAL);
            t42columna1.getFont().setSize(9);        
            t42columna1.setFont(Letrasmall);
            t42columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico3 = new PdfPCell(t42columna1);
            aspectoFisico3.setBorder(Rectangle.NO_BORDER);
            aspectoFisico3.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t43columna1 = new Paragraph("Dientes: "+ TXTdientes.getText());
            t43columna1.getFont().setStyle(Font.NORMAL);
            t43columna1.getFont().setSize(9);        
            t43columna1.setFont(Letrasmall);
            t43columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico4 = new PdfPCell(t43columna1);
            aspectoFisico4.setBorder(Rectangle.NO_BORDER);
            aspectoFisico4.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t44columna1 = new Paragraph("Boca: "+ TXTboca.getText());
            t44columna1.getFont().setStyle(Font.NORMAL);
            t44columna1.getFont().setSize(9);        
            t44columna1.setFont(Letrasmall);
            t44columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico5 = new PdfPCell(t44columna1);
            aspectoFisico5.setBorder(Rectangle.NO_BORDER);
            aspectoFisico5.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t45columna1 = new Paragraph("Cuello: "+ TXTcuello.getText());
            t45columna1.getFont().setStyle(Font.NORMAL);
            t45columna1.getFont().setSize(9);        
            t45columna1.setFont(Letrasmall);
            t45columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico6 = new PdfPCell(t45columna1);
            aspectoFisico6.setBorder(Rectangle.NO_BORDER);
            aspectoFisico6.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t46columna1 = new Paragraph("Corazón: "+ TXTcorazon.getText());
            t46columna1.getFont().setStyle(Font.NORMAL);
            t46columna1.getFont().setSize(9);        
            t46columna1.setFont(Letrasmall);
            t46columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico7 = new PdfPCell(t46columna1);
            aspectoFisico7.setBorder(Rectangle.NO_BORDER);
            aspectoFisico7.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t47columna1 = new Paragraph("Abdomen: "+ TXTAbdomen2.getText());
            t47columna1.getFont().setStyle(Font.NORMAL);
            t47columna1.getFont().setSize(9);        
            t47columna1.setFont(Letrasmall);
            t47columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico8 = new PdfPCell(t47columna1);
            aspectoFisico8.setBorder(Rectangle.NO_BORDER);
            aspectoFisico8.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t48columna1 = new Paragraph("Columna: "+ TXTcolumna.getText());
            t48columna1.getFont().setStyle(Font.NORMAL);
            t48columna1.getFont().setSize(9);        
            t48columna1.setFont(Letrasmall);
            t48columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico9 = new PdfPCell(t48columna1);
            aspectoFisico9.setBorder(Rectangle.NO_BORDER);
            aspectoFisico9.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t49columna1 = new Paragraph("Ext. Inferior: "+ TXTinferior.getText());
            t49columna1.getFont().setStyle(Font.NORMAL);
            t49columna1.getFont().setSize(9);        
            t49columna1.setFont(Letrasmall);
            t49columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico10 = new PdfPCell(t49columna1);
            aspectoFisico10.setBorder(Rectangle.NO_BORDER);
            aspectoFisico10.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t50columna1 = new Paragraph("Linfáticos: "+ TXTlinfaticos.getText());
            t50columna1.getFont().setStyle(Font.NORMAL);
            t50columna1.getFont().setSize(9);        
            t50columna1.setFont(Letrasmall);
            t50columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico11 = new PdfPCell(t50columna1);
            aspectoFisico11.setBorder(Rectangle.NO_BORDER);
            aspectoFisico11.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t51columna1 = new Paragraph("Genitales: "+ TXTgenitales.getText());
            t51columna1.getFont().setStyle(Font.NORMAL);
            t51columna1.getFont().setSize(9);        
            t51columna1.setFont(Letrasmall);
            t51columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico12 = new PdfPCell(t51columna1);
            aspectoFisico12.setBorder(Rectangle.NO_BORDER);
            aspectoFisico12.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t52columna1 = new Paragraph("Ano-rectal: "+ TXTgenitales.getText());
            t52columna1.getFont().setStyle(Font.NORMAL);
            t52columna1.getFont().setSize(9);        
            t52columna1.setFont(Letrasmall);
            t52columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico13 = new PdfPCell(t52columna1);
            aspectoFisico13.setBorder(Rectangle.NO_BORDER);
            aspectoFisico13.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t53columna1 = new Paragraph("Oftamoscopia: "+ TXToftamoscopia.getText());
            t53columna1.getFont().setStyle(Font.NORMAL);
            t53columna1.getFont().setSize(9);        
            t53columna1.setFont(Letrasmall);
            t53columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico14 = new PdfPCell(t53columna1);
            aspectoFisico14.setBorder(Rectangle.NO_BORDER);
            aspectoFisico14.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t54columna1 = new Paragraph("Nariz: "+ TXTnariz.getText());
            t54columna1.getFont().setStyle(Font.NORMAL);
            t54columna1.getFont().setSize(9);        
            t54columna1.setFont(Letrasmall);
            t54columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico15 = new PdfPCell(t54columna1);
            aspectoFisico15.setBorder(Rectangle.NO_BORDER);
            aspectoFisico15.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t55columna1 = new Paragraph("Toráx: "+ TXTtorax.getText());
            t55columna1.getFont().setStyle(Font.NORMAL);
            t55columna1.getFont().setSize(9);        
            t55columna1.setFont(Letrasmall);
            t55columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico16 = new PdfPCell(t55columna1);
            aspectoFisico16.setBorder(Rectangle.NO_BORDER);
            aspectoFisico16.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t56columna1 = new Paragraph("Mamas: "+ TXTmamas.getText());
            t56columna1.getFont().setStyle(Font.NORMAL);
            t56columna1.getFont().setSize(9);        
            t56columna1.setFont(Letrasmall);
            t56columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico17 = new PdfPCell(t56columna1);
            aspectoFisico17.setBorder(Rectangle.NO_BORDER);
            aspectoFisico17.enableBorderSide(Rectangle.BOTTOM);
            
            
                        
            Paragraph t57columna1 = new Paragraph("Pulmones: "+ TXTpulmones.getText());
            t57columna1.getFont().setStyle(Font.NORMAL);
            t57columna1.getFont().setSize(9);        
            t57columna1.setFont(Letrasmall);
            t57columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico18 = new PdfPCell(t57columna1);
            aspectoFisico18.setBorder(Rectangle.NO_BORDER);
            aspectoFisico18.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t58columna1 = new Paragraph("Hernias: "+ TXThernias.getText());
            t58columna1.getFont().setStyle(Font.NORMAL);
            t58columna1.getFont().setSize(9);        
            t58columna1.setFont(Letrasmall);
            t58columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico19 = new PdfPCell(t58columna1);
            aspectoFisico19.setBorder(Rectangle.NO_BORDER);
            aspectoFisico19.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t59columna1 = new Paragraph("Ext. Superior: "+ TXTsuperior.getText());
            t59columna1.getFont().setStyle(Font.NORMAL);
            t59columna1.getFont().setSize(9);        
            t59columna1.setFont(Letrasmall);
            t59columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico20 = new PdfPCell(t59columna1);
            aspectoFisico20.setBorder(Rectangle.NO_BORDER);
            aspectoFisico20.enableBorderSide(Rectangle.BOTTOM);
            


            Paragraph t62columna1 = new Paragraph("Arterias: "+ TXTarterias.getText());
            t62columna1.getFont().setStyle(Font.NORMAL);
            t62columna1.getFont().setSize(9);        
            t62columna1.setFont(Letrasmall);
            t62columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico23 = new PdfPCell(t62columna1);
            aspectoFisico23.setBorder(Rectangle.NO_BORDER);
            aspectoFisico23.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t63columna1 = new Paragraph("Venas: "+ TXTvenas.getText());
            t63columna1.getFont().setStyle(Font.NORMAL);
            t63columna1.getFont().setSize(9);        
            t63columna1.setFont(Letrasmall);
            t63columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico24 = new PdfPCell(t63columna1);
            aspectoFisico24.setBorder(Rectangle.NO_BORDER);
            aspectoFisico24.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t64columna1 = new Paragraph("Neurológico: "+ TXTneurologico.getText());
            t64columna1.getFont().setStyle(Font.NORMAL);
            t64columna1.getFont().setSize(9);        
            t64columna1.setFont(Letrasmall);
            t64columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico25 = new PdfPCell(t64columna1);
            aspectoFisico25.setBorder(Rectangle.NO_BORDER);
            aspectoFisico25.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph t65columna1 = new Paragraph("Prostata: "+ TXTprostata.getText());
            t65columna1.getFont().setStyle(Font.NORMAL);
            t65columna1.getFont().setSize(9);        
            t65columna1.setFont(Letrasmall);
            t65columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico26 = new PdfPCell(t65columna1);
            aspectoFisico26.setBorder(Rectangle.NO_BORDER);
            aspectoFisico26.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph t66columna1 = new Paragraph("Ginecologo: "+ TXTginecologo.getText());
            t66columna1.getFont().setStyle(Font.NORMAL);
            t66columna1.getFont().setSize(9);        
            t66columna1.setFont(Letrasmall);
            t66columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell aspectoFisico27 = new PdfPCell(t66columna1);
            aspectoFisico27.setBorder(Rectangle.NO_BORDER);
            aspectoFisico27.enableBorderSide(Rectangle.BOTTOM);
            
            

            if(!TXTpiel.getText().equals("")){TableFisico4.addCell(aspectoFisico);}
            if(!TXTojos.getText().equals("")){TableFisico4.addCell(aspectoFisico2);}
            if(!TXToidos.getText().equals("")){TableFisico4.addCell(aspectoFisico3);}
            if(!TXTdientes.getText().equals("")){TableFisico4.addCell(aspectoFisico4);}
            if(!TXTboca.getText().equals("")){TableFisico4.addCell(aspectoFisico5);}
            if(!TXTcuello.getText().equals("")){TableFisico4.addCell(aspectoFisico6);}
            if(!TXTcorazon.getText().equals("")){TableFisico4.addCell(aspectoFisico7);}
            if(!TXTAbdomen2.getText().equals("")){TableFisico4.addCell(aspectoFisico8);}
            if(!TXTcolumna.getText().equals("")){TableFisico4.addCell(aspectoFisico9);}
            if(!TXTinferior.getText().equals("")){TableFisico4.addCell(aspectoFisico10);}
            if(!TXTlinfaticos.getText().equals("")){TableFisico4.addCell(aspectoFisico11);}
            if(!TXTgenitales.getText().equals("")){TableFisico4.addCell(aspectoFisico12);}
            if(!TXTrectal.getText().equals("")){TableFisico4.addCell(aspectoFisico13);}
            if(!TXToftamoscopia.getText().equals("")){TableFisico4.addCell(aspectoFisico14);}
            if(!TXTnariz.getText().equals("")){TableFisico4.addCell(aspectoFisico15);}
            if(!TXTtorax.getText().equals("")){TableFisico4.addCell(aspectoFisico16);}
            if(!TXTmamas.getText().equals("")){TableFisico4.addCell(aspectoFisico17);}
            if(!TXTpulmones.getText().equals("")){TableFisico4.addCell(aspectoFisico18);}
            if(!TXThernias.getText().equals("")){TableFisico4.addCell(aspectoFisico19);}
            if(!TXTsuperior.getText().equals("")){TableFisico4.addCell(aspectoFisico20);}

     
            if(!TXTarterias.getText().equals("")){TableFisico4.addCell(aspectoFisico23);}
            if(!TXTvenas.getText().equals("")){TableFisico4.addCell(aspectoFisico24);}
            if(!TXTneurologico.getText().equals("")){TableFisico4.addCell(aspectoFisico25);}
            if(!TXTprostata.getText().equals("")){TableFisico4.addCell(aspectoFisico26);}
            if(!TXTginecologo.getText().equals("")){TableFisico4.addCell(aspectoFisico27);}
         
            


    

            
            
            
            PdfPTable TableRiesgo = new PdfPTable(1); 
            TableRiesgo.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableRiesgo.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TableRiesgo.setWidthPercentage(100);  
            TableRiesgo.setWidths(medidaCeldas3);
            TableRiesgo.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableRiesgo.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            Paragraph r1columna1 = new Paragraph("CARDIOPATÍA ISQUÉMICA. TIPO: "+ TxtIsquemica.getText());
            r1columna1.getFont().setStyle(Font.NORMAL);
            r1columna1.getFont().setSize(9);        
            r1columna1.setFont(Letrasmall);
            r1columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular = new PdfPCell(r1columna1);
            riesgocardiovascular.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph r2columna1 = new Paragraph("REVASCULARIZACIÓN PERCUTÁNEA. TIPO: "+ TxtPercutanea.getText());
            r2columna1.getFont().setStyle(Font.NORMAL);
            r2columna1.getFont().setSize(9);        
            r2columna1.setFont(Letrasmall);
            r2columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular2 = new PdfPCell(r2columna1);
            riesgocardiovascular2.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular2.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph r3columna1 = new Paragraph("REVASCULARIZACIÓN QUIRÚRGICA. TIPO: "+ TxtQuirurgica.getText());
            r3columna1.getFont().setStyle(Font.NORMAL);
            r3columna1.getFont().setSize(9);        
            r3columna1.setFont(Letrasmall);
            r3columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular3 = new PdfPCell(r3columna1);
            riesgocardiovascular3.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular3.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph r4columna1 = new Paragraph("CARDIOPATÍA ESTRUCTURAL. TIPO: "+ TxtEstrictural.getText());
            r4columna1.getFont().setStyle(Font.NORMAL);
            r4columna1.getFont().setSize(9);        
            r4columna1.setFont(Letrasmall);
            r4columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular4 = new PdfPCell(r4columna1);
            riesgocardiovascular4.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular4.enableBorderSide(Rectangle.BOTTOM);
            
             
            Paragraph r5columna1 = new Paragraph("MIOCARDIOPATÍA DILATADA. TIPO: "+ Txtdilatada.getText());
            r5columna1.getFont().setStyle(Font.NORMAL);
            r5columna1.getFont().setSize(9);        
            r5columna1.setFont(Letrasmall);
            r5columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular5 = new PdfPCell(r5columna1);
            riesgocardiovascular5.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular5.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph r6columna1 = new Paragraph("MIOCARDIOPATÍA RESTRICTIVA. TIPO: "+ TxtRestrictiva.getText());
            r6columna1.getFont().setStyle(Font.NORMAL);
            r6columna1.getFont().setSize(9);        
            r6columna1.setFont(Letrasmall);
            r6columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular6 = new PdfPCell(r6columna1);
            riesgocardiovascular6.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular6.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph r7columna1 = new Paragraph("TRASTORNO DEL RITMO. TIPO: "+ TxtRitmo.getText());
            r7columna1.getFont().setStyle(Font.NORMAL);
            r7columna1.getFont().setSize(9);        
            r7columna1.setFont(Letrasmall);
            r7columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular7 = new PdfPCell(r7columna1);
            riesgocardiovascular7.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular7.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph r8columna1 = new Paragraph("TRASTORNO DE CONDUCCIÓN A/V. TIPO: "+ TXTAV.getText());
            r8columna1.getFont().setStyle(Font.NORMAL);
            r8columna1.getFont().setSize(9);        
            r8columna1.setFont(Letrasmall);
            r8columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular8 = new PdfPCell(r8columna1);
            riesgocardiovascular8.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular8.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph r9columna1 = new Paragraph("TRASTORNO DE CONDUCCIÓN I/V. TIPO: "+ TXTIV.getText());
            r9columna1.getFont().setStyle(Font.NORMAL);
            r9columna1.getFont().setSize(9);        
            r9columna1.setFont(Letrasmall);
            r9columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular9 = new PdfPCell(r9columna1);
            riesgocardiovascular9.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular9.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph r10columna1 = new Paragraph("MARCAPASO DEFINITIVO. TIPO: "+ TXTDEFINITIVOP.getText());
            r10columna1.getFont().setStyle(Font.NORMAL);
            r10columna1.getFont().setSize(9);        
            r10columna1.setFont(Letrasmall);
            r10columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular10 = new PdfPCell(r10columna1);
            riesgocardiovascular10.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular10.enableBorderSide(Rectangle.BOTTOM);
            

            
            Paragraph r12columna1 = new Paragraph("ENFERMEDAD ARTERIAL PERIFÉRICA. TIPO: "+ TXTPERIFERICA.getText());
            r12columna1.getFont().setStyle(Font.NORMAL);
            r12columna1.getFont().setSize(9);        
            r12columna1.setFont(Letrasmall);
            r12columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular12 = new PdfPCell(r12columna1);
            riesgocardiovascular12.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular12.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph r13columna1 = new Paragraph("ENFERMEDAD CEREBRO VASCULAR: "+ TxtCerebroVascular.getText());
            r13columna1.getFont().setStyle(Font.NORMAL);
            r13columna1.getFont().setSize(9);        
            r13columna1.setFont(Letrasmall);
            r13columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular13 = new PdfPCell(r13columna1);
            riesgocardiovascular13.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular13.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph r14columna1 = new Paragraph("ISQUÉMICA: "+ Txtisquemica.getText());
            r14columna1.getFont().setStyle(Font.NORMAL);
            r14columna1.getFont().setSize(9);        
            r14columna1.setFont(Letrasmall);
            r14columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular14 = new PdfPCell(r14columna1);
            riesgocardiovascular14.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular14.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph r15columna1 = new Paragraph("HEMORRAGICA: "+ Txthemorragica.getText());
            r15columna1.getFont().setStyle(Font.NORMAL);
            r15columna1.getFont().setSize(9);        
            r15columna1.setFont(Letrasmall);
            r15columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell riesgocardiovascular15 = new PdfPCell(r15columna1);
            riesgocardiovascular15.setBorder(Rectangle.NO_BORDER);
            riesgocardiovascular15.enableBorderSide(Rectangle.BOTTOM);
            
            
            if(JcheckIsquemica.isSelected()){TableRiesgo.addCell(riesgocardiovascular);}
            if(jCheckPercutanea.isSelected()){TableRiesgo.addCell(riesgocardiovascular2);}
            if(jCheckQuirurgica.isSelected()){TableRiesgo.addCell(riesgocardiovascular3);}
            if(JcheckEstructural.isSelected()){TableRiesgo.addCell(riesgocardiovascular4);}
            if(jCheckDilatada.isSelected()){TableRiesgo.addCell(riesgocardiovascular5);}
            if(jCheckRestrictiva.isSelected()){TableRiesgo.addCell(riesgocardiovascular6);}
            if(jCheckRitmo.isSelected()){TableRiesgo.addCell(riesgocardiovascular7);}
            if(jCheckAV.isSelected()){TableRiesgo.addCell(riesgocardiovascular8);}
            if(jCheckIV.isSelected()){TableRiesgo.addCell(riesgocardiovascular9);}
            if(jCheckDEFINITIVO.isSelected()){TableRiesgo.addCell(riesgocardiovascular10);}
            if(jCheckPERIFERICA.isSelected()){TableRiesgo.addCell(riesgocardiovascular12);}
            if(!TxtCerebroVascular.getText().equals("")){TableRiesgo.addCell(riesgocardiovascular13);}     
            if(!Txtisquemica.getText().equals("")){TableRiesgo.addCell(riesgocardiovascular14);}
            if(!Txthemorragica.getText().equals("")){TableRiesgo.addCell(riesgocardiovascular15);}
            
            
            
            
            PdfPTable TableElectro = new PdfPTable(1); 
            TableElectro.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
     
            TableElectro.setWidthPercentage(100);  
            TableElectro.setWidths(medidaCeldas3);
            TableElectro.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph telectro1 = new Paragraph("Diagnóstico Electrocardiográfico");
            telectro1.getFont().setStyle(Font.BOLD);
            telectro1.getFont().setSize(10);        
            telectro1.setFont(Letra);
           
            PdfPCell cellelectro1 = new PdfPCell();
            cellelectro1.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            cellelectro1.setPadding(0);
            cellelectro1.setBorder(PdfPCell.NO_BORDER);
            cellelectro1.setPhrase (new Paragraph(TxtDiagnosticoElectro.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
            
             if(!TxtDiagnosticoElectro.getText().equals("")){
            telectro1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TableElectro.addCell(telectro1);
            TableElectro.addCell(cellelectro1);   

                 }

            
             
            PdfPTable TableElectro2 = new PdfPTable(8); 
            TableElectro2.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldasE = {4f, 4f, 4f,4f,4f,4f,4f, 4f};
            TableElectro2.setWidths(medidaCeldasE);
            TableElectro2.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph telectro2 = new Paragraph("RITMO: ");
            telectro2.getFont().setStyle(Font.BOLD);
            telectro2.getFont().setSize(9);        
            telectro2.setFont(Letrasmall);
            telectro2.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro2);
     

            Paragraph telectro3 = new Paragraph("FREC | DPM");
            telectro3.getFont().setStyle(Font.BOLD);
            telectro3.getFont().setSize(9);        
            telectro3.setFont(Letrasmall);
            telectro3.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro3);
            
            
            Paragraph telectro4 = new Paragraph("PR");
            telectro4.getFont().setStyle(Font.BOLD);
            telectro4.getFont().setSize(9);        
            telectro4.setFont(Letrasmall);
            telectro4.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro4);
            
            
            Paragraph telectro5 = new Paragraph("QRS");
            telectro5.getFont().setStyle(Font.BOLD);
            telectro5.getFont().setSize(9);        
            telectro5.setFont(Letrasmall);
            telectro5.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro5);
            
            
            Paragraph telectro6 = new Paragraph("AQRS");
            telectro6.getFont().setStyle(Font.BOLD);
            telectro6.getFont().setSize(9);        
            telectro6.setFont(Letrasmall);
            telectro6.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro6);
            
            
            Paragraph telectro7 = new Paragraph("QTm");
            telectro7.getFont().setStyle(Font.BOLD);
            telectro7.getFont().setSize(9);        
            telectro7.setFont(Letrasmall);
            telectro7.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro7);
            
            
            Paragraph telectro8 = new Paragraph("QTc");
            telectro8.getFont().setStyle(Font.BOLD);
            telectro8.getFont().setSize(9);        
            telectro8.setFont(Letrasmall);
            telectro8.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro8);
            
            
            Paragraph telectro9 = new Paragraph("TRAZO");
            telectro9.getFont().setStyle(Font.BOLD);
            telectro9.getFont().setSize(9);        
            telectro9.setFont(Letrasmall);
            telectro9.setAlignment(Element.ALIGN_CENTER);
            TableElectro2.addCell(telectro9);
           
            TableElectro2.addCell(new Paragraph(ritmoelectro ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(TXTFrec.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(TXTpr.getText(),FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(TXTQrs.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(TXTAqrs.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(TXTTxtQTm.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(TXTQTc.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            TableElectro2.addCell(new Paragraph(trazo ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            
            //-------------------------------------------------------------------------------------------------
            
            
            
            PdfPTable TableElectro3 = new PdfPTable(1); 
            TableElectro3.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableElectro3.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TableElectro3.setWidthPercentage(100);  
            TableElectro3.setWidths(medidaCeldas3);
            TableElectro3.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro3.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph e1columna1 = new Paragraph("SUPRAVENTRICULAR: "+ TXTSupraventricular.getText());
            e1columna1.getFont().setStyle(Font.NORMAL);
            e1columna1.getFont().setSize(9);        
            e1columna1.setFont(Letrasmall);
            e1columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro = new PdfPCell(e1columna1);
            CellElectro.setBorder(Rectangle.NO_BORDER);
            CellElectro.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph e2columna1 = new Paragraph("VENTRICULAR: "+ TXTVentricular.getText());
            e2columna1.getFont().setStyle(Font.NORMAL);
            e2columna1.getFont().setSize(9);        
            e2columna1.setFont(Letrasmall);
            e2columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro2 = new PdfPCell(e2columna1);
            CellElectro2.setBorder(Rectangle.NO_BORDER);
            CellElectro2.enableBorderSide(Rectangle.BOTTOM);
            
            
      
            Paragraph e3columna1 = new Paragraph("TRASTORNOS DE CONDUCCIÓN  AURICULO VENTRICULAR: "+ TXTauriculo.getText());
            e3columna1.getFont().setStyle(Font.NORMAL);
            e3columna1.getFont().setSize(9);        
            e3columna1.setFont(Letrasmall);
            e3columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro3 = new PdfPCell(e3columna1);
            CellElectro3.setBorder(Rectangle.NO_BORDER);
            CellElectro3.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph e4columna1 = new Paragraph("TRASTORNO DE CONDUCCIÓN INTRAVENTRICULAR: "+ TxtIntraventicular.getText());
            e4columna1.getFont().setStyle(Font.NORMAL);
            e4columna1.getFont().setSize(9);        
            e4columna1.setFont(Letrasmall);
            e4columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro4 = new PdfPCell(e4columna1);
            CellElectro4.setBorder(Rectangle.NO_BORDER);
            CellElectro4.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph e5columna1 = new Paragraph("CRECIMIENTO DE CAVIDADES: "+ TXTCrecimiento.getText());
            e5columna1.getFont().setStyle(Font.NORMAL);
            e5columna1.getFont().setSize(9);        
            e5columna1.setFont(Letrasmall);
            e5columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro5 = new PdfPCell(e5columna1);
            CellElectro5.setBorder(Rectangle.NO_BORDER);
            CellElectro5.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph e6columna1 = new Paragraph("REPOLARIZACIÓN: "+ TXTRepolarizacion.getText());
            e6columna1.getFont().setStyle(Font.NORMAL);
            e6columna1.getFont().setSize(9);        
            e6columna1.setFont(Letrasmall);
            e6columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro6 = new PdfPCell(e6columna1);
            CellElectro6.setBorder(Rectangle.NO_BORDER);
            CellElectro6.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph e7columna1 = new Paragraph("ZEI: "+ TXTzei.getText());
            e7columna1.getFont().setStyle(Font.NORMAL);
            e7columna1.getFont().setSize(9);        
            e7columna1.setFont(Letrasmall);
            e7columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro7 = new PdfPCell(e7columna1);
            CellElectro7.setBorder(Rectangle.NO_BORDER);
            CellElectro7.enableBorderSide(Rectangle.BOTTOM);
            

            Paragraph e8columna1 = new Paragraph("DIAGNÓSTICO TOPOGRÁFICO: "+ TXTtopografico.getText());
            e8columna1.getFont().setStyle(Font.NORMAL);
            e8columna1.getFont().setSize(9);        
            e8columna1.setFont(Letrasmall);
            e8columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro8 = new PdfPCell(e8columna1);
            CellElectro8.setBorder(Rectangle.NO_BORDER);
            CellElectro8.enableBorderSide(Rectangle.BOTTOM);
            
            
            Paragraph e9columna1 = new Paragraph("ECG DE REFERENCIA: "+ TXTecg.getText());
            e9columna1.getFont().setStyle(Font.NORMAL);
            e9columna1.getFont().setSize(9);        
            e9columna1.setFont(Letrasmall);
            e9columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell CellElectro9 = new PdfPCell(e9columna1);
            CellElectro9.setBorder(Rectangle.NO_BORDER);
            CellElectro9.enableBorderSide(Rectangle.BOTTOM);
            
            
        
            
            
            if(!TXTSupraventricular.getText().equals("")){TableElectro3.addCell(CellElectro);}
            if(!TXTVentricular.getText().equals("")){TableElectro3.addCell(CellElectro2);}
            if(!TXTauriculo.getText().equals("")){TableElectro3.addCell(CellElectro3);}
            if(!TxtIntraventicular.getText().equals("")){TableElectro3.addCell(CellElectro4);}
            if(!TXTCrecimiento.getText().equals("")){TableElectro3.addCell(CellElectro5);}
            if(!TXTRepolarizacion.getText().equals("")){TableElectro3.addCell(CellElectro6);}
            if(!TXTzei.getText().equals("")){TableElectro3.addCell(CellElectro7);}
            if(!TXTtopografico.getText().equals("")){TableElectro3.addCell(CellElectro8);}
            if(!TXTecg.getText().equals("")){TableElectro3.addCell(CellElectro9);}
          //  if(!jTexttrombolitico.getText().equals("")){TableElectro3.addCell(CellElectro10);}
          //  if(!jTextCriterios.getText().equals("")){TableElectro3.addCell(CellElectro11);}
          //  if(!jTextManejo.getText().equals("")){TableElectro3.addCell(CellElectro12);}
          //  if(!jTextIngreso.getText().equals("")){TableElectro3.addCell(CellElectro13);}
          //  if(!jTextTratatamiento.getText().equals("")){TableElectro3.addCell(CellElectro14);}
          //  if(!jTextMotivoConsulta7.getText().equals("")){TableElectro3.addCell(CellElectro15);}
            
            
          
            PdfPTable TableElectro4 = new PdfPTable(2); 
            TableElectro4.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidaCeldaElectro = {4f,8f};
            TableElectro4.setWidths(medidaCeldaElectro);
           // TableElectro4.setHorizontalAlignment(Element.ALIGN_CENTER);
           // TableElectro4.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph e10columna1 = new Paragraph("ADMINISTRACIÓN DE TROMBOLITICO");
            e10columna1.getFont().setStyle(Font.BOLD);
            e10columna1.getFont().setSize(9);        
            e10columna1.setFont(Letrasmall);
            e10columna1.setAlignment(Element.ALIGN_CENTER);
            TableElectro4.addCell(e10columna1);
     
            Paragraph e11columna1 = new Paragraph(jTexttrombolitico.getText());
            e11columna1.getFont().setStyle(Font.NORMAL);
            e11columna1.getFont().setSize(9);        
            e11columna1.setFont(Letrasmall);
            e11columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro4.addCell(e11columna1);
        
            
            

            PdfPTable TableElectro5 = new PdfPTable(2); 
            TableElectro5.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableElectro5.setWidths(medidaCeldaElectro);
            TableElectro5.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro5.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph e12columna1 = new Paragraph("CRITERIOS DE REPERFUSIÓN");
            e12columna1.getFont().setStyle(Font.BOLD);
            e12columna1.getFont().setSize(9);        
            e12columna1.setFont(Letrasmall);
            e12columna1.setAlignment(Element.ALIGN_CENTER);
            TableElectro5.addCell(e12columna1);
     
            Paragraph e13columna1 = new Paragraph(jTextCriterios.getText());
            e13columna1.getFont().setStyle(Font.NORMAL);
            e13columna1.getFont().setSize(9);        
            e13columna1.setFont(Letrasmall);
            e13columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro5.addCell(e13columna1);
             


            PdfPTable TableElectro6 = new PdfPTable(2); 
            TableElectro6.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableElectro6.setWidths(medidaCeldaElectro);
            TableElectro6.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro6.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph e14columna1 = new Paragraph("COMPLICACIONES DE LA TROMBOLISIS Y MANEJO DE LAS MISMAS");
            e14columna1.getFont().setStyle(Font.BOLD);
            e14columna1.getFont().setSize(9);        
            e14columna1.setFont(Letrasmall);
            e14columna1.setAlignment(Element.ALIGN_CENTER);
            TableElectro6.addCell(e14columna1);
     
            Paragraph e15columna1 = new Paragraph(jTextManejo.getText());
            e15columna1.getFont().setStyle(Font.NORMAL);
            e15columna1.getFont().setSize(9);        
            e15columna1.setFont(Letrasmall);
            e15columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro6.addCell(e15columna1);

          
            PdfPTable TableElectro7 = new PdfPTable(2); 
            TableElectro7.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableElectro7.setWidths(medidaCeldaElectro);
            TableElectro7.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro7.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph e16columna1 = new Paragraph("DIAGNÓSTICO DE INGRESO");
            e16columna1.getFont().setStyle(Font.BOLD);
            e16columna1.getFont().setSize(9);        
            e16columna1.setFont(Letrasmall);
            e16columna1.setAlignment(Element.ALIGN_CENTER);
            TableElectro7.addCell(e16columna1);
     
            Paragraph e17columna1 = new Paragraph(jTextIngreso.getText());
            e17columna1.getFont().setStyle(Font.NORMAL);
            e17columna1.getFont().setSize(9);        
            e17columna1.setFont(Letrasmall);
            e17columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro7.addCell(e17columna1);

                    
            PdfPTable TableElectro8 = new PdfPTable(2); 
            TableElectro8.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableElectro8.setWidths(medidaCeldaElectro);
            TableElectro8.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro8.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph e18columna1 = new Paragraph("TRATAMIENTO ADMINISTRADO AL INGRESO");
            e18columna1.getFont().setStyle(Font.BOLD);
            e18columna1.getFont().setSize(9);        
            e18columna1.setFont(Letrasmall);
            e18columna1.setAlignment(Element.ALIGN_CENTER);
            TableElectro8.addCell(e18columna1);
     
            Paragraph e19columna1 = new Paragraph(jTextTratatamiento.getText());
            e19columna1.getFont().setStyle(Font.NORMAL);
            e19columna1.getFont().setSize(9);        
            e19columna1.setFont(Letrasmall);
            e19columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro8.addCell(e19columna1);

          
            PdfPTable TableElectro9 = new PdfPTable(2); 
            TableElectro9.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableElectro9.setWidths(medidaCeldaElectro);
            TableElectro9.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableElectro9.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph e20columna1 = new Paragraph("MANEJO DIAGNÓSTICO Y TERAPÉUTICO");
            e20columna1.getFont().setStyle(Font.BOLD);
            e20columna1.getFont().setSize(9);        
            e20columna1.setFont(Letrasmall);
            e20columna1.setAlignment(Element.ALIGN_CENTER);
            TableElectro9.addCell(e20columna1);
     
            Paragraph e21columna1 = new Paragraph(TXTterapeutico.getText());
            e21columna1.getFont().setStyle(Font.NORMAL);
            e21columna1.getFont().setSize(9);        
            e12columna1.setFont(Letrasmall);
            e21columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            TableElectro9.addCell(e21columna1);

          
          
          
          
          // EXAMENES DE LABORATORIO
          
          
          
            PdfPTable TablaLaboratorio = new PdfPTable(3); 
            TablaLaboratorio.setWidthPercentage(100);  
            TablaLaboratorio.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            float[] medidalaboratorio = {4f, 4f, 4f};
            TablaLaboratorio.setWidths(medidalaboratorio);
            TablaLaboratorio.setHorizontalAlignment(Element.ALIGN_CENTER);
            TablaLaboratorio.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph l1columna1 = new Paragraph("ANALISIS REALIZADO FECHA: " +labDate.getText());
            l1columna1.getFont().setStyle(Font.BOLD);
            l1columna1.getFont().setSize(9);        
            l1columna1.setFont(Letra);
            l1columna1.setAlignment(Element.ALIGN_CENTER);
            TablaLaboratorio.addCell(l1columna1);
     
                
            Paragraph l1columna2 = new Paragraph("RESULTADOS");
            l1columna2.getFont().setStyle(Font.BOLD);
            l1columna2.getFont().setSize(9);        
            l1columna2.setFont(Letra);
            l1columna2.setAlignment(Element.ALIGN_CENTER);
            TablaLaboratorio.addCell(l1columna2);

            Paragraph l2columna3 = new Paragraph("UNIDAD");
            l2columna3.getFont().setStyle(Font.BOLD);
            l2columna3.getFont().setSize(10);        
            l2columna3.setFont(Letra);
            l2columna3.setAlignment(Element.ALIGN_CENTER);
            TablaLaboratorio.addCell(l2columna3);

            
          if(!TXThb.getText().equals("")){  
           TablaLaboratorio.addCell(new Paragraph("HB",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXThb.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("g/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
          }
          
          
          if(!TXThematocrito.getText().equals("")){  
           TablaLaboratorio.addCell(new Paragraph("HEMATOCRITO",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXThematocrito.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("%",FontFactory.getFont("Arial",9,Font.NORMAL))); 
          }
                 
          
           if(!TXTleucocitos.getText().equals("")){  
           TablaLaboratorio.addCell(new Paragraph("LEUCOCITOS",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTleucocitos.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("células/μL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTneutrofilos.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("NEUTROFILOS",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTneutrofilos.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("células/μL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
           
           if(!TXTlinfocitos.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("Linfocitos",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTlinfocitos.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("células/μL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTplaquetas.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("PLAQUETAS",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTplaquetas.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("plaquetas/μL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
          if(!TXTpt.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("PT",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTpt.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("%",FontFactory.getFont("Arial",9,Font.NORMAL))); 
          }
            
           if(!TXTpttt.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("PTT",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTpttt.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
            if(!TXTglicemia.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("GLICEMIA",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTglicemia.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mg/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
            
           if(!TXTurea.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("UREA",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTurea.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mg/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
            
           if(!TXTcreatinina.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("CREATININA",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTcreatinina.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mg/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTtfg.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("TFG",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTtfg.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("ml/min",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTacurico.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("ÁCIDO ÚRICO",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTacurico.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("%",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTcolesterol.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("COLESTEROL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTcolesterol.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mmol/L",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
                      
           if(!TXThdl.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("HDL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXThdl.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mg/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
            
           
            if(!TXTldl.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("LDL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTldl.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("ml/min",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
            
           if(!TXTldl.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("TRIGLICERIDOS",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTtrigliceridos.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("μmol/L",FontFactory.getFont("Arial",9,Font.NORMAL))); 
            }
            
           if(!TXTfibrinogeno.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("FIBROGENO",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTfibrinogeno.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTna.getText().equals("")){
           TablaLaboratorio.addCell(new Paragraph("NA+",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTna.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mmol/L",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTk.getText().equals("")){           
           TablaLaboratorio.addCell(new Paragraph("K+",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTk.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mmol/L",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTmg.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("MG+",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTmg.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("mg/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTtgp.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("TGP",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTtgp.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("UI/L",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTtgo.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("TGO",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTtgo.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("UI/L",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTalbumina.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("ALBUMINA",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTalbumina.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("g/dL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXThiv.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("HIV",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXThiv.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTvdrl.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("VDRL",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTvdrl.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
           
           if(!TXTprot.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("PROT/T",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTprot.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           }
             
           if(!TXTinr.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("TXTinr",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTinr.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL)));
           }
           
           if(!TXTbpn.getText().equals("")){ 
           TablaLaboratorio.addCell(new Paragraph("TXTbpn",FontFactory.getFont("Arial",9,Font.NORMAL))); 
           TablaLaboratorio.addCell(new Paragraph(TXTbpn.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
           TablaLaboratorio.addCell(new Paragraph("",FontFactory.getFont("Arial",9,Font.NORMAL)));
            }
           
        
          
           PdfPTable Tablelaboratorio2 = new PdfPTable(3); 
           Tablelaboratorio2.setWidthPercentage(100);  
           // TablaFuncional2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
           float[] medidaCeldasLab = {4f, 4f, 4f};
           Tablelaboratorio2.setWidths(medidaCeldasLab);
           Tablelaboratorio2.setHorizontalAlignment(Element.ALIGN_CENTER);
           Tablelaboratorio2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
          
            Paragraph llab1 = new Paragraph("TROPONINA 1: " + TXTtroponina1.getText());
            llab1.getFont().setStyle(Font.BOLD);
            llab1.getFont().setSize(9);        
            llab1.setFont(Letrasmall);
            llab1.setAlignment(Element.ALIGN_CENTER);
            Tablelaboratorio2.addCell(llab1);
            
            Paragraph l2ab1 = new Paragraph("TROPONINA 2: "+ TXTtroponina2.getText());
            l2ab1.getFont().setStyle(Font.BOLD);
            l2ab1.getFont().setSize(9);        
            l2ab1.setFont(Letrasmall);
            l2ab1.setAlignment(Element.ALIGN_CENTER);
            Tablelaboratorio2.addCell(l2ab1);
            
            Paragraph l3ab1 = new Paragraph("TROPONINA 3: "+ TXTtroponina3.getText());
            l3ab1.getFont().setStyle(Font.BOLD);
            l3ab1.getFont().setSize(9);        
            l3ab1.setFont(Letrasmall);
            l3ab1.setAlignment(Element.ALIGN_CENTER);
            Tablelaboratorio2.addCell(l3ab1);
          
            Tablelaboratorio2.addCell(new Paragraph("Fecha: "+fecha1.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            Tablelaboratorio2.addCell(new Paragraph("Fecha: "+fecha2.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            Tablelaboratorio2.addCell(new Paragraph("Fecha: "+fecha3.getText() ,FontFactory.getFont("Arial",8,Font.NORMAL))); 
            
            
            
            
            
            //----- RAYOS X
            PdfPTable Rayosx = new PdfPTable(1); 
            Rayosx.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
     
            Rayosx.setWidthPercentage(100);  
            Rayosx.setWidths(medidaCeldas3);
            Rayosx.setHorizontalAlignment(Element.ALIGN_CENTER);
            Rayosx.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph rayosx1 = new Paragraph("Diagnóstico rayos x de torax fecha: " +dateRayosx.getText());
            rayosx1.getFont().setStyle(Font.BOLD);
            rayosx1.getFont().setSize(10);        
            rayosx1.setFont(Letra);
           
            PdfPCell cellrayosx1 = new PdfPCell();
            cellrayosx1.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            cellrayosx1.setPadding(0);
            cellrayosx1.setBorder(PdfPCell.NO_BORDER);
            cellrayosx1.setPhrase (new Paragraph(TxtDiagnosticoElectro.getText(),FontFactory.getFont("Arial",9,Font.NORMAL)));
            
            if(!TxtDiagnosticoElectro.getText().equals("")){
            rayosx1.setAlignment(Element.ALIGN_JUSTIFIED);
            Rayosx.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            Rayosx.addCell(rayosx1);
            Rayosx.addCell(cellrayosx1);   

                 }         
           
           
           
            PdfPTable TableRayosx2 = new PdfPTable(1); 
            TableRayosx2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableRayosx2.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TableRayosx2.setWidthPercentage(100);  
            TableRayosx2.setWidths(medidaCeldas3);
            TableRayosx2.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableRayosx2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph ra1columna1 = new Paragraph("ECOGRAFIA AURÍCULA IZQUIERDA: "+ TxtiAuriculazquierda.getText());
            ra1columna1.getFont().setStyle(Font.NORMAL);
            ra1columna1.getFont().setSize(9);        
            ra1columna1.setFont(Letrasmall);
            ra1columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx2 = new PdfPCell(ra1columna1);
            Cellrayosx2.setBorder(Rectangle.NO_BORDER);
            Cellrayosx2.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra2columna1 = new Paragraph("ECOGRAFIA AURÍCULA DERECHA: "+ TXTauriculaderecha.getText());
            ra2columna1.getFont().setStyle(Font.NORMAL);
            ra2columna1.getFont().setSize(9);        
            ra2columna1.setFont(Letrasmall);
            ra2columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx3 = new PdfPCell(ra2columna1);
            Cellrayosx3.setBorder(Rectangle.NO_BORDER);
            Cellrayosx3.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra3columna1 = new Paragraph("ECOGRAFIA VENTRÍCULO IZQUIERDO: "+ TxtiAuriculazquierda.getText());
            ra3columna1.getFont().setStyle(Font.NORMAL);
            ra3columna1.getFont().setSize(9);        
            ra3columna1.setFont(Letrasmall);
            ra3columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx4 = new PdfPCell(ra3columna1);
            Cellrayosx4.setBorder(Rectangle.NO_BORDER);
            Cellrayosx4.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra4columna1 = new Paragraph("ECOGRAFIA VENTRÍCULO DERECHO: "+ TXTventriculoderecho.getText());
            ra4columna1.getFont().setStyle(Font.NORMAL);
            ra4columna1.getFont().setSize(9);        
            ra4columna1.setFont(Letrasmall);
            ra4columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx5 = new PdfPCell(ra4columna1);
            Cellrayosx5.setBorder(Rectangle.NO_BORDER);
            Cellrayosx5.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra5columna1 = new Paragraph("ECOGRAFIA VENTRÍCULO IZQUIERDO: "+ TxtiAuriculazquierda.getText());
            ra5columna1.getFont().setStyle(Font.NORMAL);
            ra5columna1.getFont().setSize(9);        
            ra5columna1.setFont(Letrasmall);
            ra5columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx6 = new PdfPCell(ra5columna1);
            Cellrayosx6.setBorder(Rectangle.NO_BORDER);
            Cellrayosx6.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra6columna1 = new Paragraph("ECOGRAFIA CONTRACTILIDAD: "+ TXTcontractilidad.getText());
            ra6columna1.getFont().setStyle(Font.NORMAL);
            ra6columna1.getFont().setSize(9);        
            ra6columna1.setFont(Letrasmall);
            ra6columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx7 = new PdfPCell(ra6columna1);
            Cellrayosx7.setBorder(Rectangle.NO_BORDER);
            Cellrayosx7.enableBorderSide(Rectangle.BOTTOM);
           
            Paragraph ra7columna1 = new Paragraph("ECOGRAFIA FRACCIÓN DE EYECCIÓN: "+ TXTeyeccion.getText());
            ra7columna1.getFont().setStyle(Font.NORMAL);
            ra7columna1.getFont().setSize(9);        
            ra7columna1.setFont(Letrasmall);
            ra7columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx8 = new PdfPCell(ra7columna1);
            Cellrayosx8.setBorder(Rectangle.NO_BORDER);
            Cellrayosx8.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra8columna1 = new Paragraph("ECOGRAFIA FUNCIÓN SISTÓLICA VD: "+ TXTsistolica.getText());
            ra8columna1.getFont().setStyle(Font.NORMAL);
            ra8columna1.getFont().setSize(9);        
            ra8columna1.setFont(Letrasmall);
            ra8columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx9 = new PdfPCell(ra8columna1);
            Cellrayosx9.setBorder(Rectangle.NO_BORDER);
            Cellrayosx9.enableBorderSide(Rectangle.BOTTOM);
           
            Paragraph ra9columna1 = new Paragraph("ECOGRAFIA PSAP/MMHG: "+ TXTpsap.getText());
            ra9columna1.getFont().setStyle(Font.NORMAL);
            ra9columna1.getFont().setSize(9);        
            ra9columna1.setFont(Letrasmall);
            ra9columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx10 = new PdfPCell(ra9columna1);
            Cellrayosx10.setBorder(Rectangle.NO_BORDER);
            Cellrayosx10.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra10columna1 = new Paragraph("ECOGRAFIA VÁLVULAS: "+ TXTvalvulas.getText());
            ra10columna1.getFont().setStyle(Font.NORMAL);
            ra10columna1.getFont().setSize(9);        
            ra10columna1.setFont(Letrasmall);
            ra10columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx11 = new PdfPCell(ra10columna1);
            Cellrayosx11.setBorder(Rectangle.NO_BORDER);
            Cellrayosx11.enableBorderSide(Rectangle.BOTTOM);
            
            Paragraph ra11columna1 = new Paragraph("ECOGRAFIA MITRAL: "+ TXTmitral.getText());
            ra11columna1.getFont().setStyle(Font.NORMAL);
            ra11columna1.getFont().setSize(9);        
            ra11columna1.setFont(Letrasmall);
            ra11columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx12 = new PdfPCell(ra11columna1);
            Cellrayosx12.setBorder(Rectangle.NO_BORDER);
            Cellrayosx12.enableBorderSide(Rectangle.BOTTOM);
           
            Paragraph ra12columna1 = new Paragraph("ECOGRAFIA AORTICA: "+ TXTaortica.getText());
            ra12columna1.getFont().setStyle(Font.NORMAL);
            ra12columna1.getFont().setSize(9);        
            ra12columna1.setFont(Letrasmall);
            ra12columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx13 = new PdfPCell(ra12columna1);
            Cellrayosx13.setBorder(Rectangle.NO_BORDER);
            Cellrayosx13.enableBorderSide(Rectangle.BOTTOM);
           
           
            Paragraph ra13columna1 = new Paragraph("ECOGRAFIA TRICÚSPIDE: "+ TXTtricuspide.getText());
            ra13columna1.getFont().setStyle(Font.NORMAL);
            ra13columna1.getFont().setSize(9);        
            ra13columna1.setFont(Letrasmall);
            ra13columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx14 = new PdfPCell(ra13columna1);
            Cellrayosx14.setBorder(Rectangle.NO_BORDER);
            Cellrayosx14.enableBorderSide(Rectangle.BOTTOM);
           
            Paragraph ra14columna1 = new Paragraph("ECOGRAFIA PULMONAR: "+ TXTpulmonar.getText());
            ra14columna1.getFont().setStyle(Font.NORMAL);
            ra14columna1.getFont().setSize(9);        
            ra14columna1.setFont(Letrasmall);
            ra14columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx15 = new PdfPCell(ra14columna1);
            Cellrayosx15.setBorder(Rectangle.NO_BORDER);
            Cellrayosx15.enableBorderSide(Rectangle.BOTTOM);
           
            Paragraph ra15columna1 = new Paragraph("ECOGRAFIA PERICARDIO: "+ TXTpericardio.getText());
            ra15columna1.getFont().setStyle(Font.NORMAL);
            ra15columna1.getFont().setSize(9);        
            ra15columna1.setFont(Letrasmall);
            ra15columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx16 = new PdfPCell(ra15columna1);
            Cellrayosx16.setBorder(Rectangle.NO_BORDER);
            Cellrayosx16.enableBorderSide(Rectangle.BOTTOM);
           
            Paragraph ra16columna1 = new Paragraph("Otros: "+ TXTotros.getText());
            ra16columna1.getFont().setStyle(Font.NORMAL);
            ra16columna1.getFont().setSize(9);        
            ra16columna1.setFont(Letrasmall);
            ra16columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Cellrayosx17 = new PdfPCell(ra16columna1);
            Cellrayosx17.setBorder(Rectangle.NO_BORDER);
            Cellrayosx17.enableBorderSide(Rectangle.BOTTOM);
           
           
           
            if(!TxtiAuriculazquierda.getText().equals("")){TableRayosx2.addCell(Cellrayosx2);}
            if(!TXTauriculaderecha.getText().equals("")){TableRayosx2.addCell(Cellrayosx3);}
            if(!TXTventriculoizquierdo.getText().equals("")){TableRayosx2.addCell(Cellrayosx4);}
            if(!TXTventriculoderecho.getText().equals("")){TableRayosx2.addCell(Cellrayosx5);}
            if(!TXTcontractilidad.getText().equals("")){TableRayosx2.addCell(Cellrayosx6);}
            if(!TXTeyeccion.getText().equals("")){TableRayosx2.addCell(Cellrayosx7);}
            if(!TXTsistolica.getText().equals("")){TableRayosx2.addCell(Cellrayosx8);}
            if(!TXTpsap.getText().equals("")){TableRayosx2.addCell(Cellrayosx9);}
            if(!TXTmitral.getText().equals("")){TableRayosx2.addCell(Cellrayosx10);}
            if(!TXTaortica.getText().equals("")){TableRayosx2.addCell(Cellrayosx11);}
            if(!TXTtricuspide.getText().equals("")){TableRayosx2.addCell(Cellrayosx12);}
            if(!TXTpulmonar.getText().equals("")){TableRayosx2.addCell(Cellrayosx13);}
            if(!TXTpericardio.getText().equals("")){TableRayosx2.addCell(Cellrayosx14);}
            if(!TXTotros.getText().equals("")){TableRayosx2.addCell(Cellrayosx15);}

            
            
            
            
            
            
            
            
            
            
            
            
            
            //----------------------------------------------
            PdfPTable TableConclusion = new PdfPTable(1); 
            TableConclusion.getDefaultCell().setBorder(PdfPCell.NO_BORDER);

            TableConclusion.setWidthPercentage(100);  
            TableConclusion.setWidths(medidaCeldas3);
            TableConclusion.setHorizontalAlignment(Element.ALIGN_CENTER);
     
           
            
            Paragraph t67columna1 = new Paragraph("C O N C L U S I Ó N   &   R E C O M E N D A C I O N E S \n\n"+ jConclusion.getSelectedItem().toString());
            t67columna1.getFont().setStyle(Font.BOLD);
            t67columna1.getFont().setSize(10);        
            t67columna1.setFont(Letra);
            t67columna1.setAlignment(Element.ALIGN_CENTER);
            
            PdfPCell Conclusiones = new PdfPCell(t67columna1 );
            Conclusiones.setBorder(Rectangle.NO_BORDER);
            Conclusiones.enableBorderSide(Rectangle.BOTTOM);
            Conclusiones.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableConclusion.addCell(Conclusiones);  

            
            
            

            PdfPTable TableConclusion2 = new PdfPTable(1); 
            TableConclusion2.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            TableConclusion2.setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
            TableConclusion2.setWidthPercentage(100);  
            TableConclusion2.setWidths(medidaCeldas3);
            TableConclusion2.setHorizontalAlignment(Element.ALIGN_CENTER);
            TableConclusion2.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
           
            
            Paragraph t68columna1 = new Paragraph(jTextConclusion.getText());
            t68columna1.getFont().setStyle(Font.NORMAL);
            t68columna1.getFont().setSize(9);        
            t68columna1.setFont(Letrasmall);
            t68columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Thend1 = new PdfPCell(t68columna1);
            Thend1.setBorder(Rectangle.NO_BORDER);
           // aspectoFisico.enableBorderSide(Rectangle.BOTTOM);
            TableConclusion2.addCell(Thend1);
            
            Paragraph t69columna1 = new Paragraph(jTextRecomendacion.getText());
            t69columna1.getFont().setStyle(Font.NORMAL);
            t69columna1.getFont().setSize(9);        
            t69columna1.setFont(Letrasmall);
            t69columna1.setAlignment(Element.ALIGN_JUSTIFIED);
            PdfPCell Thend2 = new PdfPCell(t69columna1);
            Thend2.setBorder(Rectangle.NO_BORDER);
           //aspectoFisico2.enableBorderSide(Rectangle.BOTTOM);
            TableConclusion2.addCell(Thend2);




           
           
        
           
           
           
           
           
           
           
           
           
           
           
           


// F O O T E R
            
            

           
            saltolinea.add("\n");
           
            // H E A  D E R
            doc.add(Tabla);
            doc.add(Tabla0);
            doc.add(saltolinea);
          
            
            
            
           //B O D Y
           
          
            doc.add(Tabla2);
            doc.add(saltolinea);
            
            
          
           //Antecedentes
           int ant1 = jTableAF2.getRowCount();  
           int ant2 =  jTableAntpersonal.getRowCount();  
            

           // Verificar si el modelo tiene o no filas
           if (ant1 > 0 && ant2>0) {
            doc.add(TableProcedimiento);
            doc.add(TableAntc2);
            doc.add(saltolinea);
           }
           else if(ant1>0){
           doc.add(TableProcedimiento);
           doc.add(saltolinea);
           }
           else if(ant2>0){
           doc.add(TableAntc2);
           doc.add(saltolinea);
           }
      
           
           
           //RIESGOS CARDIOVASCULARES
            doc.add(TableRiesgo);
        
           
           
           
           
           
           
           
           
           
           
           //Revision funcional
            

            if(jCheckConstitucional.isSelected() || jCheckPielMucosa.isSelected() || jCheckORL.isSelected() || jCheckRespiratorio.isSelected() ||
               jCheckAngina.isSelected()    || jCheckBox9.isSelected()  || jCheckBox16.isSelected() || jCheckBox20.isSelected() || jCheckBox6.isSelected()
               || jCheckBox6.isSelected()   || jCheckBox10.isSelected() || jCheckBox17.isSelected() || jCheckBox7.isSelected()  || jCheckBox11.isSelected()
               || jCheckBox15.isSelected()  || jCheckBox1.isSelected()  || jCheckBox12.isSelected() || jCheckBox14.isSelected() || jCheckBox19.isSelected()
               || jCheckBox27.isSelected()  || jCheckBox18.isSelected() || jCheckBox25.isSelected() || jCheckBox22.isSelected() || jCheckBox23.isSelected()
               || jCheckBox24.isSelected()  || jCheckBox28.isSelected()        
                    ){
            doc.add(saltolinea);
            doc.add(TablaFuncional1);
            doc.add(TablaFuncional2); 
            doc.add(saltolinea);
            }

             
            //mestruacion
           
                 
            if(Sexo.equals("Femenino") && !TxtCiclosMestru.getText().equals("")){
            
            if (FechaAsignar2.getDate() == null) {
            JOptionPane.showMessageDialog(this, "DEBE ASIGNAR UNA FECHA EN : ULTIMA MENSTRUACION", "CAMPOS", 1);
            }
            
            else{
            doc.add(saltolinea);
            doc.add(TablaFuncional3);
            doc.add(TablaFuncional4);
            doc.add(saltolinea);
            
            }
    
            }
            
          
      if(!jComboHabitos.getSelectedItem().equals("N/R")
                   
              || !jTConsumoAlcohol.getText().equals("")
              || !jTConsumoTabaco.getText().equals("")
              || !jTConsumoDrugs.getText().equals("")){ doc.add(TablaFuncional5);    doc.add(saltolinea);}  
         
      
      
          if(!jActividadF.getSelectedItem().equals("N/R") 
              || !Fsemanal.getSelectedItem().equals("N/R") 
              || !jSueno.getSelectedItem().equals("N/R") 
              || !jSexualidad.getSelectedItem().equals("N/R") ){
           doc.add(TablaFuncional6);
          doc.add(saltolinea);
          }
          
          
         
          
          
          
          //EXAMEN FISICO
          
          if(!TXTpesoIdeal.getText().equals("") ||
             !TXTpesoAdic.getText().equals("") ||
             !TXTimc.getText().equals("") ||
             !TXTaspecto.getText().equals("") ||
             !TXTabdominal.getText().equals("") ||
                  
             !TXTtemperatura.getText().equals("") ||
             !TXTpulso.getText().equals("") ||
             !TXTfr.getText().equals("") ||
             !TXTrespiracion.getText().equals("") ||
             !TXTtension.getText().equals("") ||
             !TXTcadera.getText().equals("")  
                  ){
          doc.add(tituloFisico);
          doc.add(saltolinea);
          }
          
          
          
          
           if(!TXTtalla.getText().equals("0")
              ||!TXTpeso.getText().equals("0")
              ||!TXTpesoIdeal.getText().equals("")
              ||!TXTpesoAdic.getText().equals("")
              ||!TXTimc.getText().equals("")
              ||!TXTtemperatura.getText().equals("")
              ||!TXTpulso.getText().equals("")
           
                    
                    ){    
           doc.add(TableFisico2);
          doc.add(saltolinea);}

      
             
          if(!TXTfr.getText().equals("") || !TXTrespiracion.getText().equals("") || !TXTtension.getText().equals("") || !TXTaspecto.getText().equals("")
             || !TXTabdominal.getText().equals("") ||  !TXTcadera.getText().equals("")){
          doc.add(TableFisico3);
          doc.add(saltolinea);  
          }
          
          doc.add(TableFisico4);
          doc.add(saltolinea);
          
          
          //EXAMESN ELECTRO
          if(!TxtDiagnosticoElectro.getText().equals("")){
          doc.add(TableElectro);
          doc.add(saltolinea);
          doc.add(TableElectro2 );
          doc.add(saltolinea);
          }
          doc.add(TableElectro3);
          doc.add(saltolinea);
          
          
          
           if(!jTexttrombolitico.getText().equals("")){ 
              doc.add(TableElectro4);
              doc.add(saltolinea);
           }
           
           if(!jTextCriterios.getText().equals("")){ 
              doc.add(TableElectro5);
              doc.add(saltolinea);
           }
          
            if(!jTextManejo.getText().equals("")){ 
              doc.add(TableElectro6);
              doc.add(saltolinea);
           }
          
            
              if(!jTextIngreso.getText().equals("")){ 
              doc.add(TableElectro7);
              doc.add(saltolinea);
           }
           
           if(!jTextTratatamiento.getText().equals("")){ 
              doc.add(TableElectro8);
              doc.add(saltolinea);
           }
          
            if(!TXTterapeutico.getText().equals("")){ 
              doc.add(TableElectro9);
              doc.add(saltolinea);
           }
          
       
          // TABLE LABORATORIO
          
          
            if(!TXThb.getText().equals("")                 ||  !TXTpt.getText().equals("")          ||  !TXTacurico.getText().equals("")        ||  !TXTna.getText().equals("")
               ||  !TXThematocrito.getText().equals("")    ||  !TXTpttt.getText().equals("")        ||  !TXTcolesterol.getText().equals("")     ||  !TXTk.getText().equals("")
               ||  !TXTleucocitos.getText().equals("")     ||  !TXTglicemia.getText().equals("")    ||  !TXThdl.getText().equals("")            ||  !TXTmg.getText().equals("")
               ||  !TXTneutrofilos.getText().equals("")    ||  !TXTurea.getText().equals("")        ||  !TXTldl.getText().equals("")            ||  !TXTtgp.getText().equals("")
               ||  !TXTlinfocitos.getText().equals("")     ||  !TXTcreatinina.getText().equals("")  ||  !TXTtrigliceridos.getText().equals("")  ||  !TXTtgo.getText().equals("") 
               ||  !TXTplaquetas.getText().equals("")      ||  !TXTtfg.getText().equals("")         ||  !TXTfibrinogeno.getText().equals("")    ||  !TXTalbumina.getText().equals("")
               ||  !TXThiv.getText().equals("")            ||  !TXTvdrl.getText().equals("")        ||  !TXTprot.getText().equals("")           ||  !TXTinr.getText().equals("") 
               ||  !TXTbpn.getText().equals("")                     
               ){
            
             doc.add(TablaLaboratorio);
             doc.add(saltolinea);
            }
          
            if(!TXTtroponina1.getText().equals("")  || !TXTtroponina1.getText().equals("") || !TXTtroponina1.getText().equals("") ){
            
            doc.add(Tablelaboratorio2);
            doc.add(saltolinea);
            }
          
     
          
           
            
          // -----------------  RAYOS X 
       //   if(!JtxtRayosx.getText().equals("")){
          doc.add(Rayosx);
          doc.add(saltolinea);
          doc.add(TableRayosx2);
          doc.add(saltolinea);
         // } 
            
            
            
            
            
            
            
            
            
         
            //- C O N C L U S I O N -
       if(!jConclusion.getSelectedItem().equals("Seleccionar")){
            doc.add(TableConclusion);
            doc.add(saltolinea);
       }
     
          doc.add(TableConclusion2);
            
            
            
            
            
            //F O O T E R
           // doc.add(Tablafirma);
          //  doc.add(TablafirmaLcdo);
         
  
            
       
            
    
            doc.close();
            archivo.close();
        
            Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
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
      
      
      
      
      
      
      
      
      
      
   
      
      
      
      
      
      
      
      
      
   
      
 
       public void guardarReporte()
    {

      
        ruta_archivo="C://Cyberia//Reportes_Consulta//"+PdfNames+".pdf";
        int codigo =  idAsignar;
        File ruta = new File(ruta_archivo);
       
        
       
        
        if ( ruta_archivo.trim().length() != 0) {
           
            
            
            guardar_pdf(codigo, ruta);
 
         //   tpdf.visualizar_PdfVO(tabla);
         ruta_archivo = "";
         // activa_boton(false, false, false);
  
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
    
    }
       
       
       
       
       
       
      
       public void guardar_pdf(int codigo, File ruta) {
        
        
   
        
        AddPdfConsulta pa = new AddPdfConsulta();
        AddPdfConsultaDao po = new  AddPdfConsultaDao();
        pa.setIdConsulta(codigo);
        
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            pa.setArchivo(pdf);
        } catch (IOException ex) {
            pa.setArchivo(null);
            System.out.println("Error al agregar archivo pdf "+ex);
        }
        po.Agregar_PdfVO(pa);
    }


    
   
      

       
          
      
      
 
 String rutaHistoria;
 public void guardarHistoria()
    {

      
        rutaHistoria="C://Cyberia//Reportes_Consulta//"+PdfNamesHistorias+".pdf";
        int codigo =  idAsignar;
        File ruta = new File(rutaHistoria);
        int paciente=IdPaciente;
        int estadohistoria=103;
        
       
        
        if ( rutaHistoria.trim().length() != 0) {
           
            
            
            guardarH_pdf(codigo, ruta, paciente, estadohistoria);
 
         //   tpdf.visualizar_PdfVO(tabla);
         rutaHistoria = "";
         // activa_boton(false, false, false);
  
        } else {
            JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
        }
    
    }
       
       
       
       
       
       
      
       public void guardarH_pdf(int codigo, File ruta, int paciente, int estadohistoria) {
        
        
   
        
        AddPdfConsulta pa = new AddPdfConsulta();
        AddPdfConsultaDao po = new  AddPdfConsultaDao();
        pa.setIdHistoria(codigo);
       // pa.setId_pacienteh(paciente);
        pa.setId_Estadoh(estadohistoria);
        
        
        
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            pa.setArchivoHistoria(pdf);
        } catch (IOException ex) {
            pa.setArchivoHistoria(null);
            System.out.println("Error al agregar archivo pdf "+ex);
        }
        po.AgregarHistoriaPdfVO(pa);
    }


      
      
      
   
     
      
      
      
      
      
      public void visualizar_PdfVO(JTable tabla) {
        
        
        try {
        
        
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        

        
        dt.addColumn("Código");
        dt.addColumn("Doctor");
        dt.addColumn("Fecha");
        dt.addColumn("Reporte");
        dt.addColumn("Estado");
      //dt.addColumn("Usuario encargado");
      //dt.addColumn("Fecha");
      //dt.addColumn("archivopdf");
      //dt.addColumn("Estado");
      //dt.addColumn("Correo");
        
        ImageIcon icono = null;
        if (get_Image("/Logos/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/Logos/32pdf.png"));
        }

       
        AddPdfConsulta vo = new AddPdfConsulta();
        ArrayList<AddPdfConsulta> list = Listar_PdfVO();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getIdConsulta();
                fila[1] = vo.getNombredoctor();
                fila[2] = vo.getFechaAsignar();
           
                
                   
                if (vo.getArchivo() != null) {
                    fila[3] = new JButton(icono);
                } else {
                    fila[3] = new JButton("Vacio");
                }

                
                  fila[4] = vo.getEstado();
            
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
            acomodarConsultasN();
            
            
   
        
        }
        
   
                

        
        
                 } catch (Exception e) { System.out.println(e + "visualizarpdf") ;
        }
           
    }
    
      
      
      
      
      
      
        public ArrayList<AddPdfConsulta> Listar_PdfVO() {
           
 Connection con;
 EnlaceBd cn = new EnlaceBd();
 PreparedStatement ps=null;
 ResultSet rs=null;
        
//String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaOne.getDate());
// String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(FechaTwo.getDate());
    
    
    
    ArrayList<AddPdfConsulta> list = new ArrayList<AddPdfConsulta>();
   String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar1.getDate());  
   
        String sql = "SELECT IdAsignar, IdPacientes, Usuario, Id_Especialidades, FechaAsignar, ReporteConsulta, EstadoA, Estado\n" +
"FROM table_asignar u\n" +
"\n" +
"INNER JOIN table_estado l\n" +
"ON u.EstadoA=l.IdEstado \n"+
                
"INNER JOIN table_usuario x\n" +
"ON u.IdUsuario=x.IdPersonal \n"+            
                
"where Id_Especialidades LIKE '%" + idespecialidad + "%'     AND IdPacientes = "+  '"' + PacienteSelec + '"'  +   "ORDER by IdAsignar";    


            
     
  
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            while (rs.next()) {
                AddPdfConsulta vo = new AddPdfConsulta();
                vo.setIdConsulta(rs.getInt(1));
                vo.setNombredoctor(rs.getString(3));
                vo.setFechaAsignar(rs.getString(5));
                vo.setArchivo(rs.getBytes(6));
                vo.setEstado(rs.getString(8));
   
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex);
            }
        }
        return list;
    }

      
      
      
        
      
      // LISTAR HISTORIAS
        
        
            public void visualizar_PdfVOHistorias(JTable tabla) {
        
        
        try {
        
        
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        

        
        dt.addColumn("Código");
        dt.addColumn("Doctor");
        dt.addColumn("Fecha");
        dt.addColumn("Reporte");
        dt.addColumn("Estado");

        
        ImageIcon icono = null;
        if (get_Image("/Logos/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/Logos/32pdf.png"));
        }

       
        AddPdfConsulta vo = new AddPdfConsulta();
        ArrayList<AddPdfConsulta> list = Listar_PdfVOHistorias();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getIdHistoria();
                fila[1] = vo.getNombredoctor();
                fila[2] = vo.getFecha_Historia();
           
                
                   
                if (vo.getArchivoHistoria() != null) {
                    fila[3] = new JButton(icono);
                } else {
                    fila[3] = new JButton("Vacio");
                }

                
                  fila[4] = vo.getEstado();
            
                
                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
            acomodarConsultasN();
            
            
   
        
        }

                 } catch (Exception e) { System.out.println(e + "visualizarpdf") ;
        }
           
    }
    
      
      
      
      
      
      
        public ArrayList<AddPdfConsulta> Listar_PdfVOHistorias() {
           
 Connection con;
 EnlaceBd cn = new EnlaceBd();
 PreparedStatement ps=null;
 ResultSet rs=null;
        
//String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaOne.getDate());
// String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(FechaTwo.getDate());
    
    
    
ArrayList<AddPdfConsulta> list = new ArrayList<AddPdfConsulta>();
String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaAsignar1.getDate());  

String sql = "SELECT Id_historias, Usuario, Id_pacienteh, Fecha_Historia, Archivo_Historia, Id_Estadoh, Estado\n" +
             "FROM table_historias u \n" +
             "INNER JOIN table_estado l \n" +
             "ON u.Id_Estadoh=l.IdEstado \n" +
             "INNER JOIN table_usuario x \n" +
             "ON u.Id_usuarioh=x.IdPersonal \n" +
             "WHERE Id_pacienteh LIKE '"+ IdPaciente + "'\n" +
             "ORDER BY Id_historias";
                

                
                
//"ON u.Id_personal=x.IdPersonal WHERE FechaReporte BETWEEN " + '"' + fecha + '"' + "AND"  + '"' + fecha2 + '"' +"ORDER BY  Codigopdf ASC";
            
     
  
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            while (rs.next()) {
                
                int estado =rs.getInt("Id_Estadoh"); 
                if( estado==103 ){
                AddPdfConsulta vo = new AddPdfConsulta();
                vo.setIdHistoria(rs.getInt(1));
                vo.setNombredoctor(rs.getString(2));
                vo.setFecha_Historia(rs.getString(4));
                vo.setArchivoHistoria(rs.getBytes(5));
                vo.setEstado(rs.getString(7));
   
                list.add(vo);}
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex);
            }
        }
        return list;
    }
      
      
      
      
      
        
        
        
        
        
      
      
      
      
          
   public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) { System.out.println(e);
        }
        return null;
    }
    
      
      
      
      
      
        public void SearchAntecedentesF(){
              
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;

    String Busqueda = this.TxtbusquedaAntc.getText();
    String sql = "select * from table_afamiliares  WHERE Enfermedad LIKE '%" + Busqueda + "%'  ORDER by Id_AFamiliares ASC ";
    
         
     
        //DECLARACIÓN DEL MODELO DE LA TABLA
        DefaultTableModel Tabla = (DefaultTableModel)jTableAntecedentesF.getModel();
        jTableAntecedentesF.setDefaultEditor(Object.class, null);
        try
        {
            //SENTENCIA SQL Y VARIABLES PARA CONEXION Y CONSULTA
    
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            limpiarTAntecedentes();

            while(rs.next()) 
            {
                //LLENADO DE TABLA
               int id = rs.getInt(1);
               String enfermedad = rs.getString(2);
         //      int estadonum = rs.getInt(8);
             
             //  if(estadonum==102){
               Vector vRow=new Vector();
               vRow.add(id);
               vRow.add(enfermedad);
 
               Tabla.addRow(vRow);
               
             //  }
          
            }            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
  }
      
      
        
        
        
        
        
        
        
        
         public void SearchAntecedentesP(){
              
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;

    String Busqueda = this.TxtBusAntcP.getText();
    String sql = "select * from table_afamiliarespers  WHERE EnfermedadPer LIKE '%" + Busqueda + "%'  ORDER BY EnfermedadPer ASC; ";
    
         
     
        //DECLARACIÓN DEL MODELO DE LA TABLA
        DefaultTableModel Tabla = (DefaultTableModel)jTableAntcPers.getModel();
        jTableAntcPers.setDefaultEditor(Object.class, null);
        try
        {
            //SENTENCIA SQL Y VARIABLES PARA CONEXION Y CONSULTA
    
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            limpiarTAntecedentesPerso();

            while(rs.next()) 
            {
                //LLENADO DE TABLA
               int id = rs.getInt(1);
               String enfermedad = rs.getString(2);
         //      int estadonum = rs.getInt(8);
             
             //  if(estadonum==102){
               Vector vRow=new Vector();
               vRow.add(id);
               vRow.add(enfermedad);
 
               Tabla.addRow(vRow);
               
             //  }
          
            }            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
  }
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      int cantidad=0;
     public void addAntec1() {
//controlT.AsignarPaciente(JTableLaboratorio, (String) JComboEstudio.getSelectedItem(), 0, modelo);
            


        cantidad=cantidad+1;
        modelo = (DefaultTableModel) jTableAF2.getModel();
    //    Procedimiento = JComboProcedimientos.getSelectedItem().toString();
    
      
            ArrayList lista = new ArrayList();
     
            lista.add(cantidad);
            lista.add(EnfermedadAF);
            lista.add(JtextAntc1.getText());
            Object[] ob = new Object[8];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            modelo.addRow(ob);
            jTableAF2.setModel(modelo);
            jTableAF2.setDefaultEditor(Object.class, null);
    }
      
      
     
     
     
     
     
        int  cantidad2 =0;            
        public void addAntec2() {
            


        cantidad2=cantidad2+1;
        modelo = (DefaultTableModel) jTableAntpersonal.getModel();

    
      
            ArrayList lista = new ArrayList();
     
            lista.add(cantidad2);
            lista.add(TextAntPersonal);
            lista.add(jTextAntPersonales.getText());
            Object[] ob = new Object[8];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            modelo.addRow(ob);
            jTableAntpersonal.setModel(modelo);
            jTableAntpersonal.setDefaultEditor(Object.class, null);
            acomodarAntec2();
    }
      
      
      
        
 
        
        
        
        
     
     
     
     String CMA, MPPS;
         public void ActivarFirma()  {
             
        
        Connection con=null;     
        int idfirma=TP.getTexto();
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
          
        try {
            ps = cn.getConnection().prepareStatement("SELECT  Firma, CMA, MPPS FROM table_personal WHERE IdPersonal = ?");
            ps.setInt(1, idfirma);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
                CMA=rs.getString(2);
                MPPS=rs.getString(3);
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
            //JOptionPane.showMessageDialog(null, "Estimado: "+  nameof + " su firma ha sido activada", "ACTIVAR FIRMA", 1);
     
        } catch (Exception e) {
            System.out.println(e);
            DesactivarFirma();
           
        }
        
         
        
    }
     
     
     
      
      
      
      
       public void DesactivarFirma() {
    
          
       String nameof=TP.getUser();
          
        Connection con=null;
        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;
          
        try {
            ps = cn.getConnection().prepareStatement("SELECT img FROM tableinfo WHERE Idinfo = ?;");
            ps.setInt(1, 1);
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
            //JOptionPane.showMessageDialog(null, "Estimado: "+  nameof + " su firma ha sido desactivada", "DESACTIVAR FIRMA", 1);
     
        } catch (Exception e) {
            System.out.println(e);
           
        }
        

        
        
        
    }
      
      

    
  
  
  
  
  
  
  
     
         public void MostrarFGeneral(){

             
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          
          
      // MOSTRAR EXAMEN FISICO NORMAL    
       try{
    

       
       String query="SELECT * from examen_fgeneral where Id_Historia =?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
       rs=ps.executeQuery();
   
       if (rs.next()){
       TXTtalla.setText(rs.getString("Talla"));
       TXTpeso.setText(rs.getString("Peso"));
       TXTpesoIdeal.setText(rs.getString("Peso_ideal"));
       TXTpesoAdic.setText(rs.getString("Peso_Adic"));
       TXTimc.setText(rs.getString("IMC"));
       TXTaspecto.setText(rs.getString("Aspecto"));
       TXTabdominal.setText(rs.getString("Abdominal"));
       TXTtemperatura.setText(rs.getString("Temperatura"));
       TXTpulso.setText(rs.getString("Pulso"));
       TXTfr.setText(rs.getString("Fr"));
       TXTrespiracion.setText(rs.getString("Tipo_respiracion"));
       TXTcadera.setText(rs.getString("Cadera"));
       TXTtension.setText(rs.getString("Tension"));
       jTextMotivoConsulta.setText(rs.getString("Motivo_Consulta"));
    
       JOptionPane.showMessageDialog(null, "LOS DATOS FUERON CARGADOS A HISTORIA CLINICA", "HISTORIA CLINICA", 1);
       }
       
       else{
       
       JOptionPane.showMessageDialog(null, "NO FUE POSIBLE CARGAR LOS DATOS DE ESTA HISTORIA CLINICA", "HISTORIA CLINICA", JOptionPane.ERROR_MESSAGE);
       }
       
          }
catch(Exception e){System.out.println("Error en cargar datos a historia "+e);}
       
       
             finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        }
       
      }
      
       
  
         
         
         
         
         
         
         
         
         public void mostrarFisico(){
     
   
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          
             try{
    

       
       String query="SELECT * from examen_fisico where Id_Historia=?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
     //  System.out.println(idtablaHistorias);
       rs=ps.executeQuery();
   
       if (rs.next()){
       TXTpiel.setText(rs.getString("Piel"));
       TXTojos.setText(rs.getString("Ojos"));
       TXToidos.setText(rs.getString("Oidos"));
       TXTdientes.setText(rs.getString("Dientes"));
       TXTboca.setText(rs.getString("Boca"));
       TXTcuello.setText(rs.getString("Cuello"));
       TXTcorazon.setText(rs.getString("Corazon"));
       TXTAbdomen2.setText(rs.getString("Abdomen"));
       TXTcolumna.setText(rs.getString("Columna"));
       TXTinferior.setText(rs.getString("ExtrInferior"));
       TXTlinfaticos.setText(rs.getString("Linfaticos"));
       TXTgenitales.setText(rs.getString("Genitales"));
       TXTrectal.setText(rs.getString("Ano"));
       TXToftamoscopia.setText(rs.getString("Oftamoscopia"));
       TXTnariz.setText(rs.getString("Nariz"));
       TXTtorax.setText(rs.getString("Torax"));
       TXTmamas.setText(rs.getString("Mamas"));
       TXTpulmones.setText(rs.getString("Pulmones"));
       TXThernias.setText(rs.getString("Hernias"));
       TXTsuperior.setText(rs.getString("ExtSuperior"));
       TXTarterias.setText(rs.getString("Arterias"));
       TXTvenas.setText(rs.getString("Venas"));
       TXTneurologico.setText(rs.getString("Neurologico"));
       TXTprostata.setText(rs.getString("Prostata"));
       TXTginecologo.setText(rs.getString("Ginecologo"));

       }
 
      }

             
      catch(Exception e){System.out.println("Error en fisicoc complejo "+e);}
             
           finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        }        
       

      }  
         
         
         
         
         
         
  
   public void mostrarElectro(){
        
             
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

             try{
    
 //    int fila = JTablePacientes.getSelectedRow();
       
       String query="SELECT * from save_electro where id_historia=?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
     //  System.out.println(idtablaHistorias);
       rs=ps.executeQuery();
   
       if (rs.next()){
       TxtDiagnosticoElectro.setText(rs.getString("Diagnostico"));
       String sinusal =  rs.getString("Sinusal");
       String Trazo =  rs.getString("Trazo_normal");
       TXTFrec.setText(rs.getString("DPM"));
       TXTpr.setText(rs.getString("PR"));
       
       TXTQrs.setText(rs.getString("QRS"));
       TXTAqrs.setText(rs.getString("AQRS"));
       TXTTxtQTm.setText(rs.getString("QTM"));
       TXTQTc.setText(rs.getString("QTC"));
       TXTSupraventricular.setText(rs.getString("Supraentricular"));
       TXTVentricular.setText(rs.getString("Ventricular"));
       TXTauriculo.setText(rs.getString("AuriculoVentricular"));
       TxtIntraventicular.setText(rs.getString("Intraventricular"));
       
       TXTCrecimiento.setText(rs.getString("CrecimientoCavidades"));
       TXTRepolarizacion.setText(rs.getString("Repolarizacion"));
       TXTzei.setText(rs.getString("Zei"));
       TXTtopografico.setText(rs.getString("Topografico"));
       
       TXTecg.setText(rs.getString("Egg_ref"));
       jTexttrombolitico.setText(rs.getString("Trombolitico"));
       jTextCriterios.setText(rs.getString("Reperfusion"));
       jTextManejo.setText(rs.getString("Complicaciones_trombolisis"));
       jTextIngreso.setText(rs.getString("Diagn_ingreso"));
       jTextTratatamiento.setText(rs.getString("Trat_ingreso"));
       TXTterapeutico.setText(rs.getString("Manejo_diag"));
       
       
       if(sinusal.equals("Sinusal")){
       jRadioSinusal.setSelected(true);
       ritmoelectro="Sinusal";
       }
       else if(sinusal.equals("No sinusal")){
       jNosinusal.setSelected(true);
       ritmoelectro="No Sinusal";
       }
       
       
       if(Trazo.equals("Normal")){
       JRadioTrazo.setSelected(true);
       trazo="Normal";
       }
       else if(Trazo.equals("Anormal")){
       jRadioTrazo2.setSelected(true);
       trazo="Anormal";
       }
     }

          }
catch(Exception e){System.out.println("Error en mostrar electro "+e);}
       

      }  
         
         
         
 
   
           
           
           
     public void mostrarRevision(){
 
     Connection con=null;
     EnlaceBd cn = new EnlaceBd();
     PreparedStatement ps=null;
     ResultSet rs=null;
     

       try{

       String query="SELECT * from table_revision where Id_historiaR =?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
       rs=ps.executeQuery();
   
       if (rs.next()){
       jTextRevision.setText(rs.getString("Informe_simatologia"));
      
       int menarquiaValue = rs.getInt("Menarquia");
       jSpinner2.setValue(menarquiaValue);
       
       jComboBox3.setSelectedItem(rs.getString("Mestruacion"));
       TxtCiclosMestru.setText(rs.getString("Ciclos_mestruacion"));
       
    

       
       int partosValue = rs.getInt("Partos");
       jSpartos.setValue(partosValue);
               
       int cesareasValue = rs.getInt("Cesareas");
       jScesareas.setValue(cesareasValue);
               
       int pesoAbortos = rs.getInt("Abortos");
       jSabortos.setValue(pesoAbortos);
                            
       int pesoEmbarazos = rs.getInt("Embarazos");
       jSembarazo.setValue(pesoEmbarazos);
       
       int pesoMenospausia = rs.getInt("Menospausia");
       jSmenospausia.setValue(pesoMenospausia);
       jTextArea10.setText(rs.getString("Informe_mestruacion"));
       jTextMotivoConsulta.setText(rs.getString("Motivo_Consulta")); 
       jComboHabitos.setSelectedItem(rs.getString("Tiempo_libre"));
       jTConsumoAlcohol.setText(rs.getString("Consumo_alcohol"));
       jTConsumoTabaco.setText(rs.getString("Consumo_tabaco"));
       jTConsumoDrugs.setText(rs.getString("Consumo_estupefacientes"));
       jActividadF.setSelectedItem(rs.getString("Actividad_fisica"));
       Fsemanal.setSelectedItem(rs.getString("Frecuencia_semanal"));
       jSueno.setSelectedItem(rs.getString("Sueno"));
       jSexualidad.setSelectedItem(rs.getString("Sexualidad"));
       

       }
       

          }
      catch(Exception e){System.out.println("Error en cargar datos a historia "+e);}
       
      finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        } 
       

      }     
           
           
     
     
           public void mostrarFactor(){
     
   
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          
             try{
    

       
       String query="SELECT * from save_factoriesgo where Id_Historia=?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
   
       rs=ps.executeQuery();
   
       if (rs.next()){
       TxtIsquemica.setText(rs.getString("Isquemica"));
       TxtPercutanea.setText(rs.getString("Percutanea"));
       TxtQuirurgica.setText(rs.getString("Quirurgica"));
       TxtEstrictural.setText(rs.getString("Estructural"));
       Txtdilatada.setText(rs.getString("Dilatada"));
       TxtRestrictiva.setText(rs.getString("Restrictiva"));
       TxtRitmo.setText(rs.getString("Ritmo"));
       TXTAV.setText(rs.getString("ConduccionA/V"));
       TXTIV.setText(rs.getString("Conduccion I/V"));
       TXTDEFINITIVOP.setText(rs.getString("MarcapasoDef"));
       TXTPERIFERICA.setText(rs.getString("Perifierica"));
       TxtCerebroVascular.setText(rs.getString("CerebroVascular"));
       Txtisquemica.setText(rs.getString("Isquemica2"));
       Txthemorragica.setText(rs.getString("Hemorragica"));
       
       
       if(!TxtIsquemica.getText().equals("")){
       JcheckIsquemica.setSelected(true);
       }
       if(!TxtPercutanea.getText().equals("")){
       jCheckPercutanea.setSelected(true);
       }
       if(!TxtQuirurgica.getText().equals("")){
       jCheckQuirurgica.setSelected(true);
       }
       if(!TxtEstrictural.getText().equals("")){
       JcheckEstructural.setSelected(true);
       }
       if(!Txtdilatada.getText().equals("")){
       jCheckDilatada.setSelected(true);
       }
       if(!TxtRestrictiva.getText().equals("")){
       jCheckRestrictiva.setSelected(true);
       }
       if(!TxtRitmo.getText().equals("")){
       jCheckRitmo.setSelected(true);
       }
       if(!TXTAV.getText().equals("")){
       jCheckAV.setSelected(true);
       }       
       if(!TXTIV.getText().equals("")){
       jCheckIV.setSelected(true);
       }
       if(!TXTDEFINITIVOP.getText().equals("")){
       jCheckDEFINITIVO.setSelected(true);
       }
       if(!TXTPERIFERICA.getText().equals("")){
       jCheckPERIFERICA.setSelected(true);
       }
       
       }
       
       
      }

             
      catch(Exception e){System.out.println("Error en fisicoc complejo "+e);}
             
           finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        }        
       

      }  
         
     
     
           
           
           
    public void mostrarLab(){
     
   
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          
             try{
    

       
       String query="SELECT * FROM `save_lab` WHERE id_historia=?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
     //  System.out.println(idtablaHistorias);
       rs=ps.executeQuery();
   
       if (rs.next()){
       labDate.setText(rs.getString("fecha_estudio"));
       TXThb.setText(rs.getString("HB"));
       TXThematocrito.setText(rs.getString("hematocrito"));
       TXTleucocitos.setText(rs.getString("leucocitos"));
       TXTneutrofilos.setText(rs.getString("neutrofilos"));
       TXTlinfocitos.setText(rs.getString("linfocitos"));
       TXTplaquetas.setText(rs.getString("plaquetas"));
       TXTpt.setText(rs.getString("PT"));
       TXTpttt.setText(rs.getString("PTT"));
       TXTglicemia.setText(rs.getString("glicemia"));
       TXTurea.setText(rs.getString("urea"));
       TXTcreatinina.setText(rs.getString("creatinina"));
       TXTtfg.setText(rs.getString("TFG"));
       TXTacurico.setText(rs.getString("ac_urico"));
       TXTcolesterol.setText(rs.getString("colesterol"));
       TXThdl.setText(rs.getString("HDL"));
       TXTldl.setText(rs.getString("LDL"));
       TXTtrigliceridos.setText(rs.getString("trgiliceridos"));
       TXTfibrinogeno.setText(rs.getString("fibrinogeno"));
       TXTna.setText(rs.getString("NA"));
       TXTk.setText(rs.getString("K"));
       TXTmg.setText(rs.getString("MG"));
       TXTtgp.setText(rs.getString("TGP"));
       TXTtgo.setText(rs.getString("TGO"));
       TXTalbumina.setText(rs.getString("ALBUMINA"));
       TXThiv.setText(rs.getString("HIV"));
       TXTvdrl.setText(rs.getString("VDRL"));
       
       TXTprot.setText(rs.getString("PROT"));
       TXTinr.setText(rs.getString("INR"));
       TXTbpn.setText(rs.getString("BPN"));
       TXTtroponina1.setText(rs.getString("trobonina1"));
       TXTtroponina2.setText(rs.getString("trobonina2"));
       TXTtroponina3.setText(rs.getString("trobonina3"));
       
       fecha1.setText(rs.getString("fecha1"));
       fecha2.setText(rs.getString("fecha2"));
       fecha3.setText(rs.getString("fecha3"));

       }
 
      }

      catch(Exception e){System.out.println("Error en fisicoc complejo "+e);}
             
           finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        }        
       

      }  
                  
    
    
    
    
    
       public void mostrarRayos(){
 
     Connection con=null;
     EnlaceBd cn = new EnlaceBd();
     PreparedStatement ps=null;
     ResultSet rs=null;
     

       try{

       String query="SELECT * from save_rayosx where id_historia =?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
       rs=ps.executeQuery();
   
       if (rs.next()){
           
           
           
       JtxtRayosx.setText(rs.getString("rayosX"));
       dateRayosx.setText(rs.getString("fecha_estudio"));
       TxtiAuriculazquierda.setText(rs.getString("auricula_izq")); 
       TXTauriculaderecha.setText(rs.getString("auricula_der"));
       TXTventriculoizquierdo.setText(rs.getString("ventriculo_izq"));
       TXTventriculoderecho.setText(rs.getString("ventriculo_der"));
       TXTcontractilidad.setText(rs.getString("contractilidad"));
       TXTeyeccion.setText(rs.getString("eyeccion"));
       TXTsistolica.setText(rs.getString("sistolica"));
       TXTpsap.setText(rs.getString("PSAP")); 
       TXTvalvulas.setText(rs.getString("valvulas"));
       TXTmitral.setText(rs.getString("mitral"));
       TXTaortica.setText(rs.getString("aortica"));
       TXTtricuspide.setText(rs.getString("tricuspide"));
       TXTpulmonar.setText(rs.getString("pulmonar"));
       TXTpericardio.setText(rs.getString("pericardio"));
       TXTotros.setText(rs.getString("otros"));


       }
       

          }
      catch(Exception e){System.out.println("Error en cargar datos a historia "+e);}
       
      finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        } 
       

      }     
         
           
           
           
           
          public void mostrarConclusion(){
 
     Connection con=null;
     EnlaceBd cn = new EnlaceBd();
     PreparedStatement ps=null;
     ResultSet rs=null;
          
          
      
       try{
    

       String query="SELECT * from table_conclusion where Id_conclusionh=?";
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setInt(1, idCallestudios);
       //System.out.println(idtablaHistorias);
       rs=ps.executeQuery();
   
       if (rs.next()){
       jConclusion.setSelectedItem(rs.getString("Resultado"));
       jTextConclusion.setText(rs.getString("Conclusion"));
       jTextRecomendacion.setText(rs.getString("Recomendacion"));


   
       }
       

       
       
          }
      catch(Exception e){System.out.println("Error en cargar datos a historia "+e);}
       
      finally {
      try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        }  
      }
       
           
           
           

       
    public void ActualizarHistoriaBd(){
    
   
        
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
       
        
          String sql="SELECT Id_Historia FROM examen_fgeneral WHERE Id_Historia='"+ idAsignar +"'";

            try{
                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                if(rs.next()) {
                    
                 //System.out.println("EXISTE");
                 updateHistory();
                JOptionPane.showMessageDialog(this, "HISTORIA CLINICA GUARDADA", "HISTORIA CLINICA",1);
                
                }
                else{
                insertHistory();
                updateHistory();
                JOptionPane.showMessageDialog(this, "HISTORIA CLINICA GUARDADA", "HISTORIA CLINICA",1);
                //System.out.println("NO EXISTE");
                }

            }catch(Exception e){System.out.println(e);}
            
               finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        } 
    }
           

    
     public void ActualizarHistoriaBdpdf(){
    
   
        
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
       
        
          String sql="SELECT Id_Historia FROM examen_fgeneral WHERE Id_Historia='"+ idAsignar +"'";

            try{
                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                
                if(rs.next()) {
                    
                 //System.out.println("EXISTE");
                 updateHistory();

                
                }
                else{
                insertHistory();
                updateHistory();
   
                //System.out.println("NO EXISTE");
                }

            }catch(Exception e){System.out.println(e);}
            
               finally {
            try {
              ps.close();
              rs.close();
              cn.desconectar();
            } catch (Exception ex) {
            }
        } 
    }
    
    
    
    
    
  
  public void insertarFisico(){
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
              
          try {
 
            String sql2 = "INSERT INTO examen_fgeneral (Id_Historia)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
         
           }

          
           try {
 
            String sql2 = "INSERT INTO examen_fisico (Id_Historia)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
            
            
            
        } catch (Exception e) {
            System.out.println("error en insertar fisico"+ e);
         
           }
           
                 finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }
  
  }
  
  
    
  
  
  
    public void insertarElectro(){
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
              
          try {
 
            String sql2 = "INSERT INTO save_electro (id_historia)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
         
           }
          
                finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

  }    
  
  
  
    public void insertarFactor(){
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
              
          try {
 
            String sql2 = "INSERT INTO save_factoriesgo (id_historia)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
         
           }
          
                finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

  }  
  
  
  
  public void insertarLab(){
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
              
          try {
 
            String sql2 = "INSERT INTO save_lab (id_historia)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
         
           }
          
                finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

  }  
  
    public void insertarResivion(){
  
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;     
          try {
            String sql2 = "INSERT INTO `table_revision`(`Id_historiaR`)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);

 
            ps.executeUpdate();
        
      
            
        } catch (Exception e) {
             System.out.println("ERROR EN REGISTRAR REVISION" + e);
         
           }
          
                       finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

  }
  
       public void insertarConclusion(){
  
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs;     
          try {
            String sql2 = "INSERT INTO table_conclusion (Id_conclusionh)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
        
          
            
        } catch (Exception e) {
             System.out.println("ERROR EN REGISTRAR CONCLUSION" + e);
         
           }
          
                       finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

  }
     
  
   public void insertarRayos(){
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs;
              
          try {
 
            String sql2 = "INSERT INTO save_rayosx (id_historia)  values(?) ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            ps.setInt(1, idAsignar);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
         
           }
          
                finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

  }  
  
  
  
  
  public void updateFisico(){
  
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs;
    
    
    
            try {
              
            String sql = "UPDATE examen_fisico SET Piel=?, Ojos=?, Oidos=?, Dientes=?, Boca=?, Cuello=?, Corazon=?, Abdomen=?, Columna=?, ExtrInferior=?, Linfaticos=?, Genitales=?, Ano=?, Oftamoscopia=?, Nariz=?, Torax=?, Mamas=?, Pulmones=?, Hernias=?, ExtSuperior=?, Arterias=?, Venas=?, Neurologico=?, Prostata=?, Ginecologo=? WHERE Id_Historia=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      

            ps.setString(1,  TXTpiel.getText());
            ps.setString(2,  TXTojos.getText());
            ps.setString(3,  TXToidos.getText());
            ps.setString(4,  TXTdientes.getText());
            ps.setString(5,  TXTboca.getText());
            ps.setString(6,  TXTcuello.getText());
            ps.setString(7,  TXTcorazon.getText());
            ps.setString(8,  TXTAbdomen2.getText());
            ps.setString(9, TXTcolumna.getText());
            ps.setString(10, TXTinferior.getText());
            ps.setString(11, TXTlinfaticos.getText());
            ps.setString(12, TXTgenitales.getText());
            ps.setString(13, TXTrectal.getText());
            ps.setString(14, TXToftamoscopia.getText());
            ps.setString(15, TXTnariz.getText());
            ps.setString(16, TXTtorax.getText());
            ps.setString(17, TXTmamas.getText());
            ps.setString(18, TXTpulmones.getText());
            ps.setString(19, TXThernias.getText());
            ps.setString(20, TXTsuperior.getText());
            ps.setString(21, TXTarterias.getText());
            ps.setString(22, TXTvenas.getText());
            ps.setString(23, TXTneurologico.getText());
            ps.setString(24, TXTprostata.getText());
            ps.setString(25, TXTginecologo.getText());
            ps.setInt(26, idAsignar);

            ps.executeUpdate();
  

            
 
        } catch (Exception e) {
      
            System.out.println("ERROR EN ACTUALIZAR EXAMEN FISICO");
            System.out.println(e);
           // JOptionPane.showMessageDialog(null, e);
        }
            
        finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }
           
    }
  
  }
  
           
   
     public void updateGeneral(){
     
     
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    

          try {
              
            String sql = "UPDATE examen_fgeneral SET Talla=?, Peso=?, Peso_ideal=?, Peso_Adic=?, IMC=?, Aspecto=?, Abdominal=?, Temperatura=?, Pulso=?, FR=?, Tipo_respiracion=?, Cadera=?, Tension=?, Motivo_Consulta=? WHERE Id_Historia=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
           
            ps.setString(1,  TXTtalla.getText());
            ps.setString(2,  TXTpeso.getText());
            ps.setString(3,  TXTpesoIdeal.getText());
            ps.setString(4,  TXTpesoAdic.getText());
            ps.setString(5,  TXTimc.getText());
            ps.setString(6,  TXTaspecto.getText());
            ps.setString(7,  TXTabdominal.getText());
            ps.setString(8,  TXTtemperatura.getText());
            ps.setString(9,  TXTpulso.getText());
            ps.setString(10, TXTfr.getText());
            ps.setString(11, TXTrespiracion.getText());
            ps.setString(12, TXTcadera.getText());
            ps.setString(13, TXTtension.getText());
            ps.setString(14, jTextMotivoConsulta.getText());
            ps.setInt(15, idAsignar);
    
            ps.executeUpdate();
  
 
        } catch (Exception e) {
            System.out.println("ERROR EN ACTUALIZAR EXAMEN FGENERAL");
            System.out.println(e);
          //  JOptionPane.showMessageDialog(null, e);
        }
     
      finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }       
    }
     
     }
           
         
     
     
       public void updateFactor(){
     
     
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    

          try {
              
String sql = "UPDATE `save_factoriesgo`\n" +
                     "SET\n" +
                     "  `Isquemica` = ?,\n" +
                     "  `Percutanea` = ?,\n" +
                     "  `Quirurgica` = ?,\n" +
                     "  `Estructural` = ?,\n" +
                     "  `Dilatada` = ?,\n" +
                     "  `Restrictiva` = ?,\n" +
                     "  `Ritmo` = ?,\n" +
                     "  `ConduccionA/V` = ?,\n" +
                     "  `Conduccion I/V` = ?,\n" +
                     "  `MarcapasoDef` = ?,\n" +
                     "  `Perifierica` = ?,\n" +
                     "  `CerebroVascular` = ?,\n" +
                     "  `Isquemica2` = ?,\n" +
                     "  `Hemorragica` = ?\n" +
                     "WHERE `id_historia` = ?;";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
           
            ps.setString(1,  TxtIsquemica.getText());
            ps.setString(2,  TxtPercutanea.getText());
            ps.setString(3,  TxtQuirurgica.getText());
            ps.setString(4,  TxtEstrictural.getText());
            ps.setString(5,  Txtdilatada.getText());
            ps.setString(6,  TxtRestrictiva.getText());
            ps.setString(7,  TxtRitmo.getText());
            ps.setString(8,  TXTAV.getText());
            ps.setString(9,  TXTIV.getText());
            ps.setString(10, TXTDEFINITIVOP.getText());
            ps.setString(11, TXTPERIFERICA.getText());
            ps.setString(12, TxtCerebroVascular.getText());
            ps.setString(13, Txtisquemica.getText());
            ps.setString(14, Txthemorragica.getText());
            ps.setInt(15, idAsignar);
    
            ps.executeUpdate();
  
 
        } catch (Exception e) {
            System.out.println("ERROR EN ACTUALIZAR FACTOR RIESGO");
            System.out.println(e);
          //  JOptionPane.showMessageDialog(null, e);
        }
     
      finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }       
    }
     
     }
   
     
       
     
     public void updateElectro(){
     
     
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    

          try {
              
            String sql = "UPDATE `save_electro`\n" +
"SET\n" +
"  `Diagnostico` = ?,\n" +
"  `Sinusal` = ?,\n" +
"  `Trazo_normal` = ?,\n" +
"  `DPM` = ?,\n" +
"  `PR` = ?,\n" +
"  `QRS` = ?,\n" +
"  `AQRS` = ?,\n" +
"  `QTM` = ?,\n" +
"  `QTC` = ?,\n" +
"  `Supraentricular` = ?,\n" +
"  `Ventricular` = ?,\n" +
"  `AuriculoVentricular` = ?,\n" +
"  `Intraventricular` = ?,\n" +
"  `CrecimientoCavidades` = ?,\n" +
"  `Repolarizacion` = ?,\n" +
"  `Zei` = ?,\n" +
"  `Topografico` = ?,\n" +
"  `Egg_ref` = ?,\n" +
"  `Trombolitico` = ?,\n" +
"  `Reperfusion` = ?,\n" +
"  `Complicaciones_trombolisis` = ?,\n" +
"  `Diagn_ingreso` = ?,\n" +
"  `Trat_ingreso` = ?,\n" +
"  `Manejo_diag` = ?\n" +
"WHERE\n" +
"  `id_historia` = ?;";
            
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
           
            ps.setString(1,  TxtDiagnosticoElectro.getText());
            ps.setString(2,  ritmoelectro);
            ps.setString(3,  trazo);
            ps.setString(4,  TXTFrec.getText());
            ps.setString(5,  TXTpr.getText());
            ps.setString(6,  TXTQrs.getText());
            ps.setString(7,  TXTAqrs.getText());
            ps.setString(8,  TXTTxtQTm.getText());
            ps.setString(9,  TXTQTc.getText());
            ps.setString(10, TXTSupraventricular.getText());
            ps.setString(11, TXTVentricular.getText());
            ps.setString(12, TXTauriculo.getText());
            
            ps.setString(13,  TxtIntraventicular.getText());
            ps.setString(14,  TXTCrecimiento.getText());
            ps.setString(15,  TXTRepolarizacion.getText());
            ps.setString(16,  TXTzei.getText());
            ps.setString(17, TXTtopografico.getText());
            ps.setString(18, TXTecg.getText());
    
            ps.setString(19,  jTexttrombolitico.getText());
            ps.setString(20,  jTextCriterios.getText());
            ps.setString(21,  jTextManejo.getText());
            ps.setString(22,  jTextIngreso.getText());
            ps.setString(23, jTextTratatamiento.getText());
            ps.setString(24, TXTterapeutico.getText());
            ps.setInt(25, idAsignar);
 
            
            ps.executeUpdate();
  
            ps.close();
        //  rs.close();
            cn.desconectar();
            
 
        } catch (Exception e) {
            System.out.println("ERROR EN ACTUALIZAR EXAMEN FGENERAL");
            System.out.println(e);
          //  JOptionPane.showMessageDialog(null, e);
        }
     
      finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }
           
    }
     
     }
     
     
     
     

       
  public void UpdateFGeneral(){                                             
    
      
   // SearchMaxIdConsulta();
      
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    

          try {
              
            String sql = "UPDATE examen_fgeneral SET Talla=?, Peso=?, Peso_ideal=?, Peso_Adic=?, IMC=?, Aspecto=?, Abdominal=?, Temperatura=?, Pulso=?, FR=?, Tipo_respiracion=?, Cadera=?, Tension=? WHERE Id_Historia=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
           
            ps.setString(1,  TXTtalla.getText());
            ps.setString(2,  TXTpeso.getText());
            ps.setString(3,  TXTpesoIdeal.getText());
            ps.setString(4,  TXTpesoAdic.getText());
            ps.setString(5,  TXTimc.getText());
            ps.setString(6,  TXTaspecto.getText());
            ps.setString(7,  TXTabdominal.getText());
            ps.setString(8,  TXTtemperatura.getText());
            ps.setString(9, TXTpulso.getText());
            ps.setString(10, TXTfr.getText());
            ps.setString(11, TXTrespiracion.getText());
            ps.setString(12, TXTcadera.getText());
            ps.setString(13, TXTtension.getText());
            ps.setInt(14, idAsignar);
 
            
            ps.executeUpdate();
  
            
            
 
        } catch (Exception e) {
            System.out.println("ERROR EN ACTUALIZAR EXAMEN FGENERAL");
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
          
          
          
          
          
            try {
              
            String sql = "UPDATE examen_fisico SET Piel=?, Ojos=?, Oidos=?, Dientes=?, Boca=?, Cuello=?, Corazon=?, Abdomen=?, Columna=?, ExtrInferior=?, Linfaticos=?, Genitales=?, Ano=?, Oftamoscopia=?, Nariz=?, Torax=?, Mamas=?, Pulmones=?, Hernias=?, ExtSuperior=?, Arterias=?, Venas=?, Neurologico=?, Prostata=?, Ginecologo=? WHERE Id_Historia=?";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      

            ps.setString(1,  TXTpiel.getText());
            ps.setString(2,  TXTojos.getText());
            ps.setString(3,  TXToidos.getText());
            ps.setString(4,  TXTdientes.getText());
            ps.setString(5,  TXTboca.getText());
            ps.setString(6,  TXTcuello.getText());
            ps.setString(7,  TXTcorazon.getText());
            ps.setString(8,  TXTAbdomen2.getText());
            ps.setString(9, TXTcolumna.getText());
            ps.setString(10, TXTinferior.getText());
            ps.setString(11, TXTlinfaticos.getText());
            ps.setString(12, TXTgenitales.getText());
            ps.setString(13, TXTrectal.getText());
            ps.setString(14, TXToftamoscopia.getText());
            ps.setString(15, TXTnariz.getText());
            ps.setString(16, TXTtorax.getText());
            ps.setString(17, TXTmamas.getText());
            ps.setString(18, TXTpulmones.getText());
            ps.setString(19, TXThernias.getText());
            ps.setString(20, TXTsuperior.getText());
            ps.setString(21, TXTarterias.getText());
            ps.setString(22, TXTvenas.getText());
            ps.setString(23, TXTneurologico.getText());
            ps.setString(24, TXTprostata.getText());
            ps.setString(25, TXTginecologo.getText());
            ps.setInt(26, idAsignar);

            
            
            ps.executeUpdate();
  
            
            
 
        } catch (Exception e) {
      
            System.out.println("ERROR EN ACTUALIZAR EXAMEN FISICO");
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }          
    } 
     
  
  
  
  
  
  
    
public void updateRevision() {
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;


    int Menarquia = (int) jSpinner2.getValue();
    int Partos = (int) jSpartos.getValue();
    int Cesareas = (int) jScesareas.getValue();
    int Abortos = (int) jSabortos.getValue();
    int Embarazo = (int) jSembarazo.getValue();
    int Menospausia = (int) jSmenospausia.getValue();

    try {
        String sql = "UPDATE `table_revision` SET  `Menarquia`=?, `Mestruacion`=?, `Ciclos_mestruacion`=?, `Partos`=?, `Cesareas`=?, `Abortos`=?, `Embarazos`=?, `Menospausia`=?, `Informe_mestruacion`=?, `Informe_simatologia`=?, `Motivo_Consulta`=?,`Tiempo_libre`=?, `Consumo_alcohol`=?, `Consumo_tabaco`=?, `Consumo_estupefacientes`=?, `Actividad_fisica`=?, `Frecuencia_semanal`=?, `Sueno`=?, `Sexualidad`=? WHERE `Id_historiaR`=?";
        con = cn.getConnection();
        ps = con.prepareStatement(sql);

        ps.setInt(1, Menarquia);
        ps.setString(2, jComboBox3.getSelectedItem().toString());
        ps.setString(3, TxtCiclosMestru.getText());
        ps.setInt(4, Partos);
        ps.setInt(5, Cesareas);
        ps.setInt(6, Abortos);
        ps.setInt(7, Embarazo);
        ps.setInt(8, Menospausia);
        ps.setString(9, jTextArea10.getText());
        ps.setString(10, jTextRevision.getText());
        ps.setString(11, jTextMotivoConsulta.getText());
        ps.setString(12, jComboHabitos.getSelectedItem().toString());
        ps.setString(13, jTConsumoAlcohol.getText());
        ps.setString(14, jTConsumoTabaco.getText());
        ps.setString(15, jTConsumoDrugs.getText());
        ps.setString(16, jActividadF.getSelectedItem().toString());
        ps.setString(17, Fsemanal.getSelectedItem().toString());
        ps.setString(18, jSueno.getSelectedItem().toString());
        ps.setString(19, jSexualidad.getSelectedItem().toString());
        ps.setInt(20, idAsignar);

        ps.executeUpdate();

        ps.close();
        cn.desconectar();
    } catch (Exception e) {
        System.out.println("ERROR EN ACTUALIZAR REVISION: " + e);
    }
}
  


  
 public void updatelab(){
  
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs;
    
    
    
            try {
              
            String sql = "UPDATE `save_lab`\n" +
"SET\n" +
"  `fecha_estudio` = ?,\n" +
"  `HB` = ?,\n" +
"  `hematocrito` = ?,\n" +
"  `leucocitos` = ?,\n" +
"  `neutrofilos` = ?,\n" +
"  `linfocitos` = ?,\n" +
"  `plaquetas` = ?,\n" +
"  `PT` = ?,\n" +
"  `PTT` = ?,\n" +
"  `glicemia` = ?,\n" +
"  `urea` = ?,\n" +
"  `creatinina` = ?,\n" +
"  `TFG` = ?,\n" +
"  `ac_urico` = ?,\n" +
"  `colesterol` = ?,\n" +
"  `HDL` = ?,\n" +
"  `LDL` = ?,\n" +
"  `trgiliceridos` = ?,\n" +
"  `fibrinogeno` = ?,\n" +
"  `NA` = ?,\n" +
"  `K` = ?,\n" +
"  `MG` = ?,\n" +
"  `TGP` = ?,\n" +
"  `TGO` = ?,\n" +
"  `ALBUMINA` = ?,\n" +
"  `HIV` = ?,\n" +
"  `VDRL` = ?,\n" +
"  `PROT` = ?,\n" +
"  `INR` = ?,\n" +
"  `BPN` = ?,\n" +
"  `trobonina1` = ?,\n" +
"  `trobonina2` = ?,\n" +
"  `trobonina3` = ?,\n" +
"  `fecha1` = ?,\n" +
"  `fecha2` = ?,\n" +
"  `fecha3` = ?\n" +
"WHERE `id_historia` = ?";
            
            
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      

            ps.setString(1,  labDate.getText());
            ps.setString(2,  TXThb.getText());
            ps.setString(3,  TXThematocrito.getText());
            ps.setString(4,  TXTleucocitos.getText());
            ps.setString(5,  TXTneutrofilos.getText());
            ps.setString(6,  TXTlinfocitos.getText());
            ps.setString(7,  TXTplaquetas.getText());
            ps.setString(8,  TXTpt.getText());
            ps.setString(9,  TXTpttt.getText());
            ps.setString(10, TXTglicemia.getText());
            ps.setString(11, TXTurea.getText());
            ps.setString(12, TXTcreatinina.getText());
            ps.setString(13, TXTtfg.getText());
            ps.setString(14, TXTacurico.getText());
            ps.setString(15, TXTcolesterol.getText());
            ps.setString(16, TXThdl.getText());
            ps.setString(17, TXTldl.getText());
            ps.setString(18, TXTtrigliceridos.getText());
            ps.setString(19, TXTfibrinogeno.getText());
            ps.setString(20, TXTna.getText());
            ps.setString(21, TXTk.getText());
            ps.setString(22, TXTmg.getText());
            ps.setString(23, TXTtgp.getText());
            ps.setString(24, TXTtgo.getText());
            ps.setString(25, TXTalbumina.getText());   
            ps.setString(26, TXThiv.getText());
            ps.setString(27, TXTvdrl.getText());
            ps.setString(28, TXTprot.getText());
            ps.setString(29, TXTinr.getText());
            ps.setString(30, TXTbpn.getText());
            ps.setString(31, TXTtroponina1.getText());
            ps.setString(32, TXTtroponina2.getText());
            ps.setString(33, TXTtroponina3.getText());
            ps.setString(34, fecha1.getText());
            ps.setString(35, fecha2.getText());
            ps.setString(36, fecha3.getText());
            
            ps.setInt(37, idAsignar);

            ps.executeUpdate();
  

            
 
        } catch (Exception e) {
      
            System.out.println("ERROR EN ACTUALIZAR LAB");
            System.out.println(e);
           // JOptionPane.showMessageDialog(null, e);
        }
            
        finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }
           
    }
  
  }
  






   
     public void updateRayos(){
     
     
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;
    

          try {
              
            String sql = "UPDATE `save_rayosx`\n" +
"SET\n" +
"  `rayosX` = ?,\n" +
"  `fecha_estudio` = ?,\n" +
"  `auricula_izq` = ?,\n" +
"  `auricula_der` = ?,\n" +
"  `ventriculo_izq` = ?,\n" +                    
"  `ventriculo_der` = ?,\n" +
"  `contractilidad` = ?,\n" +
"  `eyeccion` = ?,\n" +
"  `sistolica` = ?,\n" +
"  `PSAP` = ?,\n" +
"  `valvulas` = ?,\n" +
"  `mitral` = ?,\n" +
"  `aortica` = ?,\n" +
"  `tricuspide` = ?,\n" +
"  `pulmonar` = ?,\n" +
"  `pericardio` = ?,\n" +
"  `otros` = ?\n" +
"WHERE `id_historia` = ?;";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
           
            ps.setString(1,  JtxtRayosx.getText());
            ps.setString(2,  dateRayosx.getText());
            ps.setString(3,  TxtiAuriculazquierda.getText());
            ps.setString(4,  TXTauriculaderecha.getText());
            ps.setString(5,  TXTventriculoizquierdo.getText());
             ps.setString(6, TXTventriculoderecho.getText());
            ps.setString(7,  TXTcontractilidad.getText());
            ps.setString(8,  TXTeyeccion.getText());
            ps.setString(9,  TXTsistolica.getText());
            ps.setString(10,  TXTpsap.getText());
            ps.setString(11, TXTvalvulas.getText());
            ps.setString(12, TXTmitral.getText());
            ps.setString(13, TXTaortica.getText());
            ps.setString(14, TXTtricuspide.getText());
            ps.setString(15, TXTpulmonar.getText());
            ps.setString(16, TXTpericardio.getText());
            ps.setString(17, TXTotros.getText());
            ps.setInt(18, idAsignar);
    
            ps.executeUpdate();
  
 
        } catch (Exception e) {
            System.out.println("ERROR EN ACTUALIZAR EXAMEN FGENERAL");
            System.out.println(e);
          //  JOptionPane.showMessageDialog(null, e);
        }
     
      finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex); }       
    }
     
     }



    public void updateConclusion() {
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;



    try {
        String sql = "UPDATE `table_conclusion` SET  `Resultado`=?, `Conclusion`=?, `Recomendacion`=? WHERE `Id_conclusionh`=?";
        con = cn.getConnection();
        ps = con.prepareStatement(sql);



        ps.setString(1, jConclusion.getSelectedItem().toString());
        ps.setString(2, jTextConclusion.getText());
        ps.setString(3, jTextRecomendacion.getText());
        ps.setInt(4, idAsignar);

        ps.executeUpdate();

        ps.close();
        cn.desconectar();
    } catch (Exception e) {
        System.out.println("ERROR EN ACTUALIZAR CONCLUSION: " + e);
    }
    
                 finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }
}
  
        
        

     

       
     
    public void insertHistory(){
    
    insertarFisico();
    insertarElectro();
    insertarFactor();
    insertarLab();
    insertarRayos();
    insertarResivion();
    insertarConclusion();
 
    }
    
  
  
  
    
    public void updateHistory(){
    
    updateGeneral();
    updateFactor();
    updateFisico();
    updateElectro();
    updateRevision();
    updatelab();
    updateRayos();
    updateConclusion();
   // updatebdAntc1();
    //updatebdAntc2();
    
    }
    
           
           
           
    
    
    
    
     public void AgregarPaciente(){                                             
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs;
    

          try {

              
                    
        java.sql.Date fechaU;
        Date dateU = FechaNacimiento.getDate();
        long dU = dateU.getTime();
        fechaU = new java.sql.Date(dU);
        
        
         
        
        
            String correo=TXTPcorreo.getText();
            if(TXTPcorreo.getText().equals("")){
            correo="Cyberiabackup2024@gmail.com";  
                }
            
            
            
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
            ps.setString(5, correo);
            ps.setString(6, TXTPdireccion.getText());
            ps.setString(7, Sexo);
            ps.setDate(8, fechaU);
            ps.setInt(9, edad);
            ps.execute();
  
            
            
  JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO REGISTRADO","REGISTRO DE PACIENTES", 1);
        } catch (Exception e) {
      
            JOptionPane.showMessageDialog(null, e);
        }
          
                finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }
          
    } 
  
  
     
      
    public void AuditoriaAgregar(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(MP.FechaAdmin.getDate());
           
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
     
     
     
     
     
     
    int IdPaciente;


    
    
    public void Callpacient() {  
       
       
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs;
     
    String Cedula = TXTPcedula.getText();
        
        try{
   
       String query="SELECT Idpaciente from table_paciente where Cedula=? ";
       
       con = cn.getConnection();
       ps = con.prepareStatement(query);
       ps.setString(1, Cedula);
       rs=ps.executeQuery();
      
       if(TXTPcedula.getText().equals("V-") || TXTPcedula.getText().equals("") ){
       JOptionPane.showMessageDialog(null, "EL CAMPO CÉDULA NO PUEDE ESTAR VACIO Y DEBE LLEVAR V-", "CAMPO VACIO", 1);
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

      DesactivarCampos();
      limpiarTVisualizar();
      visualizar_PdfVOHistorias(jTableVisualizarC);
      BtnImprimirHistoria.setEnabled(true);
      
      
      
      AsignarHistoriaPaciente();
      SearchLastHistory();
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
        
        else{  BtnAgregar.setVisible(false); BtnSearch.setEnabled(true);
      }
        
       
    }                                        
         }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}
        
        
        
             finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }

       }
       
       
 
    
    
    
    
    
       
       
   public void AsignarHistoriaPaciente(){
    
   Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null;

   java.sql.Date fechaU;
   Date dateU = MP.FechaAdmin.getDate();
   long dU = dateU.getTime();
   fechaU = new java.sql.Date(dU);
        

   try {    
         
 
            String sql = "INSERT INTO table_historias (`Id_usuarioh`, `Id_pacienteh`, `Id_Hespecialidad`, `Fecha_Historia`, `Id_Estadoh`)  VALUES (?,?,?,?,?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
           
            ps.setInt(1,idusuario);
            ps.setInt(2, IdPaciente);
            ps.setInt(3, 6002);
            ps.setDate(4, fechaU);
            ps.setInt(5, 102);
          
            ps.execute();


        } catch (Exception e) {
      
           System.out.println("Error en agregar Asignacion historia"+ e);
        }

    }
    
       
         
         
         
         
         
       
        public void email2()
    {
    String remitente ="cyberiasystemjc@gmail.com";
    String clave= "tbasmzkiofgsqfha";
    String destino=TXTPcorreo.getText();
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
    
    
 //  String PdfNames=nombrepaciente+"_"+idtabla;
    
    Session session = Session.getDefaultInstance(props);
    MimeMessage mensaje = new MimeMessage(session);
    
    try{
    mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
    mensaje.setSubject("CONSULTA CARDIOLOGIA | UNIDAD CARDIOVASCULAR M&S");
  
    BodyPart parteTexto= new MimeBodyPart();
    parteTexto.setContent("Saludos cordiales, se adjunta el archivo pdf de la consulta cardiologica", "text/html");
    
     
     File file = new File("C://Cyberia//dist//correo.pdf");
     BodyPart parteArchivo= new MimeBodyPart();
     parteArchivo.setDataHandler(new DataHandler(new FileDataSource(file)) {});
     parteArchivo.setFileName("consulta.pdf");
   
    
    MimeMultipart todasLasPartes = new MimeMultipart();
    todasLasPartes.addBodyPart(parteTexto);
    todasLasPartes.addBodyPart(parteArchivo);
    mensaje.setContent(todasLasPartes);
    
     
    Transport transport = session.getTransport("smtp");
    transport.connect("smtp.gmail.com", remitente, clave);
    transport.sendMessage(mensaje, mensaje.getAllRecipients());
    transport.close();
    JOptionPane.showMessageDialog(null,"Correo Enviado a: "+ TXTPcorreo.getText());
    } 
    catch(Exception e)
    {System.out.println(e);
      JOptionPane.showMessageDialog(null,"ERROR AL ENVIAR EL CORREO", "ERROR EN CORREO", JOptionPane.ERROR_MESSAGE);}
    }

 
       
       

    public void insertbdAntc1()
    {
  Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null; 
     try {
         
         
       
         
         
            String sql = "INSERT INTO `table_antc1`(`Id_Hist`, `Antc1_Enfer`, `Antc1_Descrip`) VALUES (?,?,?)";
            for (int i = 0; i < jTableAF2.getRowCount(); i++) {

                con = cn.getConnection();
                ps = con.prepareStatement(sql);
                
                ps.setInt(1,  idAsignar);
                ps.setString(2, jTableAF2.getValueAt(i, 1).toString());
                ps.setString(3, jTableAF2.getValueAt(i, 2).toString());
   
                ps.execute();
  
  
            
            }

        } catch (Exception e) {
            System.out.println(e);
        }

              finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }
    
    }
    
        
        
        
          public void insertbdAntc2()
    {
  Connection con=null;
   EnlaceBd cn = new EnlaceBd ();
   PreparedStatement ps=null;
   ResultSet rs=null; 
     try {
         
       
             
         String sql = "INSERT INTO `table_antc2`(`Id_Hist`, `Antc1_Enfer`, `Antc1_Descrip`) VALUES (?,?,?)";
            for (int i = 0; i < jTableAntpersonal.getRowCount(); i++) {

                con = cn.getConnection();
                ps = con.prepareStatement(sql);
         
                
                
                ps.setInt(1,  idAsignar);
                ps.setString(2, jTableAntpersonal.getValueAt(i, 1).toString());
                ps.setString(3, jTableAntpersonal.getValueAt(i, 2).toString());
   
                ps.execute();
  
  
            
            }

        } catch (Exception e) {
            System.out.println(e);
        }

               finally {
            try {
                ps.close();
                cn.desconectar();
            } catch (Exception ex) { System.out.println(ex+"2"); }
           
    }
    
    }
        
        
        
          
 public void updatebdAntc1() {
    Connection con = null;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps = null;

    try {
        String sql = "UPDATE table_antc1 SET Antc1_Enfer=?, Antc1_Descrip=? WHERE Id_Hist=?";
        
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        
        for (int i = 0; i < jTableAF2.getRowCount(); i++) {
            ps.setString(1, jTableAF2.getValueAt(i, 1).toString());
            ps.setString(2, jTableAF2.getValueAt(i, 2).toString());
            ps.setInt(3, idAsignar);
            ps.executeUpdate();
            System.out.println(jTableAF2.getValueAt(i, 1).toString() + " "+jTableAF2.getValueAt(i, 2).toString());
        }

    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            cn.desconectar();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
          
    
    
    
    
    
  public void updatebdAntc2() {
    Connection con = null;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps = null;

    try {
        String sql = "UPDATE table_antc2 SET Antc1_Enfer=?, Antc1_Descrip=? WHERE Id_Hist=?";
        
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        
        for (int i = 0; i < jTableAntpersonal.getRowCount(); i++) {
            ps.setString(1, jTableAntpersonal.getValueAt(i, 1).toString());
            ps.setString(2, jTableAntpersonal.getValueAt(i, 2).toString());
            ps.setInt(3, idAsignar);
            ps.executeUpdate();
            System.out.println(jTableAntpersonal.getValueAt(i, 1).toString() + " "+jTableAntpersonal.getValueAt(i, 2).toString());
        }

    } catch (Exception e) {
        System.out.println(e);
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            cn.desconectar();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
          
          
          
        


  public void ShowAntc1(int idantc1) {

       
System.out.println(idantc1);
        List<JCAntecedentesFamiliares> lista = AntcDao.ShowAntc1(idantc1);
        modelo = (DefaultTableModel) jTableAF2.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getShowAntcid1();
            ob[1] = lista.get(i).getShowNameantc1();
            ob[2] = lista.get(i).getShowDescription1();
   
            modelo.addRow(ob);

        }
       jTableAF2.setModel(modelo);
       acomodarAntec1();
            

    }
    
   


 public void ShowAntc2(int idantc2) {
             
        List<JCAntecedentesFamiliares> lista = AntcDao.ShowAntc2(idantc2);
        modelo = (DefaultTableModel) jTableAntpersonal.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getShowAntcid2();
            ob[1] = lista.get(i).getShowNameantc2();
            ob[2] = lista.get(i).getShowDescription2();
   
            modelo.addRow(ob);

        }
       jTableAntpersonal.setModel(modelo);
       acomodarAntec2();

    }
        
 
      public  void limpiarShowAntc1() {
        DefaultTableModel tb = (DefaultTableModel) jTableAF2.getModel();
        int a = jTableAF2.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

 
        
        public  void limpiarShowAntc2() {
        DefaultTableModel tb = (DefaultTableModel) jTableAntpersonal.getModel();
        int a = jTableAntpersonal.getRowCount()-1;
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
    
                   

     
  
     
     
          public void acomodarAntec1()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)jTableAF2.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        jTableAF2.setRowHeight(20);
        
        jTableAF2.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAF2.getColumnModel().getColumn(0).setMinWidth(0);
        jTableAF2.getColumnModel().getColumn(0).setPreferredWidth(0);
        
       
        // jTableAF2.getColumnModel().getColumn(Tabla.findColumn("ID")).setPreferredWidth(5);
         jTableAF2.getColumnModel().getColumn(Tabla.findColumn("Enfermedad")).setPreferredWidth(100);
         jTableAF2.getColumnModel().getColumn(Tabla.findColumn("Descripción")).setPreferredWidth(250);



      
       // jTableAF2.getColumnModel().getColumn(Tabla.findColumn("ID")).setCellRenderer(Alinear);
        jTableAF2.getColumnModel().getColumn(Tabla.findColumn("Enfermedad")).setCellRenderer(Alinear);
        jTableAF2.getColumnModel().getColumn(Tabla.findColumn("Descripción")).setCellRenderer(Alinear);;
      

    }
     
     
          
          
    
     
          public void acomodarAntec2()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)jTableAntpersonal.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        jTableAntpersonal.setRowHeight(20);
        
  
        jTableAntpersonal.getColumnModel().getColumn(0).setMaxWidth(0);
        jTableAntpersonal.getColumnModel().getColumn(0).setMinWidth(0);
        jTableAntpersonal.getColumnModel().getColumn(0).setPreferredWidth(0);
       
         //jTableAF2.getColumnModel().getColumn(Tabla.findColumn("ID")).setPreferredWidth(5);
        jTableAntpersonal.getColumnModel().getColumn(Tabla.findColumn("Enfermedad")).setPreferredWidth(100);
        jTableAntpersonal.getColumnModel().getColumn(Tabla.findColumn("Descripción")).setPreferredWidth(250);



      
        //jTableAF2.getColumnModel().getColumn(Tabla.findColumn("ID")).setCellRenderer(Alinear);
      jTableAntpersonal.getColumnModel().getColumn(Tabla.findColumn("Enfermedad")).setCellRenderer(Alinear);
      jTableAntpersonal.getColumnModel().getColumn(Tabla.findColumn("Descripción")).setCellRenderer(Alinear);;
      

    }
      
      
      
      
      
     
     
     
         
      public void acomodarConsultasN()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)jTableVisualizarC.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        

       jTableVisualizarC.getColumnModel().getColumn(0).setMaxWidth(0);
       jTableVisualizarC.getColumnModel().getColumn(0).setMinWidth(0);
       jTableVisualizarC.getColumnModel().getColumn(0).setPreferredWidth(0);
        

       jTableVisualizarC.getColumnModel().getColumn(Tabla.findColumn("Doctor")).setPreferredWidth(100);
       jTableVisualizarC.getColumnModel().getColumn(Tabla.findColumn("Fecha")).setPreferredWidth(80);
       jTableVisualizarC.getColumnModel().getColumn(Tabla.findColumn("Estado")).setPreferredWidth(80);
     


        jTableVisualizarC.getColumnModel().getColumn(Tabla.findColumn("Doctor")).setCellRenderer(Alinear);
        jTableVisualizarC.getColumnModel().getColumn(Tabla.findColumn("Fecha")).setCellRenderer(Alinear);;
        jTableVisualizarC.getColumnModel().getColumn(Tabla.findColumn("Estado")).setCellRenderer(Alinear);

    }
     
     
 
     

      
     
 
     public void cleanHistorias(){
     
     
     jTextMotivoConsulta.setText("");
     limpiarTAntecedentesF3();
     limpiarTAntecedentesF2();
     JtextAntc1.setText("");
     jTextAntPersonales.setText("");
     jCheckConstitucional.setSelected(false);
     jCheckPielMucosa.setSelected(false);
     jCheckORL.setSelected(false);
     jCheckRespiratorio.setSelected(false);
     jCheckAngina.setSelected(false);
     jCheckBox9.setSelected(false);
     jCheckBox16.setSelected(false);
     jCheckBox20.setSelected(false);
     jCheckBox6.setSelected(false);
     jCheckBox10.setSelected(false);
     jCheckBox17.setSelected(false);
     jCheckBox7.setSelected(false);
     jCheckBox11.setSelected(false);
     jCheckBox15.setSelected(false);
     jCheckBox1.setSelected(false);
     jCheckBox12.setSelected(false);
     jCheckBox14.setSelected(false);
     jCheckBox27.setSelected(false);
     jCheckBox18.setSelected(false);
     jCheckBox19.setSelected(false);
     jCheckBox25.setSelected(false);
     jCheckBox22.setSelected(false);
     jCheckBox23.setSelected(false);
     jCheckBox24.setSelected(false);
     jCheckBox28.setSelected(false);
     jTextRevision.setText("");
     jTextArea10.setText("");
     jTConsumoTabaco.setText("");
     jTConsumoDrugs.setText("");
     TXTtalla.setText(String.valueOf(0));
     TXTpeso.setText(String.valueOf(0));
     TXTtemperatura.setText("");
     TXTpulso.setText("");
     TXTpesoIdeal.setText("");
     TXTpesoAdic.setText("");
     TXTimc.setText("");
     TXTfr.setText("");
     TXTrespiracion.setText("");
     TXTaspecto.setText("");
     TXTtension.setText("");
     TXTabdominal.setText("");
     TXTcadera.setText("");
     TXTpiel.setText("");
     TXTojos.setText("");
     TXToidos.setText("");
     TXTdientes.setText("");
     TXTboca.setText("");
     TXTcuello.setText("");
     TXTcorazon.setText("");
     TXTAbdomen2.setText("");
     TXTcolumna.setText("");
     TXTinferior.setText("");
     TXTlinfaticos.setText("");
     TXTgenitales.setText("");
     TXTrectal.setText("");
     TXToftamoscopia.setText("");
     TXTnariz.setText("");
     TXTtorax.setText("");
     TXTmamas.setText("");
     TXTpulmones.setText("");
     TXThernias.setText("");
     TXTsuperior.setText("");
     TXTarterias.setText("");
     TXTvenas.setText("");
     TXTneurologico.setText("");
     TXTprostata.setText("");
     TXTginecologo.setText("");

     TxtIsquemica.setText("");
     TxtPercutanea.setText("");
     TxtQuirurgica.setText("");
     TxtEstrictural.setText("");
     Txtdilatada.setText("");
     TxtRestrictiva.setText("");
     TxtRitmo.setText("");
     TXTAV.setText("");
     TXTIV.setText("");
     TXTDEFINITIVOP.setText("");
     TXTPERIFERICA.setText("");
     TxtCerebroVascular.setText("");
     Txtisquemica.setText("");
     Txthemorragica.setText("");
     
     JcheckIsquemica.setSelected(false);
     jCheckPercutanea.setSelected(false);
     jCheckQuirurgica.setSelected(false);
     JcheckEstructural.setSelected(false);
     jCheckDilatada.setSelected(false);
     jCheckRestrictiva.setSelected(false);
     jCheckRitmo.setSelected(false);
     jCheckAV.setSelected(false);
     jCheckIV.setSelected(false);
     jCheckDEFINITIVO.setSelected(false);
     jCheckPERIFERICA.setSelected(false);
     jTConsumoAlcohol.setText("");
     
     
     TxtDiagnosticoElectro.setText("");
     TXTFrec.setText("");
     TXTpr.setText("");
     TXTQrs.setText("");
     TXTAqrs.setText("");
     TXTTxtQTm.setText("");
     TXTQTc.setText("");
     TXTSupraventricular.setText("");
     TxtIntraventicular.setText("");
     TXTzei.setText("");
     TXTVentricular.setText("");
     TXTCrecimiento.setText("");
     TXTtopografico.setText("");
     TXTauriculo.setText("");
     TXTRepolarizacion.setText("");
     TXTecg.setText("");
  
     jTexttrombolitico.setText("");
     jTextCriterios.setText("");
     jTextManejo.setText("");
     jTextIngreso.setText("");
     jTextTratatamiento.setText("");
     TXTterapeutico.setText("");
     
     
     
     
     
     TXThb.setText("");
     TXThematocrito.setText("");
     TXTleucocitos.setText("");
     TXTneutrofilos.setText("");
     TXTlinfocitos.setText("");
     TXTplaquetas.setText("");
     TXTpt.setText("");
     TXTpttt.setText("");
     TXTglicemia.setText("");
     TXTurea.setText("");
     TXTcreatinina.setText("");
     TXTtfg.setText("");
     TXTacurico.setText("");
     TXTcolesterol.setText("");
     TXThdl.setText("");
     TXTldl.setText("");
     
     TXTtrigliceridos.setText("");
     TXTfibrinogeno.setText("");
     TXTna.setText("");
     TXTk.setText("");
     TXTmg.setText("");
     TXTtgp.setText("");
     TXTtgo.setText("");
     TXTalbumina.setText("");
     TXThiv.setText("");
     TXTvdrl.setText("");
     TXTprot.setText("");
     TXTinr.setText("");
     TXTbpn.setText("");
     labDate.setText("");
     TXTtroponina1.setText("");
     TXTtroponina2.setText("");
     TXTtroponina3.setText("");
     fecha1.setText("");
     fecha2.setText("");
     fecha3.setText("");
     
     
   
     TxtiAuriculazquierda.setText("");
     TXTauriculaderecha.setText("");
     TXTventriculoizquierdo.setText("");
     TXTventriculoderecho.setText("");
     TXTcontractilidad.setText("");
     TXTeyeccion.setText("");
     TXTsistolica.setText("");
     TXTpericardio.setText("");
     TXTpsap.setText("");
     TXTvalvulas.setText("");
     TXTmitral.setText("");
     TXTaortica.setText("");
     TXTtricuspide.setText("");
     TXTpulmonar.setText("");
    
     TXTotros.setText("");
   
     
     
     TxtIsquemica.setEnabled(false);
     TxtPercutanea.setEnabled(false);
     TxtQuirurgica.setEnabled(false);
     TxtEstrictural.setEnabled(false);
     Txtdilatada.setEnabled(false);
     TxtRestrictiva.setEnabled(false);
     TxtRitmo.setEnabled(false);
     TXTAV.setEnabled(false);
     TXTIV.setEnabled(false);
     TXTDEFINITIVOP.setEnabled(false);
     TXTPERIFERICA.setEnabled(false);
     
     

     
     
     jTextConclusion.setText("");
     jTextRecomendacion.setText("");
     jConclusion.setSelectedItem("Seleccionar");

     
     
     
     }
     
 
     
       public int idCallestudios=0;
       public String estadoEstudio="";
       private int labid;               
       private String labEstudio, labCedula;  
       
       public void setValorA(int labid2) {
        this.labid = labid2;
    }        
       
       public int getValorA() {
        return labid;
    } 

       
        public void setValorB(String labEstudio2) {
        this.labEstudio = labEstudio2;
    }               
      
         public String getValorB() {
        return labEstudio;
    }
         
         
        public void setValorC(String labCedula2) {
        this.labCedula = labCedula2;
    }        
         public String getValorC() {
        return labCedula;
    }

     
     
     private void checkPopup(MouseEvent evt, JTextArea textArea) {
    if (evt.isPopupTrigger() || (evt.getButton() == MouseEvent.BUTTON3)) {
        JPopupMenu menu = new JPopupMenu();

      
        ImageIcon iconCopy = new ImageIcon(getClass().getResource("/icons/copiar.png"));
        ImageIcon iconPaste = new ImageIcon(getClass().getResource("/icons/pegar.png"));

        JMenuItem itemCopy = new JMenuItem("Copiar", iconCopy);
        JMenuItem itemPaste = new JMenuItem("Pegar", iconPaste);
        
        itemCopy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        itemPaste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        menu.add(itemCopy);
        menu.add(itemPaste);

        menu.show(evt.getComponent(), evt.getX(), evt.getY());
    }
}
     
     
     
     
     
      int validarEadicional;
      public void AgregarExamenAdc(){
  
     if (!estadoEstudio.equals("Pendiente")) {
        validarEadicional = idAsignar;
    } else {
       validarEadicional = idtablaHistorias;
    }
    Connection con=null;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;

        try {
 
      String sql = "INSERT INTO `table_examenadic`(`id_historiadc`, `Nombre_adc`, `Descripcion_adc`) VALUES (?,?,?)";

      
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, validarEadicional);
            ps.setString(2, jTextExamenAdic.getText());
            ps.setString(3, jTextObservAdic.getText());
        int res = ps.executeUpdate();

        if (res >= 1) {
            // JOptionPane.showMessageDialog(null, "PROCEDIMIENTO COMPLETADO", "ACTUALIZACIÓN DE DATOS", 1);
           jTextObservAdic.setText("");
           jTextExamenAdic.setText("");
        } else {
            // JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR PROCEDIMIENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
            
            
            

            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR EL EXAMEN", "EXAMENES", JOptionPane.ERROR_MESSAGE);
           }
        
              finally {

        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexiones: " + e);
        }
    }
        
        

  }
      
      
       public void modificarEadc(){
    Connection con=null;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;

        try {
          
           
 
            String sql = "update table_examenadic set   Nombre_adc=?, Descripcion_adc=? where  id_adcional=?";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, jTextExamenAdic.getText());
            ps.setString(2, jTextObservAdic.getText());
            ps.setInt(3, idEadc);
            int res = ps.executeUpdate();

            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "EXAMEN ACTUALIZADO", "ACTUALIZACIÓN DE DATOS", 1);
            
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EXAMEN", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
           // JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EL PROCEDIMIENTO", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
           }
        
              finally {

        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexiones: " + e);
        }
    }
        
                 
 
 
 }
      
      
  
    
    
       public void ShowExamAdic(int idadc) {

       

        List<JCAntecedentesFamiliares> lista = AntcDao.showEAdc(idadc);
        modelo = (DefaultTableModel) jTableAdic.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getShowEadc();
            ob[1] = lista.get(i).getShowNameAdc();
            ob[2] = lista.get(i).getShowDescriptionAdc();
   
            modelo.addRow(ob);

        }
       jTableAdic.setModel(modelo);
       jTableAdic.setDefaultEditor(Object.class, null);
       acomodarEadd();
            

    }
     
     
     
     
        public  void limpiarTEAdd() {
        DefaultTableModel tb = (DefaultTableModel) jTableAdic.getModel();
        int a = jTableAdic.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }
    
          public  void limpiarEAdc() {
        DefaultTableModel tb = (DefaultTableModel)  jTableAdic.getModel();
        int a =  jTableAdic.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }
         
      public void acomodarEadd()
    {
     
       DefaultTableModel Tabla = (DefaultTableModel)jTableAdic.getModel();
       DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
       Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        
       
       jTableAdic.getColumnModel().getColumn(0).setMaxWidth(0);
       jTableAdic.getColumnModel().getColumn(0).setMinWidth(0);
       jTableAdic.getColumnModel().getColumn(0).setPreferredWidth(0);
       
   
       jTableAdic.getColumnModel().getColumn(Tabla.findColumn("Examen")).setPreferredWidth(150);
       jTableAdic.getColumnModel().getColumn(Tabla.findColumn("Descripción")).setPreferredWidth(300);

   
       jTableAdic.getColumnModel().getColumn(Tabla.findColumn("Examen")).setCellRenderer(Alinear);;
       jTableAdic.getColumnModel().getColumn(Tabla.findColumn("Descripción")).setCellRenderer(Alinear);
    
    }
     
      
      
        
  public void EliminarEadc(){
  
  
    Connection con=null;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps=null;
    ResultSet rs=null;

        try {
 
            String sql = "DELETE FROM table_examenadic WHERE id_adcional = ? ";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEadc);
            int res = ps.executeUpdate();

            if (res >= 1) {
           JOptionPane.showMessageDialog(null, "EXAMEN RETIRADO", "EXAMEN", 1);
             
            } else {
               // JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR PROCEDIMIENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
           
            
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR EL EXAMEN", "EXAMEN", JOptionPane.ERROR_MESSAGE);
           }
        
        
      finally {

        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexiones: " + e);
        }
    }
  }   
      
      
      
      
      
   JCambiarState setState = new JCambiarState();
   Mprincipal MP = new Mprincipal();
   DefaultTableModel modelo = new DefaultTableModel();   
   String ruta_archivo = "";
   Mprincipal Menu = new Mprincipal();
   Encriptar encriptar = new Encriptar();
   Temporal TP = new Temporal();
   int idusuario=TP.getTexto();
   String especialidad=TP.getEspecialidad();
   int idespecialidad=TP.getIdEspecialidad();
   String nombredoctor=TP.getNombre();
   Validar va = new Validar();
  JCAntecedentesFamiliaresDao AntcDao = new JCAntecedentesFamiliaresDao ();
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAexamen;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardar1;
    private javax.swing.JButton BtnImprimirHistoria;
    private javax.swing.JButton BtnImprimirHistoria2;
    private javax.swing.JButton BtnMexamen;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JPanel Electro;
    private javax.swing.JPanel FactorRiesgo;
    private javax.swing.JLabel FechaAc4;
    private javax.swing.JLabel FechaAc5;
    private com.toedter.calendar.JDateChooser FechaAsignar1;
    private com.toedter.calendar.JDateChooser FechaAsignar2;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JComboBox<String> Fsemanal;
    private javax.swing.JPanel JPanelAnteriores;
    private javax.swing.JPanel JPanelHistoria;
    private javax.swing.JPanel JPregistro;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JRadioButton JRadioTrazo;
    private javax.swing.JRadioButton JRfemenino;
    private javax.swing.JTabbedPane JTabbedPacientes;
    private javax.swing.JCheckBox JcheckEstructural;
    private javax.swing.JCheckBox JcheckIsquemica;
    private javax.swing.JTextArea JtextAntc1;
    private javax.swing.JTextArea JtxtRayosx;
    private javax.swing.JPanel Laboratorio;
    private javax.swing.JPopupMenu PopupHistorias;
    private javax.swing.JPanel Rayosx;
    private javax.swing.JTextField TXTAV;
    private javax.swing.JTextField TXTAbdomen2;
    private javax.swing.JTextField TXTAqrs;
    private javax.swing.JTextField TXTCrecimiento;
    private javax.swing.JTextField TXTDEFINITIVOP;
    private javax.swing.JTextField TXTFrec;
    private javax.swing.JTextField TXTIV;
    private javax.swing.JTextField TXTPERIFERICA;
    private javax.swing.JTextField TXTPapellido;
    public javax.swing.JTextField TXTPcedula;
    private javax.swing.JTextField TXTPcorreo;
    private javax.swing.JTextArea TXTPdireccion;
    private javax.swing.JTextField TXTPnombre;
    private javax.swing.JFormattedTextField TXTPtelefono;
    private javax.swing.JTextField TXTQTc;
    private javax.swing.JTextField TXTQrs;
    private javax.swing.JTextField TXTRepolarizacion;
    private javax.swing.JTextField TXTSupraventricular;
    private javax.swing.JTextField TXTTxtQTm;
    private javax.swing.JTextField TXTVentricular;
    private javax.swing.JTextField TXTabdominal;
    private javax.swing.JTextField TXTacurico;
    private javax.swing.JTextField TXTalbumina;
    private javax.swing.JTextField TXTaortica;
    private javax.swing.JTextField TXTarterias;
    private javax.swing.JTextField TXTaspecto;
    private javax.swing.JTextField TXTauriculaderecha;
    private javax.swing.JTextField TXTauriculo;
    private javax.swing.JTextField TXTboca;
    private javax.swing.JTextField TXTbpn;
    private javax.swing.JTextField TXTcadera;
    private javax.swing.JTextField TXTcolesterol;
    private javax.swing.JTextField TXTcolumna;
    private javax.swing.JTextField TXTcontractilidad;
    private javax.swing.JTextField TXTcorazon;
    private javax.swing.JTextField TXTcreatinina;
    private javax.swing.JTextField TXTcuello;
    private javax.swing.JTextField TXTdientes;
    private javax.swing.JTextField TXTecg;
    private javax.swing.JTextField TXTeyeccion;
    private javax.swing.JTextField TXTfibrinogeno;
    private javax.swing.JTextField TXTfr;
    private javax.swing.JTextField TXTgenitales;
    private javax.swing.JTextField TXTginecologo;
    private javax.swing.JTextField TXTglicemia;
    private javax.swing.JTextField TXThb;
    private javax.swing.JTextField TXThdl;
    private javax.swing.JTextField TXThematocrito;
    private javax.swing.JTextField TXThernias;
    private javax.swing.JTextField TXThiv;
    private javax.swing.JTextField TXTimc;
    private javax.swing.JTextField TXTinferior;
    private javax.swing.JTextField TXTinr;
    private javax.swing.JTextField TXTk;
    private javax.swing.JTextField TXTldl;
    private javax.swing.JTextField TXTleucocitos;
    private javax.swing.JTextField TXTlinfaticos;
    private javax.swing.JTextField TXTlinfocitos;
    private javax.swing.JTextField TXTmamas;
    private javax.swing.JTextField TXTmg;
    private javax.swing.JTextField TXTmitral;
    private javax.swing.JTextField TXTna;
    private javax.swing.JTextField TXTnariz;
    private javax.swing.JTextField TXTneurologico;
    private javax.swing.JTextField TXTneutrofilos;
    private javax.swing.JTextField TXToftamoscopia;
    private javax.swing.JTextField TXToidos;
    private javax.swing.JTextField TXTojos;
    private javax.swing.JTextField TXTotros;
    private javax.swing.JTextField TXTpericardio;
    private javax.swing.JTextField TXTpeso;
    private javax.swing.JTextField TXTpesoAdic;
    private javax.swing.JTextField TXTpesoIdeal;
    private javax.swing.JTextField TXTpiel;
    private javax.swing.JTextField TXTplaquetas;
    private javax.swing.JTextField TXTpr;
    private javax.swing.JTextField TXTprostata;
    private javax.swing.JTextField TXTprot;
    private javax.swing.JTextField TXTpsap;
    private javax.swing.JTextField TXTpt;
    private javax.swing.JTextField TXTpttt;
    private javax.swing.JTextField TXTpulmonar;
    private javax.swing.JTextField TXTpulmones;
    private javax.swing.JTextField TXTpulso;
    private javax.swing.JTextField TXTrectal;
    private javax.swing.JTextField TXTrespiracion;
    private javax.swing.JTextField TXTsistolica;
    private javax.swing.JTextField TXTsuperior;
    private javax.swing.JTextField TXTtalla;
    private javax.swing.JTextField TXTtemperatura;
    private javax.swing.JTextField TXTtension;
    private javax.swing.JTextArea TXTterapeutico;
    private javax.swing.JTextField TXTtfg;
    private javax.swing.JTextField TXTtgo;
    private javax.swing.JTextField TXTtgp;
    private javax.swing.JTextField TXTtopografico;
    private javax.swing.JTextField TXTtorax;
    private javax.swing.JTextField TXTtricuspide;
    private javax.swing.JTextField TXTtrigliceridos;
    private javax.swing.JTextField TXTtroponina1;
    private javax.swing.JTextField TXTtroponina2;
    private javax.swing.JTextField TXTtroponina3;
    private javax.swing.JTextField TXTurea;
    private javax.swing.JTextField TXTvalvulas;
    private javax.swing.JTextField TXTvdrl;
    private javax.swing.JTextField TXTvenas;
    private javax.swing.JTextField TXTventriculoderecho;
    private javax.swing.JTextField TXTventriculoizquierdo;
    private javax.swing.JTextField TXTzei;
    private javax.swing.JTextField TxtBusAntcP;
    private javax.swing.JTextField TxtCerebroVascular;
    private javax.swing.JTextField TxtCiclosMestru;
    private javax.swing.JTextArea TxtDiagnosticoElectro;
    private javax.swing.JTextField TxtEstrictural;
    private javax.swing.JTextField TxtIntraventicular;
    private javax.swing.JTextField TxtIsquemica;
    private javax.swing.JTextField TxtPercutanea;
    private javax.swing.JTextField TxtQuirurgica;
    private javax.swing.JTextField TxtRestrictiva;
    private javax.swing.JTextField TxtRitmo;
    private javax.swing.JTextField TxtbusquedaAntc;
    private javax.swing.JTextField Txtdilatada;
    private javax.swing.JTextField Txthemorragica;
    private javax.swing.JTextField TxtiAuriculazquierda;
    private javax.swing.JTextField Txtisquemica;
    private javax.swing.JFormattedTextField dateRayosx;
    private javax.swing.JFormattedTextField fecha1;
    private javax.swing.JFormattedTextField fecha2;
    private javax.swing.JFormattedTextField fecha3;
    private javax.swing.JButton jAButton30;
    private javax.swing.JComboBox<String> jActividadF;
    private javax.swing.JButton jAdcDelete;
    private javax.swing.JButton jAdcModif;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JCheckBox jCheckAV;
    private javax.swing.JCheckBox jCheckAngina;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckConstitucional;
    private javax.swing.JCheckBox jCheckDEFINITIVO;
    private javax.swing.JCheckBox jCheckDilatada;
    private javax.swing.JCheckBox jCheckIV;
    private javax.swing.JCheckBox jCheckORL;
    private javax.swing.JCheckBox jCheckPERIFERICA;
    private javax.swing.JCheckBox jCheckPercutanea;
    private javax.swing.JCheckBox jCheckPielMucosa;
    private javax.swing.JCheckBox jCheckQuirurgica;
    private javax.swing.JCheckBox jCheckRespiratorio;
    private javax.swing.JCheckBox jCheckRestrictiva;
    private javax.swing.JCheckBox jCheckRitmo;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboHabitos;
    private javax.swing.JComboBox<String> jConclusion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jNosinusal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioAF;
    private javax.swing.JRadioButton jRadioAPP;
    private javax.swing.JRadioButton jRadioSinusal;
    private javax.swing.JRadioButton jRadioTrazo2;
    private javax.swing.JSpinner jSabortos;
    private javax.swing.JSpinner jScesareas;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSembarazo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jSexualidad;
    private javax.swing.JSpinner jSmenospausia;
    private javax.swing.JSpinner jSpartos;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JComboBox<String> jSueno;
    private javax.swing.JTextArea jTConsumoAlcohol;
    private javax.swing.JTextArea jTConsumoDrugs;
    private javax.swing.JTextArea jTConsumoTabaco;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableAF2;
    private javax.swing.JTable jTableAdic;
    private javax.swing.JTable jTableAntcPers;
    private javax.swing.JTable jTableAntecedentesF;
    private javax.swing.JTable jTableAntpersonal;
    private javax.swing.JTable jTableVisualizarC;
    private javax.swing.JTextArea jTextAntPersonales;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextConclusion;
    private javax.swing.JTextArea jTextCriterios;
    private javax.swing.JTextField jTextExamenAdic;
    private javax.swing.JTextArea jTextIngreso;
    private javax.swing.JTextArea jTextManejo;
    private javax.swing.JTextArea jTextMotivoConsulta;
    private javax.swing.JTextArea jTextObservAdic;
    private javax.swing.JTextArea jTextRecomendacion;
    private javax.swing.JTextArea jTextRevision;
    private javax.swing.JTextArea jTextTratatamiento;
    private javax.swing.JTextArea jTexttrombolitico;
    private javax.swing.JMenuItem jcorreo;
    private javax.swing.JFormattedTextField labDate;
    private javax.swing.JTabbedPane tabbedAntecedentes;
    // End of variables declaration//GEN-END:variables
}
