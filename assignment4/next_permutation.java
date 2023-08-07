package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class next_permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int l = 0; l < t; l++) {
			int N = sc.nextInt();
			int first = 0;
			int second = 0;
			int temp = 0;
			int temp1 = 0;
			int flag = 0;
			int A[] = new int[N];
			for (int m = 0; m < N; m++) {
				A[m] = sc.nextInt();
			}
			for (int i = A.length - 1; i >= 0; i--) { 
				if(i>=1) {
				if (A[i] > A[i - 1]) {
					first = i;
					flag = 1;
					break;
				}
				}

			}
			if(flag==0)
			{
				 
						Arrays.sort(A);
						for (int u = 0; u < N; u++) {
							System.out.print(A[u] + " ");
						}
			
					
			}
			if (flag == 1) {
				for (int j = A.length - 1; j >= 0; j--) { // find largest j

					if (A[j] > A[first - 1]) {
						second = j;
						flag = 2;
						break;
					} 
				}
			}
			if (flag == 2) {
				temp = A[first - 1];
				A[first - 1] = A[second]; // swapping
				A[second] = temp;

				int p = first;
				int q = A.length - 1;
				while (p < q) {
					temp1 = A[p];
					A[p] = A[q];
					A[q] = temp1;

					p++;
					q--;
				}
				for (int x = 0; x < N; x++) {
					System.out.print(A[x] + " ");
				}
			}
		}
	}

}
