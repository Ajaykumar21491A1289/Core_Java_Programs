package collectionframework;

import java.util.*;
public class ReverseIterator {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("xxx");
		ll.add("yyy");

		ListIterator listIter = ll.listIterator();
		while (listIter.hasNext())
		{
			System.out.println(listIter.next());
		}
		System.out.println();
		while(listIter.hasPrevious())
		{
			System.out.println(listIter.previous());
		}
	}
}
