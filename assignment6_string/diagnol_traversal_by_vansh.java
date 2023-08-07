package assignment6_string;

import java.util.Scanner;

public class diagnol_traversal_by_vansh {

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
		int k=0;
		
		for(int i=0;i<ar.length;i++) {
			k=i;
			for(int j=0;j<=i;j++) {
				if(i+j==i) {
				System.out.print(ar[k][j]+" ");}
				if(i+j==i) {
					k--;
				}
				
			}
		}

	}

}
