package p576;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		int i = 0;
		while ( i <= 100) {
			i++;
			System.out.println("MyThread1:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		super.run();
	}

	
}
