import java.util.*;

public class Armstrong
{
  public static void main(String[] args)
  {
   int num1, num2;
   Scanner in = new Scanner(System.in);
   System.out.print("ENTER the first no: ");
   num1 = in.nextInt();
   System.out.print("Enter the second no: ");
   num2 = in.nextInt();
   
   for(int i=num1; i<num2; i++)
    {
     int check, r, sum=0;
     check = i;
     while(check!=0)
     {
       r = check%10;
       sum = sum+(r*r*r);
       check = check/10; 
     } 
     
    if(sum == i)
     System.out.println("the entered number is armstrong: " +sum);
  //  else
  //   System.out.println("the entered number is not an armstrong: "+sum);
    }
  }  
}
