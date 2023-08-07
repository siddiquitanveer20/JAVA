package assignment2;
import java.util.*;
public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]=new int [size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();}
	array x =new array();
	x.printarray(ar);
	}
	
	public static void printarray(int []array)
	{
		for(int j=0;j<array.length;j++)
		{
			System.out.println(array[j]);
		}
	}

}
