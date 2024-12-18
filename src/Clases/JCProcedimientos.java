
package Clases;


public class JCProcedimientos {
    
    
    int idprocedimiento;
    String Procedimiento;
    String Categoria;
    String observacion;
    String Estado; 
   
    
    public JCProcedimientos(){}

    public JCProcedimientos(int idprocedimiento, String Procedimiento, String Categoria, String observacion, String Estado) {
        this.idprocedimiento = idprocedimiento;
        this.Procedimiento = Procedimiento;
        this.Categoria = Categoria;
        this.observacion = observacion;
        this.Estado = Estado;
    }

    public int getIdprocedimiento() {
        return idprocedimiento;
    }

    public void setIdprocedimiento(int idprocedimiento) {
        this.idprocedimiento = idprocedimiento;
    }

    public String getProcedimiento() {
        return Procedimiento;
    }

    public void setProcedimiento(String Procedimiento) {
        this.Procedimiento = Procedimiento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

   
  
    
    
}
