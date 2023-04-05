import java.util.*;

public class FindNo
{
 public static void main(String[] args)
 {
  System.out.print("Enter the number in which u want to find the repeated   no: ");
  
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  //int length = n.length();
  System.out.println("Enter the digit from " +n+ " of which u want to check the repetion: ");
  int m = in.nextInt();
  int i=0;
  
  while(n>0)
  {
   int mod = n%10;
    n = n/10;
   if(mod == m)
   {
    i++;
    }   
  }  
  System.out.println("the number of times it itterates is: " + i);
  
 }
}
