package dataStructureM;

public class DoubleLinkedList {
	Dlnode head;
	public DoubleLinkedList(Dlnode head){
		this.head=head;
	}
	public void insertToTail(String name){
		Dlnode n=new Dlnode(name);
		if(this.head==null){
			this.head=n;
			this.head.next=null;
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			while(n1.next!=null){
				n1=n1.next;
			}
			n1.next=n;
			n.prev=n1;
		}
	}
	public void insertToHead(String name){
		Dlnode n=new Dlnode(name);
		if(this.head==null){
			this.head=n;
			this.head.next=null;
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			n.next=n1;
			n1.prev=n;
			this.head=n;
		}
	}
	public void insertAfter(String name,String nb){
		Dlnode n=new Dlnode(name);
		if(this.head==null){
			this.head=n;
			this.head.next=null;
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			while((n1.next!=null)||((n1.name).equals(nb))){
				if(((n1.name).equals(nb))&&(n1.next!=null)){
					n.next=n1.next;
					n1.next.prev=n;
					n1.next=n;
					n.prev=n1;
					break;
				}
				else if(((n1.name).equals(nb))&&(n1.next==null)){
					n1.next=n;
					n.prev=n1;
					break;
				}
				else {
					n1=n1.next;
				}
			}
		}
	}
	
	public void insertBefore(String name,String nb){
		Dlnode n=new Dlnode(name);
		if(this.head==null){
			this.head=n;
			this.head.next=null;
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			while((n1.next!=null)||((n1.name).equals(nb))){
				if((n1.name).equals(nb)){
					n1.prev.next=n;
					n.prev=n1.prev;
					n1.prev=n;
					n.next=n1;
					break;
				}
				else {
					n1=n1.next;
				}
			}
		}
	}
	
	public boolean delete(String name){
		if(this.head==null){
			System.out.println("Linked List empty ");
			return false;
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			while((n1.next!=null)||((n1.name).equals(name))){
				if(((n1.name).equals(name))&&(n1.next!=null)){
					n1.prev.next=n1.next;
					n1.next.prev=n1.prev;
					return true;
				}
				else if(((n1.name).equals(name))&&(n1.next==null)){
					n1.prev.next=null;	
					return true;
				}
				else {
					n1=n1.next;
				}
			}
		}
		return false;
	}
	
	public boolean search(String n){
		if(this.head==null){
			System.out.println("Linked List empty ");
			return false;
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			while((n1.next!=null)||((n1.name).equals(n))){
				if((n1.name).equals(n)){
					return true;
				}
				else {
					n1=n1.next;
				}
			}
		}
		return false;
	}
	
	public void printdl(){
		if(this.head==null){
			System.out.println("Linked List empty ");
		}
		if(this.head!=null){
			Dlnode n1=this.head;
			while(n1!=null){
				if((n1!=null)&&(n1.next!=null)){
					System.out.print(""+n1.name+"--->");
					n1=n1.next;
				}
				if((n1!=null)&&(n1.next==null)){
					System.out.print(""+n1.name+"--->null");
					System.out.println("");
					break;	
				}
			}
		}
	}
	
	public static void main(String args[]){
		Dlnode h=new Dlnode("GP");
		DoubleLinkedList dl=new DoubleLinkedList(h);
		dl.insertToHead("Great Gp");
		dl.insertAfter("ammu", "GP");
		dl.insertBefore("abbu", "ammu");
		dl.insertToTail("tania");
		dl.insertAfter("Shume", "tania");
		dl.insertAfter("munia", "Shume");
		dl.printdl();
		boolean b=dl.search("tania");
		if(b==true)System.out.println("Found");
		else System.out.println("Not Found");
		dl.delete("GP");
		dl.printdl();
	}
	
}

class Dlnode{
	String name;
	Dlnode prev;
	Dlnode next;
	public Dlnode(String name){
		this.name=name;		
		this.prev=null;
		this.next=null;
	}
}
