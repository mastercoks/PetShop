/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.view;

import br.edu.uesb.petshop.dao.ClienteDAO;
import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.model.PetShop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TelaBuscarCliente extends javax.swing.JPanel {

    private TelaBuscaResultado telaResultado = null;
    
    public TelaBuscarCliente() {
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

        lbTituloBuscarCliente = new javax.swing.JLabel();
        lbNomeBuscarCliente = new javax.swing.JLabel();
        lbCpfBuscarCliente = new javax.swing.JLabel();
        txtNomeBuscarCliente = new javax.swing.JTextField();
        bBuscarPorNomeCliente = new javax.swing.JButton();
        bBuscarPorCpfCliente = new javax.swing.JButton();
        bVoltarBuscarCliente = new javax.swing.JButton();
        txtCpfBuscarCliente = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(700, 400));

        lbTituloBuscarCliente.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbTituloBuscarCliente.setText("BUSCAR CLIENTE");

        lbNomeBuscarCliente.setText("BUSCAR POR NOME:");

        lbCpfBuscarCliente.setText("BUSCAR POR CPF:");

        bBuscarPorNomeCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/7.png"))); // NOI18N
        bBuscarPorNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarPorNomeClienteActionPerformed(evt);
            }
        });

        bBuscarPorCpfCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/7.png"))); // NOI18N
        bBuscarPorCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarPorCpfClienteActionPerformed(evt);
            }
        });

        bVoltarBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/15.png"))); // NOI18N
        bVoltarBuscarCliente.setText("VOLTAR");
        bVoltarBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarBuscarClienteActionPerformed(evt);
            }
        });

        try {
            txtCpfBuscarCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(bVoltarBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpfBuscarCliente)
                            .addComponent(lbNomeBuscarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfBuscarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bBuscarPorNomeCliente)
                            .addComponent(bBuscarPorCpfCliente))))
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTituloBuscarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTituloBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeBuscarCliente)
                    .addComponent(txtNomeBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscarPorNomeCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpfBuscarCliente)
                    .addComponent(bBuscarPorCpfCliente)
                    .addComponent(txtCpfBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(bVoltarBuscarCliente)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarPorNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarPorNomeClienteActionPerformed
        ClienteDAO clienteDAO = new ClienteDAO();
        int cont = 0;
        ResultSet rs = clienteDAO.getByNome(txtNomeBuscarCliente.getText());
        try {
            while (rs.next()) {
                cont++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaBuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cont > 0) {
            telaResultado = new TelaBuscaResultado();
            telaResultado.BuscarByNome(txtNomeBuscarCliente.getText());
            telaResultado.setVisible(true);
            PetShop.tela.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Cliente encontrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_bBuscarPorNomeClienteActionPerformed

    private void bBuscarPorCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarPorCpfClienteActionPerformed
        ClienteDAO clienteDAO = new ClienteDAO();
        int cont = 0;
        ResultSet rs = clienteDAO.getByCpf(txtCpfBuscarCliente.getText());
        try {
            while (rs.next()) {
                cont++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaBuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cont > 0) {
            telaResultado = new TelaBuscaResultado();
            telaResultado.BuscarByCpf(txtCpfBuscarCliente.getText());
            telaResultado.setVisible(true);
            PetShop.tela.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Cliente encontrado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bBuscarPorCpfClienteActionPerformed

    private void bVoltarBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarBuscarClienteActionPerformed

        PetShop.tela.showView(EnumView.TELACLIENTE);
        
    }//GEN-LAST:event_bVoltarBuscarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscarPorCpfCliente;
    private javax.swing.JButton bBuscarPorNomeCliente;
    private javax.swing.JButton bVoltarBuscarCliente;
    private javax.swing.JLabel lbCpfBuscarCliente;
    private javax.swing.JLabel lbNomeBuscarCliente;
    private javax.swing.JLabel lbTituloBuscarCliente;
    private javax.swing.JFormattedTextField txtCpfBuscarCliente;
    private javax.swing.JTextField txtNomeBuscarCliente;
    // End of variables declaration//GEN-END:variables
}
