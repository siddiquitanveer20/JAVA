package assignment6_string;

import java.util.Scanner;

public class cout_pallindrome_substing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		pallinsubstring(str);

	}
	static int count=0;
	public static void pallinsubstring(String str) {
		int count1=0;
		int count2=0;
		int ans=0;
		for (int c = 0; c < str.length(); c++) {
			 count1=solve(str, c, c);      //for odd substring
			 count2=solve(str, c, c+1);
			 if(count1>count2)
			 {
				 ans=count1;
			 }
			 else
			 {
				 ans=count2;
			 }
			
		}
		System.out.println(ans);
	}
	public static int solve(String str, int L, int R) {
		String temp="";
	
		int len=0;
	
		while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
			temp=(str.substring(L, R + 1));
			len=temp.length();
			if(len>=2)
			{
				count++;
				
		        
			}
			L--;
			R++;
		}
		return count;
	}

}
