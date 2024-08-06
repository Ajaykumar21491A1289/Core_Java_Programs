package collectionframework;
import java.util.*;
public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("xxx");
		ll.add(20);
		ll.add("YYY");
		System.out.println(ll);
		ll.set(1,"YYY");
		System.out.println(ll);
		ll.add(2,"PPP");
		System.out.println(ll);
		ll.remove("YYY");
		System.out.println(ll);
		String s = (String)ll.get(1);
        System.out.println(s);
	}

}
