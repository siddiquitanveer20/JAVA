package assignment5;

import java.util.Scanner;

public class difference_ascii_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int temp = 0;
		int k = 0;
		StringBuffer str1 = new StringBuffer(" ");
		for (int i = 0; i < str.length(); i = i + 2) {
			if (i == (str.length() - 1)) {
				temp=(int)str.charAt(i)-(int)str.charAt(i - 1);
				if(temp<0)
				str1.append(temp);
				str1.insert(k+1,str.charAt(i));

			} else {
				temp=(int)str.charAt(i + 1)-(int)str.charAt(i);
				str1.insert(k, str.charAt(i));
				str1.insert((k + 1), temp);
				str1.insert((k + 2), str.charAt(i + 1));
				k = k + 3;

			}
		}

		System.out.println(str1.toString());

	}

}
