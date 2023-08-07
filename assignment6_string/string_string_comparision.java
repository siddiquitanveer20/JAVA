package assignment6_string;

import java.util.*;

public class string_string_comparision {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ans = comp(s);
		System.out.println(ans);

	}

	public static String comp(String s) {
	
		StringBuilder str = new StringBuilder();
		int i = 0, k = 0, j, u = 0;
		int flag=0;
		int count=0;
		while (i < s.length()) {
			if (i == s.length() - 1 && flag == 0) {
				str.insert(u, s.charAt(i));
				u++;
				 count=1;
				break;
			}
			j = i + 1;
			int c = 0;
			int flag1 = 0;
			int count1=0;
			while (j < s.length()) {
				if (s.charAt(i) == s.charAt(j)) {
					j++;
					c++;
					flag1 = 1;
					if (j == s.length() - 1) {
						str.insert(u, s.charAt(j));
						u++;
						flag = 1;
						count=1;
						if(count1==0)
						{
							str.insert(u, j+1);
							u++;
						}
						break;
					}
				}
				else if (s.charAt(i) != s.charAt(j)) {
					count1=1;
					break;
				}

			}
			if(count==0) {

			str.insert(u, s.charAt(i));
			u++;
			if (flag1 == 1 && c >= 1) {
				str.insert(u, c + 1);
				u++;
			}
			}
			i = j;
			

		}
		return (str.toString());

	}

}
