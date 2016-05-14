import hank.pat1002.EachDigitSum;
import hank.pat1003.Pat1003;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pat1003 pat1003 = new Pat1003();
		int numberOfTestStrings = Integer.parseInt(scanner.nextLine());
		ArrayList<String> stringList = new ArrayList<String>();
		for (int i = 0; i < numberOfTestStrings; i++) {
			stringList.add(scanner.nextLine());
		}
		for (String x : stringList) {
			pat1003.judge(x);
			System.out.print("\n");
		}

	}
}
