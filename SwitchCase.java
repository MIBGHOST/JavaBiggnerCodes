import java.util.*;

public class SwitchCase
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the EmployeeID: ");
    int id = in.nextInt();
    String dep = in.next();
   
    switch(id)
    {
      case 1-> System.out.println("emp 1: mib");
      case 2-> System.out.println("emp 2: ghost");
      case 3-> { System.out.println("emp 3: mibghost");
              switch(dep)
	       {
	        case "IT"-> System.out.println("IT department");
		case "PT"-> System.out.println("paint department");
		case "FT"-> System.out.println("food department");
		default -> System.out.println("enter valid argument");
	 
	       }
      }
     default -> System.out.println("enter valid argument");	       
    }

  }

}
