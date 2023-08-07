package assignment7_reccursion;

import java.util.Scanner;

public class recursion_subsequence {
 static int c=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		SS(str,"");
		
		System.out.println();
		count(str,"");
		System.out.println(c);
		

	}
	public static void count(String str, String team) {
		if (str.isEmpty()) {
			//System.out.println(team);
			c++;
			return  ;
		}
		char ch = str.charAt(0);
		String remain = str.substring(1);	
		
		
		
		count(remain, team);
		count(remain, team + ch);
		
		//return c;
		
		
	}
	public static void SS(String str, String team) {
		if (str.isEmpty()) {
			System.out.print(team+" ");
			return;
		}
		char ch = str.charAt(0);
		String remain = str.substring(1);	
		
		
		
		SS(remain, team);
		SS(remain, team + ch);
		
		
		
		
	}


}
