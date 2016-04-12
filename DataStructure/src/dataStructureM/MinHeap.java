package dataStructureM;

public class MinHeap {
	int heap[];
	public MinHeap(int[] heap){
		this.heap=heap;
	}
	public void Heapify(int[] a, int index){
		int lc,rc,m;
		lc=(index*2)+1;
		rc=(index*2)+2;
		if((lc<a.length)&&(a[lc]>a[index])){
			m=lc;
		}
		else m=index;
		if((rc<a.length)&&(a[rc]>a[m])){
			m=rc;
		}
		if(m!=index){
			int temp=a[index];
			a[index]=a[m];
			a[m]=temp;
			Heapify(a,m);
		}
	}
	public void BuildHeap(int[] a){
		for(int i=(a.length/2);i>=0;i--){
			Heapify(a,i);
		}
	}
	public void HeapSort(int[] a){
		BuildHeap(a);
		int size=a.length;
		for(int n=a.length-1;n>=1;n--){
			int temp=a[0];
			a[0]=a[n];
			a[n]=temp;
			size--;
			int b[]=new int[size];
			for(int k=0;k<size;k++){
				b[k]=a[k];
			}
			Heapify(b,0);
			for(int k=0;k<size;k++){
				a[k]=b[k];
			}
		}
	}
	public static void main(String args[]){
		int arr[]={5,7,2,1,0,9,89,34,56,67,786};
		MinHeap mh=new MinHeap(arr);
		mh.BuildHeap(arr);
		mh.HeapSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(""+arr[i]+"\t");
		}
	}
	
	
}
