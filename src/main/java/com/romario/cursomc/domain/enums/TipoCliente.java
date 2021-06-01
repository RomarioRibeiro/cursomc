package com.romario.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURITICA(2, "Pessoa Jurítica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente (int cod, String descricao) {
		this.cod= cod;
		this.descricao= descricao;
	}
	
	public int getcod() {
		return cod;
	}
	public String getdescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum (Integer cod) {
		 if(cod ==null) {
			 return null;
		 }
		 
		 for(TipoCliente x : TipoCliente.values()) {
			 if(cod.equals(x.getcod())) {
				 return x;
			 }
		 }
		 throw new IllegalArgumentException("Id Invalido: " + cod);
	}
}
