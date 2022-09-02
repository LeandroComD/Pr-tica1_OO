package br.com.concessionaria;
import java.util.Scanner;

public class Carro {

	Scanner ler = new Scanner(System.in);
	
	String cor, modelo;
	int ano;
	
	public void modelo() {
		System.out.println("Informe o modelo do veiculo: \n");
		modelo = ler.nextLine();
	}
	public void ano() {
		System.out.println("Informe o ano do veiculo: \n");
		ano = ler.nextInt();
	}
	public void cor() {
		System.out.println("Informe a cor do veiculo: \n");
		cor = ler.next();
	}
	
	
	
}
