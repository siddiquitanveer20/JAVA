package assignment7_reccursion;

import java.util.*;

public class code_of_string {
	public static ArrayList<String> Solve(String s,ArrayList<String> al,char[] key,String ans,int ind){
		if(ind==s.length()) {
			al.add(ans);
			return al;
		}
//		System.out.println(ind);
		al=Solve(s,al,key,ans+key[Integer.valueOf(s.substring(ind,ind+1))-1],ind+1);
		if(ind+1<s.length() && Integer.valueOf(s.substring(ind,ind+2))<27) {
//			System.out.println(ind+1);
		al=Solve(s,al,key,ans+key[Integer.valueOf(s.substring(ind,ind+2))-1],ind+2);
		}
		return al;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		char[] key = new char[26];
		for (int i = 0; i < 26; i++) {
			key[i] = (char) (97 + i);
//			System.out.print(key[i]);
		}
		ArrayList<String> al = new ArrayList<>();
		al = Solve(s, al, key, "", 0);
		System.out.println(al);
	}
}