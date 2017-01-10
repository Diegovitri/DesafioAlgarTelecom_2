package br.com.desafio.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.dao.FuncionarioDao;
import br.com.desafio.model.Funcionario;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioDao funcionarioDao;

	@Override
	public List<Map<String, Object>> todosFuncionarios() {
		return this.funcionarioDao.todosFuncionarios();
	}

	@Override
	public void deleteFuncionario(Integer codigo) {
		funcionarioDao.deleteFuncionario(codigo);		
	}
	
	@Override
	public Funcionario insereFun(Funcionario funcionario) {
		return funcionarioDao.insereFun(funcionario);
	}

	@Override
	public void insereFuncionario(Funcionario funcionario) {
		funcionarioDao.insereFuncionario(funcionario);
	}

	@Override
	public Funcionario buscaFuncionario(Integer codigo) {
		return this.funcionarioDao.buscaFuncionario(codigo);
	}

	@Override
	public List<Map<String, Object>> funcionarioPorDepartamento(Integer cod_departamento) {
		return this.funcionarioDao.funcionarioPorDepartamento(cod_departamento);
	}

	@Override
	public void editarFuncionario(Funcionario funcionario){
		funcionarioDao.editarFuncionario(funcionario);
	}



}
