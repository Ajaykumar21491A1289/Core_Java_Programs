package multithreading;
class Mythread extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println(i);
		}
	}
	
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();//create a thread and invokes run() 
		Mythread t1 = new Mythread();
		t1.start();
	}

}
