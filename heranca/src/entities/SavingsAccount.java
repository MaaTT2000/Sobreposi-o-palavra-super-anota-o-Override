package entities;

public final class SavingsAccount extends Account{ // final informa que essa classe nao pode ter subclasses pois e uma final class
	private Double interestRate;
	
	public SavingsAccount () {
		super();
		
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	@Override // ANOTACAO PARA SOBRESCREVER ( METODO WITHDRAW ORIUNDO DO Account )
	public final void withdraw(Double amount) {
		balance -= amount;
	}
	
}
