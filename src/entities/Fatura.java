package entities;

public class Fatura {
	private Double basicoPagar;
	private Double taxa;
	
	
	public Fatura() {
	}
	
	public Fatura(Double basicoPagar, Double taxa) {
		this.basicoPagar = basicoPagar;
		this.taxa = taxa;
	}

	public Double getBasicoPagar() {
		return basicoPagar;
	}

	public void setBasicoPagar(Double basicoPagar) {
		this.basicoPagar = basicoPagar;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getTotalPagamento() {
		return getBasicoPagar() + getTaxa();
	}

}
