package assignment1;

import java.util.Scanner;

public class gcdm1 {

	public static void main(String[] args) {
		//System.out.println("Enter two numbers");
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		int n=1;
		int temp=0;
		while(n<=num1||n<=num2)
		{
			if(num1%n==0 && num2%n==0)
			{
				temp=n;
			}
			n++;
		}
		System.out.println(temp);
		
		

	}

}
