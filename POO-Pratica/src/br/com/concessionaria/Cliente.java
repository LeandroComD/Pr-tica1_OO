package br.com.concessionaria;
import java.util.Scanner;

public class Cliente {

	Scanner ler = new Scanner(System.in);
	
	private String nome, cpf, tel;
	
	public void nome() {
		System.out.println("Informe o nome do cliente: \n");
		nome = ler.nextLine();
	}
	public void cpf() {
		System.out.println("Informe o CPF do cliente: \n");
		cpf = ler.next();
	}
	public void tel() {
		System.out.println("Informe o número de contato do cliente: \n");
		tel = ler.next();
	}
	
}
