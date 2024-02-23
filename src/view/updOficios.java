package view;

import controller.OficioController;
import model.OficioModel;
import java.awt.Color;
import javax.swing.JOptionPane;

public class updOficios extends javax.swing.JPanel {
    
    int idOfi = 0;
    OficioController oficioController = new OficioController();
    OficioModel oficio = new OficioModel();

    public updOficios(OficioModel oficio) {
        initComponents();
        setVisible(true);
        
        idOfi = oficio.getOfi_id();
        lblId.setText(String.valueOf(idOfi));
        txtDependencia.setText(oficio.getDepen_name());
        txtResponsable.setText(oficio.getDepen_resp());
        txtAsunto.setText(oficio.getOfi_asunto());
        txtJefatura.setText(oficio.getUser_name());
        txtCreacion.setText(oficio.getOfi_fech_crea());
        txtStatus.setText(oficio.getOfi_status());
        txtObs.setText(oficio.getOfi_obs());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJefatura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bckGuardar = new javax.swing.JPanel();
        lblCancela = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bckCancelar = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtDependencia = new javax.swing.JTextField();
        txtCreacion = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();

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
        lblHeader.setText("Cancelación de Oficio :");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 26, 90));
        jLabel1.setText("Asunto del Oficio");

        txtResponsable.setEditable(false);
        txtResponsable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtResponsable.setForeground(new java.awt.Color(0, 26, 90));
        txtResponsable.setEnabled(false);
        txtResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsableActionPerformed(evt);
            }
        });
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResponsableKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 26, 90));
        jLabel2.setText("Dependencia");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 26, 90));
        jLabel3.setText("Elaborado por:");

        txtAsunto.setEditable(false);
        txtAsunto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(0, 26, 90));
        txtAsunto.setEnabled(false);
        txtAsunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAsuntoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 26, 90));
        jLabel4.setText("Dirigido  a:");

        txtJefatura.setEditable(false);
        txtJefatura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtJefatura.setForeground(new java.awt.Color(0, 26, 90));
        txtJefatura.setEnabled(false);
        txtJefatura.setNextFocusableComponent(txtResponsable);
        txtJefatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJefaturaActionPerformed(evt);
            }
        });
        txtJefatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJefaturaKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 26, 90));
        jLabel5.setText("Fecha de Creación");

        bckGuardar.setBackground(new java.awt.Color(0, 26, 90));
        bckGuardar.setPreferredSize(new java.awt.Dimension(350, 40));

        lblCancela.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCancela.setForeground(new java.awt.Color(255, 255, 255));
        lblCancela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCancela.setText("Cancelar Oficio");
        lblCancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCancela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCancelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCancelaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckGuardarLayout = new javax.swing.GroupLayout(bckGuardar);
        bckGuardar.setLayout(bckGuardarLayout);
        bckGuardarLayout.setHorizontalGroup(
            bckGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bckGuardarLayout.setVerticalGroup(
            bckGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        bckCancelar.setBackground(new java.awt.Color(255, 0, 0));
        bckCancelar.setPreferredSize(new java.awt.Dimension(350, 40));

        lblSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        lblSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblSalirKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout bckCancelarLayout = new javax.swing.GroupLayout(bckCancelar);
        bckCancelar.setLayout(bckCancelarLayout);
        bckCancelarLayout.setHorizontalGroup(
            bckCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckCancelarLayout.createSequentialGroup()
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bckCancelarLayout.setVerticalGroup(
            bckCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblStatus.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 26, 90));
        lblStatus.setText("Estatus del Oficio");

        txtStatus.setEditable(false);
        txtStatus.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 26, 90));
        txtStatus.setEnabled(false);
        txtStatus.setNextFocusableComponent(txtResponsable);
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        txtStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStatusKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 26, 90));
        jLabel7.setText("Motivo de Cancelación");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        txtDependencia.setEditable(false);
        txtDependencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDependencia.setForeground(new java.awt.Color(0, 26, 90));
        txtDependencia.setEnabled(false);
        txtDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDependenciaActionPerformed(evt);
            }
        });
        txtDependencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDependenciaKeyPressed(evt);
            }
        });

        txtCreacion.setEditable(false);
        txtCreacion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCreacion.setForeground(new java.awt.Color(0, 26, 90));
        txtCreacion.setEnabled(false);
        txtCreacion.setNextFocusableComponent(txtResponsable);
        txtCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreacionActionPerformed(evt);
            }
        });
        txtCreacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCreacionKeyPressed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 26, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtJefatura)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblHeader)
                            .addGap(18, 18, 18)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(txtResponsable)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)
                        .addComponent(txtAsunto)
                        .addComponent(jLabel4)
                        .addComponent(txtDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(bckCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bckGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblStatus)
                    .addComponent(txtStatus)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeader)
                            .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bckCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bckGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJefatura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCancelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelaMouseEntered
        bckGuardar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblCancelaMouseEntered

    private void lblCancelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelaMouseExited
        // TODO add your handling code here:
        bckGuardar.setBackground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblCancelaMouseExited
    private void lblCancelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelaMouseClicked
        updOficio();
    }//GEN-LAST:event_lblCancelaMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        // TODO add your handling code here:
        FrmAdmin.ShowJPanel(new Oficios());
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSalirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirKeyPressed

    private void txtResponsableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
        }
    }//GEN-LAST:event_txtResponsableKeyPressed

    private void txtResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResponsableActionPerformed

    private void txtJefaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJefaturaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtResponsable.requestFocus();
        }
    }//GEN-LAST:event_txtJefaturaKeyPressed

    private void txtJefaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJefaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJefaturaActionPerformed

    private void txtAsuntoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAsuntoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
        }
    }//GEN-LAST:event_txtAsuntoKeyPressed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStatusKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusKeyPressed

    private void txtDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDependenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDependenciaActionPerformed

    private void txtDependenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDependenciaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDependenciaKeyPressed

    private void txtCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreacionActionPerformed

    private void txtCreacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCreacionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreacionKeyPressed

//    Método para Cancelar oficio
    private void updOficio() {
        //Validar campos vacios
        if (txtObs.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario ingresar el motivo de cancelación");
            return;
        }
        oficio.setOfi_id(idOfi);
        oficio.setOfi_obs(txtObs.getText().trim());

        try {
            oficioController.updOficio(oficio);

            JOptionPane.showMessageDialog(null, "Oficio cancelado correctamente");
            FrmAdmin.ShowJPanel(new Oficios());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cancelar oficio: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckCancelar;
    private javax.swing.JPanel bckGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCancela;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtCreacion;
    private javax.swing.JTextField txtDependencia;
    private javax.swing.JTextField txtJefatura;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
