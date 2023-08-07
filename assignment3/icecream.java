package assignment3;

import java.util.Scanner;

public class icecream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		int i=0;
		int j=0;
		int  ans=0;
		
		int[]ar =new int[N];
		int min =Integer.MAX_VALUE;
	
		for(i=0;i<N;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		for(j=0;j<N;j++) {
			if(ar[j]<min) {
				min=ar[j];
				ans=j+1;
		
				}
		}
		System.out.println(ans);

	}

}
