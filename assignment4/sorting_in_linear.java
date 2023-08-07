package assignment4;

import java.util.Scanner;

public class sorting_in_linear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int ar[] = new int[n];
		int i = 0;
		int j = 0;
		int k = 0;
		int ct = 0;
		int ct1 = 0;
		for (i = 0; i < n; i++) {
			ar[i] = sc.nextInt();

		}
		for (i = 0; i < n; i++) {
			if (ar[i] == 0) {
				c0++;
			} else if (ar[i] == 1) {
				c1++;
			} else if (ar[i] == 2) {
				c2++;
			}

		}
		i = 0;
		ct1 = c0;
		while (c0 != 0) {
			ar[i] = 0;

			c0--;
			i++;
		}
		j = ct1;
		ct = c1;
		while (c1 != 0) {
			ar[j] = 1;
			c1--;
			j++;
		}

		k = ct + ct1;
		while (c2 != 0) {
			ar[k] = 2;
			c2--;
			k++;
		}

		for (i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");

		}

	}

}
