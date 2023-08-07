package assignment4;

import java.util.*;

public class buy_sell_stock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int max=Integer.MIN_VALUE;
		int ar[]=new int [n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		int sell_ar[]=new int[ar.length];
		int sell=ar[ar.length-1];
		for(int i1=ar.length-1;i1>=0;i1--)
		{
			sell=Math.max(sell, ar[i1]);
			sell_ar[i1]=sell;
			
		}
		
		for(int x=0;x<ar.length;x++)
		{
			sum=sell_ar[x]-ar[x];
			if(sum>max)
			{
				max=sum;
			}
			
		}
		System.out.println(max);
		

	}

}
