package MyHash;
import java.util.Arrays;


public class ThreeSumClosest {
	public static int threeSumClose(int[] a, int target){
		int closest=a[0]+a[1]+a[2];
		Arrays.sort(a);
		int diff=Math.abs(target-closest);
		for(int i=0;i<a.length-2;i++){
			int start=i+1;
			int end=a.length-1;
			while(start<end){
				int sum=a[i]+a[start]+a[end];
				int newdiff=Math.abs(target-sum);
				if(newdiff<diff){
					diff=newdiff;
					closest=sum;
				}
				if(sum<target){
					start++;
				}
				else{
					end--;
				}
			}
		}
		return closest;
	}
	public static void main(String args[]){
		int arr[]={2,3,4,5,9,1,-1,-5};
		int a=threeSumClose(arr,105);
		System.out.println(a);
	}
}
