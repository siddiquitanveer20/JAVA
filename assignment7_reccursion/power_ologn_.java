package assignment7_reccursion;

import java.util.Scanner;

public class power_ologn_ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int ans=power(n,p);
		System.out.println(ans);

	}
	public static int power(int n,int p){
		if(p==0)
		{
			return 1 ;
		}
		int sp=power(n,p/2);
		if(p%2==0) {
			return sp*sp;
		}
		else {
			return sp*sp*n;
		}
			
	}		

}
