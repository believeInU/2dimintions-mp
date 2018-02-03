
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point A = new Point(-0.36, 0);
		Point B = new Point(-1.36, 0);


//		Point E = new Point(8, 4);
		
		Point[] p = {A,B};
		surfceMP train = new surfceMP(p,1,1,1,0.2,0);
		
		
		Point pos = new Point(0, 0);
//		double[] v = train.getMotorsVelocity(pos, 0);
//		System.out.println("leftVelocity: " + v[0] + ", rightVelocity: " + v[1]) ;
		
//		System.out.print("z = [");
//		for (double j = -5; j <= 5.2; j += 0.2) {
//			for (double i = -5; i <= 5.2; i += 0.2) {
//				pos.setPoint(i, j);
//				double[] num = train.getV(pos);
//				System.out.print(Math.abs(num[4]) + ",");
//			} System.out.print(";");
//		}System.out.println("];");
		
		
		System.out.print("u = [");
		for (double j = -5; j <= 5.2; j += 0.2) {
			for (double i = -5; i <= 5.2; i += 0.2) {
				pos.setPoint(i, j);
				double[] num = train.getV(pos);
				System.out.print(Math.abs(num[0]) * Math.cos(num[1]) + ",");
			} System.out.print(";");
		}System.out.print("];");
		
		System.out.print("v = [");
		for (double j = -5; j <= 5.2; j += 0.2) {
			for (double i = -5; i <= 5.2; i += 0.2) {
				pos.setPoint(i, j);
				double[] num = train.getV(pos);
				System.out.print(Math.abs(num[0]) * Math.sin(num[1]) + ",");
			} System.out.print(";");
		}System.out.println("];");
	}

}
