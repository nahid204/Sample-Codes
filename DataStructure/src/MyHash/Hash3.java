package MyHash;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Enumeration;


public class Hash3 {
	public static void main(String args[]){
		Hashtable<Integer, String> h= new Hashtable<Integer,String>();
		h.put(1, "CSE");
		h.put(2, "EEE");
		h.put(2, "CE");
		h.put(3, "MME");
		Enumeration e=h.elements();
	
		while(e.hasMoreElements()){
			System.out.println(""+e.nextElement());
		}
		System.out.println(""+h.contains("CS"));
		System.out.println(""+h.containsKey(1));
		System.out.println(""+h.containsValue("EEE"));
		System.out.println("Hash Table size"+h.size());
	}

}
