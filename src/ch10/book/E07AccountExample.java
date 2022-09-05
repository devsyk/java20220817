package ch10.book;


public class E07AccountExample {
	public static void main(String[] args) {
		E07Account account = new E07Account();
		
		//예금
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금
		try {
			account.withdraw(30000);
		} catch(E06BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
		
	}
}
