package br.com.desafio.model;

import java.io.Serializable;

public class Departamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer cod_departamento;
	private String nome_departamento;

	
	
	public Departamento() {
		super();
	}
		
	public Departamento(Integer cod_departamento, String nome_departamento) {
		super();
		this.cod_departamento = cod_departamento;
		this.nome_departamento = nome_departamento;
	}
	public Departamento(Integer cod_departamento){
		this.cod_departamento = cod_departamento;
	}
	

	public Integer getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(Integer cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public String getNome_departamento() {
		return nome_departamento;
	}

	public void setNome_departamento(String nome_departamento) {
		this.nome_departamento = nome_departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod_departamento == null) ? 0 : cod_departamento.hashCode());
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
		Departamento other = (Departamento) obj;
		if (cod_departamento == null) {
			if (other.cod_departamento != null)
				return false;
		} else if (!cod_departamento.equals(other.cod_departamento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Departamento [cod_departamento=");
		builder.append(cod_departamento);
		builder.append(", nome_departamento=");
		builder.append(nome_departamento);
		builder.append("]");
		return builder.toString();
	}

}
