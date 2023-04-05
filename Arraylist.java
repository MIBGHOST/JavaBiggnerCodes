import java.util.*;
import java.util.ArrayList;

public class Arraylist{

	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<>(5);

		list.add(76);
		list.add(78);
		list.add(54);
		list.add(65);

		System.out.println(list);
		System.out.println();
            	list.set(0, 67);
		System.out.println(list);
		System.out.println();

		list.remove(2);
		System.out.println(list);
		System.out.println();


		//input method
		for(int i=0; i<5; i++){
		
			list.add(in.nextInt());
		}
		// to get item at any index
		for(int i=0; i<5; i++){
		
			System.out.println(list.get(i));
		}
//		System.out.println();
	//	System.out.println(list);


	}
}
