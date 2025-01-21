/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import Clases.Encriptar;
import Clases.EnlaceBd;
import Clases.JCPacientes;
import Clases.JCPermisos;
import Clases.JPacientesDao;
import Clases.JPermisosDao;
import Clases.Temporal;
import Clases.Validar;
import Menu.Mprincipal;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FCGinebraI
 */
public class JPermisos extends javax.swing.JInternalFrame {

    /**
     * Creates new form JUREGISTRO
     */
    public JPermisos() {
           initComponents();
       ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        Calendar Fecha = new GregorianCalendar();
        
       limpiarTabla();
       
       try{  listarUsuarios();}catch(Exception e){ System.out.println(e);}
     
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        APtabla1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        FechaAdmin = new com.toedter.calendar.JDateChooser();

        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar por")));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuario"));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 830, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Permisologia"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Permisos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 440));

        jButton1.setText("Agregar");
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jButton2.setText("Retirar");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registros", "Laboratorio", "Auditoria", " " }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 370, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 410, 580));

        APtabla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        APtabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Nivel", "Ultima conexion", "Estado"
            }
        ));
        APtabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APtabla1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(APtabla1);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 830, 450));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FechaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        FechaAdmin.setToolTipText("");
        FechaAdmin.setEnabled(false);
        FechaAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.add(FechaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1300, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void APtabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APtabla1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_APtabla1MouseClicked

    


    
    

       
   
   void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

        
    
     public void listarUsuarios() {

        List< JCPermisos> lista = permisosDao.listarUsuarios();
        modelo = (DefaultTableModel) APtabla1.getModel();
        Object[] ob = new Object[10];

        for (int i = 0; i < lista.size(); i++) {

            ob[0] = lista.get(i).getIdpermisos();
            ob[1] = lista.get(i).getPcedula();
            ob[2] = lista.get(i).getPnombre();
            ob[3] = lista.get(i).getPconexion();
            ob[4] = lista.get(i).getEstado();
    
            modelo.addRow(ob);

        }
       APtabla1.setModel(modelo);
        
            

     APtabla1.setDefaultEditor(Object.class, null);
    }
    
        
     
    
          
  DefaultTableModel modelo = new DefaultTableModel();
  Mprincipal Menu = new Mprincipal();
  Encriptar encriptar = new Encriptar();
  JCPermisos permisos  = new JCPermisos();
  JPermisosDao permisosDao  = new JPermisosDao();
  Validar va = new Validar();
  Temporal TM = new Temporal(); 
  int idusuario=TM.getTexto(); 
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable APtabla1;
    public com.toedter.calendar.JDateChooser FechaAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
