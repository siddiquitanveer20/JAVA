package assignment6_string;

import java.util.Scanner;

public class shortest_pallindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(pallindrome(str)) {
			System.out.println(str);
			return;
		}
		else {
		String str1="";
		String str2="";
		String strf="";
		StringBuffer strtemp=new StringBuffer("");
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str.substring(0,i);
			//System.out.println(str1);
			str2=str.substring(i);
			
			//aaSystem.out.println(strtemp);
			if(pallindrome(str1)) {
				for(int p=str2.length()-1;p>=0;p--)
				{
					strtemp.append(str2.charAt(p));
				}
				strf=strtemp+str;
				System.out.println(strf);
				return;
			}
		}
		
		}
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
