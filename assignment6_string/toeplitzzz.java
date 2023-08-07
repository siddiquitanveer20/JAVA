package assignment6_string;

import java.util.Scanner;

public class toeplitzzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // row
		int N = sc.nextInt(); // column
		int ar[][] = new int[M][N];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		toeplitzz(ar);
	}
	public static void toeplitzz(int ar[][]) {
		int u = 0;
		int v = 0;
		for (int j = 0; j < ar[0].length-1; j++) {
			u = 0;
			v = j;
			while (u < ar.length && v < ar[0].length) {
				if (ar[u][v] == ar[u + 1][v + 1]) {
					u++;
					v++;
					if (u >= ar.length - 1 || v >= ar[0].length - 1) {
						break;
					}
				} else {
					System.out.println("false");
					return;
				}
			}
		}
		int x = 0;
		int y = 0;
		for (int i = 1; i < ar.length-1; i++) {
			x = i;
			y = 0;
			while (x < ar.length && y < ar[0].length) {
				if (ar[x][y] == ar[x + 1][y + 1]) {
					x++;
					y++;
					if (x >= ar.length - 1 || y >= ar[0].length - 1) {
						break;
					}
				} else {
					System.out.println("false");
					return;
				}
			}
		}
		System.out.println("true");
	}

}
