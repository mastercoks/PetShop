/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import br.edu.uesb.petshop.model.Animal;
import java.sql.ResultSet;

/**
 *
 * @author matheus
 */
public class AnimalDAO extends AbstractDAO {

    public ResultSet getById(int id) {
        ResultSet rs = executeQuery("SELECT * FROM \"Animal\" WHERE id = " + id);
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM \"Animal\" WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getBySexo(String sexo) {
        ResultSet rs = executeQuery("SELECT * FROM \"Animal\" WHERE sexo ILIKE" + sexo);
        return rs;
    }

    public void insert(Animal animal) {
        String sql = "INSERT INTO \"Animal\"(\n"
                + "            nome, sexo, raca, especie, dono)\n"
                + "    VALUES ('" + animal.getNome() + ", " + animal.getSexo()
                + ", " + animal.getRaca() + ", " + animal.getEspecie() + ", " 
                + animal.getDono() + "');";
        executeUpdate(sql);
    }

    public void delete(Animal animal) {
        String sql = "DELETE FROM \"Animal\" WHERE id = " + animal.getId();
        executeUpdate(sql);
    }

    public void update(Animal animal) {
        String sql = "UPDATE \"Animal\""
                + "   SET nome=" + animal.getNome() + ", sexo=" + animal.getSexo()
                + ", raca=" + animal.getRaca() + ", especie=" + animal.getEspecie()
                + ", dono=" + animal.getDono() + " WHERE id = " + animal.getId() + ";";
        executeUpdate(sql);
    }
}
