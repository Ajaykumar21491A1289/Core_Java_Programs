package InnerDemo;
class Outer3{
	static int n =100;
	static class Inner3{
		static void doStuff() {
			System.out.println("n = "+n);
		}
	}
}
public class InnerDemo3 {

	public static void main(String[] args) {
		Outer3.Inner3 oi = new Outer3.Inner3();
		oi.doStuff();

	}

}
