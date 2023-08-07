package assignment7_reccursion;

import java.util.Scanner;

public class n_knight {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		comb2D(n, 0, 0, n, "", board);
		System.out.println();
		System.out.println(count);

	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("/");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}

	public static void comb2D(int n, int r, int c, int QTP, String path, boolean[][] board) {
		if (QTP == 0) {// +ve BC
			count++;
			System.out.print(path + " ");
			//System.out.println();
			// print(board);
			// System.out.println("=================");
			return;
		}

		if (c == n) {
			r++;
			c = 0;
		}
		if (r == n) {// -ve BC
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			comb2D(n, r, c + 1, QTP - 1, path + "{" + r + "-" + c + "} ", board); // sit
			board[r][c] = false; // for next arrangments
		}
		comb2D(n, r, c + 1, QTP, path, board); // not sit
	}

	private static boolean isSafe(boolean[][] board, int r, int c) {
		// case 1
		int r1 = r - 2;
		int c1 = c + 1;
		boolean sp1 = false;
		if (r1 < 0 || c1 >= board[0].length) {
			sp1 = true;
		}
		if (!sp1) {
			if (board[r1][c1]) {
				sp1 = false;

			}

		}

		// case 2

		int r2 = r - 2;
		int c2 = c - 1;

		boolean sp2 = false;
		if (r2 < 0 || c2 < 0) {
			sp2 = true;
		}
		if (!sp2) {
			if (board[r2][c2]) {
				sp2 = false;
			}

		}
		// case 3
		int r3 = r - 1;
		int c3 = c - 2;

		boolean sp3 = false;
		if (r3 < 0 || c3 < 0) {
			sp3 = true;
		}
		if (!sp3) {
			if (board[r3][c3]) {
				sp3 = false;
			}

		}

		// case4

		int r4 = r - 1;
		int c4 = c + 2;

		boolean sp4 = false;
		if (r4 < 0 || c4 >= board[0].length) {
			sp4 = true;
		}
		if (!sp4) {
			if (board[r4][c4]) {
				sp4 = false;
			}

		}

		return (sp1 && sp2 && sp3 && sp4);
	}

}
