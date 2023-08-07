package assignment3;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int M;
		int ar[]=new int[N];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		M=sc.nextInt();
		int res=linear_Search(ar,M);
		System.out.println(res);
		

	}
	public static int linear_Search(int[]a,int x)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==x) {
				return j+1;}
			
		}
		return -1;
		
	
	}

}
