package assignment7_reccursion;

import java.util.Scanner;

public class genrate_valid_paranthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		para(n,n,"");

	}
	public static void para(int op,int cl,String s)
	{
		if(op==0&&cl==0)           
		{
			System.out.println(s);
			return;
		}
		if(op<cl) {
			return;
		}
		if(op<0)
			return;
		if(cl<0)
		return;
		para(op-1,cl,s+")");
		
		para(op,cl-1,s+"(");
	}

}
