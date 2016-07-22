package hash;

import java.util.HashSet;

/**
 * 没重写hashCode但是重写了equals，结果可能是2可能是3，内存地址算出的
 * hashcode不知道是否在同一个域
 * @author vov
 *
 */
public class hashTest03 {

	public static void main(String[] args) {
		   HashSet<Point3> hs3 = new HashSet<Point3>();
		   Point3 p31 = new Point3(3, 3);
		   Point3 p32 = new Point3(3, 3);
		   Point3 p33 = new Point3(3, 5);
		   hs3.add(p31);
		   hs3.add(p32);
		   hs3.add(p33);
		   System.out.println(hs3.size());

	}

}
