package assignment6_string;

import java.util.Scanner;

public class playing_with_goodsubstring_by2_method {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int i=0;
	int j=0;
	int max=0;
	
	while(i<str.length()&&j<str.length())
	{
		if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u') {
			j++;
	
		}
		else
		{
			
			if((j-i)>max) {
				max=j-i;
			}
			j++;
			i=j;
			
		}
	}
	if((j-i)>max) {
		max=j-i;
	}
 System.out.println(max);
	}

}
