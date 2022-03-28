package br.edu.infnet.pedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class AcessoController {
	
	
	@GetMapping(value = "/")
	public String telalogin() {
		return "login";
		}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String password) {
		
		if (email.equalsIgnoreCase(password)) {
			return "index";
		}
		
		String msg = "Usuário e senha estão inválidos, tente novamente.";
		
		model.addAttribute("mensagem",msg);
		
		return "login";
	}

	
	
}
