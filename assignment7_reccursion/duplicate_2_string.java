package assignment7_reccursion;

import java.util.Scanner;

public class duplicate_2_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		duplicate(str);

	}
	public static void duplicate(String str)
	{
		if(str.length()==1)
		{
			System.out.println(str.charAt(0));
			return;
		}
		
		if(str.charAt(0)==str.charAt(1))
		{
			System.out.print(str.charAt(0)+"*");
		}
		else
		{
			System.out.print(str.charAt(0));
		}
		duplicate(str.substring(1));
	}

}
