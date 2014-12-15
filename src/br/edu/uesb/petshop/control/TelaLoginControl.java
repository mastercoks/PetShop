/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.dao.AdmDAO;
import br.edu.uesb.petshop.dao.FuncionarioDAO;
import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.view.Login;
import br.edu.uesb.petshop.model.PetShop;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class TelaLoginControl {

    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public enum EnumLogin {

        SENHA_ERRADA, LOGIN_ERRADO, LOGIN_ADMIN, LOGIN_FUNCIONARIO
    };

    public EnumLogin EntrarActionPerformed(javax.swing.JTextField txtLoginMenuLogin, javax.swing.JTextField txtSenhaMenuLogin) {

        try {

            ResultSet rs = funcionarioDAO.getByLogin(txtLoginMenuLogin.getText());

            if (rs.next()) {
                if (rs.getString("senha").equals(txtSenhaMenuLogin.getText())) {
                    PetShop.tela.showView(EnumView.TELAPRINCIPAL);
                    if (rs.getInt("nivel") == 1) {
                        return EnumLogin.LOGIN_FUNCIONARIO;
                    } else {
                        return EnumLogin.LOGIN_ADMIN;
                    }
                } else {
                    return EnumLogin.SENHA_ERRADA;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        return EnumLogin.LOGIN_ERRADO;
    }

}
