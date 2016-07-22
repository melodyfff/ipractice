package arithmeticdemo;

public class Fibonacci01 {

	/**
	 * @题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子， 小兔子长到第三个月后每个月又生一对兔子， 假如兔子都不死，
	 * 问每个月的兔子总数为多少？ 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
	 */
	public static final int MONTH = 10;

	public static void main(String[] args) {
		long f1 = 1L; // 前一个数
		long f2 = 1L; // 后一个数
		long f; // 中转
		long sum = 0; // 总数
		for (int i = 3; i <= MONTH; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			sum = sum + f2;
			System.out.println("第" + i + "个月兔子对数为：" + f2);

		}

	}

}
