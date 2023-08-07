package assignment4;

import java.util.Scanner;

public class calculate_the_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int temp = 0;
		int q1 = 0;
		long sum = 0;
		long ans = 0;
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		long C[] = new long[N];

		for (i = 0; i < N; i++) {
			A[i] = sc.nextLong();

		}
		int Q = sc.nextInt();
		long operation[] = new long[Q];
		for (i = 0; i < Q; i++) {
			operation[i] = sc.nextLong();
		}

		for (int u = 0; u < Q; u++) {
			q1 = (int)operation[u];
			for (i = 0; i < N; i++) {
				temp = i - q1;
				if (temp < 0) {
					temp = temp + N;

					B[i] = A[i] + A[temp];
				} else {
					B[i] = A[i] + A[temp];
				}
			}

			for (i = 0; i < N; i++) {
				A[i] = B[i];

			}

		}

		for (i = 0; i < N; i++) {
			sum = sum + A[i];
		}
		// System.out.println(sum);
		ans = sum % (int) ((Math.pow(10, 9) + 7));
		System.out.println(ans);

	}

}
