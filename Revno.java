import java.util.*;

public class Revno{
  
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number to be reversed: ");
    int n = in.nextInt();
    int count = 0;
    
    
    while(n>0){
      
      int mod = n%10;
      count++;
      System.out.print(mod);
      n = n/10;
        
    }
  }
}
