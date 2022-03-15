package br.edu.infnet.pedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VooController {
	@GetMapping(value = "/Voo")
	public String cadastro() {
		return "Voo/cadastro";
	}
	
	@PostMapping(value ="/Voo/incluir")
	public String incluir () {
		return "index";
	}	

}
