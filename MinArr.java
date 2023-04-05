import java.util.*;

public class MinArr{

	public static void main(String[] args){
	
		int[] nums= {9,8,7,6,-9,5,4,3,2,1};
		System.out.println(minarr(nums));

	}
	static int minarr(int[] arr){
	
		int min= arr[0];
		for(int index=1; index<arr.length; index++){
		  
			if(arr[index]< min){
				min = arr[index];
			//	return index;

		       }
		}
			return min;

	}
		
}

