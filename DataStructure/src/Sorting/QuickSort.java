package Sorting;

public class QuickSort {
	public static void main(String args[]){
		int arr[]={3,5,6,67,89,23,456,56,59,78};
	//	int arr[]=new int[10];
//		for(int i=0;i<arr.length;i++){
//			arr[i]=(i*i)%(i+31);
//			//System.out.println(arr[i]);
//		}
		int low=0;
		int high=arr.length-1;
		qsort(arr,low,high);
		for(int i1=0;i1<arr.length;i1++){
			System.out.print(arr[i1]+"\t");
		}
	}
	
	public static void qsort(int[] a, int low,int high){
		int pivot=a[(low+(high-low)/2)];
		int i=low;
		int j=high;
		while(i<=j){
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		if(low<i-1)qsort(a,low,i-1);
		if(i<high)qsort(a,i,high);
	}
}
