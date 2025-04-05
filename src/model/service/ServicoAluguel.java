package model.service;

import entities.AluguelCarro;

public class ServicoAluguel {
	
	private Double precoPorHora;
	private Double precoPorDia;
	
	private BrasilTaxaServico taxaServico;

	public ServicoAluguel(Double precoPorHora, Double precoPorDia, BrasilTaxaServico taxaServico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.taxaServico = taxaServico;
	}
	
	public void processarFatura(AluguelCarro aluguelCarro) {
		aluguelCarro.setFatura(new Fatura (50.0, 10.0));
	}

}
