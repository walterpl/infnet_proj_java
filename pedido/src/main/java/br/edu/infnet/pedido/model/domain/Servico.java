package br.edu.infnet.pedido.model.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Servico {
 
	private Integer id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData_ida() {
		return data_ida;
	}

	public void setData_ida(LocalDate data_ida) {
		this.data_ida = data_ida;
	}

	public LocalDate getData_retorno() {
		return data_retorno;
	}

	public void setData_retorno(LocalDate data_retorno) {
		this.data_retorno = data_retorno;
	}

	public Integer getCount_pessoas() {
		return count_pessoas;
	}

	public void setCount_pessoas(Integer count_pessoas) {
		this.count_pessoas = count_pessoas;
	}
	
	

	
}
