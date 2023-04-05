import java.util.Scanner;
import java.math.*;

public class Table{
  
  public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    System.out.print("enter any number to print the table: ");
    int num = in.nextInt();
    System.out.println("The table is:- ");
    
    for(int i=1; i<=10; i++){
       
       int t = num * i;
       System.out.println(t);
       
    
    }
  
  
  }


}
