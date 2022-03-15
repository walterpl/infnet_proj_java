package br.edu.infnet.pedido.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Contratacao {
	
	private LocalDateTime data; 
	private String destino;
	private boolean loja ;
	private List<Servico> servico;
	private Cliente cliente;
	
	public Contratacao() {
		data = LocalDateTime.now();
		destino = "O nome de Um pais" ;
		loja = false ;
	}
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	@Override
	public String toString() {		
		return String.format("%s:%s;%s;%d", 
				destino, 
				data.format(formato),
				loja ? "presencial" : "web",
				servico.size()
					);
		
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean isLoja() {
		return loja;
	}

	public void setLoja(boolean loja) {
		this.loja = loja;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
