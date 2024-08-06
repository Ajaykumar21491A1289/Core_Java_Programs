package Exception;

public class ExceptionDemo5 {
    String name = "null";
    public void mydata() {
    	try{
    		System.out.println("one");
    	System.out.println(name.length());
    	System.out.println("End");
    	}
    	catch(NullPointerException e) {
    		System.out.println("I can handle : "+e);
    	}
    }
	public static void main(String[] args) {
		ExceptionDemo5 e1 = new ExceptionDemo5();
		e1.mydata();
	}

}
