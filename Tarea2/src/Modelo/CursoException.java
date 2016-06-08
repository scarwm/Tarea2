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
public class CursoException extends Exception{

    private boolean limpiarInterfaz;
    private boolean setEditable =true;
    private boolean enableBoton=false;
            
    public CursoException(String mensaje,boolean limpiar) {
    super(mensaje);
    this.limpiarInterfaz=limpiar;
    }

    public CursoException(String mensaje,boolean limpiar, boolean setEdi,boolean enableBo) {
        super(mensaje);
        this. limpiarInterfaz=limpiar;
        this.setEditable=setEdi;
        this.enableBoton=enableBo;
    }
    
    

    public boolean isSetEditable() {
        return setEditable;
    }

    public boolean isEnableBoton() {
        return enableBoton;
    }

    
    public boolean isLimpiarInterfaz() {
        return limpiarInterfaz;
    }
    
    
    
    
}
