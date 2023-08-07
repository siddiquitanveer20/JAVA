package assignment4;

import java.util.*;

public class array_intersec2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ar[] = new int[N];
		int br[] = new int[N];
		int cr[] = new int[N];
		int j = 0;
		int k = 0;
		int i = 0;

		for (i = 0; i < N; i++) {
			ar[i] = scn.nextInt();
		}
		for (i = 0; i < N; i++) {
			br[i] = scn.nextInt();
		}
		Arrays.sort(ar);
		Arrays.sort(br);

		int p = 0;
		int q = 0;
		while (q < br.length && p < ar.length) {
			if (ar[p] > br[q]) {
				q++;

			} else if (ar[p] < br[q]) {
				p++;

			} else {
				cr[k] = br[q];
				k++;
				p++;
				q++;
			}

		}
		System.out.print("[");
		for (int u = 0; u < k; u++) {
			if (u < k - 1)
				System.out.print(cr[u] + "," + " ");
			else
				System.out.print(cr[u]);

		}
		System.out.print("]");

	}

}
