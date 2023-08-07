package assignment7_reccursion;

import java.util.Scanner;

public class climbing_stair_order_no_imp {
	public static void main(String[] args) {
		int count=0;
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] stair= {1,2};
		suvle(stair,0,n,"",count);
		System.out.println(count);

	}
public static void suvle(int stair[],int s, int dest,String path,int count) {
		
//		BP : 0 , 4
//		SP :
		if(dest==0) { // +ve BC
			System.out.println(path);
			System.out.println("===========");
			count++;
			return;
		}
		
		if(dest<0||s==stair.length) { // -ve BC
			return;
		}
	
		suvle(stair,s, dest-stair[s], path+stair[s],count);
		suvle(stair,s+1, dest, path,count);
		
	
		//suvle(curr+3, dest, path+"3");
		
	}

}
