package assignment7_reccursion;

import java.util.Scanner;

public class first_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=fst_occ(ar,0,m);
		System.out.println(ans);
		

	}

	public static int fst_occ(int ar[],int idx,int x)
	{
		if(idx==ar.length)
		{
			return -1;        //agar nhi mila to return -1
		}
		int sp=fst_occ(ar,idx+1,x);
		if(x==ar[idx])
		{
			return idx ;    // agar usk mil gya smallest problem k bhr to vo usk krega 
		}
		return sp;        //agr usk bhr nhi mila to vo smjh jayega ki smallest m hoga 
		
	}

}

