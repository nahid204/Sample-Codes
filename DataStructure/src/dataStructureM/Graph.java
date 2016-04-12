package dataStructureM;

public class Graph {
	Gnode source;
	Gnode vertex[];
	int matrix[][];
	
	public Graph(){
		
	}
	public Graph(Gnode[] vertex, int[][] matrix) {
		this.vertex = vertex;
		this.matrix = matrix;
	}

	public static void main(String args[]) {
		int n =7;
		Gnode vertex[] = new Gnode[n];
		for(int i=0;i<n;i++){
			vertex[i]=new Gnode(i);
		}
		
		int matrix[][]={
				{0,0,0,0,1,1,1},
				{0,0,0,0,1,0,0},
				{0,0,0,1,1,1,0},
				{0,0,1,0,0,0,1},
				{1,1,1,0,0,0,0},
				{1,0,1,0,0,0,0},
				{1,0,0,1,0,0,0}
				
		};
		Graph g = new Graph(vertex, matrix);
		BFS(g, vertex[0]);
	}
	
	public static void BFS(Graph g, Gnode s)
	{
		for(int i=1;i<g.vertex.length;i++){
			g.vertex[i].color=0;
			g.vertex[i].parent=null;
			g.vertex[i].distance=Integer.MAX_VALUE;
		}
		s.color=1;
		s.distance=0;
		s.parent=null;
		QueueNode queue=new QueueNode("Panda");
		queue.enqueue(s);
		while(!(queue.isEmpty())){
			Gnode u=queue.dequeue();
			for(int k=0;k<g.matrix[u.name].length;k++){
				if(g.matrix[u.name][k]==1){
					if(g.vertex[k].color==0){
						g.vertex[k].color=1;
						g.vertex[k].parent=u;
						g.vertex[k].distance=u.distance+1;
						queue.enqueue(g.vertex[k]);
					}
				}
			}
			u.color=2;
			System.out.println(""+u.name);
		}
	}
}
class QueueNode{
	public static final int Size=100;
	Gnode queue[]=new Gnode[Size];
	String name;
	int tail;
	public QueueNode(String name){
		this.name=name;
		tail=0;
	}
	public void enqueue(Gnode element){
		if(this.tail==Size)System.out.println("Queue Full");
		else queue[tail]=element;
		tail++;
	}
	public boolean isEmpty(){
		if(this.tail==0)return true;
		else return false;
	}
	public Gnode dequeue(){
		if(this.tail==0){
			System.out.println("Queue Empty");
			return null;
		}
		else{
			Gnode tt=this.queue[0];
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
	
}

class Gnode{
	int name;
	int color;
	Gnode parent;
	int distance;
	public Gnode(int name){
		this.name=name;
	}
}
