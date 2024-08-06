package Final1;
class Base{
	final void xxx() {
		System.out.println("We are at Final Method");
	}
}
class Derived extends Base{
	//void xxx() {//it throws an error
	//	System.out.println("We are at Normal Method");
	//}
	void yyy() {
		System.out.println("We are at Non Final Method");
	}
}
public class Finalmethod {

	public static void main(String[] args) {
	Derived d = new Derived();
	d.xxx();
	d.yyy();

	}

}
