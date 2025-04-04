package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.AluguelCarro;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.println("Modelo do carro: ");
		String carModelo = sc.nextLine();
		
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime comecar = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm: ");
		LocalDateTime termino = LocalDateTime.parse(sc.nextLine(), fmt);
		
		
		AluguelCarro ac = new AluguelCarro(comecar, termino, new Veiculo(carModelo));
		
		System.out.println("Entre com o preço por hora: ");
		Double valorHora = sc.nextDouble();
		
		System.out.println("Entre com o preço por dia: ");
		Double valorDia = sc.nextDouble();
		
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", ac.getFatura().getbasicoPagar()));
		System.out.println("Imposto: " + String.format("%.2f",  ac.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getTotalPagamento()));
		
		
		sc.close();
	}

}
