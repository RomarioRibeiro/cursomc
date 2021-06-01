package com.romario.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1,"Pedente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3,"Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento (int cod, String descricao) {
		this.cod= cod;
		this.descricao= descricao;
	}
	
	public int getcod() {
		return cod;
	}
	public String getdescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum (Integer cod) {
		 if(cod ==null) {
			 return null;
		 }
		 
		 for(EstadoPagamento x : EstadoPagamento.values()) {
			 if(cod.equals(x.getcod())) {
				 return x;
			 }
		 }
		 throw new IllegalArgumentException("Id Invalido: " + cod);
	}
}
