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
        ResultSet rs = executeQuery("SELECT * FROM animal WHERE id = " + id);
        return rs;
    }
    
    public ResultSet getByIdDono(int id){
        ResultSet rs = executeQuery("SELECT * FROM animal WHERE id_dono = " + id);
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM animal WHERE nome = '" + nome + "'");
        return rs;
    }
    
    public ResultSet getByNomeAll(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM animal WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getBySexo(String sexo) {
        ResultSet rs = executeQuery("SELECT * FROM animal WHERE sexo ILIKE" + sexo);
        return rs;
    }

    public void insert(Animal animal) {
        String sql = "INSERT INTO animal(\n"
                + "            nome, sexo, raca, especie, id_dono)\n"
                + "    VALUES ('" + animal.getNome() + "', '" + animal.getSexo()
                + "', '" + animal.getRaca() + "', '" + animal.getEspecie() 
                + "', " + animal.getDono().getId() + ");";
        executeUpdate(sql);
    }

    public void delete(Animal animal) {
        String sql = "DELETE FROM animal WHERE id = " + animal.getId();
        executeUpdate(sql);
    }

    public void update(Animal animal) {
        String sql = "UPDATE animal"
                + "   SET nome='" + animal.getNome() + "', sexo='" + animal.getSexo()
                + "', raca='" + animal.getRaca() + "', especie='" + animal.getEspecie()
                + "', id_dono=" + animal.getDono().getId() + " WHERE id = " + animal.getId() + ";";
        executeUpdate(sql);
    }
}
