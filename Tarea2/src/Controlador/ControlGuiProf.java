/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Profesor;
import Modelo.ProfesorException;
import Modelo.RegistroProfesor;
import Vista.GUIProfesor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sun.net.www.content.image.gif;

/**
 *
 * @author Scarlett
 */
public class ControlGuiProf implements ActionListener {

    public final static int AGREGAR = 1;
    public final static int MODIFICAR = 2;
    public final static int ELIMINAR = 3;
    public final static int ASIGNAR = 4;
    public final static int BUSCAR = 5;

    private GUIProfesor guip;
    private RegistroProfesor rp;

    public ControlGuiProf(GUIProfesor gUIProfesor, RegistroProfesor registroProfesor) {
        this.guip = gUIProfesor;
        this.rp = registroProfesor;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = guip.getCodigoPorFuente(ae.getSource());
        try {
            hacerProceso(codigo);

        } catch (ProfesorException e) {
            this.guip.setLabelMessage(e.getMessage());
            if (e.isLimpiarInterfaz() == true) {
                this.guip.limpiar();
            }

        } 

    }

    public void hacerProceso(int codigo) throws ProfesorException {
        switch (codigo) {
            case AGREGAR:
                if (guip.verificar() == false) {
                    Profesor profesor = new Profesor(guip.getjTxtNombre(), guip.getjTxtCedula(), guip.getjTxtCorreo(), guip.getjTxtHorario());
                    if (rp.verificarProfesor(profesor.getCedula()) == true) {
                        throw new ProfesorException("El profesor ya se encuentra registrado", true);
                    } else {
                        rp.agregarProfesor(profesor);
                        JOptionPane.showMessageDialog(null, "se agrego el profesor");
                        guip.limpiar();
                    }
                } else {
                    throw new ProfesorException("procure llenar los datos que se le solicita", false);
                }
                break;
            case MODIFICAR:
                if (guip.verificar() == true) {
                    throw new ProfesorException("los datos están incompletos", false);

                } else {
                    Profesor prof = new Profesor(guip.getjTxtNombre(), guip.getjTxtCedula(), guip.getjTxtCorreo(), guip.getjTxtHorario());
                    rp.modificar(prof);
                    guip.limpiar();
                    guip.setEditaCedu(true);
                    guip.setBotonModi(false);
                }

                break;
            case ELIMINAR:
                if (guip.verificarCampoCedula() == true) {
                    throw new ProfesorException("ingrese el numero de cedula", false);
                } else if (rp.verificarProfesor(guip.getjTxtCedula()) == true) {
                    rp.eliminar(guip.getjTxtCedula());
                    JOptionPane.showMessageDialog(null, "se elimino el profesor");
                    guip.limpiar();
                } else {
                    throw new ProfesorException("el profesor no existe", true);
                }
                break;
            case ASIGNAR:
                break;
            case BUSCAR:
                if (guip.verificarCampoCedula() == true) {
                    throw new ProfesorException("ingrese el numero de cedula", false);

                } else if (rp.verificarProfesor(guip.getjTxtCedula()) == false) {
                    throw new ProfesorException("no existe el, profesor", true);

                  

                } else {  Profesor profesor1 = rp.buscarProfesor(guip.getjTxtCedula());

                    guip.setjTxtNombre(profesor1.getNombre());
                    guip.setjTxtCorreo(profesor1.getCorreo());
                    guip.setjTxtHorario(profesor1.getHorario());
                    guip.setEditaCedu(false);
                    guip.setBotonModi(true);
                }
                break;

        }
    }

}
