
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double[] get() {
		double[] point = {x,y};
		return point;
	}
	
	public void printPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
