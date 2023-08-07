package assignment7_reccursion;

import java.util.Scanner;

public class rat_in_maze_blocked {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		
		char[][] maze = new char [n][m];
		
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[1].length;j++) {
				maze[i][j]=sc.next().charAt(0);
			}
		}
		int [][] ans=new int [n][m];

		solve(0,0, maze," ",ans);

	}
	public static void print(int[][] ans) {
		for (int row=0;row<ans.length;row++) {
			for (int b=0;b<ans[0].length;b++) {
				System.out.print(ans [row][b]+" ");
			}
			System.out.println();
		}

	}

	public static void solve(int r, int c, char[][] maze, String path,int ans [][]) {
		
		if (r == maze.length-1  && c == maze[0].length-1 ) {
			//System.out.println(path);
			print(ans);
			return;
		}
		if (r <0 || r == maze.length || c < 0 || c == maze[0].length || maze[r][c] == 'x' ) {

			return;
		}
		//Visited[r][c] = true;
		// maze[r][c] = 1;

		//solve(r - 1, c, maze, path + "U", Visited);
		ans[r][c]=1;
		solve(r , c+1, maze, path + "R",ans);
		ans[r][c]=1;
		solve(r+1, c , maze, path + "D",ans);
		ans[r][c]=0;
		
		
		//solve(r, c - 1, maze, path + "L", Visited);
		// maze[r][c] = 0;

		//Visited[r][c] = false; // current path false

	}
}
