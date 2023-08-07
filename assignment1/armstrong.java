package assignment1;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int N=scn.nextInt();
		if(isarm(N)==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		}
	public static int nod(int num) {
		int ans=0;
		while(num!=0)
		{
			
			num=num/10;
			ans++;
		}
		return ans;
	}
	public static boolean isarm(int num)
	{
		int temp1=num;
		int temp2=num;
		int sum2=0;
		int r=0;
		int pow=nod(temp1);
		while(temp2!=0)
		{
			r=temp2%10;
			sum2=sum2+(int)(Math.pow(r,pow));
			temp2=temp2/10;
		}
		if(num==sum2)
		{
			return true;
		}
		else {
		return false;
		}
	}


}
