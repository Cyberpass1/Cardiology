/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FCGI-ADMIN
 */
public class JCProcedimientosDao {
    
    
    
    
      
  Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
 
   
  
     
    
    
    public List listarProcedimientos() {
        List<JCProcedimientos> lista = new ArrayList<>();
        String sql = "select idProcedimiento, Procedimiento, Especialidad, Estado from table_procedimientos u\n" +
"INNER JOIN table_estado e\n" +
"ON u.Id_Pestado=e.IdEstado\n" +
"\n" +
"INNER JOIN table_especialidad x\n" +
"ON u.Id_Categoria=x.id_Especialidad \n ORDER BY Especialidad ASC";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
               JCProcedimientos p = new JCProcedimientos();
                p.setIdprocedimiento(rs.getInt(1));
                p.setProcedimiento(rs.getString(2));
                p.setCategoria(rs.getString(3));
                p.setEstado(rs.getString(4));
         
          
          
          
             
     
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error al conectar "+ e);
        }
        
        finally {
            try {
                ps.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
    
}
