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
public class TelaAddAnimal extends javax.swing.JPanel {

    /**
     * Creates new form TelaAddAnimal
     */
    public TelaAddAnimal() {
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

        bgSexo = new javax.swing.ButtonGroup();
        bVoltarAddAnimal = new javax.swing.JButton();
        lbTituloAddAnimal = new javax.swing.JLabel();
        bLimparAddAnimal = new javax.swing.JButton();
        bSalvarCadastroAddAnimal = new javax.swing.JButton();
        rbMachoAddAnimal = new javax.swing.JRadioButton();
        rbFemeaAddAnimal = new javax.swing.JRadioButton();
        txtNomeAddAnimal = new javax.swing.JTextField();
        cbEspecieAddAnimal = new javax.swing.JComboBox();
        cbDonoAddAnimal = new javax.swing.JComboBox();
        lbNomeAddAnimal = new javax.swing.JLabel();
        lbSexoAddAnimal = new javax.swing.JLabel();
        lbEspecieAddAnimal = new javax.swing.JLabel();
        lbRacaAddAnimal = new javax.swing.JLabel();
        lbDonoAddAnimal = new javax.swing.JLabel();
        txtRacaAddAnimal = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(700, 400));

        bVoltarAddAnimal.setText("<html><body>VOLTAR</body></html>");
        bVoltarAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarAddAnimalActionPerformed(evt);
            }
        });

        lbTituloAddAnimal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbTituloAddAnimal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTituloAddAnimal.setText("Animal");

        bLimparAddAnimal.setText("LIMPAR");
        bLimparAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparAddAnimalActionPerformed(evt);
            }
        });

        bSalvarCadastroAddAnimal.setText("<html><body>SALVAR CADASTRO</body></html>");
        bSalvarCadastroAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarCadastroAddAnimalActionPerformed(evt);
            }
        });

        bgSexo.add(rbMachoAddAnimal);
        rbMachoAddAnimal.setText("Macho");
        rbMachoAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMachoAddAnimalActionPerformed(evt);
            }
        });
        rbMachoAddAnimal.setActionCommand("MACHO");

        bgSexo.add(rbFemeaAddAnimal);
        rbFemeaAddAnimal.setText("Fêmea");
        rbFemeaAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeaAddAnimalActionPerformed(evt);
            }
        });
        rbFemeaAddAnimal.setActionCommand("FÊMEA");

        //capslock(txtNomeAddAnimal);

        cbEspecieAddAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "CACHORRO", "GATO", "CAVALO", "PASSARO", "VEADO(KURAS)", "POKÉMON(PEDRO)" }));

        cbDonoAddAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        lbNomeAddAnimal.setText("NOME:");

        lbSexoAddAnimal.setText("SEXO:");

        lbEspecieAddAnimal.setText("ESPECIE:");

        lbRacaAddAnimal.setText("RAÇA:");

        lbDonoAddAnimal.setText("DONO:");

        //capslock(txtRacaAddAnimal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNomeAddAnimal)
                    .addComponent(lbSexoAddAnimal)
                    .addComponent(lbEspecieAddAnimal)
                    .addComponent(lbRacaAddAnimal)
                    .addComponent(lbDonoAddAnimal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEspecieAddAnimal, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMachoAddAnimal)
                        .addGap(41, 41, 41)
                        .addComponent(rbFemeaAddAnimal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bLimparAddAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bVoltarAddAnimal))
                        .addGap(18, 18, 18)
                        .addComponent(bSalvarCadastroAddAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addComponent(txtNomeAddAnimal)
                    .addComponent(cbDonoAddAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRacaAddAnimal))
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloAddAnimal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTituloAddAnimal)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeAddAnimal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMachoAddAnimal)
                    .addComponent(rbFemeaAddAnimal)
                    .addComponent(lbSexoAddAnimal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEspecieAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEspecieAddAnimal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRacaAddAnimal)
                    .addComponent(txtRacaAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDonoAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDonoAddAnimal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bLimparAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVoltarAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bSalvarCadastroAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        //Statement query = ConexaoPostgreSQL.openConnectionPostgreSQL();
        //try{
            //ResultSet rs = query.executeQuery("SELECT nome FROM \"Cliente\"");
            //
            //while(rs.next()){
                //cbDonoAddAnimal.addItem(rs.getString("nome"));
                //}
            //
            //}catch (SQLException ex) {
            //            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            //            lbLoginIncorretoMenuLogin.setVisible(true);
            //            }
    }// </editor-fold>//GEN-END:initComponents

    private void bVoltarAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarAddAnimalActionPerformed
        
        PetShop.tela.showView(EnumView.TELAANIMAL);
        bLimparAddAnimalActionPerformed(evt);
        
    }//GEN-LAST:event_bVoltarAddAnimalActionPerformed

    private void bLimparAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparAddAnimalActionPerformed
        txtNomeAddAnimal.setText("");
        txtRacaAddAnimal.setText("");
        cbEspecieAddAnimal.setSelectedItem("-");
        cbDonoAddAnimal.setSelectedItem("-");
        bgSexo.clearSelection();
    }//GEN-LAST:event_bLimparAddAnimalActionPerformed

    private void bSalvarCadastroAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarCadastroAddAnimalActionPerformed
        //        Statement query = ConexaoPostgreSQL.openConnectionPostgreSQL();
        //
        //        //add
        //        try {
            //            query.executeUpdate("INSERT INTO \"Animal\"(\n"
                //                    + "            nome, sexo, especie, raca, dono)\n"
                //                    + "    VALUES ('" + txtNomeAddAnimal.getText() + "','" + bgSexo.getSelection().getActionCommand() + "','" + cbEspecie.getSelectedItem()
                //                    + "','" + txtRacaAddAnimal.getText() + "','" + cbDono.getSelectedItem() + "');");
            //
            //            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, JOptionPane.PLAIN_MESSAGE, null);
            //            bLimparAddAnimalActionPerformed(evt);//limparcampos
            //
            //        } catch (Exception e) {
            //            System.out.println(e);
            //            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            //        }
    }//GEN-LAST:event_bSalvarCadastroAddAnimalActionPerformed

    private void rbMachoAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMachoAddAnimalActionPerformed

    }//GEN-LAST:event_rbMachoAddAnimalActionPerformed

    private void rbFemeaAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeaAddAnimalActionPerformed

    }//GEN-LAST:event_rbFemeaAddAnimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLimparAddAnimal;
    private javax.swing.JButton bSalvarCadastroAddAnimal;
    private javax.swing.JButton bVoltarAddAnimal;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JComboBox cbDonoAddAnimal;
    private javax.swing.JComboBox cbEspecieAddAnimal;
    private javax.swing.JLabel lbDonoAddAnimal;
    private javax.swing.JLabel lbEspecieAddAnimal;
    private javax.swing.JLabel lbNomeAddAnimal;
    private javax.swing.JLabel lbRacaAddAnimal;
    private javax.swing.JLabel lbSexoAddAnimal;
    private javax.swing.JLabel lbTituloAddAnimal;
    private javax.swing.JRadioButton rbFemeaAddAnimal;
    private javax.swing.JRadioButton rbMachoAddAnimal;
    private javax.swing.JTextField txtNomeAddAnimal;
    private javax.swing.JTextField txtRacaAddAnimal;
    // End of variables declaration//GEN-END:variables
}
