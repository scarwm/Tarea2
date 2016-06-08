/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Scarlett
 */
public class RegistroProfesor {

    private ArrayList<Profesor> arrayProf;

    public RegistroProfesor() {

        this.arrayProf = new ArrayList<Profesor>();

    }

    public void agregarProfesor(Profesor profesor) {
        this.arrayProf.add(profesor);
        System.out.println("se agregó profesor");
    }

    public boolean verificarProfesor(int cedula) {
        boolean dev = false;
        if (this.arrayProf.size() != 0) {
            for (int i = 0; i < arrayProf.size(); i++) {
                if (arrayProf.get(i).getCedula() == cedula) {
                    dev = true;
                }
            }

        }
        return dev;
    }

    public Profesor buscarProfesor(int Cedula) {
        Profesor prof=null;

        if (arrayProf.size() != 0) {
            for (Profesor profe : arrayProf) {
                if (profe.getCedula() == Cedula) {
                    prof = profe;
                    break;
                }
            }
        }
        return prof;

    }

    public void eliminar(int Cedula) {
        Profesor p=buscarProfesor(Cedula);
        if (p!=null) {
            arrayProf.remove(p);
            System.out.print("eliminado");
        }else{
            System.out.println("no existe para eliminar");
        }
        
    }
    
    public void modificar(Profesor profesor){
        for(Profesor pro:arrayProf){
            if(pro.getCedula()==profesor.getCedula()){
                pro.setNombre(profesor.getNombre());
                pro.setCorreo(profesor.getCorreo());
                pro.setHorario(profesor.getHorario());
                break;
            }
        }
     }
}
