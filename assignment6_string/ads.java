package assignment6_string;

import java.util.Scanner;

public class ads {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ar[]=new String[str.length()];
		int k=0;
		int i=0;
		while(i<=str.length())
		{
			if((str.charAt(i))>='0'&&(str.charAt(i))<='9') {
				i++;
				
			}
			else {
				String ans=str.substring(0,i);
				ar[k]=ans;
				//System.out.println(ar[k]);
				k++;
				str=str.substring(i+1);
				i=0;
			}
			
		}
		for(int u=0;u<k;u++)
		{
			System.out.print(ar[u]+"   ");
		}
		//String ar1[]= {"agbsb","ahjshs"};
	//	System.out.println(ar1[0]);

	}
	
}

