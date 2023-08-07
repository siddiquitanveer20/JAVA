package assignment7_reccursion;

import java.util.Scanner;

public class genrate_sort_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int B[]=new int[m];
		for(int i=0;i<m;i++) {
			B[i]=sc.nextInt();
		}

		solve(A,B,-1,-1,"",true);
	}
	public static void solve(int arr1[],int arr2[],int idx1,int idx2,String path,boolean chance) {
		if(chance) {
			System.out.println(path);
			for(int i=idx1+1;i<arr1.length;i++) {
				if(idx2==-1||arr1[i]>arr2[idx2]) {
					solve(arr1,arr2,i,idx2,path+arr1[i]+" ",false);
				}
			}
		}else {
			for(int i=idx2+1;i<arr2.length;i++) {
				if(idx1==-1||arr2[i]>arr1[idx1]) {
					solve(arr1,arr2,idx1,i,path+arr2[i]+" ",true);
				}
			}
		}
	}

}
