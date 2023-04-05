import java.util.Scanner;

public class Operator
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("enter any two numbers: ");
    float num1 = in.nextInt();
    float num2 = in.nextInt();
    
    float s = num1+num2;
    float p = num1*num2;
    System.out.println("the sumation: " + s + " the product: " +p);
 
    if(num1>num2)
    {
      System.out.println("the num1 is grearter than num2,then: ");
      float sub = num1 - num2;
      double div = num1/num2;
      System.out.println("the subtraction: " + sub + " the division: " + div);
    }
     else
      System.out.println("the num1 is less than num2 so cannot perform sub and div.");   
    
  
  }

}
