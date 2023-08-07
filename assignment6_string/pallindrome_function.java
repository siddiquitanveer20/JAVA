package assignment6_string;

import java.util.Scanner;

public class pallindrome_function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean ans=pallindrome(str);
		System.out.println(ans);

	}
	public static boolean pallindrome(String str)
	{
		int s=0;
		int e=str.length()-1;
		while(s<e)
		{
			if(str.charAt(s)!=str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		
		}
		return true;
	}

}
