package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import sun.awt.image.InputStreamImageSource;

public class Program {
	public static void main(String[]args) {
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
	

		// Se a acc3 for da instancia da BusinessAccount entao faz o loan
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		}
		// Se a acc3 for da instancia da SavingsAccount entao faz o update do saldo da conta
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		Account acc1 = new Account (1001, "Alex", 1000.0);
			acc1.withdraw(200.0);
			System.out.println(acc1.getBalance());
		Account acc2 = new SavingsAccount(1002,"Alex",1000.0,0.01);
			acc2.withdraw(200.0); // Exemplo de uso do @Override, foi se considerado o metodo withdraw da SavingAccount pois o metodo foi sobrescrito.
			System.out.println(acc2.getBalance());
		Account acc80 = new BusinessAccount(1003,"Bob",1000.0,500.0);
			acc80.withdraw(200.0);
			System.out.println(acc80.getBalance()); // Exemplo de uso do @Override + Super
			
		}
		


}
