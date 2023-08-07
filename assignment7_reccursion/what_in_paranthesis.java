package assignment7_reccursion;

import java.util.Scanner;

public class what_in_paranthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int f_idx=fst_occ(str,0,'(');
		int l_idx=LastOcc(0,str,')');
		String ans=str.substring(f_idx+1,l_idx);
		System.out.println(ans);
		
	}
	public static int LastOcc(int idx, String arr, char ali) {
		if(idx==arr.length()) {
			return -1;
		}
		int sp = LastOcc(idx+1, arr, ali);
		if(sp==-1 && arr.charAt(idx)==ali) {
			return idx;
		}
		return sp;
	}
	public static int fst_occ(String ar,int idx,char x)
	{
		if(idx==ar.length())
		{
			return -1;        //agar nhi mila to return -1
		}
		int sp=fst_occ(ar,idx+1,x);
		if(x==ar.charAt(idx))
		{
			return idx ;    // agar usk mil gya smallest problem k bhr to vo usk krega 
		}
		return sp;        //agr usk bhr nhi mila to vo smjh jayega ki smallest m hoga 
		
	}


}
