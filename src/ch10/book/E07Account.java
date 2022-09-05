package ch10.book;

public class E07Account {
	private long balance;
	
	public E07Account() { }
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws E06BalanceInsufficientException {
		if(balance < money) {
			throw new E06BalanceInsufficientException("잔고부족: " + (money-balance) + "모자람");
		}
		balance -= money;
	}
}
