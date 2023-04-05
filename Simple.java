import java.util.Scanner;

public class Simple
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("enter the principal amount: ");
    int P = in.nextInt();
    System.out.print("enter the number of years taken for: ");
    int T = in.nextInt();
    System.out.print("enter the rate at which it given to u: ");
    int R = in.nextInt();
    
    double si = P*R*T/100;
    System.out.print("the simple interest for above entered values is: " + si);
  
  }
}
