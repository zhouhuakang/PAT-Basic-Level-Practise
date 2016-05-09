package hank.pat1002;

import java.math.BigInteger;
import java.util.Scanner;



public class EachDigitSum {

	public void printSpell(int eachDigitSum) {
		String[] result = new String[10];

		String[] Spell = new String[] { "ling", "yi", "er", "san", "si", "wu",
				"liu", "qi", "ba", "jiu" };
		int digitLength = 0;
		while (eachDigitSum >= 10) {
			result[digitLength] = (Spell[eachDigitSum % 10]);
			eachDigitSum /= 10;
			digitLength++;
		}
		if (eachDigitSum < 10) {
			result[digitLength] = Spell[eachDigitSum];
		}

		for (int i = digitLength; i > 0; i--) {
			System.out.print(result[i] + " ");
		}
		System.out.print(result[0]);

	}

	public int eachDigitSum(BigInteger number) {
		int sum = 0;

		BigInteger bi10 = new BigInteger("10");

		while (number.compareTo(bi10) == 1) {

			BigInteger[] reulst = number.divideAndRemainder(bi10);
			sum += reulst[1].intValue(); // Remainder
			number = number.divide(bi10);
		}
		sum += number.intValue();
		return sum;
	}

	// public static void main(String[] args) {
	// Scanner scanner = new Scanner(System.in);
	// BigInteger N = scanner.nextBigInteger();
	//
	// EachDigitSum pat1002 = new EachDigitSum();
	// int eachDigitSum = pat1002.eachDigitSum(N);
	// pat1002.printSpell(eachDigitSum);
	// // return 0;
	//
	// }

}