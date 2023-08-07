package assignment7_reccursion;

import java.util.Scanner;

public class twins_reccursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0;int j=2;
		int count=0;
		sulve(i,j,str,count);

	}
	public static void sulve(int i,int j,String str,int count) {
		if(i==str.length()||j==str.length()) {
			System.out.println(count);
			return;
		}
		if(str.charAt(i)==str.charAt(j)) {
			sulve(i++,j++,str.substring(1),count++);
		}
		
		sulve(i++,j++,str.substring(1),count);
	}

}
