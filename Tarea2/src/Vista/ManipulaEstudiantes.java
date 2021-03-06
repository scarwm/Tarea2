/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorMantenimientoEstudiate;
import Modelo.RegistroEstudiante;
import javax.swing.JTextField;

/**
 *
 * @author Scarlett
 */
public class ManipulaEstudiantes extends javax.swing.JFrame {

    private ControladorMantenimientoEstudiate cme;
    

    public ManipulaEstudiantes(RegistroEstudiante regis) {
        initComponents();
        cme = new ControladorMantenimientoEstudiate(this, regis);
        this.guiBotones1.agregarEvento(cme);
    }

    public int getCodigoPorFuente(Object object) {
        int dev = 0;

        dev = this.guiBotones1.getCodigoPorFuente(object);
          return dev ;
    }

  


public void setTexCarnet(String texCarnet) {
        this.texCarnet.setText(texCarnet);
    }

    public void setTexCorreo(String texCorreo) {
        this.texCorreo.setText(texCorreo);
    }

    public void setTexNombre(String texNombre) {
        this.texNombre.setText(texNombre);
    }

    public String getTexCarnet() {
        return this.texCarnet.getText().toString();
    }

    public String getTexCorreo() {
        return this.texCorreo.getText().toString();
    }

    public String getTexNombre() {
        return this.texNombre.getText().toString();
    }

    public boolean verificar() {
        if ((this.texCarnet.getText().equals("") || this.texCorreo.getText().equals("")) || this.texCorreo.getText().equals("")) {
        
          return true;
        } 
            
        return false;
    }
     public boolean verificarTexCarnet() {
        if (this.texCarnet.getText().equals("")){
        
          return true;
        } 
            
        return false;
    }
     
     public void setEditable(boolean re){
         this.texCarnet.setEditable(re);
     }
   
     public void setMensaje(String mensaje){
         this.mensajeLabel.setText(mensaje);
     }
     

    public void limpiar() {
        this.texCarnet.setText("");
        this.texNombre.setText("");
        this.texCorreo.setText("");
    }
    
    public void enableBoton(boolean re){
        this.guiBotones1.setBoton(re);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiBotones1 = new Vista.GuiBotones();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texCarnet = new javax.swing.JTextField();
        texNombre = new javax.swing.JTextField();
        texCorreo = new javax.swing.JTextField();
        mensajeLabel = new javax.swing.JLabel();

        jLabel1.setText("Carnet");

        jLabel2.setText("Nombre");

        jLabel3.setText("Correo");

        texCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texCarnetActionPerformed(evt);
            }
        });

        texNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(texCarnet)
                    .addComponent(texNombre)
                    .addComponent(texCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(texCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(texNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(texCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(mensajeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiBotones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texCarnetActionPerformed

    private void texNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texNombreActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GuiBotones guiBotones1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JTextField texCarnet;
    private javax.swing.JTextField texCorreo;
    private javax.swing.JTextField texNombre;
    // End of variables declaration//GEN-END:variables
}
