/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.model.Cliente;
import br.edu.uesb.petshop.dao.ClienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TelaAddClienteControl {

    private ClienteDAO clienteDAO;
<<<<<<< HEAD
=======

    public void excluirCliente(Cliente cliente) {
        clienteDAO = new ClienteDAO();

        clienteDAO.delete(cliente);
        JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);

    }
    
    public void atualizarCliente(Cliente cliente){
        clienteDAO = new ClienteDAO();
        
        clienteDAO.update(cliente);
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);
    }
    
    public ResultSet bucarByCpf(String cpf){
        
        clienteDAO = new ClienteDAO();
        return clienteDAO.getByCpf(cpf);
    }
>>>>>>> origin/novaRamificacao

    public void salvarCliente(Cliente cliente) {

        clienteDAO = new ClienteDAO();
//        se todos os campos estiverem preenchidos ele add ao banco de dados

<<<<<<< HEAD
        try {
            clienteDAO.insert(cliente);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, JOptionPane.PLAIN_MESSAGE, null);
=======
     
            clienteDAO.insert(cliente);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);
>>>>>>> origin/novaRamificacao
//                bLimparAddClienteActionPerformed(evt);//limparcampos
            
    }

<<<<<<< HEAD
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
=======
    public boolean verificaCpfExistente(String cpf) {
        clienteDAO = new ClienteDAO();
>>>>>>> origin/novaRamificacao

        ResultSet rs = clienteDAO.getByCpf(cpf);

        try {
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddClienteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
