package dataStructureM;

public class Tree {
	Tnode root;
	public Tree(Tnode root){
		this.root=root;
	}
	
	public Tnode getRoot(){
		return this.root;
	}
	
	public int treeHeight(Tnode node){
		int height=0;
		int lh,rh=0;
		if(node==null)return 0;
		else if(node!=null&&(node.left==null&&node.right==null))return 0;
		else{
			lh=treeHeight(node.left);
			rh=treeHeight(node.right);
			height=1+Math.max(lh, rh);
			return height;
		}
	}
	
	public int treeSize(Tnode n){
		if(n==null)return 0;
		else{
			return (treeSize(n.left)+1+treeSize(n.right));
		}
	}
	
//	public int getDepth(Tnode n){
//		if(n==null)return 0;
//		int depth=0;
//		Tnode n1=this.root;
//		if(n.equals(n1))return depth;
//		else {
//			if((n1.left).equals(n))break;
//			else getDepth(n1.left)
//			
//		}
//		if(n.equals(this.root))return depth;
//		else{
//			depth++;
//			return Math.max(depth+getDepth(n.left),(depth+getDepth(n.right)));
//		}
//	}
	
	public int levelDifference(Tnode n){
		int lh=0;
		int rh=0;
		if(n==null)return 0;
		if(n.left!=null){
			lh=treeHeight(n.left);
		}
		if(n.right!=null){
			rh=treeHeight(n.right);
		}
		int r=lh-rh;
		return Math.abs(r);
	}
	
	public void preOrder(Tnode n){
		if(n!=null){
			System.out.println(n.name);
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	
	public void inOrder(Tnode n){
		if(n!=null){
			inOrder(n.left);
			System.out.println(n.name);
			inOrder(n.right);
		}
	}
	
	public void postOrder(Tnode n){
		if(n!=null){
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.name);
		}
	}
	
	public static void main(String args[]){
		Tnode root=new Tnode("GP");
		Tree t=new Tree(root);
		Tnode dada=new Tnode("Sheikh Amanullah");
		Tnode dadi=new Tnode("Tara");
		root.left=dada;
		root.right=dadi;
		Tnode abbu=new Tnode("abbu");
		dada.right=abbu;
		Tnode tanapu=new Tnode("Tanapu");
		Tnode shumeapu=new Tnode("Shume Apu");
		abbu.left=tanapu;
		abbu.right=shumeapu;
		int h=t.treeHeight(root);
		System.out.println("Height: "+h);
		int size=t.treeSize(root);
		System.out.println("Size: "+size);
		int diff=t.levelDifference(root);
		System.out.println("Diff "+diff);
		t.postOrder(root);
		
	}
	

}

class Tnode{
	String name;
	Tnode left;
	Tnode right;
	public Tnode(String name){
		this.name=name;
		left=null;
		right=null;
	}
}
