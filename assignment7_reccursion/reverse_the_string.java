package assignment7_reccursion;

import java.util.Scanner;

public class reverse_the_string {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	revese(str,0);

	}
	public static void revese(String str,int idx)
	{
		
		if(str.length()==1)
		{
			System.out.print(str.charAt(0));
			return;
		}
		idx=0;
		revese(str.substring(idx+1),(idx+1));
		System.out.print(str.charAt(0));
	}
}
