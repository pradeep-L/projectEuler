package Crypto;

import java.util.Scanner;

public class simple {
	public static void main(String args[]) {
		int testCase, N;
		long sum3, sum5, sum15, x3, x5, x15;
		Scanner scan = new Scanner(System.in);
		testCase = scan.nextInt();
		while (testCase > 0) {
			N = scan.nextInt();
			N--;
			x3 = N / 3;
			x5 = N / 5;
			x15 = N / 15;

			sum3 = 3 * x3 * (x3 + 1) / 2;
			sum5 = 5 * x5 * (x5 + 1) / 2;
			sum15 = 15 * x15 * (x15 + 1) / 2;

			System.out.println(sum3 + sum5 - sum15);
			testCase--;

		}
		scan.close();
	}

}
