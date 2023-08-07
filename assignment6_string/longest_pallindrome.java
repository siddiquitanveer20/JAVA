package assignment6_string;

import java.util.Scanner;

public class longest_pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int u=sc.nextInt();
		for(int t=0;t<u;t++) {
		
		String str=sc.next();
		
		pallinsubstring(str);}
		

	}
	public static void pallinsubstring(String str) {
		int max=-1000;
		String f_ans="";
		for (int c = 0; c < str.length(); c++) {
			String ans1=solve(str, c, c);
			int len1=ans1.length();//for odd substring
			String ans2=solve(str, c, c+1);
			int len2=ans2.length();
			if(len1>len2&&len1>max)
			{
				max=len1;
				f_ans=ans1;
			}
			else if(len2>len1&&len2>max)
			{
				max=len2;
				f_ans=ans2;
			}
			
		}
		int f_len=f_ans.length();
		System.out.println(f_ans);
		System.out.println(f_len);
	}
	public static String solve(String str, int L, int R) {
		String temp="";
		String ans="";
		int max=-1000;
		int len=0;
		while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
			temp=(str.substring(L, R + 1));
			len=temp.length();
			if(len>max)
			{
				max=len;
				ans=temp;
			}
			L--;
			R++;
		}
		return ans;
	}
	
}
