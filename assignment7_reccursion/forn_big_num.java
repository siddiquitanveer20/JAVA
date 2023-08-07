package assignment7_reccursion;

import java.util.Arrays;
import java.util.Scanner;

public class forn_big_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			for(int i=0;i<t;i++) {
				int m=sc.nextInt();
				String arr[]=new String[m];
				for(int j=0;j<m;j++) {
					arr[i]=sc.next();
				}
	Arrays.sort(arr,(p,q)->{
			return Integer.parseInt(q+p)-Integer.parseInt(p+q);
		});
		System.out.println(Arrays.toString(arr));

	}
	}
}
