package assignment7_reccursion;

import java.util.Scanner;

public class twins {

	public static void main(String[] args) {
		boolean flag1=true;
		boolean flag2=true;
		int count1=0;
		int count2=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length()-2;i=i+2) {
			if(str.charAt(i)!=str.charAt(i+2)) {
				flag1=false;
				}
			if(str.charAt(i)==str.charAt(i+2)) {
				count1++;
				}
		}
		for(int i=1;i<=str.length()-3;i=i+2) {
			if(str.charAt(i)!=str.charAt(i+2)) {
				flag2=false;
				}
			if(str.charAt(i)==str.charAt(i+2)) {
				count2++;
				}
		}
		if(flag1&&flag2) {
			System.out.println(count1+count2);
		}
		else {
			System.out.println("-1");
		}

	}

}
