
package br.edu.uesb.petshop.model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Cliente extends Pessoa{
        
//      Construtor de Cliente

    public Cliente(int id, String nome, String endereco, String bairro, String complemento, String telefone2, String cpf, String telefone1, Date dataNasc, String sexo) {
        super(nome, endereco, bairro, complemento, telefone2, cpf, telefone1, dataNasc, sexo);
    }
    
    public Cliente(String nome, String endereco, String bairro, String complemento, String telefone2, String cpf, String telefone1, Date dataNasc, String sexo) {
        super(nome, endereco, bairro, complemento, telefone2, cpf, telefone1, dataNasc, sexo);
    }
    
    
//      toString de Cliente para imprimir os dados
    @Override
    public String toString() {
        
        DateFormat data = DateFormat.getDateInstance();
        return "Nome: " + getNome()+ " \nCPF: " + getCpf() + " \nTelefone: "
                + getTelefone1() + " \nData de Nascimento : " + data.format(getDataNasc())
                + " \nSexo: " + getSexo();
    }
    


}
