
public class lcfandhcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hcf and lcf
				int num1=12,num2 =16,min=0,start=2,hcf=0,lcf=0;
				if(num1<num2)
				{
					min=num1;
				}
				else 
				{
					min =num2;
				}
				for(;start<=min;start++)
				{
					if(num1%start==0 && num2%start==0)
					{
					    	hcf =start;
					}
				}
				System.out.println("hcf of num1 and num2 is "+hcf);
				
				for(;min>=2;min--)
				{
					if(num1%min==0 && num2%min==0)
					{
					    	lcf =min;
					}
				}
				System.out.println("lcf is "+lcf);
				 
				
	}

}
