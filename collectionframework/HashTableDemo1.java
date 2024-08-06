package collectionframework;
import java.util.HashMap;
import java.util.*;
public class HashTableDemo1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(100,"Ramesh : Hydrebad");
		hm.put(200,"Ramesh : Bangaloore");
		hm.put(300,"Ramesh : Hydrebad");
		hm.put(400,"Ramesh : Banglore");
		hm.put(null,"Ramesh : Banglore");//null key
		hm.put(400,null);//null value
		hm.put(null,null);//null Key and null value
		System.out.println(hm);
		System.out.println();
		Set s = hm.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
