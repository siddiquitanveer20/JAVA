package assignment4;

import java.util.Scanner;

public class maxm_circular_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int p = 0; p < t; p++) {
			int max = Integer.MIN_VALUE;
			int sum = 0;
			int n = sc.nextInt();
			int ar[] = new int[n];

			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();

			}
			for (int u = 0; u < n; u++) { // rotate loop

				int temp = ar[ar.length - 1];
				for (int j = ar.length - 2; j >= 0; j--) {
					ar[j + 1] = ar[j];

				}
				ar[0] = temp;
				sum = 0;
				for (int i = 0; i < n - 1; i++) {
					sum = sum + ar[i];

				}
				if (sum > max) {
					max = sum;
				}

			}
			System.out.println(max);
		}

	}

}
