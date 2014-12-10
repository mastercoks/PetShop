package br.edu.uesb.petshop.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public final class Animal {

	// Atributos do Animal
    private int id;
    private String nome;
    private String sexo;
    private String raca;
    private String especie;

    // Relacionamentos
    private Cliente dono;

    // Construtor
    public Animal(String nome, String sexo, String raca, String especie, Cliente dono) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.especie = especie;
        this.dono = dono;
    }
    
    public Animal(int id, String nome, String sexo, String raca, String especie, Cliente dono) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.especie = especie;
        this.dono = dono;
    }

    // Sets e Gets
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public Cliente getDono() {
        return dono;
    }

    public String getEspecie() {
        return especie;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public int getId() {
        return id;
    }

    public void setNome(String nomeAnimal) {
        this.nome = nomeAnimal;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    

    // toString de Animal para imprimir os dados
    @Override
    public String toString() {
        return "Nome do Animal: "
                + getNome() + "\nRa�a: " + getRaca() + "\nEspecie: "
                + getEspecie() + "\nDono: " + getDono().getNome();
    }
}
