package assignment7_reccursion;

import java.util.Scanner;

public class no_of_occurence {
static int c=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		count(str,ch);
		System.out.println(c);
		

	}
	public static void count(String str,char ch)
	{
		if(str.length()==0)
		{
			return ;
		}
		
		count(str.substring(1),ch);
		if(str.charAt(0)==ch) {
			 c++;
			
		}
		
	}

}
