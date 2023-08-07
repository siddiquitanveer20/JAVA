package assignment4;

import java.util.Scanner;

public class maxm_circular_sum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int l = 0; l < t; l++) {
			int n=sc.nextInt();
			int arr[]= new int [n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int curr_max=-10000;
			int max=-10000;
			int sum=0;
			int min=100000;
			int curr_min=100000;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
				curr_max=Math.max(arr[i], curr_max+arr[i]);
				max=Math.max(curr_max, max);
				curr_min=Math.min(arr[i], curr_min+arr[i]);
				min=Math.min(min, curr_min);
			}
			int ans1=sum-min;
			int ans2=max;
			if(sum==min) {
				
			}
			if(ans1>ans2) {
				System.out.println(ans1);
			}
			else {
				System.out.println(ans2);
			}
			
		}

	}

}
