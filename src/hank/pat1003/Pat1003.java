package hank.pat1003;

//@formatter:off
/**
 * Expand to see more information 1003. 我要通过！(20)
 * 
 * “答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于PAT的“答案正确”大派送 ——
 * 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
 * 
 * 得到“答案正确”的条件是：
 * 
 * 1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符； 2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x
 * 或者是空字符串，或者是仅由字母 A 组成的字符串； 3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b,
 * c均或者是空字符串，或者是仅由字母 A 组成的字符串。
 * 
 * 现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。 输入格式： 每个测试输入包含1个测试用例。第1行给出一个自然数n
 * (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。
 * 
 * 输出格式：每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”， 则输出YES，否则输出NO。
 * 
 * 输入样例： 8 PAT PAAT AAPATAA AAPAATAAAA xPATx PT Whatever APAAATAA
 * 
 * 输出样例： YES YES YES YES NO NO NO NO
 * 
 * @author Hank
 * @email huakang.zhou@qq.com
 * @time 2016年5月13日 下午6:03:19
 * @blog http://blog.csdn.net/zhouhuakang/article/details/50756195
 * 
 */
// @formatter:on
public class Pat1003 {
	public void judge(String s) {
		/*
		 * 模式匹配基础知识，见 http://blog.csdn.net/zhouhuakang/article/details/51397539
		 */
		String pattern1 = "A*PA+TA*"; // 1.A+代表A至少出现一次 2.A*代表A*可以不出现，或者出现任意多次
		String pattern2 = "PA+T";
		if (s.matches(pattern1)) {
			if (s.matches(pattern2)) {
				System.out.print("YES");
			} else {
				/*
				 * String.split()的用法，见
				 * http://blog.csdn.net/zhouhuakang/article/details/51397567
				 */
				String splitted[] = s.split("P|T");
				int aLength = splitted[0].length();
				int bLength = splitted[1].length();
				int cLength = splitted[2].length();
				if ((cLength - aLength) / aLength == (bLength - 1)) {
					System.out.print("YES");
				} else {
					System.out.print("NO");
				}
			}
		} else {
			System.out.print("NO");
		}

	}

}
