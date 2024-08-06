package Strings;

public class Split {

	public static void main(String[] args) {
		String s1 = new String("A j a y kumar");
		String s2 = new String(" ");
		String[] arr=s1.split(s2);
		for(String s : arr)
		    System.out.println(s);}}
