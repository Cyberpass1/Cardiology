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


public class LlenarCombobox {
    
    
  static  Connection con;
  static EnlaceBd cn = new EnlaceBd();
  static PreparedStatement ps;
  static ResultSet rs;
    
      public static ArrayList<String> llenarRol(){
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT * FROM table_nivel ORDER BY Nivelu ASC";
     
      
       

       
        
        try {
           con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
          
            while(rs.next()){
                lista.add(rs.getString("nivelu"));}
            
        } catch (Exception e) {System.out.println(e);}
        finally
    {  
    try{ps.close();
    rs.close();
    con.close();
    }catch(Exception e){System.out.println(e);}    
    }
       
        return lista;
    }
      
      
      
      
      
      
      
      
      
      
      
        public static ArrayList<String> llenarEspecialidad(){
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT * FROM table_especialidad ORDER BY especialidad ASC";
       
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
       
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        
        
        
        
        try {
            
          
            while(rs.next()){
                int estado =rs.getInt("Id_esta");
                if( estado==100){
                lista.add(rs.getString("especialidad"));}
            }
        } catch (Exception e) {System.out.println(e);}
        finally
    {  
    try{ps.close();
    rs.close();
    con.close();
    }catch(Exception e){System.out.println(e);}    
    }
       
        return lista;
    }
   
          
          
          
          
          
          
          
          
          
      
      
   
          
          
          
          
          
          
  
    
}
