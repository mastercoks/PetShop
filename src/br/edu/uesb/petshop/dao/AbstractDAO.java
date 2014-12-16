/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import java.sql.ResultSet;

/**
 *
 * @author matheus
 */
public abstract class AbstractDAO {
//    protected Connection con;
    private Conexao conexao = new Conexao("localhost", "5432", "PetShop", "postgres", "210693");
    
    
    public void startConexao(){
        conexao.conect();
    }
    
    public void closeConexao(){
        conexao.disconect();
    }
    
    protected ResultSet executeQuery(String sql){
        startConexao();
        ResultSet rs = conexao.query(sql);
        closeConexao();
        return rs;
    }
    
    protected int executeUpdate(String sql){
        startConexao();
        int rs = conexao.queryUpdate(sql);
        closeConexao();
        return rs;
    }
}
