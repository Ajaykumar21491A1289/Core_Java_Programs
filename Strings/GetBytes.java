package Strings;

public class GetBytes {

	public static void main(String[] args) {
		String s  ="Hello";
		byte[] b = s.getBytes();
		for(byte g : b)
			System.out.println(g);
	}

}
