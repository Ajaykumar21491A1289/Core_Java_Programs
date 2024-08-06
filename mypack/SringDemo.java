package mypack;

public class SringDemo {

	public static void main(String[] args) {
		String s1 = new String("Ajay");
		String s2 = new String("Ajay");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);      
        System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
	}

}
