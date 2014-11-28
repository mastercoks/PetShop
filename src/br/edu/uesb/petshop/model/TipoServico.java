/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.model;

/**
 *
 * @author Matheus
 */
public class TipoServico {
	private String nomeServico;
	private float custo;

	public TipoServico(String nomeServico, float custo) {
		this.nomeServico = nomeServico;
		this.custo = custo;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

}
