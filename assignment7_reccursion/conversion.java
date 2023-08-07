package assignment7_reccursion;

import java.util.*;

public class conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=0;
		String str="123456";
		int br[]=new int[str.length()];
		for(int i=0;i<br.length;i++) {
			br[i]=str.charAt(k)-'0';
			k++;
		}
		for(int i=0;i<br.length;i++) {
			System.out.print(br[i]+"  ");
		}
		
		

	}

}
