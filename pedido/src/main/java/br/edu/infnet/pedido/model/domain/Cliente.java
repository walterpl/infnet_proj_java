package br.edu.infnet.pedido.model.domain;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String card_number;
	
	public Cliente(String nome, String cpf, String card_number) {
		this.nome = nome;
		this.cpf = cpf;
		this.card_number = card_number;
		
	}
	
	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(card_number);
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCard_number() {
		return card_number;
	}
	

	
	
}