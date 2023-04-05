import java.util.*;

public class Shuffle{

	public static void main(String[] args){
	
		int[] nums = {78, 56, 79, 54, 55, 64, 67, 87};
		System.out.println("the array to be shuffled is: " +Arrays.toString(nums));
		shuffle(nums);
		System.out.println("the shuffled array is: " + Arrays.toString(nums));
	
	}
	static void shuffle(int[] nums){
	
		for(int index=nums.length-1; index>=1; index--){
		
			Random rand = new Random();
			int j = rand.nextInt(index + 1);
			swapelements(nums, index, j);

		}
	}
	static void swapelements(int[] nums, int index, int j){
	
		int temp = nums[index];
		nums[index] = nums[j];
		nums[j] = temp;
	}

	
}

