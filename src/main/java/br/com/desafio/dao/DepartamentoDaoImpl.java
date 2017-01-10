package br.com.desafio.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.desafio.model.Departamento;

@Repository
public class DepartamentoDaoImpl implements DepartamentoDao {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;

	 //Não esta inserindo erro: Column 'nome_departamento' cannot be null
	@Override
	public void insereDepartamento(Departamento departamento) {
		if (departamento.getCod_departamento() != null) {
			// update
			String sql = "update Departamento set nome_departamento=?";
			JdbcTemplate.update(sql, departamento.getNome_departamento());
		} else {
			// insert
			String sql = "insert into Departamento (nome_departamento) VALUES (?)";
			JdbcTemplate.update(sql, departamento.getNome_departamento());
		}		
	}

	@Override
	public List<Map<String, Object>> todosDepartamentos() {
		return JdbcTemplate.queryForList("select * from Departamento");
	}

	@Override
	public void deleteDepartamento(Integer codigo) {
		String sql = "delete from Departamento where cod_departamento=?";
		JdbcTemplate.update(sql, codigo);		
	}

	@Override
	public Departamento buscaDepartamento(Integer codigo) {
		 return JdbcTemplate.queryForObject("select * from Departamento where cod_departamento = ?",
		 new BeanPropertyRowMapper<Departamento>(Departamento.class),codigo);
	}
//	@Override
//	public List<Map<String, Object>> buscaDepartamento(Integer codigo) {
//		return JdbcTemplate.queryForList("select * from Departamento where cod_departamento='" +codigo + "'");
//	}


}
