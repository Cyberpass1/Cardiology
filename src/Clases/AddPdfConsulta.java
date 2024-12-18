/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author FCGI-ADMIN
 */
public class AddPdfConsulta {
    
    
    int IdConsulta;
    int IdPacientes;
    int IdUsuario;
    int IdEspecialidad;
    String nombredoctor;
    String FechaAsignar;
    byte[] archivo;
    String Estado;
   
    
    int IdHistoria;
    int Id_usuarioh;
    int Id_pacienteh;
    int Id_Fisico;
    String Fecha_Historia;
    int Id_Estadoh;     
    byte[] archivoHistoria;
    
   
    int IdConsulta2;
    int IdPacientes2;
    String IdUsuario2;
    int IdEspecialidad2;
    String nombredoctor2;
    String apellidodoctor2;
    String Cedulapaciente;
    String FechaAsignar2;
    String Correo;
    byte[] archivo2;
    String Estado2;
    
    
    
    
    
    
    
   public  AddPdfConsulta(){}

    public AddPdfConsulta(int IdConsulta, int IdPacientes, int IdUsuario, int IdEspecialidad, String nombredoctor, String FechaAsignar, byte[] archivo, String Estado, int IdHistoria, int Id_usuarioh, int Id_pacienteh, int Id_Fisico, String Fecha_Historia, int Id_Estadoh, byte[] archivoHistoria, int IdConsulta2, int IdPacientes2, String IdUsuario2, int IdEspecialidad2, String nombredoctor2, String apellidodoctor2, String Cedulapaciente, String FechaAsignar2, String Correo, byte[] archivo2, String Estado2) {
        this.IdConsulta = IdConsulta;
        this.IdPacientes = IdPacientes;
        this.IdUsuario = IdUsuario;
        this.IdEspecialidad = IdEspecialidad;
        this.nombredoctor = nombredoctor;
        this.FechaAsignar = FechaAsignar;
        this.archivo = archivo;
        this.Estado = Estado;
        this.IdHistoria = IdHistoria;
        this.Id_usuarioh = Id_usuarioh;
        this.Id_pacienteh = Id_pacienteh;
        this.Id_Fisico = Id_Fisico;
        this.Fecha_Historia = Fecha_Historia;
        this.Id_Estadoh = Id_Estadoh;
        this.archivoHistoria = archivoHistoria;
        this.IdConsulta2 = IdConsulta2;
        this.IdPacientes2 = IdPacientes2;
        this.IdUsuario2 = IdUsuario2;
        this.IdEspecialidad2 = IdEspecialidad2;
        this.nombredoctor2 = nombredoctor2;
        this.apellidodoctor2 = apellidodoctor2;
        this.Cedulapaciente = Cedulapaciente;
        this.FechaAsignar2 = FechaAsignar2;
        this.Correo = Correo;
        this.archivo2 = archivo2;
        this.Estado2 = Estado2;
    }

    public int getIdConsulta() {
        return IdConsulta;
    }

    public void setIdConsulta(int IdConsulta) {
        this.IdConsulta = IdConsulta;
    }

    public int getIdPacientes() {
        return IdPacientes;
    }

    public void setIdPacientes(int IdPacientes) {
        this.IdPacientes = IdPacientes;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(int IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    public String getNombredoctor() {
        return nombredoctor;
    }

    public void setNombredoctor(String nombredoctor) {
        this.nombredoctor = nombredoctor;
    }

    public String getFechaAsignar() {
        return FechaAsignar;
    }

    public void setFechaAsignar(String FechaAsignar) {
        this.FechaAsignar = FechaAsignar;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdHistoria() {
        return IdHistoria;
    }

    public void setIdHistoria(int IdHistoria) {
        this.IdHistoria = IdHistoria;
    }

    public int getId_usuarioh() {
        return Id_usuarioh;
    }

    public void setId_usuarioh(int Id_usuarioh) {
        this.Id_usuarioh = Id_usuarioh;
    }

    public int getId_pacienteh() {
        return Id_pacienteh;
    }

    public void setId_pacienteh(int Id_pacienteh) {
        this.Id_pacienteh = Id_pacienteh;
    }

    public int getId_Fisico() {
        return Id_Fisico;
    }

    public void setId_Fisico(int Id_Fisico) {
        this.Id_Fisico = Id_Fisico;
    }

    public String getFecha_Historia() {
        return Fecha_Historia;
    }

    public void setFecha_Historia(String Fecha_Historia) {
        this.Fecha_Historia = Fecha_Historia;
    }

    public int getId_Estadoh() {
        return Id_Estadoh;
    }

    public void setId_Estadoh(int Id_Estadoh) {
        this.Id_Estadoh = Id_Estadoh;
    }

    public byte[] getArchivoHistoria() {
        return archivoHistoria;
    }

    public void setArchivoHistoria(byte[] archivoHistoria) {
        this.archivoHistoria = archivoHistoria;
    }

    public int getIdConsulta2() {
        return IdConsulta2;
    }

    public void setIdConsulta2(int IdConsulta2) {
        this.IdConsulta2 = IdConsulta2;
    }

    public int getIdPacientes2() {
        return IdPacientes2;
    }

    public void setIdPacientes2(int IdPacientes2) {
        this.IdPacientes2 = IdPacientes2;
    }

    public String getIdUsuario2() {
        return IdUsuario2;
    }

    public void setIdUsuario2(String IdUsuario2) {
        this.IdUsuario2 = IdUsuario2;
    }

    public int getIdEspecialidad2() {
        return IdEspecialidad2;
    }

    public void setIdEspecialidad2(int IdEspecialidad2) {
        this.IdEspecialidad2 = IdEspecialidad2;
    }

    public String getNombredoctor2() {
        return nombredoctor2;
    }

    public void setNombredoctor2(String nombredoctor2) {
        this.nombredoctor2 = nombredoctor2;
    }

    public String getApellidodoctor2() {
        return apellidodoctor2;
    }

    public void setApellidodoctor2(String apellidodoctor2) {
        this.apellidodoctor2 = apellidodoctor2;
    }

    public String getCedulapaciente() {
        return Cedulapaciente;
    }

    public void setCedulapaciente(String Cedulapaciente) {
        this.Cedulapaciente = Cedulapaciente;
    }

    public String getFechaAsignar2() {
        return FechaAsignar2;
    }

    public void setFechaAsignar2(String FechaAsignar2) {
        this.FechaAsignar2 = FechaAsignar2;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public byte[] getArchivo2() {
        return archivo2;
    }

    public void setArchivo2(byte[] archivo2) {
        this.archivo2 = archivo2;
    }

    public String getEstado2() {
        return Estado2;
    }

    public void setEstado2(String Estado2) {
        this.Estado2 = Estado2;
    }

   
   
    
    
    
}
