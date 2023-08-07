package assignment2;

import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		int res = chewbacca(X);
		System.out.println(res);

	}

	public static int reverse(int num) {
		int r = 0;
		int rev = 0;
		while (num != 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public static int chewbacca(int n) {
		int r = 0;
		int check = 0;
		int rev = 0;
		int temp = 0;
		while (n != 0) {
			r = n % 10;
			check = 9 - r;
			if (check >0&&check< r) {
				rev = rev * 10 + check;
			} else {
				rev = rev * 10 + r;
			}
			n = n / 10;
		}

		temp = reverse(rev);
		return temp;
	}

}
