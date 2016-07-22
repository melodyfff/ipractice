package hash;

/**
 * 重写equals但是没重写hashCode
 * @author vov
 *
 */
public class Point3 {
	 private int x;
	 
	private int y;

	 public Point3(int x, int y)
	  {
	   super();
	   this.x = x;
	   this.y = y;
	  }

	 /* 重写equals
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		  public boolean equals(Object obj)
		 {
		   if (this == obj) return true;
		   if (obj == null) return false;
		   if (getClass() != obj.getClass()) return false;
		   Point3 other = (Point3) obj;
		   if (x != other.x) return false;
		   if (y != other.y) return false;
		   return true;
		  }
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
