/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.gui;

/**
 *
 * @author matheus
 */
public class TelaMenuCliente extends javax.swing.JPanel {

    /**
     * Creates new form TelaMenuCliente
     */
    public TelaMenuCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloMenuCliente = new javax.swing.JLabel();
        bVoltarMenuCliente = new javax.swing.JButton();
        bBuscarCliente = new javax.swing.JButton();
        bNovoCliente = new javax.swing.JButton();

        lbTituloMenuCliente.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTituloMenuCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTituloMenuCliente.setText("CLIENTE");

        bVoltarMenuCliente.setText("VOLTAR");
        bVoltarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarMenuClienteActionPerformed(evt);
            }
        });

        bBuscarCliente.setText("BUSCAR CLIENTE");

        bNovoCliente.setText("NOVO CLIENTE");
        bNovoCliente.setMaximumSize(new java.awt.Dimension(122, 26));
        bNovoCliente.setMinimumSize(new java.awt.Dimension(122, 26));
        bNovoCliente.setPreferredSize(new java.awt.Dimension(122, 26));
        bNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbTituloMenuCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVoltarMenuCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloMenuCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNovoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(bBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(bVoltarMenuCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarMenuClienteActionPerformed
//        pMenuCliente.setVisible(false);
//        pMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_bVoltarMenuClienteActionPerformed

    private void bNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoClienteActionPerformed
//        pMenuCliente.setVisible(false);
//        pMenuAddCliente.setVisible(true);
    }//GEN-LAST:event_bNovoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarCliente;
    private javax.swing.JButton bNovoCliente;
    private javax.swing.JButton bVoltarMenuCliente;
    private javax.swing.JLabel lbTituloMenuCliente;
    // End of variables declaration//GEN-END:variables
}
