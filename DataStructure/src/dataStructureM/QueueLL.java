package dataStructureM;

public class QueueLL {
	Node2 head;
	Node2 tail;
	public QueueLL(Node2 head){
		this.head=head;
		this.tail=this.head;		
	}
	
	public void enqueue(String name){
		Node2 n=new Node2(name);
		this.tail.next=n;
		this.tail=this.tail.next;
	}

	public Node2 dequeue(){
		if(this.head==null)return null;
		else {
			Node2 n=this.head;
			this.head=this.head.next;
			return n;
		}
	}
	
	public void printq(){
		Node2 n=this.head;
		if(n.next==null)System.out.println(""+this.head.name);
		else{
			while(n.next!=null){
				System.out.print(""+n.name+"--->");
				n=n.next;
			}
			if(n.next==null)System.out.println(""+n.name);
		}
	}
	
	public static void main(String args[]){
		Node2 root=new Node2("GP");
		QueueLL q=new QueueLL(root);
		q.enqueue("abbu");
		q.enqueue("ammu");
		q.enqueue("tania");
		q.enqueue("shume");
		q.enqueue("Munia");
		q.printq();
		q.dequeue();
		q.printq();
	}
}

class Node2{
	String name;
	Node2 next;
	public Node2(String name){
		this.name=name;
		this.next=null;
	}
}
