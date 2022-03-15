package br.edu.infnet.pedido.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.pedido.model.domain.Cliente;
import br.edu.infnet.pedido.model.domain.Contratacao;
import br.edu.infnet.pedido.model.domain.Servico;
import br.edu.infnet.pedido.model.domain.Voo;

public class ContratacaoTest {

	public static void main(String[] args) {
		
		Voo voo1 = new Voo( "10/01/2022","25/01/2022",1);
		voo1.setClasse(1);
		voo1.setCompanhia("tam");
		voo1.setVip_floor(true);
		System.out.println(voo1);
		
		
		List<Servico> servicos = new ArrayList<Servico>();
		
		servicos.add(voo1);
		
		Cliente cliente = new Cliente("Walter","123456789","9847654321");
		
		Contratacao contratacao = new Contratacao(); 
		contratacao.setCliente(cliente);
		contratacao.setServico(servicos);
		contratacao.setDestino("Inglaterra");
		contratacao.setLoja(false);
		System.out.println(contratacao);
		
	}

}
