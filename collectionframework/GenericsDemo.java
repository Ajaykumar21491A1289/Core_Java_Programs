package collectionframework;

import java.util.ArrayList;
public class GenericsDemo {

	public static void main(String[] args) {
	ArrayList<Integer> l =new ArrayList<Integer>();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
for(Integer i : l) {
	System.out.println(i);
}
	}

}
