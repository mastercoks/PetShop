/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.dao.ServicoDAO;
import br.edu.uesb.petshop.model.Servico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TelaAddServicoControl {
    
    private ServicoDAO servicoDAO;
    
    public void salvarServico(Servico servico){
        
        servicoDAO = new ServicoDAO();
//        se todos os campos estiverem preenchidos ele add ao banco de dados
       
            try {
                servicoDAO.insert(servico);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, JOptionPane.PLAIN_MESSAGE, null);
//                bLimparAddClienteActionPerformed(evt);//limparcampos

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            }
    }
    
    
    public ArrayList<Servico> listarServicos() {
        ArrayList<Servico> servicos = new ArrayList<>();
        servicoDAO = new ServicoDAO();
        ResultSet rs = servicoDAO.getByNome("");
        Servico servico = null;
        try {
            while (rs.next()) {
                servico = new Servico(rs.getString("nome"), rs.getString("preco"));
                servicos.add(servico);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddExameControl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return servicos;
    }
    
}
