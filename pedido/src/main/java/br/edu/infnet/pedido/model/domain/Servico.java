package br.edu.infnet.pedido.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Servico {

	private LocalDate data_ida;
	private LocalDate data_retorno ;
	private Integer count_pessoas ;
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(data_ida);
		sb.append(";");
		sb.append(data_retorno);
		sb.append(";");
		sb.append(count_pessoas);
		sb.append(";");
		sb.append(calcular_Valor_servico());
		
		
		return sb.toString();
		
	}
	
	public Servico(String date1, String date2, Integer count_pessoas) {
		this.data_ida =LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd/MM/yyy")) ;
		this.data_retorno = LocalDate.parse(date2, DateTimeFormatter.ofPattern("dd/MM/yyy"));
		this.count_pessoas = count_pessoas;
	}
	
	public abstract float calcular_Valor_servico();
	
	public void setCount_pessoas(Integer count_pessoas) {
		this.count_pessoas = count_pessoas;
	}

	public LocalDate getData_ida() {
		return data_ida;
	}

	public LocalDate getData_retorno() {
		return data_retorno;
	}

	public Integer getCount_pessoas() {
		return count_pessoas;
	}


	
}
