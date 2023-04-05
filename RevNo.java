import java.util.*;

public class RevNo
{
  static int reverse(int n)
  {
    int rev=0; 
    int r;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    System.out.print("the entered no is: " +n);
    
    while(n>0)
    {
      r = n%10;
      rev = (rev*10) + r;
      n = n/10;
    }
    return rev;
  } 
  public static void main(String[] args)
  {
    System.out.println("Reversed number:: " +reverse(n));
  }
}
