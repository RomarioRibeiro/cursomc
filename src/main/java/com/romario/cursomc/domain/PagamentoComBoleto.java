package com.romario.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.romario.cursomc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto extends Pagamento {

	private Date dataDeVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado,Pedido pedido ,Date dataDeVencimento , Date dataPagamento) {
		super(id, estado,pedido);
		this.dataDeVencimento = dataDeVencimento;
		this.dataPagamento= dataPagamento;
		
	}

	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dataDeVencimento == null) ? 0 : dataDeVencimento.hashCode());
		result = prime * result + ((dataPagamento == null) ? 0 : dataPagamento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PagamentoComBoleto other = (PagamentoComBoleto) obj;
		if (dataDeVencimento == null) {
			if (other.dataDeVencimento != null)
				return false;
		} else if (!dataDeVencimento.equals(other.dataDeVencimento))
			return false;
		if (dataPagamento == null) {
			if (other.dataPagamento != null)
				return false;
		} else if (!dataPagamento.equals(other.dataPagamento))
			return false;
		return true;
	}
	
	
}
