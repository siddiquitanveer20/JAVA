package assignment7_reccursion;

import java.util.Scanner;

public class last_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=LastOcc(0,ar,m);
		System.out.println(ans);

	}
	public static int LastOcc(int idx, int[] arr, int ali) {
		if(idx==arr.length) {
			return -1;
		}
		int sp = LastOcc(idx+1, arr, ali);
		if(sp==-1 && arr[idx]==ali) {
			return idx;
		}
		return sp;
	}

}
