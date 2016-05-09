package hank.pat1001;
import java.util.Scanner;

//@formatter:off
/**
 * Expand to see more information
 *  
 * 1.
 * To test this algorithm,copy the method main() at the end of this file to the TestClass.java
 * 
 * 2.
 * 1001. 害死人不偿命的(3n+1)猜想 (15) 
 * 卡拉兹(Callatz)猜想：
 * 
 * 对任何一个自然数n，如果它是偶数，那么把它砍掉一半；如果它是奇数， 那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到n=1。
 * 
 * 卡拉兹在1950年的世界数学家大会上公布了这个猜想，传说当时耶鲁大学师生齐动员，
 * 
 * 拼命想证明这个貌似很傻很天真的命题，结果闹得学生们无心学业，一心只证(3n+1)，
 * 
 * 以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……
 *  
 * 我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过1000的正整数n，
 * 
 * 简单地数一下，需要多少步（砍几下）才能得到n=1？ 
 * 
 * 输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。
 *  
 * 输出格式：输出从n计算到1需要的步数。
 * 
 * 输入样例： 3
 *  
 * 输出样例： 5
 * 
 * @author Hank
 * @email  huakang.zhou@qq.com
 * @time   2016年5月9日 下午1:03:19 
 * @blog   http://blog.csdn.net/zhouhuakang/article/details/50651801
 * 
 */
//@formatter:on
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
