package assignment4;

import java.util.Scanner;

public class sort_0_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int ar[]=new int[N];
		for(int i=0;i<N;i++)
		{
			ar[i]=scn.nextInt();
		}
		int br[]=new int[N];
		int k=0;
		for(int j=0;j<N;j++)
		{
			if(ar[j]==0)
			{
				br[k]=ar[j];
				k++;
			}
		}
		for(int x=0;x<N;x++)
		{
			if(ar[x]!=0)
			{
				br[k]=ar[x];
				k++;
			}
		}
		for(int u=0;u<N;u++)
		{
			System.out.print(br[u]+" ");
		}
		
	}

}
