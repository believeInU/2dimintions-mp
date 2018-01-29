
public class Line {
	private Point A;
	private Point B;
	
	private double m;
	private double n;
	
	public Line(Point a, Point b) {
		A = a;
		B = b;
		
		calcFunction(a,b);
	}

	public void calcFunction(Point a, Point b) {
		double[] A = a.get();
		double[] B = b.get();
		
		m = (B[1] - A[1]) / (B[0] - A[0]);
		n = A[1] - m * A[0];
	}
	
	public double[] getLine() {
		double[] f = {m,n};
		return f;
	}
	
	public void printLine() {
		System.out.println("f(x) = " + m + " * x + " + n);
	}
	
	public double[] getPointA() {
		return A.get();
	}
	
	public double[] getPointB() {
		return B.get();
	}
	
	public double distanceTraveled(Point p) {
		double dx = p.get()[0] - A.get()[0];
		double dy = p.get()[1] - A.get()[1];
		return Math.sqrt(dx * dx + dy * dy);
	}
}
