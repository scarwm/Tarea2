/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.RegistroCurso;
import Modelo.RegistroEstudiante;
import Modelo.RegistroProfesor;
import Vista.ConsultaEstudiantes;
import Vista.GUIMatricula;
import Vista.GUIProfesor;
import Vista.ManipulaCursos;
import Vista.ManipulaEstudiantes;
import Vista.Reporte;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControlVentanaPrincipal implements ActionListener {

    private ManipulaEstudiantes manipulaEstudiantes;
    private ManipulaCursos manipulaCursos;
    private Reporte reporte;
    private ConsultaEstudiantes consultaEstudiantes;
    private RegistroEstudiante regis;
    private RegistroCurso registroCurso;
    private GUIMatricula gUIMatricula;
    private GUIProfesor gUIProfesor;
    private RegistroProfesor registroProfesor;
   

    public ControlVentanaPrincipal() {

        regis = new RegistroEstudiante();
        registroCurso = new RegistroCurso();
        registroProfesor= new RegistroProfesor();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {

            System.exit(0);

        }

        if (e.getActionCommand().equalsIgnoreCase("Manipular Estudiantes")) {
            this.manipulaEstudiantes = new ManipulaEstudiantes(regis);
            manipulaEstudiantes.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Reporte Estudiantes")) {
            reporte = new Reporte();
            reporte.getPanelTabla().llenarTabla(regis.getMatriz(), Estudiante.getEtiquetas());
            reporte.show();
        }
        if (e.getActionCommand().equalsIgnoreCase("Consultar Estudiantes")) {

            consultaEstudiantes = new ConsultaEstudiantes();
            if (regis.getInformacionDeEstudiantes().equals("")) {
                JOptionPane.showMessageDialog(null, "no hay estudiantes en lista");
            } else {
                consultaEstudiantes.llenarTextArea(regis.getInformacionDeEstudiantes());
                consultaEstudiantes.show();
            }
        }
        if (e.getActionCommand().equalsIgnoreCase("Manipular Cursos")) {
            this.manipulaCursos=new ManipulaCursos(registroCurso);
            manipulaCursos.show();
        }
        if(e.getActionCommand().equalsIgnoreCase("Matricular Estudiante")){
            this.gUIMatricula=new  GUIMatricula(this.regis,this.registroCurso);
            gUIMatricula.show();
            
        }
        if(e.getActionCommand().equalsIgnoreCase("Administrar Prof")){
            this.gUIProfesor=new GUIProfesor(registroProfesor);
            gUIProfesor.show();
        }
    }
}
