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
public class RegistroEstudiante {

    private ArrayList<Estudiante> arregloEstudiante;
    private String matrizDatos[][];

    public RegistroEstudiante() {

        this.arregloEstudiante = new ArrayList<Estudiante>();
    }

    public String agregarEstudiante(Estudiante estudiante) {

        arregloEstudiante.add(estudiante);
        return "se agrego con exito";
    }

    public boolean verificarEstudiante(String carnet) {

        boolean dev = false;
        if (arregloEstudiante.size() != 0) {

            for (int i = 0; i < arregloEstudiante.size(); i++) {
                if (arregloEstudiante.get(i).getCarnet().equalsIgnoreCase(carnet)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }

    public Estudiante buscarEstudiante(String carnet) {

        Estudiante dev = null;
        if (arregloEstudiante.size() != 0) {

            for (Estudiante estu : arregloEstudiante) {
                if (estu.getCarnet().equalsIgnoreCase(carnet)) {

                    dev = estu;
                    break;

                }
            }

        }
        return dev;
    }

    public void eliminar(Estudiante estudiante) {

        arregloEstudiante.remove(estudiante);

    }

    public void modificar(Estudiante estudiante) {
        for (Estudiante estudi : arregloEstudiante) {
            if (estudi.getCarnet().equalsIgnoreCase(estudiante.getCarnet())) {
                estudi.setNombre(estudiante.getNombre());
                estudi.setCorreo(estudiante.getCorreo());
                break;

            }

        }
    }

    public String[][] getMatriz() {
        matrizDatos = new String[arregloEstudiante.size()][Estudiante.getTamanno()];
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizDatos[i][j] = arregloEstudiante.get(i).getDatos(j);

            }//fin de for columna

        }//fin de for fila
        return matrizDatos;
    }

    public String getInformacionDeEstudiantes() {
        String info = "";
        if (arregloEstudiante != null) {
            for (int i = 0; i < arregloEstudiante.size(); i++) {
                info = info + "\n" + arregloEstudiante.get(i).getInformacion();
            }
        }

        return info;
    }

}
