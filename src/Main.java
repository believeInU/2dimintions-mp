
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point A = new Point(0, 0);
		Point B = new Point(6, 8);
		Point C = new Point(14, 8);
		Point D = new Point(12, 0);
		
		Point[] p = {A,B,C,D};
		Path train = new Path(p);
		train.print();
		
		System.out.println();
		double j = 3;
		Point pos = new Point(0, 0);
		for (double i = -3; i <= 17; i += 0.5) {
			pos.setPoint(i, j);
			double[] num = train.get(pos);
			System.out.println(i + "\t" + num[0] + "\t" + num[1]);
		}
	}

}
