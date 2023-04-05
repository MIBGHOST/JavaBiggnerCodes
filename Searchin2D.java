import java.util.*;

public class Searchin2D{

	public static void main(String[] args){
	
	       	int[][] nums = {

		           {1,2,3,4},
			   {5,6},
			   {7},
		           {8,9}
		
		           };
		int target= 9;
		int[] value = search2d(nums, target);
		System.out.println(Arrays.toString(value));

	}
	static int[] search2d(int[][] arr, int target){
	
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				if(arr[i][j]==target){
					return new int[] {i, j};
				}
			}
		}
		return null;
	}

}
