package br.edu.infnet.pedido.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HospedagemController {

	@GetMapping(value = "/Hospedagem")
	public String cadastro() {
		return "Hospedagem/cadastro";
	}
	
	@PostMapping(value ="/Hospedagem/incluir")
	public String incluir () {
		return "index";
	}	
	
}
