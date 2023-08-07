package assignment5;
import java.util.*;

public class odd_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int e,o;
		char v,u;
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0) {
			 e=(int)str.charAt(i);
			 v=(char)(e+1);
			 str1.insert(i, v);
			 }
			else
			{
				o=(int)str.charAt(i);
				u=(char)(o-1);
				str1.insert(i, u);
			}
		
		}
	
			System.out.println(str1.toString());
		

	}

}
