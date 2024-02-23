package view;

import controller.OficioController;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Oficios extends javax.swing.JPanel {

    OficioController oficioController = new OficioController();

    public Oficios() {
        initComponents();
        this.cargarTabla();
    }

    private void cargarTabla() {

        try {
            DefaultTableModel tableModel = (DefaultTableModel) tblOficios.getModel();
            oficioController.getOficios("").forEach((oficio) -> tableModel.addRow(new Object[]{
                oficio.getOfi_id(), oficio.getDepen_name(), oficio.getDepen_resp(), oficio.getOfi_asunto(), oficio.getUser_name(), oficio.getOfi_fech_crea(),
                oficio.getOfi_obs(), oficio.getOfi_status()}));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla de oficios" + e);
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
        tblOficios = new javax.swing.JTable();
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
        lblHeader.setText("Relación de Oficios Generados");

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

        tblOficios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblOficios.setForeground(new java.awt.Color(0, 26, 90));
        tblOficios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DEPENDENCIA", "DIRIGIDO A", "ASUNTO", "ELABORADO POR", "F. CREACIÓN", "OBSERVACIONES", "ESTATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOficios.setRowHeight(40);
        tblOficios.getTableHeader().setReorderingAllowed(false);
        tblScroll.setViewportView(tblOficios);
        if (tblOficios.getColumnModel().getColumnCount() > 0) {
            tblOficios.getColumnModel().getColumn(0).setResizable(false);
            tblOficios.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblOficios.getColumnModel().getColumn(1).setResizable(false);
            tblOficios.getColumnModel().getColumn(2).setResizable(false);
            tblOficios.getColumnModel().getColumn(3).setResizable(false);
            tblOficios.getColumnModel().getColumn(4).setResizable(false);
            tblOficios.getColumnModel().getColumn(5).setResizable(false);
            tblOficios.getColumnModel().getColumn(5).setPreferredWidth(20);
            tblOficios.getColumnModel().getColumn(6).setResizable(false);
            tblOficios.getColumnModel().getColumn(7).setResizable(false);
            tblOficios.getColumnModel().getColumn(7).setPreferredWidth(5);
        }

        bckEditar.setBackground(new java.awt.Color(0, 26, 90));

        lblEditar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditar.setText("Cancelar");
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
                                .addComponent(bckEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        FrmAdmin.ShowJPanel(new SetOficios());
    }//GEN-LAST:event_lblNuevoMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        if (tblOficios.getSelectedRow() > -1) {
            try {
                int oficioId = (int) tblOficios.getValueAt(tblOficios.getSelectedRow(), 0);
                FrmAdmin.ShowJPanel(new updOficios(oficioController.getOfiById(oficioId)));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener oficio: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona el oficio a cancelar");
        }
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        Buscar();
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        Buscar();
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void Buscar() {
        String data = txtBuscar.getText();

        try {
            DefaultTableModel tableModel = (DefaultTableModel) tblOficios.getModel();
            tableModel.setRowCount(0);
            oficioController.getOficios(data).forEach((oficio) -> tableModel.addRow(new Object[]{
                oficio.getOfi_id(), oficio.getDepen_name(), oficio.getOfi_asunto(), oficio.getUser_name(),
                oficio.getOfi_fech_crea(), oficio.getOfi_obs()}));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el oficio");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckBuscar;
    private javax.swing.JPanel bckEditar;
    private javax.swing.JPanel bckNuevo;
    private javax.swing.JPanel jPBack;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblNuevo;
    public static javax.swing.JTable tblOficios;
    public static javax.swing.JScrollPane tblScroll;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
