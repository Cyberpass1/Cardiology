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
 * @author FCGinebraI
 */
public class JUserDao {
    

    
  Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
 
   
  
     
    
    
    public List listarUsuarios() {
        List<JCUsers> lista = new ArrayList<>();
        String sql = "select IdPersonal, Nombre, Apellido, Cedula, Telefono, Correo, Direccion, date_format(Nacimiento, '%d/%m/%Y') AS Fecha from table_personal";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCUsers p = new  JCUsers();
                p.setIdpacientes(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                p.setCedula(rs.getString(4));
                p.setTelefono(rs.getString(5));
                p.setCorreo(rs.getString(6));
                p.setDireccion(rs.getString(7));
                p.setFechaN(rs.getString(8));
          
          
             
     
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
