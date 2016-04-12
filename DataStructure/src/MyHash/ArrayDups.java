package MyHash;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayDups {
	public static int[] removeDups(int[] a){
		HashSet<Integer> h=new HashSet<Integer>();
		int[] newarr=new int[0];
		for(int i:a){
			if(!(h.contains(i))){
				h.add(i);
				newarr=Arrays.copyOf(newarr, newarr.length+1);
				newarr[newarr.length-1]=i;
			}
		}
		return newarr;
	}
	
	public static void main(String args[]){
		int arr[]=new int[]{5,6,7,8,5,5,6,9,9,9};
		int[] b=removeDups(arr);
		for(int i:b){
			System.out.print(""+i+"--->");
		}
	}

}
