
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void setPoint(double x, double y) {
		this.x=x;
		this.y=y;
	}

	public double disPoint(Point p) {
		double dx = p.get()[0] - x;
		double dy = p.get()[1] - y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	public double[] get() {
		double[] point = {x,y};
		return point;
	}
	
	public void printPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
