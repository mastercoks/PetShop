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
public class TelaMenuFuncionario extends javax.swing.JPanel {

    /**
     * Creates new form TelaMenuFuncionario
     */
    public TelaMenuFuncionario() {
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

        lbTituloMenuFuncionario = new javax.swing.JLabel();
        bVoltarMenuFuncionario = new javax.swing.JButton();
        bBuscarFuncionario = new javax.swing.JButton();
        bNovoFuncionario = new javax.swing.JButton();

        lbTituloMenuFuncionario.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTituloMenuFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTituloMenuFuncionario.setText("FUNCIONÁRIO");

        bVoltarMenuFuncionario.setText("VOLTAR");
        bVoltarMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarMenuFuncionarioActionPerformed(evt);
            }
        });

        bBuscarFuncionario.setText("<HTML><BODY>BUSCAR FUNCIONÁRIO</BODY></HTML>");

        bNovoFuncionario.setText("<HTML><BODY>NOVO FUNCIONÁRIO</BODY></HTML>");
        bNovoFuncionario.setMaximumSize(new java.awt.Dimension(122, 26));
        bNovoFuncionario.setMinimumSize(new java.awt.Dimension(122, 26));
        bNovoFuncionario.setPreferredSize(new java.awt.Dimension(122, 26));
        bNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoFuncionarioActionPerformed(evt);
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
                        .addComponent(lbTituloMenuFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNovoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bBuscarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bVoltarMenuFuncionario)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloMenuFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNovoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(bBuscarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(bVoltarMenuFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarMenuFuncionarioActionPerformed
//        pMenuPrincipal.setVisible(true);
//        pMenuFuncionario.setVisible(false);

    }//GEN-LAST:event_bVoltarMenuFuncionarioActionPerformed

    private void bNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bNovoFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarFuncionario;
    private javax.swing.JButton bNovoFuncionario;
    private javax.swing.JButton bVoltarMenuFuncionario;
    private javax.swing.JLabel lbTituloMenuFuncionario;
    // End of variables declaration//GEN-END:variables
}