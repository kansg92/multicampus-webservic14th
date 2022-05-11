package bank;

import java.util.Arrays;

public class Customer {
	private String name;
	private Account [] acc;
	
	public Customer() {
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name, Account[] acc) {
		this.name = name;
		this.acc = acc;
	}
	
	public String getName() {
		return name;
	}
	public Account[] getAcc() {
		return acc;
	}	
	public void setAcc(Account[] acc) {
		this.acc = acc;
	}
	// 계좌의 잔액의 합을 구하는 기능.
	public double getBalanceSum() {
		double sum = 0.0;
		for (int i = 0; i < acc.length; i++) {
			sum += acc[i].getBalance();
		}
		
		return sum;
	}
	
	
	public void deposit(String accNo, double money) {
		for (int i = 0; i < this.acc.length; i++) {
			if(acc[i].getAccNo().equals(accNo)) {
				acc[i].deposit(money);
			}
		}
	}
	
	//"1111" 인 계좌를 리턴한다. 
	public Account getAc(String accNo) {
		Account accs = null;
		for (int i = 0; i < this.acc.length; i++) {
			if(acc[i].getAccNo().equals(accNo)) {
				accs = acc[i];
			}
		}
		return accs;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", acc=" + Arrays.toString(acc) + "]";
	}
	
	
	
	
	
}
