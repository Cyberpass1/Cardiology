/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class JCEspecialidades {
    
    int idespecialidad;
    String especialidad;
    String estado;
    
    public JCEspecialidades(){}

    public JCEspecialidades(int idespecialidad, String especialidad, String estado) {
        this.idespecialidad = idespecialidad;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public int getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(int idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
