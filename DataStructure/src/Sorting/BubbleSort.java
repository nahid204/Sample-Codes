package Sorting;
public class BubbleSort {
	public static void main(String args[]){
		int a[]={3,5,6,67,89,23,456,56,59,78};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(""+a[i]+"\t");
		}
	}
}
