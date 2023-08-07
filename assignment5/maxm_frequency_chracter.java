package assignment5;

import java.util.Scanner;

public class maxm_frequency_chracter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ans=maxfreq(str);
		System.out.println(ans);
		

	}

	public static char maxfreq(String str) {
		int max=Integer.MIN_VALUE;
	int count =0;
	int ans1=0;
	for(int i=0;i<str.length();i++) {
		count=0;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				count++;
				if(count>max)
				{
					max=count;
					ans1=str.charAt(j);
				}
				
			}
		}
		
		
	}
	return (char)ans1;

}
}
