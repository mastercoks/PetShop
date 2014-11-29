/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import br.edu.uesb.petshop.model.Cliente;
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
        ClienteDAO clienteDAO = new ClienteDAO();
        
        
//        ResultSet rs = clienteDAO.getById(2);
        ResultSet rs = clienteDAO.getById(8);
        Date dataNascRav = new Date(95,5,9);
        
        try {
            while (rs.next()) {
                System.out.println("NOME: " + rs.getString("nome") + 
                        " CPF: " + rs.getString("cpf"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
      Cliente raveni = new Cliente("raveni", "rua do centro", "centro", "ap 302", "", "041.542.421-20", "(77) 8874-1313", dataNascRav, "Feminino");
      raveni.setId(10);
        clienteDAO.delete(raveni);
    }

}

