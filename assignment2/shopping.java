package assignment2;

import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		int A, B;
		for (int i = 1; i <= T; i++) {
			A = scn.nextInt();
			B = scn.nextInt();
			if (A <= 1000000&&A>=1 && B>=1&&B <= 1000000) {
                if(A>B)
                {
                	System.out.println("Aayush");
                }
                else {
                	System.out.println("Harshit");
                }
			}

		}
	}

}
