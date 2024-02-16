package view;

import controller.DependenciaController;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Dependencias extends javax.swing.JPanel {

    public Dependencias() {
        initComponents();
        this.cargarTabla();
    }

    private void cargarTabla() {

        try {
            DependenciaController depenController = new DependenciaController();
            DefaultTableModel tableModel = (DefaultTableModel) tblDependencias.getModel();
            depenController.getDependencias("").forEach((dependencia) -> tableModel.addRow(new Object[]{
            dependencia.getDepen_id(), dependencia.getDepen_name(), dependencia.getDepen_resp()}));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla de dependencias: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBack = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        bckBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        tblScroll = new javax.swing.JScrollPane();
        tblDependencias = new javax.swing.JTable();
        bckBorrar = new javax.swing.JPanel();
        lblBorrar = new javax.swing.JLabel();
        bckEditar = new javax.swing.JPanel();
        lblEditar = new javax.swing.JLabel();
        bckNuevo = new javax.swing.JPanel();
        lblNuevo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(995, 559));
        setMinimumSize(new java.awt.Dimension(995, 559));
        setPreferredSize(new java.awt.Dimension(995, 559));

        jPBack.setBackground(new java.awt.Color(255, 255, 255));

        lblHeader.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 26, 90));
        lblHeader.setText("Dependencias");

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 26, 90));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        bckBuscar.setBackground(new java.awt.Color(0, 26, 90));

        lblBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckBuscarLayout = new javax.swing.GroupLayout(bckBuscar);
        bckBuscar.setLayout(bckBuscarLayout);
        bckBuscarLayout.setHorizontalGroup(
            bckBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bckBuscarLayout.setVerticalGroup(
            bckBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblDependencias.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblDependencias.setForeground(new java.awt.Color(0, 26, 90));
        tblDependencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DEPENDENCIA", "RESPONSABLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDependencias.setRowHeight(40);
        tblDependencias.getTableHeader().setReorderingAllowed(false);
        tblScroll.setViewportView(tblDependencias);
        if (tblDependencias.getColumnModel().getColumnCount() > 0) {
            tblDependencias.getColumnModel().getColumn(0).setResizable(false);
            tblDependencias.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDependencias.getColumnModel().getColumn(1).setResizable(false);
            tblDependencias.getColumnModel().getColumn(1).setPreferredWidth(265);
            tblDependencias.getColumnModel().getColumn(2).setResizable(false);
            tblDependencias.getColumnModel().getColumn(2).setPreferredWidth(265);
        }

        bckBorrar.setBackground(new java.awt.Color(0, 26, 90));

        lblBorrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblBorrar.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrar.setText("Borrar");
        lblBorrar.setPreferredSize(new java.awt.Dimension(137, 40));
        lblBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBorrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckBorrarLayout = new javax.swing.GroupLayout(bckBorrar);
        bckBorrar.setLayout(bckBorrarLayout);
        bckBorrarLayout.setHorizontalGroup(
            bckBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bckBorrarLayout.setVerticalGroup(
            bckBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bckEditar.setBackground(new java.awt.Color(0, 26, 90));

        lblEditar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Editar");
        lblEditar.setPreferredSize(new java.awt.Dimension(137, 40));
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEditarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckEditarLayout = new javax.swing.GroupLayout(bckEditar);
        bckEditar.setLayout(bckEditarLayout);
        bckEditarLayout.setHorizontalGroup(
            bckEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bckEditarLayout.setVerticalGroup(
            bckEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bckNuevo.setBackground(new java.awt.Color(0, 26, 90));

        lblNuevo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevo.setText("Nuevo");
        lblNuevo.setPreferredSize(new java.awt.Dimension(137, 40));
        lblNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckNuevoLayout = new javax.swing.GroupLayout(bckNuevo);
        bckNuevo.setLayout(bckNuevoLayout);
        bckNuevoLayout.setHorizontalGroup(
            bckNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bckNuevoLayout.setVerticalGroup(
            bckNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPBackLayout = new javax.swing.GroupLayout(jPBack);
        jPBack.setLayout(jPBackLayout);
        jPBackLayout.setHorizontalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addComponent(lblHeader)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackLayout.createSequentialGroup()
                        .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPBackLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bckNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bckEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bckBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPBackLayout.createSequentialGroup()
                                .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPBackLayout.createSequentialGroup()
                                .addComponent(txtBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(bckBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPBackLayout.setVerticalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bckBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bckBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bckEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bckNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseEntered
        bckBuscar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblBuscarMouseEntered

    private void lblBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseExited
        bckBuscar.setBackground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblBuscarMouseExited

    private void lblBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseEntered
        bckBorrar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblBorrarMouseEntered

    private void lblBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseExited
        bckBorrar.setBackground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblBorrarMouseExited

    private void lblEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseEntered
        bckEditar.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblEditarMouseEntered

    private void lblEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseExited
        bckEditar.setBackground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblEditarMouseExited

    private void lblNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoMouseEntered
        bckNuevo.setBackground(new Color(0, 80, 196));
    }//GEN-LAST:event_lblNuevoMouseEntered

    private void lblNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoMouseExited
        bckNuevo.setBackground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblNuevoMouseExited

    private void lblNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoMouseClicked
        FrmAdmin.ShowJPanel(new SetDependencia());
    }//GEN-LAST:event_lblNuevoMouseClicked

    private void lblBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarMouseClicked
        if (tblDependencias.getSelectedRow() > -1) {

            int borrar = JOptionPane.showConfirmDialog(null, "¿Realmente deseas eliminar el registro?", "ELIMINAR DEPENDENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE/*, icono*/);

            if (borrar == 0) {

                DependenciaController depenController = new DependenciaController();
                DefaultTableModel tableModel = (DefaultTableModel) tblDependencias.getModel();

                for (int i : tblDependencias.getSelectedRows()) {
                    try {
                        depenController.delDependencia((int) tblDependencias.getValueAt(i, 0));
                        tableModel.removeRow(i);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al eliminar dependencia: " + e);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona la dependencia a eliminar");
        }
    }//GEN-LAST:event_lblBorrarMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        if (tblDependencias.getSelectedRow() > -1) {
            try {
                int depenId = (int) tblDependencias.getValueAt(tblDependencias.getSelectedRow(), 0);
                DependenciaController depenController = new DependenciaController();
                FrmAdmin.ShowJPanel(new SetDependencia(depenController.getDepenById(depenId)));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar la dependencia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona la dependencia a editar");
        }
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        Buscar();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        Buscar();
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void Buscar() {
        String dependencia = txtBuscar.getText();

        try {
            DependenciaController depenController = new DependenciaController();
            DefaultTableModel tableModel = (DefaultTableModel) tblDependencias.getModel();
            tableModel.setRowCount(0);
            depenController.getDependencias(dependencia).forEach((depen) -> tableModel.addRow(new Object[]{depen.getDepen_id(), depen.getDepen_name(), depen.getDepen_resp()}));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la dependencia");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckBorrar;
    private javax.swing.JPanel bckBuscar;
    private javax.swing.JPanel bckEditar;
    private javax.swing.JPanel bckNuevo;
    private javax.swing.JPanel jPBack;
    private javax.swing.JLabel lblBorrar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblNuevo;
    public static javax.swing.JTable tblDependencias;
    public static javax.swing.JScrollPane tblScroll;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
