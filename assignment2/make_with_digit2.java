package assignment2;

import java.util.Scanner;

public class make_with_digit2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int low=0;
		int high=num-1;
		int temp=0;
		int digit[]=new int[num];
		for(int i=0;i<num;i++)
		{
			digit[i]=scn.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			System.out.print(digit[i]);
		}
		
		
}
}

