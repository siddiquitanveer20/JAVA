package assignment2;

import java.util.*;

public class countdigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Digit = scn.nextInt();
		int ans = count(N, Digit);
		System.out.println(ans);

	}

	public static int count(int n, int d) {
		int r = 0;
		int c = 0;
		while (n != 0) {
			r = n % 10;
			if (r == d) {
				c++;
			}
			n = n / 10;
		}
		return c;
	}

}
