package assignment4;

import java.util.Scanner;

public class rain_water {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 0; x < t; x++) {
			int N = sc.nextInt();
			int ar[] = new int[N];
			for(int u=0;u<N;u++)
			{
				ar[u]=sc.nextInt();
			}
			int left_wall = 0;
			int right_wall = 0;
			int water=0;
			for(int build=1;build<=ar.length-2;build++)
			{
				left_wall=ar[build];
				for(int i=0;i<=build;i++)
				{
					left_wall=Math.max(left_wall, ar[i]);
				}
				right_wall=ar[build];
				for(int j=build;j<ar.length;j++)
				{
					right_wall=Math.max(right_wall, ar[j]);
					
				}
				water=water+Math.min(right_wall, left_wall)-ar[build];
			}
			System.out.println(water);

		}

	}

}
