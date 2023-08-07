package assignment7_reccursion;

import java.util.Scanner;

public class replace_pi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String str=sc.next();
			solve(str,"");
		}

	}
	public static void solve(String str,String path) {
		int idx=str.indexOf("pi");
		if(idx==-1) {
			System.out.println(path+str);
			return;
		}
	    solve(str.substring(idx+2),path+str.substring(0,idx)+"3.14");
	}

}
