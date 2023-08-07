package assignment6_string;

import java.util.*;

public class anagram_pallindrome_by_2_way {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		
		int t=scn.nextInt();
		for(int u=0;u<t;u++) {
			int ar[] = new int[26];
			String str = scn.next();
			int sum = 0;
			int len = 0;
			char temp = ' ';
			for (int i=0;i <str.length();i++) {
				temp = str.charAt(i);
				if(ar[temp-'a']==0) ar[temp-'a']=1;
				
				else ar[(int)temp-97]=0;
				
			}
			sum = sum(ar);
			len = str.length();
			if (len % 2 == 0) {
				if (sum  == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
			else {
				if (sum == 1) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
		}
	

	public static int sum(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}

}
