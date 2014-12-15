/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

/**
 *
 * @author matheus
 */
import java.sql.*;
import br.edu.uesb.petshop.model.Cirurgia;

public class CirurgiaDAO extends AbstractDAO {

    public ResultSet getById(int id) {
        ResultSet rs = executeQuery("SELECT * FROM \"Cirurgia\" WHERE id = " + id);
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM \"Cirurgia\" WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getByPreco(String preco) {
        ResultSet rs = executeQuery("SELECT * FROM \"Cirurgia\" WHERE preco = \'%" + preco + "%\'");
        return rs;
    }

    public void insert(Cirurgia cirurgia) {
        String sql = "INSERT INTO \"Cirurgia\"(\n"
                + "            nome, preco)\n"
                + "    VALUES ('" + cirurgia.getNome() + "','" + cirurgia.getPreco() + "');";
        executeUpdate(sql);
    }

    public void delete(Cirurgia cirurgia) {
        String sql = "DELETE FROM \"Cirurgia\" WHERE id = " + cirurgia.getId();
        executeUpdate(sql);
    }

    public void update(Cirurgia cirurgia) {
        String sql = "UPDATE \"Cirurgia\""
                + "   SET nome=" + cirurgia.getNome() + ", preco="
                + cirurgia.getPreco() + " WHERE id = " + cirurgia.getId() + ";";
        executeUpdate(sql);
    }
}
