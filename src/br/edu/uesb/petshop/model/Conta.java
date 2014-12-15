package br.edu.uesb.petshop.model;

//import java.text.DateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Conta {

	DateFormat dtHora = DateFormat.getDateTimeInstance();
	private Animal animal;
	private Funcionario funcionario;
	private float custo;
	private Date data = new Date();
	private ArrayList<Servicoold> servicosRealizados;

	// Construtor

	public Conta(Animal animal, Funcionario funcionario) {
		this.animal = animal;
		this.funcionario = funcionario;
		
		if (funcionario != null)
			this.custo = this.getCusto();
		this.servicosRealizados = new ArrayList<Servicoold>();

	}

	
	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public float getCusto() {
		return custo;
	}


	public void setCusto(float custo) {
		this.custo = custo;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public ArrayList<Servicoold> getServicosRealizados() {
		return servicosRealizados;
	}
	
	public void addServicosRealizados(Servicoold servico) {
		this.servicosRealizados.add(servico);
	}
	
	public void remServicosRealizados(Servicoold servico) {
		this.servicosRealizados.remove(servico);
	}


	public void imprimeConta() {
		System.out.println("\n\nCliente: " + animal.getDono().getNome());
		System.out.println("Data: " + dtHora.format(data));
		System.out.println("Atendente: " + funcionario.getNome());
		System.out.println("Nome do animal: " + animal.getNome());
		System.out.println("-----------------------------");
		System.out.println("Servi�os:");
		for (int i = 0; i < servicosRealizados.size(); i++) {
				System.out.println(servicosRealizados.get(i
						));
				custo = custo
						+ servicosRealizados.get(i).getTipoServico().getCusto();
		}
		System.out.println("-----------------------------");
		System.out.println("Total RS: " + custo);
	}

}
