package mypack;
class Base1{
	int i;
	int j;
	void input(int i,int j) {
		this.i=i;
		this.j=j;
	}
	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}
}
class Derived1 extends Base1{
	int k;
	void input(int k)
	{
		this.k = k;
	}
	void display(){
		super.display();
		System.out.println("k="+k);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Base1 b = new Base1();
		b.input(10,20);
		b.display();
		System.out.println();   //i=10 j=20
		Derived1 d = new Derived1();
		d.input(10, 20);
		d.input(30);
		d.display();  // i=10 j=20 k=30
		System.out.println(b.getClass());

	}

}
