package br.edu.infnet.pedido.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContratacaoController {
	
	@GetMapping(value = "/Contratacao")
	public String cadastro() {
		return "Contratacao/cadastro";
	}
	
	@PostMapping(value ="/Contratacao/incluir")
	public String incluir () {
		return "index";
	}	
}
