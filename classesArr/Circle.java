package classesArr;

public class Circle {

	private Point center,onCircle;
	
	public Circle(Point center, Point onCircle) {
		this.center = center;
		this.onCircle = onCircle;
	}
	
	public Circle(Circle other) {
		this.center = other.center;
		this.onCircle = other.onCircle;
	}
	
	public Point getcenter() {
		return this.center;
	}
	
	public Point getoncitcle() {
		return this.onCircle;
	}
	
	public void setcenter(Point center) {
		this.center = center;
	}
	
	public void setoncircle(Point onCircle) {
		this.onCircle = onCircle;
	}
	
	public String toString() {
		return "center: " + this.center + " point on circle: " + this.onCircle;
	}
	
	public double getperimeter() {
		return 2 * Math.PI * (center.distance(onCircle));
	}
	
	public double getarea() {
		return Math.pow(Math.PI, 2) * (center.distance(onCircle));
	}
	
	public boolean isEqual(Circle other) {
		return (this.center.distance(this.onCircle)) == (other.center.distance(onCircle));
	}
	
	public Circle biggerArea(Circle other) {
		if (this.getarea() > other.getarea()) {
			return new Circle(this.center,this.onCircle);
		}
		return new Circle (other.center,other.onCircle);
	}
	
}
