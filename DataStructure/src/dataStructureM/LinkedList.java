package dataStructureM;
import java.util.HashSet;

public class LinkedList {
	Node head;
	public LinkedList(Node head){
		this.head=head;
	}

	//Insert to Head
	public void addToHead(String name){			
		Node n=new Node(name);
		if(this.head==null){
			this.head=n;
		}
		else{
			Node t=this.head;
			this.head=n;
			this.head.next=t;
		}
	}
	
	//Insert to Tail
	public void addToTail(String name){			
		Node n=new Node(name);
		if(this.head==null){
			this.head=n;
		}
		else{
			Node n1=this.head;
			while(n1.next!=null){
				n1=n1.next;
			}
			n1.next=n;
		}
	}
	
	//Search for a specific name node
	public Boolean lookUp(String name){      
		Node n=this.head;
		while(!((n.name).equals(name))&&(n.next!=null)){
			n=n.next;
			if((n.name).equalsIgnoreCase(name)){
				return true;
			}
		}
		return false;
		
	}
	
	//Delete by name of node
	public void delete(String name){      
		Node n=this.head;
		if((n.name).equals(name))this.head=this.head.next;
		while(n.next!=null){
			if(((n.next).name).equals(name)){
				n.next=n.next.next;
				break;
			}
			else n=n.next;
		}
		
	}
	
	//Delete Duplicates
	public void deleteDups(){    
		Node n=this.head;
		HashSet<String> h=new HashSet<String>();
		Node n1=null;
		while(n!=null){
			if(h.contains(n.name)){
				n1.next=n.next;
			}
			else{
				h.add(n.name);
				n1=n;
			}
			n=n.next;
		}
	}
	
	//Print Linked List
	public void printll(){
		Node n=this.head;
		System.out.print(""+n.name+"--->");
		while(n.next!=null){
			n=n.next;
			System.out.print(""+n.name+"--->");
			if(n.next==null)System.out.println("null");
			
		}
	}
	
	public static void main(String args[]){
		Node root=new Node("A");
		LinkedList ll=new LinkedList(root);
		ll.addToHead("B");
		ll.addToTail("C");
		ll.addToTail("D");
		ll.addToTail("E");
		ll.addToHead("F");
		ll.addToHead("G");
		ll.addToHead("H");
		ll.printll();
		Boolean n=ll.lookUp("B");
		if(n==true)System.out.println("Found ");
		if(n==false) System.out.println("Not Found");
		ll.deleteDups();
		ll.delete("G");
		ll.printll();
	}
	
}

class Node{
	String name;
	Node next;
	public Node(String name){
		this.name=name;
		this.next=null;
	}
}
