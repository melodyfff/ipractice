package hash;

import java.util.HashSet;

public class hashTest02 {

	/**重写hashCode和equals之后，p21(3,3)和p22(3,3)被认为相同对象
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Point2> hs2 = new HashSet<Point2>();
		  Point2 p21 = new Point2(3, 3);
		  Point2 p22 = new Point2(3, 3);
		  Point2 p23 = new Point2(3, 5);
		   hs2.add(p21);
		   hs2.add(p22);
		   hs2.add(p23);
		   System.out.println(hs2.size());

	}

}
