package assignment2;
import java.util.*;
public class simpleinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long sum=0;
		long x=0;
		long i=0;
		long ar[]=new long[100];
		for( i=0;i<100;i++)
		{
			ar[(int)i]=sc.nextLong();
			
			if(sum<0)
			{
				break;
			}
			sum=sum+ar[(int)i];
					}
	
		for(int j=0;j<i-1;j++)
		{
			
			System.out.println(ar[j]);
		}
		
		
	}

}
