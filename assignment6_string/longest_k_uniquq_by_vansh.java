package assignment6_string;

import java.util.Scanner;

public class longest_k_uniquq_by_vansh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {

			String str = sc.next();
			int k = sc.nextInt();
			int ar[] = new int[26];
			int len = 0;
			int i = 0;
			int j = 0;
			while (j < str.length()) {
				int uc = count(ar);
				if (uc < k) {
					ar[str.charAt(j) - 'a']++;
					j++;

				} else if (uc > k) {
					ar[str.charAt(i) - 'a']--;
					i++;

				} else if (uc == k) {
					len = Math.max(len, j - i);
					ar[str.charAt(j) - 'a']++;
					j++;
				}

			}
			if (j == str.length() && count(ar) == k) {
				System.out.println(str.substring(i, j));
				len = Math.max(len, j - i);
			}
			System.out.println(len);
		}
	}

	public static int count(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= 1)
				count++;
		}
//		System.out.println(count);
		return count;

	}

}
