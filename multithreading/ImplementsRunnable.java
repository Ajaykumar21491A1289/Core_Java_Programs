package multithreading;

public class ImplementsRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		ImplementsRunnable m1 = new ImplementsRunnable();
		Thread t1 = new Thread(m1);
		t1.start();
		ImplementsRunnable m2 = new ImplementsRunnable();
		Thread t2 = new Thread(m2);
		t2.start();

	}

	
}
