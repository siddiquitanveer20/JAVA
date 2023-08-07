package assignment3;

import java.util.Scanner;

public class square_sorted_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int[]nums =new int[n];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();
		}
		square(nums);
		

	}
	public static void square(int a [])
	{
	
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*a[i];
		}
		
	
		
		sorting(a);
		
		
	
	}
	public static void sorting(int[]c)
	{
		int temp=0;
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
				
				
				
			}
		}
		for(int x=0;x<c.length;x++)
		{
			System.out.print(c[x]+" ");
		}
	}

}
