package Exception;

public class ExceptionDemo1 {
    String name = null;
    public void mydata() {
    	System.out.println("one");
    	System.out.println(name.length());
    }
	public static void main(String[] args) {
		ExceptionDemo1 e1 = new ExceptionDemo1();
		e1.mydata();
	}

}
