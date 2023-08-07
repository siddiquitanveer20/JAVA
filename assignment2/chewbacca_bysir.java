package assignment2;

import java.util.Scanner;

public class chewbacca_bysir {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N =sc.nextLong();
		chewba(N);

	}
	public static void chewba(long n) {
		long digit=0;
		long pos=1;
		long ans=0;
		long mul=1;
		while(n!=0)
		{
			digit=n%10;
			if(4<digit&&n!=9)
			{
				digit=9-digit;
			}
			ans=ans+digit*mul;
			mul=mul*10;
			pos++;
			n=n/10;
		}
		System.out.println(ans);
	}

}
