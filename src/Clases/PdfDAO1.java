package Clases;





import Clases.EnlaceBd;
import Clases.PdfVO;
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



public class PdfDAO1 {

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
    public void Agregar_PdfVO(PdfVO vo) {

        String sql = "INSERT INTO table_laboratorio (codigopdf, id_examen, id_paciente, id_personal, FechaReporte, Reportepdf) VALUES(?, ?, ?,?,?,?);";
        PreparedStatement ps = null;
        try {
           
         ps = cn.getConnection().prepareStatement(sql);
   
            ps.setInt(1, vo.getCodigopdf());
            ps.setInt(2, vo.getIdexamen());
            ps.setInt(3, vo.getIdpaciente());
            ps.setInt(4, vo.getIdusuario());
            ps.setString(5, vo.getFecha());
            ps.setBytes(6, vo.getArchivopdf());
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


    /*Metodo Modificar
    public void Modificar_PdfVO(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE pdf SET nombrepdf = ?, archivopdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setBytes(2, vo.getArchivopdf());
            ps.setInt(3, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void Modificar_PdfVO2(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE pdf SET nombrepdf = ? WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setInt(2, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }
*/
    /*Metodo Eliminar*/
    
    
    /*
    public void Eliminar_PdfVO(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM pdf WHERE codigopdf = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    //Permite mostrar PDF contenido en la base de datos
    public void ejecutar_archivoPDF(int id) {

        Conectar cn = new Conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConnection().prepareStatement("SELECT archivopdf FROM pdf WHERE codigopdf = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }
*/
    
    
       public void ejecutar_archivoPDF(int id) {

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

            OutputStream out = new FileOutputStream("new.pdf");
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
            ps = cn.getConnection().prepareStatement("SELECT Archivo_Historia FROM table_historias WHERE Id_historias= ?");
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

    
    
   
    
    
    
    
    
    
}
