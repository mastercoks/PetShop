/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import br.edu.uesb.petshop.model.Funcionario;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author matheus
 */
public class FuncionarioDAO extends AbstractDAO{
    
    public ResultSet getById(int id) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE id = " + id);
        return rs;
    }
    
    public ResultSet getByLogin(String login){
        ResultSet rs = executeQuery("SELECT *\n" +
"  FROM \"Funcionario\"\n" +
"  WHERE login = '"+login+"';");
        return rs;
    }

    public ResultSet getByNome(String nome) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE nome  ILIKE '%" + nome + "%'");
        return rs;
    }

    public ResultSet getByDataNasc(Date data) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE datanascimento = " + data);
        return rs;
    }

    public ResultSet getBySexo(String sexo) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE sexo ILIKE" + sexo);
        return rs;
    }

    public ResultSet getByEndereco(String endereco) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE endereco ILIKE '%" + endereco + "%'");
        return rs;
    }

    public ResultSet getByBairro(String bairro) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE bairro ILIKE '%" + bairro + "%'");
        return rs;
    }

    public ResultSet getByComplemento(String complemento) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE complemento = \'%" + complemento + "%\'");
        return rs;
    }

    public ResultSet getByCpf(String cpf) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE nome = " + cpf);
        return rs;
    }

    public ResultSet getByTelefone1(String telefone1) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE telefone1 = " + telefone1);
        return rs;
    }

    public ResultSet getByTelefone2(String telefone2) {
        ResultSet rs = executeQuery("SELECT * FROM \"Funcionario\" WHERE telefone2 = " + telefone2);
        return rs;
    }

    public void insert(Funcionario funcionario) {
        String sql = "INSERT INTO \"Funcionario\"(\n"
                + "            nome, endereco, bairro, complemento, sexo, cpf, datanascimento, telefone1, \n"
                + "            telefone2, login, senha)\n"
                + "    VALUES ('" + funcionario.getNome() + "','" + funcionario.getEndereco() 
                + "','" + funcionario.getBairro() + "','" + funcionario.getComplemento() 
                + "','" + funcionario.getSexo() + "','" + funcionario.getCpf()
                + "', '" + funcionario.getDataNasc() + "', '" + funcionario.getTelefone1() 
                + "','" + funcionario.getTelefone2() + "', '" + funcionario.getLogin()
                + "','" + funcionario.getSenha() + "');";
        executeUpdate(sql);
    }

    public void delete(Funcionario funcionario) {
        String sql = "DELETE FROM \"Funcionario\" WHERE id = " + funcionario.getId();
        executeUpdate(sql);
    }

    public void update(Funcionario funcionario) {
        String sql = "UPDATE \"Funcionario\""
                + "   SET nome=" + funcionario.getNome() + ", datanascimento="
                + funcionario.getDataNasc() + ", sexo=" + funcionario.getSexo()
                + ", endereco=" + funcionario.getEndereco() + ", bairro="
                + funcionario.getBairro() + ", " + "complemento=" + funcionario.getComplemento() 
                + ", cpf=" + funcionario.getCpf() + ", telefone1=" + funcionario.getTelefone1()
                + ", telefone2=" + funcionario.getTelefone2() + ", login="
                + funcionario.getLogin()+ ", senha = "+ funcionario.getSenha() 
                + " WHERE id = " + funcionario.getId() + ";";
        executeUpdate(sql);
    }
}
