package Exception;

public class Exception1 {
public void myAge() throws UserDefinedException{
	int age =10;
	if(age<18) {
		throw new UserDefinedException("Not Eligible");
	}
	else {
		System.out.println("eligible");
	}
}

	public static void main(String[] args) {
		Exception1 e = new Exception1();
		try {
			e.myAge();
		}
		catch(UserDefinedException e1) {
			System.out.println(e1);
		}}}
