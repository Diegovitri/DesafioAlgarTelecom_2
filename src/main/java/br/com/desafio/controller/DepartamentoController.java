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

import br.com.desafio.model.Departamento;
import br.com.desafio.service.DepartamentoService;

@RestController
public class DepartamentoController {
	
	@Autowired
	DepartamentoService departamentoService;
	
	@RequestMapping(method=RequestMethod.POST, value="insereDepartamento", consumes= MediaType.APPLICATION_JSON_VALUE)
	public void insereDepartamento(@RequestBody Departamento departamento){
		departamentoService.insereDepartamento(departamento);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/departamentos")
	@ResponseBody
	public List<Map<String, Object>> todosDepartamentos(){
		return departamentoService.todosDepartamentos();
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/deleteDepartamento")
	public void deleteDepartamento(@RequestParam("codigo") Integer codigo){
		departamentoService.deleteDepartamento(codigo);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/buscaDepartamento")
	public Departamento buscaDepartamento(@RequestParam("codigo") Integer codigo){
		return departamentoService.buscaDepartamento(codigo);
	}
//	@RequestMapping(method=RequestMethod.GET, value="/buscaDepartamento")
//	public List<Map<String, Object>> buscaDepartamento(@RequestParam("codigo") Integer codigo){
//		return departamentoService.buscaDepartamento(codigo);
//	}
	

}
