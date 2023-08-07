package assignment7_reccursion;

import java.util.Scanner;

public class twins_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;int j=2;
		int count=0;
		while(i<str.length()&&j<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				i++;j++;
				
			}
			else {
				i++;j++;
			}
			
		}
		System.out.println(count);

	}

}
