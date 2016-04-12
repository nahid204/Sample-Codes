package MyHash;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {
	public static void  main(String args[]){
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(1, "Abbu");
		h.put(2, "Ammu");
		h.put(4, "Shume Apu");
		h.put(3, "Tanapu");
		h.put(5, "Munia");
		Iterator<Integer> i=h.keySet().iterator();
		while(i.hasNext()){
			Integer j=i.next();
			System.out.println(""+h.get(j));
		}
		Iterator<String> k=h.values().iterator();
		while(k.hasNext()){
			String m=k.next();
			System.out.println(""+h.containsValue(m));
		}
		System.out.println(""+h.get(3));
		System.out.println(""+h.containsKey(1));
	}

}
