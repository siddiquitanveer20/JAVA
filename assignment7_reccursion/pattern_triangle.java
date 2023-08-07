package assignment7_reccursion;

import java.util.Scanner;

public class pattern_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern(n);

	}
	public static void pattern(int n)
	{
		if(n<0)
		{
			return;
		}
		pattern(n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}

}
