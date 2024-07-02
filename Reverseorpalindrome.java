//12345 
public class Reverseorpalindrome {

	public static void main(String[] args) {
		int  num=12345,rev=0;
		for(;num>0;) {
			int dig=num%10;
		   rev= rev*10+dig;
		   num=num/10;
			System.out.println("reversing the number "+rev);

		}
		System.out.println("final number"+rev);
		}
	

}
