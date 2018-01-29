
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point A = new Point(0, 0);
		Point B = new Point(6, 8);
		Point C = new Point(14, 8);
		Point D = new Point(14.000001, 0);
		
		Point[] p = {A,B,C,D};
		Path train = new Path(p);
		train.print();
		
		Point pos = new Point(15, -4);
		double[] num = train.get(pos);
		System.out.println("length: " + num[0] + ", error: " + num[1]);
	}

}
