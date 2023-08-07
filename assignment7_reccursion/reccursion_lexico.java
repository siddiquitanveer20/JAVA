package assignment7_reccursion;

import java.util.*;

public class reccursion_lexico {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<>();
		
		solve(n,al);
		al.sort(null);
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}

	}
	public static void solve(int n,ArrayList<String> al) {
		if(n<0) {
			return;
		}
	al.add(String.valueOf(n));
		solve(n-1,al);
	}

}
