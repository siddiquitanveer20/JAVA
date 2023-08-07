package assignment7_reccursion;

import java.util.Scanner;

public class n_knight_2 {
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
		boolean sp1 = true;
		if (r-2 >= 0 && c+1 < board[0].length) {
			if (board[r-2][c+1]) {
				sp1 = false;

			}

		}

		// case 2
		if (r-2 >= 0 && c-1 >= 0) {
			if (board[r-2][c-1]) {
				sp1 = false;
			}

		}
		// case 3
		if (r-1 >= 0 && c-2 >= 0) {
			if (board[r-1][c-2]) {
				sp1 = false;
			}

		}

		// case4


		
		if (r-1 >= 0 && c+2< board[0].length) {
			if (board[r-1][c+2]) {
				sp1 = false;
			}

		}

		return sp1;
	}

}
