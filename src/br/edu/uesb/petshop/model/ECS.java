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
public abstract class ECS {

//classe abstrata para Exames, Cirurgias e Serviços
//Atributos:
    private int id;
    private String nome;
    private String preco;

//Construtor:
    public ECS(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public ECS(int id, String nome, String preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;

    }

// gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
