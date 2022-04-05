package br.edu.infnet.pedido.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContratacaoController {
	
	@GetMapping(value = "/Contratacao")
	public String cadastro() {
		return "Contratacao/cadastro";
	}
	
	@GetMapping(value = "/Contratacoes")
	public String lista() {
		return "Contratacao/lista";
	}
	@PostMapping(value ="/Contratacao/incluir")
	public String incluir (Model model) {
		return "redirect:/lista";
	}	
}
