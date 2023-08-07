package assignment6_string;
import java.util.*;
public class playing_with_good_substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String temp = "";
		String ans = "";
		int len = 0;
		int max = -1000;
		int f_len=0;
		
		for (int s = 0; s < str.length(); s++) {
			for (int e = s; e < str.length(); e++) {
				temp = (str.substring(s, e + 1));
				if (check(temp)) {
					len = temp.length();
					if (len > max) {
						max = len;
						ans = temp;
						f_len=ans.length();
					}

				}
			}

		}
		
		System.out.println(f_len);

	}
	public static boolean check(String str)
	{
		int temp= 0;
		int i=0;
		while(i<str.length())
		{
			temp=str.charAt(i);
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
			{
				i++;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
