
public class Exam {
//swapping even and odd
	public static void main(String[] args) {
	 
	 int a[] =new int[] {10,20,30,40,50,60,70,80};
	 int b[] =new int[a.length/2];//odd
	 int c[] = new int[a.length] ;//even
	 int d[] =new int[a.length];

	 for(int x=0;x<a.length;x++)
	 { 
		 if(x%2==0)
		 {
			 b[x]=a[x];
			 System.out.print(b[x]+",");
		 }
		 else 
		 {
			 c[x]=a[x];
			 System.out.println(c[x]+",");
			 
		 }
	 }
	 for(int temp:b)
		 System.out.print(temp+" ");
	  System.out.println();
	 for(int x=0;x<a.length;x++)
	 {
		// for(int y)
	 }
	 
	}

}
