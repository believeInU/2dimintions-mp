
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point A = new Point(0, 0);
		Point B = new Point(6, 8);
		Point C = new Point(14, 8);
		Point D = new Point(14.0001, 2);
		
		Point[] p = {A,B,C,D};
		Path train = new Path(p);
		train.print();
		
		System.out.println();

		System.out.print("z = [");
		Point pos = new Point(0, 0);
		for (double j = -3; j <= 17; j += 0.2) {
			for (double i = -3; i <= 17; i += 0.2) {
				pos.setPoint(i, j);
				double[] num = train.get(pos);
				System.out.print(num[1] + ",");
			} System.out.print(";");
		}System.out.print("];");
	}

}
