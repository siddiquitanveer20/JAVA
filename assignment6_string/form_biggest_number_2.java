package assignment6_string;

import java.util.*;

public class form_biggest_number_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int m = scn.nextInt();
			int[] ar = new int[m];
			for (int j = 0; j < m; j++) {
				ar[j] = scn.nextInt();

			}
			bigger(ar);

		}

	}

	public static void bigger(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (Integer.parseInt(String.valueOf(ar[min_index]) + String.valueOf(ar[j])) > Integer
						.parseInt(String.valueOf(ar[j]) + String.valueOf(ar[min_index]))) {
					min_index = j;
				}
			}
			if (i != min_index) {

				int temp = ar[i];
				ar[i] = ar[min_index];
				ar[min_index] = temp;

			}

		}
		for (int k = ar.length - 1; k >= 0; k--) {
			System.out.print(ar[k]);
		}

	}

}
