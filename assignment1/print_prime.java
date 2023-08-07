package assignment1;

import java.util.Scanner;

public class print_prime {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int i=2;
		int c=0;
		while(i<=N)
		{
			int j=1;
			while(j<=i)
			{
				if(i%j==0)
				{
					c++;
				}
				j++;
			}
			if(c==2)
			{
				System.out.println(i);
			}
			i++;
			c=0;
		}
	}

}
