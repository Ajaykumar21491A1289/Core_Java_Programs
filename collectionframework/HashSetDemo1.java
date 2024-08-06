package collectionframework;
import java.util.*;
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet l = new HashSet();
		l.add("monitor");
		l.add("Keyboard");
		l.add("Mouse");
		l.add("ups");
		l.add("Speakers");
		l.add("monitor");//not an error - not added into the set
        System.out.println(l);
		//LinkedHashSet
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("Keyboard");
		lhs.add("Mouse");
		lhs.add("ups");
		lhs.add("speakers");
		lhs.add("monitor");
		System.out.println(lhs);
		//TreeSet
		TreeSet ts = new TreeSet();
		ts.add("monitor");
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("ups");
		ts.add("speakers");

		System.out.println(ts);}}