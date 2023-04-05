import java.util.*;

public class SearchinStrings{

	public static void main(String[] args){
	
		String name = "mibghost";
		char target = 'h';
	//	System.out.println(searchstrings(name, target));
	        System.out.println(Arrays.toString(name.toCharArray()));

	}
        static boolean searchstrings(String str, char target){
        
	//	for(int index=0; index<=str.length(); index++){
	//	
	//		if(target == str.charAt(index)){
	//		
	//			return index;
	
		for(char ch : str.toCharArray()){

			if(ch == target){
			
				return true;
			}
			}
		return false;
		}
		
}

