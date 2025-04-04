package entities;

import java.time.LocalDateTime;

public class AluguelCarro {
	private LocalDateTime comecar;
	private LocalDateTime termino;
	
	
	public AluguelCarro() {
	}
	
	public AluguelCarro(LocalDateTime comecar, LocalDateTime termino) {
		this.comecar = comecar;
		this.termino = termino;
	}

	public LocalDateTime getComecar() {
		return comecar;
	}

	public void setComecar(LocalDateTime comecar) {
		this.comecar = comecar;
	}

	public LocalDateTime getTermino() {
		return termino;
	}

	public void setTermino(LocalDateTime termino) {
		this.termino = termino;
	}
	
	
	

}
