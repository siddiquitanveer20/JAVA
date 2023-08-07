package assignment7_reccursion;

import java.util.*;
public class vivek_love_array_game {
	public static int solve(int[] arr,int sum) {
		if(arr.length==1) {
			return 0;         //length 1 ka partition exist kr nhi skta thats why 0
		}
		int curs=0;
		int i=0;
		boolean pexist=false;
		for(i=0;i<arr.length;i++) {
			curs=curs+arr[i];
			if(curs==sum-curs) {
				pexist=true;              //partition exist thats mean +1
		
				break;
			}
		}
		if(pexist==true) {
			int[] a2= new int[arr.length-i-1];
			int[] a1=new int[i+1];
			for(int j=0;j<arr.length;j++)
				if(j<=i)
					a1[j]=arr[j];
				else
					a2[j-i-1]=arr[j];
			int sp1=solve(a1,curs);
			int sp2=solve(a2,sum-curs);
			return 1+Integer.max(sp1, sp2);
		}
		return 0;
		
	}
public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int t= scn.nextInt();
	for(;t>0;t--) {
		int n= scn.nextInt();
		int[] arr= new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();
			sum=sum+arr[i];
		}
		int ans=solve(arr,sum);
		System.out.println(ans);
	}
}
}
