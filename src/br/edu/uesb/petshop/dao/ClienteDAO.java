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
public class ClienteDAO extends AbstractDAO {

    public ResultSet getById(int id) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE id = " + id);
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getByDataNasc(Date data) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE datanascimento = " + data);
        return rs;
    }

    public ResultSet getBySexo(String sexo) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE sexo ILIKE" + sexo);
        return rs;
    }

    public ResultSet getByEndereco(String endereco) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE endereco ILIKE '%" + endereco + "%'");
        return rs;
    }

    public ResultSet getByBairro(String bairro) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE bairro ILIKE '%" + bairro + "%'");
        return rs;
    }

    public ResultSet getByComplemento(String complemento) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE complemento = \'%" + complemento + "%\'");
        return rs;
    }

    public ResultSet getByCpf(String cpf) {
        ResultSet rs = executeQuery("SELECT *\n"
                + "  FROM cliente\n"
                + "  WHERE cpf = '"+cpf+"';");
        return rs;
    }

    public ResultSet getByTelefone1(String telefone1) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE telefone1 = " + telefone1);
        return rs;
    }

    public ResultSet getByTelefone2(String telefone2) {
        ResultSet rs = executeQuery("SELECT * FROM cliente WHERE telefone2 = " + telefone2);
        return rs;
    }

    public void insert(Cliente cliente) {
        String sql = "INSERT INTO cliente(\n"
                + "            nome, endereco, bairro, complemento, sexo, cpf, datanascimento, telefone1, \n"
                + "            telefone2)\n"
                + "    VALUES ('" + cliente.getNome() + "','" + cliente.getEndereco()
                + "','" + cliente.getBairro() + "','" + cliente.getComplemento()
                + "','" + cliente.getSexo() + "','" + cliente.getCpf()
                + "', '" + cliente.getDataNasc() + "', '" + cliente.getTelefone1()
                + "','" + cliente.getTelefone2() + "');";
        executeUpdate(sql);
    }

    public void delete(Cliente cliente) {
        String sql = "DELETE FROM cliente WHERE id = " + cliente.getId();
        executeUpdate(sql);
    }

    public void update(Cliente cliente) {
        String sql = "UPDATE cliente"
                + "   SET nome='" + cliente.getNome() + "', datanascimento='"
                + cliente.getDataNasc() + "', sexo='" + cliente.getSexo()
                + "', endereco='" + cliente.getEndereco() + "', bairro='"
                + cliente.getBairro() + "', complemento='" + cliente.getComplemento()
                + "', cpf='" + cliente.getCpf() + "', telefone1='" + cliente.getTelefone1()
                + "', telefone2='" + cliente.getTelefone2() + "' WHERE id = " + cliente.getId() + ";";
        executeUpdate(sql);
    }

}
