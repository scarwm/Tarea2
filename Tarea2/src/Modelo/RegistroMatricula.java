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
public class RegistroMatricula {

    private ArrayList<Matricula> matriculas;

    public RegistroMatricula() {
        matriculas = new ArrayList<Matricula>();

    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    /**
     * public Matricula obtener_matricula(String carnet, String sigla){
     * for(Matricula mat: matriculas){ if(mat.getArrayCurso().equals(sigla) &&
     * mat.getArrayEstudiantes().equals(carnet) ){ return mat; } } return null;
    }*
     */
    public String agregar_matricula(Matricula matricula) {
        String men =" se agregó";
        
            matriculas.add(matricula);
        
        return men;
    }

    public void eliminar_matricula(Matricula matricula) {
        matriculas.remove(matricula);
    }

}
