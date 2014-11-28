/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import java.sql.*;
import br.edu.uesb.petshop.model.Cliente;
/**
 *
 * @author matheus
 */
public class ClienteDAO extends AbstractDAO{
    
    public ResultSet getById(int id){
        ResultSet rs = executeQuery("SELECT * FROM \"Cliente\" WHERE id = " + id);
        return rs;
    }
    
    public ResultSet getByNome(String nome){
            ResultSet rs = executeQuery("SELECT * FROM \"Cliente\" WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }
    
    public ResultSet getByDataNasc(Date data){
        ResultSet rs = executeQuery("SELECT * FROM \"Cliente\" WHERE datanascimento = \'%" + data + "%\'");
        return rs;
    }
    
    public ResultSet getBySexo(String sexo){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE sexo = \'%" + sexo + "%\'");
        return rs;
    }
    
    public ResultSet getByEndereco(String endereco){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE endereco = \'%" + endereco + "%\'");
        return rs;
    }
    
    public ResultSet getByBairro(String bairro){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE bairro = \'%" + bairro + "%\'");
        return rs;
    }
    
    public ResultSet getByComplemento(String complemento){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE complemento = \'%" + complemento + "%\'");
        return rs;
    }
    
    public ResultSet getByCpf(String cpf){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE nome = \'%" + cpf + "%\'");
        return rs;
    }
    
    public ResultSet getByTelefone1(String telefone1){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE telefone1 = \'%" + telefone1 + "%\'");
        return rs;
    }
    
    public ResultSet getByTelefone2(String telefone2){
        ResultSet rs = executeQuery("SELECT * FROM Cliente WHERE telefone2 = \'%" + telefone2 + "%\'");
        return rs;
    }
    
    public int insert(Cliente cliente){
        String sql = "INSERT INTO \"Cliente\"(\n"
                        + "            nome, endereco, bairro, complemento, sexo, cpf, datanascimento, telefone1, \n"
                        + "            telefone2)\n"
                        + "    VALUES ('" + cliente.getNome() + "','" + cliente.getEndereco() + "','" + cliente.getBairro()
                        + "','" + cliente.getComplemento() + "','" + cliente.getSexo() + "','" + cliente.getCpf()
                        + "', '" + cliente.getDataNasc() + "', '" + cliente.getTelefone1() + "','" + cliente.getTelefone2() + "');";
        return executeUpdate(sql);
    }
    
    public void delete(Cliente cliente){
        String sql = "DELETE FROM \"Cliente\" WHERE id = " + cliente.getId();
        executeUpdate(sql);
    }
    
}
