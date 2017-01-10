package br.com.desafio.dao;

import java.util.List;
import java.util.Map;

import br.com.desafio.model.Departamento;

public interface DepartamentoDao {
	
	public void insereDepartamento(Departamento departamento);
	
	public List<Map<String, Object>> todosDepartamentos();	
	
	public void deleteDepartamento(Integer codigo);
	
	public Departamento buscaDepartamento(Integer codigo);
	//public List<Map<String, Object>> buscaDepartamento(Integer codigo);

}
