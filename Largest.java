import java.util.*;

public class Largest
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the three different numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    if(a>b)
    {
      System.out.println(a + " is greater than " + b);
      if(a>c)
      {
        System.out.println( a + " is greatest of all");
      }
      else 
        System.out.print(a+ " is not greater than" +c+ " . hence");
        System.out.println(c + " is greatest");
    }
      else if(b>c){
        System.out.println(b + " is greatest than " + c);
       }
      else
        System.out.println(b+ " is not greater than " + c + " . hence "+ c+ " is greatest");
  }
}

