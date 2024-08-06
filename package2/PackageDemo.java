package package2;
import package1.Calculator;
public class PackageDemo {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.mult(5,2));

	}

}
