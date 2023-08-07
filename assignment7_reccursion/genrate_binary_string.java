package assignment7_reccursion;

import java.util.Scanner;

public class genrate_binary_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		String str=sc.next();
		solve(str,"",0);
		System.out.println();
		}
	}

	
	public static void solve(String str,String path,int idx) {
		if(idx==str.length()) {
			System.out.print(path+" ");
			return;
		}
		if(str.charAt(idx)!='?') {
			path=path+str.charAt(idx);
			solve(str,path,idx+1);
		}
		else {
			
			solve(str,path+"0",idx+1);
		
			solve(str,path+"1",idx+1);
			
		}
	}

}
