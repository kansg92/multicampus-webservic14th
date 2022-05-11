package p576;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Strat.....");
		MyThread1 t1 = new MyThread1();
		t1.start();
		
		// 인터페이스안세서 생성한 객체는 thread객체 안에 넣어서 사용용
		MyThread2 t2 = new MyThread2();
		Thread tt2 = new Thread(t2);
		tt2.start();
		
		
		System.out.println("End.....");
	}

}
   