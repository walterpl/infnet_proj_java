package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Voo;

public class VooTest {

	public static void main(String[] args) {
		
		Voo voo1 = new Voo( "10/01/2022","25/01/2022",1);
		voo1.setClasse(1);
		voo1.setCompanhia("tam");
		voo1.setVip_floor(true);
		System.out.println(voo1);
		
		Voo voo2 = new Voo( "10/01/2022","25/01/2022",1);
		voo2.setClasse(1);
		voo2.setCompanhia("tam");
		voo2.setVip_floor(true);
		System.out.println("Valor das passagens aereas = " + voo2.calcular_Valor_servico());
		
	}

}
