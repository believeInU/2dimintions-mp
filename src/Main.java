
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point A = new Point(0, 0);
		Point B = new Point(6, 8);
		Point C = new Point(14, 8);
		Point D = new Point(16, 14);
//		Point E = new Point(8, 4);
		
		Point[] p = {A,B,C,D};
		surfceMP train = new surfceMP(p,1,0.2,0.05,0.2,0);
		
		
		Point pos = new Point(0, 0);
		
		System.out.print("z = [");
		for (double j = -3; j <= 19; j += 0.5) {
			for (double i = -3; i <= 19; i += 0.5) {
				pos.setPoint(i, j);
				double[] num = train.getV(pos);
				System.out.print(Math.abs(num[3]) + ",");
			} System.out.print(";");
		}System.out.println("];");
		
//		System.out.print("z = [");
//		for (double j = -3; j <= 19; j += 0.5) {
//			for (double i = -3; i <= 19; i += 0.5) {
//				pos.setPoint(i, j);
//				double[] num = train.getV(pos);
//				System.out.print(Math.abs(num[0]) + ",");
//			} System.out.print(";");
//		}System.out.println("];");
//		
//		System.out.print("u = [");
//		for (double j = -3; j <= 19; j += 0.5) {
//			for (double i = -3; i <= 19; i += 0.5) {
//				pos.setPoint(i, j);
//				double[] num = train.getV(pos);
//				System.out.print(Math.abs(num[0]) * Math.cos(num[1]) + ",");
//			} System.out.print(";");
//		}System.out.print("];");
//		
//		System.out.print("v = [");
//		for (double j = -3; j <= 19; j += 0.5) {
//			for (double i = -3; i <= 19; i += 0.5) {
//				pos.setPoint(i, j);
//				double[] num = train.getV(pos);
//				System.out.print(Math.abs(num[0]) * Math.sin(num[1]) + ",");
//			} System.out.print(";");
//		}System.out.println("];");
//		
//		System.out.print("g = [");
//		for (double j = -3; j <= 19; j += 0.5) {
//			for (double i = -3; i <= 19; i += 0.5) {
//				pos.setPoint(i, j);
//				double[] num = train.get(pos);
//				System.out.print(Math.abs(num[0]) * Math.cos(num[1]) + ",");
//			} System.out.print(";");
//		}System.out.print("];");
//		
//		System.out.print("k = [");
//		for (double j = -3; j <= 19; j += 0.5) {
//			for (double i = -3; i <= 19; i += 0.5) {
//				pos.setPoint(i, j);
//				double[] num = train.get(pos);
//				System.out.print(Math.abs(num[0]) * Math.sin(num[1]) + ",");
//			} System.out.print(";");
//		}System.out.println("];");
		

	}

}
