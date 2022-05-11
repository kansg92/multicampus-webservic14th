package bank;

public class BankApp {

	public static void main(String[] args) {
		Account acc = new Account("1111",10000);

		try {
			acc.deposit(-100);
		} catch (MyException e) {
			System.out.println(e);
		}
		System.out.println(acc);
	
		try {
			acc.withdraw(20000);
		} catch (MyException | OverdrawnException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
