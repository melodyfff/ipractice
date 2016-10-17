package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @author xinchen 2016年10月10日 下午11:57:37
 */
public class Kill {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		if (n < 2) {
			throw new Exception("n不合适");
		}
		if (m < 1) {
			throw new Exception("n不合适");
		}
		
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		List list = Arrays.asList(a);
		System.out.println("目前的人数："+Arrays.asList(a));

	}
}
