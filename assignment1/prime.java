package assignment1;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		int num =scn.nextInt();
		int i = 1;
		int c = 0;

		while (i <= num) {
			if (num % i == 0) {
				c++;
			}
			i++;

		}

		if (c == 2) {
			System.out.println("yes,its a prime number");
		} else {
			System.out.println("no,its not a prime number");
		}
	}

}
