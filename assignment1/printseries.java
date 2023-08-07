package assignment1;

import java.util.Scanner;

public class printseries {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int N1= scn.nextInt();
		int N2= scn.nextInt();
		int i=1;
		int res=0;
		while(i<=N1)
		{
			res=3*i+2;
			if(res%N2!=0)
			{System.out.println(res);
			i++;
		}
			else {
			i++;
			N1++;
			}
			

	}

}
}
