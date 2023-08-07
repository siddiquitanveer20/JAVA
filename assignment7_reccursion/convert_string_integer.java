package assignment7_reccursion;

import java.util.Scanner;

public class convert_string_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		convert(str);

	}
	public static void convert(String str)
	{
		if(str.length()==0)
		{
			return;
		}
		int temp=(int)str.charAt(0);
		System.out.print(temp-48);
		convert(str.substring(1));
	}

}
