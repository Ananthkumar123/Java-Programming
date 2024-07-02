//2345 add even and product odd

public class Evenodd {

	public static void main(String[] args) {
		
		int num = 2345, sumeven=0, productodd=1 ;
		while(num>0) {
			int digit =num%10;//9
			
			if(digit%2==0) {//
				sumeven +=digit;
			}
			else {
				
				productodd *=digit;
			}
			num =num/10;//
		}
		System.out.println("number sum even is "+sumeven);
		System.out.println("number product odd is "+ productodd);
		

	}

}
