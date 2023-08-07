package assignment3;

import java.util.Scanner;

public class inverseofarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int ar[]=new int[N];
		int br[]=new int[N];
		int x=0;
		for(int i=0;i<N;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int j=0;j<N;j++)      //for index
		{
			
			 
			for(int k=0;k<N;k++)     //for elements 
			{
				if(ar[k]==j)         //you know array mein hmesha phla element o index pr ayega
				{
					br[x]=k;          //thats why jha index j=0 element k brbr ho vhi array br m daal do
					x++;              // increment the index;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(br[i]+" ");
		}

	}

}
