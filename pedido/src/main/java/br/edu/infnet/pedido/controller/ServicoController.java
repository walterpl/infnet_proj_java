package br.edu.infnet.pedido.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServicoController {

	@GetMapping(value = "/Servico")
	public String cadastro() {
		return "Servico/cadastro";
	}
	
	@GetMapping(value = "/Servicos")
	public String lista() {
		return "Servico/lista";
	}
	
	@PostMapping(value ="/Servico/incluir")
	public String incluir () {
		return "Servico/lista";
	}	
	
}
