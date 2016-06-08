/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Curso;
import Modelo.CursoException;
import Modelo.RegistroCurso;
import Vista.ManipulaCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControlMantenimientoCursos implements ActionListener {

    public final static int AGREGAR = 1;
    public final static int CONSULTAR = 2;
    public final static int MODIFICAR = 3;
    public final static int ELIMINAR = 4;
    public final static int GUARDAR = 5;

    public ManipulaCursos maniCursos;
    public RegistroCurso regiCursos;

    public ControlMantenimientoCursos(ManipulaCursos manipulaCursos, RegistroCurso registroCurso) {

        this.maniCursos = manipulaCursos;
        this.regiCursos = registroCurso;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.maniCursos.getCodigoPorfuente(ae.getSource());
        try {
            hacerCurso(codigo);
        } catch (CursoException e) {
           this.maniCursos.setMensaje(e.getMessage());
           this.maniCursos.setEditable(e.isSetEditable());
           this.maniCursos.setEnableBo(e.isEnableBoton());
           if (e.isLimpiarInterfaz()==true) {
                maniCursos.limpiar();
            } 
            
        }

    }

    public void hacerCurso(int codigo) throws CursoException {
        switch (codigo) {
            case AGREGAR:
                if (maniCursos.verificar() != true) {
                    Curso curso = new Curso(maniCursos.getjTextNombre(), maniCursos.getjTextSiglas(), maniCursos.getjTextCreditos());
                    if (regiCursos.verificarCurso(curso.getSiglas()) == false) {
                        regiCursos.addCurso(curso);
                        throw new CursoException("se agregó con éxito", true);
                    } else {
                        throw new CursoException("ya existe el curso", true);
                    }
                } else {
                    throw new CursoException("Ingrese los datos correspondientes", false);
                }

            case CONSULTAR:

                break;

            case MODIFICAR:
                if (maniCursos.getjTextSiglas().equals("")) {
                    throw new CursoException("debe ingresar solo las siglas del curso", true);
                } else {

                    Curso cur = regiCursos.buscarCurso(maniCursos.getjTextSiglas());
                    if (cur != null) {
                        maniCursos.setjTextNombre(cur.getNombre());
                        maniCursos.setjTextSiglas(cur.getSiglas());
                        maniCursos.setjTextCreditos(cur.getCreditos());
                        throw new CursoException("puede editar los datos", false, false, true);
                    } else {
                        throw new CursoException("el curso no existe", true);
                    }

                }
            case GUARDAR:
                Curso curso1 = new Curso(maniCursos.getjTextNombre(), maniCursos.getjTextSiglas(), maniCursos.getjTextCreditos());
                regiCursos.modificar(curso1);
                throw new CursoException("se guardo con exito", true, true, false);

            case ELIMINAR:
                if (maniCursos.getjTextSiglas().equals("")) {
                    throw new CursoException("ingrese solo las siglas del curso", true);
                } else {

                    Curso cur = regiCursos.buscarCurso(maniCursos.getjTextSiglas());
                    if (cur != null) {

                        regiCursos.deletCurso(cur);
                        throw new CursoException("se ha eliminado el curso", true);

                    } else {
                        throw new CursoException("no existe el curso", true);

                    }
                }
        }
    }
}
