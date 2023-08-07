package assignment7_reccursion;

import java.util.*;

public class is_obiedent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.charAt(0)=='a') {
			System.out.println(isobiedent(str));
			
		}
		else {
			System.out.println(false);
		}
	}
	public static boolean isobiedent(String str) {
		if(str.isEmpty()) {
			return true;
		}
		if(str.charAt(0)=='a') {
			boolean sp1=str.length()==1;
			boolean sp2=(str.length()>1)&& str.charAt(1)=='a'&&isobiedent(str.substring(1));
			boolean sp3=(str.length()>1)&& str.indexOf("bb")==1 && isobiedent(str.substring(1));
			return (sp1||sp2||sp3);
		}
		else if(str.startsWith("bb")) {
			boolean sp1=str.length()==2;
			boolean sp2=(str.length()>2)&& str.charAt(2)=='a' && isobiedent(str.substring(2));
		
			return (sp1||sp2);
		}
		else {
			return false;
		}
			
	}

}
