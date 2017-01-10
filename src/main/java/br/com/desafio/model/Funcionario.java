package br.com.desafio.model;

import java.io.Serializable;

public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer cod_funcionario;
	private String nome;
	private String cargo;
	private Integer idade;
	
	private Departamento cod_departamento;

	public Funcionario() {
		super();
	}
	

	public Funcionario(Integer cod_funcionario, String nome, String cargo, Integer idade,
			Departamento cod_departamento) {
		super();
		this.cod_funcionario = cod_funcionario;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.cod_departamento = cod_departamento;
	}





	public Integer getCod_funcionario() {
		return cod_funcionario;
	}





	public void setCod_funcionario(Integer cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCargo() {
		return cargo;
	}





	public void setCargo(String cargo) {
		this.cargo = cargo;
	}





	public Integer getIdade() {
		return idade;
	}





	public void setIdade(Integer idade) {
		this.idade = idade;
	}





	public Departamento getCod_departamento() {
		return cod_departamento;
	}





	public void setCod_departamento(Departamento cod_departamento) {
		this.cod_departamento = cod_departamento;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod_funcionario == null) ? 0 : cod_funcionario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cod_funcionario == null) {
			if (other.cod_funcionario != null)
				return false;
		} else if (!cod_funcionario.equals(other.cod_funcionario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [cod_funcionario=");
		builder.append(cod_funcionario);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cargo=");
		builder.append(cargo);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", cod_departamento=");
		builder.append(cod_departamento);
		builder.append("]");
		return builder.toString();
	}
	
}
