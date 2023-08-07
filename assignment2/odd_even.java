package assignment2;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int c_no[]=new int[5];
		for (int i = 0; i < N; i++) {
			 c_no[i] = scn.nextInt();
			}
for(int x=0;x<N;x++) {
	check(c_no[x]);
}
		

	}

	
	public static void check(int n) {
		int r = 0, sum1 = 0, sum2 = 0;
		while (n > 0) {
			r = n % 10;
			if (r % 2 == 0) {
				sum1 = sum1 + r; // even digit sum
			} else {
				sum2 = sum2 + r; // odd digit sum
			}
			n = n / 10;
		}
		if (sum1 % 4 == 0 || sum2 % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
