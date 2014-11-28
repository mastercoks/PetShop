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
public abstract class PessoaDAO extends AbstractDAO{
    
    public void getByNome(String nome){
        executeQuery("SELECT * FROM Cliente WHERE nome = \'%" + nome + "%\'");
//        return null;
    }
    
}
