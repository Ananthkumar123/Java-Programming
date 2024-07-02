//any of number 1364 
public class Aarmstrongnumber {

	public static void main(String[] args) {
		int num =1634,count=0,temp=num,sum=0,rem=0;
		while(num>0) {
			rem=num%10;//rem= 4,3,6
			count++;//1,2,3
			num=num/10;//163,16,1,0
			}
		num=temp;
		while(num>0) {
		rem = num%10;
		sum = sum + (int)Math.pow(rem,count);
		num=num/10;
		}
		if(sum==temp)
		{
		System.out.println("its armstrong number"+sum);
		}
		else {
			System.out.println("its not armstrong number"+sum);	
			
		}
	}

}
