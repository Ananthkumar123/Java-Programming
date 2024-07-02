//factors of a number 
class Prime{
	public static void main(String arg[]) {
		int num=10,start=1,count=0;
		for(;num>start;start++) {
			if(num%start==0) {
				count++;
				System.out.println(start);//factors of number
				
			}
			
		}
	
			if(count==2) //for prime 
				System.out.println("its a prime ");
			
			else
				System.out.println("its not aa prime ");
				
		
		
	}	
	
}