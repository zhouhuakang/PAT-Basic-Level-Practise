package hank.pat1001;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author zhouhuakang
 *
 */
public class ThreeMultipNPlusOne {

	public int _3NPlus1(int n) {
		int step = 0;
		while (n != 1) {
			n = (n % 2 == 0 ? (n / 2) : (3 * n + 1) / 2);
			step++;
		}
		return step;
	}

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		System.out.print(new ThreeMultipNPlusOne()._3NPlus1(n));
//	}

}
