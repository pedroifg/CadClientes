package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;

public class Main {

	public static void main(String[] args) {					
		Cliente cliente;
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Quer fazer um deposito inicial? (S/N)");
		char respostaDepositoInicial = sc.next().charAt(0);			
		
		if(respostaDepositoInicial == 'n') {
			cliente = new Cliente (numConta, nomeTitular); // Como a instância já está fora do escopo, pode ser declarada nesse escopo sem problema			
			cliente.depositInAccount(0);
		} else {
			System.out.println("Quanto você deseja depositar?");
			double valorEmConta = sc.nextDouble();
			cliente = new Cliente (numConta, nomeTitular, valorEmConta);
		}	
		
		System.out.println("Dados do cliente: " + cliente);	
		
		System.out.println("Valor de deposito: ");
		double deposito = sc.nextDouble();
		cliente.depositInAccount(deposito);
		
		System.out.println("Dados atualizados: " + cliente);
		
		System.out.println("Valor de saque: ");
		double saque = sc.nextDouble();
		cliente.withdrawInAccount(saque);
		
		System.out.println("Dados atualizados: " + cliente);		
		
		sc.close();
	}

}
