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
import br.edu.uesb.petshop.model.Exame;

public class ExameDAO extends AbstractDAO {

    public ResultSet getById(int id) {
        ResultSet rs = executeQuery("SELECT * FROM exame WHERE id = " + id);
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM exame WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getByPreco(String preco) {
        ResultSet rs = executeQuery("SELECT * FROM exame WHERE preco = \'%" + preco + "%\'");
        return rs;
    }

    public void insert(Exame exame){
        String sql = "INSERT INTO exame(\n"
                + "            nome, preco)\n"
                + "    VALUES ('" + exame.getNome() + "','" + exame.getPreco() + "');";
        executeUpdate(sql);
    }
    
    public void delete(Exame exame) {
        String sql = "DELETE FROM exame WHERE id = " + exame.getId();
        executeUpdate(sql);
    }
    
    public void update(Exame exame) {
        String sql = "UPDATE exame"
                + "   SET nome=" + exame.getNome() + ", preco="
                + exame.getPreco()+ " WHERE id = " + exame.getId() + ";";
        executeUpdate(sql);
    }
}
