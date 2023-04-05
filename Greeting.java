import java.util.Scanner;

public class Greeting
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("enter the name for whome u wanna write greeting: ");
    String name = in.nextLine();
    System.out.println("hello "  + name +  " here is greeting from mibghost for u.   hope u enjoying yr new years eve.");
     
  }

}
