package br.edu.infnet.pedido.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Hospedagem;

@Service
public class HospedagemService {

	private static Map<Integer, Hospedagem> dict = new HashMap<Integer, Hospedagem>();
	
	private static Integer key = 1;
	
	public Collection<Hospedagem> obterLista(){
				
		return dict.values();
	}
	
	public void incluir(Hospedagem hospedagem) {
		hospedagem.setId(key++);
		
		dict.put(hospedagem.getId(), hospedagem);
		
	}
	
	public void excluir(Integer id) {
	
		dict.remove(id);
		
	}
	
	public Hospedagem obterId(Integer id) {
		return dict.get(id); 
	}
	
}

