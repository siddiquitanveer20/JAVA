package assignment5;

import java.util.*;

public class remove_duplicate_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer str1 = new StringBuffer("");
		int k = 0;
		int i = 0;
		while (i < str.length()) {
			while (str.charAt(i) == str.charAt(i + 1)) {
				i++;
			}
			if(str.charAt(i) == str.charAt(i -1)) {
			str1.insert(k, str.charAt(i));
			k++;
			}
			if(str.charAt(i)!= str.charAt(i + 1)) {
				str1.insert(k, str.charAt(i));
			}
			

		}
	}

}
