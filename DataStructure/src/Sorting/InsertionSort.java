package Sorting;

public class InsertionSort {
	public static void main(String args[]){
		int i,j,key;
		int a[]={3,5,6,67,89,23,456,56,59,78};
		for(i=1;i<a.length;i++){
			key=a[i];
			for(j=i-1;(j>=0 && key<a[j]);j--){
				a[j+1]=a[j];
			}
			a[j+1]=key;
		}
		for(int k=0;k<a.length;k++){
			System.out.print(""+a[k]+"\t");
		}
	}

}
