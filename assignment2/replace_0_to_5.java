package assignment2;

import java.util.Scanner;

class replace_0_to_5 {

	public static long reverse(long temp) {

		long ans = 0;

		while (temp > 0) {

			long rem = temp % 10;

			ans = ans * 10 + rem;

			temp = temp / 10;

		}

		return ans;
	}

	public static long convert0To5(long num) {
		if (num == 0)

			return 5;

		else {

			long temp = 0;

			while (num > 0) {

				long digit = num % 10;

				if (digit == 0)

					digit = 5;

				temp = (temp * 10) + digit;

				num = num / 10;

			}

			return reverse(temp);

		}
	}

	public static void main(String args[])

	{
		Scanner scn = new Scanner(System.in);

		long num = scn.nextLong();

		System.out.println(convert0To5(num));

	}
}
