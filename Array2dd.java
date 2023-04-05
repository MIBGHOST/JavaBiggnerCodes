import java.util.*;

public class Array2dd{

	public static void main(String[] args){
	
		arr();
	}

	static void arr(){
	
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.println("enter the numbers to array whose lentgh is: " + arr.length);

		for(int row=0; row<arr.length; row++){
	//	for(int[] row : arr){
		 
		//	for(int[] col : arr){
			for(int col=0; col<arr[row].length; col++){
			
				arr[row][col] = in.nextInt();
			}
		}

	       // for(int row=0; row<arr.length; row++)
	          for(int[] row : arr) {
		
		//	for(int col=0; col<arr[row].length; col++){
				System.out.print(Arrays.toString(row));
				System.out.println();

			}
		
		
		}
			


	}


