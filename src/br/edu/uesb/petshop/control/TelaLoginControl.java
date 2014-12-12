/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

/**
 *
 * @author matheus
 */
public class TelaLoginControl {
    
    public void EntrarActionPerformed(javax.swing.JTextField txtLoginMenuLogin, javax.swing.JTextField txtSenhaMenuLogin){

//        Statement query = ConexaoPostgreSQL.openConnectionPostgreSQL();
//        int cont = 0;
//
//        try {
//
//            ResultSet rs = query.executeQuery("SELECT id, login, senha, nivel FROM \"Admin\""
//                + "WHERE login = '" + txtLoginMenuLogin.getText() + "' ");
//
//            while (rs.next()) {
//                cont++;
//                rs = query.executeQuery("SELECT id, login, senha, nivel FROM \"Admin\""
//                    + "WHERE senha = '" + txtSenhaMenuLogin.getText() + "' ");
//
//                while (rs.next()) {
//                    if (rs.getString("login").equals(txtLoginMenuLogin.getText())) {
//                        if (rs.getInt("nivel") == 1) {
//                            lbTituloMenuPrincipal.setText("FUNCIONARIO");
//                            bFuncionarioMenuPrincipal.setEnabled(false);
//                        } else {
//                            lbTituloMenuPrincipal.setText("ADMIN");
//                            bFuncionarioMenuPrincipal.setEnabled(true);
//                        }
//                        pLoginIncorretoMenuLogin.setVisible(false);
//                        cont++;
//                        pMenuLogin.setVisible(false);
//                        pMenuPrincipal.setVisible(true);
//                        mAnimais.setEnabled(true);
//                        mClientes.setEnabled(true);
//                        mAtendimento.setEnabled(true);
//                        mCadastro.setEnabled(true);
//                    }
//                }
//            }
//
//            if (cont == 0) {
//                pLoginIncorretoMenuLogin.setVisible(true);
//                lbLoginIncorretoMenuLogin.setText("Login invalido, por favor tente novamente");
//            } else if (cont == 1) {
//                pLoginIncorretoMenuLogin.setVisible(true);
//                lbLoginIncorretoMenuLogin.setText("Senha invalida, por favor tente novamente");
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//            lbLoginIncorretoMenuLogin.setVisible(true);
//        }
        
    }
    
}
