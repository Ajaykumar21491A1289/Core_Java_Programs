package InnerDemo;
class Outer2{
	int n =100;
	void doStuff1() {
		class Inner2
		{
			void doStuff2() {
				System.out.println("n = "+n);
			}
		}
			Inner2 in = new Inner2();
			in.doStuff2();
		
	}
}
public class InnerDemo2 {

	public static void main(String[] args) {
		Outer2 ou = new Outer2();
		ou.doStuff1();	}

}
