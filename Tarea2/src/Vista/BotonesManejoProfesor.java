/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControlGuiProf;
import javax.swing.JButton;

/**
 *
 * @author Scarlett
 */
public class BotonesManejoProfesor extends javax.swing.JPanel {

    /**
     * Creates new form BotonesManejoProfesor
     */
    public BotonesManejoProfesor() {
        initComponents();
    }
    public void agregarEvento(ControlGuiProf controlGuiProf){
        this.bAgregar.addActionListener(controlGuiProf);
        this.bAsignar.addActionListener(controlGuiProf);
        this.bEliminar.addActionListener(controlGuiProf);
        this.bModificar.addActionListener(controlGuiProf);
        this.bBuscar.addActionListener(controlGuiProf);
    }
    
    
    public int getCodigoPorFuente(Object object){
        int dev=0;
        if(this.bAgregar.equals(object)){
            dev=ControlGuiProf.AGREGAR;
        }else if (this.bAsignar.equals(object)) {
            dev=ControlGuiProf.ASIGNAR;
        }else if(this.bEliminar.equals(object)){
            dev=ControlGuiProf.ELIMINAR;
        }else if (this.bModificar.equals(object)) {
            dev=ControlGuiProf.MODIFICAR;
        }else if(this.bBuscar.equals(object)){
            dev=ControlGuiProf.BUSCAR;
        }
        return dev;
    }

    public JButton getbModificar() {
        return bModificar;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAgregar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bAsignar = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();

        bAgregar.setText("Agregar");

        bModificar.setText("Modificar");
        bModificar.setEnabled(false);

        bEliminar.setText("Eliminar");

        bAsignar.setText("Asignar Curso");

        bBuscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(bEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAsignar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(bAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bModificar)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregar)
                    .addComponent(bModificar)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAsignar)
                    .addComponent(bEliminar))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bAsignar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bModificar;
    // End of variables declaration//GEN-END:variables
}
