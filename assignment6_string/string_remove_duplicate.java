package assignment6_string;

import java.util.Scanner;

public class string_remove_duplicate {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String ans=remdup(s);
	System.out.println(ans);

	}
	public static String remdup(String s) {
		
		StringBuffer str=new StringBuffer();
		int i=0;
		int k=0;
		int j=0;
		int count=0;
		int flag=0;
		while(i<s.length()) {
			if(i==s.length()-1&&count==0)
			{
				str.insert(k, s.charAt(i));
				k++;
			flag=1;
				break;
			}
			j=i+1;
			while(j<s.length())
			{
				if(s.charAt(i)==s.charAt(j))
				{
					j++;
					if(j==s.length()-1)
					{
						str.insert(k, s.charAt(j));
						k++;
						count=1;
						flag=1;
						break;
					}
				}
				else if(s.charAt(i)!=s.charAt(j))
				{
					break;
				}
			}
			if(flag==0)
			{
				str.insert(k, s.charAt(i));
				k++;
			}
			i=j;
		}
		return(str.toString());
	}

}
