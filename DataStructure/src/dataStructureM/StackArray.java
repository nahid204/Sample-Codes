package dataStructureM;

public class StackArray {
	public static final int Size=100;
	String stack[]=new String[Size];
	String name;
	int top;
	public StackArray(String name){
		top=0;
		this.name=name;
	}
	
	public void push(String element){
		if(top==Size)System.out.println("Stack full");
		else {
			this.stack[this.top]=element;
			top++;
		}
	}
	public String pop(){
		top--;
		return this.stack[top];
	}
	public void prints(){
		System.out.println(this.name);
		for(int i=this.top-1;i>=0;i--){
			System.out.print(""+stack[i]+"--->");
		}
		System.out.println("");
	}
	
	public static void main(String args[]){
		StackArray a=new StackArray("FerdousFamily");
		a.push("abbu");
		a.push("ammu");
		a.push("Tania");
		a.push("Shume");
		a.push("Munia");
		a.prints();
		a.pop();
		a.pop();
		a.prints();
		
	}
	
}
