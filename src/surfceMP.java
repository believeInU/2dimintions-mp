
public class surfceMP {
	
	private Path track;
	private double d;
	private double a;
	private double maxVelocity;
	private double topVelocity;
	private double totLength;
	private double startSpeed;
	private double endSpeed;

	public surfceMP(Point[] p,double maxVelocity, double a, double d, double startSpeed, double endSpeed) {
		track = new Path(p);
		this.d = d;
		this.a = a;
		this.maxVelocity = maxVelocity;
		this.topVelocity = maxVelocity;
		this.totLength = track.getLength(p.length-2, p[p.length-1]);
		this.startSpeed = startSpeed;
		this.endSpeed = endSpeed;
	}
	
	public double[] getV(Point p) {
		double[] tmp = track.get(p);
		double[] length = {tmp[0],tmp[1]};
		double[] error = {tmp[2],tmp[3]};
		
		double Verror = velocityByDistance(0,d,0,error[0]);
		Verror = Verror > topVelocity ? topVelocity : Verror;
		
		double Vforward = 0;
		
		if (distanceTravled(startSpeed,a,topVelocity) + distanceTravled(topVelocity,d,endSpeed) > totLength)
			topVelocity = Math.sqrt((2 * a * d * totLength + d * startSpeed * startSpeed + a * endSpeed * endSpeed) / (a + d));
		
		if (length[0] == -1);
		else if (length[0] < distanceTravled(startSpeed,a,topVelocity))
			Vforward = velocityByDistance(startSpeed,a,0,length[0]);
		else if (length[0] < totLength - distanceTravled(topVelocity,d,endSpeed))
			Vforward = topVelocity;
		else if (length[0] <= totLength)
			Vforward = velocityByDistance(topVelocity,d,totLength - distanceTravled(topVelocity,d,endSpeed),length[0]);
		
		double maxVforward = Math.sqrt(maxVelocity * maxVelocity - Verror * Verror);
		Vforward = Vforward > maxVforward ? maxVforward : Vforward;
//		double angle2Robot = angle2start - angle;
//		double vtotal = sumVelocity(x,y);
//		double velocityLeft = vtotal * Math.cos(angle2Robot) - vtotal * Math.sin(angle2Robot) * r / h;
//		double velocityRight = vtotal * Math.cos(angle2Robot) + vtotal * Math.sin(angle2Robot) * r / h;
//		double[] velocity = {velocityLeft, velocityRight};
		
		double[] velocity = {};
		
		return velocity;
	}
	
	public double velocityByDistance(double startSpeed, double a, double startPos, double x) {
		return Math.sqrt(startSpeed * startSpeed + 2 * a * (x - startPos));
	}
	
	public double distanceTravled(double startSpeed, double a, double endSpeed) {
		return Math.abs((endSpeed * endSpeed - startSpeed * startSpeed) / 2 * a);
	}
}
