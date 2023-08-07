package assignment7_reccursion;

import java.util.*;


public class subsequence_lexico {
//static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<>(); 
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
		String str=sc.next();
		
		SS(str ,"",al);
		Collections.sort(al);
		for(int k=0;k<al.size();k++) {
			System.out.println(al.get(k));
		}
		//System.out.println(count);
		}
		System.out.println();

	}
	public static void SS(String str, String team,ArrayList<String>al) {
		if (str.isEmpty()) {
			al.add(team);
			//count++;
			return;
		}
		char ch = str.charAt(0);
		String remain = str.substring(1);	
		
		
		
		SS(remain, team,al);
		SS(remain, team + ch,al);
		
		
		
		
	}

}

