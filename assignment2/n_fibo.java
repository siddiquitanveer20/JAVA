package assignment2;
import java.util.*;
public class n_fibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<N;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
