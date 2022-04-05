package br.edu.infnet.pedido.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.pedido.model.domain.Transporte;

@Controller
public class TransporteController {

	@GetMapping(value = "/Transporte")
	public String cadastro() {
		return "Transporte/cadastro";
	}
	
	@GetMapping(value = "/Transportes")
	public String lista(Model model) {
		
		List<Transporte> Transportes = null;
		
		
		model.addAttribute("comps_trans",Transportes);
		
		return "Transporte/lista";
	}
	
	@PostMapping(value ="/Transporte/incluir")
	public String incluir (Model model) {
		return "redirect:/lista";
	}	
	
	
}
