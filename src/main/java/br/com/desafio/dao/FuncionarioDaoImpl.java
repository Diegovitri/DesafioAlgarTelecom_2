package br.com.desafio.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.desafio.model.Funcionario;

@Repository
public class FuncionarioDaoImpl implements FuncionarioDao {

	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public List<Map<String, Object>> todosFuncionarios() {
		return JdbcTemplate.queryForList("select * from Funcionario");
	}

	//estra trazendo o funcionario com código=null e departamento=null
	@Override
	public Funcionario buscaFuncionario(Integer codigo) {
		 return JdbcTemplate.queryForObject("select * from Funcionario where cod_funcionario = ?",
		 new BeanPropertyRowMapper<Funcionario>(Funcionario.class),codigo);
	}
//	@Override
//	public List<Map<String, Object>> buscaFuncionario(Integer codigo) {
//		 return JdbcTemplate.queryForList("select * from Funcionario where cod_funcionario='" +codigo+ "'");
//	}

	@Override
	public Funcionario insereFun(Funcionario funcionario) {
		String nome = funcionario.getNome(), cargo=funcionario.getCargo();
		Integer idade=funcionario.getIdade(),codigo = funcionario.getCod_departamento().getCod_departamento();
		String sql = "insert into Funcionario (nome, cargo, idade, cod_departamento)" + " VALUES ("+nome+","+cargo+","+idade+","+codigo+")";
		return JdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Funcionario>(Funcionario.class),funcionario);

	}
	
	@Override
	public void insereFuncionario(Funcionario funcionario) {
		//com problema ao pegar o codigo do departamento. não esta atualizando
		System.out.println(funcionario.toString());
		//System.out.println(funcionario.getCod_departamento().getCod_departamento());
		if (funcionario.getCod_funcionario() != null) {
			// update
			String sql = "update Funcionario set nome=?, cargo=?, idade=?, cod_departamento=? where cod_funcionario=?";
			JdbcTemplate.update(sql, funcionario.getNome(), funcionario.getCargo(), funcionario.getIdade(),
					funcionario.getCod_departamento().getCod_departamento(), funcionario.getCod_funcionario());
		} else {
			// insert
			String sql = "insert into Funcionario (nome, cargo, idade, cod_departamento)" + " VALUES (?, ?, ?, ?)";
			JdbcTemplate.update(sql, funcionario.getNome(), funcionario.getCargo(), funcionario.getIdade(),
					funcionario.getCod_departamento().getCod_departamento());
		}

	}

	@Override
	public void deleteFuncionario(Integer codigo) {
		String sql = "delete from Funcionario where cod_funcionario=?";
		JdbcTemplate.update(sql, codigo);
	}

	@Override
	public List<Map<String, Object>> funcionarioPorDepartamento(Integer cod_departamento) {
		return JdbcTemplate.queryForList("select * from Funcionario where cod_departamento='" +cod_departamento +"'");
	}

	@Override
	public void editarFuncionario(Funcionario funcionario){
		//try{
		System.out.println(funcionario.toString());
			String sql = "update Funcionario set nome=?, cargo=?, idade=?, cod_departamento=? where cod_funcionario=?";
			JdbcTemplate.update(sql,funcionario.getNome(),funcionario.getCargo(), funcionario.getIdade(),funcionario.getCod_departamento().getCod_departamento(),
					funcionario.getCod_funcionario());
//			return true;
//		}catch (Exception e) {
//			System.out.println(e);
//			return false;
//		}
		
	}
}
