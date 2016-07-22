package hash;

import java.util.HashSet;

public class hashTest01 {

	/**
	 * 未重写hashCode和equals
	 * p11(3,3)和p12(3,3)相同但是没识别
	 * 输出size 3
	 * @param args
	 */
	
	public static void main(String[] args) {
		HashSet<Point1> hs1 = new HashSet<Point1>();
		
		Point1 p11 = new Point1(3,3);
		Point1 p12 = new Point1(3,3);
		Point1 p13 = new Point1(3,5);
		
		hs1.add(p11);
		hs1.add(p12);
		hs1.add(p13);
		System.out.println(hs1.size());

	}

}
