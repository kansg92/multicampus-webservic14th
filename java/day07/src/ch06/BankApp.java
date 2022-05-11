package ch06;

public class BankApp {

	public static void main(String[] args) {
		Account acc1 = new Account("1111-2222");
		System.out.println(acc1.toString());
		
		acc1.deposit(10000);
		System.out.println(acc1.toString());
		
//		acc1.balance = 500000000.0;  -> Class에서 balance를 막아서 수정 불가.
		
		acc1.withdraw(5000.0);
		System.out.println(acc1);
		
		String accNo = acc1.getAccNo();
		double balance = acc1.getBalance();
		
		System.out.printf("계좌정보: %s 잔액:%.2f \n",accNo,balance);
	}

}
