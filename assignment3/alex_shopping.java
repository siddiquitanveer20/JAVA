package assignment3;

import java.util.Scanner;

public class alex_shopping {

	public static void main(String[] args) {
		int i=0;
		
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int ar[]=new int[n];
for( i=0;i<n;i++)
{
	ar[i]=sc.nextInt();
	
}
int q=sc.nextInt();
for(int j=0;j<q;j++) {
	int x=0;
	int A=sc.nextInt();
	int k=sc.nextInt();
	for(i=0;i<n;i++) {
		if(ar[i]<=A)
		{
			if(A%ar[i]==0)
			{
				x++;
			}
		}
		
	}
	if(x>=k)
	{
		System.out.println("yes");
	}
	else {
		System.out.println("No");
	}
}

	}

}
