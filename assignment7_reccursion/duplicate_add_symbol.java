package assignment7_reccursion;

import java.util.Scanner;

public class duplicate_add_symbol {
	static int i = 0;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		 char[] ar = new char[(2*str.length())];
		char ans[] = duplicate(str,ar);
		for(int i=ans.length-1;i>=0;i--)
		{
			System.out.print(ans[i]);
		}

	}

	public static char[] duplicate(String str,char []ar) {
		if (str.length() == 1) {
			ar[i]=str.charAt(0);
			i++;
			return ar;
		}
		char ch = str.charAt(0);
		char ch1[] = duplicate(str.substring(1),ar);
		if (ch == ch1[ar.length-1]) {
			
			ch1[i] = '*';
			i++;
			ch1[i] = ch;
			i++;
			return ch1;
		} else {
			ch1[i] = ch;
			i++;
			return ch1;
		}

	}

}
