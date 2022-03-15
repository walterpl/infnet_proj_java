package br.edu.infnet.pedido.model.domain;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class Hospedagem extends Servico {


	private String hotel;
	private Integer numstar;
	private Boolean concierge;
	private Map<String, Integer> hoteis;
		
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(hotel);
		sb.append(";");
		sb.append(numstar);
		sb.append(";");
		sb.append(concierge);
		
		return sb.toString();
		
	}
		
	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public Integer getNumstar() {
		return numstar;
	}

	public void setNumstar(Integer numstar) {
		this.numstar = numstar;
	}

	public Boolean getConcierge() {
		return concierge;
	}

	public void setConcierge(Boolean concierge) {
		this.concierge = concierge;
	}

	public Hospedagem(String data_ida, String data_retorno, Integer count_pessoas) {
		super(data_ida, data_retorno, count_pessoas);
	}	
	
	
	@Override
	public float calcular_Valor_servico() {
		
		hoteis = new HashMap<String, Integer>();
		hoteis.put("ibis", 750);
		hoteis.put("comanche", 450);
		hoteis.put("Palace", 1050);
		Period intervalo = Period.between(getData_retorno(), getData_ida());
		
		return (float) (hoteis.get(getHotel()) * (getConcierge() ? 1.2 : 1) * intervalo.getDays());
	}

}
