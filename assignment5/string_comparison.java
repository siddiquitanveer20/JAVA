package assignment5;

import java.util.Scanner;

public class string_comparison {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		int c=0;
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<str.length();i++)
		{
			c=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					c++;
				}
				else if(str.charAt(i)!=str.charAt(j))
				{
					break;
				}
			}
			str1.insert(i, str.charAt(i));
			str1.insert(i+1, c-1);
		}
		System.out.println(str1.toString());

	}

}
