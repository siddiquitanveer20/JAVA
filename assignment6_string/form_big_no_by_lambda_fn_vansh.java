package assignment6_string;

import java.util.*;

public class form_big_no_by_lambda_fn_vansh {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		for (int x = 1; x <= t; x++) {
			int m = scn.nextInt();
			String[] a = new String[m];

			for (int i = 0; i < a.length; i++) {
				a[i] = scn.next();
			}
            Arrays.sort(a,(p,q)->{
                long r=Long.parseLong(p+q);
                long s=Long.parseLong(q+p);
                if(r>s) return 1;
                else if(r<s) return -1;
                else return 0;
            });
            String ans="";
			for(int i=a.length-1;i>=0;i--){
                ans+=a[i];
            }
            System.out.println(ans);
		}

	}
	}
