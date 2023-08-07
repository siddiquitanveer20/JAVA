package assignment7_reccursion;

import java.util.Scanner;

public class pattern_triangle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=0;i<n;i++)
		{
			System.out.print("*"+"	");
		}
		System.out.println();
		pattern(n-1);
		
	}

}
