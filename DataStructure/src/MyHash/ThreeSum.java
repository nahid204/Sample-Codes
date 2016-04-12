package MyHash;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public static ArrayList<ArrayList<Integer>> threeSumIndex(int[] a){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		Arrays.sort(a);
		if(a.length<3)return res;
		for(int i=0;i<a.length-2;i++){
			if(i==0||a[i]>a[i-1]){
				int neg=-a[i];
				int start=i+1;
				int end=a.length-1;
				while(start<end){
					if((a[start]+a[end])==neg){
						ArrayList<Integer> im=new ArrayList<Integer>();
						im.add(a[i]);
						im.add(a[start]);
						im.add(a[end]);
						res.add(im);
						start++;
						end--;
						while (start < end && a[end] == a[end + 1])
							end--;
	 
						while (start < end && a[start] == a[start - 1])
							start++;
					}
					else if((a[start]+a[end])<neg){
						start++;
					}
					else {
						end--;
					}
					
					
				}
			}
			
				
		}
		return res;
	}
	public static void main(String args[]){
		int arr[]=new int[]{95,6,89,5,8,9,-13,-11,15,0,-95};
		ArrayList<ArrayList<Integer>> b=threeSumIndex(arr);
		for(ArrayList<Integer> i:b){
			System.out.println(i);
		}
	}

}
	