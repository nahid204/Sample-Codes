package MyHash;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Enumeration;


public class Hash2 {
	public static void main(String args[]){
		Hashtable h=new Hashtable();
		h.put("Munia", "CS");
		h.put(1, "B.Sc.");
		h.put("Tanapu", "MBBS");
		Enumeration e=h.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		System.out.println(""+h.get("Tanapu"));
		System.out.println(""+h.containsValue("CS"));
		
	}

}
