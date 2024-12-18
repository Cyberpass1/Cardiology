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
public class JCAntecedentesFamiliaresDao {
    
    
    
        
  Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
    
    
    
      public List listarAntecedentesFamiliares() {
        List<JCAntecedentesFamiliares> lista = new ArrayList<>();
        String sql = "select * from table_afamiliares";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCAntecedentesFamiliares p = new JCAntecedentesFamiliares();
                p.setIdAntecentes1(rs.getInt(1));
                p.setEnfermedad1(rs.getString(2));
                p.setEstado1(rs.getString(3));
           
          
          
             
     
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error al conectar "+ e);
        }
        
        finally {
            try {
                ps.close();
                rs.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
      
      
      
      
        public List listarAntecedentesPatologicos() {
        List<JCAntecedentesFamiliares> lista = new ArrayList<>();
        String sql = "select * from table_afamiliarespers";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCAntecedentesFamiliares p = new JCAntecedentesFamiliares();
                p.setIdAntecentes2(rs.getInt(1));
                p.setEnfermedad2(rs.getString(2));
                p.setEstado2(rs.getString(3));
                
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error al conectar "+ e);
        }
        
        finally {
            try {
                ps.close();
                rs.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
      
      
      
      
      
      
      
      public List listarCallAntc1(int idhistorias) {
        List<JCAntecedentesFamiliares> lista = new ArrayList<>();
        String sql = "select * from Table_antc1 where Id_Hist="+idhistorias;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCAntecedentesFamiliares p = new JCAntecedentesFamiliares();
                p.setCallAtcd1(rs.getInt(1));
                p.setCallE1(rs.getString(2));
                p.setCallD1(rs.getString(3));
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error al conectar "+ e);
        }
        
        finally {
            try {
               ps.close();
               rs.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
      

      
      
      
      
      
      
       public List ShowAntc1(int idantc1) {
        List<JCAntecedentesFamiliares> lista = new ArrayList<>();
        String sql = "select * from table_antc1 WHERE Id_Hist ="+idantc1;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCAntecedentesFamiliares p = new JCAntecedentesFamiliares();
                p.setShowAntcid1(rs.getInt(1));
                p.setShowAntcidh1(rs.getInt(2));
                p.setShowNameantc1(rs.getString(3));
                p.setShowDescription1(rs.getString(4));
           
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error en mostrar antc1 "+ e);
        }
        
        finally {
            try {
                ps.close();
                rs.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
      
      
      
      
      
      
      
      
      
      
      public List ShowAntc2(int idantc2) {
        List<JCAntecedentesFamiliares> lista = new ArrayList<>();
        String sql = "select * from table_antc2 WHERE Id_Hist ="+idantc2;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCAntecedentesFamiliares p = new JCAntecedentesFamiliares();
                p.setShowAntcid2(rs.getInt(1));
                p.setShowAntcidh2(rs.getInt(2));
                p.setShowNameantc2(rs.getString(3));
                p.setShowDescription2(rs.getString(4));
           
          
          
             
     
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error en mostrar antc1 "+ e);
        }
        
        finally {
            try {
                ps.close();
                rs.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
      
      
      
      
      
      
        public List showEAdc(int idadc) {
        List<JCAntecedentesFamiliares> lista = new ArrayList<>();
        String sql = "select * from table_examenadic WHERE id_historiadc ="+idadc;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                JCAntecedentesFamiliares p = new JCAntecedentesFamiliares();
                p.setShowEadc(rs.getInt(1));
                p.setShowEadcH(rs.getInt(2));
                p.setShowNameAdc(rs.getString(3));
                p.setShowDescriptionAdc(rs.getString(4));
           
          
          
             
     
                lista.add(p);
            }
        } catch (Exception e) {System.err.println("Error en mostrar antc1 "+ e);
        }
        
        finally {
            try {
                ps.close();
                rs.close();
               cn.desconectar();
            } catch (Exception ex) {
            }
        }
        return lista;
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    
}
