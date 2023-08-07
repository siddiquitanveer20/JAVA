package assignment7_reccursion;
import java.util.*;
public class reccusrsion_all_subsequence {
	static ArrayList<String>al=new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			String str=sc.next();
		solve(str,0,"");
		Collections.sort(al);
		for(int k=0;k<al.size();k++) {
			System.out.println(al.get(k));
		}
		}
	}
	public static void solve(String str,int i,String path) {
		if(i==str.length()) {
			al.add(path);
			return;
		}
		solve(str,i+1,path+str.charAt(i));
		solve(str,i+1,path);
	}
}
