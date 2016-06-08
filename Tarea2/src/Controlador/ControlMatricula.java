/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.Matricula;
import Modelo.RegistroCurso;
import Modelo.RegistroEstudiante;
import Modelo.RegistroMatricula;
import Vista.GUIMatricula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControlMatricula implements ActionListener {

    private GUIMatricula guimatricula;
    private RegistroCurso rc;
    private RegistroEstudiante re;
    private RegistroMatricula regiMa;

    public ControlMatricula(GUIMatricula gUIMatricula, RegistroEstudiante registroEstudiante, RegistroCurso registroCurso) {
        this.guimatricula = gUIMatricula;
        this.re = registroEstudiante;
        this.rc = registroCurso;
        this.regiMa= new RegistroMatricula();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equalsIgnoreCase("Asignar")) {

            Curso curso = rc.buscarCurso(guimatricula.getjTSiglas());
            if (curso == null) {
                JOptionPane.showMessageDialog(null, "no existe el curso");

            } else {

                Estudiante estudiante = re.buscarEstudiante(guimatricula.getjTCarnetEstu());
                if (estudiante == null) {

                    JOptionPane.showMessageDialog(null, "no existe el estudiante");

                } else {
                    Matricula matricula = new Matricula(guimatricula.getjTCarnetEstu(), guimatricula.getjTSiglas());
                   
                    JOptionPane.showMessageDialog(null," "+ regiMa.agregar_matricula(matricula));
                }

            }
        }
    }
}
