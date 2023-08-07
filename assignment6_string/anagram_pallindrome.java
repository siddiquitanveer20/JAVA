package assignment6_string;

import java.util.Scanner;

public class anagram_pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.nextLine());
		
		int len = str.length();
		if (len % 2 == 0) {
			check_e(str);
		} else {
			check_o(str);
		}

	}

	public static void check_e(StringBuffer str) {
		int i=0;
		int j=0;
		int c=1;
		while(i<str.length()-1) {
			j=i+1;
			c=1;
			while(j<str.length()) {
				if(str.charAt(i)==str.charAt(j))
				{
					//str.deleteCharAt(i);
					str.deleteCharAt(j);
					c++;       //even occurence
					
				}
				else
				{
					j++;
				}
			}
			if(c%2!=0)
			{
				System.out.println("No");
				return;
			}
			i++;
		}
       System.out.println("Yes");
       
	}

	public static void check_o(StringBuffer str) {
		int i=0;
		int j=0;
		int c=1;
		int count=0;
		int flag=0;
		while(i<str.length()-1) {
			j=i+1;
			c=1;
			while(j<str.length()) {
				if(str.charAt(i)==str.charAt(j))
				{
					//str.deleteCharAt(i);
					str.deleteCharAt(j);       //even occurence
					c++;
					j++;
					flag=0;
				}
				else
				{
					j++;
					flag=1;          //odd occurence
				}
			}
			if(flag==1)
			{
				count++;
			}
			if(c%2!=0)
			{
				if(count>1) {
				System.out.println("No");
				return;}
			}
			i++;
		}
       System.out.println("Yes");
       

	}

}
