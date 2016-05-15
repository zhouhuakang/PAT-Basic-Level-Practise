import hank.pat1002.EachDigitSum;
import hank.pat1003.Pat1003;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger N = scanner.nextBigInteger();

		EachDigitSum pat1002 = new EachDigitSum();
		int eachDigitSum = pat1002.eachDigitSum(N);
		
		pat1002.printSpell(eachDigitSum);

	}
}
