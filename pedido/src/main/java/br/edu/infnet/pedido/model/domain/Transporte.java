package br.edu.infnet.pedido.model.domain;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class Transporte extends Servico{
	
	
	private String empresa ;
	private boolean seguro ;
	private String tipo_veiculo; 
	private Map<String, Integer> veiculos;
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		

		sb.append(super.toString());
		sb.append(";");
		sb.append(empresa);
		sb.append(";");
		sb.append(seguro);
		sb.append(";");
		sb.append(tipo_veiculo);
		
		
		return sb.toString();
		
	}
	
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public String getTipo_veiculo() {
		return tipo_veiculo;
	}

	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}

	public Transporte(String data_ida, String data_retorno, Integer count_pessoas) {
		super(data_ida, data_retorno, count_pessoas);
	}

	public Transporte(String data_ida, String data_retorno, int count_pessoas) {
		super(data_ida, data_retorno, count_pessoas);
	}


	@Override
	public float calcular_Valor_servico() {
		
		veiculos = new HashMap<String, Integer>();
		veiculos.put("moto",450);
		veiculos.put("carro", 750);
		
		Period intervalo = Period.between(getData_retorno(), getData_ida());
				
		return veiculos.get(getTipo_veiculo()) * (isSeguro() ? (float) 1.3 : 1) * intervalo.getDays()  ;
	}

}
