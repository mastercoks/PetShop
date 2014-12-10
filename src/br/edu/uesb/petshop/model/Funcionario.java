package br.edu.uesb.petshop.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Funcionario extends Pessoa {

	// Atributos de Funcionario
	private String login;
	private String senha;

	// Construtor de Funcionario
	public Funcionario(String login, String senha, String nome, String endereco,
                String bairro, String complemento, String telefone2, String cpf, 
                String telefone1, Date dataNasc, String sexo) {
        super(nome, endereco, bairro, complemento, telefone2, cpf, telefone1, dataNasc, sexo);
        this.login = login;
        this.senha = senha;
	}
        
        public Funcionario(int id, String login, String senha, String nome, 
                String endereco, String bairro, String complemento, String telefone2, 
                String cpf, String telefone1, Date dataNasc, String sexo) {
        super(id, nome, endereco, bairro, complemento, telefone2, cpf, telefone1, dataNasc, sexo);
        this.login = login;
        this.senha = senha;
	}

	// Metodo para Logar no sistema
	public Funcionario logar(String login, String senha) {
		Funcionario funcionario = buscarbyLogin(login, null);
		if (funcionario != null) {
			if (funcionario.equals(checarSenha(senha))) {
				return funcionario;
			}
		}
		return null;
	}

	// Metodo para buscar o login e ver se ele � v�lido
	private Funcionario buscarbyLogin(String login,
			ArrayList<Funcionario> funcionarios) {
            for (Funcionario funcionario1 : funcionarios) {
                Funcionario funcionario = (Funcionario) funcionario1;
                if (funcionario.equals(login)) {
                    return funcionario;
                }
            }
		return null;
	}

	// Sets e Gets

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	// Metodo para checar a senha
	public boolean checarSenha(String senha) {
		return this.senha.equals(senha);
	}

	// toString de Funcionario para imprimir os dados
	@Override
	public String toString() {

		DateFormat data = DateFormat.getDateInstance();
		return "Nome: " + getNome() + " \nCPF: "
				+ getCpf() + " \nTelefone: " + getTelefone1()
				+ " \nData de Nascimento : " + data.format(getDataNasc())
				+ " \nSexo: " + getSexo() + "\nLogin: " + getLogin()
				+ "\nSenha: " + getSenha();
	}
}
