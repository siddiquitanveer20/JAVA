package assignment1;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		int n = 1;
		int temp = 0;
		int lcm = 0;
		while (n <= num1 || n <= num2) {
			if (num1 % n == 0 && num2 % n == 0) {
				temp = n;
			}
			n++;
		}
		lcm =  (num1 * num2)/temp;
		System.out.println(lcm);
	}
}
