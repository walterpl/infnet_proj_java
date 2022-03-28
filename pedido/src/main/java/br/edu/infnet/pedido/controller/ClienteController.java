package br.edu.infnet.pedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteController {

	@GetMapping(value = "/Cliente")
	public String cadastro() {
		return "Cliente/cadastro";
	}
	
	@GetMapping(value = "/Clientes")
	public String lista() {
		return "Cliente/lista";
	}
	
	@PostMapping(value ="/Cliente/incluir")
	public String incluir () {
		return "Cliente/lista";
	}
}
