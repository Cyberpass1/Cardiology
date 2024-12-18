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
public class JCEspecialidadDao {
    
    
    
    
    
      
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
 
   
  
     
    
    
    public List listarEspecialidades() {
        List<JCEspecialidades> lista = new ArrayList<>();
        String sql = "select id_especialidad, especialidad, Estado from table_especialidad u\n" +
"\n" +
"INNER JOIN table_estado e\n" +
"ON u.Id_esta=e.IdEstado\n"+"ORDER BY especialidad ASC" ;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
               JCEspecialidades p = new JCEspecialidades();
                p.setIdespecialidad(rs.getInt(1));
                p.setEspecialidad(rs.getString(2));
                p.setEstado(rs.getString(3));
         
          
          
          
             
     
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
