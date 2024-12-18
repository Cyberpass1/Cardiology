/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos.JLabexamenes;

import Clases.Encriptar;
import Clases.JCPacientes;
import Clases.JPacientesDao;
import Menu.Mprincipal;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FCGinebraI
 */
public class Plantilla extends javax.swing.JInternalFrame {

    /**
     * Creates new form JERutina
     */
    public Plantilla() {
        initComponents();
         ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Colesterol = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PERFIL DE RUTINA"));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Colesterol Baja Densidad (LDL)"));
        jPanel25.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 110, 40));

        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Glucosa"));
        jPanel25.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 40));

        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Triglicéridos"));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel25.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 40));

        Colesterol.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Colesterol Alta Densidad (HDL)"));
        jPanel25.add(Colesterol, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 110, 40));

        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fosfasa Alcalina"));
        jPanel25.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, 40));

        jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "S.G.P.T"));
        jPanel25.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 90, 40));

        jTextField10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "S.G.O.T"));
        jPanel25.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 90, 40));

        jTextField11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nitrógeno Ureico"));
        jPanel25.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 110, 40));

        jTextField12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Creatinina"));
        jPanel25.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 40));

        jTextField15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Serología de Sífilis (R.P.R)"));
        jPanel25.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, 40));

        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Potasio"));
        jPanel25.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 40));

        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ácido Úrico"));
        jPanel25.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, 40));

        jTextField19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Hemograma"));
        jPanel25.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 40));

        jPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 560, 260));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Color"));
        jPanel26.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 40));

        jTextField21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Densidad"));
        jPanel26.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 40));

        jTextField13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PH"));
        jPanel26.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, 40));

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aspecto"));
        jPanel26.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 40));
        jPanel26.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1010, 10));

        jLabel1.setText("EXAMEN DE HECES");
        jPanel26.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setText("Glucosa");
        jPanel26.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        jTextField22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Color"));
        jPanel26.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 90, 40));

        jTextField23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Densidad"));
        jPanel26.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 90, 40));

        jTextField14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PH"));
        jPanel26.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 90, 40));

        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Aspecto"));
        jPanel26.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 90, 40));

        jTextField24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Densidad"));
        jPanel26.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 90, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, 30));

        jLabel3.setText("EXAMEN DE ORINA");
        jPanel26.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setText("Glucosa");
        jPanel26.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, 30));

        jLabel5.setText("Glucosa");
        jPanel26.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel26.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, 30));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, 30));

        jLabel6.setText("Glucosa");
        jPanel26.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        jLabel7.setText("Glucosa");
        jPanel26.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, 30));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGATIVO", "POSITIVO" }));
        jComboBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel26.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, 30));

        jLabel8.setText("Glucosa");
        jPanel26.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, -1));

        jLabel9.setText("Glucosa");
        jPanel26.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, -1));

        jLabel10.setText("Glucosa");
        jPanel26.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        jButton34.setBackground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Imprimir");
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton34.setContentAreaFilled(false);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 150, 30));

        jButton20.setText("Cancelar");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setContentAreaFilled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 150, 30));

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel26.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 10, 140));

        jPanel9.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1010, 270));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "CEDULA", "EDAD", "SEXO", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 260));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
      pdf();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    
    
        public void pdf() {
      try {
       
          
          
          
          
           BaseFont BF = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);    
           Font Letra = new Font(BF); 
           Paragraph saltolinea = new Paragraph();
          
          
          
          
          
          
          

        
            FileOutputStream archivo;
            //String rut = System.getProperty("user.home");
            File file = new File("C://Fundaginebra//Reportes//PerfilRutina-.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter writer=  PdfWriter.getInstance(doc, archivo);
            doc.open();
           
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("F:\\SoftwareJC\\src\\Logos\\Fundacionlogo1.png");
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
            fecha.add(Chunk.NEWLINE);
            SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String Fecha = FormatoFecha.format(MP.FechaAdmin.getDate());
            String Hora = MP.Time.getText()+" "+MP.jLabel102.getText();
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
            CB.endText();

            CB.setFontAndSize(BF2, 12);
            CB.setTextMatrix(200, 800);
            CB.showText("FUNDACIÓN CONVENIO DE GINEBRA I");
            CB.setFontAndSize(BF, 10);
            CB.setTextMatrix(260, 790);
            CB.showText("- RIF J-31191807-8 -");
            
            
            CB.setFontAndSize(BF2, 10);
            CB.setTextMatrix(460, 780);
            CB.showText("FECHA: "+ Fecha);
            
            CB.setFontAndSize(BF2, 10);
            CB.setTextMatrix(460, 770);
            CB.showText("HORA: "+ Hora);
            
            CB.setFontAndSize(BF2, 8);
            CB.setTextMatrix(250, 740);
            CB.showText("N° 9, Calle Mariño Sur, Maracay 2103, Aragua");
          
            CB.setFontAndSize(BF2, 8);
            CB.setTextMatrix(180, 730);
            CB.showText("Teléfonos: 0426-2407263 | 0243-2468726 | Correo: info@fundaginebra.com "); 
            CB.setTextMatrix(170, 725);
            CB.showText("_____________________________________________________________________");
        
            
      
       
            PdfPTable Tabla = new PdfPTable(3); 
            Tabla.setWidthPercentage(100);  
            float[] medidaCeldas = {1f, 3f, 1f };
            Tabla.setWidths(medidaCeldas);
            Tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            Tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            
            Paragraph tcolumna1 = new Paragraph("N° DE ORDEN" );
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

            Paragraph tcolumna3 = new Paragraph("N° DE PACIENTE");
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
        
        
            
            
        
            Tabla0.addCell("Juan Calderón") ;  
            Tabla0.addCell("V-27434836"); 
            Tabla0.addCell("18"+" años"); 
            Tabla0.addCell("Masculino");

        
            
            
            
            
            
            
            
            
 
            saltolinea.add("\n");
            doc.add(saltolinea); 
            doc.add(Tabla);
        
            doc.add(Tabla0);
            doc.add(saltolinea);
           

         
        addFooter(writer);
            
            
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "NO SE CONSIGUE LA CARPETA FUNDAGINEBRA EN DISCO C", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
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
        footer.addCell(new Phrase(String.format("Fundación Convenio de Ginebra I                        |    Redes Sociales: @Fundagienbra    |                                            "+ writer.getPageNumber()+ " | Pág") , new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL, BaseColor.BLACK)));

        // write page
        PdfContentByte canvas = writer.getDirectContent();
        canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
        footer.writeSelectedRows(0, -1, 34, 50, canvas);
        canvas.endMarkedContentSequence();
    } catch(DocumentException de) {
        throw new ExceptionConverter(de);
   
    }
}
    
    
    
     Mprincipal MP = new Mprincipal();
          
      
  DefaultTableModel modelo = new DefaultTableModel();
  Mprincipal Menu = new Mprincipal();
  Encriptar encriptar = new Encriptar();
  JCPacientes pacientes  = new JCPacientes();
  JPacientesDao pacientesDao  = new JPacientesDao();
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Colesterol;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton34;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
