package ch06;

public class Account {
	//private : 해당 변수는 다른 클래스에서 수정을 못하도록 막음.
	private String accNo;  
	private double balance;	

	public Account() {
	}
	
	public Account(String accNo) {
		this.accNo = accNo;

	}
	
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
		
	// get은 타 클래스에서 정보만 볼 수 있는 것.
	public String getAccNo() {
		return accNo;
	}

	// set은 타 클래스에서 설정할 수 있는 것.
//	public void setAccNo(String accNo) {
//		this.accNo = accNo;
//	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	
	
	public void deposit(double money) {
		if (money < 1) {
			System.out.println("입급 금액 오류");
			return;
		}
		this.balance += money;
	}
	
	// 출금 금액이 1보다 작으면 안된다.
	// 출금 급액이 잔액 보다 많으면 안된다.
	public void withdraw(double money) {
		if (money < 1) {
			System.out.println("출금 금액 오류");
			return;
		}
		if (money > this.balance) {
			System.out.println("잔액 부족");
			return;
		}
		this.balance -= money;
	}
	
	public double select() {
			return this.balance;
	}
	
	@Override // 모양을 보기위해서 하는것 업무에서는 필요하지 않는 코드이다.
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

}