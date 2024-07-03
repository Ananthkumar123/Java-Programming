import java.util.Scanner;
public class Switch {
//days in a week
	public static void main(String[] args) {
	 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter a day");
		 String day = scanner.next();
		 
		 switch(day) {
		  
		 case "1":
			 System.out.println("this is monday");
			 break;
		 case "2":
			 System.out.println("this is tuesday");
			 break;
		 case "3":
			 System.out.println("this is wednesday");
			 break;
		 case "4":
			 System.out.println("this is thursday");
			 break;
			 default :
				 System.out.println("select 1 to 4 number");
		 }
		 
 
    }
	}
