package dataStructureM;

public class Queue {
	public static final int Size=100;
	String queue[]=new String[Size];
	String name;
	int tail;
	public Queue(String name){
		this.name=name;
		tail=0;
	}
	public void enqueue(String element){
		if(this.tail==Size)System.out.println("Queue Full");
		else queue[tail]=element;
		tail++;
	}
	public String dequeue(){
		if(this.tail==0){
			System.out.println("Queue Empty");
			return null;
		}
		else{
			String tt=this.queue[0];
			for(int i=1;i<tail;i++){
				queue[i-1]=queue[i];
			}
			tail--;
			return tt;
		}
	}
	
	public void printq(){
		System.out.println(""+this.name);
		for(int k=0;k<tail;k++){
			System.out.print(""+queue[k]+"--->");
		}
		System.out.println("");
	}
	public static void main(String args[]){
		Queue q=new Queue("Family");
		q.enqueue("Shume");
		q.enqueue("Munia");
		q.enqueue("Abbu");
		q.enqueue("ammu");
		q.enqueue("Tania");
		q.printq();
		q.dequeue();
		q.printq();
		q.dequeue();
		q.printq();
	}
}
