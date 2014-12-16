/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.dao.CirurgiaDAO;
import br.edu.uesb.petshop.model.Cirurgia;
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
public class TelaAddCirurgiaControl {
    
    private CirurgiaDAO cirurgiaDAO;
    
    public void salvarCirurgia(Cirurgia cirurgia){
        
        cirurgiaDAO = new CirurgiaDAO();
//        se todos os campos estiverem preenchidos ele add ao banco de dados
       
            try {
                cirurgiaDAO.insert(cirurgia);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, JOptionPane.PLAIN_MESSAGE, null);
//                bLimparAddClienteActionPerformed(evt);//limparcampos

            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);
            }
    }

    
    public ArrayList<Cirurgia> listarCirurgias() {
        ArrayList<Cirurgia> cirurgias = new ArrayList<>();
        cirurgiaDAO = new CirurgiaDAO();
        ResultSet rs = cirurgiaDAO.getByNome("");
        Cirurgia cirurgia = null;
        try {
            while (rs.next()) {
                cirurgia = new Cirurgia(rs.getString("nome"), rs.getString("preco"));
                cirurgias.add(cirurgia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddExameControl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return cirurgias;
    }
    
}
