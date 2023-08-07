package assignment1;

import java.util.Scanner;

public class table2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x= scn.nextInt();
		int y= scn.nextInt();
		int i=1;
		int n=x;
		while(i<=y)
		{
			x=n*i;
			System.out.println(x);
			i++;
		}

	}

}
