/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.JCEspecialidadDao;
import Clases.JCEspecialidades;
import Clases.JCPacientes;
import Clases.JCProcedimientos;
import Clases.JCProcedimientosDao;
import Clases.JCambiarState;
import Clases.Temporal;
import Clases.Validar;
import Menu.Mprincipal;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
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
public class JEspecialidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form JUREGISTRO
     */
    public JEspecialidades() {
           initComponents();
       ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        Calendar Fecha = new GregorianCalendar();
listarEspecialidades();
    }

    Mprincipal Menu = new Mprincipal();
    Encriptar encriptar = new Encriptar();
    
    Validar va = new Validar();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPopup = new javax.swing.JPopupMenu();
        Activar = new javax.swing.JMenuItem();
        Desactivar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        FechaAc2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TxtEspecialidad = new javax.swing.JTextField();
        BtnAgg = new javax.swing.JButton();
        BtnLimpiar1 = new javax.swing.JButton();
        BtnModif = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        TXTfindbyName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEspecialidad = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        Activar.setText("Activar");
        Activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivarActionPerformed(evt);
            }
        });
        MenuPopup.add(Activar);

        Desactivar.setText("Desactivar");
        Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesactivarActionPerformed(evt);
            }
        });
        MenuPopup.add(Desactivar);

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAc2.setBackground(new java.awt.Color(0, 0, 0));
        FechaAc2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        FechaAc2.setText("M Ó D U L O      E S P E C I A L I D A D E S");
        jPanel2.add(FechaAc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 370, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 30));

        TxtEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Especialidad"));
        jPanel2.add(TxtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 360, 50));

        BtnAgg.setText("Agregar");
        BtnAgg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnAgg.setContentAreaFilled(false);
        BtnAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAggActionPerformed(evt);
            }
        });
        jPanel2.add(BtnAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 100, 30));

        BtnLimpiar1.setText("Nuevo");
        BtnLimpiar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnLimpiar1.setContentAreaFilled(false);
        BtnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 100, 30));

        BtnModif.setText("Modificar");
        BtnModif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnModif.setContentAreaFilled(false);
        BtnModif.setEnabled(false);
        BtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifActionPerformed(evt);
            }
        });
        jPanel2.add(BtnModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 100, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 500, 20));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 10, 50));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 10, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 500, 610));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTfindbyName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Especialidad"));
        TXTfindbyName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TXTfindbyNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTfindbyNameKeyTyped(evt);
            }
        });
        jPanel4.add(TXTfindbyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 730, 100));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        JTableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ESPECIALIDAD", "ESTADO"
            }
        ));
        JTableEspecialidad.setComponentPopupMenu(MenuPopup);
        JTableEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEspecialidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableEspecialidad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 730, 510));

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTfindbyNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTfindbyNameKeyReleased
     Search(); acomodarceldas();
    }//GEN-LAST:event_TXTfindbyNameKeyReleased

    
    
    
    
    
    
    private void TXTfindbyNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTfindbyNameKeyTyped
     
    }//GEN-LAST:event_TXTfindbyNameKeyTyped

    
    
    
    int idespecialidades =0;
    String EstadoTexto = "";
    
    private void JTableEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEspecialidadMouseClicked

        
        
         int fila = JTableEspecialidad.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Fila");
        } else {
   

            BtnModif.setEnabled(true);
            BtnAgg.setEnabled(false);
            idespecialidades=(int) (JTableEspecialidad.getValueAt(fila, 0));
            TxtEspecialidad.setText(JTableEspecialidad.getValueAt(fila, 1).toString());
            EstadoTexto =JTableEspecialidad.getValueAt(fila, 2).toString();
    
    
    }                                  
        
        
        
        
        
    }//GEN-LAST:event_JTableEspecialidadMouseClicked

    private void BtnAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAggActionPerformed
 int row = JTableEspecialidad.getRowCount();
    Object[] content = new Object[row];
    for (int i = 0; i < row; i++) {
        content[i] = JTableEspecialidad.getValueAt(i, 2);
    }
    Object value_to_find= TxtEspecialidad.getText();
    boolean exist = Arrays.asList(content).contains(value_to_find);
        
           if (TxtEspecialidad.getText().equals(""))  {
            
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);
        }
         else if (exist){
        JOptionPane.showMessageDialog(null, "EL PROCEDIMIENTO YA EXISTE", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
    }
         
      
           else{
               
              AgregarEspecialidad(); 
              AuditoriaAggEsp();
              limpiarTabla(); 
              listarEspecialidades();  
              limpiarCampos(); 
          
           }
    }//GEN-LAST:event_BtnAggActionPerformed

    private void BtnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiar1ActionPerformed
      limpiarCampos();
    }//GEN-LAST:event_BtnLimpiar1ActionPerformed

    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifActionPerformed
             if (TxtEspecialidad.getText().equals(""))  {
            
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS", "LLENADO DE CAMPOS", JOptionPane.INFORMATION_MESSAGE);
        }
       
      
           else{
            
              ActualizarEspecialidad();
              AuditoriaModfEsp();
              limpiarTabla(); 
              listarEspecialidades();  
              limpiarCampos(); 
             
          
           }
    }//GEN-LAST:event_BtnModifActionPerformed

    private void ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente Activar el procedimiento?",
            "ACTIVAR PROCEDIMIENTO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

        int fila = JTableEspecialidad.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe selecionar una Fila");
        } else {

            if (EstadoTexto.equals("Activo")){ JOptionPane.showMessageDialog(null, "EL PROCEDIMIENTO YA SE ENCUENTA: Activo", "Estado", JOptionPane.WARNING_MESSAGE);}
            else if (setState.InactivarEspecialidad(100,      idespecialidades )) {

                JOptionPane.showMessageDialog(null, "EL ESTADO DE LA CITA SE HA ACTUALIZADO HA : Activo", "Estado", 1);
                limpiarTabla();
                listarEspecialidades();
                acomodarceldas();
                //AuditoriaCancelarCita();

            }
        }

        }
    }//GEN-LAST:event_ActivarActionPerformed

    private void DesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesactivarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente inactivar este procedimiento?",
            "INACTIVAR PROCEDIMIENTO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)  {

        int fila = JTableEspecialidad.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe selecionar una Fila");
        } else {

            if (EstadoTexto.equals("Inactivo")){ JOptionPane.showMessageDialog(null, "EL PROCEDIMIENTO YA SE ENCUENTA: Inactivo", "Estado", JOptionPane.WARNING_MESSAGE);}
            else if (setState.InactivarEspecialidad(101,       idespecialidades )) {

                JOptionPane.showMessageDialog(null, "EL ESTADO DEL PROCEDIMIENTO SE HA ACTUALIZADO HA : Inactivo", "Estado", 1);
                limpiarTabla();
                listarEspecialidades();
                acomodarceldas();
                //AuditoriaCancelarCita();

            }
        }

        }
    }//GEN-LAST:event_DesactivarActionPerformed

    
  public void SearchbyNombre(){
         
     Connection con;
     EnlaceBd cn = new EnlaceBd();
     PreparedStatement ps;
     ResultSet rs;
   
     String Busqueda = this.TXTfindbyName.getText();
     String sql = "select Idpaciente, Nombre, Apellido, Cedula, Telefono, Correo, Direccion, Sexo, date_format(FechNacimiento, '%d/%m/%Y') AS Fecha  from table_paciente where Nombre LIKE '%" + Busqueda + "%' ";
        
     //DECLARACIÓN DEL MODELO DE LA TABLA
     DefaultTableModel Tabla = (DefaultTableModel)JTableEspecialidad.getModel();
     JTableEspecialidad.setDefaultEditor(Object.class, null);
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
  
  
  
   

  
  
  
  
   public void AgregarEspecialidad(){                                             
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    

          try {

              
 
        
        
 
        
        
              
              
            String sql = "INSERT INTO table_especialidad (especialidad) VALUES (?)";
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
      
            ps.setString(1, TxtEspecialidad.getText());
         

            ps.execute();
  
            
         limpiarTabla();  listarEspecialidades(); limpiarCampos();
  JOptionPane.showMessageDialog(null, "ESPECIALIDAD REGISTRADA","REGISTRO ESPECIALIDADES", 1);
        } catch (Exception e) {
      
            JOptionPane.showMessageDialog(null, e);
        }


      
          
          
    } 
   
   
   
   
   
   
      public void ActualizarEspecialidad() {
   
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;

        try {
          
            
            
            
            
            
 
            String sql = "update table_especialidad set   Especialidad=? where id_especialidad=?";

            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, TxtEspecialidad.getText());
            ps.setInt(2, idespecialidades);
            int res = ps.executeUpdate();

            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "ESPECIALIDAD ACTUALIZADA", "ACTUALIZACIÓN DE DATOS", 1);
            
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA ESPECIALIDAD", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA ESPECIALIDAD", "ESPECIALIDADES", JOptionPane.ERROR_MESSAGE);
           }
                 
    }

     
     
   
   
   
   
    
  
  
  public void limpiarCampos(){
  TxtEspecialidad.setText("");
  TXTfindbyName.setText("");
  BtnModif.setEnabled(false);
  BtnAgg.setEnabled(true);
  
  }
  
  
   
    
     public void listarEspecialidades() {

        List<JCEspecialidades> lista = EspecialidadDao.listarEspecialidades();
        modelo = (DefaultTableModel) JTableEspecialidad.getModel();
        Object[] ob = new Object[5];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getIdespecialidad();
            ob[1] = lista.get(i).getEspecialidad();
            ob[2] = lista.get(i).getEstado();
            

            modelo.addRow(ob);

        }
       JTableEspecialidad.setModel(modelo);
        acomodarceldas();
 
     JTableEspecialidad.setDefaultEditor(Object.class, null);
    }
     
     
     
     
     
     
     
     
     
    
    
    public void acomodarceldas()
    {
     
        DefaultTableModel Tabla = (DefaultTableModel)JTableEspecialidad.getModel();
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        JTableEspecialidad.setRowHeight(20);
        

        
       
        JTableEspecialidad.getColumnModel().getColumn(Tabla.findColumn("ID")).setPreferredWidth(60);
        JTableEspecialidad.getColumnModel().getColumn(Tabla.findColumn("ESPECIALIDAD")).setPreferredWidth(60);
        JTableEspecialidad.getColumnModel().getColumn(Tabla.findColumn("ESTADO")).setPreferredWidth(60);
         
        
      
        JTableEspecialidad.getColumnModel().getColumn(Tabla.findColumn("ID")).setCellRenderer(Alinear);
        JTableEspecialidad.getColumnModel().getColumn(Tabla.findColumn("ESPECIALIDAD")).setCellRenderer(Alinear);
        JTableEspecialidad.getColumnModel().getColumn(Tabla.findColumn("ESTADO")).setCellRenderer(Alinear);
    
    }
  
  
  
  
  
      public void AuditoriaAggEsp(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(Menu.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Agrego el procedimiento: " +TxtEspecialidad.getText() +" " ;
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
      
      
      
      public void AuditoriaModfEsp(){
            
            
   Connection con=null;
   EnlaceBd cn = new EnlaceBd();
   PreparedStatement ps=null;
   ResultSet rs=null;
          

   try {
            
              String Fecha = new SimpleDateFormat("dd/MM/yyyy").format(Menu.FechaAdmin.getDate());
           
            String sql = "INSERT INTO table_auditoria (IdUsuario, IdPersonal, Accion,FechaMov) values (?,?,?,?)";
            String accion= "Modifico el procedimiento: " +TxtEspecialidad.getText() +" " ;
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
      
  
  
  
    public  void limpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) JTableEspecialidad.getModel();
        int a = JTableEspecialidad.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

  
    
        
      public void Search(){
              
                Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
   
 String Busqueda = this.TXTfindbyName.getText();
 String sql = "select id_especialidad, Especialidad, Estado   from table_especialidad u\n" +
"INNER JOIN table_estado x\n" +
"ON u.Id_esta= x.IdEstado where  Especialidad LIKE '%" + Busqueda + "%' ";
        
        //DECLARACIÓN DEL MODELO DE LA TABLA
        DefaultTableModel Tabla = (DefaultTableModel)JTableEspecialidad.getModel();
        JTableEspecialidad.setDefaultEditor(Object.class, null);
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
    

               
               Vector vRow=new Vector();
               vRow.add(col1);
               vRow.add(col2);
               vRow.add(col3);
   


               Tabla.addRow(vRow);
            }            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
  }
      
     
    
    
    
      DefaultTableModel modelo = new DefaultTableModel();
  JCPacientes pacientes  = new JCPacientes();
  JCEspecialidadDao EspecialidadDao  = new  JCEspecialidadDao();


  JCambiarState setState = new JCambiarState();
  Temporal TM = new Temporal(); 
  int idusuario=TM.getTexto(); 
    
     
    
        
     
    

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Activar;
    private javax.swing.JButton BtnAgg;
    private javax.swing.JButton BtnLimpiar1;
    private javax.swing.JButton BtnModif;
    private javax.swing.JMenuItem Desactivar;
    private javax.swing.JLabel FechaAc2;
    private javax.swing.JTable JTableEspecialidad;
    private javax.swing.JPopupMenu MenuPopup;
    private javax.swing.JTextField TXTfindbyName;
    private javax.swing.JTextField TxtEspecialidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
