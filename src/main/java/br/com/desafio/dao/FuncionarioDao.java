package br.com.desafio.dao;

import java.util.List;
import java.util.Map;

import br.com.desafio.model.Funcionario;

public interface FuncionarioDao{
	
	public void insereFuncionario(Funcionario funcionario);
	public Funcionario insereFun(Funcionario funcionario);
	
	public List<Map<String, Object>> todosFuncionarios();	
	
	public void deleteFuncionario(Integer codigo);
	
	public Funcionario buscaFuncionario(Integer codigo);
	//public List<Map<String, Object>> buscaFuncionario(Integer codigo);
	
	//public ArrayList<Funcionario> funcionarioPorDepartamento(Integer cod_departamento);
	public List<Map<String, Object>> funcionarioPorDepartamento(Integer cod_departamento);
	
	public void editarFuncionario(Funcionario funcionario);

}
