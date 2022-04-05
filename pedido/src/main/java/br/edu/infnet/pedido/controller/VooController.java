package br.edu.infnet.pedido.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.pedido.model.domain.Voo;

@Controller
public class VooController {
	@GetMapping(value = "/Voo")
	public String cadastro() {
		return "Voo/cadastro";
	}
	
	@GetMapping(value = "/Voos")
	public String lista(Model model) {
		
		List<Voo> Voos = null;
		
		
		model.addAttribute("comps_areas",Voos);
		
		return "Voo/lista";
	}
	
	
	@PostMapping(value ="/Voo/incluir")
	public String incluir (Model model) {
		return "redirect:/lista";
	}	

}
