package br.edu.uesb.petshop.model;

import java.util.Date;
import br.edu.uesb.petshop.dao.ClienteDAO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public abstract class Pessoa {

//      Atributos de Pessoa
    private int id;
    private String nome;
    private String endereco;
    private String bairro;
    private String complemento;
    private String telefone2;
    private String cpf;
    private String telefone1;
    private Date dataNasc;
    private String sexo;

//      Construtor de Pessoa
    
    public Pessoa(String nome, String endereco, String bairro, String complemento, String telefone2, String cpf, String telefone1, Date dataNasc, String sexo) {
        
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone2 = telefone2;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }
    
    public Pessoa( int id, String nome, String endereco, String bairro, String complemento, String telefone2, String cpf, String telefone1, Date dataNasc, String sexo) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.telefone2 = telefone2;
        this.cpf = cpf;
        this.telefone1 = telefone1;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }

//      Sets e Gets
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
}
