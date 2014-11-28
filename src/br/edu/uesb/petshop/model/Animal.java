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
	private String nomeAnimal;
	private String raca;
	private String especie;

	// Relacionamentos
	private Cliente dono;

	// Construtor
	public Animal(String nome, String raca, String especie, Cliente dono) {
		this.nomeAnimal = nome;
		this.raca = raca;
		this.especie = especie;
		this.dono = dono;
	}

	// Sets e Gets
	public String getNomeAnimal() {
		return nomeAnimal;
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

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
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

	// toString de Animal para imprimir os dados
	@Override
	public String toString() {
		return "Nome do Animal: "
				+ getNomeAnimal() + "\nRa�a: " + getRaca() + "\nEspecie: "
				+ getEspecie() + "\nDono: " + getDono().getNome();
	}
}
