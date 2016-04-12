package MyHash;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Hash1 {
	public static void main(String[] args)
	{
		int[] arr=new int[]{1,2,1,1,2,2,3,4,3,5,6,6};
		boolean flag=duplicateExistSet(arr);
		
		
	}
	public boolean duplicateExist(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]== arr[j])
				{
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	public static boolean duplicateExistSet(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i:arr){
			if(!(set.contains(i))){
				set.add(i);
			}
		}
		int[] a=new int[set.size()];
		int j=0;
	//	Integer[] a=(Integer[])set.toArray();
		for(Integer i:set){
			a[j]=(int)i;
			j++;
			
		}
		for(int k=0;k<a.length;k++){
			System.out.print(""+a[k]+"\t");
		}
		
		return false;
	}
	
}
