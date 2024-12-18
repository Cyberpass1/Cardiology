package Clases;

public class PdfVO {

    /*Todo los atributos*/
    int codigopdf;
    int idpaciente;
    int idusuario;
    int idexamen;
    String fecha;
    String nombrepdf;
    byte[] archivopdf;
    
    

    String cedulapaciente;
    String usuario;
    String examen;
    String state; 
    String Correo;
    
    
    
    
    
    

    public PdfVO() {
    }

    public PdfVO(int codigopdf, int idpaciente, int idusuario, int idexamen, String fecha, String nombrepdf, byte[] archivopdf, String cedulapaciente, String usuario, String examen, String state, String Correo) {
        this.codigopdf = codigopdf;
        this.idpaciente = idpaciente;
        this.idusuario = idusuario;
        this.idexamen = idexamen;
        this.fecha = fecha;
        this.nombrepdf = nombrepdf;
        this.archivopdf = archivopdf;
        this.cedulapaciente = cedulapaciente;
        this.usuario = usuario;
        this.examen = examen;
        this.state = state;
        this.Correo = Correo;
    }

    public int getCodigopdf() {
        return codigopdf;
    }

    public void setCodigopdf(int codigopdf) {
        this.codigopdf = codigopdf;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdexamen() {
        return idexamen;
    }

    public void setIdexamen(int idexamen) {
        this.idexamen = idexamen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }

    public String getCedulapaciente() {
        return cedulapaciente;
    }

    public void setCedulapaciente(String cedulapaciente) {
        this.cedulapaciente = cedulapaciente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

   
 

   

}
