package br.edu.infnet.pedido.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.pedido.model.domain.Hospedagem;
import br.edu.infnet.pedido.model.service.HospedagemService;

@Controller
public class HospedagemController {

	@Autowired
	private HospedagemService hospedagemService;
	
	@GetMapping(value = "/Hospedagem")
	public String cadastro() {
		return "Hospedagem/cadastro";
	}
	
	@GetMapping(value = "/Hospedagens")
	public String lista(Model model) {
		
				
		model.addAttribute("comps_hotel",hospedagemService.obterLista());
		
		return "Hospedagem/lista";
	}
	
	@PostMapping(value ="/Hospedagem/incluir")
	public String incluir (Model model, Hospedagem hospedagem) {
		return "redirect:/Hospedagens";
	}	
	
	@GetMapping( value = "/hospedagem/{id}/excluir")
	public String excluir(@PathVariable	Integer id) {
		
		hospedagemService.excluir(id);
		return "redirect:/Hospedagens";
		
	}
	
	
}
