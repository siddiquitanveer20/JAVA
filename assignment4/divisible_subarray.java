package assignment4;

import java.util.Scanner;

public class divisible_subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int t = sc.nextInt();
		for (x = 0; x < t; x++) {
			int i = 0;
			int j = 0;
			int sum = 0;
			int count = 0;
			int res = 0;
			int k = 0;

			int N = sc.nextInt();
			int ar[] = new int[N];
			for (i = 0; i < N; i++) {
				ar[i] = sc.nextInt();
			}
			for (i = 0; i < N; i++) {
				sum=0;
				for (j = i; j < N; j++) {     
					sum=sum+ar[j];
					if(sum%N==0)
					{
						count++;
					}
					

				}
			}
			System.out.println(count);
		}

	}

}
