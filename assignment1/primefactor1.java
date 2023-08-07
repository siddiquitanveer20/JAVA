package assignment1;

import java.util.Scanner;

public class primefactor1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int i=2;
		int c=0;
		int j=0;
		while(i<=n)
		{
			if(n%i==0)
			{
				j=1;
				while(j<=i)
				{
					if(i%j==0)
					{
						c++;
					}
					j++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
			i++;
			c=0;
		
			
		}

	}

}
