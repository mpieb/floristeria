package demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ticket {

	private int id;
	private static int properId = 0;
	private LocalDateTime data;
	private double valorTotal;
	List<Producte> productes = new ArrayList<>();
	private DateTimeFormatter format = DateTimeFormatter.ofPattern("'DATA:' dd/MM/yyyy	'HORA:' HH:mm");

	public Ticket(List<Producte> compra) throws Exception {
		if (compra.isEmpty())
			throw new Exception("Heu d'introduir com a mínim un producte per crear un ticket.");
		id = properId++;
		productes = compra;
		valorTotal = compra.stream().mapToDouble((Producte::getPreu)).sum();
		data = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public List<Producte> getProductes() {
		return productes;
	}

	public LocalDateTime getData() {
		return data;
	}

	@Override
	public String toString() {
		return "ID_TICKET: " + id + "	" + data.format(format) + "	VALOR TOTAL: " + valorTotal;
	}

	public void printTicket() {

		System.out.println(toString());
		productes.stream().forEach(System.out::println);
	
	}

}

