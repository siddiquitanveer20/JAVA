package assignment5;

import java.util.Scanner;

public class spiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int ar[][] = new int[M][N];
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		int rs = 0;
		int re = ar.length - 1;
		int cs = 0, ce = ar[0].length - 1;
		int cnt = 0;
		int max = ar.length * ar[0].length;
		while (cnt < max) {
			for (int r = rs; r <=re && cnt < max; r++) {
				System.out.print(ar[r][cs] + ",");
				cnt++;
			}

			for (int c = cs + 1; c <=cs && cnt < max; c++) {
				System.out.print(ar[re][c] + ",");
				cnt++;
			}

			for (int r = re - 1; r >= rs && cnt < max; r--) {
				System.out.print(ar[r][ce] + ",");
				cnt++;
			}

			for (int c = ce - 1; c >= cs + 1 && cnt < max; c--) {
				System.out.print(ar[rs][c] + ",");
				cnt++;

			}

			cs++;
			ce--;
			rs++;
			re--;
		}
		System.out.println("END");

	}

}
