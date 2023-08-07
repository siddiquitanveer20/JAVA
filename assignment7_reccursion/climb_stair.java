package assignment7_reccursion;

import java.util.Scanner;

public class climb_stair {
static int c=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		suvle(0,n," ");
		System.out.println(c);

	}
public static void suvle(int curr, int dest,String path) {
		
//		BP : 0 , 4
//		SP :
		if(curr==dest) { // +ve BC
			c++;
			return;
		}
		
		if(curr > dest) { // -ve BC
			return;
		}
		suvle(curr+1, dest, path+"1");
		suvle(curr+2, dest, path+"2");
		
		
	}

}
