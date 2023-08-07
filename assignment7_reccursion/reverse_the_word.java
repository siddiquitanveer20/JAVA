package assignment7_reccursion;

import java.util.Scanner;

public class reverse_the_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		revese(str);

	}

	public static void revese(String str)
	{
		int flag=0;
		int idx=str.lastIndexOf(" ");
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)==' ')
		{
			
			flag=1;
		}
		}
		if(flag==0)
		{
			System.out.print(str);
			return;
			
		}
		else {
		System.out.print(str.substring(idx+1));
		System.out.print(" ");
		revese(str.substring(0,idx));
		}
		
	}

}
