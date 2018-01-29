
public class Path {
	private Point[] points;
	private Line[] functions;
	private double[] lengths;
	
	public Path(Point[] p){
		this.points = p;
		functions = new Line[points.length - 1];
		lengths = new double[points.length - 1];
		setFunctions();
	}

	public void setFunctions() {
		for (int i = 0; i < points.length - 1; i++) {
			functions[i] = new Line(points[i], points[i+1]);
			lengths[i] = functions[i].distanceTraveled(points[i+1]);
		}
	}
	
	public double getError(Line function, Point p) {
		double A = function.getLine()[0];
		double B = -1;
		double C = function.getLine()[1];
		
		return (A * p.get()[0] + B * p.get()[1] + C) / Math.sqrt(A * A + B * B);
	}
	
	public double[] getSmallestError(Point p) {
		double minD = Double.POSITIVE_INFINITY;
		double d;
		double ID=0;
		for (int i = 0; i < functions.length; i++) {
			d = getError(functions[i],p);
			double x = functions[i].getLine()[0] == 0 ? p.get()[0] : (p.get()[1] - functions[i].getLine()[1] + p.get()[0] / functions[i].getLine()[0]) / (functions[i].getLine()[0] + 1 / functions[i].getLine()[0]);
			
			if (functions[i].getPointA()[0] <= x && functions[i].getPointB()[0] >= x) {
				if (Math.abs(minD) >= Math.abs(d)) {
					minD = d;
					ID = i;
				}
			}
		}
			
		double[] distance = {ID, minD};
		return distance;
	}
	
	public double getLength(int ID,Point p) {
		double total = 0;
		for (int i = 0; i < ID; i++)
			total += lengths[i];
		double x = functions[ID].getLine()[0] == 0 ? p.get()[0] : (p.get()[1] - functions[ID].getLine()[1] + p.get()[0] / functions[ID].getLine()[0]) / (functions[ID].getLine()[0] + 1 / functions[ID].getLine()[0]);
		double y = functions[ID].getLine()[0] * x + functions[ID].getLine()[1];
		Point current = new Point(x,y);
		total += functions[ID].distanceTraveled(current);
		return total;
	}
	
	public double[] get(Point p) {	
		double[] error =  getSmallestError(p);
		double[] pos = {getLength( (int) error[0],p),error[1]};
		return pos;
	}
	
	public void print() {
		for (int i = 0; i < points.length; i++)
			points[i].printPoint();
		for (int i = 0; i < functions.length; i++) {
			functions[i].printLine();
			System.out.println("length: " + lengths[i]);
		}
	}
}
