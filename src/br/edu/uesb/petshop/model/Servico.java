package br.edu.uesb.petshop.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matheus
 */
public class Servico {

	// Relacionamentos
	private TipoServico tipoServico;

	// Construtor
	public Servico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	// Para retornar com toda a lista de serviços
	// public String[] toStrings() {
	// String[] serv = new String[servicos.size()];
	// serv[0] = "Exame";
	// serv[1] = "Cirurgia";
	// for (int i = 2; i < servicos.size() + 2; i++) {
	// serv[i] = servicos.get(i).getNomeServiço();
	// }
	// for (int i = 0; i < servicos.size(); i++) {
	// if (serv[i] == serv[0]) {
	// Exame exame = new Exame();
	// return exame.toStrings();
	// } else if (serv[i] == serv[1]) {
	// Cirurgia cirurgia = new Cirurgia();
	// return cirurgia.toStrings();
	// }
	// }
	// return serv;
	// }

	// Sets e Gets
	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return tipoServico.getNomeServico() + " R$: " + tipoServico.getCusto();
	}
}
