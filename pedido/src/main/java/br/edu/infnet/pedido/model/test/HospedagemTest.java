package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Hospedagem;

public class HospedagemTest {

	public static void main(String[] args) {
		

		Hospedagem hosp1 = new Hospedagem( "10/01/2022","25/01/2022",1);
		hosp1.setHotel("ibis");
		hosp1.setConcierge(false);
		hosp1.setNumstar(3);
		System.out.println(hosp1);
		
		Hospedagem hosp2 = new Hospedagem( "10/01/2022","25/01/2022",1);
		hosp1.setHotel("Palace");
		hosp1.setConcierge(false);
		hosp1.setNumstar(5);
		System.out.println("O custo da hospedagem será = " + hosp2.calcular_Valor_servico());

	}

}
