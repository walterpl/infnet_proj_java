package br.edu.infnet.pedido.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TransporteController {

	@GetMapping(value = "/Transporte")
	public String cadastro() {
		return "Transporte/cadastro";
	}
	
	@PostMapping(value ="/Transporte/incluir")
	public String incluir () {
		return "index";
	}	
	
	
}
