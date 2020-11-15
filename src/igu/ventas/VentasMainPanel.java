/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu.ventas;


import igu.ChangePanel;
import igu.ventas.clientes.ClientesPanel;
import igu.ventas.productos.ProductosPanel;
import igu.ventas.ventas.VentasPanel;
import java.awt.Color;

/**
 *
 * @author Asullom
 */
public class VentasMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form ComprasMainPanel
     */
    public VentasMainPanel() {
        initComponents();
        new ChangePanel(workPanel, new VentasPanel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        clientesButton = new igu.util.buttons.TheButton();
        ventasButton = new igu.util.buttons.TheButton();
        clientesButton1 = new igu.util.buttons.TheButton();
        paramsButton = new igu.util.buttons.TheButton();
        clientesButton2 = new igu.util.buttons.TheButton();
        workPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(239, 238, 244));

        clientesButton.setBackground(new java.awt.Color(239, 238, 244));
        clientesButton.setForeground(new java.awt.Color(128, 128, 131));
        clientesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/user_blue_32.png"))); // NOI18N
        clientesButton.setText("CLIENTES");
        clientesButton.setColorHover(new java.awt.Color(204, 204, 204));
        clientesButton.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesButton.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesButton.setFocusable(false);
        clientesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesButtonMousePressed(evt);
            }
        });
        clientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButtonActionPerformed(evt);
            }
        });

        ventasButton.setBackground(new java.awt.Color(204, 204, 204));
        ventasButton.setForeground(new java.awt.Color(128, 128, 131));
        ventasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/market.png"))); // NOI18N
        ventasButton.setText("VENTAS");
        ventasButton.setColorHover(new java.awt.Color(204, 204, 204));
        ventasButton.setColorNormal(new java.awt.Color(204, 204, 204));
        ventasButton.setColorPressed(new java.awt.Color(204, 204, 204));
        ventasButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        ventasButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        ventasButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        ventasButton.setFocusable(false);
        ventasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventasButtonMousePressed(evt);
            }
        });
        ventasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasButtonActionPerformed(evt);
            }
        });

        clientesButton1.setBackground(new java.awt.Color(239, 238, 244));
        clientesButton1.setForeground(new java.awt.Color(128, 128, 131));
        clientesButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/user_blue_32.png"))); // NOI18N
        clientesButton1.setText("...");
        clientesButton1.setColorHover(new java.awt.Color(204, 204, 204));
        clientesButton1.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesButton1.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesButton1.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesButton1.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesButton1.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesButton1.setFocusable(false);
        clientesButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesButton1MousePressed(evt);
            }
        });
        clientesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButton1ActionPerformed(evt);
            }
        });

        paramsButton.setBackground(new java.awt.Color(239, 238, 244));
        paramsButton.setForeground(new java.awt.Color(128, 128, 131));
        paramsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/user_blue_32.png"))); // NOI18N
        paramsButton.setText("PRODUCTOS");
        paramsButton.setColorHover(new java.awt.Color(204, 204, 204));
        paramsButton.setColorNormal(new java.awt.Color(239, 238, 244));
        paramsButton.setColorPressed(new java.awt.Color(204, 204, 204));
        paramsButton.setColorTextHover(new java.awt.Color(128, 128, 131));
        paramsButton.setColorTextNormal(new java.awt.Color(128, 128, 131));
        paramsButton.setColorTextPressed(new java.awt.Color(128, 128, 131));
        paramsButton.setFocusable(false);
        paramsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paramsButtonMousePressed(evt);
            }
        });
        paramsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paramsButtonActionPerformed(evt);
            }
        });

        clientesButton2.setBackground(new java.awt.Color(239, 238, 244));
        clientesButton2.setForeground(new java.awt.Color(128, 128, 131));
        clientesButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/user_blue_32.png"))); // NOI18N
        clientesButton2.setText("REP. COMP");
        clientesButton2.setColorHover(new java.awt.Color(204, 204, 204));
        clientesButton2.setColorNormal(new java.awt.Color(239, 238, 244));
        clientesButton2.setColorPressed(new java.awt.Color(204, 204, 204));
        clientesButton2.setColorTextHover(new java.awt.Color(128, 128, 131));
        clientesButton2.setColorTextNormal(new java.awt.Color(128, 128, 131));
        clientesButton2.setColorTextPressed(new java.awt.Color(128, 128, 131));
        clientesButton2.setFocusable(false);
        clientesButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesButton2MousePressed(evt);
            }
        });
        clientesButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventasButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paramsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(clientesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(clientesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(clientesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(clientesButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paramsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setLayout(new javax.swing.BoxLayout(workPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ventasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasButtonActionPerformed
        // TODO add your handling code here:
        new ChangePanel(workPanel, new VentasPanel());
        /*  if (new Validate().comprobar()) {

        } else {
            new ChangePanel(pnlPrincipal, new PinPanel());
        }*/

        if (this.ventasButton.isSelected()) {
            this.ventasButton.setColorNormal(new Color(204, 204, 204));

            this.clientesButton.setColorNormal(new Color(239, 238, 244));
            this.paramsButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton2.setColorNormal(new Color(239, 238, 244));

        } else {
            this.ventasButton.setColorNormal(new Color(239, 238, 244));
        }
    }//GEN-LAST:event_ventasButtonActionPerformed

    private void clientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButtonActionPerformed
        // TODO add your handling code here:
        new ChangePanel(workPanel, new ClientesPanel());
        
        if (this.clientesButton.isSelected()) {
            this.clientesButton.setColorNormal(new Color(204, 204, 204));

            this.ventasButton.setColorNormal(new Color(239, 238, 244));
            this.paramsButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton2.setColorNormal(new Color(239, 238, 244));

        } else {
            this.clientesButton.setColorNormal(new Color(239, 238, 244));
        }
    }//GEN-LAST:event_clientesButtonActionPerformed

    private void ventasButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasButtonMousePressed
        // TODO add your handling code here:
        this.ventasButton.setSelected(true);
        this.clientesButton.setSelected(false);
        this.paramsButton.setSelected(false);
         this.clientesButton2.setSelected(false);

    }//GEN-LAST:event_ventasButtonMousePressed

    private void clientesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButtonMousePressed
        // TODO add your handling code here:
        this.clientesButton.setSelected(true);
        this.ventasButton.setSelected(false);
        this.paramsButton.setSelected(false);
         this.clientesButton2.setSelected(false);

    }//GEN-LAST:event_clientesButtonMousePressed

    private void clientesButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesButton1MousePressed

    private void clientesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesButton1ActionPerformed

    private void paramsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paramsButtonMousePressed
        // TODO add your handling code here:
        this.paramsButton.setSelected(true);
        this.ventasButton.setSelected(false);
        this.clientesButton.setSelected(false);
         this.clientesButton2.setSelected(false);
    }//GEN-LAST:event_paramsButtonMousePressed

    private void paramsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paramsButtonActionPerformed
        // TODO add your handling code here:
        
        new ChangePanel(workPanel, new ProductosPanel());
        
        if (this.paramsButton.isSelected()) {
            this.paramsButton.setColorNormal(new Color(204, 204, 204));

            this.ventasButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton2.setColorNormal(new Color(239, 238, 244));
            

        } else {
            this.paramsButton.setColorNormal(new Color(239, 238, 244));
        }
        
    }//GEN-LAST:event_paramsButtonActionPerformed

    private void clientesButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesButton2MousePressed
        // TODO add your handling code here:
        this.paramsButton.setSelected(false);
        this.ventasButton.setSelected(false);
        this.clientesButton.setSelected(false);
        this.clientesButton2.setSelected(true);
       
        
    }//GEN-LAST:event_clientesButton2MousePressed

    private void clientesButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesButton2ActionPerformed
        // TODO add your handling code here:
        /*
        new ChangePanel(workPanel, new ComprasReportesPanel());
        
        if (this.clientesButton2.isSelected()) {
            this.clientesButton2.setColorNormal(new Color(204, 204, 204));

            this.comprasButton.setColorNormal(new Color(239, 238, 244));
            this.paramsButton.setColorNormal(new Color(239, 238, 244));
            this.clientesButton.setColorNormal(new Color(239, 238, 244));

        } else {
            this.clientesButton2.setColorNormal(new Color(239, 238, 244));
        }*/
    }//GEN-LAST:event_clientesButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private igu.util.buttons.TheButton clientesButton;
    private igu.util.buttons.TheButton clientesButton1;
    private igu.util.buttons.TheButton clientesButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private igu.util.buttons.TheButton paramsButton;
    private igu.util.buttons.TheButton ventasButton;
    public static javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}