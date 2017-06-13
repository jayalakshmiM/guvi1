import java.util.Scanner;

public class prime {
	 public static void main(String[] args)
	    {
		 Scanner in=new Scanner(System.in);
		 int i,m=0,flag=0;
		 int n=in.nextInt();
		  m=n/2;
		 for(i=2;i<=m;i++)
		 {
			 if(n%i==0)
			 {
				 System.out.println(" Not Prime");
				 flag=1;
				 break;
			 }
		 }
		 if(flag==0)
				 System.out.println("prime");
		
		 
	    }
}
