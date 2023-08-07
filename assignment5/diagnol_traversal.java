package assignment5;

import java.util.Scanner;

public class diagnol_traversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]ar= new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		int k=1;
		System.out.print(ar[0][0]+" ");
		while(k<m-1+n-1) {
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i+j==k)
					{
						System.out.print(ar[i][j]+" ");
					}
				}
			}
			k++;
			if(k<m-1+n-1) {
			
			for(int j=0;j<n;j++)
			{
				for(int i=0;i<m;i++)
				{
					if(i+j==k) {
						System.out.print(ar[i][j]+" ");
					}
				}
			}
			
			}
			k++;
		}
		System.out.print(ar[m-1][n-1]+" ");

	}

}
