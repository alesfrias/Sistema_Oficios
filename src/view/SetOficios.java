package view;

import controller.DependenciaController;
import controller.OficioController;
import model.OficioModel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SetOficios extends javax.swing.JPanel {

    OficioController oficioController = new OficioController();
    OficioModel oficio = new OficioModel();
    DependenciaController dependencia = new DependenciaController();

    public SetOficios() {
        initComponents();
        setVisible(true);
        cargarDependencias(cmbDependencia);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbDependencia = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJefatura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bckGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bckCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtFecha = new com.toedter.calendar.JDateChooser();

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
        lblHeader.setText("Alta de Oficio");

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

        cmbDependencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Dependencia" }));
        cmbDependencia.setNextFocusableComponent(txtJefatura);
        cmbDependencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDependenciaItemStateChanged(evt);
            }
        });
        cmbDependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDependenciaActionPerformed(evt);
            }
        });
        cmbDependencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbDependenciaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 26, 90));
        jLabel3.setText("Elaborado por:");

        txtAsunto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(0, 26, 90));
        txtAsunto.setNextFocusableComponent(cmbDependencia);
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

        javax.swing.GroupLayout bckGuardarLayout = new javax.swing.GroupLayout(bckGuardar);
        bckGuardar.setLayout(bckGuardarLayout);
        bckGuardarLayout.setHorizontalGroup(
            bckGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        lblCancelar.setText("Salir");
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

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 26, 90));
        jLabel7.setText("Observaciones");

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        txtFecha.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJefatura)
                    .addComponent(jLabel3)
                    .addComponent(lblHeader)
                    .addComponent(jLabel2)
                    .addComponent(cmbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsable)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(txtAsunto)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(bckCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bckGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lblHeader)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bckCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bckGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        bckGuardar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        // TODO add your handling code here:
        bckGuardar.setBackground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblGuardarMouseExited
    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        GuardarOficio();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        FrmAdmin.ShowJPanel(new Oficios());
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

    private void cmbDependenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbDependenciaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtJefatura.requestFocus();
        }
    }//GEN-LAST:event_cmbDependenciaKeyPressed

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
            cmbDependencia.requestFocus();
        }
    }//GEN-LAST:event_txtAsuntoKeyPressed

    private void cmbDependenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDependenciaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDependenciaItemStateChanged

    private void cmbDependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDependenciaActionPerformed
        try {
            String depen = cmbDependencia.getSelectedItem().toString();
            cargarResponsable(depen);
        } catch (Exception ex) {
            Logger.getLogger(SetOficios.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cmbDependenciaActionPerformed

//    Método para guardar y Actualizar oficio
    private void GuardarOficio() {
        //Validar campos vacios
        String fecha = ((JTextField) txtFecha.getDateEditor().getUiComponent()).getText();
        if (cmbDependencia.getSelectedIndex() == 0 || txtAsunto.getText().isEmpty()
                || txtJefatura.getText().isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Es necesario ingresar todos los datos");
            return;
        }
        oficio.setDepen_name(cmbDependencia.getSelectedItem().toString());
        oficio.setOfi_asunto(txtAsunto.getText().trim());
        oficio.setUser_name(txtJefatura.getText().trim());
        oficio.setOfi_fech_crea(fecha);
        oficio.setOfi_obs(txtObs.getText().trim());

        try {
            oficioController.addOficio(oficio);

            JOptionPane.showMessageDialog(null, "Oficio agregado correctamente");
            FrmAdmin.ShowJPanel(new Oficios());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar oficio: " + e);
        }
    }

//Llenar Combo de dependencia
    private void cargarDependencias(JComboBox cmbDependencia) {
//    private void cargarDependencias(JComboBox cmbDependencia) {
        try {
            dependencia.getDependencia(cmbDependencia);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar las dependencias en el menú desplegable" + e);
        }
    }

    //Llenar campo de responsable de dependencia
    private void cargarResponsable(String depen) throws Exception {
        DependenciaController resp = new DependenciaController();
        txtResponsable.setText(resp.getDepenByName(depen).getDepen_resp());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckCancelar;
    private javax.swing.JPanel bckGuardar;
    private javax.swing.JComboBox<String> cmbDependencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtAsunto;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtJefatura;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtResponsable;
    // End of variables declaration//GEN-END:variables
}
