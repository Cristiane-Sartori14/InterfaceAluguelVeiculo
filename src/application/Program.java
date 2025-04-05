package application;

/*Uma locadora brasileira de carros cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos.*/

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.AluguelCarro;
import entities.Veiculo;
import model.service.BrasilTaxaServico;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModelo = sc.nextLine();
		
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime comecar = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm: ");
		LocalDateTime termino = LocalDateTime.parse(sc.nextLine(), fmt);
		
		
		AluguelCarro ac = new AluguelCarro(comecar, termino, new Veiculo(carModelo));
		
		System.out.println("Entre com o preço por hora: ");
		Double precoPorHora = sc.nextDouble();
		
		System.out.println("Entre com o preço por dia: ");
		Double precoPorDia = sc.nextDouble();
		
		AluguelCarro aluguelCarro = new AluguelCarro(precoPorHora, precoPorDia, new BrasilTaxaServico());
		
		aluguelCarro.processarFatura(ac);
		
		System.out.println("FATURA:");
		/*System.out.println("Pagamento basico: " + String.format("%.2f", ac.getFatura().getbasicoPagar()));
		System.out.println("Imposto: " + String.format("%.2f",  ac.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getTotalPagamento()));
		*/
		
		sc.close();
	}

}
