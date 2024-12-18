/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author FCGI-ADMIN
 */
public class AddPdfConsultaDao {
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;

    /*Metodo listar*/
    
    
       String cedulapaciente;
    String usuario;
    String examen;


    
    
    public ArrayList<PdfVO> Listar_PdfVO() {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
   
        String sql = "SELECT Codigopdf, Estudio, Cedula, Usuario, FechaReporte, Reportepdf \n" +
"FROM table_laboratorio u\n" +
"\n" +
"INNER JOIN table_estudios n\n" +
"ON u.Id_examen=n.IdEstudio\n" +
"\n" +
"INNER JOIN table_paciente c\n" +
"ON u.id_paciente=c.Idpaciente\n" +
"\n" +
"INNER JOIN table_usuario x\n" +
"ON u.Id_personal=x.IdPersonal";
        
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setExamen(rs.getString(2));
                vo.setCedulapaciente(rs.getString(3));
                vo.setUsuario(rs.getString(4));
                vo.setFecha(rs.getString(5));
                vo.setArchivopdf(rs.getBytes(6));
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


    /*Metodo agregar*/
    public void Agregar_PdfVO(AddPdfConsulta vo) {

        
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;

        try {
          
 
            String sql = "UPDATE table_asignar  set   ReporteConsulta=? WHERE IdAsignar=?";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setBytes(1, vo.getArchivo());
            ps.setInt(2, vo.getIdConsulta());
            ps.executeUpdate();
            //   int res = ps.executeUpdate();
/*
            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "GENERANDO REPORTE...", "REPORTE CONSULTA", 1);
            
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ALMACENAR PDF", "ERROR", JOptionPane.ERROR_MESSAGE);
            }*/

        } catch (Exception e) {
            System.out.println(e);
       //     JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EL PROCEDIMIENTO", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
           }
    }



    
    
    
      
    public ArrayList<AddPdfConsulta> Listar_PdfVOHistorias(JTable tabla, String fecha1, String fecha2) {
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps = null;
    ResultSet rs = null;

    ArrayList<AddPdfConsulta> list = new ArrayList<AddPdfConsulta>();

    String sql = "SELECT Id_historias, Usuario, Id_pacienteh, Nombre, Apellido, Cedula, Correo, Fecha_Historia, Archivo_Historia, Id_Estadoh, Estado " +
                 "FROM table_historias u " +
                 "INNER JOIN table_estado l ON u.Id_Estadoh = l.IdEstado " +
                 "INNER JOIN table_usuario x ON u.Id_usuarioh = x.IdPersonal " +
                 "INNER JOIN table_paciente p ON u.Id_pacienteh = p.Idpaciente " +
                 "WHERE Fecha_Historia BETWEEN ? AND ? " +
                 "ORDER BY Id_historias";

    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, fecha1);
        ps.setString(2, fecha2);
        rs = ps.executeQuery();

        while (rs.next()) {
            int estado = rs.getInt("Id_Estadoh");
            if (estado == 103 || estado == 106) {
                AddPdfConsulta vo = new AddPdfConsulta();
                vo.setIdConsulta2(rs.getInt(1));
                vo.setIdUsuario2(rs.getString(2));
                vo.setIdPacientes2(rs.getInt(3));
                vo.setNombredoctor2(rs.getString(4) + " " + rs.getString(5));
                vo.setCedulapaciente(rs.getString(6));
                vo.setCorreo(rs.getString(7));
                vo.setFechaAsignar2(rs.getString(8));
                vo.setArchivo2(rs.getBytes(9));
                vo.setEstado(rs.getString(11));
                list.add(vo);
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
            cn.desconectar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    return list;
}
      

    
    
    
    
    
    
    
      public ArrayList<AddPdfConsulta> Listar_byced(String ced) {
           
 Connection con;
 EnlaceBd cn = new EnlaceBd();
 PreparedStatement ps=null;
 ResultSet rs=null;
        
//String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaOne.getDate());
// String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(FechaTwo.getDate());
    

ArrayList<AddPdfConsulta> list = new ArrayList<AddPdfConsulta>();


String sql = "SELECT Id_historias, Usuario, Id_pacienteh, Nombre, Apellido, Cedula, Correo, Fecha_Historia, Archivo_Historia, Id_Estadoh, Estado " +
             "FROM table_historias u " +
             "INNER JOIN table_estado l " +
             "ON u.Id_Estadoh = l.IdEstado " +
        
             "INNER JOIN table_usuario x " +
             "ON u.Id_usuarioh = x.IdPersonal " +
        
             "INNER JOIN table_paciente p " +
             "ON u.Id_pacienteh = p.Idpaciente where Cedula LIKE '%" + ced + "%' " +"ORDER BY Id_historias";

//"ON u.Id_personal=x.IdPersonal WHERE FechaReporte BETWEEN " + '"' + fecha + '"' + "AND"  + '"' + fecha2 + '"' +"ORDER BY  Codigopdf ASC";
  
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
    
            while (rs.next()) {
                
                int estado =rs.getInt("Id_Estadoh"); 
                if( estado==103){
                AddPdfConsulta vo = new AddPdfConsulta();
                vo.setIdConsulta2(rs.getInt(1));
                vo.setIdUsuario2(rs.getString(2));
                vo.setIdPacientes2(rs.getInt(3));
                vo.setNombredoctor2(rs.getString(4)+ " "+rs.getString(5));
                vo.setCedulapaciente(rs.getString(6));
                
                vo.setCorreo(rs.getString(7));
                vo.setFechaAsignar2(rs.getString(8));
                vo.setArchivo2(rs.getBytes(9));
                vo.setEstado(rs.getString(11));
   
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
    
    
     
     
     
     
     
    
    
    
    
    
    
    
       public void ejecutar_archivoPDF(int id) {

        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConnection().prepareStatement("SELECT ReporteConsulta FROM table_asignar WHERE IdAsignar = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("consulta.pdf");
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

    
    
    
       public void correo_archivoPDF(int id) {

        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConnection().prepareStatement("SELECT Reportepdf FROM table_laboratorio WHERE codigopdf = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("correo.pdf");
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

       
       
       
       
        
       
       
       
       
          /*Metodo agregar*/
    public void Agregar_PdfVOHistorias(AddPdfConsulta vo) {
      
        String sql = "INSERT INTO table_historias (Id_usuarioh, Id_pacienteh, Fecha_Historia, Archivo_Historia) VALUES(?,?,?,?)";
        PreparedStatement ps = null;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
  
            
            ps.setInt(1, vo.getId_usuarioh());
            ps.setInt(2, vo.getId_pacienteh());
            ps.setString(3, vo.getFecha_Historia());
            ps.setBytes(4, vo.getArchivoHistoria());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
    }
       
       
       
       
       
       
       
       
         
       public void ejecutar_archivoPDFHistorias(int id) {

        EnlaceBd cn = new EnlaceBd();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConnection().prepareStatement("SELECT Archivo_Historia FROM table_historias WHERE Id_historias = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("ConsultaHistoria.pdf");
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

    
       
       
       
    /*Metodo agregar*/
    public void AgregarHistoriaPdfVO(AddPdfConsulta vo) {

        
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;

        try {
          
 
            String sql = "UPDATE table_historias  set   Archivo_Historia=?, Id_Estadoh=? WHERE Id_historias=? ";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setBytes(1, vo.getArchivoHistoria());
            ps.setInt(2, vo.getId_Estadoh());
            ps.setInt(3, vo.getIdHistoria());
          //  ps.setInt(4, vo.getId_pacienteh());
            ps.executeUpdate();
            //   int res = ps.executeUpdate();
/*
            if (res >= 1) {
                JOptionPane.showMessageDialog(null, "GENERANDO REPORTE...", "REPORTE CONSULTA", 1);
            
                
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ALMACENAR PDF", "ERROR", JOptionPane.ERROR_MESSAGE);
            }*/

        } catch (Exception e) {
            System.out.println(e);
       //     JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR EL PROCEDIMIENTO", "PROCEDIMIENTOS", JOptionPane.ERROR_MESSAGE);
           }
    }
       
       
       
    
    
    
    
    
      public ArrayList<AddPdfConsulta> Listar_byDate(String fecha, String fecha2) {
           
 Connection con;
 EnlaceBd cn = new EnlaceBd();
 PreparedStatement ps=null;
 ResultSet rs=null;
        
//String fecha = new SimpleDateFormat("yyyy-MM-dd").format(FechaOne.getDate());
// String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(FechaTwo.getDate());
    

ArrayList<AddPdfConsulta> list = new ArrayList<AddPdfConsulta>();


String sql = "SELECT Id_historias, Usuario, Id_pacienteh, Nombre, Apellido, Cedula, Correo, Fecha_Historia, Archivo_Historia, Id_Estadoh, Estado " +
             "FROM table_historias u " +
             "INNER JOIN table_estado l " +
             "ON u.Id_Estadoh = l.IdEstado " +
        
             "INNER JOIN table_usuario x " +
             "ON u.Id_usuarioh = x.IdPersonal " +
        
             "INNER JOIN table_paciente p " +
             "ON u.Id_pacienteh = p.Idpaciente WHERE Fecha_Historia BETWEEN " + '"' + fecha + '"' + "AND"  + '"' + fecha2 + '"' +"ORDER BY  Id_historias ASC";

//"ON u.Id_personal=x.IdPersonal WHERE FechaReporte BETWEEN " + '"' + fecha + '"' + "AND"  + '"' + fecha2 + '"' +"ORDER BY  Codigopdf ASC";
  
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
    
            while (rs.next()) {
                
                int estado =rs.getInt("Id_Estadoh"); 
                if( estado==103){
                AddPdfConsulta vo = new AddPdfConsulta();
                vo.setIdConsulta2(rs.getInt(1));
                vo.setIdUsuario2(rs.getString(2));
                vo.setIdPacientes2(rs.getInt(3));
                vo.setNombredoctor2(rs.getString(4)+ " "+rs.getString(5));
                vo.setCedulapaciente(rs.getString(6));
                
                vo.setCorreo(rs.getString(7));
                vo.setFechaAsignar2(rs.getString(8));
                vo.setArchivo2(rs.getBytes(9));
                vo.setEstado(rs.getString(11));
   
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
    
    
    
    
    
    
    
    
    
    
    
    
       
}
