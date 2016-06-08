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
public class RegistroCurso {

    private ArrayList<Curso> arregloCurso;

    public RegistroCurso() {

        this.arregloCurso = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        arregloCurso.add(curso);

    }

    public boolean verificarCurso(String siglas) {

        boolean dev = false;
        int posicion;
        if (arregloCurso.size() != 0) {
            for (int i = 0; i < arregloCurso.size(); i++) {

                if (arregloCurso.get(i).getSiglas().equalsIgnoreCase(siglas)) {
                    dev = true;
                    posicion = i;
                    break;
                }
            }
        }
        return dev;
    }

    public Curso buscarCurso(String siglas) {

        Curso dev = null;
        if (arregloCurso.size() != 0) {

            for (Curso cur : arregloCurso) {
                if (cur.getSiglas().equalsIgnoreCase(siglas)) {
                    dev = cur;
                    break;
                }

            }
        }
        return dev;

    }

    public void deletCurso(Curso cur) {
        arregloCurso.remove(cur);
    }

    public void modificar(Curso cur) {
        for (Curso curso : arregloCurso) {
            if (curso.getSiglas().equalsIgnoreCase(cur.getSiglas())) {
                curso.setNombre(cur.getNombre());
                curso.setCreditos(cur.getCreditos());
                break;

            }

        }
    }

}
