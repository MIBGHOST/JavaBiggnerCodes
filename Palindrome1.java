import java.util.*;

public class Palindrome1
{
  public static void main(String[] args)
  {
    String original, reverse="";
    Scanner in = new Scanner(System.in);
    
    System.out.print("enter the string to check wether the it is palindrome or not: ");
    original = in.nextLine();
    System.out.println("the enter string is: " +original);
    int length = original.length();
    
    for(int i=length-1; i>=0; i--)
      reverse= reverse+original.charAt(i);
    if(original.equals(reverse))
      System.out.println("entered string is a plindrome.");
    else
      System.out.println("entred string is not a palindrome.");
    
  }
}
