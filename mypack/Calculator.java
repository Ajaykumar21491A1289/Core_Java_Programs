package mypack;

public class Calculator {   //class
   int a=10;                //Attributes
   int b=20;
   public  void display() { //Methods
	   System.out.println(a+b);
   }
	public static void main(String[] args) {
		
    Calculator cl = new Calculator(); //objects
    cl.display();
	}

}
