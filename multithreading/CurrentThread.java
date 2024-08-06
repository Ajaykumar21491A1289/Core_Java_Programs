package multithreading;
public class CurrentThread {
	public void myData() {
		System.out.println("Hello Welcome");
		
	}
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread: " + currentThread.getName());
        
        CurrentThread t = new CurrentThread();
        t.myData();}}