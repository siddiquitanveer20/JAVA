package assignment3;

import java.util.Scanner;

public class triple_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int ar[] = new int[N];
		for (int h = 0; h < N; h++) {
			ar[h] = sc.nextInt();
		}
		int target = sc.nextInt();
		int temp=0;
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
				
				
				
			}
		}

		sum_pair(ar, target);
	}
	

	public static void sum_pair(int[] a, int m) {
		int x = 0;

		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length; k++) {
				for (int v = 0; v < a.length; v++) {
					x = a[j] + a[k] + a[v];
					if (x == m) {
						if (a[j] < a[k] && a[k] < a[v])
							System.out.println((a[j]) + ", " + (a[k]) + " and " + (a[v]));
					}
				}
			}
		}
	}

}
