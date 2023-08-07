package assignment4;

import java.util.Scanner;

public class product_of_array_exceptitself {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int count=0;
			long ans=0;
			int max=Integer.MIN_VALUE;
			long ar[]=new long[N];
			for(int i=0;i<N;i++)
			{
				ar[i]=sc.nextInt();
			}
			for(int i=0;i<N;i++)
			{
				count=0;
				for(int j=0;j<N;j++)
				{
					if(ar[i]==ar[j])
							{
						count++;
							}
				}
				if(count>max)
				{
					max=count;
					ans=ar[i];
				}
			}
			System.out.println(ans);
			

		

	}

}
