package assignment2;

import java.util.*;

public class bin_to_dec {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans=bintodec(N);
		System.out.println(ans);

	}

	public static int bintodec(int num) {
		int r = 0;
		int sum = 0;
		int i = 0;
		while (num != 0) {
			r = num % 10;
			sum=sum+r*((int)(Math.pow(2, i)));
			num=num/10;
			i++;
		}
		return sum;
	}

}
