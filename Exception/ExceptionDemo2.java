package Exception;

public class ExceptionDemo2 {
    String name = "null";
    public void mydata() throws Exception {
    		System.out.println("one");
    	System.out.println(name.length());
    	int n=10/0;
    	System.out.println(n);
    	System.out.println("End");
    	
    }
	public static void main(String[] args) {
		ExceptionDemo2 e1 = new ExceptionDemo2();
		try {
		e1.mydata();
		}
		catch(Exception e) {
			System.out.println("I can Handle "+e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}
}
