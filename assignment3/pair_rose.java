package assignment3;

import java.util.Scanner;

public class pair_rose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int x = 0; x < T; x++) {
			int temp = 0;
			int res = 0;
			int temp1 = 0;
			int diff = 0;
			int f = 0, g = 0;
			int mdif = Integer.MAX_VALUE;
			int N = sc.nextInt();
			int price[] = new int[N];
			for (int i = 0; i < N; i++) {
				price[i] = sc.nextInt();
			}
			int M = sc.nextInt();
			for (int p = 0; p < N - 1; p++) {
				for (int q = p + 1; q < N; q++) {
					if (price[p] > price[q]) {
						temp = price[p];
						price[p] = price[q];
						price[q] = temp;
					}
				}
			}
			for (int j = 0; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					res = price[j] + price[k];
					if (res == M) {
						if (j <= k) {
							diff = price[k] - price[j];
							if (diff < mdif) {
								mdif = diff;
								f = price[j];
								g = price[k];

							}

						}

					}
				}

			}
			System.out.println(
					"Deepak should buy roses whose prices are " +f+ " and "+g+ ".");
			

		}

	}
}
