/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class EnlaceBd {
    
       private static Connection con;
 public  static Connection getConnection()
 {
   try{       
  Class.forName("com.mysql.cj.jdbc.Driver");
//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fundaginebrabd","root","elefante1999");
// con=DriverManager.getConnection("jdbc:mysql://192.168.0.69:3306/fundaginebrabd","BasedatosJC","1234");
//con=DriverManager.getConnection("jdbc:mysql://192.168.0.47:3306/fundaginebrabd","DBfundaginbra","1234");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardiologybd","root","");
// con=DriverManager.getConnection("jdbc:mysql://192.168.0.69:3306/fundaginebrabd","DBfundaginbra","1234");
//con=DriverManager.getConnection("jdbc:mysql://192.168.0.101:3306/fundaginebrabd","DBfundaginbra","1234");

//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fundaginebrabd","DBfundaginbra","1234");
       }catch(Exception e){  System.err.println("Error al conectar "+ e);
       }
return con;
            
 
 
 
 
 }

 
 
   public void desconectar() {
        try {
            con.close();
        } catch (Exception ex) {
        }
    }
 
 
 

}
