/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.view;

import br.edu.uesb.petshop.control.TelaAddFuncionarioControl;
import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.model.Funcionario;
import br.edu.uesb.petshop.model.PetShop;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author matheus
 */
public class TelaAddFuncionario extends javax.swing.JPanel {

    private Campovazio cp;
    private Funcionario funcionario;
    private TelaAddFuncionarioControl funcionarioControl = new TelaAddFuncionarioControl();

    /**
     * Creates new form TelaFuncionario
     */
    public TelaAddFuncionario() {
        initComponents();
        cp = new Campovazio();
    }
    public static String senha;
    public static String login;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLoginTelaFunc = new javax.swing.JLabel();
        lbTituloTelaFunc = new javax.swing.JLabel();
        lbSenhaTelaFunc = new javax.swing.JLabel();
        lbConfirmaTelaFunc = new javax.swing.JLabel();
        bVoltarTelaFunc = new javax.swing.JButton();
        bProximoTelaFunc = new javax.swing.JButton();
        txtLoginTelaFunc = new javax.swing.JTextField();
        txtSenhaTelaFunc = new javax.swing.JPasswordField();
        txtConfirmaSenhaTelaFunc = new javax.swing.JPasswordField();

        lbLoginTelaFunc.setText("Login:");

        lbTituloTelaFunc.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbTituloTelaFunc.setText("ADICIONAR FUNCIONÁRIO");

        lbSenhaTelaFunc.setText("Senha:");

        lbConfirmaTelaFunc.setText("Confirmar Senha:");

        bVoltarTelaFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/15.png"))); // NOI18N
        bVoltarTelaFunc.setText("VOLTAR");
        bVoltarTelaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarTelaFuncActionPerformed(evt);
            }
        });

        bProximoTelaFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/16.png"))); // NOI18N
        bProximoTelaFunc.setText("PROXIMO");
        bProximoTelaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProximoTelaFuncActionPerformed(evt);
            }
        });

        txtLoginTelaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginTelaFuncActionPerformed(evt);
            }
        });

        txtSenhaTelaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaTelaFuncActionPerformed(evt);
            }
        });

        txtConfirmaSenhaTelaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmaSenhaTelaFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloTelaFunc)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbConfirmaTelaFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(lbSenhaTelaFunc)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(lbLoginTelaFunc)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bVoltarTelaFunc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bProximoTelaFunc))
                            .addComponent(txtConfirmaSenhaTelaFunc)
                            .addComponent(txtSenhaTelaFunc)
                            .addComponent(txtLoginTelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTituloTelaFunc)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoginTelaFunc)
                    .addComponent(txtLoginTelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenhaTelaFunc)
                    .addComponent(txtSenhaTelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbConfirmaTelaFunc)
                    .addComponent(txtConfirmaSenhaTelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVoltarTelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bProximoTelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarTelaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarTelaFuncActionPerformed

        limparCampos();
        PetShop.tela.showView(EnumView.TELAPRINCIPAL);

    }//GEN-LAST:event_bVoltarTelaFuncActionPerformed

    private void bProximoTelaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProximoTelaFuncActionPerformed

        cp.textfield(txtLoginTelaFunc);
        cp.textfield(txtConfirmaSenhaTelaFunc);
        cp.textfield(txtSenhaTelaFunc);
        setLogin(txtLoginTelaFunc);
        setSenha(txtSenhaTelaFunc);
        if (("".equals(txtLoginTelaFunc.getText())) || ("".equals(txtSenhaTelaFunc.getText())) || ("".equals(txtConfirmaSenhaTelaFunc.getText()))) {
            JOptionPane.showMessageDialog(null, "Por favor preencha os campos restantes!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            if (funcionarioControl.loginExistente(txtLoginTelaFunc)) {
                
                JOptionPane.showMessageDialog(this, "Login já cadastrado, Tente novamente!", "Atenção", JOptionPane.WARNING_MESSAGE);
                                
            } else {
                if (!txtSenhaTelaFunc.getText().equals(txtConfirmaSenhaTelaFunc.getText())) {
                    
                    JOptionPane.showMessageDialog(this, "Senhas não conferem, Tente novamente!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    
                } else {
                    
                    limparCampos();
                    PetShop.tela.showView(EnumView.TELAADDFUNCIONARIO1);

                }
            }
        }
    }//GEN-LAST:event_bProximoTelaFuncActionPerformed

    private void limparCampos() {                                                  

        txtLoginTelaFunc.setText("");
        txtConfirmaSenhaTelaFunc.setText("");
        txtSenhaTelaFunc.setText("");
        cp.limparTextfield(txtSenhaTelaFunc);
        cp.limparTextfield(txtConfirmaSenhaTelaFunc);
        cp.limparTextfield(txtSenhaTelaFunc);

    }
    
    private void txtLoginTelaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginTelaFuncActionPerformed
        txtSenhaTelaFunc.requestFocus();
    }//GEN-LAST:event_txtLoginTelaFuncActionPerformed

    private void txtSenhaTelaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaTelaFuncActionPerformed
        txtConfirmaSenhaTelaFunc.requestFocus();
    }//GEN-LAST:event_txtSenhaTelaFuncActionPerformed

    private void txtConfirmaSenhaTelaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmaSenhaTelaFuncActionPerformed
        bProximoTelaFuncActionPerformed(evt);
    }//GEN-LAST:event_txtConfirmaSenhaTelaFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bProximoTelaFunc;
    private javax.swing.JButton bVoltarTelaFunc;
    private javax.swing.JLabel lbConfirmaTelaFunc;
    private javax.swing.JLabel lbLoginTelaFunc;
    private javax.swing.JLabel lbSenhaTelaFunc;
    private javax.swing.JLabel lbTituloTelaFunc;
    private javax.swing.JPasswordField txtConfirmaSenhaTelaFunc;
    private javax.swing.JTextField txtLoginTelaFunc;
    private javax.swing.JPasswordField txtSenhaTelaFunc;
    // End of variables declaration//GEN-END:variables

    public void setLogin(javax.swing.JTextField txtLoginTelaFunc) {
        login = txtLoginTelaFunc.getText();
    }
    
    public void setSenha(javax.swing.JTextField txtSenhaTelaFunc) {
        senha = txtSenhaTelaFunc.getText();
    }
    
}
