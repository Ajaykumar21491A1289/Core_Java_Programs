package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Mapenhancedforloop {

	public static void main(String[] args) {
		HashMap<Integer ,String> hm = new HashMap<Integer ,String>();
		hm.put(100,"Ramesh : Hydrebad");
		hm.put(200,"Ramesh : Bangaloore");
		hm.put(300,"Ramesh : Hydrebad");
		hm.put(400,"Ramesh : Banglore");
		hm.put(100,"Ramesh : Banglore");//null key
		hm.put(400,"null");//null value
		hm.put(450,"null");//null Key and null value
		System.out.println(hm);
		System.out.println();
		for(int i : hm.keySet()) {
			System.out.println(i);
		}
        
	}

}
