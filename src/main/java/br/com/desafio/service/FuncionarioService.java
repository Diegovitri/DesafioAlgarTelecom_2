package br.com.desafio.service;

import java.util.List;
import java.util.Map;

import br.com.desafio.model.Funcionario;

public interface FuncionarioService {
	
	public void insereFuncionario(Funcionario funcionario);
	public Funcionario insereFun(Funcionario funcionario);
	
	public List<Map<String, Object>> todosFuncionarios();	
	
	public void deleteFuncionario(Integer codigo);
	
	public Funcionario buscaFuncionario(Integer codigo);
	//public List<Map<String, Object>> buscaFuncionario(Integer codigo);
	
	public List<Map<String, Object>> funcionarioPorDepartamento(Integer cod_departamento);
	
	public void editarFuncionario(Funcionario funcionario);

}
