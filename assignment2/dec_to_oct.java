package assignment2;

import java.util.Scanner;

public class dec_to_oct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int ar[]=new int[20];
		int i=0;
		while(N!=0)
		{
			ar[i]=N%8;
			N=N/8;
			i++;
			
		}
		for(int j=i-1;j>=0;j--)
		{
		System.out.print(ar[j]);
		}
				

	}

}
