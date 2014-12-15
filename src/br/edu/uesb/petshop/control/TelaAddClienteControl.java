/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.model.Cliente;
import br.edu.uesb.petshop.dao.ClienteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TelaAddClienteControl {

    private ClienteDAO clienteDAO;
    

    public void salvarCliente(Cliente cliente) {

        clienteDAO = new ClienteDAO();
//        se todos os campos estiverem preenchidos ele add ao banco de dados
       
            try {
                clienteDAO.insert(cliente);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, JOptionPane.PLAIN_MESSAGE, null);
//                bLimparAddClienteActionPerformed(evt);//limparcampos

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            }
        

    }

}
