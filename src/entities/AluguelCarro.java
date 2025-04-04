package entities;

import java.time.LocalDateTime;

public class AluguelCarro {
	private LocalDateTime comecar;
	private LocalDateTime termino;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	
	public AluguelCarro() {
	}
	

	public AluguelCarro(LocalDateTime comecar, LocalDateTime termino, Veiculo veiculo) {
		this.comecar = comecar;
		this.termino = termino;
		this.veiculo = veiculo;

	}

	public LocalDateTime getComecar() {
		return comecar;
	}


	public void setComecar(LocalDateTime comecar) {
		this.comecar = comecar;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public Fatura getFatura() {
		return fatura;
	}


	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}


	public LocalDateTime getTermino() {
		return termino;
	}


	public void setTermino(LocalDateTime termino) {
		this.termino = termino;
	}

}
