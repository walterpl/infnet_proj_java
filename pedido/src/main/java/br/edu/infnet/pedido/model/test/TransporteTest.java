package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Transporte;

public class TransporteTest {

	public static void main(String[] args) {
		
		Transporte trans1 = new Transporte( "10/01/2022","25/01/2022",1);
		trans1.setEmpresa("Localiza");
		trans1.setSeguro(false);
		trans1.setTipo_veiculo("carro");
		System.out.println(trans1);
		
		Transporte trans2 = new Transporte( "10/01/2022","25/01/2022",1);
		trans2.setEmpresa("Localiza");
		trans2.setSeguro(true);
		trans2.setTipo_veiculo("moto");
		System.out.println("O custo do aluguel do veiculo sera = " + trans2.calcular_Valor_servico());

	}

}
