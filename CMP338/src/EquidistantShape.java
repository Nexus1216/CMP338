
public abstract class EquidistantShape {
	protected double radius;
	private static final double DEFAULT_RADIUS = 1.0;
	
	public EquidistantShape(){
		this.radius = DEFAULT_RADIUS;
	}
	
	public EquidistantShape(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public abstract double getDiameter();
	public abstract double getCircumfrence();
	public abstract double getArea();

}
