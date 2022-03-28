package br.edu.infnet.pedido.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.pedido.model.domain.Hospedagem;

@Controller
public class HospedagemController {

	@GetMapping(value = "/Hospedagem")
	public String cadastro() {
		return "Hospedagem/cadastro";
	}
	
	@GetMapping(value = "/Hospedagens")
public String lista(Model model) {
		
		List<Hospedagem> Hospedagens = null;
		
		
		model.addAttribute("comps_hotel",Hospedagens);
		
		return "Hospedagem/lista";
	}
	
	@PostMapping(value ="/Hospedagem/incluir")
	public String incluir () {
		return "Hospedagem/lista";
	}	
	
}
