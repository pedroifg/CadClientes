package entities;

public class Cliente {
	private int accountNumber;
	private String accountOwnerName;
	private double initialDeposit;		
			
	public Cliente(int accountNumber, String accountOwnerName) {	
		this.accountNumber = accountNumber;
		this.accountOwnerName = accountOwnerName;
	}

	public Cliente(int accountNumber, String accountOwnerName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountOwnerName = accountOwnerName;
		depositInAccount(initialDeposit); // Devido ao encapsulamento, aqui eu uso apenas o método depoistInAccount	
	}		
	
	public String getAccountOwnerName() {
		return accountOwnerName;
	}
	public void setAccountOwnerName(String accountOwnerName) {
		this.accountOwnerName = accountOwnerName;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}	
	
	public int getAccountNumber() {
		return accountNumber;
	}	
		
	public void depositInAccount(double amount) {
		initialDeposit += amount;
	} // Estou encapsulando a regra de negócio dentro deste método
	
	public void withdrawInAccount (double withdraw) {
		initialDeposit = (initialDeposit - withdraw) - 5.0;
	}

	@Override
	public String toString() {
		return "Cliente data: " + 
				" Account number: " + 
				accountNumber + 
				" Owner name: " + 
				accountOwnerName +
				" Amount in account: $" + 
				initialDeposit;
	}	
	
	
	
}
