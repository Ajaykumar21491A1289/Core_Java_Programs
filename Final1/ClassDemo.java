package Final1;
final class Derived1{
	void xxx() {
		System.out.println("we are at Final Class xxx Method");
	}

}
/*class Base extends Derived{ // it rise an error
	void yyy() {
		System.out.println("We are at non final class yyy method");
	}
}*/
public class ClassDemo {

	public static void main(String[] args) {
		
Derived1 b= new Derived1();
b.xxx();
	}

}
