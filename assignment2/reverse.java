package assignment2;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int res=reverse(N);
	     System.out.println(res);
         
	}
	public static int reverse(int n)
	{
		int r=0;
		int rev=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

}
