/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Menu.Mprincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FCGinebraI
 */
public class JCAuditoriaDao {
    
    
        
  Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
 Mprincipal MP = new Mprincipal();

   
  
    public List listarAuditoria() {
        
                
        
        
        List<JCAuditoria> lista = new ArrayList<>();
        String sql = "SELECT  Idauditoria, Usuario, Cedula, date_format(FechaMov, '%d/%m/%Y') AS FechaAudit, Accion \n" +
"\n" +
"FROM table_auditoria u  \n" +
"\n" +
"INNER JOIN table_personal w\n" +
"ON u.IdPersonal= w.IdPersonal\n" +
"\n" +
"INNER JOIN table_usuario p\n" +
"ON u.IdUsuario= p.IdPersonal WHERE Idauditoria !=0 ORDER BY Idauditoria";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
               JCAuditoria p = new JCAuditoria();
                p.setIdAudit(rs.getInt(1));
                p.setIdUser(rs.getString(2));
                p.setIdPersonal(rs.getString(3));
                p.setFecha(rs.getString(4));
                p.setAccion(rs.getString(5));

          
             
     
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
