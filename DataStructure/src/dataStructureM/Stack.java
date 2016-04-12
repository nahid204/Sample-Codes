package dataStructureM;

public class Stack {
	Node1 top;
	public Stack(Node1 top){
		this.top=top;
	}
	public void Push(String name){
		Node1 n=new Node1(name);
		if(this.top==null)top=n;
		else{
			n.next=this.top;
			this.top=n;
		}
	}
	
	public Node1 Pop(){
		if(this.top==null) return null;
		else{
			Node1 n=this.top;
			if(top.next!=null)this.top=this.top.next;
			return n;
		}
	}
	
	public Node1 getTop(){
		return this.top;
	}
	
	public boolean search(String name){
		if((this.top.name).equals(name))return true;
		else {
			Node1 n=this.top;
			while(n.next!=null){
				n=n.next;
				if((n.name).equals(name)){
					return true;
				}
			}
		}
		return false;
	}
	
	public void printStack(){
		if(this.top==null)System.out.println("Null Stack");
		Node1 n=this.top;
		System.out.print(""+n.name+"--->");
		while(n.next!=null){
			n=n.next;
			System.out.print(""+n.name+"--->");
		}
		if(n.next==null)System.out.println("Null");
	}
	
	public static void main(String args[]){
		Node1 t=new Node1("Abbu");
		Stack s=new Stack(t);
		s.Push("Ammu");
		s.Push("Tania");
		s.Push("Shume");
		s.Push("Munia");
		s.Push("Pulock");
		s.Push("Rajin");
		s.printStack();
		boolean b=s.search("Tia");
		if(b==true)System.out.println("Found");
		else System.out.println("Not Found");
		s.Pop();
		s.printStack();
		s.Pop();
		s.printStack();
		
	}
	

}

class Node1{
	String name;
	Node1 next;
	public Node1(String name){
		this.name=name;
		this.next=null;
	}
}
