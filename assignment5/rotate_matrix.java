package assignment5;

import java.util.Scanner;

public class rotate_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ar[][]=new int [N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(int c=ar[0].length-1;c>=0;c--)
		{
			for(int r=0;r<ar.length;r++)
			{
				System.out.print(ar[r][c]+" ");
			}
			System.out.println();
		}

	}

}
