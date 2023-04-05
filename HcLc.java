import java.util.Scanner;

public class HcLc{
  
  public static void main(String[] args){
  
    int num1, num2, temp, temp1, temp2, hcf, lcm;
    Scanner in= new Scanner(System.in);
    
    System.out.print("Enter the first no: ");
    num1 = in.nextInt();
    System.out.print("Enter the second no: ");
    num2 = in.nextInt();
    
    temp1=num1;
    temp2=num2;
    
    while(temp2!=0){
      temp = temp2;
      temp2 = temp1%temp2;
      temp1 = temp;
     
     }
  
    hcf = temp1;
    lcm = (num1*num2)/hcf;
    
    System.out.println("the hcf of numbers is:" + hcf);
    System.out.println("the lcm for the numbers is:" + lcm);
  
  }



}
