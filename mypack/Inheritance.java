package mypack;
class Super{
	int i;
	int j;
	void input1(int i,int j) {
		this.i=i;
		this.j=j;
	}
	void display1() {
		System.out.println("i="+i+" "+"j = "+j);
	}
}
class Sub extends Super{
	int k;
	void input2(int k) {
		this.k=k;
	}
	void display2() {
		System.out.println("k ="+k);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Super s = new Super();
		s.input1(10,20); 
		s.display1();          //i=10;j=20
		System.out.println();
		Sub s1=new Sub();
		s1.input1(30,40);
		s1.display1();         //i=30 j=40
		s1.input2(50);
		s1.display2();         //k=50
	}

}
