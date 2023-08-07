package assignment7_reccursion;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int ans =facto(n);
			System.out.println(ans);
		}

	}
	public static int facto(int n)
	{
		if(n==0)
		{
			return 1;
			
		}
		return n*facto(n-1);
	}

}
