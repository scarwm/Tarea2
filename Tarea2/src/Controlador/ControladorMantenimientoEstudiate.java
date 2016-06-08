/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.EstudianteException;
import Modelo.RegistroEstudiante;
import Vista.GuiBuscarEstudiante;
import Vista.ManipulaEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControladorMantenimientoEstudiate implements ActionListener {

    public final static int CARNET = 1;

    public final static int NOMBRE = 2;

    public final static int CORREO = 3;

    public final static int AGREGAR = 4;

    public final static int BUSCAR = 5;

    public final static int EDITAR = 6;

    public final static int ELIMINAR = 7;

    public final static int GUARDAR = 8;

    private ManipulaEstudiantes manipulaEstudiantes;

    private Estudiante estudiante;
    private RegistroEstudiante regis;
    private GuiBuscarEstudiante guiBuscarEstudiante;

    public ControladorMantenimientoEstudiate(ManipulaEstudiantes manipulaEstudiantes, RegistroEstudiante regis) {
        this.manipulaEstudiantes = manipulaEstudiantes;
        this.regis = regis;
        this.guiBuscarEstudiante = new GuiBuscarEstudiante();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.manipulaEstudiantes.getCodigoPorFuente(ae.getSource());
        try {
            hacerProceso(codigo);

        } catch (EstudianteException e) {
            this.manipulaEstudiantes.setMensaje(e.getMessage());
            if (e.getLimpiarInterfaz() == true) {
                manipulaEstudiantes.limpiar();
            }
            if (e.isEnableBoton() == true) {
                manipulaEstudiantes.enableBoton(true);
            }else if(e.isEnableBoton()==false){
                manipulaEstudiantes.enableBoton(false);
            }if (e.isSetEditable()==false) {
                 manipulaEstudiantes.setEditable(false);
            }else if(e.isSetEditable()==true){
                manipulaEstudiantes.setEditable(true);
            }
        }

    }

    public void hacerProceso(int codigo) throws EstudianteException {
        switch (codigo) {
            case AGREGAR:
                if (manipulaEstudiantes.verificar() == true) {

                    throw new EstudianteException("procure llenar los datos requeridos", false);

                } else {
                    estudiante = new Estudiante(manipulaEstudiantes.getTexCarnet(), manipulaEstudiantes.getTexNombre(), manipulaEstudiantes.getTexCorreo());
                    if (regis.verificarEstudiante(estudiante.getCarnet()) == false) {

                        regis.agregarEstudiante(estudiante);
                        throw new EstudianteException("se agregó el estudiante", true);
                    } else {
                        throw new EstudianteException("ya existe un estudiante con este carnet", true);
                    }
                }

            case ELIMINAR:
                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    throw new EstudianteException("procure llenar los datos requeridos", false);
                } else {
                    Estudiante estudi = regis.buscarEstudiante(manipulaEstudiantes.getTexCarnet());
                    if (estudi != null) {
                        regis.eliminar(estudi);
                        throw new EstudianteException("se elimino estudiante", true);
                    } else {
                        throw new EstudianteException("No se encontró estudiante para eliminar", true);

                    }
                }

            case BUSCAR:
                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    throw new EstudianteException("Ingrese el carnet para buscar el estudiante", true);

                } else {
                    Estudiante estudiante = regis.buscarEstudiante(manipulaEstudiantes.getTexCarnet());

                    if (estudiante == null) {
                        throw new EstudianteException("no se encontro el estudiante", true);

                    } else {
                        guiBuscarEstudiante.setInformacion(estudiante.getCarnet() + " " + estudiante.getNombre() + " " + estudiante.getCorreo() + " ");
                        guiBuscarEstudiante.show();

                    }
                }

                break;

            case EDITAR:

                if (manipulaEstudiantes.verificarTexCarnet() == true) {
                    throw new EstudianteException("Ingrese el carnet para buscar el estudiante", true);

                } else {
                    Estudiante estudiante = regis.buscarEstudiante(manipulaEstudiantes.getTexCarnet());

                    if (estudiante == null) {

                        throw new EstudianteException("No se encontro el estudiante", true);

                    } else {
                        manipulaEstudiantes.setTexCarnet(estudiante.getCarnet());
                        manipulaEstudiantes.setTexNombre(estudiante.getNombre());
                        manipulaEstudiantes.setTexCorreo(estudiante.getCorreo());
                        throw new EstudianteException("se pueden editar los datos", false, true, false);

                    }
                }

                

            case GUARDAR:
                Estudiante estudiante = new Estudiante(manipulaEstudiantes.getTexCarnet(), manipulaEstudiantes.getTexNombre(), manipulaEstudiantes.getTexCorreo());
                regis.modificar(estudiante);
                throw new EstudianteException("se ha modificado el estudiante",true,false,true);
               
        }
    }

}
