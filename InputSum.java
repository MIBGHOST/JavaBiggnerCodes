import java.util.Scanner;
import java.lang.Math;

public class InputSum{

  public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    
    int n =1;
    int m =0;
    
    while(n != 0){
      n = in.nextInt();
      m = m+n;
 
    }
    System.out.println(m);

  }

}
