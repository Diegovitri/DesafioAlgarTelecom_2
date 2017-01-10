package br.com.desafio.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.dao.DepartamentoDao;
import br.com.desafio.model.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoDao departamentoDao;

	@Override
	public void insereDepartamento(Departamento departamento) {
		departamentoDao.insereDepartamento(departamento);
	}

	@Override
	public List<Map<String, Object>> todosDepartamentos() {
		return departamentoDao.todosDepartamentos();
	}

	@Override
	public void deleteDepartamento(Integer codigo) {
		departamentoDao.deleteDepartamento(codigo);
	}

	@Override
	public Departamento buscaDepartamento(Integer codigo) {
		return departamentoDao.buscaDepartamento(codigo);
	}

	
//	@Override
//	public List<Map<String, Object>> buscaDepartamento(Integer codigo) {
//		return departamentoDao.buscaDepartamento(codigo);
//	}
}
