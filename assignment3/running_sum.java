package assignment3;

import java.util.Scanner;

public class running_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int[]nums =new int[n];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
			sum=sum+nums[i];
			System.out.println(sum);
		}

	}

}
