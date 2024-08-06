package Strings;

public class Equals {

	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 = "Hello";
		String s3 = "WElcome";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));//compare value
		System.out.println(s1==s2);
		System.out.println(s1==s3);//compare memory location

	}

}
