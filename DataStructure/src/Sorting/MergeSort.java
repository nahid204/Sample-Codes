package Sorting;

public class MergeSort {
	static int a[]={31,5,6,67,89,23,456,56,59,78};
	static int temp[]=new int[a.length];
	public static void main(String args[]){
		mergeSort(a,0,(a.length-1));
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
	public static void mergeSort(int[] a, int low,int high){
		if(low<high){
			int middle=low+(high-low)/2;
			mergeSort(a,low,middle);
			mergeSort(a,middle+1,high);
			merge(low,middle,high);
		}
	}
	public static void merge(int low,int middle, int high){
		for(int i=low;i<=high;i++){
			temp[i]=a[i];
		}
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle&&j<=high){
			if(temp[i]<=temp[j]){
				a[k]=temp[i];
				i++;
			}
			else{
				a[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			a[k]=temp[i];
			k++;
			i++;
		}
		
	}
}
