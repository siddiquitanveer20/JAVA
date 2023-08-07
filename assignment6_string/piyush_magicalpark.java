package assignment6_string;

import java.util.Scanner;

public class piyush_magicalpark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // row
		int M = sc.nextInt(); // column
		int K = sc.nextInt();
		int S = sc.nextInt();
		char[][] ar = new char[N][M];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.next().charAt(0);
			}
		}
		magicalpark(ar, K, S);

	}

	public static void magicalpark(char[][] ar, int K, int S) {
		int i = 0;
		int j = 0;
		int flag = 0;
		int count = 0;
		while (i < ar.length) {

			while (j < ar[0].length) {
				if (ar[i][j] == '.') {

					if (j == ar[0].length - 1) {
						S = S - 2;
						i++;
						j = 0;
						flag = 1;
						break;

					} else {
						S = S - 2;
						j++;
						S = S - 1;
					}
					if (S < K) {
						System.out.println("No");
						return;
					}
				} else if (ar[i][j] == '*') {
					if (j == ar[0].length - 1) {
						S = S + 5;
						i++;
						j = 0;
						flag = 1;
						break;

					} else {
						S = S + 5;
						j++;
						S = S - 1;
					}
					if (S < K) {
						System.out.println("No");
						return;
					}
				} else if (ar[i][j] == '#') {
					i++;
					j = 0;
					flag = 1;
					break;

				}

			}
			if (flag == 0) {
				i++;
				j = 0;

			}
		}
		System.out.println("Yes");
		System.out.println(S);
	}

}
