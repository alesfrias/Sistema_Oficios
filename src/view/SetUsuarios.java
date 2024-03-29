package view;

import controller.DepartamentoController;
import controller.UsuarioController;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.UsuarioModel;

/**
 *
 * @author Ing. Alex Espejel
 */
public class SetUsuarios extends javax.swing.JPanel {

    boolean upd = false;
    UsuarioModel userUpdate;

    public SetUsuarios() {
        initComponents();
        initUpdate();
        setVisible(true);
        cargarJefaturas(cmbArea);
    }

    public SetUsuarios(UsuarioModel usuario) {
        initComponents();
        upd = true;
        userUpdate = usuario;
        initUpdate();
        setVisible(true);
        cargarJefaturas(cmbArea);
    }

    private void initUpdate() {
        if (upd) {
            lblHeader.setText("Editar Usuario");
            lblGuardar.setText("Actualizar Usuario");

            if (userUpdate != null) {
                txtNombre.setText(userUpdate.getUser_name());
                txtRfc.setText(userUpdate.getUser_rfc());
                txtContraseña.setText(userUpdate.getUser_pwd());
                cmbRol.setSelectedItem(userUpdate.getUser_rol());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbArea = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        bckGuardar = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bckCancelar = new javax.swing.JPanel();
        lblCancelar = new javax.swing.JLabel();

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
        lblHeader.setText("Alta de Usuario");

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 26, 90));
        jLabel1.setText("Nombre Completo");

        txtContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(0, 26, 90));
        txtContraseña.setNextFocusableComponent(cmbRol);
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 26, 90));
        jLabel2.setText("Departamento");

        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Jefatura" }));
        cmbArea.setNextFocusableComponent(txtRfc);
        cmbArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbAreaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 26, 90));
        jLabel3.setText("R.F.C");

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 26, 90));
        txtNombre.setNextFocusableComponent(cmbArea);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 26, 90));
        jLabel4.setText("Contraseña");

        txtRfc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtRfc.setForeground(new java.awt.Color(0, 26, 90));
        txtRfc.setNextFocusableComponent(txtContraseña);
        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });
        txtRfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRfcKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 26, 90));
        jLabel5.setText("Tipo de Usuario");

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Perfil de Usuario", "Administrador", "Normal" }));
        cmbRol.setNextFocusableComponent(lblGuardar);
        cmbRol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbRolKeyPressed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblHeader)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtContraseña)
                    .addComponent(jLabel5)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bckCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bckGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeader)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bckCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bckGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(180, 180, 180))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcActionPerformed

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        bckGuardar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        // TODO add your handling code here:
        bckGuardar.setBackground(new Color(0, 26, 90));

    }//GEN-LAST:event_lblGuardarMouseExited

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cmbArea.requestFocus();
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    private void cmbAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbAreaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtRfc.requestFocus();
        }
    }//GEN-LAST:event_cmbAreaKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cmbRol.requestFocus();
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void txtRfcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtContraseña.requestFocus();
        }
    }//GEN-LAST:event_txtRfcKeyPressed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        GuardarUsuario();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void cmbRolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRolKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
        FrmAdmin.ShowJPanel(new Usuarios());
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
//    Método para guardar y Actualizar Usuario

    private void GuardarUsuario() {
        //Validar campos vacios
        if (txtNombre.getText().isEmpty() || txtRfc.getText().isEmpty()
                || txtContraseña.getText().isEmpty() || cmbArea.getSelectedIndex() == 0
                || cmbRol.getSelectedIndex()== 0) {
            JOptionPane.showMessageDialog(null, "Es necesario ingresar todos los datos");
            return;
        }

         UsuarioModel usuario = upd ? userUpdate : new UsuarioModel();
        usuario.setUser_name(txtNombre.getText().trim());
        usuario.setDepto_id(cmbArea.getSelectedIndex());
        usuario.setUser_pwd(txtContraseña.getText().trim());
        usuario.setUser_rol(cmbRol.getSelectedItem().toString());

        try {
            UsuarioController usuarioController = new UsuarioController();

            if (!upd) {
                usuarioController.addUser(usuario);

            } else {
                usuarioController.updUser(usuario);

            }
            String successMsg = upd ? "actualizado" : "registrado";
            JOptionPane.showMessageDialog(null, "Usuario " + successMsg + " correctamente");
            FrmAdmin.ShowJPanel(new Usuarios());

        } catch (Exception e) {
            String errorMsg = upd ? "editar" : "registrar";
            JOptionPane.showMessageDialog(null, "Error al " + errorMsg + " usuario" + e);
        }
    }
//Llenar Combo de jefatura
    private void cargarJefaturas(JComboBox cmbJefatura) {
        try {
            DepartamentoController departamento = new DepartamentoController();
            departamento.getJefatura(cmbJefatura);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar las jefaturas en el menú desplegable" + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckCancelar;
    private javax.swing.JPanel bckGuardar;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}
