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

    public void excluirFuncionario(Funcionario funcionario) {
        funcionarioDAO = new FuncionarioDAO();

        funcionarioDAO.delete(funcionario);
        JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);

    }
    
    public void atualizarFuncionario(Funcionario funcionario){
            funcionarioDAO = new FuncionarioDAO();
        
        funcionarioDAO.update(funcionario);
        JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);
    }
    public ResultSet bucarByCpf(String cpf){
        
        funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.getByCpf(cpf);
    }

    public void salvarFuncionario(Funcionario funcionario) {

        funcionarioDAO = new FuncionarioDAO();
//        se todos os campos estiverem preenchidos ele add ao banco de dados

     
            funcionarioDAO.insert(funcionario);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);
//                bLimparAddFuncionarioActionPerformed(evt);//limparcampos
    }
    public boolean verificaCpfExistente(String cpf) {
        funcionarioDAO = new FuncionarioDAO();

        ResultSet rs = funcionarioDAO.getByCpf(cpf);

        try {
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddFuncionarioControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
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

//    public ResultSet bucarByCpf(String text) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    public boolean verificaCpfExistente(String imprimeCPF) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
