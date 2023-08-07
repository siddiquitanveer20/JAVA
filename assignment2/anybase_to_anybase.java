package assignment2;

import java.util.*;

public class anybase_to_anybase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		int arr[]=new int[30];
		int h=0;
		if(sb==10) {
			dec_anybase(db,sn);
		}
		else {
			int tempbase=anybase_dec(sb,sn);
			arr[h]=dec_anybase(db,tempbase);
		}
		for(int f=h-1;f>=0;f--)
		{
			System.out.println(arr[f]);
		}
		 
	

	}
	public static int anybase_dec(int sb1, int sn1) {
		int r = 0;
		int i = 0;
		int dec = 0;
		while (sn1 != 0) {
			r = sn1 % 10;
			dec = dec + r * (int) (Math.pow(sb1, i));
			i++;
			sn1 = sn1 / 10;
		}
		return dec;
	}

	

	public static int dec_anybase(int db2, int sn2) {
		int ar[] = new int[30];
		char cr[] = new char[30];
		int j = 0;
		int k = 0;
		int temp = 0;
		if (db2 != 16) {
			while (sn2 != 0) {
				ar[j] = sn2 % db2;
				j++;
				sn2 = sn2 / db2;

			}
			return (ar[j]);

		} else {
			while (sn2 != 0) {
				temp = sn2 % db2;
				if (temp < 10) {
					cr[k] =(char)( temp + 48);
					k++;
				} else {
					cr[k] = (char)(temp + 55);
					k++;

				}
				sn2 = sn2 / db2;

			}
			return cr[k];
		}
	}

}
