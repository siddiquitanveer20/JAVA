package assignment1;

import java.util.Scanner;

public class primefactor2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num= scn.nextInt();
		int c=0;
		int temp=num;
		int quo=num;
		for(int i=1;i<=num;i++)
		{
			c=0;
			if(num%i==0)
			{
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
				
				}
			}
			if(c==2)
			{
				while(quo%i==0)
				{
					quo=quo/i;
					System.out.print(i+" ");
				}
			}
		}

	}

}
