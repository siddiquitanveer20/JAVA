package assignment7_reccursion;

import java.util.*;

public class temp {
	static int k=0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		for(int i=0;i<5;i++){
			sc.nextInt(ar[i]);
			
		}
		String str="";
				int br[]=new int[5];
				for(int i=0;i<5;i++) {
					str=str+ar[i];
					
				}
				System.out.println(str);
		//subset(ar,br);
		

	}
//	public static void subset(int ar[],int br[]) {
//		if(ar.length==0) {
//			for(int i=0;i<br.length;i++) {
//				System.out.print(br[i]);
//			}
//			
//			
//		}
//		
//		subset() //exclude
//		br[k]=ar[0];
//		k++;
//		subset(ar)   //include
//		
//		
//		
//	}

}
