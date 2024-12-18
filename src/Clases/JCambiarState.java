
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class JCambiarState {
    
    Connection con;
    EnlaceBd cn = new EnlaceBd();
    PreparedStatement ps;
    ResultSet rs;
   
    public boolean Revisar(int estado, int id)
{

String sql = "UPDATE table_laboratorio SET Id_Estado=? WHERE Idlab=?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
}
    
    
    
        public boolean CancelarAsignacion(int estado, int id)
{

String sql = "UPDATE table_asignar SET EstadoA=? WHERE IdAsignar=?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
}
    
    
    
    
        
           public boolean CancelarProceso(int estado, int id)
{

String sql = "UPDATE asignar_procedimiento SET Id_Estado=? WHERE Id_AProcedimientos=?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
}
        
        
        public boolean InactivarProcedimiento(int estado, int id)
{

String sql = "UPDATE table_procedimientos SET Id_Pestado=? WHERE idProcedimiento =?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
} 
        
        
        
        
        
           public boolean InactivarEspecialidad(int estado, int id)
{

String sql = "UPDATE table_especialidad SET Id_esta=? WHERE id_especialidad =?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
} 
     
           
           
           
           
           
        public boolean CompletarPaciente(int estado, int id)
{

String sql = "UPDATE table_asignar SET EstadoA=? WHERE IdAsignar=?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
}    
           
           
           
           
            
        public boolean CompletarHistoria(int estado, int id)
{

String sql = "UPDATE table_historias SET Id_Estadoh=? WHERE Id_historias=?";
try{
    
      con=cn.getConnection();
      ps= con.prepareStatement(sql);
      ps.setInt(1, estado);
      ps.setInt(2, id);
      ps.execute();
      return true;

}
catch (SQLException e){ JOptionPane.showMessageDialog(null, e.toString());}
return false;
    
}    
           
             
           
           
           
           
           
        
        
}
