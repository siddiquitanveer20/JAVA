package assignment7_reccursion;

import java.util.Scanner;

public class odd_even_using_rec {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		if(n%2==0)
		poe_e(n,1);
		else
			poe_o(n,1);

	}
	public static void poe_e(int n,int r)
	{
		if(n==0)
		{
	
			return;
		}
		System.out.println(n-1);
		poe_e(n-2,1);

		System.out.println(n);
		
		
		
	}
	public static void poe_o(int n,int r)
	{
		if(n==r)
		{
			System.out.println(n);
			return;
		}
		System.out.println(n);
		poe_o(n-2,1);
		System.out.println(n-1);
		//.out.println(n-1);
	}

}
