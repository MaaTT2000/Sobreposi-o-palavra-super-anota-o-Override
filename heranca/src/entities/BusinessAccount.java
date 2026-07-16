package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Chamada dos construtores da superclasse
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override // ANOTACAO PARA SOBRESCREVER ( METODO WITHDRAW ORIUNDO DO Account )
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0; // Implementado nesse exemplo um desconto maior para caso de business account. 
	}
	
	
	
}
