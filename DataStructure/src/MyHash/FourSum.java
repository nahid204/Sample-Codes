package MyHash;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class FourSum {
	public static ArrayList<ArrayList<Integer>> fourSumIndex(int[] a,int target){
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>>	h= new HashSet<ArrayList<Integer>>();
		Arrays.sort(a);
		for(int i=0; i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int k=j+1;
				int l=a.length-1;
				while(k<l){
					int sum=a[i]+a[j]+a[k]+a[l];
					if(sum<target){
						k++;
					}
					else if(sum>target){
						l--;
					}
					else if(sum==target){
						ArrayList<Integer> temp=new ArrayList<Integer>();
						temp.add(a[i]);
						temp.add(a[j]);
						temp.add(a[k]);
						temp.add(a[l]);
						if(!(h.contains(temp))){
							h.add(temp);
							res.add(temp);
							k++;
							l--;
						}
					}
				}						
			}
		}
		
		return res;
	}
	public static void main(String args[]){
		int arr[]=new int[]{95,6,89,5,8,9,-13,-11,15,0,-95};
		ArrayList<ArrayList<Integer>> b=fourSumIndex(arr,20);
		Iterator<ArrayList<Integer>> itr=b.iterator();
		while(itr.hasNext()){
			Object o=itr.next();
			System.out.println(o);
		}
//		for(ArrayList<Integer> i:b){
//			System.out.println(i);
//		}
	}

}
	