import java.util.*;

public class LinearSearch{

	public static void main(String[] args){
	
		int[] nums = {1,2,3,4,5,6,7,8,9};
	        int target = 9;
		int ans = linearsearch(nums, target);
		System.out.println(ans);

	}

	static int linearsearch(int[] arr, int target){
	
		for(int index=0; index<=arr.length; index++){
		
			int element = arr[index];
			if(element == target){
			
				return index;
			}
			
		}
		return -1;

	}
}
