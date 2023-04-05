import java.util.Scanner;

public class TypePromotion{
  
  public static void main(String[] args){
   
    Scanner input = new Scanner(System.in);
    
    int i = 1;
    byte b = 54;
    short s = 3982;
    char c = 'a';
    float f = 5.987f;
    double d = 0.897d;
    double result = (f * d)  + (i/c) - (d*s);
    
    System.out.println((f*d) + " " +(i/c) + " " +(d*s));
    System.out.println(result);
    
      }
  
   }

