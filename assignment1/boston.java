package assignment1;

import java.util.Scanner;

public class boston {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N= scn.nextInt();
		
		int c=0;
		int a=0;
		int a1=0;
		int add1=0;
		int add=0;
		int sum=0;
		int quo=N;
		int temp=N;
		int temp1;
		while(temp!=0)
		{
			a=temp%10;
			add=add+a;
			temp=temp/10;
		}
		for(int i=1;i<=N;i++)
		{
			c=0;
			if(N%i==0)
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
					temp1=i;
					while(temp1!=0)
					{
						a1=temp1%10;
						add1=add1+a1;
						temp1=temp1/10;
					}
                       sum=add1;
				}
				
			}
		}
		/*if(add==sum)
		{
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}*/
	    System.out.println(sum  +"  "+ add);

	}

}

