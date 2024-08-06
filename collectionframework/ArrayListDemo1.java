package collectionframework;
import java.util.*;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add("XXX");
		l.add("YYY");
		l.add(20);
		System.out.println(l);//[10, XXX, YYY, 20]
		l.add(2,"ppp");
		System.out.println(l);//[10, XXX, ppp, YYY, 20]
		l.set(2, "qqq");
		System.out.println(l);//[10, XXX, qqq, YYY, 20]
		l.remove("qqq");
		System.out.println(l);//[10, XXX, YYY, 20]
		l.remove(2);
		System.out.println(l);//[10, XXX, 20]
		String s = (String)l.get(1);//here we are converting the object type to string type 
		//the linked list always returns the object type

		System.out.println(s);//xxx
		System.out.println(l.size());//3
}}
