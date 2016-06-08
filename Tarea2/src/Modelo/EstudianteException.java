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
public class EstudianteException extends Exception{
    
    private boolean limpiarIntefaz;
    private boolean enableBoton =false;
    private boolean setEditable=true;

    public EstudianteException(String mensaje, boolean limpiar) {
        super(mensaje);
        this.limpiarIntefaz=limpiar;
    }

    public EstudianteException(String mensaje,boolean limpiar,boolean enableBo, boolean setEdi) {
        super(mensaje);
        this.limpiarIntefaz=limpiar;
        this.enableBoton=enableBo;
        this.setEditable=setEdi;
    }
       
    public boolean getLimpiarInterfaz(){
        return this.limpiarIntefaz;
    }

    public boolean isEnableBoton() {
        return this.enableBoton;
    }

    public boolean isSetEditable() {
        return this.setEditable;
    }
    
    
    
    
}
