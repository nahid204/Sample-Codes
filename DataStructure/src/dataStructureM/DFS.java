package dataStructureM;

public class DFS {
	int time=0;
	Dgraph g;
	public DFS(Dgraph g){
		this.g=g;
	}
	public void DFS_function(Dgraph g){
		for(int i=0;i<g.vertex.length;i++){
			g.vertex[i].color=0;
			g.vertex[i].parent=null;			
		}
		for(int i=0;i<g.vertex.length;i++){
			if(g.vertex[i].color==0){
				DFS_visit(g,g.vertex[i]);
			}
		}
	}
	public void DFS_visit(Dgraph g, Dnode n){
		time=time+1;
		n.discover=time;
		n.color=1;
		for(int k=0;k<g.matrix[n.name].length;k++){
			if(g.matrix[n.name][k]==1){
				if(g.vertex[k].color==0){
					g.vertex[k].parent=n;
					DFS_visit(g,g.vertex[k]);
				}
			}
		}
		n.color=2;
		time=time+1;
		n.finish=time;
	}
	
	public static void main(String args[]){
		int n=6;
		Dnode d[]=new Dnode[n];
		for(int i=0;i<n;i++){
			d[i]=new Dnode(i);
		}
		int mat[][]={
				{0,1,0,1,0,0},
				{0,0,1,0,0,0},
				{0,0,0,1,0,0},
				{0,1,0,0,0,0},
				{0,0,1,0,0,1},
				{0,0,0,0,0,1}
				
				
		};
		Dgraph dg=new Dgraph(d,mat);
		DFS df=new DFS(dg);
		df.DFS_function(dg);
		for(int i=0;i<d.length;i++){
			System.out.println("Node "+dg.vertex[i].name+" has discover time "+dg.vertex[i].discover+" and finish time "+dg.vertex[i].finish);			
		}
	}
}

class Dgraph{
	Dnode vertex[];
	int matrix[][];
	public Dgraph(Dnode[] vertex,int[][] matrix){
		this.vertex=vertex;
		this.matrix=matrix;		
	}
}

class Dnode{
	int name;
	int color;
	Dnode parent;
	int discover;
	int finish;
	public Dnode(int name){
		this.name=name;
		int discover=0;
		int finish=0;
	}
}