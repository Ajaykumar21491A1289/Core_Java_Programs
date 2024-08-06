package Static1;
class Sample{
	int m;       //non-static variable
	static int n; //Static variable
    void xxx() {
    	m=10;
    	n=20;
    }
   // static {
   // 	n=100;
    	
   // }
    static void yyy() {
    	// m=10; 
//error because static methods can call only static variables
    	n=40;
    }
    void dispaly() {
    	System.out.println("m="+m+" "+"n="+n);
    }
}
public class StaticDemo1 {
    
	public static void main(String[] args) {
		Sample s = new Sample();
		//it will print the default value of m and the value of n in static block
		s.dispaly();//m=0 n=0
		//we are calling xxx() method it will initilize the values
		s.xxx();
		//it assign value to m and over write the value of n
		s.dispaly();//m=10 n=20
		Sample s1 = new Sample();
		s1.dispaly();//m=0 n=20
		//now we are creating a new object and calling yyy method
		//it will assign value for only static variables.
		s1.yyy();
		s1.dispaly();// m=0 n = 40
		Sample s2 = new Sample();
		s2.dispaly();//m=0 n=40
	}

}
