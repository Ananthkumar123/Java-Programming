//2 3 4 9 16 29
public class Tribonacci {

	public static void main(String[] args) {
		
		int a =2, b=3,c=4,start=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(;start<=10;start++)
		{
			System.out.println(c);
			int temp =c;
			int temp1 =b;
			c=a+b+c;
			b=temp;
			a=temp1;
			
		}
		

	}

}
