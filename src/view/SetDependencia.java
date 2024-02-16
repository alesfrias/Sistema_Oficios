package view;

import controller.DependenciaController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.DependenciaModel;

public class SetDependencia extends javax.swing.JPanel {
    
    boolean upd = false;
    DependenciaModel depenUpdate;
    
    public SetDependencia() {
        initComponents();
        initUpdate();
        setVisible(true);
    }
    
    public SetDependencia(DependenciaModel dependencia) {
        initComponents();
        upd = true;
        depenUpdate = dependencia;
        initUpdate();
        setVisible(true);
    }
    
    private void initUpdate() {
        if (upd) {
            lblHeader.setText("Editar Dependencia");
            lblGuardar.setText("Actualizar");
            
            if (depenUpdate != null) {
                txtNombre.setText(depenUpdate.getDepen_name());
                txtResponsable.setText(depenUpdate.getDepen_resp());
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        bckGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bckCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(995, 559));
        setMinimumSize(new java.awt.Dimension(995, 559));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 26, 90));
        lblHeader.setText("Alta de Dependencia");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 26, 90));
        jLabel1.setText("Nombre de la Dependencia");

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 26, 90));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        bckGuardar.setBackground(new java.awt.Color(0, 26, 90));
        bckGuardar.setPreferredSize(new java.awt.Dimension(350, 40));

        lblGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuardar.setText("Guardar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });
        lblGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblGuardarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout bckGuardarLayout = new javax.swing.GroupLayout(bckGuardar);
        bckGuardar.setLayout(bckGuardarLayout);
        bckGuardarLayout.setHorizontalGroup(
            bckGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckGuardarLayout.createSequentialGroup()
                .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bckGuardarLayout.setVerticalGroup(
            bckGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bckCancelar.setBackground(new java.awt.Color(255, 0, 0));
        bckCancelar.setPreferredSize(new java.awt.Dimension(350, 40));

        lblCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCancelar.setForeground(new java.awt.Color(255, 255, 255));
        lblCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancelar.setText("Cancelar");
        lblCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelarMouseExited(evt);
            }
        });
        lblCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblCancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout bckCancelarLayout = new javax.swing.GroupLayout(bckCancelar);
        bckCancelar.setLayout(bckCancelarLayout);
        bckCancelarLayout.setHorizontalGroup(
            bckCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckCancelarLayout.createSequentialGroup()
                .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bckCancelarLayout.setVerticalGroup(
            bckCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 26, 90));
        jLabel2.setText("Nombre del Responsable");

        txtResponsable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtResponsable.setForeground(new java.awt.Color(0, 26, 90));
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResponsableKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblHeader)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(txtResponsable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(bckCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bckGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(506, 506, 506))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeader)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bckGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bckCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        bckGuardar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        bckGuardar.setBackground(new Color(0, 26, 90));

    }//GEN-LAST:event_lblGuardarMouseExited

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            GuardarDependencia();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        GuardarDependencia();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void lblGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblGuardarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtResponsable.requestFocus();
        }
    }//GEN-LAST:event_lblGuardarKeyPressed

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        FrmAdmin.ShowJPanel(new Dependencias());
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void lblCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelarMouseEntered

    private void lblCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelarMouseExited

    private void lblCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCancelarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancelarKeyPressed

    private void txtResponsableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER) {
            GuardarDependencia();
        }
    }//GEN-LAST:event_txtResponsableKeyPressed
//    Método para guardar y Actualizar Usuario

    private void GuardarDependencia() {
        //Validar campos vacios
        String depenName = txtNombre.getText();
        String depenResp = txtResponsable.getText();
        
        if (depenName.isEmpty() || depenResp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario ingresar todos los datos");
            return;
        }
        
        DependenciaModel dependencia = upd ? depenUpdate : new DependenciaModel();
        dependencia.setDepen_name(txtNombre.getText().trim());
        dependencia.setDepen_resp(txtResponsable.getText().trim());
        
        try {
            DependenciaController depenController = new DependenciaController();
            if (!upd) {
                depenController.addDependencia(dependencia);
            } else {
                depenController.updDependencia(dependencia);
            }
            String successMsg = upd ? "actualizada" : "registrada";
            JOptionPane.showMessageDialog(null, "Dependencia " + successMsg + " correctamente ");
            FrmAdmin.ShowJPanel(new Dependencias());
            
        } catch (Exception e) {
            String errorMsg = upd ? "editar" : "registrar";
            JOptionPane.showMessageDialog(null, "Error al " + errorMsg + " la dependencia: " + e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckCancelar;
    private javax.swing.JPanel bckGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
