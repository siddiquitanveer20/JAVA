package assignment5;

import java.util.Scanner;

public class wave_column {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int mat[][] = new int[M][N];
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		
		for (int col = 0; col < mat[0].length; col++) {
			if(col%2==0)
			{
				for(int row=0;row<mat.length;row++)
				{
					System.out.print(mat[row][col]+","+" ");
				}
				
			}
			else
			{
				for(int row=mat.length-1;row>=0;row--)
				{
					System.out.print(mat[row][col]+","+" ");
				}
				
				
			}

		}
		System.out.println("END");

	}

}
