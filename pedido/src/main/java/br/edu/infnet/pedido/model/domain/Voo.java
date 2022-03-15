package br.edu.infnet.pedido.model.domain;

import java.util.HashMap;
import java.util.Map;

public class Voo extends Servico {
	
	private Integer classe;
	private String companhia;
	private boolean vip_floor;
	private Map<String, Integer> companhias;
	private Map<Integer, Float> classes;
	
	
	
	public Voo(String data_ida, String data_retorno, Integer count_pessoas) {
		super(data_ida, data_retorno, count_pessoas);

	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		

		sb.append(super.toString());
		sb.append(";");
		sb.append(classe);
		sb.append(";");
		sb.append(companhia);
		sb.append(";");
		sb.append(vip_floor);
		
		
		return sb.toString();
		
	}
	
	@Override
	public float calcular_Valor_servico() {
		
		companhias = new HashMap<String, Integer>();
		companhias.put("tam", 1000);
		companhias.put("azul", 750);
		companhias.put("emirates", 1255);
		companhias.put("airfrance", 1099);
		
		classes = new HashMap<Integer, Float>();
		classes.put(1,(float) 1.6);
		classes.put(2,(float) 1.4);
		classes.put(3,(float) 1.0);
		
		return companhias.get(getCompanhia()) * classes.get(getClasse()) * (isVip_floor() ? (float) 1.3 : 1) * getCount_pessoas();
	}

	public Integer getClasse() {
		return classe;
	}

	public void setClasse(Integer classe) {
		this.classe = classe;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public boolean isVip_floor() {
		return vip_floor;
	}

	public void setVip_floor(boolean vip_floor) {
		this.vip_floor = vip_floor;
	}
	
	
}
