package assignment4;

import java.util.Scanner;

public class max_subpath_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int i = 0;
			int j = 0;
			int ans1 = 0;
			int ans2 = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ar[] = new int[n];
			int br[] = new int[m];
			for (i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			for (j = 0; j < m; j++) {
				br[j] = sc.nextInt();
			}
			int p = 0;
			int q = 0;
			int sum1 = 0, sum2 = 0;
			int ans = 0;
			int temp = 0;
			while (p < ar.length && q < br.length) {
				if (ar[p] < br[q]) {

					sum1 = sum1 + ar[p];
					p++;

				} else if (br[q] < ar[p]) {

					sum2 = sum2 + br[q];
					q++;
				}

				else if (ar[p] == br[q]) {
					if (sum1 > sum2) {
						sum1 = sum1 + ar[p];
						ans1 = ans1 + sum1;
					} else {
						sum2 = sum2 + br[q];
						ans1 = ans1 + sum2;
					}
					sum1 = 0;
					sum2 = 0;
					p++;
					q++;

				}

			}
			if (p < ar.length-1) {
				for (int u = p; u < ar.length; u++) {

					sum1 = sum1 + ar[u];

				}

			} else if (q < br.length-1) {
				for (int u = q; u < br.length; u++) {

					sum2 = sum2 + br[u];

				}

			}
			if (sum1>sum2) {
				ans1 = ans1 + sum1;
			} else {
				ans1 = ans1 + sum2;
			}

			System.out.println(ans1);

		}

	}

}
