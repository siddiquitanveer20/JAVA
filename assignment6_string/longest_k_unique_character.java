package assignment6_string;

import java.util.*;

public class longest_k_unique_character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int k = sc.nextInt();
		int ar[] = new int[26];
		int len = 0;
		int i = 0;
		int j = 0;
		int uc = 0;
		while (j<str.length()) {
			uc = count(ar);
			if (uc < k) {
				ar[ str.charAt(j) - 'a']++;
				j++;

			} else if (uc > k) {
				ar[str.charAt(i) - 'a']--;
				i++;

			} else if (uc == k) {
				len = Math.max(len, j - i );
				j++;
			}

		}
		len = Math.max(len, (j - i ));
		System.out.println(len);
	}


	public static int count(int[] ar) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				count++;
			}
		}
		return count;

	}

	public static int length(int[] ar) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}
}
