package mypack;
class Derived{
	int i;
	int j;
	Derived(int i,int j){
		this.i=i;
		this.j=j;
	}
	Derived(){}
	void display() {
		System.out.println("i="+i+" "+"j="+j);
	}
}
class Base extends Derived{
	int k;
	Base(int k){
		super(30,40);//call it explicitly
		this.k=k;
	}
	Base(){}
	void display1() {
		System.out.println("k= "+k);
	}
}
public class Inheritance1 {
	public static void main(String args[]) {
		Derived s = new Derived(10,20);
		s.display();
		System.out.println();  //i=10;j=20
		Base s1=new Base(60);
		s1.display();         //i=30 j=40
		s1.display1();         //k=60
	}

}
