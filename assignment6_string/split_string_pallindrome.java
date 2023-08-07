package assignment6_string;

import java.util.Scanner;

public class split_string_pallindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	String a_pre="";
	String a_suff="";
	String b_pre="";
	String b_suff="";
	
	boolean res=false;
	for(int i=0;i<a.length()&&i<b.length();i++)
	{
		if(i==0)
		{
		a_pre="";
		b_pre="";
		a_suff=a.substring(i);
		b_suff=b.substring(i);
		if(pallindrome(a_pre+b_suff)) {
		    res=true;
		}
		if(pallindrome(b_pre+a_suff)) {
		    res=true;
		}
		} else if(i==a.length()-1) {
			a_pre=a.substring(0,i+1);
			b_pre=b.substring(0,i+1);
			a_suff="";
			b_suff="";
			if(pallindrome(a_pre+b_suff)) {
			    res=true;
			}
			if(pallindrome(b_pre+a_suff)) {
			    res=true;
			}
			
			
		}
		else
		{
			a_pre=a.substring(0,i+1);
			b_pre=b.substring(0,i+1);
			a_suff=a.substring(i);
			b_suff=b.substring(i);
			if(pallindrome(a_pre+b_suff)) {
			    res=true;
			}
			if(pallindrome(b_pre+a_suff)) {
			    res=true;
			}
			
		}
	}
	System.out.println(res);

	}

	public static boolean pallindrome(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;

		}
		return true;
	}
}