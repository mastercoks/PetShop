/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import br.edu.uesb.petshop.model.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author matheus
 */
public class teste {

    public static void main(String[] quaquercoisa) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario raveni = null;

//        ResultSet rs = clienteDAO.getById(2);
        ResultSet rs = funcionarioDAO.getByNome("");
        Date dataNascRav = new Date(95, 5, 9);

        try {
            while (rs.next()) {
                System.out.println("NOME: " + rs.getString("nome")
                        + " CPF: " + rs.getString("cpf"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        raveni = new Funcionario("Raveni", "rua centro", "centro", "", "",
                "05113515210", "(77) 9812-2314", dataNascRav, "Feminino", "raveni", "senha");
        funcionarioDAO.insert(raveni);

        System.out.println("\n\n");
        rs = funcionarioDAO.getByNome("");
        try {
            while (rs.next()) {
                System.out.println("NOME: " + rs.getString("nome")
                        + " CPF: " + rs.getString("cpf"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            while (rs.next()) {
//                raveni = new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"),
//                        rs.getString("bairro"), rs.getString("complemento"),
//                        rs.getString("telefone2"), rs.getString("cpf"),
//                        rs.getString("telefone1"), dataNascRav, rs.getString("sexo"), 
//                        rs.getString("login"), rs.getString("senha"));
//                raveni.setId(rs.getInt("id"));
//                funcionarioDAO.delete(raveni);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

}
