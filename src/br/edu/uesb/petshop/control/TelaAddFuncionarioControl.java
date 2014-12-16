/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.dao.FuncionarioDAO;
import br.edu.uesb.petshop.model.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laherce Gomes
 */
public class TelaAddFuncionarioControl {

    FuncionarioDAO funcionarioDAO;

    public boolean loginExistente(javax.swing.JTextField txtLogin) {
        funcionarioDAO = new FuncionarioDAO();
        ResultSet rs = funcionarioDAO.getByLogin(txtLogin.getText());

        try {
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddFuncionarioControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void salvarFuncionario(Funcionario funcionario) {
        funcionarioDAO = new FuncionarioDAO();
//        se todos os campos estiverem preenchidos ele add ao banco de dados

        try {
            funcionarioDAO.insert(funcionario);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, JOptionPane.PLAIN_MESSAGE, null);
//                bLimparAddClienteActionPerformed(evt);//limparcampos

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }

}
