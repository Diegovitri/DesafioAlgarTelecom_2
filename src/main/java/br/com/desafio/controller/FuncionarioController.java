package br.com.desafio.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.model.Funcionario;
import br.com.desafio.service.FuncionarioService;

@RestController
public class FuncionarioController {
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@RequestMapping(method=RequestMethod.POST, value="insereFuncionario", consumes= MediaType.APPLICATION_JSON_VALUE)
	public void insereFuncionario(@RequestBody Funcionario funcionario) throws ClassNotFoundException{
		funcionarioService.insereFuncionario(funcionario);
	}
	@RequestMapping(method=RequestMethod.POST, value="insereFun", consumes= MediaType.APPLICATION_JSON_VALUE)
	public Funcionario insereFun(@RequestBody Funcionario funcionario) {
		return funcionarioService.insereFun(funcionario);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/funcionarios")
	@ResponseBody
	public List<Map<String, Object>> todosFuncionarios(){
		return funcionarioService.todosFuncionarios();
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteFuncionario")
	public void deleteFuncionario(@RequestParam("codigo") Integer codigo){
		funcionarioService.deleteFuncionario(codigo);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/buscaFuncionario")
	public Funcionario buscaFuncionario(@RequestParam("codigo") Integer codigo){
		return funcionarioService.buscaFuncionario(codigo);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/funcionarioPorDepartamento")
	public List<Map<String, Object>> funcionarioPorDepartamento(@RequestParam("codigo") Integer cod_departamento) {
		return funcionarioService.funcionarioPorDepartamento(cod_departamento);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/editarFuncionario")
	public void editarFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioService.editarFuncionario(funcionario);
	}

}
