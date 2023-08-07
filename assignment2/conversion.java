package assignment2;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sb = scn.nextInt();
		int db = scn.nextInt();
		int sn = scn.nextInt();
		convert(sb, db, sn);

	}

	public static void dec_to_anybase(int db1, int sn1) {
		int ar[] = new int[30];
		int br[] = new int[30];
		char cr[] = new char[30];
		int i = 0, j = 0, k = 0;
		int temp = 0;
		if (db1 == 2) {
			while (sn1 != 0) {
				ar[i] = sn1 % 2;
				sn1 = sn1 / 2;
				i++;
			}
			for (int x = i - 1; x >= 0; x--) {
				System.out.print(ar[x]);
			}
		} else if (db1 == 8) {
			while (sn1 != 0) {
				br[j] = sn1 % 8;
				sn1 = sn1 / 8;
				j++;
			}
			for (int y = j - 1; y >= 0; y--) {
				System.out.print(br[y]);
			}
		} else if (db1 == 16) {

			temp = sn1 % 16;
			if (temp < 10) {
				cr[k] = (char) (temp + 48);
				k++;
			} else {
				
				cr[k] = (char) (temp + 55);
				k++;
			}
			for (int z = k - 1; z >= 0; z--) {
				System.out.print(cr[z]);
			}
		} else if (db1 == 10) {
			System.out.println(sn1);
		}
	}

	public static void convert(int sb1, int db1, int sn1) {
		int r = 0;
		int pow = 0;
		int dec = 0;
		if (sb1 == 10) {
			dec_to_anybase(db1, sn1);

		}

		else {
			while (sn1 != 0) {
				r = sn1 % 10;
				dec = dec + r * (int) (Math.pow(sb1, pow));
				pow++;
				sn1 = sn1 / 10;
			}
			dec_to_anybase(db1, dec);

		}

	}

}
