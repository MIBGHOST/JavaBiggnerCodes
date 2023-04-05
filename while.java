public class Loopy
{
 public static void main(String[] args)
 {
  int x=1;
  System.out.println("before the loop");
  while(x<4)
  {
   System.out.println("in the loop");
   System.out.println("the value of x is=" +x);
   x=x+1;
  }
  System.out.println("this will print at any cost");
 }
}
