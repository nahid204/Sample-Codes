package MyHash;
import java.util.Scanner;

class HashNode{
	String key;
	String value;
	HashNode next;
	public HashNode(String k,String v){
		this.key=k;
		this.value=v;
		this.next=null;
	}
	@Override
	public String toString() {
		return "HashNode [key=" + key + ", value=" + value + ", next=" + next
				+ "]";
	}
	
}
public class HashTableC {
	HashNode[] table;
	int size;
	public HashTableC(int s){
		table=new HashNode[s];
		this.size=table.length;
		for(int i=0;i<table.length;i++){
			table[i]=null;
		}
	}
	public int hashFunc(String x){
		int h=x.hashCode();
		h=h%this.size;
		if(h<0){
			h+=this.size;
		}
		return h;
	}
	public void put(String k,String v){
		HashNode n=new HashNode(k,v);
		int hash=hashFunc(k);
		if(table[hash]==null)table[hash]=n;
		else{
			HashNode m=table[hash];
			while(m.next!=null&& !(m.key.equals(k))){
				m=m.next;
			}
			if(m.next==null && m.key.equals(k))m.next=n;
		}
	}
	
	public String get(String k){
		int hash=hashFunc(k);
		if(table[hash]==null){
			return null;
		}
		else{
			HashNode m=table[hash];
			while(m.next!=null&& !(m.key.equals(k))){
				m=m.next;
			}
			if(m.next==null && m.key.equals(k)){
				return m.value;
			}
		}
		return null;
	}
	
	public String delete(String k){
		int hash=hashFunc(k);
		String s=null;
		if(table[hash]==null){
			return null;
		}
		else{
			HashNode m=table[hash];
			while(m!=null){
				if(m.next==null)
				{
					table[hash]=null;
					m= m.next;
					break;
				}
				else if(m.next!=null && m.next.key.equals(k)){
					s= m.next.value;
					m.next=m.next.next;
					size--;
					break;
				}	
				else if(m.next!=null)m=m.next;
			
			}
			
		}
		return s;
	}
	public int getSize(){
		return this.size;
	}
	public void clear(){
		for(int i=0;i<table.length;i++){
			table[i]=null;
		}
	}
	public void printAll(){
		for(HashNode h:table){
			if(h!=null){
				if(h.next==null){
					System.out.println(h.key+"--->"+h.value);
				}
				else{
					while(h.next!=null){
					System.out.print(h.key+"--->"+h.value);
					h=h.next;
					}
				}
			}	
		}
	}
	public static void main(String args[]){
		HashTableC c=new HashTableC(100);
		c.put("Abbu", "1");
		c.put("Ammu","2");
		c.put("Tanapu", "3");
		c.put("Shume", "4");
		c.put("Munia", "6");
		
		c.printAll();
		System.out.println(c.get("Abbu"));
		c.delete("Munia");
		c.printAll();
		
		
	}

}
