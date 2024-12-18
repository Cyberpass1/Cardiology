/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.JCPacientes;
import Clases.JPacientesDao;
import Clases.Temporal;
import Clases.Validar;
import Menu.Mprincipal;
import java.awt.event.KeyEvent;
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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FCGinebraI
 */
public class JPacientes extends javax.swing.JInternalFrame {

  
    
    int idPaciente;
    
    
    
    
    public JPacientes() {
        
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        Calendar Fecha = new GregorianCalendar();
        FechaAdmin.setCalendar(Fecha);
        limpiarTabla();
        listarPacientes();
        FechaAdmin.setVisible(false);
        this.JRMasculino.setSelected(true);
        acomodarceldas();
    }


    Validar va = new Validar();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        FechaAdmin = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        FechaAc2 = new javax.swing.JLabel();
        TXTPnombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTPdireccion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TXTPtelefono = new javax.swing.JFormattedTextField();
        jLabel111 = new javax.swing.JLabel();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        JRMasculino = new javax.swing.JRadioButton();
        JRfemenino = new javax.swing.JRadioButton();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        TXTPcedula = new javax.swing.JTextField();
        TXTPcorreo = new javax.swing.JTextField();
        TXTPapellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePaciente = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        TXTBcedula = new javax.swing.JTextField();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        FechaAdmin.setToolTipText("");
        FechaAdmin.setEnabled(false);
        FechaAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(FechaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1300, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAc2.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        FechaAc2.setText("M Ó D U L O      P A C I E N T E S");
        jPanel2.add(FechaAc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 260, -1));

        TXTPnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre")));
        TXTPnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPnombreKeyTyped(evt);
            }
        });
        jPanel2.add(TXTPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 50));

        TXTPdireccion.setColumns(20);
        TXTPdireccion.setRows(5);
        TXTPdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dirección"));
        TXTPdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPdireccionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TXTPdireccion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 420, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 30));

        TXTPtelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefono"));
        try {
            TXTPtelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(TXTPtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 50));

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel111.setText("Fecha de nacimiento");
        jPanel2.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 60));

        FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        FechaNacimiento.setToolTipText("");
        FechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 260, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sexo"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JRMasculino.setBackground(new java.awt.Color(255, 255, 255));
        JRMasculino.setText("Masculino");
        JRMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRMasculinoActionPerformed(evt);
            }
        });
        jPanel5.add(JRMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        JRfemenino.setBackground(new java.awt.Color(255, 255, 255));
        JRfemenino.setText("Femenino");
        JRfemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRfemeninoActionPerformed(evt);
            }
        });
        jPanel5.add(JRfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 200, 50));

        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnAgregar.setContentAreaFilled(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 100, 30));

        BtnModificar.setText("Modificar");
        BtnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnModificar.setContentAreaFilled(false);
        BtnModificar.setEnabled(false);
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 100, 30));

        BtnLimpiar.setText("Nuevo");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLimpiar.setContentAreaFilled(false);
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 100, 30));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, -1, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 500, 20));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 10, 70));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 10, 70));

        TXTPcedula.setText("V-");
        TXTPcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Cédula"));
        TXTPcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPcedulaKeyTyped(evt);
            }
        });
        jPanel2.add(TXTPcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, 50));

        TXTPcorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Correo"));
        TXTPcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPcorreoKeyTyped(evt);
            }
        });
        jPanel2.add(TXTPcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 50));

        TXTPapellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nombre"), "Apellido"));
        TXTPapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPapellidoKeyTyped(evt);
            }
        });
        jPanel2.add(TXTPapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 200, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 580));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        JTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "CEDULA", "TELEFONO", "CORREO", "DIRECCIÓN", "SEXO", "FEC_NACIMIENTO"
            }
        ));
        JTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablePacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTablePaciente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 730, 480));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTBcedula.setText("V-");
        TXTBcedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cédula"));
        TXTBcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTBcedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTBcedulaKeyTyped(evt);
            }
        });
        jPanel4.add(TXTBcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 730, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
       
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    
    
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Correo = TXTPcorreo.getText();
        Matcher mather = pattern.matcher(Correo);

        if (TXTPapellido.getText().equals("") || TXTPnombre.getText().equals("")
            || TXTPcedula.getText().equals("") || TXTPcorreo.getText().equals("") || TXTPtelefono.getText().equals("") || TXTPdireccion.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);

            for (int i =0; i< JTablePaciente.getRowCount();i++)
            {
                if(JTablePaciente.getValueAt(i,1).equals(TXTPcedula.getText())){ JOptionPane.showMessageDialog(null, "EL PACIENTE YA SE ENCUENTRA REGISTRADO", "DATO DUPLICADO", JOptionPane.ERROR_MESSAGE);;}
            }

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
    
                
                
                if(rs.next()) {JOptionPane.showMessageDialog(null, "ESTA CÉDULA YA SE ENCUENTRA REGISTRADA", "CAMPO CÉDULA",JOptionPane.ERROR_MESSAGE);}
               
                
                else{
                    
                 AuditoriaAgregar();
                 AgregarPaciente(); 
                
                }
                
                
    
                
                

            }catch(Exception e){System.out.println(e);}
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
limpiarCampos();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
       
   // Connection con;
   //EnlaceBd cn = new EnlaceBd();
   // PreparedStatement ps;
   // ResultSet rs;
    
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String Correo = TXTPcorreo.getText();
        Matcher mather = pattern.matcher(Correo);

        if (TXTPapellido.getText().equals("") || TXTPnombre.getText().equals("") || TXTPcedula.getText().equals("") 
            || TXTPcorreo.getText().equals("") || TXTPtelefono.getText().equals("") || TXTPdireccion.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);
        } 
        
        
        else if (mather.find() == false) {
           
            
            JOptionPane.showMessageDialog(null, "EMAIL INVALIDO, VERIFIQUE", "EMAIL INVALIDO", JOptionPane.ERROR_MESSAGE);
            this.TXTPcorreo.requestFocus();
            
            
        }

        
             else{    
 AuditoriaModificar();
 ActualizarPaciente();
limpiarCampos();
BtnModificar.setEnabled(false);
 BtnAgregar.setEnabled(true);       
                }
       
                
    }//GEN-LAST:event_BtnModificarActionPerformed

    
  
    
         
            String nacimiento, sexoTable;  
    private void JTablePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablePacienteMouseClicked
     int fila = JTablePaciente.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
   
                Connection con=null;
       EnlaceBd cn = new EnlaceBd();
       PreparedStatement ps=null;
        ResultSet rs=null;  
            
               
                  
 
    
            idPaciente=(int) (JTablePaciente.getValueAt(fila, 0));
            TXTPnombre.setText(JTablePaciente.getValueAt(fila, 1).toString());
            TXTPapellido.setText(JTablePaciente.getValueAt(fila, 2).toString());
            TXTPcedula.setText(JTablePaciente.getValueAt(fila, 3).toString());
            TXTPtelefono.setText(JTablePaciente.getValueAt(fila, 4).toString());
            TXTPcorreo.setText(JTablePaciente.getValueAt(fila, 5).toString());
            TXTPdireccion.setText(JTablePaciente.getValueAt(fila, 6).toString());
            sexoTable=(String) (JTablePaciente.getValueAt(fila, 7).toString());
   
                    Sexo=sexoTable;
          String F = "Femenino";
          String M = "Masculino";
    
          if(Sexo.equals(F)){ JRfemenino.setSelected(true); JRMasculino.setSelected(false);  }
          else if(Sexo.equals(M)){ JRMasculino.setSelected(true); JRfemenino.setSelected(false);  }
            
            
            
    
            
            
            
            BtnAgregar.setEnabled(false);
            BtnModificar.setEnabled(true);
    
 
 
 
 
     
                try{
                    
      String sql2 = " SELECT date_format(FechNacimiento, '%d/%m/%Y') AS Fecha from table_paciente WHERE IdPaciente= ?";
      con = EnlaceBd.getConnection();
      ps = con.prepareStatement(sql2);
      ps.setInt(1, idPaciente);
      rs=ps.executeQuery();
    
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
 
       
      if(rs.next()){
     
    
      
      String nacimiento= rs.getString("Fecha");

      FechaNacimiento.setDate(formato.parse(nacimiento));
      }
           
 
 

             } 
                catch(Exception e){   System.out.println(e); }
    }//GEN-LAST:event_JTablePacienteMouseClicked
    }      
    
    
    public String  Sexo="Masculino";;
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

    private void TXTBcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBcedulaKeyReleased
Search(); acomodarceldas();
    }//GEN-LAST:event_TXTBcedulaKeyReleased

    private void TXTPnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPnombreKeyTyped
   va.longitud(TXTPnombre.getText(), 30, evt);
    }//GEN-LAST:event_TXTPnombreKeyTyped

    private void TXTPapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPapellidoKeyTyped
       va.longitud(TXTPapellido.getText(), 30, evt);
    }//GEN-LAST:event_TXTPapellidoKeyTyped

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

    private void TXTPcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPcorreoKeyTyped
        va.longitud(TXTPcorreo.getText(), 50, evt);
    }//GEN-LAST:event_TXTPcorreoKeyTyped

    private void TXTPdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPdireccionKeyTyped
        va.longitud(TXTPcorreo.getText(), 100, evt);
    }//GEN-LAST:event_TXTPdireccionKeyTyped

    private void TXTBcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBcedulaKeyTyped
                    char car = evt.getKeyChar();
        //VERIFICA Y LIMITA COMPOSICION DE LOS DATOS
        if((car=='V' || car=='E' || car =='J' || car=='-' || car>='0' && car<='9' || car==(char)KeyEvent.VK_DELETE))
        {
            String Caracteres = TXTBcedula.getText();
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
    }//GEN-LAST:event_TXTBcedulaKeyTyped

    

                                              

    
   
   void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    
  public void limpiarCampos() {
      TXTPnombre.setText("");
      TXTPapellido.setText("");
      TXTPcedula.setText("V-");
      TXTPcorreo.setText("");
      TXTPtelefono.setText("");
      TXTPdireccion.setText("");
     // TXTBnombre.setText("");
      TXTBcedula.setText("V-");
      FechaNacimiento.setCalendar(null);
      JRMasculino.setSelected(true);
      JRfemenino.setSelected(false);
      Sexo="Masculino";
      BtnAgregar.setEnabled(true);
      BtnModificar.setEnabled(false);
    }
    
     public void listarPacientes() {

        List<JCPacientes> lista = pacientesDao.listarPacientes();
        modelo = (DefaultTableModel) JTablePaciente.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getIdpacientes();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getApellido();
            ob[3] = lista.get(i).getCedula();
            ob[4] = lista.get(i).getTelefono();
            ob[5] = lista.get(i).getCorreo();
            ob[6] = lista.get(i).getDireccion();
            ob[7] = lista.get(i).getSexo();
            ob[8] = lista.get(i).getFechaN();
            modelo.addRow(ob);

        }
       JTablePaciente.setModel(modelo);
        
            
     JTablePaciente.getColumnModel().getColumn(0).setMaxWidth(0);
     JTablePaciente.getColumnModel().getColumn(0).setMinWidth(0);
     JTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(0);
     JTablePaciente.setDefaultEditor(Object.class, null);
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
  
            
            limpiarTabla(); listarPacientes(); limpiarCampos();
  JOptionPane.showMessageDialog(null, "EL PACIENTE HA SIDO REGISTRADO","REGISTRO DE PACIENTES", 1);
        } catch (Exception e) {
      
            JOptionPane.showMessageDialog(null, e);
        }


      
          
          
    } 
     
   public void ActualizarPaciente() {
   
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
        
            String sql = "update table_paciente set Nombre=?,	Apellido=?,	Cedula=?,	Telefono=?,	Correo=?,  Direccion=?,  Sexo=?,  FechNacimiento=?, Edad=? where Idpaciente=?";

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
            ps.setInt(10, idPaciente);
            int res = ps.executeUpdate();

            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "PACIENTE ACTUALIZADO", "ACTUALIZACIÓN DE DATOS", 1);
                limpiarTabla();
                listarPacientes();
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR PACIENTE", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR UNA CÉDULA DUPLICADA", "DATOS DUPLICADOS", JOptionPane.ERROR_MESSAGE);
           }
                 
    }

      
      
      
      
      public void Search(){
              
                Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
   
 String Busqueda = this.TXTBcedula.getText();
 String sql = "select Idpaciente, Nombre, Apellido, Cedula, Telefono, Correo, Direccion, Sexo, date_format(FechNacimiento, '%d/%m/%Y') AS Fecha  from table_paciente where Cedula LIKE '%" + Busqueda + "%' ";
        
        //DECLARACIÓN DEL MODELO DE LA TABLA
        DefaultTableModel Tabla = (DefaultTableModel)JTablePaciente.getModel();
        JTablePaciente.setDefaultEditor(Object.class, null);
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
               int col1 = rs.getInt(1);
               String col2 = rs.getString(2);
               String col3 = rs.getString(3);
               String col4 = rs.getString(4);
               String col5 = rs.getString(5);
               String col6 = rs.getString(6);
               String col7 = rs.getString(7);
               String col8 = rs.getString(8);
               String col9 = rs.getString(9);
               
               Vector vRow=new Vector();
               vRow.add(col1);
               vRow.add(col2);
               vRow.add(col3);
               vRow.add(col4);
               vRow.add(col5);
               vRow.add(col6);
               vRow.add(col7);
               vRow.add(col8);
               vRow.add(col9);

               Tabla.addRow(vRow);
            }            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
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
      
      
      
      
      
      
      public void AuditoriaModificar(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(Menu.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Modifico al paciente: "+ TXTPnombre.getText()+" "+TXTPapellido.getText() +" " ;
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
    
      
      
      
      
      
      
      
      
       public void acomodarceldas()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)JTablePaciente.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        JTablePaciente.setRowHeight(20);
        
       JTablePaciente.getColumnModel().getColumn(0).setMaxWidth(0);
       JTablePaciente.getColumnModel().getColumn(0).setMinWidth(0);
       JTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(0);
        
       
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("NOMBRE")).setPreferredWidth(60);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("APELLIDO")).setPreferredWidth(60);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("CEDULA")).setPreferredWidth(60);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("TELEFONO")).setPreferredWidth(70);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("CORREO")).setPreferredWidth(70);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("DIRECCIÓN")).setPreferredWidth(70);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("SEXO")).setPreferredWidth(60);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("FEC_NACIMIENTO")).setPreferredWidth(60);
         
        
      
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("NOMBRE")).setCellRenderer(Alinear);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("APELLIDO")).setCellRenderer(Alinear);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("CEDULA")).setCellRenderer(Alinear);;
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("TELEFONO")).setCellRenderer(Alinear);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("CORREO")).setCellRenderer(Alinear);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("DIRECCIÓN")).setCellRenderer(Alinear);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("SEXO")).setCellRenderer(Alinear);
        JTablePaciente.getColumnModel().getColumn(Tabla.findColumn("FEC_NACIMIENTO")).setCellRenderer(Alinear);
    
    }
            
      
      
      
  DefaultTableModel modelo = new DefaultTableModel();
  Mprincipal Menu = new Mprincipal();
  Encriptar encriptar = new Encriptar();
  JCPacientes pacientes  = new JCPacientes();
  JPacientesDao pacientesDao  = new JPacientesDao();
    
  Temporal TM = new Temporal(); 
  int idusuario=TM.getTexto(); 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JLabel FechaAc2;
    public com.toedter.calendar.JDateChooser FechaAdmin;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JRadioButton JRMasculino;
    private javax.swing.JRadioButton JRfemenino;
    private javax.swing.JTable JTablePaciente;
    private javax.swing.JTextField TXTBcedula;
    private javax.swing.JTextField TXTPapellido;
    private javax.swing.JTextField TXTPcedula;
    private javax.swing.JTextField TXTPcorreo;
    private javax.swing.JTextArea TXTPdireccion;
    private javax.swing.JTextField TXTPnombre;
    private javax.swing.JFormattedTextField TXTPtelefono;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
