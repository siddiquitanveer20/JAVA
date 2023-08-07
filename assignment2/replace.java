package assignment2;
import java.util.*;
public class replace {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		//int size=count(n);
		int r=0;
		int i=0;
		int low=0;
		int high=0;
		int temp=0;
		int replace[]=new int[20];
			while(n>0)
			{
				r=n%10;
				if(r==0)
				{
					replace[i]=5;
					i++;
				}
				else if(r!=0)
				{
					replace[i]=r;
					i++;
			}
				n=n/10;
		}
			high=i-1;
			while(low<high)
			{
				temp=replace[high];
				replace[high]=replace[low];
				replace[low]=temp;
				low++;
				high--;
			}
			
			
			for(int x=0;x<i;x++)
			{
				System.out.print(replace[x]);
			}
         
	}
	/*public static int count(int n)
	{
		int c=0;
		while(n>-1)
		{
			n=n/10;
			c++;
			
		}
		return c;
	}*/
	

}

