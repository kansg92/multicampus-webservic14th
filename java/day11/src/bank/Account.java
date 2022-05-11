package bank;

public class Account {
	//private : �ش� ������ �ٸ� Ŭ�������� ������ ���ϵ��� ����.
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
		
	// get�� Ÿ Ŭ�������� ������ �� �� �ִ� ��.
	public String getAccNo() {
		return accNo;
	}

	// set�� Ÿ Ŭ�������� ������ �� �ִ� ��.
//	public void setAccNo(String accNo) {
//		this.accNo = accNo;
//	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	
	
	public void deposit(double money) throws MyException {
		if (money < 1) {
			throw new MyException("���̳ʽ��Դϴ�.");
		}
		this.balance += money;
	}
	
	// ��� �ݾ��� 1���� ������ �ȵȴ�.
	// ��� �޾��� �ܾ� ���� ������ �ȵȴ�.
	public void withdraw(double money) throws MyException, OverdrawnException {
		if (money < 1) {
			throw new MyException("���̳ʽ��Դϴ�.");
		}
		if (money > this.balance) {
			throw new OverdrawnException("�ܾ׺���");
		}
		this.balance -= money;
	}
	
	public double select() {
			return this.balance;
	}
	
	@Override // ����� �������ؼ� �ϴ°� ���������� �ʿ����� �ʴ� �ڵ��̴�.
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

}