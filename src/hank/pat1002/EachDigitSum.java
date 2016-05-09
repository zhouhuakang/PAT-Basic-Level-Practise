package hank.pat1002;

import java.math.BigInteger;
import java.util.Scanner;

//@formatter:off
/**
 * Expand to see more information
 * 
 * 1. To test this algorithm,copy the method main() at the end of this file to
 * the TestClass.java
 * 
 * 2. 1002. 写出这个数 (20)
 * 
 * 读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * 
 * 输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。
 * 
 * 输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。
 * 
 * 输入样例： 1234567890987654321123456789
 * 
 * 输出样例： yi san wu
 * 
 * @author Hank
 * @email huakang.zhou@qq.com
 * @time 2016年5月9日 下午1:03:19
 * @blog http://blog.csdn.net/zhouhuakang/article/details/50651801
 * 
 */
// @formatter:on

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