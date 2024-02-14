package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author alex
 */
public class FrmAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdmin
     */
    public FrmAdmin() {
        initComponents();
        setDate();
        ShowJPanel(new Usuarios());

    }

    static void ShowJPanel(JPanel panel) {
        panel.setSize(995, 559);
        panel.setLocation(0, 0);

        jPContent.removeAll();
        jPContent.add(panel, BorderLayout.CENTER);
        jPContent.revalidate();
        jPContent.repaint();
    }
//Icono de formulario

    @Override
    public Image getIconImage() {
        Image iconImage = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/favicon.png"));
        return iconImage;
    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        lblDate.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd' de' MMMM 'de' yyyy", spanishLocale)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBack = new javax.swing.JPanel();
        jPMenu = new javax.swing.JPanel();
        lblUpom = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bckDeptos = new javax.swing.JPanel();
        lblDeptos = new javax.swing.JLabel();
        bckArea = new javax.swing.JPanel();
        lblArea = new javax.swing.JLabel();
        bckOficios = new javax.swing.JPanel();
        lblOficios = new javax.swing.JLabel();
        bckReportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bckSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        bckUsuarios = new javax.swing.JPanel();
        lblUsuarios = new javax.swing.JLabel();
        jPHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Oficios");
        setIconImage(getIconImage());
        setResizable(false);

        jPBack.setBackground(new java.awt.Color(255, 255, 255));

        jPMenu.setBackground(new java.awt.Color(0, 26, 90));
        jPMenu.setPreferredSize(new java.awt.Dimension(200, 700));

        lblUpom.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblUpom.setForeground(new java.awt.Color(255, 255, 255));
        lblUpom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpom.setText("UPOM");

        bckDeptos.setBackground(new java.awt.Color(0, 26, 90));

        lblDeptos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblDeptos.setForeground(new java.awt.Color(255, 255, 255));
        lblDeptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-outline.png"))); // NOI18N
        lblDeptos.setText("Jefaturas");
        lblDeptos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeptos.setIconTextGap(10);
        lblDeptos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeptosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeptosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeptosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckDeptosLayout = new javax.swing.GroupLayout(bckDeptos);
        bckDeptos.setLayout(bckDeptosLayout);
        bckDeptosLayout.setHorizontalGroup(
            bckDeptosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckDeptosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bckDeptosLayout.setVerticalGroup(
            bckDeptosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bckArea.setBackground(new java.awt.Color(0, 26, 90));

        lblArea.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-outline.png"))); // NOI18N
        lblArea.setText("Dependencia");
        lblArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblArea.setIconTextGap(10);
        lblArea.setPreferredSize(new java.awt.Dimension(200, 50));
        lblArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAreaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckAreaLayout = new javax.swing.GroupLayout(bckArea);
        bckArea.setLayout(bckAreaLayout);
        bckAreaLayout.setHorizontalGroup(
            bckAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bckAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bckAreaLayout.setVerticalGroup(
            bckAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        bckOficios.setBackground(new java.awt.Color(0, 26, 90));

        lblOficios.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblOficios.setForeground(new java.awt.Color(255, 255, 255));
        lblOficios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book-open-page-variant.png"))); // NOI18N
        lblOficios.setText("Oficios");
        lblOficios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOficios.setIconTextGap(10);
        lblOficios.setPreferredSize(new java.awt.Dimension(200, 50));
        lblOficios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOficiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOficiosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckOficiosLayout = new javax.swing.GroupLayout(bckOficios);
        bckOficios.setLayout(bckOficiosLayout);
        bckOficiosLayout.setHorizontalGroup(
            bckOficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bckOficiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOficios, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bckOficiosLayout.setVerticalGroup(
            bckOficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOficios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bckReportes.setBackground(new java.awt.Color(0, 26, 90));
        bckReportes.setPreferredSize(new java.awt.Dimension(200, 50));

        lblReportes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file-chart.png"))); // NOI18N
        lblReportes.setText("Reportes");
        lblReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReportes.setIconTextGap(10);
        lblReportes.setPreferredSize(new java.awt.Dimension(200, 50));
        lblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckReportesLayout = new javax.swing.GroupLayout(bckReportes);
        bckReportes.setLayout(bckReportesLayout);
        bckReportesLayout.setHorizontalGroup(
            bckReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bckReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bckReportesLayout.setVerticalGroup(
            bckReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("© Ing. Alex Espejel");
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 15));

        bckSalir.setBackground(new java.awt.Color(0, 26, 90));
        bckSalir.setPreferredSize(new java.awt.Dimension(200, 50));

        lblSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/poder.png"))); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.setIconTextGap(10);
        lblSalir.setPreferredSize(new java.awt.Dimension(200, 50));
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

        javax.swing.GroupLayout bckSalirLayout = new javax.swing.GroupLayout(bckSalir);
        bckSalir.setLayout(bckSalirLayout);
        bckSalirLayout.setHorizontalGroup(
            bckSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bckSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bckSalirLayout.setVerticalGroup(
            bckSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bckUsuarios.setBackground(new java.awt.Color(0, 26, 90));

        lblUsuarios.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account-multiple.png"))); // NOI18N
        lblUsuarios.setText("Usuarios");
        lblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuarios.setIconTextGap(10);
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bckUsuariosLayout = new javax.swing.GroupLayout(bckUsuarios);
        bckUsuarios.setLayout(bckUsuariosLayout);
        bckUsuariosLayout.setHorizontalGroup(
            bckUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckUsuariosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bckUsuariosLayout.setVerticalGroup(
            bckUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckDeptos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bckOficios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bckReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(bckArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addComponent(lblUpom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(bckSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(bckUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblUpom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bckUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bckDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bckOficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bckArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bckReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bckSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPHeader.setBackground(new java.awt.Color(0, 26, 90));
        jPHeader.setPreferredSize(new java.awt.Dimension(1000, 100));

        lblHeader.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Módulo de Administrador");
        lblHeader.setPreferredSize(new java.awt.Dimension(410, 50));

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        lblDate.setFont(new java.awt.Font("Roboto", 2, 16)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 26, 90));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jPContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
        jPContent.setLayout(jPContentLayout);
        jPContentLayout.setHorizontalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        jPContentLayout.setVerticalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPBackLayout = new javax.swing.GroupLayout(jPBack);
        jPBack.setLayout(jPBackLayout);
        jPBackLayout.setHorizontalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBackLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPBackLayout.setVerticalGroup(
            jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBackLayout.createSequentialGroup()
                .addGroup(jPBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPBackLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblDate.getAccessibleContext().setAccessibleName("lblDate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDeptosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeptosMouseEntered
        bckDeptos.setBackground(Color.white);
        lblDeptos.setForeground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblDeptosMouseEntered

    private void lblDeptosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeptosMouseExited
        bckDeptos.setBackground(new Color(0, 26, 90));
        lblDeptos.setForeground(Color.white);
    }//GEN-LAST:event_lblDeptosMouseExited

    private void lblAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAreaMouseEntered
        bckArea.setBackground(Color.white);
        lblArea.setForeground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblAreaMouseEntered

    private void lblAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAreaMouseExited
        bckArea.setBackground(new Color(0, 26, 90));
        lblArea.setForeground(Color.white);
    }//GEN-LAST:event_lblAreaMouseExited

    private void lblOficiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOficiosMouseEntered
        bckOficios.setBackground(Color.white);
        lblOficios.setForeground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblOficiosMouseEntered

    private void lblOficiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOficiosMouseExited
        bckOficios.setBackground(new Color(0, 26, 90));
        lblOficios.setForeground(Color.white);
    }//GEN-LAST:event_lblOficiosMouseExited

    private void lblReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseEntered
        bckReportes.setBackground(Color.white);
        lblReportes.setForeground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblReportesMouseEntered

    private void lblReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseExited
        bckReportes.setBackground(new Color(0, 26, 90));
        lblReportes.setForeground(Color.white);
    }//GEN-LAST:event_lblReportesMouseExited

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        bckSalir.setBackground(Color.white);
        lblSalir.setForeground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        bckSalir.setBackground(new Color(0, 26, 90));
        lblSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblDeptosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeptosMouseClicked
        ShowJPanel(new Departamentos());
    }//GEN-LAST:event_lblDeptosMouseClicked

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        ShowJPanel(new Usuarios());
    }//GEN-LAST:event_lblUsuariosMouseClicked

    private void lblUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseEntered
         bckUsuarios.setBackground(Color.white);
        lblUsuarios.setForeground(new Color(0, 26, 90));
    }//GEN-LAST:event_lblUsuariosMouseEntered

    private void lblUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseExited
         bckUsuarios.setBackground(new Color(0, 26, 90));
        lblUsuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblUsuariosMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckArea;
    private javax.swing.JPanel bckDeptos;
    private javax.swing.JPanel bckOficios;
    private javax.swing.JPanel bckReportes;
    private javax.swing.JPanel bckSalir;
    private javax.swing.JPanel bckUsuarios;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPBack;
    private static javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeptos;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblOficios;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUpom;
    private javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}
