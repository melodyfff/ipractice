package arithmeticdemo;

class daffodil {
	private static int a;// 百位
	private static int b;// 十位
	private static int c;// 个位

	public void mehod1() {

		for (int i = 100; i <= 999; i++) {
			a = i / 100;
			b = (i / 10) % 10;
			c = i % 10;
			if (i == a * a * a + b * b * b + c * c * c) {
				System.out.println(a + " " + b + " " + c + "=" + i);
			}
		}
	}
}

public class Daffodil_shuixianhua {

	public static void main(String[] args) {
		daffodil a = new daffodil();
		a.mehod1();

	}

}
