package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Hospedagem;
import br.edu.infnet.pedido.model.domain.Transporte;
import br.edu.infnet.pedido.model.domain.Voo;

public class ServicoTest {

	public static void main(String[] args) {

		Voo voo = new Voo( "10/01/2022","25/01/2022",1);
		voo.setClasse(1);
		voo.setCompanhia("tam");
		voo.setVip_floor(true);
		System.out.println(voo);
		
		Hospedagem hospedagem = new Hospedagem ("10/01/2022","25/01/2022",1);
		hospedagem.setConcierge(true);
		hospedagem.setHotel("ibis");
		hospedagem.setNumstar(3);
		System.out.println(hospedagem);
		
		
		Transporte transporte = new Transporte ("10/01/2022","25/01/2022",1);
		transporte.setEmpresa("crefisa");
		transporte.setSeguro(false);
		transporte.setTipo_veiculo("carro");
		System.out.println(transporte);
	}

}
