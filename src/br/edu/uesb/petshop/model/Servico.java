/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.model;

/**
 *
 * @author matheus
 */
public class Servico extends ECS {

    public Servico(String nome, String preco) {
        super(nome, preco);
    }
    
      public Servico(int id, String nome, String preco) {
        super(id, nome, preco);
    }
    
        @Override
    public String toString(){
        return "Nome: " + getNome() + "\nPreço: R$" + getPreco();
        
    }
    
}
