package ch06;

public class BankApp {

	public static void main(String[] args) {
		Account acc1 = new Account("1111-2222");
		System.out.println(acc1.toString());
		
		acc1.deposit(10000);
		System.out.println(acc1.toString());
		
//		acc1.balance = 500000000.0;  -> Class���� balance�� ���Ƽ� ���� �Ұ�.
		
		acc1.withdraw(5000.0);
		System.out.println(acc1);
		
		String accNo = acc1.getAccNo();
		double balance = acc1.getBalance();
		
		System.out.printf("��������: %s �ܾ�:%.2f \n",accNo,balance);
	}

}
