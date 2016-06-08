/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Scarlett
 */
public class Matricula {
    private String  estudiante;
    private String curso;

    public Matricula(String estudiante, String curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    
    public Matricula() {
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String Estudiante) {
        this.estudiante = Estudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.curso);
        hash = 71 * hash + Objects.hashCode(this.estudiante);
        return hash;
    }
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.estudiante, other.estudiante)) {
            return false;
        }
        return true;
    }
    
   
}
