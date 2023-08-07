package assignment5;

import java.util.Scanner;

public class toggle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char x, y;
		int temp = 0;
		StringBuffer str = new StringBuffer(" ");
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
				temp = ((int) (S.charAt(i))) - 32;

				x = (char) (temp);

				str.insert(i, x);

			}
			if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
				temp = ((int) (S.charAt(i)))+32;

				x = (char) (temp);

				str.insert(i, x);

			}

		}
		System.out.println(str.toString());

	}

}
