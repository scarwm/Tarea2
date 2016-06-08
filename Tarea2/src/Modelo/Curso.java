/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Scarlett
 */
public class Curso {
    
    private String nombre= "";
    private String siglas="";
    private int creditos = 0;
    private int cantiDeEstu=0;

    public Curso(String nombre, String siglas, int creditos) {
        this.nombre=nombre;
        this.siglas=siglas;
        this.creditos=creditos;
        
    }

    public Curso() {
    }

    public int getCantiDeEstu() {
        return cantiDeEstu;
    }

    public void setCantiDeEstu(int cantiDeEstu) {
        this.cantiDeEstu = cantiDeEstu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
    
    
}
