package assignment1;

import java.util.Scanner;

public class table1 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int x= scn.nextInt();
		int y= scn.nextInt();
		int i=1;
		int n;
		n=x;
		while(x<=y)
		{
	
			x=n*i;
			if(x<=y) {
			System.out.println(x);
			}
			i++;
			
		}

	}

}
