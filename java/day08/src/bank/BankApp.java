package bank;

public class BankApp {

	public static void main(String[] args) {
		Customer c = new Customer("kim");
		System.out.println(c);
		
		Account [] accs = new Account[3];
		
		accs[0] = new Account("1111", 10000);
		accs[1] = new Account("2222", 10000);
		accs[2] = new Account("3333", 10000);
		
		c.setAcc(accs);
		System.out.println(c);
		
		Account myacc = c.getAc("2222");
		System.out.println(myacc);
		
		c.deposit("2222", 8989);
		System.out.println(c);
		
		double sum = c.getBalanceSum();
		System.out.println(sum);
	}

}
