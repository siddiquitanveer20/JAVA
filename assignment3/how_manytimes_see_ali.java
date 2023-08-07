package assignment3;

import java.util.Scanner;

public class how_manytimes_see_ali {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int c=0;int ali;
		int ar[]=new int[N];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		ali=sc.nextInt();
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]==ali)
			c++;
		}
		System.out.println(c);

	}

}
