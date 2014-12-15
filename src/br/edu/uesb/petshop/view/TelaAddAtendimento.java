/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.view;

import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.model.PetShop;

/**
 *
 * @author matheus
 */
public class TelaAddAtendimento extends javax.swing.JPanel {

    /**
     * Creates new form TelaServicos
     */
    TelaAddServico telaserv;
    TelaAddCirurgia telacir;
    TelaAddExame telaexam;
    public TelaAddAtendimento() {
        initComponents();
        telaserv = new TelaAddServico();
        telacir = new TelaAddCirurgia();
        telaexam = new TelaAddExame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloMenuNovoServico = new javax.swing.JLabel();
        cbAnimal = new javax.swing.JComboBox();
        bAddServico = new javax.swing.JButton();
        bAddExame = new javax.swing.JButton();
        bAddCirurgia = new javax.swing.JButton();
        spPreview = new javax.swing.JScrollPane();
        txtpPreview = new javax.swing.JTextPane();
        lbAnimal = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();

        lbTituloMenuNovoServico.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTituloMenuNovoServico.setText("NOVO ATENDIMENTO");

        cbAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bAddServico.setText("<HTML><BODY>ADICIONAR SERVIÇO</BODY></HTML>");
        bAddServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddServicoActionPerformed(evt);
            }
        });

        bAddExame.setText("<HTML><BODY>ADICIONAR EXAME</BODY></HTML>");
        bAddExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddExameActionPerformed(evt);
            }
        });

        bAddCirurgia.setText("<HTML><BODY>ADICIONAR CIRURGIA</BODY></HTML>");
        bAddCirurgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddCirurgiaActionPerformed(evt);
            }
        });

        txtpPreview.setText("Cliente: animal.getDono().getNome());\nData: dtHora.format(data));\nAtendente:  funcionario.getNome());\nNome do animal:  animal.getNome());\n----------------------------------------------------\nServiços:\");\n\nExames:\n\nCirurgias:\n----------------------------------------------------\nTotal RS:  custo);");
        txtpPreview.setToolTipText("");
        spPreview.setViewportView(txtpPreview);

        lbAnimal.setText("Animal");

        bVoltar.setText("VOLTAR");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        bLimpar.setText("LIMPAR");

        bSalvar.setText("SALVAR SERVIÇO");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAnimal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bAddServico)
                            .addComponent(bAddExame)
                            .addComponent(bAddCirurgia)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(spPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 95, Short.MAX_VALUE)
                        .addComponent(lbTituloMenuNovoServico)
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTituloMenuNovoServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAnimal))
                        .addGap(18, 18, 18)
                        .addComponent(bAddServico, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bAddExame, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bAddCirurgia, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bVoltar))
                            .addComponent(bSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(spPreview))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bAddServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddServicoActionPerformed

        telaserv.setVisible(true);
        PetShop.tela.setEnabled(false);

    }//GEN-LAST:event_bAddServicoActionPerformed

    private void bAddExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddExameActionPerformed
        
        telaexam.setVisible(true);
        PetShop.tela.setEnabled(false);

    }//GEN-LAST:event_bAddExameActionPerformed

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalvarActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        PetShop.tela.showView(EnumView.TELAATENDIMENTO);
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bAddCirurgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddCirurgiaActionPerformed
        
        telacir.setVisible(true);
        PetShop.tela.setEnabled(false);

    }//GEN-LAST:event_bAddCirurgiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddCirurgia;
    private javax.swing.JButton bAddExame;
    private javax.swing.JButton bAddServico;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JButton bVoltar;
    private javax.swing.JComboBox cbAnimal;
    private javax.swing.JLabel lbAnimal;
    private javax.swing.JLabel lbTituloMenuNovoServico;
    private javax.swing.JScrollPane spPreview;
    private javax.swing.JTextPane txtpPreview;
    // End of variables declaration//GEN-END:variables
}
