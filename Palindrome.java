//import java.util.Scanner;

public class Palindrome{  
     public static void main(String args[]){  
          
  //  Scanner in = new Scanner(System.in);
  //  int n = in.nextInt();  
      int r,sum=0,temp;
      int n=758;
      
      temp=n;    
      while(n>0){    
       r=n%10;  //getting remainder  
       sum=(sum*10)+r;    
       n=n/10;    
      }    
      if(temp==sum)    
       System.out.println("palindrome number ");    
      else    
       System.out.println("not palindrome");    
    }  
    }  
