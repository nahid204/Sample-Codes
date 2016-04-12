package MyHash;
import java.util.Scanner;

class HashEntry{
	int key;
	String value;
	public HashEntry(int k, String v){
		this.key=k;
		this.value=v;
	}
	int getkey(){
	 return this.key;
	}
	 
	String getValue(){
	 return this.value;
	}
}

public class HashTable {
	public static final int size=100;
	HashEntry[] table;
	public HashTable(){
		table=new HashEntry[size];
		for(int i=0;i<size;i++){
			table[i]=null;
		}
	}
	void put(int k, String val){
		int hash=k%table.length;
		while(table[hash]!=null){
			hash=(hash+1)%table.length;
		}
		table[hash]=new HashEntry(k,val);
	}
	String get(int key){
		int hash=key%table.length;
		while(table[hash]!=null&&table[hash].getkey()!=key){
			hash=(hash+1)%table.length;
		}
		if(table[hash]==null){
			return null;
		}
		else {
			return table[hash].getValue();
		}
	}
	public static void main(String args[]){
//		Scanner s=new Scanner(System.in);
//		int i=s.nextInt();
//		String c=s.next();
//		System.out.println("int is"+i+"--->"+c);
		HashTable h=new HashTable();
		h.put(1, "Abbu");
		h.put(2, "ammu");
		h.put(3, "Tanapu");
		h.put(4, "Shume Apu");
		h.put(3, "Munia");
		System.out.println(h.get(3));
		for(HashEntry e:h.table){
			if(e!=null)System.out.println(""+e.getkey()+"--->"+e.getValue());
		}
	}
}
