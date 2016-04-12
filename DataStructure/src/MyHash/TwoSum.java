package MyHash;
import java.util.HashMap;
import java.util.Arrays;


public class TwoSum {
	public static int[] findIndex(int[] a, int target){
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++){
			h.put(target-a[i], i);
		}
		for(int i=0;i<a.length;i++){
			if(h.containsKey(a[i])){
				if(h.get(a[i])!=i){
					int[] index=new int[]{i+1,h.get(a[i])+1};
					return index;
				}
			}
		}
		return null;
		
	}
	public static void main(String args[]){
	//	int arr[]={-9,-2,-95,-1};
		int arr[]=new int[]{95,81,5,6,7,8,9,11,15};
//		Arrays.sort(arr);
//		for(int i:arr){
//			System.out.print(i+"\t");
//		}
		System.out.println();
		int[] b=findIndex(arr,17);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}

}
