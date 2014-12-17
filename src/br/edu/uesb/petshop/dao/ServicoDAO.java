/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import br.edu.uesb.petshop.model.Servico;
import java.sql.*;

/**
 *
 * @author matheus
 */
public class ServicoDAO extends AbstractDAO {
public ResultSet getById(int id) {
        ResultSet rs = executeQuery("SELECT * FROM servico WHERE id = " + id);
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM servico WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getByPreco(String preco) {
        ResultSet rs = executeQuery("SELECT * FROM servico WHERE preco = \'%" + preco + "%\'");
        return rs;
    }

    public void insert(Servico servico) {
        String sql = "INSERT INTO servico(\n"
                + "            nome, preco)\n"
                + "    VALUES ('" + servico.getNome() + "','" + servico.getPreco() + "');";
        executeUpdate(sql);
    }

    public void delete(Servico servico) {
        String sql = "DELETE FROM servico WHERE id = " + servico.getId();
        executeUpdate(sql);
    }

    public void update(Servico servico) {
        String sql = "UPDATE servico"
                + "   SET nome=" + servico.getNome() + ", preco="
                + servico.getPreco() + " WHERE id = " + servico.getId() + ";";
        executeUpdate(sql);
    }    
}
