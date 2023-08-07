package assignment7_reccursion;

import java.util.*;

public class subset_array {
	static int k=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
			
		}
		int k=sc.nextInt();
		String str="";
		String btr="";
				for(int i=0;i<n;i++) {
					str=str+ar[i];
					
				}
				//System.out.println(str);
		subset(str,btr,k);
		//System.out.println(str);
		

	}
	public static void subset(String str,String btr,int k) {
		if(sum(btr)==k){
			for(int i=btr.length()-1;i>=0;i--) {
				System.out.print(btr.charAt(i)+" ");
				
				}
			System.out.println();
			return;
		}
		if(str.isEmpty()) {
			return;
		}
		
		char ch=str.charAt(0);
		String remain = str.substring(1);
		subset(remain,btr,k); //exclude5
		
		subset(remain,btr+ch,k);//include ;
		
}
		
	public static int sum(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			sum=sum+str.charAt(i)-'0';
		}
		return sum;
	
	}

}