package assignment6_string;

import java.util.Scanner;

public class can_you_read_this {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		read(str);

	}

	public static void read(String str) {
		int k = 0;
		int idx = 0;
		int i=1;
		 String ans;
		while( i < str.length()) {
			 idx=str.charAt(i);
			 if(idx>='A'&&idx<='Z')
			 {
				 ans=str.substring(0,i);
				 System.out.println(ans);
				 str=str.substring(i);
				 i=0;
				 
			 }
			 i++;
			 

		}
		System.out.println(str);
	}

}
