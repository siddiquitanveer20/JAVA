package assignment7_reccursion;

import java.util.Scanner;

public class nth_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=tri(n);
		System.out.println(ans);

	}
	public static int tri(int n) {
		int sp=0;
		if(n==0) {
			return 0;
		}
		sp=tri(n-1);
		return sp+n;
	}

}
