
public class Sphere extends EquidistantShape {
	
	
	public Sphere(){
		super();
	}
	
	public Sphere(double radius){
		super(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object other){
		boolean answer = false;
		
		if(other instanceof Sphere){
			answer = (this.radius == ((Sphere)other).getRadius());
		}
		
		return answer;
	}
	
	
	public double getDiameter(){
		return radius*2;
	}
	
	public double getCircumfrence(){
		return Math.PI*getDiameter();
	}
	public double getArea(){
		return 4.0*Math.PI*this.radius*this.radius;
	}
	public double getVolume(){
		return (4.0/3.0)*Math.PI*(this.radius*this.radius*this.radius);
	}
	public void Print(){
		System.out.println("      Radius: " + radius);
		System.out.println("    Diameter: " + getDiameter());
		System.out.println("Circumfrence: " + getCircumfrence());
		System.out.println("        Area: " + getArea());
		System.out.println("      Volume: " + getVolume());
	}

}
